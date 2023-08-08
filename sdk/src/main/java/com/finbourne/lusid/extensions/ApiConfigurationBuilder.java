package com.finbourne.lusid.extensions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ApiConfigurationBuilder {

    /**
     * Build an {@link ApiConfiguration}. Attempts to build a valid configuration
     * from system environment variables.
     *
     * @return a valid {@link ApiConfiguration}
     * @throws ApiConfigurationException
     */
    public ApiConfiguration build() throws ApiConfigurationException {
        return this.build(null);
    }

    /**
    * Build an {@link ApiConfiguration}. Attempts to build a valid configuration
    * from system environment variables. Otherwise will attempt to load the configuration
    * from the provided secrets file.
    *
    * @param apiSecretsFilename - file containing configuration parameters
    * @return a valid {@link ApiConfiguration}
    * @throws ApiConfigurationException
    */
    public ApiConfiguration build(String apiSecretsFilename) throws ApiConfigurationException {

        ApiConfiguration apiConfiguration = getApiConfigurationFromEnvironmentVariables();

        if (isValidApiConfiguration(apiConfiguration)) {
            return apiConfiguration;
        }

        apiConfiguration = getApiConfigurationFromFile(apiSecretsFilename);

        if (!isValidApiConfiguration(apiConfiguration)) {
            throw new ApiConfigurationException("ApiConfiguration parameters are not valid. Ensure the configuration file " + apiSecretsFilename +
                    " is correctly setup.");
        }

        return apiConfiguration;
    }

    ApiConfiguration getApiConfigurationFromEnvironmentVariables(){
        //  firstly try and get the values from environment variables
        String tokenUrl = System.getenv("FBN_TOKEN_URL");
        String username = System.getenv("FBN_USERNAME");
        String password = System.getenv("FBN_PASSWORD");
        String clientId = System.getenv("FBN_CLIENT_ID");
        String clientSecret = System.getenv("FBN_CLIENT_SECRET");
        String apiUrl = System.getenv("FBN__API_URL");
        String personalAccessToken = System.getenv("FBN_ACCESS_TOKEN");

        //  optional variables
        String applicationName = System.getenv("FBN_APP_NAME");
        String proxyAddress = System.getenv("FBN_PROXY_ADDRESS");

        String portStr = System.getenv("FBN_PROXY_PORT");
        Integer proxyPort = portStr == null ? -1 : Integer.parseInt(portStr);
        String proxyUsername = System.getenv("FBN_PROXY_USERNAME");
        String proxyPassword = System.getenv("FBN_PROXY_PASSWORD");

        return new ApiConfiguration(tokenUrl, username, password, clientId, clientSecret, apiUrl, applicationName,
                personalAccessToken, proxyAddress, proxyPort, proxyUsername, proxyPassword);
    }

    ApiConfiguration getApiConfigurationFromFile(String apiSecretsFilename) throws ApiConfigurationException {
        try {
            File configJson = getFileConfigurationLoader().loadConfiguration(apiSecretsFilename);

            //  load configuration from secrets.json if any of the environment variables are missing
            ObjectMapper configMapper = new ObjectMapper();
            Map apiConfigValues = configMapper.readValue(configJson, Map.class);
            Map apiConfig = (Map) apiConfigValues.get("api");

            String tokenUrl = (String) apiConfig.get("tokenUrl");
            String username = (String) apiConfig.get("username");
            String password = (String) apiConfig.get("password");
            String clientId = (String) apiConfig.get("clientId");
            String clientSecret = (String) apiConfig.get("clientSecret");
            String apiUrl = (String) apiConfig.get("ApiUrl");
            String applicationName = apiConfig.containsKey("applicationName") ? (String) apiConfig.get("applicationName") : null;
            String personalAccessToken = (String)apiConfig.get("accessToken");

            String proxyAddress = null;
            Integer proxyPort = null;
            String proxyUsername = null;
            String proxyPassword = null;

            if (apiConfigValues.containsKey("proxy")) {
            Map proxyConfig = (Map) apiConfigValues.get("proxy");

            proxyAddress = (String) proxyConfig.get("proxyAddress");
            proxyPort = (Integer) proxyConfig.get("proxyPort");
            proxyUsername = (String) proxyConfig.get("username");
            proxyPassword = (String) proxyConfig.get("password");
        }

        return new ApiConfiguration(tokenUrl, username, password, clientId, clientSecret, apiUrl, applicationName,
                personalAccessToken, proxyAddress, proxyPort, proxyUsername, proxyPassword);
        } catch (IOException e){
            throw new ApiConfigurationException("Error when loading details from configuration file. See details : ", e);
        }
    }

    public boolean isValidApiConfiguration(ApiConfiguration apiConfiguration) {
        return (!(apiConfiguration.getTokenUrl() == null ||
                apiConfiguration.getUsername() == null ||
                apiConfiguration.getPassword() == null ||
                apiConfiguration.getClientId() == null ||
                apiConfiguration.getClientSecret() == null ||
                apiConfiguration.getApiUrl() == null) ||
                !(apiConfiguration.getApiUrl() == null ||
                apiConfiguration.getPersonalAccessToken() == null));
    }

    // getter used for mocking in tests
    FileConfigurationLoader getFileConfigurationLoader(){
        return new FileConfigurationLoader();
    }


}
