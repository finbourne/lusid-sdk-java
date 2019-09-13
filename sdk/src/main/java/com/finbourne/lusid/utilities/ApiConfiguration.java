package com.finbourne.lusid.utilities;

/**
 *
 */
public class ApiConfiguration {

    /**
     * Url for the token provider
     */
    private String tokenUrl;

    /**
     *  Username
     */
    private String username;


    /**
     * Password
     */
    private String password;

    /**
     * Oauth2 Client ID
     */
    private String clientId;

    /**
     *  OAuth2 Client Secret
     */
    private String clientSecret;

    /**
     * LUSID API Url
     */
    private String apiUrl;

    /**
     * Proxy url (if required)
     */
    private String proxyAddress;

    /**
     * Proxy port (if required)
     */
    private Integer proxyPort;

    /**
     * Proxy username (if required)
     */
    private String proxyUsername;

    /**
     * Proxy password (if required)
     */
    private String proxyPassword;

    public ApiConfiguration(String tokenUrl, String username, String password, String clientId, String clientSecret, String apiUrl, String applicationName,
                            String proxyAddress, Integer proxyPort, String proxyUsername, String proxyPassword) {
        this.tokenUrl = tokenUrl;
        this.username = username;
        this.password = password;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.apiUrl = apiUrl;
        this.applicationName = applicationName;
        this.proxyAddress = proxyAddress;
        this.proxyPort = proxyPort;
        this.proxyUsername = proxyUsername;
        this.proxyPassword = proxyPassword;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    private String applicationName;

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public String getProxyAddress() {
        return proxyAddress;
    }

    public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }
}
