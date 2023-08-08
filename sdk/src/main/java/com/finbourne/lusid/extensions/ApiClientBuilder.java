package com.finbourne.lusid.extensions;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.extensions.auth.HttpFinbourneTokenProvider;
import com.finbourne.lusid.extensions.auth.RefreshingTokenProvider;
import com.finbourne.lusid.extensions.auth.FinbourneToken;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;
import okhttp3.OkHttpClient;

/**
* Utility class to build an ApiClient from a set of configuration
*/
public class ApiClientBuilder {

    private static final int DEFAULT_TIMEOUT_SECONDS = 10;

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

        return this.build(apiConfiguration, 10, 10);
    }

    /**
     * Builds an ApiClient implementation configured against a secrets file. Typically used
     * for communicating with luminesce via the APIs
     *
     * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
     * and automatically handles token refreshing on expiry.
     *
     * @param apiConfiguration configuration to connect to lusid API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @param connectTimeout connect timeout in seconds
     * @return
     *
     * @throws FinbourneTokenException on failing to authenticate and retrieve an initial {@link FinbourneToken}
     */
    public ApiClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout, int connectTimeout, int retryMaxAttempts) throws FinbourneTokenException {
        // http client to use for api and auth calls
        OkHttpClient httpClient = createHttpClient(apiConfiguration, readTimeout, writeTimeout, connectTimeout);

        if (apiConfiguration.getPersonalAccessToken() != null && apiConfiguration.getApiUrl() != null) {
            //  use Personal Access Token
            FinbourneToken finbourneToken = new FinbourneToken(apiConfiguration.getPersonalAccessToken(), null, null);
            ApiClient defaultApiClient = createDefaultApiClient(apiConfiguration, httpClient, finbourneToken, retryMaxAttempts);
            return defaultApiClient;
        }
        else {
            // token provider to keep client authenticated with automated token refreshing
            RefreshingTokenProvider refreshingTokenProvider = new RefreshingTokenProvider(new HttpFinbourneTokenProvider(apiConfiguration, httpClient));
            FinbourneToken finbourneToken = refreshingTokenProvider.get();

            // setup api client that managed submissions with the latest token
            ApiClient defaultApiClient = createDefaultApiClient(apiConfiguration, httpClient, finbourneToken, retryMaxAttempts);
            return new RefreshingTokenApiClient(defaultApiClient, refreshingTokenProvider);
        }
    }

    /**
     * Builds an ApiClient implementation configured against a secrets file. Typically used
     * for communicating with luminesce via the APIs
     *
     * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
     * and automatically handles token refreshing on expiry.
     *
     * @param apiConfiguration configuration to connect to lusid API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @return
     *
     * @throws FinbourneTokenException on failing to authenticate and retrieve an initial {@link FinbourneToken}
     */
    public ApiClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout) throws FinbourneTokenException {
        return this.build(apiConfiguration, readTimeout, writeTimeout, DEFAULT_TIMEOUT_SECONDS, 3);
    }

    ApiClient createDefaultApiClient(ApiConfiguration apiConfiguration, OkHttpClient httpClient, FinbourneToken finbourneToken) throws FinbourneTokenException {
        return this.createDefaultApiClient(apiConfiguration, httpClient, finbourneToken, 3);
    }

    ApiClient createDefaultApiClient(ApiConfiguration apiConfiguration, OkHttpClient httpClient, FinbourneToken finbourneToken, int retryMaxAttempts) throws FinbourneTokenException {
        ApiClient apiClient = createApiClient(retryMaxAttempts);

        apiClient.setHttpClient(httpClient);

        if (finbourneToken.getAccessToken() == null) {
            throw new FinbourneTokenException("Cannot construct an API client with a null authorisation header. Ensure " +
                    "finbourne token generated is valid");
        } else {
            apiClient.setAccessToken(finbourneToken.getAccessToken());
        }

        if (apiConfiguration.getApplicationName() != null) {
            apiClient.addDefaultHeader("X-LUSID-Application", apiConfiguration.getApplicationName());
        }
        apiClient.setBasePath(apiConfiguration.getApiUrl());

        return  apiClient;
    }

    private OkHttpClient createHttpClient(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout, int connectTimeout){
        return new HttpClientFactory().build(apiConfiguration, readTimeout, writeTimeout, connectTimeout);
    }

    // allows us to mock out api client for testing purposes
    ApiClient createApiClient() {
        return new RetryingApiClient(3);
    }

    ApiClient createApiClient(int maxAttempts) {
        return new RetryingApiClient(maxAttempts);
    }
}
