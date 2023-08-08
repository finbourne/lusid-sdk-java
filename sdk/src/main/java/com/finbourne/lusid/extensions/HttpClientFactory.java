package com.finbourne.lusid.extensions;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/**
* Builds http client to communicate to lusid API instances.
*
*/
public class HttpClientFactory {

    private static int DEFAULT_TIMEOUT_SECONDS = 10;

    /**
    *  Builds a {@link OkHttpClient} from a {@link ApiConfiguration} to make
    *  calls to the lusid API.
    *
    * @param apiConfiguration configuration to connect to lusid API
    * @return an client for http calls to lusid API
    */
    public OkHttpClient build(ApiConfiguration apiConfiguration) {
        return this.build(apiConfiguration, DEFAULT_TIMEOUT_SECONDS, DEFAULT_TIMEOUT_SECONDS);
    }

    /**
     * Builds a {@link OkHttpClient} from a {@link ApiConfiguration} to make
     * calls to the lusid API.
     *
     * @param apiConfiguration configuration to connect to lusid API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @return n client for http calls to lusid API
     */
    public OkHttpClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout){
        return this.build(apiConfiguration, readTimeout, writeTimeout, DEFAULT_TIMEOUT_SECONDS);
    }

    /**
     * Builds a {@link OkHttpClient} from a {@link ApiConfiguration} to make
     * calls to the lusid API.
     *
     * @param apiConfiguration configuration to connect to lusid API
     * @param readTimeout read timeout in seconds
     * @param writeTimeout write timeout in seconds
     * @param connectTimeout write timeout in seconds
     * @return n client for http calls to lusid API
     */
    public OkHttpClient build(ApiConfiguration apiConfiguration, int readTimeout, int writeTimeout, int connectTimeout){
        final OkHttpClient httpClient;

        //  use a proxy if given
        if (apiConfiguration.getProxyAddress() != null) {

            InetSocketAddress proxy = new InetSocketAddress(apiConfiguration.getProxyAddress(), apiConfiguration.getProxyPort());

            httpClient = new OkHttpClient.Builder()
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
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
            httpClient = new OkHttpClient.Builder()
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                .build();
        }
        return httpClient;
    }

}
