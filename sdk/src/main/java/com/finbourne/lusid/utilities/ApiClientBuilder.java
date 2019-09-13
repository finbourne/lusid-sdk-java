package com.finbourne.lusid.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.lusid.ApiClient;
import okhttp3.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * Utility class to build an ApiClient from a set of configuration
 */
public class ApiClientBuilder {

    private static final MediaType FORM = MediaType.parse("application/x-www-form-urlencoded");

    public ApiClient build(String apiSecretsFilename) throws IOException
    {
        ApiConfiguration    apiConfiguration = new ApiConfigurationBuilder().build(apiSecretsFilename);

        //  request body
        final String    tokenRequestBody = String.format("grant_type=password&username=%s&password=%s&scope=openid client groups&client_id=%s&client_secret=%s",
                apiConfiguration.getUsername(),
                URLEncoder.encode(apiConfiguration.getPassword(), StandardCharsets.UTF_8.toString()),
                apiConfiguration.getClientId(),
                URLEncoder.encode(apiConfiguration.getClientSecret(), StandardCharsets.UTF_8.toString()));

        final OkHttpClient    httpClient;

        //  use a proxy if given
        if (apiConfiguration.getProxyAddress() != null) {

            InetSocketAddress proxy = new InetSocketAddress(apiConfiguration.getProxyAddress(), apiConfiguration.getProxyPort());

            httpClient = new OkHttpClient.Builder()
                    .proxy(new Proxy(Proxy.Type.HTTP, proxy))
                    .proxyAuthenticator((route, response) -> {
                        String credential = Credentials.basic(apiConfiguration.getProxyUsername(), apiConfiguration.getProxyPassword());
                        return response.request().newBuilder()
                                .header("Proxy-Authorization", credential)
                                .build();
                    })
                    .build();
        }
        else {
            httpClient = new OkHttpClient();
        }

        final RequestBody body = RequestBody.create(FORM, tokenRequestBody);
        final Request request = new Request.Builder()
                .url(apiConfiguration.getTokenUrl())
                .header("Accept", "application/json")
                .post(body)
                .build();

        Response response = httpClient.newCall(request).execute();

        if (response.code() != 200) {
            throw new IOException(response.toString());
        }

        final String    content = response.body().string();
        final ObjectMapper mapper = new ObjectMapper();

        //  map json response
        final Map bodyValues = mapper.readValue(content, Map.class);

        if (!bodyValues.containsKey("access_token")) {
            throw new IOException("missing access_token");
        }

        //  get access token
        final String apiToken = (String)bodyValues.get("access_token");

        ApiClient   apiClient = new ApiClient();

        if (apiConfiguration.getProxyAddress() != null) {
            apiClient.setHttpClient(httpClient);
        }

        apiClient.addDefaultHeader("Authorization", "Bearer " + apiToken);
        apiClient.addDefaultHeader("X-LUSID-Application", apiConfiguration.getApplicationName());
        apiClient.setBasePath(apiConfiguration.getApiUrl());

        return apiClient;
    }
}
