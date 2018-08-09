/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.implementation;

import com.finbourne.LUSIDAPI;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.finbourne.models.AddTradePropertyDto;
import com.finbourne.models.AdjustHoldingRequest;
import com.finbourne.models.AdjustHoldingsDto;
import com.finbourne.models.AggregationRequest;
import com.finbourne.models.AnalyticsStorageRequest;
import com.finbourne.models.AnalyticStoreDto;
import com.finbourne.models.ClassificationsDto;
import com.finbourne.models.ClearEntityCachesDto;
import com.finbourne.models.CorporateActionEventDto;
import com.finbourne.models.CreateAnalyticStoreRequest;
import com.finbourne.models.CreateClientSecurityRequest;
import com.finbourne.models.CreateDerivedPortfolioRequest;
import com.finbourne.models.CreateGroupRequest;
import com.finbourne.models.CreatePerpetualPropertyRequest;
import com.finbourne.models.CreatePortfolioRequest;
import com.finbourne.models.CreatePropertyDataFormatRequest;
import com.finbourne.models.CreatePropertyDefinitionRequest;
import com.finbourne.models.CreatePropertyRequest;
import com.finbourne.models.CreateResultsRequest;
import com.finbourne.models.DeletedEntityResponse;
import com.finbourne.models.ErrorResponseException;
import com.finbourne.models.ExpandedGroupDto;
import com.finbourne.models.GroupDto;
import com.finbourne.models.IUnitDefinitionDto;
import com.finbourne.models.ListAggregationResponse;
import com.finbourne.models.LoginResponse;
import com.finbourne.models.NestedAggregationResponse;
import com.finbourne.models.PersonalisationDto;
import com.finbourne.models.PortfolioDetailsDto;
import com.finbourne.models.PortfolioDetailsRequest;
import com.finbourne.models.PortfolioDto;
import com.finbourne.models.PortfolioPropertiesDto;
import com.finbourne.models.PropertyDataFormatDto;
import com.finbourne.models.PropertyDefinitionDto;
import com.finbourne.models.PropertySchemaDto;
import com.finbourne.models.ReconciliationRequest;
import com.finbourne.models.ReferencePortfolioConstituentDto;
import com.finbourne.models.ResourceId;
import com.finbourne.models.ResourceListAnalyticStoreKeyDto;
import com.finbourne.models.ResourceListGroupDto;
import com.finbourne.models.ResourceListPersonalisationDto;
import com.finbourne.models.ResourceListPortfolioDto;
import com.finbourne.models.ResourceListPortfolioSearchResult;
import com.finbourne.models.ResourceListProcessedCommandDto;
import com.finbourne.models.ResourceListPropertyDataFormatDto;
import com.finbourne.models.ResourceListPropertyDefinitionDto;
import com.finbourne.models.ResourceListPropertyDomain;
import com.finbourne.models.ResourceListPropertyKey;
import com.finbourne.models.ResourceListReconciliationBreakDto;
import com.finbourne.models.ResourceListReferencePortfolioConstituentDto;
import com.finbourne.models.ResourceListScope;
import com.finbourne.models.ResourceListTxnMetaDataDto;
import com.finbourne.models.ResourceListUiDataType;
import com.finbourne.models.ResultsDto;
import com.finbourne.models.SchemaDto;
import com.finbourne.models.SecurityAnalyticDataDto;
import com.finbourne.models.SecurityClassificationDto;
import com.finbourne.models.SecurityDto;
import com.finbourne.models.TryAddClientSecuritiesDto;
import com.finbourne.models.TryDeleteClientSecuritiesDto;
import com.finbourne.models.TryLookupSecuritiesFromCodesDto;
import com.finbourne.models.TryUpsertCorporateActionsDto;
import com.finbourne.models.TxnMetaDataDto;
import com.finbourne.models.UpdateGroupRequest;
import com.finbourne.models.UpdatePortfolioRequest;
import com.finbourne.models.UpdatePropertyDataFormatRequest;
import com.finbourne.models.UpdatePropertyDefinitionRequest;
import com.finbourne.models.UpsertCorporateActionRequest;
import com.finbourne.models.UpsertPersonalisationsResponse;
import com.finbourne.models.UpsertPortfolioTradeRequest;
import com.finbourne.models.UpsertPortfolioTradesDto;
import com.finbourne.models.UpsertReferencePortfolioConstituentsDto;
import com.finbourne.models.VersionedResourceListHoldingDto;
import com.finbourne.models.VersionedResourceListTradeDto;
import com.finbourne.models.WebLogMessage;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the LUSIDAPI class.
 */
public class LUSIDAPIImpl extends ServiceClient implements LUSIDAPI {
    /**
     * The Retrofit service to perform REST calls.
     */
    private LUSIDAPIService service;

