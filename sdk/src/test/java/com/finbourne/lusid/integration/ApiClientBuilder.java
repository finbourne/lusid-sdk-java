package com.finbourne.lusid.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.lusid.ApiClient;
import com.squareup.okhttp.*;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Utility class to build an ApiClient from a set of configuration
 */
public class ApiClientBuilder {

    private static final MediaType FORM = MediaType.parse("application/x-www-form-urlencoded");

    private String tokenUrl;
    private String username;
    private String password;
    private String clientId;
    private String clientSecret;
    private String apiUrl;


    public ApiClientBuilder(File configFile) throws IOException {
        //  load configuration
        ObjectMapper configMapper = new ObjectMapper();
        Map apiConfig = configMapper.readValue(configFile, Map.class);
        Map config = (Map)apiConfig.get("api");

        String tokenUrl = this.getEnvironmentOverride("FBN_TOKEN_URL", (String)config.get("tokenUrl"));
        String username = this.getEnvironmentOverride("FBN_USERNAME", (String)config.get("username"));
        String password = URLEncoder.encode(this.getEnvironmentOverride("FBN_PASSWORD", (String)config.get("password")), StandardCharsets.UTF_8.toString());
        String clientId = URLEncoder.encode(this.getEnvironmentOverride("FBN_CLIENT_ID", (String)config.get("clientId")), StandardCharsets.UTF_8.toString());
        String clientSecret = URLEncoder.encode(this.getEnvironmentOverride("FBN_CLIENT_SECRET", (String)config.get("clientSecret")), StandardCharsets.UTF_8.toString());

        String apiUrl = this.getEnvironmentOverride("FBN_LUSID_API_URL", (String)config.get("apiUrl"));

        init(tokenUrl, username, password, clientId, clientSecret, apiUrl);
    }

    public ApiClientBuilder(String tokenUrl, String username, String password, String clientId, String clientSecret, String apiUrl)
    {
        init(tokenUrl, username, password, clientId, clientSecret, apiUrl);
    }

    private void init(String tokenUrl, String username, String password, String clientId, String clientSecret, String apiUrl)
    {
        this.tokenUrl = tokenUrl;
        this.username = username;
        this.password = password;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.apiUrl = apiUrl;
    }

    private String getEnvironmentOverride(String env, String defaultValue)
    {
        String  envOverride = System.getenv(env);
        return envOverride == null ? defaultValue : envOverride;
    }

    public ApiClient build() throws IOException
    {
        //  request body
        final String    tokenRequestBody = String.format("grant_type=password&username=%s&password=%s&scope=openid client groups&client_id=%s&client_secret=%s", username, password, clientId, clientSecret);

        final OkHttpClient oktaClient = new OkHttpClient();
        final RequestBody body = RequestBody.create(FORM, tokenRequestBody);
        final Request request = new Request.Builder()
                .url(tokenUrl)
                .header("Accept", "application/json")
                .post(body)
                .build();

        Response response = oktaClient.newCall(request).execute();

        final String          content = response.body().string();
        final ObjectMapper mapper = new ObjectMapper();

        //  map json response
        final Map bodyValues = mapper.readValue(content, Map.class);

        assertTrue("missing access_token", bodyValues.containsKey("access_token"));

        //  get access token
        final String apiToken = (String)bodyValues.get("access_token");

        ApiClient   apiClient;
        apiClient = new ApiClient();
        apiClient.addDefaultHeader("Authorization", "Bearer " + apiToken);
        apiClient.setBasePath(apiUrl);

        return apiClient;
    }
}
