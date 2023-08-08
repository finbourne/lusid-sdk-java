package com.finbourne.lusid.extensions;

import java.lang.reflect.Type;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils.Null;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;

import okhttp3.Call;

public class RetryingApiClient extends ApiClient {
    private int maxAttempts;

    private void setMaxAttempts(int maxAttempts) throws IllegalArgumentException {
        if (maxAttempts < 1) {
            throw new IllegalArgumentException("maxAttempts must be greater than 0");
        }
        this.maxAttempts = maxAttempts;

    }

    /*
     * Constructor for RetringApiClient
     * sets max number of attempts to retry on a 429 response to 3
     */
    public RetryingApiClient() throws IllegalArgumentException {
        this(3);
    }

    /*
     * Constructor for RetringApiClient
     * specifying max number of attempts to retry on a 429 response
     */
    public RetryingApiClient(int maxAttempts) throws IllegalArgumentException {
        super();
        setMaxAttempts(maxAttempts);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given
     * return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T>        The return type corresponding to (same with) returnType
     * @param call       Call
     * @return ApiResponse object containing response status, headers and
     *         data, which is a Java object deserialized from response body and
     *         would be null
     *         when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        for (int attempt = 1; attempt < maxAttempts; attempt++) {
            try {
                return super.execute(call, returnType);
            } catch (ApiException e) {
                if (e.getCode() != 429 || maxAttempts == attempt) {
                    throw e;
                } else {
                    call = call.clone();
                    Map<String, List<String>> responseHeaders = e.getResponseHeaders();
                    try {
                        String retryAfterHeader = responseHeaders.get("retry-after").get(0);
                        long retryAfter = Long.parseLong(retryAfterHeader) * 1000;
                        Thread.sleep(retryAfter);
                    } catch (InterruptedException exc) {
                        throw new ApiException("Failed to retry, thread interrupted", e, 429, responseHeaders,
                                e.getResponseBody());

                    } catch (NullPointerException exc) {
                        throw new ApiException("Retry-After header unavailable", e,
                                429, responseHeaders,
                                e.getResponseBody());
                    } catch (NumberFormatException exc) {
                        throw new ApiException("Failed to parse Retry-After header", e,
                                429, responseHeaders,
                                e.getResponseBody());
                    }
                }
            }
        }
        return super.execute(call, returnType);
    }

    /*
     * Wrap original callback in callback that retries on 429
     */
    private <T> ApiCallback<T> buildRetryingCallback(Call call, final Type returnType, final ApiCallback<T> callback,
            int attempt) {

        ApiCallback<T> retryingCallback = new ApiCallback<T>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                if (statusCode != 429 || attempt >= maxAttempts) {
                    callback.onFailure(e, statusCode, responseHeaders);
                } else {
                    String retryAfterHeader = responseHeaders.get("retry-after").get(0);
                    long retryAfter = Long.parseLong(retryAfterHeader) * 1000;
                    try {
                        Thread.sleep(retryAfter);
                    } catch (InterruptedException exc) {
                        callback.onFailure(
                                new ApiException("Failed to retry, thread interrupted", e, 429, responseHeaders,
                                        e.getResponseBody()),
                                statusCode, responseHeaders);
                    } catch (NullPointerException exc) {
                        callback.onFailure(
                                new ApiException("Retry-After header unavailable", e,
                                        429, responseHeaders,
                                        e.getResponseBody()),
                                statusCode, responseHeaders);
                    } catch (NumberFormatException exc) {
                        callback.onFailure(
                                new ApiException("Failed to parse Retry-After header", e,
                                        429, responseHeaders,
                                        e.getResponseBody()),
                                statusCode, responseHeaders);
                    }
                    // Retry with new callback - maintain count of attempts
                    RetryingApiClient.super.executeAsync(call.clone(), returnType,
                            buildRetryingCallback(call, returnType, callback, attempt + 1));
                }
            }

            @Override
            public void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders) {
                callback.onSuccess(result, statusCode, responseHeaders);
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                callback.onUploadProgress(bytesWritten, contentLength, done);
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                callback.onDownloadProgress(bytesRead, contentLength, done);
            }
        };
        return retryingCallback;
    }

    /**
     * Execute HTTP call asynchronously. Retry on 429s
     *
     * @param <T>        Type
     * @param call       The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback   ApiCallback
     * @see #execute(Call, Type)
     */
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        super.executeAsync(call, returnType, buildRetryingCallback(call, returnType, callback, 1));
    }

}
