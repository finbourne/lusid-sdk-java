package com.finbourne.lusid.extensions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;

public class ApiConfigurationBuilder {

    public class ConfigurationWithErrors {
        public ConfigurationWithErrors(ApiConfiguration configuration, ArrayList<String> errors) {
            this.errors = errors;
            if (this.errors.isEmpty()) {
                this.configuration = configuration;
            }
        }
        public ApiConfiguration configuration;
        public ArrayList<String> errors;
    }

    // The default timeout is 30 minutes
    public static final int DEFAULT_TOTAL_TIMEOUT_MS = 1800000;
    public static final int DEFAULT_CONNECT_TIMEOUT_MS = 0;
    public static final int DEFAULT_READ_TIMEOUT_MS = 0;
    public static final int DEFAULT_WRITE_TIMEOUT_MS = 0;
    public static final int DEFAULT_RATE_LIMIT_RETRIES = 2;

    /**
     * Build an {@link ApiConfiguration}. Attempts to build a valid configuration
     * from system environment variables.
     *
     * @return a valid {@link ApiConfiguration}
     * @throws ApiConfigurationException
     */
    public ApiConfiguration build() throws ApiConfigurationException {
        return build(new ConfigurationOptions());
    }

    /**
     * Build an {@link ApiConfiguration}. Attempts to build a valid configuration
     * from system environment variables. Additionally some configuration can be provided via the ConfigurationOptions.
     * If set, this configuration overrides any from the environment variables
     *
     * @return a valid {@link ApiConfiguration}
     * @throws ApiConfigurationException
     */
    public ApiConfiguration build(ConfigurationOptions configurationOptions) throws ApiConfigurationException {
        ConfigurationWithErrors apiConfigWithErrorsEnvVars = getApiConfigurationFromEnvironmentVariables(configurationOptions);

        if (apiConfigWithErrorsEnvVars.errors.isEmpty()) {
            return apiConfigWithErrorsEnvVars.configuration;
        }

        throw new ApiConfigurationException(
            "Configuration parameters are not valid. The following issues were detected with the environment variables set: " + 
            String.join("; ", apiConfigWithErrorsEnvVars.errors) + ". You may also use the String overload of this method to provide configuration via a configuration file.");
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

        return build(apiSecretsFilename, new ConfigurationOptions());
    }

    /**
    * Build an {@link ApiConfiguration}. Attempts to build a valid configuration
    * from system environment variables. Otherwise will attempt to load the configuration
    * from the provided secrets file. Additionally some configuration can be provided via the ConfigurationOptions.
    * If set, this configuration overrides any from the environment variables or secrets file.
    *
    * @param apiSecretsFilename - file containing configuration parameters
    * @return a valid {@link ApiConfiguration}
    * @throws ApiConfigurationException
    */
    public ApiConfiguration build(String apiSecretsFilename, ConfigurationOptions configurationOptions) throws ApiConfigurationException {

        ConfigurationWithErrors apiConfigWithErrorsEnvVars = getApiConfigurationFromEnvironmentVariables(configurationOptions);

        if (apiConfigWithErrorsEnvVars.errors.isEmpty()) {
            return apiConfigWithErrorsEnvVars.configuration;
        }

        ConfigurationWithErrors apiConfigWithErrorsFile = getApiConfigurationFromFile(apiSecretsFilename, configurationOptions);

        if (apiConfigWithErrorsFile.errors.isEmpty()) {
            return apiConfigWithErrorsFile.configuration;
        }

        throw new ApiConfigurationException(
            "Configuration parameters are not valid. Either all required environment variables must be set or else the configuration file '" +
            apiSecretsFilename + "' must contain all required configuration. The following issues were detected with the environment variables set: " + 
            String.join("; ", apiConfigWithErrorsEnvVars.errors) + ". The following issues were detected with the secrets file: " + String.join("; ", apiConfigWithErrorsFile.errors));
    }

