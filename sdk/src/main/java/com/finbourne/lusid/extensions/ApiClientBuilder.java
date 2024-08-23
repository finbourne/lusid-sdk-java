package com.finbourne.lusid.extensions;

import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Credentials;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.extensions.auth.HttpFinbourneTokenProvider;
import com.finbourne.lusid.extensions.auth.RefreshingTokenProvider;
import com.finbourne.lusid.extensions.auth.FinbourneToken;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

/**
* Utility class to build an ApiClient from a set of configuration
*/
public class ApiClientBuilder {

    /**
    * Builds an ApiClient implementation configured against a secrets file. Typically used
    * for communicating with lusid via the APIs
    *
    * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
    * and automatically handles token refreshing on expiry.
    *
    * @param apiConfiguration configuration to connect to lusid API
    * @return
    *
    * @throws FinbourneTokenException on failing to authenticate and retrieve an initial {@link FinbourneToken}
    */
    public ApiClient build(ApiConfiguration apiConfiguration) throws FinbourneTokenException {
        Builder httpBuilder = new Builder();
        httpBuilder.callTimeout(java.time.Duration.ofMillis(apiConfiguration.getTotalTimeoutMs()));
        httpBuilder.connectTimeout(java.time.Duration.ofMillis(apiConfiguration.getConnectTimeoutMs()));
        httpBuilder.readTimeout(java.time.Duration.ofMillis(apiConfiguration.getReadTimeoutMs()));
        httpBuilder.writeTimeout(java.time.Duration.ofMillis(apiConfiguration.getWriteTimeoutMs()));
        return this.build(apiConfiguration, httpBuilder);
    }

    /**
    * @deprecated Use {@link #build(ApiConfiguration)} instead, setting {@link ConfigurationOptions#RateLimitRetries}. 
    * Note that {@link ConfigurationOptions#RateLimitRetries} is the max number of retries whereas {@link #retryMaxAttempts} is the max total number of attempts.
    * {@link ConfigurationOptions#RateLimitRetries} should therefore be set to one less than the {@link #retryMaxAttempts} to keep the same behaviour.
    *
    * Builds an ApiClient implementation configured against a secrets file.
    * Typically used
    * for communicating with lusid via the APIs
    *
    * ApiClient implementation enables use of REFRESH tokens (see
    * https://support.finbourne.com/using-a-refresh-token)
    * and automatically handles token refreshing on expiry.
    *
    * @param apiConfiguration configuration to connect to lusid API
    * @param retryMaxAttempts number of times to try to make request when rate limited
    * @return
    *
    * @throws FinbourneTokenException on failing to authenticate and retrieve an
    *                                 initial {@link FinbourneToken}
    */
    @Deprecated
    public ApiClient build(ApiConfiguration apiConfiguration, int retryMaxAttempts) throws FinbourneTokenException {
        apiConfiguration.setRateLimitRetries(retryMaxAttempts - 1);
        return build(apiConfiguration);
    }

    /**
    * @deprecated Use {@link #build(ApiConfiguration, Builder)} instead, setting {@link ConfigurationOptions#RateLimitRetries}.
    * Note that {@link ConfigurationOptions#RateLimitRetries} is the max number of retries whereas {@link #retryMaxAttempts} is the max total number of attempts.
    * {@link ConfigurationOptions#RateLimitRetries} should therefore be set to one less than the {@link #retryMaxAttempts} to keep the same behaviour.
    * 
    * Builds an ApiClient implementation configured against a secrets file. Typically used
    * for communicating with lusid via the APIs
    *
    * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
    * and automatically handles token refreshing on expiry.
    *
    * @param apiConfiguration configuration to connect to lusid API
    * @param retryMaxAttempts number of times to try to make request when rate limited
    * @param httpClientBuilder {@link Builder} with some configuration already
    *                          set
    * @return
    *
    * @throws FinbourneTokenException on failing to authenticate and retrieve an initial {@link FinbourneToken}
    */
    public ApiClient build(ApiConfiguration apiConfiguration, int retryMaxAttempts, Builder httpClientBuilder) throws FinbourneTokenException {
        apiConfiguration.setRateLimitRetries(retryMaxAttempts - 1);
        return build(apiConfiguration, httpClientBuilder);
    }

    /**
    * Builds an ApiClient implementation configured against a secrets file. Typically used
    * for communicating with lusid via the APIs
    *
    * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
    * and automatically handles token refreshing on expiry.
    *
    * @param apiConfiguration configuration to connect to lusid API
    * @param httpClientBuilder {@link Builder} with some configuration already
    *                          set
    * @return
    *
    * @throws FinbourneTokenException on failing to authenticate and retrieve an initial {@link FinbourneToken}
    */
    public ApiClient build(ApiConfiguration apiConfiguration, Builder httpClientBuilder) throws FinbourneTokenException {
        // http client to use for api and auth calls
        httpClientBuilder = httpClientBuilder.addInterceptor(new RateLimitRetryInterceptor(apiConfiguration.getRateLimitRetries()));

        // use a proxy if given
        if (apiConfiguration.getProxyAddress() != null) {
            InetSocketAddress proxy = InetSocketAddress.createUnresolved(apiConfiguration.getProxyAddress(),
                    apiConfiguration.getProxyPort());

            httpClientBuilder = httpClientBuilder.proxy(new Proxy(Proxy.Type.HTTP, proxy))
                    .proxyAuthenticator((route, response) -> {
                        String credential = Credentials.basic(apiConfiguration.getProxyUsername(),
                                apiConfiguration.getProxyPassword());
                        return response.request().newBuilder()
                                .header("Proxy-Authorization", credential)
                                .build();
                    });
        }
        ApiClient defaultApiClient;
        FinbourneToken finbourneToken;
        if (apiConfiguration.getPersonalAccessToken() != null && apiConfiguration.getApiUrl() != null) {
            // use Personal Access Token
            finbourneToken = new FinbourneToken(apiConfiguration.getPersonalAccessToken(), null, null);

            defaultApiClient = new ApiClient(httpClientBuilder.build());
            defaultApiClient.setAccessToken(finbourneToken.getAccessToken());
        } else {
            // token provider to keep client authenticated with automated token refreshing
            RefreshingTokenProvider refreshingTokenProvider = new RefreshingTokenProvider(
                    new HttpFinbourneTokenProvider(apiConfiguration, httpClientBuilder.build()));
            finbourneToken = refreshingTokenProvider.get();
            // setup api client that managed submissions with the latest token

            httpClientBuilder = httpClientBuilder
                    .addInterceptor(new AuthenticationInterceptor(refreshingTokenProvider));

            defaultApiClient = new ApiClient(httpClientBuilder.build());

        }
        if (finbourneToken.getAccessToken() == null) {
            throw new FinbourneTokenException(
                    "Cannot construct an API client with a null authorisation header. Ensure " +
                            "finbourne token generated is valid");
        }
        if (apiConfiguration.getApplicationName() != null) {
            defaultApiClient.addDefaultHeader("X-LUSID-Application", apiConfiguration.getApplicationName());
        }
        defaultApiClient.setBasePath(apiConfiguration.getApiUrl());
        return defaultApiClient;
    }
}
