package com.finbourne.lusid.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.lusid.ApiClient;
import com.squareup.okhttp.*;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

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


    public ApiClientBuilder(String apiConfig) throws IOException {

        //  firstly try and get the values from environment variables
        String tokenUrl = System.getenv("FBN_TOKEN_URL");
        String username = System.getenv("FBN_USERNAME");
        String password = System.getenv("FBN_PASSWORD");
        String clientId = System.getenv("FBN_CLIENT_ID");
        String clientSecret = System.getenv("FBN_CLIENT_SECRET");
        String apiUrl = System.getenv("FBN_LUSID_API_URL");

        if (tokenUrl == null || username == null || password == null || clientId == null || clientSecret == null || apiUrl == null) {

            File configJson = new ConfigurationLoader().loadConfiguration(apiConfig);

            //  load configuration from secrets.json if any of the environment variables are missing
            ObjectMapper configMapper = new ObjectMapper();
            Map apiConfigValues = configMapper.readValue(configJson, Map.class);
            Map config = (Map)apiConfigValues.get("api");

            tokenUrl = (String)config.get("tokenUrl");
            username = (String)config.get("username");
            password = (String)config.get("password");
            clientId = (String)config.get("clientId");
            clientSecret = (String)config.get("clientSecret");
            apiUrl = (String)config.get("apiUrl");
        }

        this.tokenUrl = tokenUrl;
        this.username = username;
        this.password = URLEncoder.encode(password, StandardCharsets.UTF_8.toString());
        this.clientId = clientId;
        this.clientSecret = URLEncoder.encode(clientSecret, StandardCharsets.UTF_8.toString());;
        this.apiUrl = apiUrl;
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

        if (response.code() != 200) {
            throw new IOException(response.toString());
        }

        final String          content = response.body().string();
        final ObjectMapper mapper = new ObjectMapper();

        //  map json response
        final Map bodyValues = mapper.readValue(content, Map.class);

        if (!bodyValues.containsKey("access_token")) {
            throw new IOException("missing access_token");
        }

        //  get access token
        final String apiToken = (String)bodyValues.get("access_token");

        ApiClient   apiClient;
        apiClient = new ApiClient();
        apiClient.addDefaultHeader("Authorization", "Bearer " + apiToken);
        apiClient.setBasePath(apiUrl);

        return apiClient;
    }
}