    /**
     * Initializes an instance of LUSIDAPI client.
     */
    public LUSIDAPIImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of LUSIDAPI client.
     *
     * @param baseUrl the base URL of the host
     */
    public LUSIDAPIImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of LUSIDAPI client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public LUSIDAPIImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of LUSIDAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public LUSIDAPIImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of LUSIDAPI client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public LUSIDAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        initializeService();
    }

    private void initializeService() {
        service = retrofit().create(LUSIDAPIService.class);
    }

    /**
     * The interface defining all the services for LUSIDAPI to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LUSIDAPIService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI clearEntityCaches" })
        @GET("v1/api/_internal/clearentitycaches")
        Observable<Response<ResponseBody>> clearEntityCaches();

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByGroup" })
        @POST("v1/api/aggregation/groups/{scope}/{groupCode}")
        Observable<Response<ResponseBody>> getAggregationByGroup(@Path("scope") String scope, @Path("groupCode") String groupCode, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getNestedAggregationByGroup" })
        @POST("v1/api/aggregation/groups/nested/{scope}/{groupCode}")
        Observable<Response<ResponseBody>> getNestedAggregationByGroup(@Path("scope") String scope, @Path("groupCode") String groupCode, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByPortfolio" })
        @POST("v1/api/aggregation/portfolios/{scope}/{portfolioCode}")
        Observable<Response<ResponseBody>> getAggregationByPortfolio(@Path("scope") String scope, @Path("portfolioCode") String portfolioCode, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getNestedAggregationByPortfolio" })
        @POST("v1/api/aggregation/portfolios/nested/{scope}/{portfolioCode}")
        Observable<Response<ResponseBody>> getNestedAggregationByPortfolio(@Path("scope") String scope, @Path("portfolioCode") String portfolioCode, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByResultSet" })
        @POST("v1/api/aggregation/results/{scope}/{resultsKey}")
        Observable<Response<ResponseBody>> getAggregationByResultSet(@Path("scope") String scope, @Path("resultsKey") String resultsKey, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getNestedAggregationByResultSet" })
        @POST("v1/api/aggregation/results/nested/{scope}/{resultsKey}")
        Observable<Response<ResponseBody>> getNestedAggregationByResultSet(@Path("scope") String scope, @Path("resultsKey") String resultsKey, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listAnalyticStores" })
        @GET("v1/api/analytics")
        Observable<Response<ResponseBody>> listAnalyticStores(@Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createAnalyticStore" })
        @POST("v1/api/analytics")
        Observable<Response<ResponseBody>> createAnalyticStore(@Body CreateAnalyticStoreRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAnalyticStore" })
        @GET("v1/api/analytics/{scope}/{year}/{month}/{day}")
        Observable<Response<ResponseBody>> getAnalyticStore(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteAnalyticStore" })
        @HTTP(path = "v1/api/analytics/{scope}/{year}/{month}/{day}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteAnalyticStore(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI insertAnalytics" })
        @POST("v1/api/analytics/{scope}/{year}/{month}/{day}/prices")
        Observable<Response<ResponseBody>> insertAnalytics(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day, @Body List<SecurityAnalyticDataDto> data);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertAnalytics" })
        @POST("v1/api/analytics2/{scope}")
        Observable<Response<ResponseBody>> upsertAnalytics(@Path("scope") String scope, @Body AnalyticsStorageRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertClassification" })
        @POST("v1/api/classifications")
        Observable<Response<ResponseBody>> upsertClassification(@Body List<SecurityClassificationDto> classifications);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addConfigurationTransactionType" })
        @POST("v1/api/configuration/transactiontype")
        Observable<Response<ResponseBody>> addConfigurationTransactionType(@Body TxnMetaDataDto type);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getConfigurationTransactionTypes" })
        @GET("v1/api/configuration/transactiontypes")
        Observable<Response<ResponseBody>> getConfigurationTransactionTypes();

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI uploadConfigurationTransactionTypes" })
        @POST("v1/api/configuration/transactiontypes")
        Observable<Response<ResponseBody>> uploadConfigurationTransactionTypes(@Body List<TxnMetaDataDto> types);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listCorporateActions" })
        @GET("v1/api/corporateactions/{scope}/{corporateActionSourceCode}")
        Observable<Response<ResponseBody>> listCorporateActions(@Path("scope") String scope, @Path("corporateActionSourceCode") String corporateActionSourceCode, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchUpsertCorporateActions" })
        @POST("v1/api/corporateactions/{scope}/{corporateActionSourceCode}")
        Observable<Response<ResponseBody>> batchUpsertCorporateActions(@Path("scope") String scope, @Path("corporateActionSourceCode") String corporateActionSourceCode, @Body List<UpsertCorporateActionRequest> actions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getDownloadUrl" })
        @GET("v1/api/excel/download-token")
        Observable<Response<ResponseBody>> getDownloadUrl(@Query("version") String version);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getLatestVersion" })
        @GET("v1/api/excel/latest-version")
        Observable<Response<ResponseBody>> getLatestVersion();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolioGroups" })
        @GET("v1/api/groups/portfolios/{scope}")
        Observable<Response<ResponseBody>> listPortfolioGroups(@Path("scope") String scope, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPortfolioGroup" })
        @POST("v1/api/groups/portfolios/{scope}")
        Observable<Response<ResponseBody>> createPortfolioGroup(@Path("scope") String scope, @Body CreateGroupRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroup" })
        @GET("v1/api/groups/portfolios/{scope}/{code}")
        Observable<Response<ResponseBody>> getPortfolioGroup(@Path("scope") String scope, @Path("code") String code, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioGroup" })
        @HTTP(path = "v1/api/groups/portfolios/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioGroup(@Path("scope") String scope, @Path("code") String code);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroupCommands" })
        @GET("v1/api/groups/portfolios/{scope}/{code}/commands")
        Observable<Response<ResponseBody>> getPortfolioGroupCommands(@Path("scope") String scope, @Path("code") String code, @Query("fromAsAt") DateTime fromAsAt, @Query("toAsAt") DateTime toAsAt, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroupExpansion" })
        @GET("v1/api/groups/portfolios/{scope}/{code}/expansion")
        Observable<Response<ResponseBody>> getPortfolioGroupExpansion(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("propertyFilter") String propertyFilter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addPortfolioToGroup" })
        @POST("v1/api/groups/portfolios/{scope}/{code}/portfolios")
        Observable<Response<ResponseBody>> addPortfolioToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId identifier);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioFromGroup" })
        @HTTP(path = "v1/api/groups/portfolios/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioFromGroup(@Path("scope") String scope, @Path("code") String code, @Path("portfolioScope") String portfolioScope, @Path("portfolioCode") String portfolioCode);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addSubGroupToGroup" })
        @POST("v1/api/groups/portfolios/{scope}/{code}/subgroups")
        Observable<Response<ResponseBody>> addSubGroupToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId identifier);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteSubGroupFromGroup" })
        @HTTP(path = "v1/api/groups/portfolios/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteSubGroupFromGroup(@Path("scope") String scope, @Path("code") String code, @Path("subgroupScope") String subgroupScope, @Path("subgroupCode") String subgroupCode);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePortfolioGroup" })
        @PUT("v1/api/groups/portfolios/{scope}/{code}/update")
        Observable<Response<ResponseBody>> updatePortfolioGroup(@Path("scope") String scope, @Path("code") String code, @Body UpdateGroupRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfolioGroupsSearch" })
        @POST("v1/api/groups/search")
        Observable<Response<ResponseBody>> portfolioGroupsSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getHealth" })
        @GET("v1/api/health")
        Observable<Response<ResponseBody>> getHealth();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getLoginInfo" })
        @GET("v1/api/login")
        Observable<Response<ResponseBody>> getLoginInfo();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getSamlIdentityProviderId" })
        @GET("v1/api/login/saml/{domain}")
        Observable<Response<ResponseBody>> getSamlIdentityProviderId(@Path("domain") String domain);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI storeWebLogs" })
        @POST("v1/api/logs/lusidweb")
        Observable<Response<ResponseBody>> storeWebLogs(@Body WebLogMessage message);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getBuildVersion" })
        @GET("v1/api/metadata/buildversion")
        Observable<Response<ResponseBody>> getBuildVersion();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI verifyConnectivity" })
        @GET("v1/api/metadata/verifyconnectivity")
        Observable<Response<ResponseBody>> verifyConnectivity();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getVersion" })
        @GET("v1/api/metadata/version")
        Observable<Response<ResponseBody>> getVersion();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPersonalisations" })
        @GET("v1/api/personalisations")
        Observable<Response<ResponseBody>> getPersonalisations(@Query("pattern") String pattern, @Query("scope") String scope, @Query("recursive") boolean recursive, @Query("wildcards") boolean wildcards, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPersonalisations" })
        @POST("v1/api/personalisations")
        Observable<Response<ResponseBody>> upsertPersonalisations(@Body List<PersonalisationDto> personalisations);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePersonalisation" })
        @HTTP(path = "v1/api/personalisations", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePersonalisation(@Query("key") String key, @Query("scope") String scope, @Query("group") String group);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolioScopes" })
        @GET("v1/api/portfolios")
        Observable<Response<ResponseBody>> listPortfolioScopes(@Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolios" })
        @GET("v1/api/portfolios/{scope}")
        Observable<Response<ResponseBody>> listPortfolios(@Path("scope") String scope, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPortfolio" })
        @POST("v1/api/portfolios/{scope}")
        Observable<Response<ResponseBody>> createPortfolio(@Path("scope") String scope, @Body CreatePortfolioRequest createRequest);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolio" })
        @GET("v1/api/portfolios/{scope}/{code}")
        Observable<Response<ResponseBody>> getPortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("propertyFilter") String propertyFilter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePortfolio" })
        @PUT("v1/api/portfolios/{scope}/{code}")
        Observable<Response<ResponseBody>> updatePortfolio(@Path("scope") String scope, @Path("code") String code, @Body UpdatePortfolioRequest request, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolio" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getCommands" })
        @GET("v1/api/portfolios/{scope}/{code}/commands")
        Observable<Response<ResponseBody>> getCommands(@Path("scope") String scope, @Path("code") String code, @Query("fromAsAt") DateTime fromAsAt, @Query("toAsAt") DateTime toAsAt, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getDetails" })
        @GET("v1/api/portfolios/{scope}/{code}/details")
        Observable<Response<ResponseBody>> getDetails(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("propertyFilter") String propertyFilter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioDetails" })
        @POST("v1/api/portfolios/{scope}/{code}/details")
        Observable<Response<ResponseBody>> upsertPortfolioDetails(@Path("scope") String scope, @Path("code") String code, @Body PortfolioDetailsRequest details, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioDetails" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/details", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioDetails(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregateHoldings" })
        @GET("v1/api/portfolios/{scope}/{code}/holdings")
        Observable<Response<ResponseBody>> getAggregateHoldings(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter, @Query("securityPropertyKeys") String securityPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI adjustAllHoldings" })
        @PUT("v1/api/portfolios/{scope}/{code}/holdings/{effectiveAt}")
        Observable<Response<ResponseBody>> adjustAllHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<AdjustHoldingRequest> holdingAdjustments);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI adjustHoldings" })
        @PATCH("v1/api/portfolios/{scope}/{code}/holdings/{effectiveAt}")
        Observable<Response<ResponseBody>> adjustHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<AdjustHoldingRequest> holdingAdjustments);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getProperties" })
        @GET("v1/api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> getProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioProperties" })
        @POST("v1/api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> upsertPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Body List<CreatePropertyRequest> properties, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperty" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperty(@Path("scope") String scope, @Path("code") String code, @Query("property") String property, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperties" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/properties/all", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getTrades" })
        @GET("v1/api/portfolios/{scope}/{code}/trades")
        Observable<Response<ResponseBody>> getTrades(@Path("scope") String scope, @Path("code") String code, @Query("fromTradeDate") DateTime fromTradeDate, @Query("toTradeDate") DateTime toTradeDate, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("securityPropertyKeys") String securityPropertyKeys, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertTrades" })
        @POST("v1/api/portfolios/{scope}/{code}/trades")
        Observable<Response<ResponseBody>> upsertTrades(@Path("scope") String scope, @Path("code") String code, @Body List<UpsertPortfolioTradeRequest> trades);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteTrades" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/trades", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteTrades(@Path("scope") String scope, @Path("code") String code, @Query("id") String id);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTradeProperty" })
        @POST("v1/api/portfolios/{scope}/{code}/trades/{tradeId}/properties")
        Observable<Response<ResponseBody>> addTradeProperty(@Path("scope") String scope, @Path("code") String code, @Path("tradeId") String tradeId, @Body List<CreatePerpetualPropertyRequest> properties);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyFromTrade" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/trades/{tradeId}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyFromTrade(@Path("scope") String scope, @Path("code") String code, @Path("tradeId") String tradeId, @Query("property") String property);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createDerivedPortfolio" })
        @POST("v1/api/portfolios/{scope}/derived")
        Observable<Response<ResponseBody>> createDerivedPortfolio(@Path("scope") String scope, @Body CreateDerivedPortfolioRequest portfolio);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfoliosSearch" })
        @POST("v1/api/portfolios/search")
        Observable<Response<ResponseBody>> portfoliosSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI propertiesSearch" })
        @POST("v1/api/properties/search")
        Observable<Response<ResponseBody>> propertiesSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinitionDomains" })
        @GET("v1/api/propertydefinitions")
        Observable<Response<ResponseBody>> getPropertyDefinitionDomains(@Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPropertyDefinition" })
        @POST("v1/api/propertydefinitions")
        Observable<Response<ResponseBody>> createPropertyDefinition(@Body CreatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getMultiplePropertyDefinitions" })
        @GET("v1/api/propertydefinitions/_keys")
        Observable<Response<ResponseBody>> getMultiplePropertyDefinitions(@Query("keys") String keys, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAllPropertyKeysInDomain" })
        @GET("v1/api/propertydefinitions/{domain}")
        Observable<Response<ResponseBody>> getAllPropertyKeysInDomain(@Path("domain") String domain, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinitionScopesInDomain" })
        @GET("v1/api/propertydefinitions/{domain}/_scopes")
        Observable<Response<ResponseBody>> getPropertyDefinitionScopesInDomain(@Path("domain") String domain, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAllPropertyKeysInScope" })
        @GET("v1/api/propertydefinitions/{domain}/{scope}")
        Observable<Response<ResponseBody>> getAllPropertyKeysInScope(@Path("domain") String domain, @Path("scope") String scope, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinition" })
        @GET("v1/api/propertydefinitions/{domain}/{scope}/{name}")
        Observable<Response<ResponseBody>> getPropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePropertyDefinition" })
        @PUT("v1/api/propertydefinitions/{domain}/{scope}/{name}")
        Observable<Response<ResponseBody>> updatePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name, @Body UpdatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyDefinition" })
        @HTTP(path = "v1/api/propertydefinitions/{domain}/{scope}/{name}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPropertyDataFormat" })
        @POST("v1/api/propertyformats")
        Observable<Response<ResponseBody>> createPropertyDataFormat(@Body CreatePropertyDataFormatRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPropertyDataFormats" })
        @GET("v1/api/propertyformats/{scope}")
        Observable<Response<ResponseBody>> listPropertyDataFormats(@Path("scope") String scope, @Query("includeDefault") Boolean includeDefault, @Query("includeSystem") Boolean includeSystem, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDataFormat" })
        @GET("v1/api/propertyformats/{scope}/{name}")
        Observable<Response<ResponseBody>> getPropertyDataFormat(@Path("scope") String scope, @Path("name") String name);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePropertyDataFormat" })
        @PUT("v1/api/propertyformats/{scope}/{name}")
        Observable<Response<ResponseBody>> updatePropertyDataFormat(@Path("scope") String scope, @Path("name") String name, @Body UpdatePropertyDataFormatRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getUnitsFromPropertyDataFormat" })
        @GET("v1/api/propertyformats/{scope}/{name}/units/{units}")
        Observable<Response<ResponseBody>> getUnitsFromPropertyDataFormat(@Path("scope") String scope, @Path("name") String name, @Path("units") String units);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI performReconciliation" })
        @POST("v1/api/recon")
        Observable<Response<ResponseBody>> performReconciliation(@Body ReconciliationRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listReferencePortfolios" })
        @GET("v1/api/reference/{scope}")
        Observable<Response<ResponseBody>> listReferencePortfolios(@Path("scope") String scope, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createReferencePortfolio" })
        @POST("v1/api/reference/{scope}")
        Observable<Response<ResponseBody>> createReferencePortfolio(@Path("scope") String scope, @Body CreatePortfolioRequest referencePortfolio);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getReferencePortfolio" })
        @GET("v1/api/reference/{scope}/{code}")
        Observable<Response<ResponseBody>> getReferencePortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteReferencePortfolio" })
        @HTTP(path = "v1/api/reference/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteReferencePortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getReferencePortfolioConstituents" })
        @GET("v1/api/reference/{scope}/{code}/{effectiveAt}/constituents")
        Observable<Response<ResponseBody>> getReferencePortfolioConstituents(@Path("scope") String scope, @Path("effectiveAt") DateTime effectiveAt, @Path("code") String code, @Query("referencePortfolioId") String referencePortfolioId, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertReferencePortfolioConstituents" })
        @POST("v1/api/reference/{scope}/{code}/{effectiveAt}/constituents")
        Observable<Response<ResponseBody>> upsertReferencePortfolioConstituents(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<ReferencePortfolioConstituentDto> constituents);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getResults" })
        @GET("v1/api/results/{scope}/{key}/{date}")
        Observable<Response<ResponseBody>> getResults(@Path("scope") String scope, @Path("key") String key, @Path("date") DateTime dateParameter, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertResults" })
        @POST("v1/api/results/{scope}/{key}/{date}")
        Observable<Response<ResponseBody>> upsertResults(@Path("scope") String scope, @Path("key") String key, @Path("date") DateTime dateParameter, @Body CreateResultsRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getEntitySchema" })
        @GET("v1/api/schema/entities/{entity}")
        Observable<Response<ResponseBody>> getEntitySchema(@Path("entity") String entity);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertySchema" })
        @GET("v1/api/schema/properties")
        Observable<Response<ResponseBody>> getPropertySchema(@Query("propertyKeys") String propertyKeys, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getValueTypes" })
        @GET("v1/api/schema/types")
        Observable<Response<ResponseBody>> getValueTypes(@Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchAddClientSecurities" })
        @POST("v1/api/securities")
        Observable<Response<ResponseBody>> batchAddClientSecurities(@Body List<CreateClientSecurityRequest> definitions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchDeleteClientSecurities" })
        @HTTP(path = "v1/api/securities", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> batchDeleteClientSecurities(@Query("uids") String uids);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getSecurity" })
        @GET("v1/api/securities/{uid}")
        Observable<Response<ResponseBody>> getSecurity(@Path("uid") String uid, @Query("asAt") DateTime asAt, @Query("propertyKeys") String propertyKeys);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI lookupSecuritiesFromCodes" })
        @GET("v1/api/securities/lookup/{codeType}")
        Observable<Response<ResponseBody>> lookupSecuritiesFromCodes(@Path("codeType") String codeType, @Query("codes") String codes, @Query("asAt") DateTime asAt, @Query("propertyKeys") String propertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI lookupSecuritiesFromCodesBulk" })
        @POST("v1/api/securities/lookup/{codeType}")
        Observable<Response<ResponseBody>> lookupSecuritiesFromCodesBulk(@Path("codeType") String codeType, @Body List<String> codes, @Query("asAt") DateTime asAt, @Query("propertyKeys") String propertyKeys);

    }

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClearEntityCachesDto object if successful.
     */
    public ClearEntityCachesDto clearEntityCaches() {
        return clearEntityCachesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClearEntityCachesDto> clearEntityCachesAsync(final ServiceCallback<ClearEntityCachesDto> serviceCallback) {
        return ServiceFuture.fromResponse(clearEntityCachesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClearEntityCachesDto object
     */
    public Observable<ClearEntityCachesDto> clearEntityCachesAsync() {
        return clearEntityCachesWithServiceResponseAsync().map(new Func1<ServiceResponse<ClearEntityCachesDto>, ClearEntityCachesDto>() {
            @Override
            public ClearEntityCachesDto call(ServiceResponse<ClearEntityCachesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClearEntityCachesDto object
     */
    public Observable<ServiceResponse<ClearEntityCachesDto>> clearEntityCachesWithServiceResponseAsync() {
        return service.clearEntityCaches()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClearEntityCachesDto>>>() {
                @Override
                public Observable<ServiceResponse<ClearEntityCachesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClearEntityCachesDto> clientResponse = clearEntityCachesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClearEntityCachesDto> clearEntityCachesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ClearEntityCachesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ClearEntityCachesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String groupCode) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode).toBlocking().single().body();
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, groupCode), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String groupCode, AggregationRequest request) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).toBlocking().single().body();
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, groupCode, request), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ListAggregationResponse> getAggregationByGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ListAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String groupCode) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode).toBlocking().single().body();
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode), serviceCallback);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String groupCode, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).toBlocking().single().body();
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode, request), serviceCallback);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NestedAggregationResponse> getNestedAggregationByGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<NestedAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByPortfolio(String scope, String portfolioCode) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ListAggregationResponse> getAggregationByPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ListAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByPortfolio(String scope, String portfolioCode) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).toBlocking().single().body();
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode), serviceCallback);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).toBlocking().single().body();
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request), serviceCallback);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NestedAggregationResponse> getNestedAggregationByPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<NestedAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey), serviceCallback);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByResultSet(scope, resultsKey, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request), serviceCallback);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
            @Override
            public ListAggregationResponse call(ServiceResponse<ListAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByResultSet(scope, resultsKey, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<ListAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListAggregationResponse> clientResponse = getAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ListAggregationResponse> getAggregationByResultSetDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ListAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByResultSet(String scope, String resultsKey) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey), serviceCallback);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByResultSet(scope, resultsKey, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByResultSet(String scope, String resultsKey, AggregationRequest request) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request), serviceCallback);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByResultSet(scope, resultsKey, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NestedAggregationResponse>>>() {
                @Override
                public Observable<ServiceResponse<NestedAggregationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NestedAggregationResponse> clientResponse = getNestedAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NestedAggregationResponse> getNestedAggregationByResultSetDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<NestedAggregationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListAnalyticStoreKeyDto object if successful.
     */
    public ResourceListAnalyticStoreKeyDto listAnalyticStores() {
        return listAnalyticStoresWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListAnalyticStoreKeyDto> listAnalyticStoresAsync(final ServiceCallback<ResourceListAnalyticStoreKeyDto> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListAnalyticStoreKeyDto object
     */
    public Observable<ResourceListAnalyticStoreKeyDto> listAnalyticStoresAsync() {
        return listAnalyticStoresWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListAnalyticStoreKeyDto>, ResourceListAnalyticStoreKeyDto>() {
            @Override
            public ResourceListAnalyticStoreKeyDto call(ServiceResponse<ResourceListAnalyticStoreKeyDto> response) {
                return response.body();
            }
        });
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListAnalyticStoreKeyDto object
     */
    public Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>> listAnalyticStoresWithServiceResponseAsync() {
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListAnalyticStoreKeyDto> clientResponse = listAnalyticStoresDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListAnalyticStoreKeyDto object if successful.
     */
    public ResourceListAnalyticStoreKeyDto listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListAnalyticStoreKeyDto> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListAnalyticStoreKeyDto> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListAnalyticStoreKeyDto object
     */
    public Observable<ResourceListAnalyticStoreKeyDto> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListAnalyticStoreKeyDto>, ResourceListAnalyticStoreKeyDto>() {
            @Override
            public ResourceListAnalyticStoreKeyDto call(ServiceResponse<ResourceListAnalyticStoreKeyDto> response) {
                return response.body();
            }
        });
    }

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListAnalyticStoreKeyDto object
     */
    public Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListAnalyticStoreKeyDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListAnalyticStoreKeyDto> clientResponse = listAnalyticStoresDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListAnalyticStoreKeyDto> listAnalyticStoresDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListAnalyticStoreKeyDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListAnalyticStoreKeyDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto createAnalyticStore() {
        return createAnalyticStoreWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> createAnalyticStoreAsync(final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> createAnalyticStoreAsync() {
        return createAnalyticStoreWithServiceResponseAsync().map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> createAnalyticStoreWithServiceResponseAsync() {
        final CreateAnalyticStoreRequest request = null;
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = createAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto createAnalyticStore(CreateAnalyticStoreRequest request) {
        return createAnalyticStoreWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> createAnalyticStoreAsync(CreateAnalyticStoreRequest request) {
        return createAnalyticStoreWithServiceResponseAsync(request).map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request) {
        Validator.validate(request);
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = createAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStoreDto> createAnalyticStoreDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<AnalyticStoreDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AnalyticStoreDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto getAnalyticStore(String scope, int year, int month, int day) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day).toBlocking().single().body();
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(getAnalyticStoreWithServiceResponseAsync(scope, year, month, day), serviceCallback);
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = getAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt AsAt date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto getAnalyticStore(String scope, int year, int month, int day, DateTime asAt) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt).toBlocking().single().body();
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt AsAt date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt), serviceCallback);
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt AsAt date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt).map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an analytic store.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt AsAt date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = getAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStoreDto> getAnalyticStoreDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AnalyticStoreDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStoreDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteAnalyticStore(String scope, int year, int month, int day) {
        return deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day).toBlocking().single().body();
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day) {
        return deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.deleteAnalyticStore(scope, year, month, day)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deleteAnalyticStoreDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto insertAnalytics(String scope, int year, int month, int day) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day).toBlocking().single().body();
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(insertAnalyticsWithServiceResponseAsync(scope, year, month, day), serviceCallback);
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<SecurityAnalyticDataDto> data = null;
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = insertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;SecurityAnalyticDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    public AnalyticStoreDto insertAnalytics(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data).toBlocking().single().body();
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;SecurityAnalyticDataDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data, final ServiceCallback<AnalyticStoreDto> serviceCallback) {
        return ServiceFuture.fromResponse(insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data), serviceCallback);
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;SecurityAnalyticDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data).map(new Func1<ServiceResponse<AnalyticStoreDto>, AnalyticStoreDto>() {
            @Override
            public AnalyticStoreDto call(ServiceResponse<AnalyticStoreDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;SecurityAnalyticDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    public Observable<ServiceResponse<AnalyticStoreDto>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(data);
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStoreDto>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStoreDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStoreDto> clientResponse = insertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStoreDto> insertAnalyticsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AnalyticStoreDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStoreDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertAnalytics(String scope) {
        return upsertAnalyticsWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertAnalyticsAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertAnalyticsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertAnalyticsAsync(String scope) {
        return upsertAnalyticsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertAnalyticsWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final AnalyticsStorageRequest request = null;
        return service.upsertAnalytics(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertAnalytics(String scope, AnalyticsStorageRequest request) {
        return upsertAnalyticsWithServiceResponseAsync(scope, request).toBlocking().single().body();
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertAnalyticsAsync(String scope, AnalyticsStorageRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertAnalyticsWithServiceResponseAsync(scope, request), serviceCallback);
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertAnalyticsAsync(String scope, AnalyticsStorageRequest request) {
        return upsertAnalyticsWithServiceResponseAsync(scope, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertAnalyticsWithServiceResponseAsync(String scope, AnalyticsStorageRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(request);
        return service.upsertAnalytics(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertAnalyticsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClassificationsDto object if successful.
     */
    public ClassificationsDto upsertClassification() {
        return upsertClassificationWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Update classification data.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClassificationsDto> upsertClassificationAsync(final ServiceCallback<ClassificationsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertClassificationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    public Observable<ClassificationsDto> upsertClassificationAsync() {
        return upsertClassificationWithServiceResponseAsync().map(new Func1<ServiceResponse<ClassificationsDto>, ClassificationsDto>() {
            @Override
            public ClassificationsDto call(ServiceResponse<ClassificationsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    public Observable<ServiceResponse<ClassificationsDto>> upsertClassificationWithServiceResponseAsync() {
        final List<SecurityClassificationDto> classifications = null;
        return service.upsertClassification(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClassificationsDto>>>() {
                @Override
                public Observable<ServiceResponse<ClassificationsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClassificationsDto> clientResponse = upsertClassificationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClassificationsDto object if successful.
     */
    public ClassificationsDto upsertClassification(List<SecurityClassificationDto> classifications) {
        return upsertClassificationWithServiceResponseAsync(classifications).toBlocking().single().body();
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClassificationsDto> upsertClassificationAsync(List<SecurityClassificationDto> classifications, final ServiceCallback<ClassificationsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertClassificationWithServiceResponseAsync(classifications), serviceCallback);
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    public Observable<ClassificationsDto> upsertClassificationAsync(List<SecurityClassificationDto> classifications) {
        return upsertClassificationWithServiceResponseAsync(classifications).map(new Func1<ServiceResponse<ClassificationsDto>, ClassificationsDto>() {
            @Override
            public ClassificationsDto call(ServiceResponse<ClassificationsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    public Observable<ServiceResponse<ClassificationsDto>> upsertClassificationWithServiceResponseAsync(List<SecurityClassificationDto> classifications) {
        Validator.validate(classifications);
        return service.upsertClassification(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClassificationsDto>>>() {
                @Override
                public Observable<ServiceResponse<ClassificationsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClassificationsDto> clientResponse = upsertClassificationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClassificationsDto> upsertClassificationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ClassificationsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<ClassificationsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TxnMetaDataDto object if successful.
     */
    public TxnMetaDataDto addConfigurationTransactionType() {
        return addConfigurationTransactionTypeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TxnMetaDataDto> addConfigurationTransactionTypeAsync(final ServiceCallback<TxnMetaDataDto> serviceCallback) {
        return ServiceFuture.fromResponse(addConfigurationTransactionTypeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    public Observable<TxnMetaDataDto> addConfigurationTransactionTypeAsync() {
        return addConfigurationTransactionTypeWithServiceResponseAsync().map(new Func1<ServiceResponse<TxnMetaDataDto>, TxnMetaDataDto>() {
            @Override
            public TxnMetaDataDto call(ServiceResponse<TxnMetaDataDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    public Observable<ServiceResponse<TxnMetaDataDto>> addConfigurationTransactionTypeWithServiceResponseAsync() {
        final TxnMetaDataDto type = null;
        return service.addConfigurationTransactionType(type)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TxnMetaDataDto>>>() {
                @Override
                public Observable<ServiceResponse<TxnMetaDataDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TxnMetaDataDto> clientResponse = addConfigurationTransactionTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TxnMetaDataDto object if successful.
     */
    public TxnMetaDataDto addConfigurationTransactionType(TxnMetaDataDto type) {
        return addConfigurationTransactionTypeWithServiceResponseAsync(type).toBlocking().single().body();
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TxnMetaDataDto> addConfigurationTransactionTypeAsync(TxnMetaDataDto type, final ServiceCallback<TxnMetaDataDto> serviceCallback) {
        return ServiceFuture.fromResponse(addConfigurationTransactionTypeWithServiceResponseAsync(type), serviceCallback);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    public Observable<TxnMetaDataDto> addConfigurationTransactionTypeAsync(TxnMetaDataDto type) {
        return addConfigurationTransactionTypeWithServiceResponseAsync(type).map(new Func1<ServiceResponse<TxnMetaDataDto>, TxnMetaDataDto>() {
            @Override
            public TxnMetaDataDto call(ServiceResponse<TxnMetaDataDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    public Observable<ServiceResponse<TxnMetaDataDto>> addConfigurationTransactionTypeWithServiceResponseAsync(TxnMetaDataDto type) {
        Validator.validate(type);
        return service.addConfigurationTransactionType(type)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TxnMetaDataDto>>>() {
                @Override
                public Observable<ServiceResponse<TxnMetaDataDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TxnMetaDataDto> clientResponse = addConfigurationTransactionTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TxnMetaDataDto> addConfigurationTransactionTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<TxnMetaDataDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TxnMetaDataDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListTxnMetaDataDto object if successful.
     */
    public ResourceListTxnMetaDataDto getConfigurationTransactionTypes() {
        return getConfigurationTransactionTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListTxnMetaDataDto> getConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListTxnMetaDataDto> serviceCallback) {
        return ServiceFuture.fromResponse(getConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ResourceListTxnMetaDataDto> getConfigurationTransactionTypesAsync() {
        return getConfigurationTransactionTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListTxnMetaDataDto>, ResourceListTxnMetaDataDto>() {
            @Override
            public ResourceListTxnMetaDataDto call(ServiceResponse<ResourceListTxnMetaDataDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> getConfigurationTransactionTypesWithServiceResponseAsync() {
        return service.getConfigurationTransactionTypes()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListTxnMetaDataDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListTxnMetaDataDto> clientResponse = getConfigurationTransactionTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListTxnMetaDataDto> getConfigurationTransactionTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListTxnMetaDataDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListTxnMetaDataDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListTxnMetaDataDto object if successful.
     */
    public ResourceListTxnMetaDataDto uploadConfigurationTransactionTypes() {
        return uploadConfigurationTransactionTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListTxnMetaDataDto> serviceCallback) {
        return ServiceFuture.fromResponse(uploadConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ResourceListTxnMetaDataDto> uploadConfigurationTransactionTypesAsync() {
        return uploadConfigurationTransactionTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListTxnMetaDataDto>, ResourceListTxnMetaDataDto>() {
            @Override
            public ResourceListTxnMetaDataDto call(ServiceResponse<ResourceListTxnMetaDataDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> uploadConfigurationTransactionTypesWithServiceResponseAsync() {
        final List<TxnMetaDataDto> types = null;
        return service.uploadConfigurationTransactionTypes(types)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListTxnMetaDataDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListTxnMetaDataDto> clientResponse = uploadConfigurationTransactionTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListTxnMetaDataDto object if successful.
     */
    public ResourceListTxnMetaDataDto uploadConfigurationTransactionTypes(List<TxnMetaDataDto> types) {
        return uploadConfigurationTransactionTypesWithServiceResponseAsync(types).toBlocking().single().body();
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(List<TxnMetaDataDto> types, final ServiceCallback<ResourceListTxnMetaDataDto> serviceCallback) {
        return ServiceFuture.fromResponse(uploadConfigurationTransactionTypesWithServiceResponseAsync(types), serviceCallback);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ResourceListTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(List<TxnMetaDataDto> types) {
        return uploadConfigurationTransactionTypesWithServiceResponseAsync(types).map(new Func1<ServiceResponse<ResourceListTxnMetaDataDto>, ResourceListTxnMetaDataDto>() {
            @Override
            public ResourceListTxnMetaDataDto call(ServiceResponse<ResourceListTxnMetaDataDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListTxnMetaDataDto object
     */
    public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> uploadConfigurationTransactionTypesWithServiceResponseAsync(List<TxnMetaDataDto> types) {
        Validator.validate(types);
        return service.uploadConfigurationTransactionTypes(types)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListTxnMetaDataDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListTxnMetaDataDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListTxnMetaDataDto> clientResponse = uploadConfigurationTransactionTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListTxnMetaDataDto> uploadConfigurationTransactionTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListTxnMetaDataDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<ResourceListTxnMetaDataDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CorporateActionEventDto&gt; object if successful.
     */
    public List<CorporateActionEventDto> listCorporateActions(String scope, String corporateActionSourceCode) {
        return listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, final ServiceCallback<List<CorporateActionEventDto>> serviceCallback) {
        return ServiceFuture.fromResponse(listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    public Observable<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode) {
        return listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode).map(new Func1<ServiceResponse<List<CorporateActionEventDto>>, List<CorporateActionEventDto>>() {
            @Override
            public List<CorporateActionEventDto> call(ServiceResponse<List<CorporateActionEventDto>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    public Observable<ServiceResponse<List<CorporateActionEventDto>>> listCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (corporateActionSourceCode == null) {
            throw new IllegalArgumentException("Parameter corporateActionSourceCode is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        return service.listCorporateActions(scope, corporateActionSourceCode, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<CorporateActionEventDto>>>>() {
                @Override
                public Observable<ServiceResponse<List<CorporateActionEventDto>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<CorporateActionEventDto>> clientResponse = listCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CorporateActionEventDto&gt; object if successful.
     */
    public List<CorporateActionEventDto> listCorporateActions(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt) {
        return listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, effectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt, final ServiceCallback<List<CorporateActionEventDto>> serviceCallback) {
        return ServiceFuture.fromResponse(listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    public Observable<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt) {
        return listCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, effectiveAt, asAt).map(new Func1<ServiceResponse<List<CorporateActionEventDto>>, List<CorporateActionEventDto>>() {
            @Override
            public List<CorporateActionEventDto> call(ServiceResponse<List<CorporateActionEventDto>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    public Observable<ServiceResponse<List<CorporateActionEventDto>>> listCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (corporateActionSourceCode == null) {
            throw new IllegalArgumentException("Parameter corporateActionSourceCode is required and cannot be null.");
        }
        return service.listCorporateActions(scope, corporateActionSourceCode, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<CorporateActionEventDto>>>>() {
                @Override
                public Observable<ServiceResponse<List<CorporateActionEventDto>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<CorporateActionEventDto>> clientResponse = listCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<CorporateActionEventDto>> listCorporateActionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<List<CorporateActionEventDto>, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<List<CorporateActionEventDto>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryUpsertCorporateActionsDto object if successful.
     */
    public TryUpsertCorporateActionsDto batchUpsertCorporateActions(String scope, String corporateActionSourceCode) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode).toBlocking().single().body();
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, final ServiceCallback<TryUpsertCorporateActionsDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode), serviceCallback);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    public Observable<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode).map(new Func1<ServiceResponse<TryUpsertCorporateActionsDto>, TryUpsertCorporateActionsDto>() {
            @Override
            public TryUpsertCorporateActionsDto call(ServiceResponse<TryUpsertCorporateActionsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    public Observable<ServiceResponse<TryUpsertCorporateActionsDto>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (corporateActionSourceCode == null) {
            throw new IllegalArgumentException("Parameter corporateActionSourceCode is required and cannot be null.");
        }
        final List<UpsertCorporateActionRequest> actions = null;
        return service.batchUpsertCorporateActions(scope, corporateActionSourceCode, actions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryUpsertCorporateActionsDto>>>() {
                @Override
                public Observable<ServiceResponse<TryUpsertCorporateActionsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryUpsertCorporateActionsDto> clientResponse = batchUpsertCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryUpsertCorporateActionsDto object if successful.
     */
    public TryUpsertCorporateActionsDto batchUpsertCorporateActions(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, actions).toBlocking().single().body();
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions, final ServiceCallback<TryUpsertCorporateActionsDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, actions), serviceCallback);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    public Observable<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, corporateActionSourceCode, actions).map(new Func1<ServiceResponse<TryUpsertCorporateActionsDto>, TryUpsertCorporateActionsDto>() {
            @Override
            public TryUpsertCorporateActionsDto call(ServiceResponse<TryUpsertCorporateActionsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    public Observable<ServiceResponse<TryUpsertCorporateActionsDto>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (corporateActionSourceCode == null) {
            throw new IllegalArgumentException("Parameter corporateActionSourceCode is required and cannot be null.");
        }
        Validator.validate(actions);
        return service.batchUpsertCorporateActions(scope, corporateActionSourceCode, actions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryUpsertCorporateActionsDto>>>() {
                @Override
                public Observable<ServiceResponse<TryUpsertCorporateActionsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryUpsertCorporateActionsDto> clientResponse = batchUpsertCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<TryUpsertCorporateActionsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TryUpsertCorporateActionsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getDownloadUrl() {
        return getDownloadUrlWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getDownloadUrlAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getDownloadUrlWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getDownloadUrlAsync() {
        return getDownloadUrlWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getDownloadUrlWithServiceResponseAsync() {
        final String version = null;
        return service.getDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getDownloadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getDownloadUrl(String version) {
        return getDownloadUrlWithServiceResponseAsync(version).toBlocking().single().body();
    }

    /**
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getDownloadUrlWithServiceResponseAsync(version), serviceCallback);
    }

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getDownloadUrlAsync(String version) {
        return getDownloadUrlWithServiceResponseAsync(version).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getDownloadUrlWithServiceResponseAsync(String version) {
        return service.getDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getDownloadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getDownloadUrlDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getLatestVersion() {
        return getLatestVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getLatestVersionAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getLatestVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getLatestVersionAsync() {
        return getLatestVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getLatestVersionWithServiceResponseAsync() {
        return service.getLatestVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getLatestVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getLatestVersionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListGroupDto object if successful.
     */
    public ResourceListGroupDto listPortfolioGroups(String scope) {
        return listPortfolioGroupsWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListGroupDto> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ResourceListGroupDto> listPortfolioGroupsAsync(String scope) {
        return listPortfolioGroupsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListGroupDto>, ResourceListGroupDto>() {
            @Override
            public ResourceListGroupDto call(ServiceResponse<ResourceListGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ServiceResponse<ResourceListGroupDto>> listPortfolioGroupsWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioGroups(scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListGroupDto> clientResponse = listPortfolioGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListGroupDto object if successful.
     */
    public ResourceListGroupDto listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListGroupDto> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ResourceListGroupDto> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListGroupDto>, ResourceListGroupDto>() {
            @Override
            public ResourceListGroupDto call(ServiceResponse<ResourceListGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ServiceResponse<ResourceListGroupDto>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioGroups(scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListGroupDto> clientResponse = listPortfolioGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListGroupDto> listPortfolioGroupsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListGroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListGroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto createPortfolioGroup(String scope) {
        return createPortfolioGroupWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> createPortfolioGroupAsync(String scope, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> createPortfolioGroupAsync(String scope) {
        return createPortfolioGroupWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> createPortfolioGroupWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateGroupRequest request = null;
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = createPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto createPortfolioGroup(String scope, CreateGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).toBlocking().single().body();
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> createPortfolioGroupAsync(String scope, CreateGroupRequest request, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope, request), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> createPortfolioGroupAsync(String scope, CreateGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> createPortfolioGroupWithServiceResponseAsync(String scope, CreateGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(request);
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = createPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> createPortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto getPortfolioGroup(String scope, String code) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> getPortfolioGroupAsync(String scope, String code) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> getPortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = getPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto getPortfolioGroup(String scope, String code, DateTime asAt) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code, asAt).toBlocking().single().body();
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code, asAt), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> getPortfolioGroupAsync(String scope, String code, DateTime asAt) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code, asAt).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = getPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> getPortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioGroup(String scope, String code) {
        return deletePortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code) {
        return deletePortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioGroup(scope, code)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListProcessedCommandDto object if successful.
     */
    public ResourceListProcessedCommandDto getPortfolioGroupCommands(String scope, String code) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListProcessedCommandDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ResourceListProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListProcessedCommandDto>, ResourceListProcessedCommandDto>() {
            @Override
            public ResourceListProcessedCommandDto call(ServiceResponse<ResourceListProcessedCommandDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ServiceResponse<ResourceListProcessedCommandDto>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromAsAt = null;
        final DateTime toAsAt = null;
        final String filter = null;
        return service.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListProcessedCommandDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListProcessedCommandDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListProcessedCommandDto> clientResponse = getPortfolioGroupCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListProcessedCommandDto object if successful.
     */
    public ResourceListProcessedCommandDto getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).toBlocking().single().body();
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListProcessedCommandDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter), serviceCallback);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ResourceListProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).map(new Func1<ServiceResponse<ResourceListProcessedCommandDto>, ResourceListProcessedCommandDto>() {
            @Override
            public ResourceListProcessedCommandDto call(ServiceResponse<ResourceListProcessedCommandDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ServiceResponse<ResourceListProcessedCommandDto>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListProcessedCommandDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListProcessedCommandDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListProcessedCommandDto> clientResponse = getPortfolioGroupCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListProcessedCommandDto> getPortfolioGroupCommandsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListProcessedCommandDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListProcessedCommandDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpandedGroupDto object if successful.
     */
    public ExpandedGroupDto getPortfolioGroupExpansion(String scope, String code) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    public Observable<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ExpandedGroupDto>, ExpandedGroupDto>() {
            @Override
            public ExpandedGroupDto call(ServiceResponse<ExpandedGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    public Observable<ServiceResponse<ExpandedGroupDto>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> propertyFilter = null;
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpandedGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ExpandedGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpandedGroupDto> clientResponse = getPortfolioGroupExpansionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpandedGroupDto object if successful.
     */
    public ExpandedGroupDto getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).toBlocking().single().body();
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter), serviceCallback);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    public Observable<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<ExpandedGroupDto>, ExpandedGroupDto>() {
            @Override
            public ExpandedGroupDto call(ServiceResponse<ExpandedGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    public Observable<ServiceResponse<ExpandedGroupDto>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpandedGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ExpandedGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpandedGroupDto> clientResponse = getPortfolioGroupExpansionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpandedGroupDto> getPortfolioGroupExpansionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ExpandedGroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ExpandedGroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto addPortfolioToGroup(String scope, String code) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> addPortfolioToGroupAsync(String scope, String code) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = addPortfolioToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto addPortfolioToGroup(String scope, String code, ResourceId identifier) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier).toBlocking().single().body();
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = addPortfolioToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> addPortfolioToGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Remove a portfolio that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode) {
        return deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode).toBlocking().single().body();
    }

    /**
     * Remove a portfolio that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode), serviceCallback);
    }

    /**
     * Remove a portfolio that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode) {
        return deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Remove a portfolio that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (portfolioScope == null) {
            throw new IllegalArgumentException("Parameter portfolioScope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        return service.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = deletePortfolioFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> deletePortfolioFromGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto addSubGroupToGroup(String scope, String code) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> addSubGroupToGroupAsync(String scope, String code) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = addSubGroupToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto addSubGroupToGroup(String scope, String code, ResourceId identifier) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier).toBlocking().single().body();
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = addSubGroupToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> addSubGroupToGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Remove a subgroup that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode) {
        return deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode).toBlocking().single().body();
    }

    /**
     * Remove a subgroup that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode), serviceCallback);
    }

    /**
     * Remove a subgroup that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode) {
        return deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Remove a subgroup that is currently present within an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (subgroupScope == null) {
            throw new IllegalArgumentException("Parameter subgroupScope is required and cannot be null.");
        }
        if (subgroupCode == null) {
            throw new IllegalArgumentException("Parameter subgroupCode is required and cannot be null.");
        }
        return service.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = deleteSubGroupFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> deleteSubGroupFromGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto updatePortfolioGroup(String scope, String code) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> updatePortfolioGroupAsync(String scope, String code) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdateGroupRequest request = null;
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = updatePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    public GroupDto updatePortfolioGroup(String scope, String code, UpdateGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GroupDto> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request, final ServiceCallback<GroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<GroupDto> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).map(new Func1<ServiceResponse<GroupDto>, GroupDto>() {
            @Override
            public GroupDto call(ServiceResponse<GroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    public Observable<ServiceResponse<GroupDto>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdateGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GroupDto>>>() {
                @Override
                public Observable<ServiceResponse<GroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GroupDto> clientResponse = updatePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GroupDto> updatePortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<GroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListGroupDto object if successful.
     */
    public ResourceListGroupDto portfolioGroupsSearch() {
        return portfolioGroupsSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListGroupDto> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(portfolioGroupsSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ResourceListGroupDto> portfolioGroupsSearchAsync() {
        return portfolioGroupsSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListGroupDto>, ResourceListGroupDto>() {
            @Override
            public ResourceListGroupDto call(ServiceResponse<ResourceListGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ServiceResponse<ResourceListGroupDto>> portfolioGroupsSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListGroupDto> clientResponse = portfolioGroupsSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListGroupDto object if successful.
     */
    public ResourceListGroupDto portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListGroupDto> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListGroupDto> serviceCallback) {
        return ServiceFuture.fromResponse(portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ResourceListGroupDto> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListGroupDto>, ResourceListGroupDto>() {
            @Override
            public ResourceListGroupDto call(ServiceResponse<ResourceListGroupDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListGroupDto object
     */
    public Observable<ServiceResponse<ResourceListGroupDto>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListGroupDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListGroupDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListGroupDto> clientResponse = portfolioGroupsSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListGroupDto> portfolioGroupsSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListGroupDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListGroupDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getHealth() {
        return getHealthWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getHealthAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getHealthWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getHealthAsync() {
        return getHealthWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getHealthWithServiceResponseAsync() {
        return service.getHealth()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getHealthDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getHealthDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginResponse object if successful.
     */
    public LoginResponse getLoginInfo() {
        return getLoginInfoWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the login information.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LoginResponse> getLoginInfoAsync(final ServiceCallback<LoginResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getLoginInfoWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginResponse object
     */
    public Observable<LoginResponse> getLoginInfoAsync() {
        return getLoginInfoWithServiceResponseAsync().map(new Func1<ServiceResponse<LoginResponse>, LoginResponse>() {
            @Override
            public LoginResponse call(ServiceResponse<LoginResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginResponse object
     */
    public Observable<ServiceResponse<LoginResponse>> getLoginInfoWithServiceResponseAsync() {
        return service.getLoginInfo()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoginResponse>>>() {
                @Override
                public Observable<ServiceResponse<LoginResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoginResponse> clientResponse = getLoginInfoDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LoginResponse> getLoginInfoDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<LoginResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<LoginResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getSamlIdentityProviderId(String domain) {
        return getSamlIdentityProviderIdWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getSamlIdentityProviderIdAsync(String domain, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getSamlIdentityProviderIdWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getSamlIdentityProviderIdAsync(String domain) {
        return getSamlIdentityProviderIdWithServiceResponseAsync(domain).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getSamlIdentityProviderIdWithServiceResponseAsync(String domain) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        return service.getSamlIdentityProviderId(domain)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getSamlIdentityProviderIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getSamlIdentityProviderIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String storeWebLogs() {
        return storeWebLogsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Store a log message.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> storeWebLogsAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(storeWebLogsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> storeWebLogsAsync() {
        return storeWebLogsWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> storeWebLogsWithServiceResponseAsync() {
        final WebLogMessage message = null;
        return service.storeWebLogs(message)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = storeWebLogsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String storeWebLogs(WebLogMessage message) {
        return storeWebLogsWithServiceResponseAsync(message).toBlocking().single().body();
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> storeWebLogsAsync(WebLogMessage message, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(storeWebLogsWithServiceResponseAsync(message), serviceCallback);
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> storeWebLogsAsync(WebLogMessage message) {
        return storeWebLogsWithServiceResponseAsync(message).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> storeWebLogsWithServiceResponseAsync(WebLogMessage message) {
        Validator.validate(message);
        return service.storeWebLogs(message)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = storeWebLogsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> storeWebLogsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(204, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getBuildVersion() {
        return getBuildVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getBuildVersionAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getBuildVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getBuildVersionAsync() {
        return getBuildVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getBuildVersionWithServiceResponseAsync() {
        return service.getBuildVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getBuildVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getBuildVersionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String verifyConnectivity() {
        return verifyConnectivityWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> verifyConnectivityAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(verifyConnectivityWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> verifyConnectivityAsync() {
        return verifyConnectivityWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> verifyConnectivityWithServiceResponseAsync() {
        return service.verifyConnectivity()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = verifyConnectivityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> verifyConnectivityDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getVersion() {
        return getVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getVersionAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getVersionAsync() {
        return getVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getVersionWithServiceResponseAsync() {
        return service.getVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getVersionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPersonalisationDto object if successful.
     */
    public ResourceListPersonalisationDto getPersonalisations(boolean recursive, boolean wildcards) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards).toBlocking().single().body();
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPersonalisationDto> getPersonalisationsAsync(boolean recursive, boolean wildcards, final ServiceCallback<ResourceListPersonalisationDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(recursive, wildcards), serviceCallback);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPersonalisationDto object
     */
    public Observable<ResourceListPersonalisationDto> getPersonalisationsAsync(boolean recursive, boolean wildcards) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards).map(new Func1<ServiceResponse<ResourceListPersonalisationDto>, ResourceListPersonalisationDto>() {
            @Override
            public ResourceListPersonalisationDto call(ServiceResponse<ResourceListPersonalisationDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPersonalisationDto object
     */
    public Observable<ServiceResponse<ResourceListPersonalisationDto>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards) {
        final String pattern = null;
        final String scope = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPersonalisationDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPersonalisationDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPersonalisationDto> clientResponse = getPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPersonalisationDto object if successful.
     */
    public ResourceListPersonalisationDto getPersonalisations(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards, pattern, scope, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPersonalisationDto> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListPersonalisationDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(recursive, wildcards, pattern, scope, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPersonalisationDto object
     */
    public Observable<ResourceListPersonalisationDto> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards, pattern, scope, sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListPersonalisationDto>, ResourceListPersonalisationDto>() {
            @Override
            public ResourceListPersonalisationDto call(ServiceResponse<ResourceListPersonalisationDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPersonalisationDto object
     */
    public Observable<ServiceResponse<ResourceListPersonalisationDto>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPersonalisationDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPersonalisationDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPersonalisationDto> clientResponse = getPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPersonalisationDto> getPersonalisationsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListPersonalisationDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPersonalisationDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationsResponse object if successful.
     */
    public UpsertPersonalisationsResponse upsertPersonalisations() {
        return upsertPersonalisationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    public Observable<UpsertPersonalisationsResponse> upsertPersonalisationsAsync() {
        return upsertPersonalisationsWithServiceResponseAsync().map(new Func1<ServiceResponse<UpsertPersonalisationsResponse>, UpsertPersonalisationsResponse>() {
            @Override
            public UpsertPersonalisationsResponse call(ServiceResponse<UpsertPersonalisationsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    public Observable<ServiceResponse<UpsertPersonalisationsResponse>> upsertPersonalisationsWithServiceResponseAsync() {
        final List<PersonalisationDto> personalisations = null;
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPersonalisationsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPersonalisationsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPersonalisationsResponse> clientResponse = upsertPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationsResponse object if successful.
     */
    public UpsertPersonalisationsResponse upsertPersonalisations(List<PersonalisationDto> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).toBlocking().single().body();
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations, final ServiceCallback<UpsertPersonalisationsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(personalisations), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    public Observable<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).map(new Func1<ServiceResponse<UpsertPersonalisationsResponse>, UpsertPersonalisationsResponse>() {
            @Override
            public UpsertPersonalisationsResponse call(ServiceResponse<UpsertPersonalisationsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    public Observable<ServiceResponse<UpsertPersonalisationsResponse>> upsertPersonalisationsWithServiceResponseAsync(List<PersonalisationDto> personalisations) {
        Validator.validate(personalisations);
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPersonalisationsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPersonalisationsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPersonalisationsResponse> clientResponse = upsertPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPersonalisationsResponse> upsertPersonalisationsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<UpsertPersonalisationsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertPersonalisationsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePersonalisation(String scope) {
        return deletePersonalisationWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String scope, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePersonalisationAsync(String scope) {
        return deletePersonalisationWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final String key = null;
        final String group = null;
        return service.deletePersonalisation(key, scope, group)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePersonalisationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePersonalisation(String scope, String key, String group) {
        return deletePersonalisationWithServiceResponseAsync(scope, key, group).toBlocking().single().body();
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String scope, String key, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(scope, key, group), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePersonalisationAsync(String scope, String key, String group) {
        return deletePersonalisationWithServiceResponseAsync(scope, key, group).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String scope, String key, String group) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.deletePersonalisation(key, scope, group)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePersonalisationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePersonalisationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListScope object if successful.
     */
    public ResourceListScope listPortfolioScopes() {
        return listPortfolioScopesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ResourceListScope> listPortfolioScopesAsync() {
        return listPortfolioScopesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListScope>, ResourceListScope>() {
            @Override
            public ResourceListScope call(ServiceResponse<ResourceListScope> response) {
                return response.body();
            }
        });
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ServiceResponse<ResourceListScope>> listPortfolioScopesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListScope> clientResponse = listPortfolioScopesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListScope object if successful.
     */
    public ResourceListScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit) {
        return listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ResourceListScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit) {
        return listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListScope>, ResourceListScope>() {
            @Override
            public ResourceListScope call(ServiceResponse<ResourceListScope> response) {
                return response.body();
            }
        });
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ServiceResponse<ResourceListScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListScope> clientResponse = listPortfolioScopesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListScope> listPortfolioScopesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListScope, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListScope>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioDto object if successful.
     */
    public ResourceListPortfolioDto listPortfolios(String scope) {
        return listPortfoliosWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioDto> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListPortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ResourceListPortfolioDto> listPortfoliosAsync(String scope) {
        return listPortfoliosWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListPortfolioDto>, ResourceListPortfolioDto>() {
            @Override
            public ResourceListPortfolioDto call(ServiceResponse<ResourceListPortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ServiceResponse<ResourceListPortfolioDto>> listPortfoliosWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioDto> clientResponse = listPortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioDto object if successful.
     */
    public ResourceListPortfolioDto listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioDto> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ResourceListPortfolioDto> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPortfolioDto>, ResourceListPortfolioDto>() {
            @Override
            public ResourceListPortfolioDto call(ServiceResponse<ResourceListPortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ServiceResponse<ResourceListPortfolioDto>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioDto> clientResponse = listPortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPortfolioDto> listPortfoliosDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListPortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createPortfolio(String scope) {
        return createPortfolioWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createPortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createPortfolioAsync(String scope) {
        return createPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreatePortfolioRequest createRequest = null;
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createPortfolio(String scope, CreatePortfolioRequest createRequest) {
        return createPortfolioWithServiceResponseAsync(scope, createRequest).toBlocking().single().body();
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope, createRequest), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest) {
        return createPortfolioWithServiceResponseAsync(scope, createRequest).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createPortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest createRequest) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(createRequest);
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDto> createPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto getPortfolio(String scope, String code) {
        return getPortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> getPortfolioAsync(String scope, String code, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> getPortfolioAsync(String scope, String code) {
        return getPortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> getPortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> propertyFilter = null;
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolio(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = getPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).toBlocking().single().body();
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter), serviceCallback);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolio(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = getPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDto> getPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto updatePortfolio(String scope, String code) {
        return updatePortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> updatePortfolioAsync(String scope, String code, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> updatePortfolioAsync(String scope, String code) {
        return updatePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> updatePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdatePortfolioRequest request = null;
        final DateTime effectiveAt = null;
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = updatePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        return updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt).toBlocking().single().body();
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt), serviceCallback);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        return updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = updatePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDto> updatePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolio(String scope, String code) {
        return deletePortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code) {
        return deletePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolio(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListProcessedCommandDto object if successful.
     */
    public ResourceListProcessedCommandDto getCommands(String scope, String code) {
        return getCommandsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListProcessedCommandDto> getCommandsAsync(String scope, String code, final ServiceCallback<ResourceListProcessedCommandDto> serviceCallback) {
        return ServiceFuture.fromResponse(getCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ResourceListProcessedCommandDto> getCommandsAsync(String scope, String code) {
        return getCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListProcessedCommandDto>, ResourceListProcessedCommandDto>() {
            @Override
            public ResourceListProcessedCommandDto call(ServiceResponse<ResourceListProcessedCommandDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ServiceResponse<ResourceListProcessedCommandDto>> getCommandsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromAsAt = null;
        final DateTime toAsAt = null;
        final String filter = null;
        return service.getCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListProcessedCommandDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListProcessedCommandDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListProcessedCommandDto> clientResponse = getCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListProcessedCommandDto object if successful.
     */
    public ResourceListProcessedCommandDto getCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).toBlocking().single().body();
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListProcessedCommandDto> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListProcessedCommandDto> serviceCallback) {
        return ServiceFuture.fromResponse(getCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter), serviceCallback);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ResourceListProcessedCommandDto> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).map(new Func1<ServiceResponse<ResourceListProcessedCommandDto>, ResourceListProcessedCommandDto>() {
            @Override
            public ResourceListProcessedCommandDto call(ServiceResponse<ResourceListProcessedCommandDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListProcessedCommandDto object
     */
    public Observable<ServiceResponse<ResourceListProcessedCommandDto>> getCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListProcessedCommandDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListProcessedCommandDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListProcessedCommandDto> clientResponse = getCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListProcessedCommandDto> getCommandsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListProcessedCommandDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListProcessedCommandDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetailsDto object if successful.
     */
    public PortfolioDetailsDto getDetails(String scope, String code) {
        return getDetailsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetailsDto> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetailsDto> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<PortfolioDetailsDto> getDetailsAsync(String scope, String code) {
        return getDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDetailsDto>, PortfolioDetailsDto>() {
            @Override
            public PortfolioDetailsDto call(ServiceResponse<PortfolioDetailsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<ServiceResponse<PortfolioDetailsDto>> getDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> propertyFilter = null;
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getDetails(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetailsDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetailsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetailsDto> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetailsDto object if successful.
     */
    public PortfolioDetailsDto getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).toBlocking().single().body();
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetailsDto> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<PortfolioDetailsDto> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter), serviceCallback);
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<PortfolioDetailsDto> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<PortfolioDetailsDto>, PortfolioDetailsDto>() {
            @Override
            public PortfolioDetailsDto call(ServiceResponse<PortfolioDetailsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get portfolio details.
     * Gets the details for a portfolio.  For a derived portfolio this can be
                 the details of another reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param propertyFilter Optional property filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<ServiceResponse<PortfolioDetailsDto>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getDetails(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetailsDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetailsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetailsDto> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDetailsDto> getDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDetailsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetailsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetailsDto object if successful.
     */
    public PortfolioDetailsDto upsertPortfolioDetails(String scope, String code) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetailsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDetailsDto>, PortfolioDetailsDto>() {
            @Override
            public PortfolioDetailsDto call(ServiceResponse<PortfolioDetailsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<ServiceResponse<PortfolioDetailsDto>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final PortfolioDetailsRequest details = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetailsDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetailsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetailsDto> clientResponse = upsertPortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the PortfolioDetailsRequest value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetailsDto object if successful.
     */
    public PortfolioDetailsDto upsertPortfolioDetails(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).toBlocking().single().body();
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the PortfolioDetailsRequest value
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt, final ServiceCallback<PortfolioDetailsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt), serviceCallback);
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the PortfolioDetailsRequest value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).map(new Func1<ServiceResponse<PortfolioDetailsDto>, PortfolioDetailsDto>() {
            @Override
            public PortfolioDetailsDto call(ServiceResponse<PortfolioDetailsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the PortfolioDetailsRequest value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetailsDto object
     */
    public Observable<ServiceResponse<PortfolioDetailsDto>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(details);
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetailsDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetailsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetailsDto> clientResponse = upsertPortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDetailsDto> upsertPortfolioDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDetailsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetailsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioDetails(String scope, String code) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioDetails(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePortfolioDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListHoldingDto object if successful.
     */
    public VersionedResourceListHoldingDto getAggregateHoldings(String scope, String code) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListHoldingDto> getAggregateHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListHoldingDto> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregateHoldingsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListHoldingDto object
     */
    public Observable<VersionedResourceListHoldingDto> getAggregateHoldingsAsync(String scope, String code) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<VersionedResourceListHoldingDto>, VersionedResourceListHoldingDto>() {
            @Override
            public VersionedResourceListHoldingDto call(ServiceResponse<VersionedResourceListHoldingDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListHoldingDto object
     */
    public Observable<ServiceResponse<VersionedResourceListHoldingDto>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        final List<String> securityPropertyKeys = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String securityPropertyKeysConverted = this.serializerAdapter().serializeList(securityPropertyKeys, CollectionFormat.MULTI);
        return service.getAggregateHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter, securityPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListHoldingDto>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListHoldingDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListHoldingDto> clientResponse = getAggregateHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt As at date
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter A filter on the results
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListHoldingDto object if successful.
     */
    public VersionedResourceListHoldingDto getAggregateHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, securityPropertyKeys).toBlocking().single().body();
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt As at date
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter A filter on the results
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the holdings
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListHoldingDto> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys, final ServiceCallback<VersionedResourceListHoldingDto> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, securityPropertyKeys), serviceCallback);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt As at date
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter A filter on the results
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListHoldingDto object
     */
    public Observable<VersionedResourceListHoldingDto> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, securityPropertyKeys).map(new Func1<ServiceResponse<VersionedResourceListHoldingDto>, VersionedResourceListHoldingDto>() {
            @Override
            public VersionedResourceListHoldingDto call(ServiceResponse<VersionedResourceListHoldingDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt As at date
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param filter A filter on the results
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListHoldingDto object
     */
    public Observable<ServiceResponse<VersionedResourceListHoldingDto>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(securityPropertyKeys);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String securityPropertyKeysConverted = this.serializerAdapter().serializeList(securityPropertyKeys, CollectionFormat.MULTI);
        return service.getAggregateHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter, securityPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListHoldingDto>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListHoldingDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListHoldingDto> clientResponse = getAggregateHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionedResourceListHoldingDto> getAggregateHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<VersionedResourceListHoldingDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListHoldingDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHoldingsDto object if successful.
     */
    public AdjustHoldingsDto adjustAllHoldings(String scope, String code, DateTime effectiveAt) {
        return adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHoldingsDto> serviceCallback) {
        return ServiceFuture.fromResponse(adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<AdjustHoldingsDto>, AdjustHoldingsDto>() {
            @Override
            public AdjustHoldingsDto call(ServiceResponse<AdjustHoldingsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<ServiceResponse<AdjustHoldingsDto>> adjustAllHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final List<AdjustHoldingRequest> holdingAdjustments = null;
        return service.adjustAllHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHoldingsDto>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHoldingsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHoldingsDto> clientResponse = adjustAllHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHoldingsDto object if successful.
     */
    public AdjustHoldingsDto adjustAllHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHoldingsDto> serviceCallback) {
        return ServiceFuture.fromResponse(adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustAllHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).map(new Func1<ServiceResponse<AdjustHoldingsDto>, AdjustHoldingsDto>() {
            @Override
            public AdjustHoldingsDto call(ServiceResponse<AdjustHoldingsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<ServiceResponse<AdjustHoldingsDto>> adjustAllHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(holdingAdjustments);
        return service.adjustAllHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHoldingsDto>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHoldingsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHoldingsDto> clientResponse = adjustAllHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdjustHoldingsDto> adjustAllHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AdjustHoldingsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AdjustHoldingsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHoldingsDto object if successful.
     */
    public AdjustHoldingsDto adjustHoldings(String scope, String code, DateTime effectiveAt) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHoldingsDto> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<AdjustHoldingsDto>, AdjustHoldingsDto>() {
            @Override
            public AdjustHoldingsDto call(ServiceResponse<AdjustHoldingsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<ServiceResponse<AdjustHoldingsDto>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final List<AdjustHoldingRequest> holdingAdjustments = null;
        return service.adjustHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHoldingsDto>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHoldingsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHoldingsDto> clientResponse = adjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHoldingsDto object if successful.
     */
    public AdjustHoldingsDto adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHoldingsDto> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).map(new Func1<ServiceResponse<AdjustHoldingsDto>, AdjustHoldingsDto>() {
            @Override
            public AdjustHoldingsDto call(ServiceResponse<AdjustHoldingsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHoldingsDto object
     */
    public Observable<ServiceResponse<AdjustHoldingsDto>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(holdingAdjustments);
        return service.adjustHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHoldingsDto>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHoldingsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHoldingsDto> clientResponse = adjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdjustHoldingsDto> adjustHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AdjustHoldingsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AdjustHoldingsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioPropertiesDto object if successful.
     */
    public PortfolioPropertiesDto getProperties(String scope, String code) {
        return getPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioPropertiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code) {
        return getPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioPropertiesDto>, PortfolioPropertiesDto>() {
            @Override
            public PortfolioPropertiesDto call(ServiceResponse<PortfolioPropertiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<ServiceResponse<PortfolioPropertiesDto>> getPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioPropertiesDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioPropertiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioPropertiesDto> clientResponse = getPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy Property to sort the results by
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioPropertiesDto object if successful.
     */
    public PortfolioPropertiesDto getProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy Property to sort the results by
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioPropertiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy Property to sort the results by
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<PortfolioPropertiesDto>, PortfolioPropertiesDto>() {
            @Override
            public PortfolioPropertiesDto call(ServiceResponse<PortfolioPropertiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param sortBy Property to sort the results by
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<ServiceResponse<PortfolioPropertiesDto>> getPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioPropertiesDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioPropertiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioPropertiesDto> clientResponse = getPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioPropertiesDto> getPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioPropertiesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioPropertiesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioPropertiesDto object if successful.
     */
    public PortfolioPropertiesDto upsertPortfolioProperties(String scope, String code) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioPropertiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioPropertiesDto>, PortfolioPropertiesDto>() {
            @Override
            public PortfolioPropertiesDto call(ServiceResponse<PortfolioPropertiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<ServiceResponse<PortfolioPropertiesDto>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<CreatePropertyRequest> properties = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioProperties(scope, code, properties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioPropertiesDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioPropertiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioPropertiesDto> clientResponse = upsertPortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioPropertiesDto object if successful.
     */
    public PortfolioPropertiesDto upsertPortfolioProperties(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt).toBlocking().single().body();
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt, final ServiceCallback<PortfolioPropertiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt).map(new Func1<ServiceResponse<PortfolioPropertiesDto>, PortfolioPropertiesDto>() {
            @Override
            public PortfolioPropertiesDto call(ServiceResponse<PortfolioPropertiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    public Observable<ServiceResponse<PortfolioPropertiesDto>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.upsertPortfolioProperties(scope, code, properties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioPropertiesDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioPropertiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioPropertiesDto> clientResponse = upsertPortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioPropertiesDto> upsertPortfolioPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioPropertiesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioPropertiesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperty(String scope, String code) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertyWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final String property = null;
        final DateTime effectiveAt = null;
        return service.deletePortfolioProperty(scope, code, property, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioPropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param property The key of the property to be deleted
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperty(String scope, String code, String property, DateTime effectiveAt) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code, property, effectiveAt).toBlocking().single().body();
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param property The key of the property to be deleted
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertyWithServiceResponseAsync(scope, code, property, effectiveAt), serviceCallback);
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param property The key of the property to be deleted
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code, property, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param property The key of the property to be deleted
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code, String property, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioProperty(scope, code, property, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioPropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePortfolioPropertyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperties(String scope, String code) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolioProperties(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioProperties(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePortfolioPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListTradeDto object if successful.
     */
    public VersionedResourceListTradeDto getTrades(String scope, String code) {
        return getTradesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListTradeDto> getTradesAsync(String scope, String code, final ServiceCallback<VersionedResourceListTradeDto> serviceCallback) {
        return ServiceFuture.fromResponse(getTradesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListTradeDto object
     */
    public Observable<VersionedResourceListTradeDto> getTradesAsync(String scope, String code) {
        return getTradesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<VersionedResourceListTradeDto>, VersionedResourceListTradeDto>() {
            @Override
            public VersionedResourceListTradeDto call(ServiceResponse<VersionedResourceListTradeDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListTradeDto object
     */
    public Observable<ServiceResponse<VersionedResourceListTradeDto>> getTradesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromTradeDate = null;
        final DateTime toTradeDate = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final List<String> securityPropertyKeys = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String securityPropertyKeysConverted = this.serializerAdapter().serializeList(securityPropertyKeys, CollectionFormat.MULTI);
        return service.getTrades(scope, code, fromTradeDate, toTradeDate, asAt, sortByConverted, start, limit, securityPropertyKeysConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListTradeDto>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListTradeDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListTradeDto> clientResponse = getTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Include trades with a trade date equal or later than this date
     * @param toTradeDate Include trades with a trade date equal or before this date
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListTradeDto object if successful.
     */
    public VersionedResourceListTradeDto getTrades(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter) {
        return getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, securityPropertyKeys, filter).toBlocking().single().body();
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Include trades with a trade date equal or later than this date
     * @param toTradeDate Include trades with a trade date equal or before this date
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListTradeDto> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, final ServiceCallback<VersionedResourceListTradeDto> serviceCallback) {
        return ServiceFuture.fromResponse(getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, securityPropertyKeys, filter), serviceCallback);
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Include trades with a trade date equal or later than this date
     * @param toTradeDate Include trades with a trade date equal or before this date
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListTradeDto object
     */
    public Observable<VersionedResourceListTradeDto> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter) {
        return getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, securityPropertyKeys, filter).map(new Func1<ServiceResponse<VersionedResourceListTradeDto>, VersionedResourceListTradeDto>() {
            @Override
            public VersionedResourceListTradeDto call(ServiceResponse<VersionedResourceListTradeDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Include trades with a trade date equal or later than this date
     * @param toTradeDate Include trades with a trade date equal or before this date
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListTradeDto object
     */
    public Observable<ServiceResponse<VersionedResourceListTradeDto>> getTradesWithServiceResponseAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(securityPropertyKeys);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String securityPropertyKeysConverted = this.serializerAdapter().serializeList(securityPropertyKeys, CollectionFormat.MULTI);
        return service.getTrades(scope, code, fromTradeDate, toTradeDate, asAt, sortByConverted, start, limit, securityPropertyKeysConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListTradeDto>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListTradeDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListTradeDto> clientResponse = getTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionedResourceListTradeDto> getTradesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<VersionedResourceListTradeDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListTradeDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTradesDto object if successful.
     */
    public UpsertPortfolioTradesDto upsertTrades(String scope, String code) {
        return upsertTradesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTradesDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTradesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    public Observable<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code) {
        return upsertTradesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<UpsertPortfolioTradesDto>, UpsertPortfolioTradesDto>() {
            @Override
            public UpsertPortfolioTradesDto call(ServiceResponse<UpsertPortfolioTradesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    public Observable<ServiceResponse<UpsertPortfolioTradesDto>> upsertTradesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<UpsertPortfolioTradeRequest> trades = null;
        return service.upsertTrades(scope, code, trades)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTradesDto>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTradesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTradesDto> clientResponse = upsertTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTradesDto object if successful.
     */
    public UpsertPortfolioTradesDto upsertTrades(String scope, String code, List<UpsertPortfolioTradeRequest> trades) {
        return upsertTradesWithServiceResponseAsync(scope, code, trades).toBlocking().single().body();
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades, final ServiceCallback<UpsertPortfolioTradesDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTradesWithServiceResponseAsync(scope, code, trades), serviceCallback);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    public Observable<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades) {
        return upsertTradesWithServiceResponseAsync(scope, code, trades).map(new Func1<ServiceResponse<UpsertPortfolioTradesDto>, UpsertPortfolioTradesDto>() {
            @Override
            public UpsertPortfolioTradesDto call(ServiceResponse<UpsertPortfolioTradesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    public Observable<ServiceResponse<UpsertPortfolioTradesDto>> upsertTradesWithServiceResponseAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(trades);
        return service.upsertTrades(scope, code, trades)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTradesDto>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTradesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTradesDto> clientResponse = upsertTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPortfolioTradesDto> upsertTradesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertPortfolioTradesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioTradesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteTrades(String scope, String code) {
        return deleteTradesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTradesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTradesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteTradesAsync(String scope, String code) {
        return deleteTradesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteTradesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<String> id = null;
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.MULTI);
        return service.deleteTrades(scope, code, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteTrades(String scope, String code, List<String> id) {
        return deleteTradesWithServiceResponseAsync(scope, code, id).toBlocking().single().body();
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of trades to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTradesAsync(String scope, String code, List<String> id, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTradesWithServiceResponseAsync(scope, code, id), serviceCallback);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteTradesAsync(String scope, String code, List<String> id) {
        return deleteTradesWithServiceResponseAsync(scope, code, id).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteTradesWithServiceResponseAsync(String scope, String code, List<String> id) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(id);
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.MULTI);
        return service.deleteTrades(scope, code, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deleteTradesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTradePropertyDto object if successful.
     */
    public AddTradePropertyDto addTradeProperty(String scope, String code, String tradeId) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId).toBlocking().single().body();
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, final ServiceCallback<AddTradePropertyDto> serviceCallback) {
        return ServiceFuture.fromResponse(addTradePropertyWithServiceResponseAsync(scope, code, tradeId), serviceCallback);
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTradePropertyDto object
     */
    public Observable<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId).map(new Func1<ServiceResponse<AddTradePropertyDto>, AddTradePropertyDto>() {
            @Override
            public AddTradePropertyDto call(ServiceResponse<AddTradePropertyDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTradePropertyDto object
     */
    public Observable<ServiceResponse<AddTradePropertyDto>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (tradeId == null) {
            throw new IllegalArgumentException("Parameter tradeId is required and cannot be null.");
        }
        final List<CreatePerpetualPropertyRequest> properties = null;
        return service.addTradeProperty(scope, code, tradeId, properties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddTradePropertyDto>>>() {
                @Override
                public Observable<ServiceResponse<AddTradePropertyDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddTradePropertyDto> clientResponse = addTradePropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @param properties Trade properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTradePropertyDto object if successful.
     */
    public AddTradePropertyDto addTradeProperty(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId, properties).toBlocking().single().body();
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @param properties Trade properties to add
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties, final ServiceCallback<AddTradePropertyDto> serviceCallback) {
        return ServiceFuture.fromResponse(addTradePropertyWithServiceResponseAsync(scope, code, tradeId, properties), serviceCallback);
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @param properties Trade properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTradePropertyDto object
     */
    public Observable<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId, properties).map(new Func1<ServiceResponse<AddTradePropertyDto>, AddTradePropertyDto>() {
            @Override
            public AddTradePropertyDto call(ServiceResponse<AddTradePropertyDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update trade properties.
     * Add one or more properties to a specific trade in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of trade to add properties to
     * @param properties Trade properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTradePropertyDto object
     */
    public Observable<ServiceResponse<AddTradePropertyDto>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (tradeId == null) {
            throw new IllegalArgumentException("Parameter tradeId is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.addTradeProperty(scope, code, tradeId, properties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddTradePropertyDto>>>() {
                @Override
                public Observable<ServiceResponse<AddTradePropertyDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddTradePropertyDto> clientResponse = addTradePropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddTradePropertyDto> addTradePropertyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AddTradePropertyDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AddTradePropertyDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyFromTrade(String scope, String code, String tradeId) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId).toBlocking().single().body();
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId), serviceCallback);
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (tradeId == null) {
            throw new IllegalArgumentException("Parameter tradeId is required and cannot be null.");
        }
        final String property = null;
        return service.deletePropertyFromTrade(scope, code, tradeId, property)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePropertyFromTradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @param property The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyFromTrade(String scope, String code, String tradeId, String property) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId, property).toBlocking().single().body();
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @param property The key of the property to be deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId, property), serviceCallback);
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @param property The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId, property).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete trade property.
     * Delete a property from a specific trade.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param tradeId Id of the trade to delete the property from
     * @param property The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId, String property) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (tradeId == null) {
            throw new IllegalArgumentException("Parameter tradeId is required and cannot be null.");
        }
        return service.deletePropertyFromTrade(scope, code, tradeId, property)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePropertyFromTradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePropertyFromTradeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createDerivedPortfolio(String scope) {
        return createDerivedPortfolioWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createDerivedPortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createDerivedPortfolioAsync(String scope) {
        return createDerivedPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createDerivedPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateDerivedPortfolioRequest portfolio = null;
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createDerivedPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createDerivedPortfolio(String scope, CreateDerivedPortfolioRequest portfolio) {
        return createDerivedPortfolioWithServiceResponseAsync(scope, portfolio).toBlocking().single().body();
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope, portfolio), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio) {
        return createDerivedPortfolioWithServiceResponseAsync(scope, portfolio).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedPortfolioRequest portfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(portfolio);
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createDerivedPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDto> createDerivedPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioSearchResult object if successful.
     */
    public ResourceListPortfolioSearchResult portfoliosSearch() {
        return portfoliosSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioSearchResult> portfoliosSearchAsync(final ServiceCallback<ResourceListPortfolioSearchResult> serviceCallback) {
        return ServiceFuture.fromResponse(portfoliosSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioSearchResult object
     */
    public Observable<ResourceListPortfolioSearchResult> portfoliosSearchAsync() {
        return portfoliosSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListPortfolioSearchResult>, ResourceListPortfolioSearchResult>() {
            @Override
            public ResourceListPortfolioSearchResult call(ServiceResponse<ResourceListPortfolioSearchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioSearchResult object
     */
    public Observable<ServiceResponse<ResourceListPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioSearchResult>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioSearchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioSearchResult> clientResponse = portfoliosSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Search portfolios.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioSearchResult object if successful.
     */
    public ResourceListPortfolioSearchResult portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Search portfolios.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPortfolioSearchResult> serviceCallback) {
        return ServiceFuture.fromResponse(portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search portfolios.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioSearchResult object
     */
    public Observable<ResourceListPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPortfolioSearchResult>, ResourceListPortfolioSearchResult>() {
            @Override
            public ResourceListPortfolioSearchResult call(ServiceResponse<ResourceListPortfolioSearchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolios.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioSearchResult object
     */
    public Observable<ServiceResponse<ResourceListPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioSearchResult>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioSearchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioSearchResult> clientResponse = portfoliosSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPortfolioSearchResult> portfoliosSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListPortfolioSearchResult, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioSearchResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDefinitionDto object if successful.
     */
    public ResourceListPropertyDefinitionDto propertiesSearch() {
        return propertiesSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDefinitionDto> propertiesSearchAsync(final ServiceCallback<ResourceListPropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ResourceListPropertyDefinitionDto> propertiesSearchAsync() {
        return propertiesSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListPropertyDefinitionDto>, ResourceListPropertyDefinitionDto>() {
            @Override
            public ResourceListPropertyDefinitionDto call(ServiceResponse<ResourceListPropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> propertiesSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDefinitionDto> clientResponse = propertiesSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDefinitionDto object if successful.
     */
    public ResourceListPropertyDefinitionDto propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDefinitionDto> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ResourceListPropertyDefinitionDto> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPropertyDefinitionDto>, ResourceListPropertyDefinitionDto>() {
            @Override
            public ResourceListPropertyDefinitionDto call(ServiceResponse<ResourceListPropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDefinitionDto> clientResponse = propertiesSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyDefinitionDto> propertiesSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDomain object if successful.
     */
    public ResourceListPropertyDomain getPropertyDefinitionDomains() {
        return getPropertyDefinitionDomainsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDomain> getPropertyDefinitionDomainsAsync(final ServiceCallback<ResourceListPropertyDomain> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionDomainsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDomain object
     */
    public Observable<ResourceListPropertyDomain> getPropertyDefinitionDomainsAsync() {
        return getPropertyDefinitionDomainsWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListPropertyDomain>, ResourceListPropertyDomain>() {
            @Override
            public ResourceListPropertyDomain call(ServiceResponse<ResourceListPropertyDomain> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDomain object
     */
    public Observable<ServiceResponse<ResourceListPropertyDomain>> getPropertyDefinitionDomainsWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionDomains(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDomain>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDomain>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDomain> clientResponse = getPropertyDefinitionDomainsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDomain object if successful.
     */
    public ResourceListPropertyDomain getPropertyDefinitionDomains(List<String> sortBy, Integer start, Integer limit) {
        return getPropertyDefinitionDomainsWithServiceResponseAsync(sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDomain> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListPropertyDomain> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionDomainsWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDomain object
     */
    public Observable<ResourceListPropertyDomain> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit) {
        return getPropertyDefinitionDomainsWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListPropertyDomain>, ResourceListPropertyDomain>() {
            @Override
            public ResourceListPropertyDomain call(ServiceResponse<ResourceListPropertyDomain> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDomain object
     */
    public Observable<ServiceResponse<ResourceListPropertyDomain>> getPropertyDefinitionDomainsWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionDomains(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDomain>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDomain>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDomain> clientResponse = getPropertyDefinitionDomainsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyDomain> getPropertyDefinitionDomainsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyDomain, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDomain>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto createPropertyDefinition() {
        return createPropertyDefinitionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> createPropertyDefinitionAsync() {
        return createPropertyDefinitionWithServiceResponseAsync().map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> createPropertyDefinitionWithServiceResponseAsync() {
        final CreatePropertyDefinitionRequest definition = null;
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = createPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto createPropertyDefinition(CreatePropertyDefinitionRequest definition) {
        return createPropertyDefinitionWithServiceResponseAsync(definition).toBlocking().single().body();
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(definition), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition) {
        return createPropertyDefinitionWithServiceResponseAsync(definition).map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition) {
        Validator.validate(definition);
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = createPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinitionDto> createPropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<PropertyDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDefinitionDto object if successful.
     */
    public ResourceListPropertyDefinitionDto getMultiplePropertyDefinitions() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListPropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ResourceListPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListPropertyDefinitionDto>, ResourceListPropertyDefinitionDto>() {
            @Override
            public ResourceListPropertyDefinitionDto call(ServiceResponse<ResourceListPropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> getMultiplePropertyDefinitionsWithServiceResponseAsync() {
        final List<String> keys = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(keysConverted, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDefinitionDto> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDefinitionDto object if successful.
     */
    public ResourceListPropertyDefinitionDto getMultiplePropertyDefinitions(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ResourceListPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPropertyDefinitionDto>, ResourceListPropertyDefinitionDto>() {
            @Override
            public ResourceListPropertyDefinitionDto call(ServiceResponse<ResourceListPropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDefinitionDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(keys);
        Validator.validate(sortBy);
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(keysConverted, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDefinitionDto> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyDefinitionDto> getMultiplePropertyDefinitionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyKey object if successful.
     */
    public ResourceListPropertyKey getAllPropertyKeysInDomain(String domain) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyKey> getAllPropertyKeysInDomainAsync(String domain, final ServiceCallback<ResourceListPropertyKey> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInDomainWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ResourceListPropertyKey> getAllPropertyKeysInDomainAsync(String domain) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain).map(new Func1<ServiceResponse<ResourceListPropertyKey>, ResourceListPropertyKey>() {
            @Override
            public ResourceListPropertyKey call(ServiceResponse<ResourceListPropertyKey> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ServiceResponse<ResourceListPropertyKey>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInDomain(domain, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyKey> clientResponse = getAllPropertyKeysInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyKey object if successful.
     */
    public ResourceListPropertyKey getAllPropertyKeysInDomain(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyKey> getAllPropertyKeysInDomainAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPropertyKey> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInDomainWithServiceResponseAsync(domain, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ResourceListPropertyKey> getAllPropertyKeysInDomainAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPropertyKey>, ResourceListPropertyKey>() {
            @Override
            public ResourceListPropertyKey call(ServiceResponse<ResourceListPropertyKey> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ServiceResponse<ResourceListPropertyKey>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInDomain(domain, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyKey> clientResponse = getAllPropertyKeysInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyKey> getAllPropertyKeysInDomainDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyKey, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyKey>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListScope object if successful.
     */
    public ResourceListScope getPropertyDefinitionScopesInDomain(String domain) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListScope> getPropertyDefinitionScopesInDomainAsync(String domain, final ServiceCallback<ResourceListScope> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ResourceListScope> getPropertyDefinitionScopesInDomainAsync(String domain) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain).map(new Func1<ServiceResponse<ResourceListScope>, ResourceListScope>() {
            @Override
            public ResourceListScope call(ServiceResponse<ResourceListScope> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ServiceResponse<ResourceListScope>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionScopesInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListScope> clientResponse = getPropertyDefinitionScopesInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListScope object if successful.
     */
    public ResourceListScope getPropertyDefinitionScopesInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListScope> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListScope> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ResourceListScope> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListScope>, ResourceListScope>() {
            @Override
            public ResourceListScope call(ServiceResponse<ResourceListScope> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListScope object
     */
    public Observable<ServiceResponse<ResourceListScope>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionScopesInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListScope> clientResponse = getPropertyDefinitionScopesInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListScope> getPropertyDefinitionScopesInDomainDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListScope, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListScope>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyKey object if successful.
     */
    public ResourceListPropertyKey getAllPropertyKeysInScope(String domain, String scope) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope).toBlocking().single().body();
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, final ServiceCallback<ResourceListPropertyKey> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope), serviceCallback);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ResourceListPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope).map(new Func1<ServiceResponse<ResourceListPropertyKey>, ResourceListPropertyKey>() {
            @Override
            public ResourceListPropertyKey call(ServiceResponse<ResourceListPropertyKey> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ServiceResponse<ResourceListPropertyKey>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInScope(domain, scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyKey> clientResponse = getAllPropertyKeysInScopeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyKey object if successful.
     */
    public ResourceListPropertyKey getAllPropertyKeysInScope(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPropertyKey> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ResourceListPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPropertyKey>, ResourceListPropertyKey>() {
            @Override
            public ResourceListPropertyKey call(ServiceResponse<ResourceListPropertyKey> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyKey object
     */
    public Observable<ServiceResponse<ResourceListPropertyKey>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInScope(domain, scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyKey> clientResponse = getAllPropertyKeysInScopeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyKey> getAllPropertyKeysInScopeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyKey, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyKey>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto getPropertyDefinition(String domain, String scope, String name) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getPropertyDefinition(domain, scope, name, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = getPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto getPropertyDefinition(String domain, String scope, String name, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt).toBlocking().single().body();
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt, final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt), serviceCallback);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt).map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, DateTime asAt) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        return service.getPropertyDefinition(domain, scope, name, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = getPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinitionDto> getPropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto updatePropertyDefinition(String domain, String scope, String name) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final UpdatePropertyDefinitionRequest definition = null;
        return service.updatePropertyDefinition(domain, scope, name, definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = updatePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    public PropertyDefinitionDto updatePropertyDefinition(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition).toBlocking().single().body();
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition), serviceCallback);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition).map(new Func1<ServiceResponse<PropertyDefinitionDto>, PropertyDefinitionDto>() {
            @Override
            public PropertyDefinitionDto call(ServiceResponse<PropertyDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    public Observable<ServiceResponse<PropertyDefinitionDto>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        Validator.validate(definition);
        return service.updatePropertyDefinition(domain, scope, name, definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinitionDto> clientResponse = updatePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinitionDto> updatePropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyDefinition(String domain, String scope, String name) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String name) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        return service.deletePropertyDefinition(domain, scope, name)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    public PropertyDataFormatDto createPropertyDataFormat() {
        return createPropertyDataFormatWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDataFormatDto> createPropertyDataFormatAsync(final ServiceCallback<PropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDataFormatWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<PropertyDataFormatDto> createPropertyDataFormatAsync() {
        return createPropertyDataFormatWithServiceResponseAsync().map(new Func1<ServiceResponse<PropertyDataFormatDto>, PropertyDataFormatDto>() {
            @Override
            public PropertyDataFormatDto call(ServiceResponse<PropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<ServiceResponse<PropertyDataFormatDto>> createPropertyDataFormatWithServiceResponseAsync() {
        final CreatePropertyDataFormatRequest request = null;
        return service.createPropertyDataFormat(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDataFormatDto> clientResponse = createPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    public PropertyDataFormatDto createPropertyDataFormat(CreatePropertyDataFormatRequest request) {
        return createPropertyDataFormatWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDataFormatDto> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request, final ServiceCallback<PropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDataFormatWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<PropertyDataFormatDto> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request) {
        return createPropertyDataFormatWithServiceResponseAsync(request).map(new Func1<ServiceResponse<PropertyDataFormatDto>, PropertyDataFormatDto>() {
            @Override
            public PropertyDataFormatDto call(ServiceResponse<PropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<ServiceResponse<PropertyDataFormatDto>> createPropertyDataFormatWithServiceResponseAsync(CreatePropertyDataFormatRequest request) {
        Validator.validate(request);
        return service.createPropertyDataFormat(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDataFormatDto> clientResponse = createPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDataFormatDto> createPropertyDataFormatDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<PropertyDataFormatDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDataFormatDto object if successful.
     */
    public ResourceListPropertyDataFormatDto listPropertyDataFormats(String scope) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, final ServiceCallback<ResourceListPropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPropertyDataFormatsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDataFormatDto object
     */
    public Observable<ResourceListPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListPropertyDataFormatDto>, ResourceListPropertyDataFormatDto>() {
            @Override
            public ResourceListPropertyDataFormatDto call(ServiceResponse<ResourceListPropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDataFormatDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDataFormatDto>> listPropertyDataFormatsWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final Boolean includeDefault = null;
        final Boolean includeSystem = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPropertyDataFormats(scope, includeDefault, includeSystem, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDataFormatDto> clientResponse = listPropertyDataFormatsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param includeDefault the Boolean value
     * @param includeSystem the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPropertyDataFormatDto object if successful.
     */
    public ResourceListPropertyDataFormatDto listPropertyDataFormats(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param includeDefault the Boolean value
     * @param includeSystem the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(listPropertyDataFormatsWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param includeDefault the Boolean value
     * @param includeSystem the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDataFormatDto object
     */
    public Observable<ResourceListPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPropertyDataFormatDto>, ResourceListPropertyDataFormatDto>() {
            @Override
            public ResourceListPropertyDataFormatDto call(ServiceResponse<ResourceListPropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param includeDefault the Boolean value
     * @param includeSystem the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPropertyDataFormatDto object
     */
    public Observable<ServiceResponse<ResourceListPropertyDataFormatDto>> listPropertyDataFormatsWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPropertyDataFormats(scope, includeDefault, includeSystem, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPropertyDataFormatDto> clientResponse = listPropertyDataFormatsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPropertyDataFormatDto> listPropertyDataFormatsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListPropertyDataFormatDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDataFormatDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    public PropertyDataFormatDto getPropertyDataFormat(String scope, String name) {
        return getPropertyDataFormatWithServiceResponseAsync(scope, name).toBlocking().single().body();
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDataFormatDto> getPropertyDataFormatAsync(String scope, String name, final ServiceCallback<PropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDataFormatWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<PropertyDataFormatDto> getPropertyDataFormatAsync(String scope, String name) {
        return getPropertyDataFormatWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<PropertyDataFormatDto>, PropertyDataFormatDto>() {
            @Override
            public PropertyDataFormatDto call(ServiceResponse<PropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<ServiceResponse<PropertyDataFormatDto>> getPropertyDataFormatWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        return service.getPropertyDataFormat(scope, name)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDataFormatDto> clientResponse = getPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDataFormatDto> getPropertyDataFormatDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDataFormatDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    public PropertyDataFormatDto updatePropertyDataFormat(String scope, String name) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name).toBlocking().single().body();
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, final ServiceCallback<PropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDataFormatWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<PropertyDataFormatDto>, PropertyDataFormatDto>() {
            @Override
            public PropertyDataFormatDto call(ServiceResponse<PropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<ServiceResponse<PropertyDataFormatDto>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final UpdatePropertyDataFormatRequest request = null;
        return service.updatePropertyDataFormat(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDataFormatDto> clientResponse = updatePropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    public PropertyDataFormatDto updatePropertyDataFormat(String scope, String name, UpdatePropertyDataFormatRequest request) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name, request).toBlocking().single().body();
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request, final ServiceCallback<PropertyDataFormatDto> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDataFormatWithServiceResponseAsync(scope, name, request), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name, request).map(new Func1<ServiceResponse<PropertyDataFormatDto>, PropertyDataFormatDto>() {
            @Override
            public PropertyDataFormatDto call(ServiceResponse<PropertyDataFormatDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    public Observable<ServiceResponse<PropertyDataFormatDto>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name, UpdatePropertyDataFormatRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePropertyDataFormat(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDataFormatDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDataFormatDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDataFormatDto> clientResponse = updatePropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDataFormatDto> updatePropertyDataFormatDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDataFormatDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinitionDto object if successful.
     */
    public IUnitDefinitionDto getUnitsFromPropertyDataFormat(String scope, String name, List<String> units) {
        return getUnitsFromPropertyDataFormatWithServiceResponseAsync(scope, name, units).toBlocking().single().body();
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IUnitDefinitionDto> getUnitsFromPropertyDataFormatAsync(String scope, String name, List<String> units, final ServiceCallback<IUnitDefinitionDto> serviceCallback) {
        return ServiceFuture.fromResponse(getUnitsFromPropertyDataFormatWithServiceResponseAsync(scope, name, units), serviceCallback);
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    public Observable<IUnitDefinitionDto> getUnitsFromPropertyDataFormatAsync(String scope, String name, List<String> units) {
        return getUnitsFromPropertyDataFormatWithServiceResponseAsync(scope, name, units).map(new Func1<ServiceResponse<IUnitDefinitionDto>, IUnitDefinitionDto>() {
            @Override
            public IUnitDefinitionDto call(ServiceResponse<IUnitDefinitionDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    public Observable<ServiceResponse<IUnitDefinitionDto>> getUnitsFromPropertyDataFormatWithServiceResponseAsync(String scope, String name, List<String> units) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (units == null) {
            throw new IllegalArgumentException("Parameter units is required and cannot be null.");
        }
        Validator.validate(units);
        String unitsConverted = this.serializerAdapter().serializeList(units, CollectionFormat.MULTI);
        return service.getUnitsFromPropertyDataFormat(scope, name, unitsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IUnitDefinitionDto>>>() {
                @Override
                public Observable<ServiceResponse<IUnitDefinitionDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IUnitDefinitionDto> clientResponse = getUnitsFromPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IUnitDefinitionDto> getUnitsFromPropertyDataFormatDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<IUnitDefinitionDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<IUnitDefinitionDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReconciliationBreakDto object if successful.
     */
    public ResourceListReconciliationBreakDto performReconciliation() {
        return performReconciliationWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReconciliationBreakDto> performReconciliationAsync(final ServiceCallback<ResourceListReconciliationBreakDto> serviceCallback) {
        return ServiceFuture.fromResponse(performReconciliationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReconciliationBreakDto object
     */
    public Observable<ResourceListReconciliationBreakDto> performReconciliationAsync() {
        return performReconciliationWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListReconciliationBreakDto>, ResourceListReconciliationBreakDto>() {
            @Override
            public ResourceListReconciliationBreakDto call(ServiceResponse<ResourceListReconciliationBreakDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReconciliationBreakDto object
     */
    public Observable<ServiceResponse<ResourceListReconciliationBreakDto>> performReconciliationWithServiceResponseAsync() {
        final ReconciliationRequest request = null;
        return service.performReconciliation(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReconciliationBreakDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReconciliationBreakDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReconciliationBreakDto> clientResponse = performReconciliationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReconciliationBreakDto object if successful.
     */
    public ResourceListReconciliationBreakDto performReconciliation(ReconciliationRequest request) {
        return performReconciliationWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReconciliationBreakDto> performReconciliationAsync(ReconciliationRequest request, final ServiceCallback<ResourceListReconciliationBreakDto> serviceCallback) {
        return ServiceFuture.fromResponse(performReconciliationWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReconciliationBreakDto object
     */
    public Observable<ResourceListReconciliationBreakDto> performReconciliationAsync(ReconciliationRequest request) {
        return performReconciliationWithServiceResponseAsync(request).map(new Func1<ServiceResponse<ResourceListReconciliationBreakDto>, ResourceListReconciliationBreakDto>() {
            @Override
            public ResourceListReconciliationBreakDto call(ServiceResponse<ResourceListReconciliationBreakDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReconciliationBreakDto object
     */
    public Observable<ServiceResponse<ResourceListReconciliationBreakDto>> performReconciliationWithServiceResponseAsync(ReconciliationRequest request) {
        Validator.validate(request);
        return service.performReconciliation(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReconciliationBreakDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReconciliationBreakDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReconciliationBreakDto> clientResponse = performReconciliationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListReconciliationBreakDto> performReconciliationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListReconciliationBreakDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListReconciliationBreakDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioDto object if successful.
     */
    public ResourceListPortfolioDto listReferencePortfolios(String scope, DateTime effectiveAt) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, final ServiceCallback<ResourceListPortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt), serviceCallback);
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ResourceListPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt).map(new Func1<ServiceResponse<ResourceListPortfolioDto>, ResourceListPortfolioDto>() {
            @Override
            public ResourceListPortfolioDto call(ServiceResponse<ResourceListPortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ServiceResponse<ResourceListPortfolioDto>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listReferencePortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioDto> clientResponse = listReferencePortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListPortfolioDto object if successful.
     */
    public ResourceListPortfolioDto listReferencePortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListPortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ResourceListPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListPortfolioDto>, ResourceListPortfolioDto>() {
            @Override
            public ResourceListPortfolioDto call(ServiceResponse<ResourceListPortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListPortfolioDto object
     */
    public Observable<ServiceResponse<ResourceListPortfolioDto>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listReferencePortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListPortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListPortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListPortfolioDto> clientResponse = listReferencePortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListPortfolioDto> listReferencePortfoliosDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListPortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createReferencePortfolio(String scope) {
        return createReferencePortfolioWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createReferencePortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createReferencePortfolioAsync(String scope) {
        return createReferencePortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createReferencePortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreatePortfolioRequest referencePortfolio = null;
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    public PortfolioDto createReferencePortfolio(String scope, CreatePortfolioRequest referencePortfolio) {
        return createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio).toBlocking().single().body();
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDto> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio, final ServiceCallback<PortfolioDto> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<PortfolioDto> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio) {
        return createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio).map(new Func1<ServiceResponse<PortfolioDto>, PortfolioDto>() {
            @Override
            public PortfolioDto call(ServiceResponse<PortfolioDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    public Observable<ServiceResponse<PortfolioDto>> createReferencePortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest referencePortfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(referencePortfolio);
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDto>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDto> clientResponse = createReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDto> createReferencePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReferencePortfolioConstituentDto object if successful.
     */
    public ResourceListReferencePortfolioConstituentDto getReferencePortfolio(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListReferencePortfolioConstituentDto> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<ResourceListReferencePortfolioConstituentDto>, ResourceListReferencePortfolioConstituentDto>() {
            @Override
            public ResourceListReferencePortfolioConstituentDto call(ServiceResponse<ResourceListReferencePortfolioConstituentDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getReferencePortfolio(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReferencePortfolioConstituentDto> clientResponse = getReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReferencePortfolioConstituentDto object if successful.
     */
    public ResourceListReferencePortfolioConstituentDto getReferencePortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<ResourceListReferencePortfolioConstituentDto> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).map(new Func1<ServiceResponse<ResourceListReferencePortfolioConstituentDto>, ResourceListReferencePortfolioConstituentDto>() {
            @Override
            public ResourceListReferencePortfolioConstituentDto call(ServiceResponse<ResourceListReferencePortfolioConstituentDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        return service.getReferencePortfolio(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReferencePortfolioConstituentDto> clientResponse = getReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListReferencePortfolioConstituentDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListReferencePortfolioConstituentDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteReferencePortfolio(String scope, String code) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteReferencePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deleteReferencePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteReferencePortfolio(String scope, String code, DateTime effectiveAt) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deleteReferencePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deleteReferencePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReferencePortfolioConstituentDto object if successful.
     */
    public ResourceListReferencePortfolioConstituentDto getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code).toBlocking().single().body();
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, final ServiceCallback<ResourceListReferencePortfolioConstituentDto> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code), serviceCallback);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code).map(new Func1<ServiceResponse<ResourceListReferencePortfolioConstituentDto>, ResourceListReferencePortfolioConstituentDto>() {
            @Override
            public ResourceListReferencePortfolioConstituentDto call(ServiceResponse<ResourceListReferencePortfolioConstituentDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final String referencePortfolioId = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getReferencePortfolioConstituents(scope, effectiveAt, code, referencePortfolioId, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReferencePortfolioConstituentDto> clientResponse = getReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @param referencePortfolioId the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListReferencePortfolioConstituentDto object if successful.
     */
    public ResourceListReferencePortfolioConstituentDto getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code, referencePortfolioId, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @param referencePortfolioId the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListReferencePortfolioConstituentDto> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code, referencePortfolioId, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @param referencePortfolioId the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code, referencePortfolioId, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListReferencePortfolioConstituentDto>, ResourceListReferencePortfolioConstituentDto>() {
            @Override
            public ResourceListReferencePortfolioConstituentDto call(ServiceResponse<ResourceListReferencePortfolioConstituentDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @param referencePortfolioId the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListReferencePortfolioConstituentDto object
     */
    public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getReferencePortfolioConstituents(scope, effectiveAt, code, referencePortfolioId, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListReferencePortfolioConstituentDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListReferencePortfolioConstituentDto> clientResponse = getReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListReferencePortfolioConstituentDto> getReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListReferencePortfolioConstituentDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListReferencePortfolioConstituentDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsDto object if successful.
     */
    public UpsertReferencePortfolioConstituentsDto upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    public Observable<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<UpsertReferencePortfolioConstituentsDto>, UpsertReferencePortfolioConstituentsDto>() {
            @Override
            public UpsertReferencePortfolioConstituentsDto call(ServiceResponse<UpsertReferencePortfolioConstituentsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final List<ReferencePortfolioConstituentDto> constituents = null;
        return service.upsertReferencePortfolioConstituents(scope, code, effectiveAt, constituents)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>>>() {
                @Override
                public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertReferencePortfolioConstituentsDto> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsDto object if successful.
     */
    public UpsertReferencePortfolioConstituentsDto upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).toBlocking().single().body();
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents), serviceCallback);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    public Observable<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).map(new Func1<ServiceResponse<UpsertReferencePortfolioConstituentsDto>, UpsertReferencePortfolioConstituentsDto>() {
            @Override
            public UpsertReferencePortfolioConstituentsDto call(ServiceResponse<UpsertReferencePortfolioConstituentsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(constituents);
        return service.upsertReferencePortfolioConstituents(scope, code, effectiveAt, constituents)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>>>() {
                @Override
                public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertReferencePortfolioConstituentsDto> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertReferencePortfolioConstituentsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertReferencePortfolioConstituentsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResultsDto object if successful.
     */
    public ResultsDto getResults(String scope, String key, DateTime dateParameter) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter).toBlocking().single().body();
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<ResultsDto> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<ResultsDto>, ResultsDto>() {
            @Override
            public ResultsDto call(ServiceResponse<ResultsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ServiceResponse<ResultsDto>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Parameter key is required and cannot be null.");
        }
        if (dateParameter == null) {
            throw new IllegalArgumentException("Parameter dateParameter is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getResults(scope, key, dateParameter, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResultsDto>>>() {
                @Override
                public Observable<ServiceResponse<ResultsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResultsDto> clientResponse = getResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResultsDto object if successful.
     */
    public ResultsDto getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResultsDto> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<ResultsDto>, ResultsDto>() {
            @Override
            public ResultsDto call(ServiceResponse<ResultsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ServiceResponse<ResultsDto>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Parameter key is required and cannot be null.");
        }
        if (dateParameter == null) {
            throw new IllegalArgumentException("Parameter dateParameter is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getResults(scope, key, dateParameter, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResultsDto>>>() {
                @Override
                public Observable<ServiceResponse<ResultsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResultsDto> clientResponse = getResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResultsDto> getResultsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResultsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResultsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResultsDto object if successful.
     */
    public ResultsDto upsertResults(String scope, String key, DateTime dateParameter) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter).toBlocking().single().body();
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<ResultsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<ResultsDto>, ResultsDto>() {
            @Override
            public ResultsDto call(ServiceResponse<ResultsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ServiceResponse<ResultsDto>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Parameter key is required and cannot be null.");
        }
        if (dateParameter == null) {
            throw new IllegalArgumentException("Parameter dateParameter is required and cannot be null.");
        }
        final CreateResultsRequest request = null;
        return service.upsertResults(scope, key, dateParameter, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResultsDto>>>() {
                @Override
                public Observable<ServiceResponse<ResultsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResultsDto> clientResponse = upsertResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @param request The results to upload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResultsDto object if successful.
     */
    public ResultsDto upsertResults(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter, request).toBlocking().single().body();
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @param request The results to upload
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request, final ServiceCallback<ResultsDto> serviceCallback) {
        return ServiceFuture.fromResponse(upsertResultsWithServiceResponseAsync(scope, key, dateParameter, request), serviceCallback);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @param request The results to upload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter, request).map(new Func1<ServiceResponse<ResultsDto>, ResultsDto>() {
            @Override
            public ResultsDto call(ServiceResponse<ResultsDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @param request The results to upload
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    public Observable<ServiceResponse<ResultsDto>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Parameter key is required and cannot be null.");
        }
        if (dateParameter == null) {
            throw new IllegalArgumentException("Parameter dateParameter is required and cannot be null.");
        }
        Validator.validate(request);
        return service.upsertResults(scope, key, dateParameter, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResultsDto>>>() {
                @Override
                public Observable<ServiceResponse<ResultsDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResultsDto> clientResponse = upsertResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResultsDto> upsertResultsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResultsDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResultsDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaDto object if successful.
     */
    public SchemaDto getEntitySchema(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).toBlocking().single().body();
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaDto> getEntitySchemaAsync(String entity, final ServiceCallback<SchemaDto> serviceCallback) {
        return ServiceFuture.fromResponse(getEntitySchemaWithServiceResponseAsync(entity), serviceCallback);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaDto object
     */
    public Observable<SchemaDto> getEntitySchemaAsync(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).map(new Func1<ServiceResponse<SchemaDto>, SchemaDto>() {
            @Override
            public SchemaDto call(ServiceResponse<SchemaDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaDto object
     */
    public Observable<ServiceResponse<SchemaDto>> getEntitySchemaWithServiceResponseAsync(String entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Parameter entity is required and cannot be null.");
        }
        return service.getEntitySchema(entity)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaDto>>>() {
                @Override
                public Observable<ServiceResponse<SchemaDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaDto> clientResponse = getEntitySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SchemaDto> getEntitySchemaDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SchemaDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SchemaDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchemaDto object if successful.
     */
    public PropertySchemaDto getPropertySchema() {
        return getPropertySchemaWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertySchemaDto> getPropertySchemaAsync(final ServiceCallback<PropertySchemaDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    public Observable<PropertySchemaDto> getPropertySchemaAsync() {
        return getPropertySchemaWithServiceResponseAsync().map(new Func1<ServiceResponse<PropertySchemaDto>, PropertySchemaDto>() {
            @Override
            public PropertySchemaDto call(ServiceResponse<PropertySchemaDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    public Observable<ServiceResponse<PropertySchemaDto>> getPropertySchemaWithServiceResponseAsync() {
        final List<String> propertyKeys = null;
        final DateTime asAt = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getPropertySchema(propertyKeysConverted, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertySchemaDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertySchemaDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertySchemaDto> clientResponse = getPropertySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchemaDto object if successful.
     */
    public PropertySchemaDto getPropertySchema(List<String> propertyKeys, DateTime asAt) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt).toBlocking().single().body();
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertySchemaDto> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchemaDto> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    public Observable<PropertySchemaDto> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt).map(new Func1<ServiceResponse<PropertySchemaDto>, PropertySchemaDto>() {
            @Override
            public PropertySchemaDto call(ServiceResponse<PropertySchemaDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    public Observable<ServiceResponse<PropertySchemaDto>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt) {
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getPropertySchema(propertyKeysConverted, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertySchemaDto>>>() {
                @Override
                public Observable<ServiceResponse<PropertySchemaDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertySchemaDto> clientResponse = getPropertySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertySchemaDto> getPropertySchemaDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<PropertySchemaDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertySchemaDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListUiDataType object if successful.
     */
    public ResourceListUiDataType getValueTypes() {
        return getValueTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListUiDataType> getValueTypesAsync(final ServiceCallback<ResourceListUiDataType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListUiDataType object
     */
    public Observable<ResourceListUiDataType> getValueTypesAsync() {
        return getValueTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListUiDataType>, ResourceListUiDataType>() {
            @Override
            public ResourceListUiDataType call(ServiceResponse<ResourceListUiDataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListUiDataType object
     */
    public Observable<ServiceResponse<ResourceListUiDataType>> getValueTypesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListUiDataType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListUiDataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListUiDataType> clientResponse = getValueTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListUiDataType object if successful.
     */
    public ResourceListUiDataType getValueTypes(List<String> sortBy, Integer start, Integer limit) {
        return getValueTypesWithServiceResponseAsync(sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListUiDataType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListUiDataType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListUiDataType object
     */
    public Observable<ResourceListUiDataType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit) {
        return getValueTypesWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListUiDataType>, ResourceListUiDataType>() {
            @Override
            public ResourceListUiDataType call(ServiceResponse<ResourceListUiDataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListUiDataType object
     */
    public Observable<ServiceResponse<ResourceListUiDataType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListUiDataType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListUiDataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListUiDataType> clientResponse = getValueTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListUiDataType> getValueTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListUiDataType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListUiDataType>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientSecuritiesDto object if successful.
     */
    public TryAddClientSecuritiesDto batchAddClientSecurities() {
        return batchAddClientSecuritiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(final ServiceCallback<TryAddClientSecuritiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientSecuritiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    public Observable<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync() {
        return batchAddClientSecuritiesWithServiceResponseAsync().map(new Func1<ServiceResponse<TryAddClientSecuritiesDto>, TryAddClientSecuritiesDto>() {
            @Override
            public TryAddClientSecuritiesDto call(ServiceResponse<TryAddClientSecuritiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    public Observable<ServiceResponse<TryAddClientSecuritiesDto>> batchAddClientSecuritiesWithServiceResponseAsync() {
        final List<CreateClientSecurityRequest> definitions = null;
        return service.batchAddClientSecurities(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryAddClientSecuritiesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryAddClientSecuritiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryAddClientSecuritiesDto> clientResponse = batchAddClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientSecuritiesDto object if successful.
     */
    public TryAddClientSecuritiesDto batchAddClientSecurities(List<CreateClientSecurityRequest> definitions) {
        return batchAddClientSecuritiesWithServiceResponseAsync(definitions).toBlocking().single().body();
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions, final ServiceCallback<TryAddClientSecuritiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientSecuritiesWithServiceResponseAsync(definitions), serviceCallback);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    public Observable<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions) {
        return batchAddClientSecuritiesWithServiceResponseAsync(definitions).map(new Func1<ServiceResponse<TryAddClientSecuritiesDto>, TryAddClientSecuritiesDto>() {
            @Override
            public TryAddClientSecuritiesDto call(ServiceResponse<TryAddClientSecuritiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    public Observable<ServiceResponse<TryAddClientSecuritiesDto>> batchAddClientSecuritiesWithServiceResponseAsync(List<CreateClientSecurityRequest> definitions) {
        Validator.validate(definitions);
        return service.batchAddClientSecurities(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryAddClientSecuritiesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryAddClientSecuritiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryAddClientSecuritiesDto> clientResponse = batchAddClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryAddClientSecuritiesDto> batchAddClientSecuritiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<TryAddClientSecuritiesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TryAddClientSecuritiesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryDeleteClientSecuritiesDto object if successful.
     */
    public TryDeleteClientSecuritiesDto batchDeleteClientSecurities() {
        return batchDeleteClientSecuritiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(final ServiceCallback<TryDeleteClientSecuritiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientSecuritiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    public Observable<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync() {
        return batchDeleteClientSecuritiesWithServiceResponseAsync().map(new Func1<ServiceResponse<TryDeleteClientSecuritiesDto>, TryDeleteClientSecuritiesDto>() {
            @Override
            public TryDeleteClientSecuritiesDto call(ServiceResponse<TryDeleteClientSecuritiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    public Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> batchDeleteClientSecuritiesWithServiceResponseAsync() {
        final List<String> uids = null;
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
        return service.batchDeleteClientSecurities(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryDeleteClientSecuritiesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryDeleteClientSecuritiesDto> clientResponse = batchDeleteClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryDeleteClientSecuritiesDto object if successful.
     */
    public TryDeleteClientSecuritiesDto batchDeleteClientSecurities(List<String> uids) {
        return batchDeleteClientSecuritiesWithServiceResponseAsync(uids).toBlocking().single().body();
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(List<String> uids, final ServiceCallback<TryDeleteClientSecuritiesDto> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientSecuritiesWithServiceResponseAsync(uids), serviceCallback);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    public Observable<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(List<String> uids) {
        return batchDeleteClientSecuritiesWithServiceResponseAsync(uids).map(new Func1<ServiceResponse<TryDeleteClientSecuritiesDto>, TryDeleteClientSecuritiesDto>() {
            @Override
            public TryDeleteClientSecuritiesDto call(ServiceResponse<TryDeleteClientSecuritiesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    public Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> batchDeleteClientSecuritiesWithServiceResponseAsync(List<String> uids) {
        Validator.validate(uids);
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
        return service.batchDeleteClientSecurities(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryDeleteClientSecuritiesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryDeleteClientSecuritiesDto> clientResponse = batchDeleteClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<TryDeleteClientSecuritiesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryDeleteClientSecuritiesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecurityDto object if successful.
     */
    public SecurityDto getSecurity(String uid) {
        return getSecurityWithServiceResponseAsync(uid).toBlocking().single().body();
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SecurityDto> getSecurityAsync(String uid, final ServiceCallback<SecurityDto> serviceCallback) {
        return ServiceFuture.fromResponse(getSecurityWithServiceResponseAsync(uid), serviceCallback);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    public Observable<SecurityDto> getSecurityAsync(String uid) {
        return getSecurityWithServiceResponseAsync(uid).map(new Func1<ServiceResponse<SecurityDto>, SecurityDto>() {
            @Override
            public SecurityDto call(ServiceResponse<SecurityDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    public Observable<ServiceResponse<SecurityDto>> getSecurityWithServiceResponseAsync(String uid) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getSecurity(uid, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SecurityDto>>>() {
                @Override
                public Observable<ServiceResponse<SecurityDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SecurityDto> clientResponse = getSecurityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecurityDto object if successful.
     */
    public SecurityDto getSecurity(String uid, DateTime asAt, List<String> propertyKeys) {
        return getSecurityWithServiceResponseAsync(uid, asAt, propertyKeys).toBlocking().single().body();
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SecurityDto> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys, final ServiceCallback<SecurityDto> serviceCallback) {
        return ServiceFuture.fromResponse(getSecurityWithServiceResponseAsync(uid, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    public Observable<SecurityDto> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys) {
        return getSecurityWithServiceResponseAsync(uid, asAt, propertyKeys).map(new Func1<ServiceResponse<SecurityDto>, SecurityDto>() {
            @Override
            public SecurityDto call(ServiceResponse<SecurityDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    public Observable<ServiceResponse<SecurityDto>> getSecurityWithServiceResponseAsync(String uid, DateTime asAt, List<String> propertyKeys) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getSecurity(uid, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SecurityDto>>>() {
                @Override
                public Observable<ServiceResponse<SecurityDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SecurityDto> clientResponse = getSecurityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SecurityDto> getSecurityDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<SecurityDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SecurityDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    public TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodes(String codeType) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType).toBlocking().single().body();
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesWithServiceResponseAsync(codeType), serviceCallback);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType).map(new Func1<ServiceResponse<TryLookupSecuritiesFromCodesDto>, TryLookupSecuritiesFromCodesDto>() {
            @Override
            public TryLookupSecuritiesFromCodesDto call(ServiceResponse<TryLookupSecuritiesFromCodesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String codesConverted = this.serializerAdapter().serializeList(codes, CollectionFormat.MULTI);String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodes(codeType, codesConverted, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryLookupSecuritiesFromCodesDto> clientResponse = lookupSecuritiesFromCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    public TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).map(new Func1<ServiceResponse<TryLookupSecuritiesFromCodesDto>, TryLookupSecuritiesFromCodesDto>() {
            @Override
            public TryLookupSecuritiesFromCodesDto call(ServiceResponse<TryLookupSecuritiesFromCodesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        Validator.validate(codes);
        Validator.validate(propertyKeys);
        String codesConverted = this.serializerAdapter().serializeList(codes, CollectionFormat.MULTI);String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodes(codeType, codesConverted, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryLookupSecuritiesFromCodesDto> clientResponse = lookupSecuritiesFromCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<TryLookupSecuritiesFromCodesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryLookupSecuritiesFromCodesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    public TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodesBulk(String codeType) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType).toBlocking().single().body();
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType), serviceCallback);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType).map(new Func1<ServiceResponse<TryLookupSecuritiesFromCodesDto>, TryLookupSecuritiesFromCodesDto>() {
            @Override
            public TryLookupSecuritiesFromCodesDto call(ServiceResponse<TryLookupSecuritiesFromCodesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodesBulk(codeType, codes, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryLookupSecuritiesFromCodesDto> clientResponse = lookupSecuritiesFromCodesBulkDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    public TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodesBulk(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).map(new Func1<ServiceResponse<TryLookupSecuritiesFromCodesDto>, TryLookupSecuritiesFromCodesDto>() {
            @Override
            public TryLookupSecuritiesFromCodesDto call(ServiceResponse<TryLookupSecuritiesFromCodesDto> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        Validator.validate(codes);
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodesBulk(codeType, codes, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>>>() {
                @Override
                public Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryLookupSecuritiesFromCodesDto> clientResponse = lookupSecuritiesFromCodesBulkDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<TryLookupSecuritiesFromCodesDto, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryLookupSecuritiesFromCodesDto>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
