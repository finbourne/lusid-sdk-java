/*
 * LUSID API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;
import com.finbourne.lusid.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.ResourceListOfScopeDefinition;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScopesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ScopesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScopesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call listEntityScopesCall(String entityType, OffsetDateTime asAt, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        return listEntityScopesCall(entityType, asAt, page, limit,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call listEntityScopesCall(String entityType, OffsetDateTime asAt, String page, Integer limit, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/scopes/{entityType}"
            .replace("{" + "entityType" + "}", localVarApiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listEntityScopesValidateBeforeCall(String entityType, OffsetDateTime asAt, String page, Integer limit, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling listEntityScopes(Async)");
        }

        return listEntityScopesCall(entityType, asAt, page, limit, _callback, opts);

    }


    private ApiResponse<ResourceListOfScopeDefinition> listEntityScopesWithHttpInfo(String entityType, OffsetDateTime asAt, String page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listEntityScopesValidateBeforeCall(entityType, asAt, page, limit, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ResourceListOfScopeDefinition> listEntityScopesWithHttpInfo(String entityType, OffsetDateTime asAt, String page, Integer limit, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = listEntityScopesValidateBeforeCall(entityType, asAt, page, limit, null, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listEntityScopesAsync(String entityType, OffsetDateTime asAt, String page, Integer limit, final ApiCallback<ResourceListOfScopeDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = listEntityScopesValidateBeforeCall(entityType, asAt, page, limit, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call listEntityScopesAsync(String entityType, OffsetDateTime asAt, String page, Integer limit, final ApiCallback<ResourceListOfScopeDefinition> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = listEntityScopesValidateBeforeCall(entityType, asAt, page, limit, _callback, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistEntityScopesRequest {
        private final String entityType;
        private OffsetDateTime asAt;
        private String page;
        private Integer limit;

        private APIlistEntityScopesRequest(String entityType) {
            this.entityType = entityType;
        }

        /**
         * Set asAt
         * @param asAt The asAt datetime at which to retrieve scopes. Defaults to latest datetime if not specified. (optional)
         * @return APIlistEntityScopesRequest
         */
        public APIlistEntityScopesRequest asAt(OffsetDateTime asAt) {
            this.asAt = asAt;
            return this;
        }

        /**
         * Set page
         * @param page The pagination token to use to continue listing scopes from a previous call to list scopes.   This value is returned from the previous call. If a pagination token is provided, the limit and asAt fields   must not have changed since the original request. (optional)
         * @return APIlistEntityScopesRequest
         */
        public APIlistEntityScopesRequest page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set limit
         * @param limit When paginating, limit the number of returned results to this number. Defaults to 100 if not specified. (optional)
         * @return APIlistEntityScopesRequest
         */
        public APIlistEntityScopesRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Build call for listEntityScopes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listEntityScopesCall(entityType, asAt, page, limit, _callback);
        }

        /**
         * Execute listEntityScopes request
         * @return ResourceListOfScopeDefinition
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfScopeDefinition execute() throws ApiException {
            ApiResponse<ResourceListOfScopeDefinition> localVarResp = listEntityScopesWithHttpInfo(entityType, asAt, page, limit);
            return localVarResp.getData();
        }

        /**
         * Execute listEntityScopes request. Use any specified configuration options to override any other configuration for this request only.
         * @return ResourceListOfScopeDefinition
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfScopeDefinition execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ResourceListOfScopeDefinition> localVarResp = listEntityScopesWithHttpInfo(entityType, asAt, page, limit, opts);
            return localVarResp.getData();
        }

        /**
         * Execute listEntityScopes request with HTTP info returned
         * @return ApiResponse&lt;ResourceListOfScopeDefinition&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfScopeDefinition> executeWithHttpInfo() throws ApiException {
            return listEntityScopesWithHttpInfo(entityType, asAt, page, limit);
        }

        /**
         * Execute listEntityScopes request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ResourceListOfScopeDefinition&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfScopeDefinition> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return listEntityScopesWithHttpInfo(entityType, asAt, page, limit, opts);
        }

        /**
         * Execute listEntityScopes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfScopeDefinition> _callback) throws ApiException {
            return listEntityScopesAsync(entityType, asAt, page, limit, _callback);
        }

        /**
         * Execute listEntityScopes request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfScopeDefinition> _callback, ConfigurationOptions opts) throws ApiException {
            return listEntityScopesAsync(entityType, asAt, page, limit, _callback, opts);
        }
    }

    /**
     * ListEntityScopes: List Entity Scopes
     * List all the scopes for a given entity type that contain data.
     * @param entityType The entity type to list scopes for. (required)
     * @return APIlistEntityScopesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIlistEntityScopesRequest listEntityScopes(String entityType) {
        return new APIlistEntityScopesRequest(entityType);
    }
    private okhttp3.Call listScopesCall(String filter, final ApiCallback _callback) throws ApiException {
        return listScopesCall(filter,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call listScopesCall(String filter, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/scopes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listScopesValidateBeforeCall(String filter, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        return listScopesCall(filter, _callback, opts);

    }


    private ApiResponse<ResourceListOfScopeDefinition> listScopesWithHttpInfo(String filter) throws ApiException {
        okhttp3.Call localVarCall = listScopesValidateBeforeCall(filter, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ResourceListOfScopeDefinition> listScopesWithHttpInfo(String filter, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = listScopesValidateBeforeCall(filter, null, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listScopesAsync(String filter, final ApiCallback<ResourceListOfScopeDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = listScopesValidateBeforeCall(filter, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call listScopesAsync(String filter, final ApiCallback<ResourceListOfScopeDefinition> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = listScopesValidateBeforeCall(filter, _callback, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfScopeDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistScopesRequest {
        private String filter;

        private APIlistScopesRequest() {
        }

        /**
         * Set filter
         * @param filter Expression to filter the result set.   For example, to filter on the Scope, use \&quot;scope eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
         * @return APIlistScopesRequest
         */
        public APIlistScopesRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Build call for listScopes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listScopesCall(filter, _callback);
        }

        /**
         * Execute listScopes request
         * @return ResourceListOfScopeDefinition
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfScopeDefinition execute() throws ApiException {
            ApiResponse<ResourceListOfScopeDefinition> localVarResp = listScopesWithHttpInfo(filter);
            return localVarResp.getData();
        }

        /**
         * Execute listScopes request. Use any specified configuration options to override any other configuration for this request only.
         * @return ResourceListOfScopeDefinition
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfScopeDefinition execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ResourceListOfScopeDefinition> localVarResp = listScopesWithHttpInfo(filter, opts);
            return localVarResp.getData();
        }

        /**
         * Execute listScopes request with HTTP info returned
         * @return ApiResponse&lt;ResourceListOfScopeDefinition&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfScopeDefinition> executeWithHttpInfo() throws ApiException {
            return listScopesWithHttpInfo(filter);
        }

        /**
         * Execute listScopes request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ResourceListOfScopeDefinition&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfScopeDefinition> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return listScopesWithHttpInfo(filter, opts);
        }

        /**
         * Execute listScopes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfScopeDefinition> _callback) throws ApiException {
            return listScopesAsync(filter, _callback);
        }

        /**
         * Execute listScopes request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfScopeDefinition> _callback, ConfigurationOptions opts) throws ApiException {
            return listScopesAsync(filter, _callback, opts);
        }
    }

    /**
     * ListScopes: List Scopes
     * List all the scopes that contain data.
     * @return APIlistScopesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of scopes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIlistScopesRequest listScopes() {
        return new APIlistScopesRequest();
    }
}
