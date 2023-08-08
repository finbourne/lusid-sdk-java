package com.finbourne.lusid.extensions;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.extensions.auth.FinbourneToken;
import com.finbourne.lusid.extensions.auth.RefreshingTokenProvider;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;
import okhttp3.Call;

import java.util.List;
import java.util.Map;

/**
* An extension of the {@link ApiClient} that always updates the clients authorisation
* header to use a valid {@link FinbourneToken} before any calls to the lusid API.
*
*/
public class RefreshingTokenApiClient extends RetryingApiClient {

    /** Default api client to delegate actual request execution*/
    private final ApiClient apiClient;

    /** Token provider to retrieve valid {@link FinbourneToken} */
    private final RefreshingTokenProvider tokenProvider;

    public RefreshingTokenApiClient(ApiClient apiClient, RefreshingTokenProvider tokenProvider) {
        this.apiClient = apiClient;
        this.tokenProvider = tokenProvider;
    }

    public RefreshingTokenApiClient(ApiClient apiClient, RefreshingTokenProvider tokenProvider, int maxAttempts) {
        super(maxAttempts);
        this.apiClient = apiClient;
        this.tokenProvider = tokenProvider;
    }

    /**
    * Wraps around the default {@link ApiClient} implementation to ensure the client always uses
    * a valid {@link FinbourneToken}.
    *
    * Delegates actual call to the default {@link ApiClient} implementation once the authorisation
    * header has been set to use a valid token.
    *
    * @return
    * @throws ApiException
    */
    @Override
    public Call buildCall(String url, String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, String> cookieParams,  Map<String, Object> formParams, String[] authNames, ApiCallback callback) throws ApiException {
        try {
            setAccessToken(tokenProvider.get());
        } catch (FinbourneTokenException e) {
            throw new ApiException(e);
        }
        return apiClient.buildCall(url, path, method, queryParams, collectionQueryParams, body, headerParams, cookieParams, formParams, authNames, callback);
    }

    private void setAccessToken(FinbourneToken accessToken) {
        apiClient.addDefaultHeader("Authorization", "Bearer " + accessToken.getAccessToken());
    }

}
