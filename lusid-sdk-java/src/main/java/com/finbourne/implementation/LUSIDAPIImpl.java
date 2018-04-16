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
import com.finbourne.models.AggregationRequest;
import com.finbourne.models.AnalyticStoreDto;
import com.finbourne.models.ClassificationsDto;
import com.finbourne.models.CorporateActionEventDto;
import com.finbourne.models.CreateAnalyticStoreRequest;
import com.finbourne.models.CreateClientSecurityRequest;
import com.finbourne.models.CreateDerivedPortfolioRequest;
import com.finbourne.models.CreateGroupRequest;
import com.finbourne.models.CreatePortfolioRequest;
import com.finbourne.models.CreatePropertyDataFormatRequest;
import com.finbourne.models.CreatePropertyDefinitionRequest;
import com.finbourne.models.CreateResultsRequest;
import com.finbourne.models.DeletedEntityResponse;
import com.finbourne.models.ErrorResponse;
import com.finbourne.models.ExpandedGroupDto;
import com.finbourne.models.GroupDto;
import com.finbourne.models.HoldingAdjustmentDto;
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
import com.finbourne.models.PropertyDto;
import com.finbourne.models.PropertySchemaDto;
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
import com.finbourne.models.ResourceListReferencePortfolioConstituentDto;
import com.finbourne.models.ResourceListScope;
import com.finbourne.models.ResourceListUiDataType;
import com.finbourne.models.ResultsDto;
import com.finbourne.models.SchemaDto;
import com.finbourne.models.SecurityAnalyticDataDto;
import com.finbourne.models.SecurityClassificationDto;
import com.finbourne.models.SecurityDto;
import com.finbourne.models.TradeDto;
import com.finbourne.models.TransactionCodeMovementsDto;
import com.finbourne.models.TryAddClientSecuritiesDto;
import com.finbourne.models.TryDeleteClientSecuritiesDto;
import com.finbourne.models.TryLookupSecuritiesFromCodesDto;
import com.finbourne.models.UpdateGroupRequest;
import com.finbourne.models.UpdatePortfolioRequest;
import com.finbourne.models.UpdatePropertyDataFormatRequest;
import com.finbourne.models.UpdatePropertyDefinitionRequest;
import com.finbourne.models.UpsertCorporateActionRequest;
import com.finbourne.models.UpsertPersonalisationsResponse;
import com.finbourne.models.UpsertPortfolioTradesDto;
import com.finbourne.models.UpsertReferencePortfolioConstituentsDto;
import com.finbourne.models.VersionedResourceListHoldingDto;
import com.finbourne.models.VersionedResourceListTradeDto;
import com.finbourne.models.WebLogMessage;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.RestException;
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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listCorporateActions" })
        @GET("v1/api/actions/{scope}/{sourceId}")
        Observable<Response<ResponseBody>> listCorporateActions(@Path("scope") String scope, @Path("sourceId") String sourceId, @Query("effectiveDate") DateTime effectiveDate, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertCorporateAction" })
        @POST("v1/api/actions/{scope}/{sourceId}")
        Observable<Response<ResponseBody>> upsertCorporateAction(@Path("scope") String scope, @Path("sourceId") String sourceId, @Body UpsertCorporateActionRequest createRequest);

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
        @POST("v1/api/aggregation/results/{scope}/{resultsKey}/{resultsDate}")
        Observable<Response<ResponseBody>> getAggregationByResultSet(@Path("scope") String scope, @Path("resultsKey") String resultsKey, @Path("resultsDate") String resultsDate, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getNestedAggregationByResultSet" })
        @POST("v1/api/aggregation/results/nested/{scope}/{resultsKey}/{resultsDate}")
        Observable<Response<ResponseBody>> getNestedAggregationByResultSet(@Path("scope") String scope, @Path("resultsKey") String resultsKey, @Path("resultsDate") DateTime resultsDate, @Body AggregationRequest request);

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

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertClassification" })
        @POST("v1/api/classifications")
        Observable<Response<ResponseBody>> upsertClassification(@Body List<SecurityClassificationDto> classifications);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTransactionCode" })
        @POST("v1/api/configuration/addtransactioncode")
        Observable<Response<ResponseBody>> addTransactionCode(@Body TransactionCodeMovementsDto code);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getTransactionCodes" })
        @GET("v1/api/configuration/gettransactioncodes")
        Observable<Response<ResponseBody>> getTransactionCodes();

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI uploadTransactionCodes" })
        @POST("v1/api/configuration/uploadtransactioncodes")
        Observable<Response<ResponseBody>> uploadTransactionCodes(@Body List<TransactionCodeMovementsDto> codes);

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
        Observable<Response<ResponseBody>> getAggregateHoldings(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI adjustHoldings" })
        @POST("v1/api/portfolios/{scope}/{code}/holdings/{effectiveAt}")
        Observable<Response<ResponseBody>> adjustHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<HoldingAdjustmentDto> holdings);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getProperties" })
        @GET("v1/api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> getProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("propertyFilter") String propertyFilter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioProperties" })
        @POST("v1/api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> upsertPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Body List<PropertyDto> properties, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperty" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperty(@Path("scope") String scope, @Path("code") String code, @Query("property") String property, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperties" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/properties/all", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getTrades" })
        @GET("v1/api/portfolios/{scope}/{code}/trades")
        Observable<Response<ResponseBody>> getTrades(@Path("scope") String scope, @Path("code") String code, @Query("fromTradeDate") DateTime fromTradeDate, @Query("toTradeDate") DateTime toTradeDate, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("propertyFilter") String propertyFilter, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertTrades" })
        @POST("v1/api/portfolios/{scope}/{code}/trades")
        Observable<Response<ResponseBody>> upsertTrades(@Path("scope") String scope, @Path("code") String code, @Body List<TradeDto> trades);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteTrades" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/trades", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteTrades(@Path("scope") String scope, @Path("code") String code, @Query("cancelDate") DateTime cancelDate, @Query("id") String id);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTradeProperty" })
        @POST("v1/api/portfolios/{scope}/{code}/trades/{tradeId}/properties")
        Observable<Response<ResponseBody>> addTradeProperty(@Path("scope") String scope, @Path("code") String code, @Path("tradeId") String tradeId, @Body List<PropertyDto> properties);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyFromTrade" })
        @HTTP(path = "v1/api/portfolios/{scope}/{code}/trades/{tradeId}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyFromTrade(@Path("scope") String scope, @Path("code") String code, @Path("tradeId") String tradeId, @Query("property") String property);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTradePropertyToAll" })
        @POST("v1/api/portfolios/{scope}/{code}/trades/properties")
        Observable<Response<ResponseBody>> addTradePropertyToAll(@Path("scope") String scope, @Path("code") String code, @Body List<PropertyDto> properties);

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
        Observable<Response<ResponseBody>> getMultiplePropertyDefinitions(@Query("keys") String keys, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAllPropertyKeysInDomain" })
        @GET("v1/api/propertydefinitions/{domain}")
        Observable<Response<ResponseBody>> getAllPropertyKeysInDomain(@Path("domain") String domain, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinitionScopesInDomain" })
        @GET("v1/api/propertydefinitions/{domain}/_scopes")
        Observable<Response<ResponseBody>> getPropertyDefinitionScopesInDomain(@Path("domain") String domain, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAllPropertyKeysInScope" })
        @GET("v1/api/propertydefinitions/{domain}/{scope}")
        Observable<Response<ResponseBody>> getAllPropertyKeysInScope(@Path("domain") String domain, @Path("scope") String scope, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

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
        Observable<Response<ResponseBody>> getPropertySchema(@Query("propertyKeys") String propertyKeys);

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
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listCorporateActions(String scope, String sourceId) {
        return listCorporateActionsWithServiceResponseAsync(scope, sourceId).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> listCorporateActionsAsync(String scope, String sourceId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listCorporateActionsWithServiceResponseAsync(scope, sourceId), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listCorporateActionsAsync(String scope, String sourceId) {
        return listCorporateActionsWithServiceResponseAsync(scope, sourceId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listCorporateActionsWithServiceResponseAsync(String scope, String sourceId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("Parameter sourceId is required and cannot be null.");
        }
        final DateTime effectiveDate = null;
        final DateTime asAt = null;
        return service.listCorporateActions(scope, sourceId, effectiveDate, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listCorporateActionsDelegate(response);
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
     * @param sourceId Corporate action source id
     * @param effectiveDate Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listCorporateActions(String scope, String sourceId, DateTime effectiveDate, DateTime asAt) {
        return listCorporateActionsWithServiceResponseAsync(scope, sourceId, effectiveDate, asAt).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @param effectiveDate Effective Date
     * @param asAt AsAt Date filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> listCorporateActionsAsync(String scope, String sourceId, DateTime effectiveDate, DateTime asAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listCorporateActionsWithServiceResponseAsync(scope, sourceId, effectiveDate, asAt), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @param effectiveDate Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listCorporateActionsAsync(String scope, String sourceId, DateTime effectiveDate, DateTime asAt) {
        return listCorporateActionsWithServiceResponseAsync(scope, sourceId, effectiveDate, asAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param sourceId Corporate action source id
     * @param effectiveDate Effective Date
     * @param asAt AsAt Date filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listCorporateActionsWithServiceResponseAsync(String scope, String sourceId, DateTime effectiveDate, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("Parameter sourceId is required and cannot be null.");
        }
        return service.listCorporateActions(scope, sourceId, effectiveDate, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listCorporateActionsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CorporateActionEventDto>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertCorporateAction(String scope, String sourceId) {
        return upsertCorporateActionWithServiceResponseAsync(scope, sourceId).toBlocking().single().body();
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertCorporateActionAsync(String scope, String sourceId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertCorporateActionWithServiceResponseAsync(scope, sourceId), serviceCallback);
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertCorporateActionAsync(String scope, String sourceId) {
        return upsertCorporateActionWithServiceResponseAsync(scope, sourceId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertCorporateActionWithServiceResponseAsync(String scope, String sourceId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("Parameter sourceId is required and cannot be null.");
        }
        final UpsertCorporateActionRequest createRequest = null;
        return service.upsertCorporateAction(scope, sourceId, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertCorporateActionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @param createRequest The corporate action creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertCorporateAction(String scope, String sourceId, UpsertCorporateActionRequest createRequest) {
        return upsertCorporateActionWithServiceResponseAsync(scope, sourceId, createRequest).toBlocking().single().body();
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @param createRequest The corporate action creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertCorporateActionAsync(String scope, String sourceId, UpsertCorporateActionRequest createRequest, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertCorporateActionWithServiceResponseAsync(scope, sourceId, createRequest), serviceCallback);
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @param createRequest The corporate action creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertCorporateActionAsync(String scope, String sourceId, UpsertCorporateActionRequest createRequest) {
        return upsertCorporateActionWithServiceResponseAsync(scope, sourceId, createRequest).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates/updates a corporate action.
     *
     * @param scope The intended scope of the corporate action
     * @param sourceId Source of the corporate action
     * @param createRequest The corporate action creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertCorporateActionWithServiceResponseAsync(String scope, String sourceId, UpsertCorporateActionRequest createRequest) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("Parameter sourceId is required and cannot be null.");
        }
        Validator.validate(createRequest);
        return service.upsertCorporateAction(scope, sourceId, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertCorporateActionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertCorporateActionDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<List<CorporateActionEventDto>>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByGroup(String scope, String groupCode) {
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
    public ServiceFuture<Object> getAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, groupCode), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByGroupAsync(String scope, String groupCode) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByGroup(String scope, String groupCode, AggregationRequest request) {
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
    public ServiceFuture<Object> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, groupCode, request), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request) {
        return getAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAggregationByGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByGroup(String scope, String groupCode) {
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
    public ServiceFuture<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode), serviceCallback);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByGroupAsync(String scope, String groupCode) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByGroup(String scope, String groupCode, AggregationRequest request) {
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
    public ServiceFuture<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode, request), serviceCallback);
    }

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, groupCode, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (groupCode == null) {
            throw new IllegalArgumentException("Parameter groupCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByGroup(scope, groupCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getNestedAggregationByGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByPortfolio(String scope, String portfolioCode) {
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
    public ServiceFuture<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByPortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request) {
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
    public ServiceFuture<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAggregationByPortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByPortfolio(String scope, String portfolioCode) {
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
    public ServiceFuture<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode), serviceCallback);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByPortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request) {
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
    public ServiceFuture<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request), serviceCallback);
    }

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request) {
        return getNestedAggregationByPortfolioWithServiceResponseAsync(scope, portfolioCode, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (portfolioCode == null) {
            throw new IllegalArgumentException("Parameter portfolioCode is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByPortfolio(scope, portfolioCode, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getNestedAggregationByPortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByResultSet(String scope, String resultsKey, String resultsDate) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate), serviceCallback);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, String resultsDate) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        if (resultsDate == null) {
            throw new IllegalArgumentException("Parameter resultsDate is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getAggregationByResultSet(scope, resultsKey, resultsDate, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByResultSetDelegate(response);
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
     * @param resultsDate the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregationByResultSet(String scope, String resultsKey, String resultsDate, AggregationRequest request) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request), serviceCallback);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        if (resultsDate == null) {
            throw new IllegalArgumentException("Parameter resultsDate is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getAggregationByResultSet(scope, resultsKey, resultsDate, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAggregationByResultSetDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ListAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByResultSet(String scope, String resultsKey, DateTime resultsDate) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate), serviceCallback);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, DateTime resultsDate) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        if (resultsDate == null) {
            throw new IllegalArgumentException("Parameter resultsDate is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByResultSet(scope, resultsKey, resultsDate, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByResultSetDelegate(response);
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
     * @param resultsDate the DateTime value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getNestedAggregationByResultSet(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request), serviceCallback);
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request) {
        return getNestedAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, resultsDate, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        if (resultsDate == null) {
            throw new IllegalArgumentException("Parameter resultsDate is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByResultSet(scope, resultsKey, resultsDate, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getNestedAggregationByResultSetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getNestedAggregationByResultSetDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<NestedAggregationResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listAnalyticStores() {
        return listAnalyticStoresWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> listAnalyticStoresAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listAnalyticStoresAsync() {
        return listAnalyticStoresWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listAnalyticStoresWithServiceResponseAsync() {
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listAnalyticStoresDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listAnalyticStoresDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listAnalyticStoresDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListAnalyticStoreKeyDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createAnalyticStore() {
        return createAnalyticStoreWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> createAnalyticStoreAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createAnalyticStoreAsync() {
        return createAnalyticStoreWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createAnalyticStoreWithServiceResponseAsync() {
        final CreateAnalyticStoreRequest request = null;
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createAnalyticStoreDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createAnalyticStore(CreateAnalyticStoreRequest request) {
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
    public ServiceFuture<Object> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createAnalyticStoreAsync(CreateAnalyticStoreRequest request) {
        return createAnalyticStoreWithServiceResponseAsync(request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request) {
        Validator.validate(request);
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createAnalyticStoreDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AnalyticStoreDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAnalyticStore(String scope, int year, int month, int day) {
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
    public ServiceFuture<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getAnalyticStoreAsync(String scope, int year, int month, int day) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAnalyticStoreDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAnalyticStore(String scope, int year, int month, int day, DateTime asAt) {
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
    public ServiceFuture<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAnalyticStoreDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStoreDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteAnalyticStore(String scope, int year, int month, int day) {
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
    public ServiceFuture<Object> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deleteAnalyticStoreAsync(String scope, int year, int month, int day) {
        return deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.deleteAnalyticStore(scope, year, month, day)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteAnalyticStoreDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object insertAnalytics(String scope, int year, int month, int day) {
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
    public ServiceFuture<Object> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> insertAnalyticsAsync(String scope, int year, int month, int day) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<SecurityAnalyticDataDto> data = null;
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = insertAnalyticsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object insertAnalytics(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
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
    public ServiceFuture<Object> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(data);
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = insertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> insertAnalyticsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStoreDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertClassification() {
        return upsertClassificationWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Update classification data.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertClassificationAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertClassificationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertClassificationAsync() {
        return upsertClassificationWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertClassificationWithServiceResponseAsync() {
        final List<SecurityClassificationDto> classifications = null;
        return service.upsertClassification(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertClassificationDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertClassification(List<SecurityClassificationDto> classifications) {
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
    public ServiceFuture<Object> upsertClassificationAsync(List<SecurityClassificationDto> classifications, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertClassificationWithServiceResponseAsync(classifications), serviceCallback);
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertClassificationAsync(List<SecurityClassificationDto> classifications) {
        return upsertClassificationWithServiceResponseAsync(classifications).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertClassificationWithServiceResponseAsync(List<SecurityClassificationDto> classifications) {
        Validator.validate(classifications);
        return service.upsertClassification(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertClassificationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertClassificationDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<ClassificationsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTransactionCode() {
        return addTransactionCodeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> addTransactionCodeAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionCodeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addTransactionCodeAsync() {
        return addTransactionCodeWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTransactionCodeWithServiceResponseAsync() {
        final TransactionCodeMovementsDto code = null;
        return service.addTransactionCode(code)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTransactionCodeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @param code transaction code to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTransactionCode(TransactionCodeMovementsDto code) {
        return addTransactionCodeWithServiceResponseAsync(code).toBlocking().single().body();
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @param code transaction code to add
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> addTransactionCodeAsync(TransactionCodeMovementsDto code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionCodeWithServiceResponseAsync(code), serviceCallback);
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @param code transaction code to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addTransactionCodeAsync(TransactionCodeMovementsDto code) {
        return addTransactionCodeWithServiceResponseAsync(code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction code movement to the list of existing codes.
     *
     * @param code transaction code to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTransactionCodeWithServiceResponseAsync(TransactionCodeMovementsDto code) {
        Validator.validate(code);
        return service.addTransactionCode(code)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTransactionCodeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> addTransactionCodeDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TransactionCodeMovementsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the list of persisted transaction codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getTransactionCodes() {
        return getTransactionCodesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the list of persisted transaction codes.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getTransactionCodesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTransactionCodesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the list of persisted transaction codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getTransactionCodesAsync() {
        return getTransactionCodesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of persisted transaction codes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getTransactionCodesWithServiceResponseAsync() {
        return service.getTransactionCodes()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTransactionCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getTransactionCodesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<List<TransactionCodeMovementsDto>>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object uploadTransactionCodes() {
        return uploadTransactionCodesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> uploadTransactionCodesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(uploadTransactionCodesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> uploadTransactionCodesAsync() {
        return uploadTransactionCodesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> uploadTransactionCodesWithServiceResponseAsync() {
        final List<TransactionCodeMovementsDto> codes = null;
        return service.uploadTransactionCodes(codes)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = uploadTransactionCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @param codes Codes to be uploaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object uploadTransactionCodes(List<TransactionCodeMovementsDto> codes) {
        return uploadTransactionCodesWithServiceResponseAsync(codes).toBlocking().single().body();
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @param codes Codes to be uploaded
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> uploadTransactionCodesAsync(List<TransactionCodeMovementsDto> codes, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(uploadTransactionCodesWithServiceResponseAsync(codes), serviceCallback);
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @param codes Codes to be uploaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> uploadTransactionCodesAsync(List<TransactionCodeMovementsDto> codes) {
        return uploadTransactionCodesWithServiceResponseAsync(codes).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transation codes to be used by the movements engine.
     *
     * @param codes Codes to be uploaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> uploadTransactionCodesWithServiceResponseAsync(List<TransactionCodeMovementsDto> codes) {
        Validator.validate(codes);
        return service.uploadTransactionCodes(codes)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = uploadTransactionCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> uploadTransactionCodesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<List<TransactionCodeMovementsDto>>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getDownloadUrl() {
        return getDownloadUrlWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getDownloadUrlAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getDownloadUrlWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getDownloadUrlAsync() {
        return getDownloadUrlWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getDownloadUrlWithServiceResponseAsync() {
        final String version = null;
        return service.getDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDownloadUrlDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getDownloadUrl(String version) {
        return getDownloadUrlWithServiceResponseAsync(version).toBlocking().single().body();
    }

    /**
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getDownloadUrlAsync(String version, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getDownloadUrlWithServiceResponseAsync(version), serviceCallback);
    }

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getDownloadUrlAsync(String version) {
        return getDownloadUrlWithServiceResponseAsync(version).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getDownloadUrlWithServiceResponseAsync(String version) {
        return service.getDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDownloadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDownloadUrlDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getLatestVersion() {
        return getLatestVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getLatestVersionAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getLatestVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getLatestVersionAsync() {
        return getLatestVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getLatestVersionWithServiceResponseAsync() {
        return service.getLatestVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getLatestVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getLatestVersionDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolioGroups(String scope) {
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
    public ServiceFuture<Object> listPortfolioGroupsAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfolioGroupsAsync(String scope) {
        return listPortfolioGroupsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfolioGroupsWithServiceResponseAsync(String scope) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfolioGroupsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioGroups(scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfolioGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listPortfolioGroupsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListGroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPortfolioGroup(String scope) {
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
    public ServiceFuture<Object> createPortfolioGroupAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPortfolioGroupAsync(String scope) {
        return createPortfolioGroupWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPortfolioGroupWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateGroupRequest request = null;
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPortfolioGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPortfolioGroup(String scope, CreateGroupRequest request) {
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
    public ServiceFuture<Object> createPortfolioGroupAsync(String scope, CreateGroupRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope, request), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPortfolioGroupAsync(String scope, CreateGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPortfolioGroupWithServiceResponseAsync(String scope, CreateGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(request);
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createPortfolioGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroup(String scope, String code) {
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
    public ServiceFuture<Object> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupAsync(String scope, String code) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroup(String scope, String code, DateTime asAt) {
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
    public ServiceFuture<Object> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code, asAt), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupAsync(String scope, String code, DateTime asAt) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code, asAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPortfolioGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioGroup(String scope, String code) {
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
    public ServiceFuture<Object> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioGroupAsync(String scope, String code) {
        return deletePortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioGroup(scope, code)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroupCommands(String scope, String code) {
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
    public ServiceFuture<Object> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupCommandsAsync(String scope, String code) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupCommandsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
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
    public ServiceFuture<Object> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPortfolioGroupCommandsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListProcessedCommandDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroupExpansion(String scope, String code) {
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
    public ServiceFuture<Object> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupExpansionAsync(String scope, String code) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupExpansionDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
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
    public ServiceFuture<Object> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioGroupExpansionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPortfolioGroupExpansionDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ExpandedGroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addPortfolioToGroup(String scope, String code) {
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
    public ServiceFuture<Object> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addPortfolioToGroupAsync(String scope, String code) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addPortfolioToGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addPortfolioToGroup(String scope, String code, ResourceId identifier) {
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
    public ServiceFuture<Object> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addPortfolioToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> addPortfolioToGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode) {
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
    public ServiceFuture<Object> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode) {
        return deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioFromGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addSubGroupToGroup(String scope, String code) {
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
    public ServiceFuture<Object> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addSubGroupToGroupAsync(String scope, String code) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addSubGroupToGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addSubGroupToGroup(String scope, String code, ResourceId identifier) {
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
    public ServiceFuture<Object> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addSubGroupToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> addSubGroupToGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode) {
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
    public ServiceFuture<Object> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode) {
        return deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteSubGroupFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteSubGroupFromGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePortfolioGroup(String scope, String code) {
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
    public ServiceFuture<Object> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePortfolioGroupAsync(String scope, String code) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdateGroupRequest request = null;
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePortfolioGroupDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePortfolioGroup(String scope, String code, UpdateGroupRequest request) {
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
    public ServiceFuture<Object> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdateGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> updatePortfolioGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<GroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object portfolioGroupsSearch() {
        return portfolioGroupsSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> portfolioGroupsSearchAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(portfolioGroupsSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> portfolioGroupsSearchAsync() {
        return portfolioGroupsSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> portfolioGroupsSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = portfolioGroupsSearchDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = portfolioGroupsSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> portfolioGroupsSearchDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListGroupDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getHealth() {
        return getHealthWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getHealthAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getHealthWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getHealthAsync() {
        return getHealthWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getHealthWithServiceResponseAsync() {
        return service.getHealth()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getHealthDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getHealthDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getLoginInfo() {
        return getLoginInfoWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the login information.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getLoginInfoAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getLoginInfoWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getLoginInfoAsync() {
        return getLoginInfoWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getLoginInfoWithServiceResponseAsync() {
        return service.getLoginInfo()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getLoginInfoDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getLoginInfoDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<LoginResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object storeWebLogs() {
        return storeWebLogsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Store a log message.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> storeWebLogsAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(storeWebLogsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> storeWebLogsAsync() {
        return storeWebLogsWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> storeWebLogsWithServiceResponseAsync() {
        final WebLogMessage message = null;
        return service.storeWebLogs(message)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = storeWebLogsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object storeWebLogs(WebLogMessage message) {
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
    public ServiceFuture<Object> storeWebLogsAsync(WebLogMessage message, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(storeWebLogsWithServiceResponseAsync(message), serviceCallback);
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> storeWebLogsAsync(WebLogMessage message) {
        return storeWebLogsWithServiceResponseAsync(message).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> storeWebLogsWithServiceResponseAsync(WebLogMessage message) {
        Validator.validate(message);
        return service.storeWebLogs(message)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = storeWebLogsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> storeWebLogsDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(204, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getBuildVersion() {
        return getBuildVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getBuildVersionAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getBuildVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getBuildVersionAsync() {
        return getBuildVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getBuildVersionWithServiceResponseAsync() {
        return service.getBuildVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getBuildVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getBuildVersionDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object verifyConnectivity() {
        return verifyConnectivityWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> verifyConnectivityAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(verifyConnectivityWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> verifyConnectivityAsync() {
        return verifyConnectivityWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> verifyConnectivityWithServiceResponseAsync() {
        return service.verifyConnectivity()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = verifyConnectivityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> verifyConnectivityDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getVersion() {
        return getVersionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getVersionAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getVersionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getVersionAsync() {
        return getVersionWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getVersionWithServiceResponseAsync() {
        return service.getVersion()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getVersionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getVersionDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPersonalisations(boolean recursive, boolean wildcards) {
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
    public ServiceFuture<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(recursive, wildcards), serviceCallback);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards) {
        final String pattern = null;
        final String scope = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPersonalisationsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPersonalisations(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(recursive, wildcards, pattern, scope, sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPersonalisationsDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPersonalisationDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPersonalisations() {
        return upsertPersonalisationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertPersonalisationsAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPersonalisationsAsync() {
        return upsertPersonalisationsWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPersonalisationsWithServiceResponseAsync() {
        final List<PersonalisationDto> personalisations = null;
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPersonalisationsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPersonalisations(List<PersonalisationDto> personalisations) {
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
    public ServiceFuture<Object> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(personalisations), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPersonalisationsWithServiceResponseAsync(List<PersonalisationDto> personalisations) {
        Validator.validate(personalisations);
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertPersonalisationsDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertPersonalisationsResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePersonalisation(String scope) {
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
    public ServiceFuture<Object> deletePersonalisationAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePersonalisationAsync(String scope) {
        return deletePersonalisationWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePersonalisationWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final String key = null;
        final String group = null;
        return service.deletePersonalisation(key, scope, group)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePersonalisationDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePersonalisation(String scope, String key, String group) {
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
    public ServiceFuture<Object> deletePersonalisationAsync(String scope, String key, String group, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(scope, key, group), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePersonalisationAsync(String scope, String key, String group) {
        return deletePersonalisationWithServiceResponseAsync(scope, key, group).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePersonalisationWithServiceResponseAsync(String scope, String key, String group) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.deletePersonalisation(key, scope, group)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePersonalisationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePersonalisationDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolioScopes() {
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
    public ServiceFuture<Object> listPortfolioScopesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfolioScopesAsync() {
        return listPortfolioScopesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfolioScopesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfolioScopesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolioScopes(List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit) {
        return listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfolioScopesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listPortfolioScopesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListScope>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolios(String scope) {
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
    public ServiceFuture<Object> listPortfoliosAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfoliosAsync(String scope) {
        return listPortfoliosWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfoliosWithServiceResponseAsync(String scope) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfoliosDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listPortfoliosDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPortfolio(String scope) {
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
    public ServiceFuture<Object> createPortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPortfolioAsync(String scope) {
        return createPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreatePortfolioRequest createRequest = null;
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPortfolio(String scope, CreatePortfolioRequest createRequest) {
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
    public ServiceFuture<Object> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope, createRequest), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest) {
        return createPortfolioWithServiceResponseAsync(scope, createRequest).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest createRequest) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(createRequest);
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createPortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolio(String scope, String code) {
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
    public ServiceFuture<Object> getPortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioAsync(String scope, String code) {
        return getPortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioWithServiceResponseAsync(String scope, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
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
    public ServiceFuture<Object> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getPortfolio(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePortfolio(String scope, String code) {
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
    public ServiceFuture<Object> updatePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePortfolioAsync(String scope, String code) {
        return updatePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdatePortfolioRequest request = null;
        final DateTime effectiveAt = null;
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
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
    public ServiceFuture<Object> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        return updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> updatePortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolio(String scope, String code) {
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
    public ServiceFuture<Object> deletePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioAsync(String scope, String code) {
        return deletePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolio(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getCommands(String scope, String code) {
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
    public ServiceFuture<Object> getCommandsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getCommandsAsync(String scope, String code) {
        return getCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getCommandsWithServiceResponseAsync(String scope, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getCommandsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
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
    public ServiceFuture<Object> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getCommandsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListProcessedCommandDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getDetails(String scope, String code) {
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
    public ServiceFuture<Object> getDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getDetailsAsync(String scope, String code) {
        return getDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getDetailsWithServiceResponseAsync(String scope, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDetailsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
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
    public ServiceFuture<Object> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getDetails(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDetailsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetailsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPortfolioDetails(String scope, String code) {
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
    public ServiceFuture<Object> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPortfolioDetailsAsync(String scope, String code) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final PortfolioDetailsRequest details = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPortfolioDetailsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPortfolioDetails(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
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
    public ServiceFuture<Object> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(details);
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertPortfolioDetailsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetailsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioDetails(String scope, String code) {
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
    public ServiceFuture<Object> deletePortfolioDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioDetailsAsync(String scope, String code) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioDetailsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioDetails(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioDetailsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregateHoldings(String scope, String code) {
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
    public ServiceFuture<Object> getAggregateHoldingsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregateHoldingsAsync(String scope, String code) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code) {
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAggregateHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregateHoldingsDelegate(response);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAggregateHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
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
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAggregateHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAggregateHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAggregateHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAggregateHoldingsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListHoldingDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object adjustHoldings(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final List<HoldingAdjustmentDto> holdings = null;
        return service.adjustHoldings(scope, code, effectiveAt, holdings)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = adjustHoldingsDelegate(response);
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
     * @param holdings the List&lt;HoldingAdjustmentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object adjustHoldings(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdings).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdings the List&lt;HoldingAdjustmentDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdings), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create trades in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdings the List&lt;HoldingAdjustmentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdings).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param holdings the List&lt;HoldingAdjustmentDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(holdings);
        return service.adjustHoldings(scope, code, effectiveAt, holdings)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = adjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> adjustHoldingsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioTradesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getProperties(String scope, String code) {
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
    public ServiceFuture<Object> getPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertiesAsync(String scope, String code) {
        return getPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertiesWithServiceResponseAsync(String scope, String code) {
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
        final List<String> propertyFilter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertiesDelegate(response);
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
     * @param propertyFilter Property to filter the results by
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter) {
        return getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, propertyFilter).toBlocking().single().body();
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
     * @param propertyFilter Property to filter the results by
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, propertyFilter), serviceCallback);
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
     * @param propertyFilter Property to filter the results by
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter) {
        return getPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, propertyFilter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param propertyFilter Property to filter the results by
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(propertyFilter);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertiesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioPropertiesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPortfolioProperties(String scope, String code) {
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
    public ServiceFuture<Object> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPortfolioPropertiesAsync(String scope, String code) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<PropertyDto> properties = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioProperties(scope, code, properties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPortfolioPropertiesDelegate(response);
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
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertPortfolioProperties(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt).toBlocking().single().body();
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> upsertPortfolioPropertiesAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertPortfolioPropertiesAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, properties, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.upsertPortfolioProperties(scope, code, properties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertPortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertPortfolioPropertiesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioPropertiesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioProperty(String scope, String code) {
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
    public ServiceFuture<Object> deletePortfolioPropertyAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertyWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioPropertyAsync(String scope, String code) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final String property = null;
        final DateTime effectiveAt = null;
        return service.deletePortfolioProperty(scope, code, property, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioPropertyDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioProperty(String scope, String code, String property, DateTime effectiveAt) {
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
    public ServiceFuture<Object> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt) {
        return deletePortfolioPropertyWithServiceResponseAsync(scope, code, property, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code, String property, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioProperty(scope, code, property, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioPropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioPropertyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioProperties(String scope, String code) {
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
    public ServiceFuture<Object> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioPropertiesAsync(String scope, String code) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deletePortfolioProperties(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioPropertiesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePortfolioProperties(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePortfolioProperties(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePortfolioPropertiesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getTrades(String scope, String code) {
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
    public ServiceFuture<Object> getTradesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTradesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getTradesAsync(String scope, String code) {
        return getTradesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getTradesWithServiceResponseAsync(String scope, String code) {
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
        final List<String> propertyFilter = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getTrades(scope, code, fromTradeDate, toTradeDate, asAt, sortByConverted, start, limit, propertyFilterConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTradesDelegate(response);
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
     * @param propertyFilter the List&lt;String&gt; value
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getTrades(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter) {
        return getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, propertyFilter, filter).toBlocking().single().body();
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
     * @param propertyFilter the List&lt;String&gt; value
     * @param filter Trade filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, propertyFilter, filter), serviceCallback);
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
     * @param propertyFilter the List&lt;String&gt; value
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter) {
        return getTradesWithServiceResponseAsync(scope, code, fromTradeDate, toTradeDate, asAt, sortBy, start, limit, propertyFilter, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param propertyFilter the List&lt;String&gt; value
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getTradesWithServiceResponseAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(propertyFilter);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
        return service.getTrades(scope, code, fromTradeDate, toTradeDate, asAt, sortByConverted, start, limit, propertyFilterConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getTradesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListTradeDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertTrades(String scope, String code) {
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
    public ServiceFuture<Object> upsertTradesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTradesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertTradesAsync(String scope, String code) {
        return upsertTradesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertTradesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<TradeDto> trades = null;
        return service.upsertTrades(scope, code, trades)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertTradesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertTrades(String scope, String code, List<TradeDto> trades) {
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
    public ServiceFuture<Object> upsertTradesAsync(String scope, String code, List<TradeDto> trades, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTradesWithServiceResponseAsync(scope, code, trades), serviceCallback);
    }

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertTradesAsync(String scope, String code, List<TradeDto> trades) {
        return upsertTradesWithServiceResponseAsync(scope, code, trades).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertTradesWithServiceResponseAsync(String scope, String code, List<TradeDto> trades) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(trades);
        return service.upsertTrades(scope, code, trades)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertTradesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioTradesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param cancelDate Date on which trades are deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteTrades(String scope, String code, DateTime cancelDate) {
        return deleteTradesWithServiceResponseAsync(scope, code, cancelDate).toBlocking().single().body();
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param cancelDate Date on which trades are deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTradesWithServiceResponseAsync(scope, code, cancelDate), serviceCallback);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param cancelDate Date on which trades are deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate) {
        return deleteTradesWithServiceResponseAsync(scope, code, cancelDate).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param cancelDate Date on which trades are deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteTradesWithServiceResponseAsync(String scope, String code, DateTime cancelDate) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (cancelDate == null) {
            throw new IllegalArgumentException("Parameter cancelDate is required and cannot be null.");
        }
        final List<String> id = null;
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.MULTI);
        return service.deleteTrades(scope, code, cancelDate, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteTradesDelegate(response);
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
     * @param cancelDate Date on which trades are deleted
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteTrades(String scope, String code, DateTime cancelDate, List<String> id) {
        return deleteTradesWithServiceResponseAsync(scope, code, cancelDate, id).toBlocking().single().body();
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param cancelDate Date on which trades are deleted
     * @param id Ids of trades to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, List<String> id, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTradesWithServiceResponseAsync(scope, code, cancelDate, id), serviceCallback);
    }

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param cancelDate Date on which trades are deleted
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, List<String> id) {
        return deleteTradesWithServiceResponseAsync(scope, code, cancelDate, id).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @param cancelDate Date on which trades are deleted
     * @param id Ids of trades to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteTradesWithServiceResponseAsync(String scope, String code, DateTime cancelDate, List<String> id) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (cancelDate == null) {
            throw new IllegalArgumentException("Parameter cancelDate is required and cannot be null.");
        }
        Validator.validate(id);
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.MULTI);
        return service.deleteTrades(scope, code, cancelDate, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteTradesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteTradesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTradeProperty(String scope, String code, String tradeId) {
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
    public ServiceFuture<Object> addTradePropertyAsync(String scope, String code, String tradeId, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> addTradePropertyAsync(String scope, String code, String tradeId) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (tradeId == null) {
            throw new IllegalArgumentException("Parameter tradeId is required and cannot be null.");
        }
        final List<PropertyDto> properties = null;
        return service.addTradeProperty(scope, code, tradeId, properties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTradePropertyDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTradeProperty(String scope, String code, String tradeId, List<PropertyDto> properties) {
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
    public ServiceFuture<Object> addTradePropertyAsync(String scope, String code, String tradeId, List<PropertyDto> properties, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> addTradePropertyAsync(String scope, String code, String tradeId, List<PropertyDto> properties) {
        return addTradePropertyWithServiceResponseAsync(scope, code, tradeId, properties).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId, List<PropertyDto> properties) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTradePropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> addTradePropertyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AddTradePropertyDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePropertyFromTrade(String scope, String code, String tradeId) {
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
    public ServiceFuture<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePropertyFromTradeDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePropertyFromTrade(String scope, String code, String tradeId, String property) {
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
    public ServiceFuture<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property) {
        return deletePropertyFromTradeWithServiceResponseAsync(scope, code, tradeId, property).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId, String property) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePropertyFromTradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePropertyFromTradeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTradePropertyToAll(String scope, String code) {
        return addTradePropertyToAllWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> addTradePropertyToAllAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addTradePropertyToAllWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addTradePropertyToAllAsync(String scope, String code) {
        return addTradePropertyToAllWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTradePropertyToAllWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<PropertyDto> properties = null;
        return service.addTradePropertyToAll(scope, code, properties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTradePropertyToAllDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties Properties to add to all trades
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object addTradePropertyToAll(String scope, String code, List<PropertyDto> properties) {
        return addTradePropertyToAllWithServiceResponseAsync(scope, code, properties).toBlocking().single().body();
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties Properties to add to all trades
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> addTradePropertyToAllAsync(String scope, String code, List<PropertyDto> properties, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(addTradePropertyToAllWithServiceResponseAsync(scope, code, properties), serviceCallback);
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties Properties to add to all trades
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> addTradePropertyToAllAsync(String scope, String code, List<PropertyDto> properties) {
        return addTradePropertyToAllWithServiceResponseAsync(scope, code, properties).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties Properties to add to all trades
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> addTradePropertyToAllWithServiceResponseAsync(String scope, String code, List<PropertyDto> properties) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.addTradePropertyToAll(scope, code, properties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = addTradePropertyToAllDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> addTradePropertyToAllDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AddTradePropertyDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createDerivedPortfolio(String scope) {
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
    public ServiceFuture<Object> createDerivedPortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createDerivedPortfolioAsync(String scope) {
        return createDerivedPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createDerivedPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateDerivedPortfolioRequest portfolio = null;
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createDerivedPortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createDerivedPortfolio(String scope, CreateDerivedPortfolioRequest portfolio) {
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
    public ServiceFuture<Object> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope, portfolio), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio) {
        return createDerivedPortfolioWithServiceResponseAsync(scope, portfolio).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedPortfolioRequest portfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(portfolio);
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createDerivedPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createDerivedPortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object portfoliosSearch() {
        return portfoliosSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> portfoliosSearchAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(portfoliosSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> portfoliosSearchAsync() {
        return portfoliosSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> portfoliosSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = portfoliosSearchDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = portfoliosSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> portfoliosSearchDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioSearchResult>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object propertiesSearch() {
        return propertiesSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> propertiesSearchAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> propertiesSearchAsync() {
        return propertiesSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> propertiesSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = propertiesSearchDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = propertiesSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> propertiesSearchDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDefinitionDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinitionDomains() {
        return getPropertyDefinitionDomainsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertyDefinitionDomainsAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionDomainsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionDomainsAsync() {
        return getPropertyDefinitionDomainsWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionDomainsWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionDomains(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionDomainsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinitionDomains(List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionDomainsWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit) {
        return getPropertyDefinitionDomainsWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionDomainsWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionDomains(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionDomainsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertyDefinitionDomainsDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDomain>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPropertyDefinition() {
        return createPropertyDefinitionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> createPropertyDefinitionAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPropertyDefinitionAsync() {
        return createPropertyDefinitionWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPropertyDefinitionWithServiceResponseAsync() {
        final CreatePropertyDefinitionRequest definition = null;
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPropertyDefinitionDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPropertyDefinition(CreatePropertyDefinitionRequest definition) {
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
    public ServiceFuture<Object> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(definition), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition) {
        return createPropertyDefinitionWithServiceResponseAsync(definition).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition) {
        Validator.validate(definition);
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createPropertyDefinitionDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getMultiplePropertyDefinitions() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getMultiplePropertyDefinitionsAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getMultiplePropertyDefinitionsAsync() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getMultiplePropertyDefinitionsWithServiceResponseAsync() {
        final List<String> keys = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(keysConverted, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
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
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getMultiplePropertyDefinitions(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getMultiplePropertyDefinitionsAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getMultiplePropertyDefinitionsAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets multiple property definitions.
     *
     * @param keys the List&lt;String&gt; value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(keys);
        Validator.validate(sortBy);
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(keysConverted, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getMultiplePropertyDefinitionsDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDefinitionDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAllPropertyKeysInDomain(String domain) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAllPropertyKeysInDomainAsync(String domain, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInDomainWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAllPropertyKeysInDomainAsync(String domain) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAllPropertyKeysInDomainDelegate(response);
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
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAllPropertyKeysInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAllPropertyKeysInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAllPropertyKeysInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAllPropertyKeysInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAllPropertyKeysInDomainDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyKey>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinitionScopesInDomain(String domain) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertyDefinitionScopesInDomainAsync(String domain, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionScopesInDomainAsync(String domain) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionScopesInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionScopesInDomainDelegate(response);
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
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinitionScopesInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPropertyDefinitionScopesInDomainWithServiceResponseAsync(domain, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPropertyDefinitionScopesInDomain(domain, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionScopesInDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertyDefinitionScopesInDomainDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListScope>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAllPropertyKeysInScope(String domain, String scope) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope).toBlocking().single().body();
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope), serviceCallback);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAllPropertyKeysInScopeAsync(String domain, String scope) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInScope(domain, scope, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAllPropertyKeysInScopeDelegate(response);
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
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getAllPropertyKeysInScope(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getAllPropertyKeysInScopeWithServiceResponseAsync(domain, scope, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getAllPropertyKeysInScope(domain, scope, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getAllPropertyKeysInScopeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getAllPropertyKeysInScopeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyKey>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinition(String domain, String scope, String name) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionAsync(String domain, String scope, String name) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionDelegate(response);
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
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDefinition(String domain, String scope, String name, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt).toBlocking().single().body();
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt), serviceCallback);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, DateTime asAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertyDefinitionDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePropertyDefinition(String domain, String scope, String name) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePropertyDefinitionAsync(String domain, String scope, String name) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePropertyDefinitionDelegate(response);
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
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePropertyDefinition(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition).toBlocking().single().body();
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition), serviceCallback);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> updatePropertyDefinitionDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinitionDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deletePropertyDefinition(String domain, String scope, String name) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name).toBlocking().single().body();
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deletePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deletePropertyDefinitionAsync(String domain, String scope, String name) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deletePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deletePropertyDefinitionDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPropertyDataFormat() {
        return createPropertyDataFormatWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> createPropertyDataFormatAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDataFormatWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPropertyDataFormatAsync() {
        return createPropertyDataFormatWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPropertyDataFormatWithServiceResponseAsync() {
        final CreatePropertyDataFormatRequest request = null;
        return service.createPropertyDataFormat(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPropertyDataFormatDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createPropertyDataFormat(CreatePropertyDataFormatRequest request) {
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
    public ServiceFuture<Object> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDataFormatWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request) {
        return createPropertyDataFormatWithServiceResponseAsync(request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createPropertyDataFormatWithServiceResponseAsync(CreatePropertyDataFormatRequest request) {
        Validator.validate(request);
        return service.createPropertyDataFormat(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createPropertyDataFormatDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPropertyDataFormats(String scope) {
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
    public ServiceFuture<Object> listPropertyDataFormatsAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listPropertyDataFormatsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listPropertyDataFormatsAsync(String scope) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPropertyDataFormatsWithServiceResponseAsync(String scope) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPropertyDataFormatsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listPropertyDataFormats(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPropertyDataFormatsWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listPropertyDataFormatsWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPropertyDataFormats(scope, includeDefault, includeSystem, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listPropertyDataFormatsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listPropertyDataFormatsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPropertyDataFormatDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertyDataFormat(String scope, String name) {
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
    public ServiceFuture<Object> getPropertyDataFormatAsync(String scope, String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDataFormatWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertyDataFormatAsync(String scope, String name) {
        return getPropertyDataFormatWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertyDataFormatWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        return service.getPropertyDataFormat(scope, name)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertyDataFormatDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePropertyDataFormat(String scope, String name) {
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
    public ServiceFuture<Object> updatePropertyDataFormatAsync(String scope, String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDataFormatWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePropertyDataFormatAsync(String scope, String name) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final UpdatePropertyDataFormatRequest request = null;
        return service.updatePropertyDataFormat(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePropertyDataFormatDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object updatePropertyDataFormat(String scope, String name, UpdatePropertyDataFormatRequest request) {
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
    public ServiceFuture<Object> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDataFormatWithServiceResponseAsync(scope, name, request), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request) {
        return updatePropertyDataFormatWithServiceResponseAsync(scope, name, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name, UpdatePropertyDataFormatRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePropertyDataFormat(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updatePropertyDataFormatDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> updatePropertyDataFormatDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDataFormatDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listReferencePortfolios(String scope, DateTime effectiveAt) {
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
    public ServiceFuture<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt), serviceCallback);
    }

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listReferencePortfoliosDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object listReferencePortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listReferencePortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listReferencePortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listReferencePortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listReferencePortfoliosDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListPortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createReferencePortfolio(String scope) {
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
    public ServiceFuture<Object> createReferencePortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createReferencePortfolioAsync(String scope) {
        return createReferencePortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createReferencePortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreatePortfolioRequest referencePortfolio = null;
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createReferencePortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object createReferencePortfolio(String scope, CreatePortfolioRequest referencePortfolio) {
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
    public ServiceFuture<Object> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio) {
        return createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createReferencePortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest referencePortfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(referencePortfolio);
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createReferencePortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getReferencePortfolio(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getReferencePortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getReferencePortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt) {
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
    public ServiceFuture<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getReferencePortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListReferencePortfolioConstituentDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteReferencePortfolio(String scope, String code) {
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
    public ServiceFuture<Object> deleteReferencePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteReferencePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteReferencePortfolioAsync(String scope, String code) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deleteReferencePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteReferencePortfolioDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteReferencePortfolio(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt) {
        return deleteReferencePortfolioWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deleteReferencePortfolio(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteReferencePortfolioDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code) {
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
    public ServiceFuture<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code), serviceCallback);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getReferencePortfolioConstituentsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, effectiveAt, code, referencePortfolioId, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListReferencePortfolioConstituentDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
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
    public ServiceFuture<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertReferencePortfolioConstituentsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getResults(String scope, String key, DateTime dateParameter) {
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
    public ServiceFuture<Object> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getResultsAsync(String scope, String key, DateTime dateParameter) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getResultsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getResultsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResultsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertResults(String scope, String key, DateTime dateParameter) {
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
    public ServiceFuture<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(upsertResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertResultsDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object upsertResults(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
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
    public ServiceFuture<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request, final ServiceCallback<Object> serviceCallback) {
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
     * @return the observable to the Object object
     */
    public Observable<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter, request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = upsertResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> upsertResultsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResultsDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'TransactionCodeMovements'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getEntitySchema(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).toBlocking().single().body();
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'TransactionCodeMovements'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getEntitySchemaAsync(String entity, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getEntitySchemaWithServiceResponseAsync(entity), serviceCallback);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'TransactionCodeMovements'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getEntitySchemaAsync(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'TransactionCodeMovements'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getEntitySchemaWithServiceResponseAsync(String entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Parameter entity is required and cannot be null.");
        }
        return service.getEntitySchema(entity)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getEntitySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getEntitySchemaDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SchemaDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertySchema() {
        return getPropertySchemaWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertySchemaAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertySchemaAsync() {
        return getPropertySchemaWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertySchemaWithServiceResponseAsync() {
        final List<String> propertyKeys = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getPropertySchema(propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertySchemaDelegate(response);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getPropertySchema(List<String> propertyKeys) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys).toBlocking().single().body();
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getPropertySchemaAsync(List<String> propertyKeys, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(propertyKeys), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getPropertySchemaAsync(List<String> propertyKeys) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys) {
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getPropertySchema(propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getPropertySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getPropertySchemaDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertySchemaDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getValueTypes() {
        return getValueTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getValueTypesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getValueTypesAsync() {
        return getValueTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getValueTypesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getValueTypesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getValueTypes(List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Object> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit) {
        return getValueTypesWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getValueTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getValueTypesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListUiDataType>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(404, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object batchAddClientSecurities() {
        return batchAddClientSecuritiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> batchAddClientSecuritiesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientSecuritiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> batchAddClientSecuritiesAsync() {
        return batchAddClientSecuritiesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> batchAddClientSecuritiesWithServiceResponseAsync() {
        final List<CreateClientSecurityRequest> definitions = null;
        return service.batchAddClientSecurities(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = batchAddClientSecuritiesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object batchAddClientSecurities(List<CreateClientSecurityRequest> definitions) {
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
    public ServiceFuture<Object> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientSecuritiesWithServiceResponseAsync(definitions), serviceCallback);
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions) {
        return batchAddClientSecuritiesWithServiceResponseAsync(definitions).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> batchAddClientSecuritiesWithServiceResponseAsync(List<CreateClientSecurityRequest> definitions) {
        Validator.validate(definitions);
        return service.batchAddClientSecurities(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = batchAddClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> batchAddClientSecuritiesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TryAddClientSecuritiesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object batchDeleteClientSecurities() {
        return batchDeleteClientSecuritiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> batchDeleteClientSecuritiesAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientSecuritiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> batchDeleteClientSecuritiesAsync() {
        return batchDeleteClientSecuritiesWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> batchDeleteClientSecuritiesWithServiceResponseAsync() {
        final List<String> uids = null;
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
        return service.batchDeleteClientSecurities(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = batchDeleteClientSecuritiesDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object batchDeleteClientSecurities(List<String> uids) {
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
    public ServiceFuture<Object> batchDeleteClientSecuritiesAsync(List<String> uids, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientSecuritiesWithServiceResponseAsync(uids), serviceCallback);
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> batchDeleteClientSecuritiesAsync(List<String> uids) {
        return batchDeleteClientSecuritiesWithServiceResponseAsync(uids).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> batchDeleteClientSecuritiesWithServiceResponseAsync(List<String> uids) {
        Validator.validate(uids);
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
        return service.batchDeleteClientSecurities(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = batchDeleteClientSecuritiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> batchDeleteClientSecuritiesDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryDeleteClientSecuritiesDto>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getSecurity(String uid) {
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
    public ServiceFuture<Object> getSecurityAsync(String uid, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getSecurityWithServiceResponseAsync(uid), serviceCallback);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getSecurityAsync(String uid) {
        return getSecurityWithServiceResponseAsync(uid).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getSecurityWithServiceResponseAsync(String uid) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getSecurity(uid, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getSecurityDelegate(response);
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
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getSecurity(String uid, DateTime asAt, List<String> propertyKeys) {
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
    public ServiceFuture<Object> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getSecurityWithServiceResponseAsync(uid, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys) {
        return getSecurityWithServiceResponseAsync(uid, asAt, propertyKeys).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
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
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getSecurityWithServiceResponseAsync(String uid, DateTime asAt, List<String> propertyKeys) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.getSecurity(uid, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getSecurityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getSecurityDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<SecurityDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object lookupSecuritiesFromCodes(String codeType) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType).toBlocking().single().body();
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> lookupSecuritiesFromCodesAsync(String codeType, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesWithServiceResponseAsync(codeType), serviceCallback);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> lookupSecuritiesFromCodesAsync(String codeType) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String codesConverted = this.serializerAdapter().serializeList(codes, CollectionFormat.MULTI);String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodes(codeType, codesConverted, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = lookupSecuritiesFromCodesDelegate(response);
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
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object lookupSecuritiesFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        Validator.validate(codes);
        Validator.validate(propertyKeys);
        String codesConverted = this.serializerAdapter().serializeList(codes, CollectionFormat.MULTI);String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodes(codeType, codesConverted, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = lookupSecuritiesFromCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> lookupSecuritiesFromCodesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryLookupSecuritiesFromCodesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object lookupSecuritiesFromCodesBulk(String codeType) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType).toBlocking().single().body();
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType), serviceCallback);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> lookupSecuritiesFromCodesBulkAsync(String codeType) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> propertyKeys = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodesBulk(codeType, codes, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = lookupSecuritiesFromCodesBulkDelegate(response);
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
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object lookupSecuritiesFromCodesBulk(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys), serviceCallback);
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        return lookupSecuritiesFromCodesBulkWithServiceResponseAsync(codeType, codes, asAt, propertyKeys).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys) {
        if (codeType == null) {
            throw new IllegalArgumentException("Parameter codeType is required and cannot be null.");
        }
        Validator.validate(codes);
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
        return service.lookupSecuritiesFromCodesBulk(codeType, codes, asAt, propertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = lookupSecuritiesFromCodesBulkDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> lookupSecuritiesFromCodesBulkDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TryLookupSecuritiesFromCodesDto>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

}
