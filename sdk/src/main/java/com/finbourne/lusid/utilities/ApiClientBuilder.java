package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.utilities.auth.HttpLusidTokenProvider;
import com.finbourne.lusid.utilities.auth.LusidToken;
import com.finbourne.lusid.utilities.auth.LusidTokenException;
import com.finbourne.lusid.utilities.auth.RefreshingTokenProvider;
import okhttp3.OkHttpClient;

/**
 * Utility class to build an ApiClient from a set of configuration
 */
public class ApiClientBuilder {

    private static final int DEFAULT_TIMEOUT_SECONDS = 10;

    /**
     * Builds an ApiClient implementation configured against a secrets file. Typically used
     * for communicating with LUSID via the APIs (e.g. {@link com.finbourne.lusid.api.TransactionPortfoliosApi}, {@link com.finbourne.lusid.api.QuotesApi}.
     *
     * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
     * and automatically handles token refreshing on expiry.
     *
     * @param apiConfiguration configuration to connect to LUSID API
     * @return
     *
     * @throws LusidTokenException on failing to authenticate and retrieve an initial {@link LusidToken}
     */
    public ApiClient build(ApiConfiguration apiConfiguration) throws LusidTokenException {

        return this.build(apiConfiguration, DEFAULT_TIMEOUT_SECONDS, DEFAULT_TIMEOUT_SECONDS, DEFAULT_TIMEOUT_SECONDS);
    }

    /**
     * Builds an ApiClient implementation configured against a secrets file. Typically used
     * for communicating with LUSID via the APIs
     *
     * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
     * and automatically handles token refreshing on expiry.
     *
     * @param apiConfiguration configuration to connect to {{application_camel}} API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @return
     *
     * @throws LusidTokenException on failing to authenticate and retrieve an initial {@link LusidTokenException}
     */
    public ApiClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout) throws LusidTokenException {
        return this.build(apiConfiguration, readTimeout, writeTimeout, DEFAULT_TIMEOUT_SECONDS);
    }

    /**
     * Builds an ApiClient implementation configured against a secrets file. Typically used
     * for communicating with LUSID via the APIs
     *
     * ApiClient implementation enables use of REFRESH tokens (see https://support.finbourne.com/using-a-refresh-token)
     * and automatically handles token refreshing on expiry.
     *
     * @param apiConfiguration configuration to connect to {{application_camel}} API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @param connectTimeout connection timeout in seconds
     * @return
     *
     * @throws LusidTokenException on failing to authenticate and retrieve an initial {@link LusidTokenException}
     */
    public ApiClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout, int connectTimeout) throws LusidTokenException {

        // http client to use for api and auth calls
        OkHttpClient httpClient = createHttpClient(apiConfiguration, readTimeout, writeTimeout, connectTimeout);

        if (apiConfiguration.getPersonalAccessToken() != null && apiConfiguration.getApiUrl() != null) {

            //  use Personal Access Token
            LusidToken lusidToken = new LusidToken(apiConfiguration.getPersonalAccessToken(), null, null);
            ApiClient defaultApiClient = createDefaultApiClient(apiConfiguration, httpClient, lusidToken);

            return defaultApiClient;

        }
        else {

            // token provider to keep client authenticated with automated token refreshing
            RefreshingTokenProvider refreshingTokenProvider = new RefreshingTokenProvider(new HttpLusidTokenProvider(apiConfiguration, httpClient));
            LusidToken lusidToken = refreshingTokenProvider.get();

            // setup api client that managed submissions with the latest token
            ApiClient defaultApiClient = createDefaultApiClient(apiConfiguration, httpClient, lusidToken);
            return new RefreshingTokenApiClient(defaultApiClient, refreshingTokenProvider);
        }
    }

    ApiClient createDefaultApiClient(ApiConfiguration apiConfiguration, OkHttpClient httpClient, LusidToken lusidToken) throws LusidTokenException {
        ApiClient apiClient = createApiClient();

        apiClient.setHttpClient(httpClient);

        if (lusidToken.getAccessToken() == null) {
            throw new LusidTokenException("Cannot construct an API client with a null authorisation header. Ensure " +
                    "lusid token generated is valid");
        } else {
            apiClient.setAccessToken(lusidToken.getAccessToken());
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
    ApiClient createApiClient(){
        return new ApiClient();
    }
}
