package com.finbourne.lusid.extensions;

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
     * lusid API Url
     */
    private String apiUrl;

    /**
     * Personal Access Token
     */
    private String personalAccessToken;

    /**
     * Proxy url (if required)
     */
    private String proxyAddress;

    /**
     * Proxy port (if required)
     */
    private int proxyPort;

    /**
     * Proxy username (if required)
     */
    private String proxyUsername;

    /**
     * Proxy password (if required)
     */
    private String proxyPassword;

    /**
     * Timeout in ms
     */
    private int totalTimeoutMs;

    private int connectTimeoutMs;

    private int readTimeoutMs;

    private int writeTimeoutMs;

    private int rateLimitRetries;


    public ApiConfiguration(String tokenUrl, String username, String password, String clientId, String clientSecret, String apiUrl, String applicationName,
                            String personalAccessToken, String proxyAddress, int proxyPort, String proxyUsername, String proxyPassword, int totalTimeoutMs,
                            int connectTimeoutMs, int readTimeoutMs, int writeTimeoutMs, int rateLimitRetries) {
        this.tokenUrl = tokenUrl;
        this.username = username;
        this.password = password;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.apiUrl = apiUrl;
        this.applicationName = applicationName;
        this.personalAccessToken = personalAccessToken;
        this.proxyAddress = proxyAddress;
        this.proxyPort = proxyPort;
        this.proxyUsername = proxyUsername;
        this.proxyPassword = proxyPassword;
        this.totalTimeoutMs = totalTimeoutMs;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
        this.writeTimeoutMs = writeTimeoutMs;
        this.rateLimitRetries = rateLimitRetries;
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

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getPersonalAccessToken() {
        return personalAccessToken;
    }

    public void setPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
    }

    public int getTotalTimeoutMs() {
        return totalTimeoutMs;
    }

    public void setTotalTimeoutMs(int totalTimeoutMs) {
        this.totalTimeoutMs = totalTimeoutMs;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(int readTimeoutMs) {
        this.readTimeoutMs = readTimeoutMs;
    }

    public int getWriteTimeoutMs() {
        return writeTimeoutMs;
    }

    public void setWriteTimeoutMs(int writeTimeoutMs) {
        this.writeTimeoutMs = writeTimeoutMs;
    }

    public int getRateLimitRetries() {
        return rateLimitRetries;
    }

    public void setRateLimitRetries(int rateLimitRetries) {
        this.rateLimitRetries = rateLimitRetries;
    }
}