    public ConfigurationWithErrors getApiConfigurationFromEnvironmentVariables(ConfigurationOptions configurationOptions){
        ArrayList<String> errors = new ArrayList<String>();
        
        // check all auth config exists
        ArrayList<String> authConfig1Errors = new ArrayList<String>();
        String tokenUrl = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_TOKEN_URL"}, authConfig1Errors);
        String username = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_USERNAME"}, authConfig1Errors);
        String password = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_PASSWORD"}, authConfig1Errors);
        String clientId = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_CLIENT_ID"}, authConfig1Errors);
        String clientSecret = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_CLIENT_SECRET"}, authConfig1Errors);

        ArrayList<String> authConfig2Errors = new ArrayList<String>();
        String personalAccessToken = getRequiredValueFromEnvironmentVariable(new String[]{"FBN_ACCESS_TOKEN"}, authConfig2Errors);

        if (!authConfig1Errors.isEmpty() && !authConfig2Errors.isEmpty()) {
            errors.addAll(authConfig1Errors);
        }

        // check api url config exists
        String[] apiUrlConfigNames = {
            "FBN_LUSID_URL",
            "FBN_LUSID_API_URL"
        };
        String apiUrl = getRequiredValueFromEnvironmentVariable(apiUrlConfigNames, errors);

        // optional config
        String applicationName = System.getenv("FBN_APP_NAME");
        int totalTimeoutMs = getPositiveIntFromEnvironmentVariable("FBN_TOTAL_TIMEOUT_MS", "TotalTimeoutMs", configurationOptions.getTotalTimeoutMs(), DEFAULT_TOTAL_TIMEOUT_MS, errors);
        int connectTimeoutMs = getPositiveIntFromEnvironmentVariable("FBN_CONNECT_TIMEOUT_MS", "ConnectTimeoutMs", configurationOptions.getConnectTimeoutMs(), DEFAULT_CONNECT_TIMEOUT_MS, errors);
        int readTimeoutMs = getPositiveIntFromEnvironmentVariable("FBN_READ_TIMEOUT_MS", "ReadTimeoutMs", configurationOptions.getReadTimeoutMs(), DEFAULT_READ_TIMEOUT_MS, errors);
        int writeTimeoutMs = getPositiveIntFromEnvironmentVariable("FBN_WRITE_TIMEOUT_MS", "WriteTimeoutMs", configurationOptions.getWriteTimeoutMs(), DEFAULT_WRITE_TIMEOUT_MS, errors);
        int rateLimitRetries = getPositiveIntFromEnvironmentVariable("FBN_RATE_LIMIT_RETRIES", "RateLimitRetries", configurationOptions.getRateLimitRetries(), DEFAULT_RATE_LIMIT_RETRIES, errors);
        
        // proxy configuration
        String proxyAddress = System.getenv("FBN_PROXY_ADDRESS");
        String portString = System.getenv("FBN_PROXY_PORT");
        int proxyPort = -1;
        if (portString != null) {
            try {
                proxyPort = Integer.parseInt(portString);
            } catch (NumberFormatException e) {
                errors.add("'FBN_PROXY_PORT' is not a valid integer");
            }
        }
        String proxyUsername = System.getenv("FBN_PROXY_USERNAME");
        String proxyPassword = System.getenv("FBN_PROXY_PASSWORD");
        
        // return the configuration if no errors
        if (errors.isEmpty()) {
            ApiConfiguration configuration = new ApiConfiguration(tokenUrl, username, password, clientId, clientSecret, apiUrl, applicationName,
                personalAccessToken, proxyAddress, proxyPort, proxyUsername, proxyPassword, totalTimeoutMs, connectTimeoutMs, readTimeoutMs, writeTimeoutMs, rateLimitRetries);
            return new ConfigurationWithErrors(configuration, errors);
        }

        // else return the errors
        return new ConfigurationWithErrors(null, errors);
    }

    public ConfigurationWithErrors getApiConfigurationFromFile(String apiSecretsFilename, ConfigurationOptions configurationOptions) throws ApiConfigurationException {
        try {
            File configJson = getFileConfigurationLoader().loadConfiguration(apiSecretsFilename);

            ObjectMapper configMapper = new ObjectMapper();
            Map<String, Object> config = configMapper.readValue(configJson, Map.class);

            ArrayList<String> errors = new ArrayList<String>();

            // check contains the 'api' section
            if (!config.containsKey("api")) {
                errors.add("configuration is missing required 'api' section");
                return new ConfigurationWithErrors(null, errors);
            }
            
            // check all auth config exists
            ArrayList<String> authConfig1Errors = new ArrayList<String>();
            String tokenUrl = getRequiredValueFromFile(new String[]{"tokenUrl"}, config, "api", authConfig1Errors);
            String username = getRequiredValueFromFile(new String[]{"username"}, config, "api", authConfig1Errors);
            String password = getRequiredValueFromFile(new String[]{"password"}, config, "api", authConfig1Errors);
            String clientId = getRequiredValueFromFile(new String[]{"clientId"}, config, "api", authConfig1Errors);
            String clientSecret = getRequiredValueFromFile(new String[]{"clientSecret"}, config, "api", authConfig1Errors);
            
            ArrayList<String> authConfig2Errors = new ArrayList<String>();
            String personalAccessToken = getRequiredValueFromFile(new String[]{"accessToken"}, config, "api", authConfig2Errors);

            if (!authConfig1Errors.isEmpty() && !authConfig2Errors.isEmpty()) {
                errors.addAll(authConfig1Errors);
            }
            
            // check api url config exists
            String apiUrl = getRequiredValueFromFile(
                new String[]{
                    "lusidUrl",
                    "apiUrl"
                }, 
                config, "api", errors);
            
            // optional config
            Map<String, Object> apiConfig = (Map<String, Object>) config.get("api");
            String applicationName = apiConfig.containsKey("applicationName") ? (String) apiConfig.get("applicationName") : null;

            int totalTimeoutMs = getPositiveIntFromFile(apiConfig, "totalTimeoutMs", "TotalTimeoutMs", configurationOptions.getTotalTimeoutMs(), DEFAULT_TOTAL_TIMEOUT_MS, errors);
            int connectTimeoutMs = getPositiveIntFromFile(apiConfig, "connectTimeoutMs", "ConnectTimeoutMs", configurationOptions.getConnectTimeoutMs(), DEFAULT_CONNECT_TIMEOUT_MS, errors);
            int readTimeoutMs = getPositiveIntFromFile(apiConfig, "readTimeoutMs", "ReadTimeoutMs", configurationOptions.getReadTimeoutMs(), DEFAULT_READ_TIMEOUT_MS, errors);
            int writeTimeoutMs = getPositiveIntFromFile(apiConfig, "writeTimeoutMs", "WriteTimeoutMs", configurationOptions.getWriteTimeoutMs(), DEFAULT_WRITE_TIMEOUT_MS, errors);
            int rateLimitRetries = getPositiveIntFromFile(apiConfig, "rateLimitRetries", "RateLimitRetries", configurationOptions.getRateLimitRetries(), DEFAULT_RATE_LIMIT_RETRIES, errors);

            // proxy config
            String proxyAddress = null;
            int proxyPort = -1;
            String proxyUsername = null;
            String proxyPassword = null;

            if (config.containsKey("proxy")) {
                Map<String, Object> proxyConfig = (Map<String, Object>) config.get("proxy");

                proxyAddress = (String) proxyConfig.get("proxyAddress");
                proxyPort = (Integer) proxyConfig.get("proxyPort");
                proxyUsername = (String) proxyConfig.get("username");
                proxyPassword = (String) proxyConfig.get("password");
            }

            // return the configuration if no errors
            if (errors.isEmpty()) {
                ApiConfiguration configuration = new ApiConfiguration(tokenUrl, username, password, clientId, clientSecret, apiUrl, applicationName,
                    personalAccessToken, proxyAddress, proxyPort, proxyUsername, proxyPassword, totalTimeoutMs, connectTimeoutMs, readTimeoutMs, writeTimeoutMs, rateLimitRetries);
                return new ConfigurationWithErrors(configuration, errors);
            }

            // else return the errors
            return new ConfigurationWithErrors(null, errors);
        } catch (IOException e){
            throw new ApiConfigurationException("Error when loading details from configuration file: " + e.getMessage(), e);
        }
    }

