package com.finbourne.lusid.extensions;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

public class ApiFactoryBuilder {

    private static final int DEFAULT_TIMEOUT_SECONDS = 10;

    /**
    * Build a {@link ApiFactory} defining configuration using environment variables. For details on the environment arguments see https://support.lusid.com/getting-started-with-apis-sdks.
    *
    * @return
    */
    public static ApiFactory build() throws ApiConfigurationException, FinbourneTokenException {
        if (!areRequiredEnvironmentVariablesSet()) {
            throw new ApiConfigurationException("Environment variables to configure API client have not been set. See " +
                    " see https://support.lusid.com/getting-started-with-apis-sdks for details.");
        }
        return createApiFactory(null);
    }

    public static ApiFactory build(String configurationFile) throws ApiConfigurationException, FinbourneTokenException {
        return createApiFactory(configurationFile);
    }

    private static ApiFactory createApiFactory(String configurationFile) throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(configurationFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);
        return new ApiFactory(apiClient);
    }

    private static boolean areRequiredEnvironmentVariablesSet(){
        boolean urlIsSet = System.getenv("FBN_LUSID_URL") != null || 
            System.getenv("FBN_LUSID_API_URL") != null;
        return ((System.getenv("FBN_TOKEN_URL") != null &&
                System.getenv("FBN_USERNAME") != null &&
                System.getenv("FBN_PASSWORD") != null &&
                System.getenv("FBN_CLIENT_ID") != null &&
                System.getenv("FBN_CLIENT_SECRET") != null &&
                urlIsSet) ||
                (urlIsSet && System.getenv("FBN_ACCESS_TOKEN") != null));
    }
}
