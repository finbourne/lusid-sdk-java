package com.finbourne.lusid.extensions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RateLimitRetryInterceptor implements Interceptor {
    private int maxRetries;

    public RateLimitRetryInterceptor(int maxRetries) throws IllegalArgumentException {
        if (maxRetries < 0) {
            throw new IllegalArgumentException("Max retries must be a positive number");
        }
        this.maxRetries = maxRetries;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        int retries = 0;
        try {
            while (response.code() == 429 && retries < this.maxRetries) {
                Map<String, List<String>> responseHeaders = response.headers().toMultimap();
                String retryAfterHeader = responseHeaders.get("retry-after").get(0);
                long retryAfter = Long.parseLong(retryAfterHeader) * 1000;
                Thread.sleep(retryAfter);
                retries++;
                response.close();
                response = chain.proceed(request);

            }
        } catch (InterruptedException e) {
            return response.newBuilder().message("Too many requests. Attempted to retry but was interrupted.").build();
        } catch (NullPointerException e) {
            return response.newBuilder()
                    .message("Too many requests. Unable to retry as Retry-after header not provided").build();
        } catch (NumberFormatException e) {
            return response.newBuilder()
                    .message("Too many requests. Unable to retry as unable to deserialize Retry-after header").build();
        }

        // otherwise just pass the original response on
        return response;
    }

    public int getMaxRetries() {
        return maxRetries;
    }
}