    String getRequiredValueFromEnvironmentVariable(String[] names, ArrayList<String> errors) {
        String value = null;
        for (String name: names) {
            value = System.getenv(name);
            if (value != null) {
                break;
            }
        }
        if (value == null) {
            errors.add("'" + names[0] + "' was not set");
        }
        return value;
    }

    String getRequiredValueFromFile(String[] names, Map<String, Object> config, String configKey, ArrayList<String> errors) {
        String value = null;
        Map<String, Object> innerConfig = (Map<String, Object>) config.get(configKey);
        for (String name: names) {
            if (innerConfig.containsKey(name)) {
                value = (String) innerConfig.get(name);
                break;
            }
        }
        if (value == null) {
            errors.add("'" + configKey + "." + names[0] + "' was not set");
        }
        return value;
    }

    int getPositiveIntFromEnvironmentVariable(
        String envVarName,
        String configurationOptionName,
        Integer configurationOptionValue,
        int defaultValue,
        ArrayList<String> errors
    ) {
        int returnInt;
        if (configurationOptionValue == null) {
            String intString = System.getenv(envVarName);
            returnInt = defaultValue;
            if (intString != null) {
                try {
                    returnInt = Integer.parseInt(intString);
                    if (returnInt < 0) {
                        errors.add("'" + envVarName + "' must be a positive integer between 0 and " + Integer.MAX_VALUE);
                    }
                } catch (NumberFormatException e) {
                    errors.add("'" + envVarName + "' is not a valid integer");
                }
            }
        } else {
            returnInt = configurationOptionValue;
            if (returnInt < 0) {
                errors.add("'ConfigurationOptions." + configurationOptionName + "' must be a positive integer between 0 and " + Integer.MAX_VALUE);
            }
        }
        return returnInt;
    }

    int getPositiveIntFromFile(
        Map<String, Object> apiConfig,
        String configName,
        String configurationOptionName,
        Integer configurationOptionValue,
        int defaultValue,
        ArrayList<String> errors
    ) {
        int returnInt = defaultValue;
        if (configurationOptionValue == null) {
            if (apiConfig.containsKey(configName)) {
                Object intObject = apiConfig.get(configName);
                if (intObject instanceof Integer) {
                    returnInt = (int) apiConfig.get(configName);
                    if (returnInt < 0) {
                        errors.add("'api." + configName + "' must be a positive integer between 0 and " + Integer.MAX_VALUE);
                    }
                } else {
                    errors.add("'api." + configName + "' is not a valid integer");
                }
            }
        } else {
            returnInt = configurationOptionValue;
            if (returnInt < 0) {
                errors.add("'ConfigurationOptions." + configurationOptionName + "' must be a positive integer between 0 and " + Integer.MAX_VALUE);
            }
        }
        return returnInt;
    }

    // getter used for mocking in tests
    FileConfigurationLoader getFileConfigurationLoader(){
        return new FileConfigurationLoader();
    }
}
