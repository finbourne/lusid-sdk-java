package com.finbourne.lusid.extensions;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import okhttp3.Interceptor;

public class ApiFactoryBuilder {

    /**
    * Build an {@link ApiFactory} defining configuration using environment variables. See the README.md for more information
    */
    public static ApiFactory build() throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build();
        return createApiFactory(apiConfiguration);
    }

    /**
    * Build an {@link ApiFactory} defining configuration using environment variables and overriding configuration options. See the README.md for more information
    */
    public static ApiFactory build(ConfigurationOptions configurationOptions) throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(configurationOptions);
        return createApiFactory(apiConfiguration);
    }

    /**
    * Build an {@link ApiFactory} defining configuration using a configuration file. Please note that if all required environment variables exist
    * then these will still take precedence. See the README.md for more information
    */
    public static ApiFactory build(String configurationFile) throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(configurationFile);
        return createApiFactory(apiConfiguration);
    }

    /**
    * Build an {@link ApiFactory} defining configuration using a configuration file and overriding configuration options. 
    * Please note that if all required environment variables exist then these will still take precedence over the configuration file 
    * (and will be overridden by the configuration options). See the README.md for more information
    */
    public static ApiFactory build(String configurationFile, ConfigurationOptions configurationOptions) throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(configurationFile, configurationOptions);
        return createApiFactory(apiConfiguration);
    }

    private static ApiFactory createApiFactory(ApiConfiguration apiConfiguration) throws ApiConfigurationException, FinbourneTokenException {
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);
        return new ApiFactory(apiClient);
    }
}
