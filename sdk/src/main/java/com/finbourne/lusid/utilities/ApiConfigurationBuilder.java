package com.finbourne.lusid.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ApiConfigurationBuilder {

    public ApiConfiguration build(String apiSecretsFilename) throws IOException {

        //  firstly try and get the values from environment variables
        String tokenUrl = System.getenv("FBN_TOKEN_URL");
        String username = System.getenv("FBN_USERNAME");
        String password = System.getenv("FBN_PASSWORD");
        String clientId = System.getenv("FBN_CLIENT_ID");
        String clientSecret = System.getenv("FBN_CLIENT_SECRET");
        String apiUrl = System.getenv("FBN_LUSID_API_URL");

        //  optional variables
        String applicationName = System.getenv("FBN_APP_NAME");
        String proxyAddress = System.getenv("FBN_PROXY_ADDRESS");

        String portStr = System.getenv("FBN_PROXY_PORT");
        Integer proxyPort = portStr == null ? -1 : Integer.parseInt(portStr);
        String proxyUsername = System.getenv("FBN_PROXY_USERNAME");
        String proxyPassword = System.getenv("FBN_PROXY_PASSWORD");

        if (tokenUrl == null || username == null || password == null || clientId == null || clientSecret == null || apiUrl == null) {

            File configJson = new ConfigurationLoader().loadConfiguration(apiSecretsFilename);

            //  load configuration from secrets.json if any of the environment variables are missing
            ObjectMapper configMapper = new ObjectMapper();
            Map apiConfigValues = configMapper.readValue(configJson, Map.class);
            Map apiConfig = (Map)apiConfigValues.get("api");

            tokenUrl = (String)apiConfig.get("tokenUrl");
            username = (String)apiConfig.get("username");
            password = (String)apiConfig.get("password");
            clientId = (String)apiConfig.get("clientId");
            clientSecret = (String)apiConfig.get("clientSecret");
            apiUrl = (String)apiConfig.get("apiUrl");
            applicationName = apiConfig.containsKey("applicationName") ? (String)apiConfig.get("applicationName") : null;

            if (apiConfigValues.containsKey("proxy")) {
                Map proxyConfig = (Map)apiConfigValues.get("proxy");

                proxyAddress = (String)proxyConfig.get("proxyAddress");
                proxyPort = (Integer)proxyConfig.get("proxyPort");
                proxyUsername = (String)proxyConfig.get("username");
                proxyPassword = (String)proxyConfig.get("password");
            }

        }

        return new ApiConfiguration(tokenUrl, username, password, clientId, clientSecret, apiUrl, applicationName, proxyAddress, proxyPort, proxyUsername, proxyPassword);
    }
}
