package com.finbourne.lusid.extensions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.finbourne.lusid.ApiException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RateLimitRetryInterceptor implements Interceptor {
    private int maxAttempts;

    public RateLimitRetryInterceptor(int maxAttempts) throws IllegalArgumentException {
        if (maxAttempts <= 0) {
            throw new IllegalArgumentException("Max attempts must be greater than 0");
        }
        this.maxAttempts = maxAttempts;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        int tryCount = 1;
        try {
            while (response.code() == 429 && tryCount < this.maxAttempts) {
                Map<String, List<String>> responseHeaders = response.headers().toMultimap();
                String retryAfterHeader = responseHeaders.get("retry-after").get(0);
                long retryAfter = Long.parseLong(retryAfterHeader) * 1000;
                Thread.sleep(retryAfter);
                tryCount++;
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
}
