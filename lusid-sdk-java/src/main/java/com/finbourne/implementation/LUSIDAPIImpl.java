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
import com.finbourne.models.AddTransactionPropertyResponse;
import com.finbourne.models.AdjustHolding;
import com.finbourne.models.AdjustHoldingRequest;
import com.finbourne.models.AggregationRequest;
import com.finbourne.models.AnalyticStore;
import com.finbourne.models.CorporateAction;
import com.finbourne.models.CreateAnalyticStoreRequest;
import com.finbourne.models.CreateClientInstrumentRequest;
import com.finbourne.models.CreateCorporateAction;
import com.finbourne.models.CreateDataTypeRequest;
import com.finbourne.models.CreateDerivedTransactionPortfolioRequest;
import com.finbourne.models.CreatePerpetualPropertyRequest;
import com.finbourne.models.CreatePortfolioDetails;
import com.finbourne.models.CreatePortfolioGroupRequest;
import com.finbourne.models.CreatePropertyDefinitionRequest;
import com.finbourne.models.CreatePropertyRequest;
import com.finbourne.models.CreateReferencePortfolioRequest;
import com.finbourne.models.CreateResults;
import com.finbourne.models.CreateTransactionPortfolioRequest;
import com.finbourne.models.DataType;
import com.finbourne.models.DeleteClientInstrumentsResponse;
import com.finbourne.models.DeletedEntityResponse;
import com.finbourne.models.ErrorResponseException;
import com.finbourne.models.ExpandedGroup;
import com.finbourne.models.HoldingsAdjustment;
import com.finbourne.models.Instrument;
import com.finbourne.models.InstrumentAnalytic;
import com.finbourne.models.InstrumentProperty;
import com.finbourne.models.IUnitDefinition;
import com.finbourne.models.ListAggregationResponse;
import com.finbourne.models.LookupInstrumentsFromCodesResponse;
import com.finbourne.models.NestedAggregationResponse;
import com.finbourne.models.Personalisation;
import com.finbourne.models.Portfolio;
import com.finbourne.models.PortfolioDetails;
import com.finbourne.models.PortfolioGroup;
import com.finbourne.models.PortfolioProperties;
import com.finbourne.models.PropertyDefinition;
import com.finbourne.models.PropertySchema;
import com.finbourne.models.ReconciliationRequest;
import com.finbourne.models.ReferencePortfolioConstituentRequest;
import com.finbourne.models.ResourceId;
import com.finbourne.models.ResourceListOfAnalyticStoreKey;
import com.finbourne.models.ResourceListOfDataType;
import com.finbourne.models.ResourceListOfHoldingsAdjustmentHeader;
import com.finbourne.models.ResourceListOfPersonalisation;
import com.finbourne.models.ResourceListOfPortfolio;
import com.finbourne.models.ResourceListOfPortfolioGroup;
import com.finbourne.models.ResourceListOfPortfolioSearchResult;
import com.finbourne.models.ResourceListOfProcessedCommand;
import com.finbourne.models.ResourceListOfPropertyDefinition;
import com.finbourne.models.ResourceListOfReconciliationBreak;
import com.finbourne.models.ResourceListOfReferencePortfolioConstituent;
import com.finbourne.models.ResourceListOfScope;
import com.finbourne.models.ResourceListOfString;
import com.finbourne.models.ResourceListOfTransactionMetaData;
import com.finbourne.models.ResourceListOfValueType;
import com.finbourne.models.Results;
import com.finbourne.models.Schema;
import com.finbourne.models.TransactionConfigurationData;
import com.finbourne.models.TransactionConfigurationDataRequest;
import com.finbourne.models.TransactionQueryParameters;
import com.finbourne.models.TransactionRequest;
import com.finbourne.models.TryAddClientInstruments;
import com.finbourne.models.UpdateDataTypeRequest;
import com.finbourne.models.UpdatePortfolioGroupRequest;
import com.finbourne.models.UpdatePortfolioRequest;
import com.finbourne.models.UpdatePropertyDefinitionRequest;
import com.finbourne.models.UpsertCorporateActionsResponse;
import com.finbourne.models.UpsertInstrumentPropertiesResponse;
import com.finbourne.models.UpsertPersonalisationResponse;
import com.finbourne.models.UpsertPortfolioTransactions;
import com.finbourne.models.UpsertReferencePortfolioConstituentsResponse;
import com.finbourne.models.VersionedResourceListOfHolding;
import com.finbourne.models.VersionedResourceListOfOutputTransaction;
import com.finbourne.models.VersionedResourceListOfTransaction;
import com.finbourne.models.VersionSummary;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listAnalyticStores" })
        @GET("api/analytics")
        Observable<Response<ResponseBody>> listAnalyticStores(@Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createAnalyticStore" })
        @POST("api/analytics")
        Observable<Response<ResponseBody>> createAnalyticStore(@Body CreateAnalyticStoreRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAnalyticStore" })
        @GET("api/analytics/{scope}/{year}/{month}/{day}")
        Observable<Response<ResponseBody>> getAnalyticStore(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteAnalyticStore" })
        @HTTP(path = "api/analytics/{scope}/{year}/{month}/{day}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteAnalyticStore(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI insertAnalytics" })
        @POST("api/analytics/{scope}/{year}/{month}/{day}/prices")
        Observable<Response<ResponseBody>> insertAnalytics(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day, @Body List<InstrumentAnalytic> data);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getCorporateActions" })
        @GET("api/corporateactions/{scope}/{code}")
        Observable<Response<ResponseBody>> getCorporateActions(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchUpsertCorporateActions" })
        @POST("api/corporateactions/{scope}/{code}")
        Observable<Response<ResponseBody>> batchUpsertCorporateActions(@Path("scope") String scope, @Path("code") String code, @Body List<CreateCorporateAction> actions);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createDataType" })
        @POST("api/datatypes")
        Observable<Response<ResponseBody>> createDataType(@Body CreateDataTypeRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listDataTypes" })
        @GET("api/datatypes/{scope}")
        Observable<Response<ResponseBody>> listDataTypes(@Path("scope") String scope, @Query("includeDefault") Boolean includeDefault, @Query("includeSystem") Boolean includeSystem, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getDataType" })
        @GET("api/datatypes/{scope}/{name}")
        Observable<Response<ResponseBody>> getDataType(@Path("scope") String scope, @Path("name") String name);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updateDataType" })
        @PUT("api/datatypes/{scope}/{name}")
        Observable<Response<ResponseBody>> updateDataType(@Path("scope") String scope, @Path("name") String name, @Body UpdateDataTypeRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getUnitsFromDataType" })
        @GET("api/datatypes/{scope}/{name}/units")
        Observable<Response<ResponseBody>> getUnitsFromDataType(@Path("scope") String scope, @Path("name") String name, @Query("units") String units, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createDerivedPortfolio" })
        @POST("api/derivedtransactionportfolios/{scope}")
        Observable<Response<ResponseBody>> createDerivedPortfolio(@Path("scope") String scope, @Body CreateDerivedTransactionPortfolioRequest portfolio);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteDerivedPortfolioDetails" })
        @HTTP(path = "api/derivedtransactionportfolios/{scope}/{code}/details", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteDerivedPortfolioDetails(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfolioGroupsSearch" })
        @POST("api/groups/search")
        Observable<Response<ResponseBody>> portfolioGroupsSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchAddClientInstruments" })
        @POST("api/instruments")
        Observable<Response<ResponseBody>> batchAddClientInstruments(@Body List<CreateClientInstrumentRequest> definitions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchDeleteClientInstruments" })
        @HTTP(path = "api/instruments", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> batchDeleteClientInstruments(@Query("uids") String uids);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getInstrument" })
        @GET("api/instruments/{uid}")
        Observable<Response<ResponseBody>> getInstrument(@Path("uid") String uid, @Query("asAt") DateTime asAt, @Query("instrumentPropertyKeys") String instrumentPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI lookupInstrumentsFromCodes" })
        @POST("api/instruments/$lookup")
        Observable<Response<ResponseBody>> lookupInstrumentsFromCodes(@Query("codeType") String codeType, @Body List<String> codes, @Query("asAt") DateTime asAt, @Query("instrumentPropertyKeys") String instrumentPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchUpsertInstrumentProperties" })
        @POST("api/instruments/$upsertproperties")
        Observable<Response<ResponseBody>> batchUpsertInstrumentProperties(@Body List<InstrumentProperty> classifications);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getSamlIdentityProviderId" })
        @GET("api/login/saml/{domain}")
        Observable<Response<ResponseBody>> getSamlIdentityProviderId(@Path("domain") String domain);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getExcelDownloadUrl" })
        @GET("api/metadata/downloads/excel")
        Observable<Response<ResponseBody>> getExcelDownloadUrl(@Query("version") String version);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getLusidVersions" })
        @GET("api/metadata/versions")
        Observable<Response<ResponseBody>> getLusidVersions();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPersonalisations" })
        @GET("api/personalisations")
        Observable<Response<ResponseBody>> getPersonalisations(@Query("pattern") String pattern, @Query("scope") String scope, @Query("recursive") Boolean recursive, @Query("wildcards") Boolean wildcards, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPersonalisations" })
        @POST("api/personalisations")
        Observable<Response<ResponseBody>> upsertPersonalisations(@Body List<Personalisation> personalisations);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePersonalisation" })
        @HTTP(path = "api/personalisations", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePersonalisation(@Query("key") String key, @Query("scope") String scope, @Query("group") String group);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolioGroups" })
        @GET("api/portfoliogroups/{scope}")
        Observable<Response<ResponseBody>> listPortfolioGroups(@Path("scope") String scope, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPortfolioGroup" })
        @POST("api/portfoliogroups/{scope}")
        Observable<Response<ResponseBody>> createPortfolioGroup(@Path("scope") String scope, @Body CreatePortfolioGroupRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroup" })
        @GET("api/portfoliogroups/{scope}/{code}")
        Observable<Response<ResponseBody>> getPortfolioGroup(@Path("scope") String scope, @Path("code") String code, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePortfolioGroup" })
        @PUT("api/portfoliogroups/{scope}/{code}")
        Observable<Response<ResponseBody>> updatePortfolioGroup(@Path("scope") String scope, @Path("code") String code, @Body UpdatePortfolioGroupRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioGroup" })
        @HTTP(path = "api/portfoliogroups/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioGroup(@Path("scope") String scope, @Path("code") String code);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByGroup" })
        @POST("api/portfoliogroups/{scope}/{code}/$aggregate")
        Observable<Response<ResponseBody>> getAggregationByGroup(@Path("scope") String scope, @Path("code") String code, @Body AggregationRequest request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getNestedAggregationByGroup" })
        @POST("api/portfoliogroups/{scope}/{code}/$aggregatenested")
        Observable<Response<ResponseBody>> getNestedAggregationByGroup(@Path("scope") String scope, @Path("code") String code, @Body AggregationRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroupCommands" })
        @GET("api/portfoliogroups/{scope}/{code}/commands")
        Observable<Response<ResponseBody>> getPortfolioGroupCommands(@Path("scope") String scope, @Path("code") String code, @Query("fromAsAt") DateTime fromAsAt, @Query("toAsAt") DateTime toAsAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioGroupExpansion" })
        @GET("api/portfoliogroups/{scope}/{code}/expansion")
        Observable<Response<ResponseBody>> getPortfolioGroupExpansion(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("propertyFilter") String propertyFilter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addPortfolioToGroup" })
        @POST("api/portfoliogroups/{scope}/{code}/portfolios")
        Observable<Response<ResponseBody>> addPortfolioToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId identifier);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioFromGroup" })
        @HTTP(path = "api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioFromGroup(@Path("scope") String scope, @Path("code") String code, @Path("portfolioScope") String portfolioScope, @Path("portfolioCode") String portfolioCode);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addSubGroupToGroup" })
        @POST("api/portfoliogroups/{scope}/{code}/subgroups")
        Observable<Response<ResponseBody>> addSubGroupToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId identifier);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteSubGroupFromGroup" })
        @HTTP(path = "api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteSubGroupFromGroup(@Path("scope") String scope, @Path("code") String code, @Path("subgroupScope") String subgroupScope, @Path("subgroupCode") String subgroupCode);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolioScopes" })
        @GET("api/portfolios")
        Observable<Response<ResponseBody>> listPortfolioScopes(@Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listPortfolios" })
        @GET("api/portfolios/{scope}")
        Observable<Response<ResponseBody>> listPortfolios(@Path("scope") String scope, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolio" })
        @GET("api/portfolios/{scope}/{code}")
        Observable<Response<ResponseBody>> getPortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePortfolio" })
        @PUT("api/portfolios/{scope}/{code}")
        Observable<Response<ResponseBody>> updatePortfolio(@Path("scope") String scope, @Path("code") String code, @Body UpdatePortfolioRequest request, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolio" })
        @HTTP(path = "api/portfolios/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolio(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByPortfolio" })
        @POST("api/portfolios/{scope}/{code}/$aggregate")
        Observable<Response<ResponseBody>> getAggregationByPortfolio(@Path("scope") String scope, @Path("code") String code, @Body AggregationRequest request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioCommands" })
        @GET("api/portfolios/{scope}/{code}/commands")
        Observable<Response<ResponseBody>> getPortfolioCommands(@Path("scope") String scope, @Path("code") String code, @Query("fromAsAt") DateTime fromAsAt, @Query("toAsAt") DateTime toAsAt, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioProperties" })
        @GET("api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> getPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioProperties" })
        @POST("api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> upsertPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Body Map<String, CreatePropertyRequest> portfolioProperties, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperties" })
        @HTTP(path = "api/portfolios/{scope}/{code}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("portfolioPropertyKeys") String portfolioPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfoliosSearch" })
        @POST("api/portfolios/search")
        Observable<Response<ResponseBody>> portfoliosSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI propertiesSearch" })
        @POST("api/properties/search")
        Observable<Response<ResponseBody>> propertiesSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getMultiplePropertyDefinitions" })
        @GET("api/propertydefinitions")
        Observable<Response<ResponseBody>> getMultiplePropertyDefinitions(@Query("keys") String keys, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPropertyDefinition" })
        @POST("api/propertydefinitions")
        Observable<Response<ResponseBody>> createPropertyDefinition(@Body CreatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinition" })
        @GET("api/propertydefinitions/{domain}/{scope}/{name}")
        Observable<Response<ResponseBody>> getPropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePropertyDefinition" })
        @PUT("api/propertydefinitions/{domain}/{scope}/{name}")
        Observable<Response<ResponseBody>> updatePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name, @Body UpdatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyDefinition" })
        @HTTP(path = "api/propertydefinitions/{domain}/{scope}/{name}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("name") String name);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI performReconciliation" })
        @POST("api/recon")
        Observable<Response<ResponseBody>> performReconciliation(@Body ReconciliationRequest request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createReferencePortfolio" })
        @POST("api/referenceportfolios/{scope}")
        Observable<Response<ResponseBody>> createReferencePortfolio(@Path("scope") String scope, @Body CreateReferencePortfolioRequest referencePortfolio);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getReferencePortfolioConstituents" })
        @GET("api/referenceportfolios/{scope}/{code}/{effectiveAt}/constituents")
        Observable<Response<ResponseBody>> getReferencePortfolioConstituents(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertReferencePortfolioConstituents" })
        @POST("api/referenceportfolios/{scope}/{code}/{effectiveAt}/constituents")
        Observable<Response<ResponseBody>> upsertReferencePortfolioConstituents(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<ReferencePortfolioConstituentRequest> constituents);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getResults" })
        @GET("api/results/{scope}/{key}/{date}")
        Observable<Response<ResponseBody>> getResults(@Path("scope") String scope, @Path("key") String key, @Path("date") DateTime dateParameter, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertResults" })
        @POST("api/results/{scope}/{key}/{date}")
        Observable<Response<ResponseBody>> upsertResults(@Path("scope") String scope, @Path("key") String key, @Path("date") DateTime dateParameter, @Body CreateResults request);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getAggregationByResultSet" })
        @POST("api/results/{scope}/{resultsKey}/$aggregate")
        Observable<Response<ResponseBody>> getAggregationByResultSet(@Path("scope") String scope, @Path("resultsKey") String resultsKey, @Body AggregationRequest request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listEntities" })
        @GET("api/schemas/entities")
        Observable<Response<ResponseBody>> listEntities();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getEntitySchema" })
        @GET("api/schemas/entities/{entity}")
        Observable<Response<ResponseBody>> getEntitySchema(@Path("entity") String entity);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertySchema" })
        @GET("api/schemas/properties")
        Observable<Response<ResponseBody>> getPropertySchema(@Query("propertyKeys") String propertyKeys, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getValueTypes" })
        @GET("api/schemas/types")
        Observable<Response<ResponseBody>> getValueTypes(@Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listConfigurationTransactionTypes" })
        @GET("api/systemconfiguration/transactiontypes")
        Observable<Response<ResponseBody>> listConfigurationTransactionTypes();

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI setConfigurationTransactionTypes" })
        @PUT("api/systemconfiguration/transactiontypes")
        Observable<Response<ResponseBody>> setConfigurationTransactionTypes(@Body List<TransactionConfigurationDataRequest> types);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createConfigurationTransactionType" })
        @POST("api/systemconfiguration/transactiontypes")
        Observable<Response<ResponseBody>> createConfigurationTransactionType(@Body TransactionConfigurationDataRequest type);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPortfolio" })
        @POST("api/transactionportfolios/{scope}")
        Observable<Response<ResponseBody>> createPortfolio(@Path("scope") String scope, @Body CreateTransactionPortfolioRequest createRequest);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getDetails" })
        @GET("api/transactionportfolios/{scope}/{code}/details")
        Observable<Response<ResponseBody>> getDetails(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioDetails" })
        @POST("api/transactionportfolios/{scope}/{code}/details")
        Observable<Response<ResponseBody>> upsertPortfolioDetails(@Path("scope") String scope, @Path("code") String code, @Body CreatePortfolioDetails details, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getHoldings" })
        @GET("api/transactionportfolios/{scope}/{code}/holdings")
        Observable<Response<ResponseBody>> getHoldings(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter, @Query("instrumentPropertyKeys") String instrumentPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI setHoldings" })
        @PUT("api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}")
        Observable<Response<ResponseBody>> setHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<AdjustHoldingRequest> holdingAdjustments);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI adjustHoldings" })
        @POST("api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}")
        Observable<Response<ResponseBody>> adjustHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Body List<AdjustHoldingRequest> holdingAdjustments);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI cancelAdjustHoldings" })
        @HTTP(path = "api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> cancelAdjustHoldings(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI listHoldingsAdjustments" })
        @GET("api/transactionportfolios/{scope}/{code}/holdingsadjustments")
        Observable<Response<ResponseBody>> listHoldingsAdjustments(@Path("scope") String scope, @Path("code") String code, @Query("fromEffectiveAt") DateTime fromEffectiveAt, @Query("toEffectiveAt") DateTime toEffectiveAt, @Query("asAtTime") DateTime asAtTime);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getHoldingsAdjustment" })
        @GET("api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt}")
        Observable<Response<ResponseBody>> getHoldingsAdjustment(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Query("asAtTime") DateTime asAtTime);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getTransactions" })
        @GET("api/transactionportfolios/{scope}/{code}/transactions")
        Observable<Response<ResponseBody>> getTransactions(@Path("scope") String scope, @Path("code") String code, @Query("fromTransactionDate") DateTime fromTransactionDate, @Query("toTransactionDate") DateTime toTransactionDate, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("instrumentPropertyKeys") String instrumentPropertyKeys, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertTransactions" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions")
        Observable<Response<ResponseBody>> upsertTransactions(@Path("scope") String scope, @Path("code") String code, @Body List<TransactionRequest> transactions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteTransactions" })
        @HTTP(path = "api/transactionportfolios/{scope}/{code}/transactions", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteTransactions(@Path("scope") String scope, @Path("code") String code, @Query("id") String id);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTransactionProperty" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties")
        Observable<Response<ResponseBody>> addTransactionProperty(@Path("scope") String scope, @Path("code") String code, @Path("transactionId") String transactionId, @Body Map<String, CreatePerpetualPropertyRequest> transactionProperties);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyFromTransaction" })
        @HTTP(path = "api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyFromTransaction(@Path("scope") String scope, @Path("code") String code, @Path("transactionId") String transactionId, @Query("transactionPropertyKey") String transactionPropertyKey);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI buildTransactions" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions/$build")
        Observable<Response<ResponseBody>> buildTransactions(@Path("scope") String scope, @Path("code") String code, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("instrumentPropertyKeys") String instrumentPropertyKeys, @Query("filter") String filter, @Body TransactionQueryParameters parameters);

    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    public ResourceListOfAnalyticStoreKey listAnalyticStores() {
        return listAnalyticStoresWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    public Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync() {
        return listAnalyticStoresWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfAnalyticStoreKey>, ResourceListOfAnalyticStoreKey>() {
            @Override
            public ResourceListOfAnalyticStoreKey call(ServiceResponse<ResourceListOfAnalyticStoreKey> response) {
                return response.body();
            }
        });
    }

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    public Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync() {
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfAnalyticStoreKey> clientResponse = listAnalyticStoresDelegate(response);
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
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    public ResourceListOfAnalyticStoreKey listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback) {
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
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    public Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfAnalyticStoreKey>, ResourceListOfAnalyticStoreKey>() {
            @Override
            public ResourceListOfAnalyticStoreKey call(ServiceResponse<ResourceListOfAnalyticStoreKey> response) {
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
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    public Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listAnalyticStores(asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfAnalyticStoreKey> clientResponse = listAnalyticStoresDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfAnalyticStoreKey> listAnalyticStoresDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfAnalyticStoreKey, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfAnalyticStoreKey>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore createAnalyticStore() {
        return createAnalyticStoreWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> createAnalyticStoreAsync(final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> createAnalyticStoreAsync() {
        return createAnalyticStoreWithServiceResponseAsync().map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync() {
        final CreateAnalyticStoreRequest request = null;
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = createAnalyticStoreDelegate(response);
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
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore createAnalyticStore(CreateAnalyticStoreRequest request) {
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
    public ServiceFuture<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request) {
        return createAnalyticStoreWithServiceResponseAsync(request).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request) {
        Validator.validate(request);
        return service.createAnalyticStore(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = createAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStore> createAnalyticStoreDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<AnalyticStore, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AnalyticStore>() { }.getType())
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
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore getAnalyticStore(String scope, int year, int month, int day) {
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
    public ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = getAnalyticStoreDelegate(response);
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
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore getAnalyticStore(String scope, int year, int month, int day, DateTime asAt) {
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
    public ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStore> serviceCallback) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.getAnalyticStore(scope, year, month, day, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = getAnalyticStoreDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStore> getAnalyticStoreDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AnalyticStore, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStore>() { }.getType())
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
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore insertAnalytics(String scope, int year, int month, int day) {
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
    public ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
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
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<InstrumentAnalytic> data = null;
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = insertAnalyticsDelegate(response);
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
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore insertAnalytics(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data).toBlocking().single().body();
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data), serviceCallback);
    }

    /**
     * Insert analytics into an existing analytic store for the given scope and date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        return insertAnalyticsWithServiceResponseAsync(scope, year, month, day, data).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
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
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(data);
        return service.insertAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = insertAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStore> insertAnalyticsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AnalyticStore, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStore>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CorporateAction&gt; object if successful.
     */
    public List<CorporateAction> getCorporateActions(String scope, String code) {
        return getCorporateActionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CorporateAction>> getCorporateActionsAsync(String scope, String code, final ServiceCallback<List<CorporateAction>> serviceCallback) {
        return ServiceFuture.fromResponse(getCorporateActionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateAction&gt; object
     */
    public Observable<List<CorporateAction>> getCorporateActionsAsync(String scope, String code) {
        return getCorporateActionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<List<CorporateAction>>, List<CorporateAction>>() {
            @Override
            public List<CorporateAction> call(ServiceResponse<List<CorporateAction>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateAction&gt; object
     */
    public Observable<ServiceResponse<List<CorporateAction>>> getCorporateActionsWithServiceResponseAsync(String scope, String code) {
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getCorporateActions(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<CorporateAction>>>>() {
                @Override
                public Observable<ServiceResponse<List<CorporateAction>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<CorporateAction>> clientResponse = getCorporateActionsDelegate(response);
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
     * @param code Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CorporateAction&gt; object if successful.
     */
    public List<CorporateAction> getCorporateActions(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CorporateAction>> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<List<CorporateAction>> serviceCallback) {
        return ServiceFuture.fromResponse(getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateAction&gt; object
     */
    public Observable<List<CorporateAction>> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<List<CorporateAction>>, List<CorporateAction>>() {
            @Override
            public List<CorporateAction> call(ServiceResponse<List<CorporateAction>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @param effectiveAt Effective Date
     * @param asAt AsAt Date filter
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateAction&gt; object
     */
    public Observable<ServiceResponse<List<CorporateAction>>> getCorporateActionsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getCorporateActions(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<CorporateAction>>>>() {
                @Override
                public Observable<ServiceResponse<List<CorporateAction>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<CorporateAction>> clientResponse = getCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<CorporateAction>> getCorporateActionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<List<CorporateAction>, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<List<CorporateAction>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    public UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    public Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<UpsertCorporateActionsResponse>, UpsertCorporateActionsResponse>() {
            @Override
            public UpsertCorporateActionsResponse call(ServiceResponse<UpsertCorporateActionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    public Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<CreateCorporateAction> actions = null;
        return service.batchUpsertCorporateActions(scope, code, actions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertCorporateActionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertCorporateActionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertCorporateActionsResponse> clientResponse = batchUpsertCorporateActionsDelegate(response);
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
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    public UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code, List<CreateCorporateAction> actions) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code, actions).toBlocking().single().body();
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, code, actions), serviceCallback);
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    public Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code, actions).map(new Func1<ServiceResponse<UpsertCorporateActionsResponse>, UpsertCorporateActionsResponse>() {
            @Override
            public UpsertCorporateActionsResponse call(ServiceResponse<UpsertCorporateActionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    public Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code, List<CreateCorporateAction> actions) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(actions);
        return service.batchUpsertCorporateActions(scope, code, actions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertCorporateActionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertCorporateActionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertCorporateActionsResponse> clientResponse = batchUpsertCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertCorporateActionsResponse> batchUpsertCorporateActionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertCorporateActionsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertCorporateActionsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    public DataType createDataType() {
        return createDataTypeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> createDataTypeAsync(final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(createDataTypeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> createDataTypeAsync() {
        return createDataTypeWithServiceResponseAsync().map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync() {
        final CreateDataTypeRequest request = null;
        return service.createDataType(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataType>>>() {
                @Override
                public Observable<ServiceResponse<DataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataType> clientResponse = createDataTypeDelegate(response);
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
     * @return the DataType object if successful.
     */
    public DataType createDataType(CreateDataTypeRequest request) {
        return createDataTypeWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> createDataTypeAsync(CreateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(createDataTypeWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> createDataTypeAsync(CreateDataTypeRequest request) {
        return createDataTypeWithServiceResponseAsync(request).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync(CreateDataTypeRequest request) {
        Validator.validate(request);
        return service.createDataType(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataType>>>() {
                @Override
                public Observable<ServiceResponse<DataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataType> clientResponse = createDataTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataType> createDataTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<DataType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<DataType>() { }.getType())
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
     * @return the ResourceListOfDataType object if successful.
     */
    public ResourceListOfDataType listDataTypes(String scope) {
        return listDataTypesWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, final ServiceCallback<ResourceListOfDataType> serviceCallback) {
        return ServiceFuture.fromResponse(listDataTypesWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    public Observable<ResourceListOfDataType> listDataTypesAsync(String scope) {
        return listDataTypesWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListOfDataType>, ResourceListOfDataType>() {
            @Override
            public ResourceListOfDataType call(ServiceResponse<ResourceListOfDataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    public Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final Boolean includeDefault = null;
        final Boolean includeSystem = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listDataTypes(scope, includeDefault, includeSystem, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfDataType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfDataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfDataType> clientResponse = listDataTypesDelegate(response);
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
     * @return the ResourceListOfDataType object if successful.
     */
    public ResourceListOfDataType listDataTypes(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listDataTypesWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).toBlocking().single().body();
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
    public ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfDataType> serviceCallback) {
        return ServiceFuture.fromResponse(listDataTypesWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter), serviceCallback);
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
     * @return the observable to the ResourceListOfDataType object
     */
    public Observable<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listDataTypesWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfDataType>, ResourceListOfDataType>() {
            @Override
            public ResourceListOfDataType call(ServiceResponse<ResourceListOfDataType> response) {
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
     * @return the observable to the ResourceListOfDataType object
     */
    public Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listDataTypes(scope, includeDefault, includeSystem, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfDataType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfDataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfDataType> clientResponse = listDataTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfDataType> listDataTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfDataType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfDataType>() { }.getType())
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
     * @return the DataType object if successful.
     */
    public DataType getDataType(String scope, String name) {
        return getDataTypeWithServiceResponseAsync(scope, name).toBlocking().single().body();
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
    public ServiceFuture<DataType> getDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(getDataTypeWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> getDataTypeAsync(String scope, String name) {
        return getDataTypeWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
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
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> getDataTypeWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        return service.getDataType(scope, name)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataType>>>() {
                @Override
                public Observable<ServiceResponse<DataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataType> clientResponse = getDataTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataType> getDataTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DataType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DataType>() { }.getType())
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
     * @return the DataType object if successful.
     */
    public DataType updateDataType(String scope, String name) {
        return updateDataTypeWithServiceResponseAsync(scope, name).toBlocking().single().body();
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
    public ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(updateDataTypeWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> updateDataTypeAsync(String scope, String name) {
        return updateDataTypeWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
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
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final UpdateDataTypeRequest request = null;
        return service.updateDataType(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataType>>>() {
                @Override
                public Observable<ServiceResponse<DataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataType> clientResponse = updateDataTypeDelegate(response);
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
     * @return the DataType object if successful.
     */
    public DataType updateDataType(String scope, String name, UpdateDataTypeRequest request) {
        return updateDataTypeWithServiceResponseAsync(scope, name, request).toBlocking().single().body();
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
    public ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(updateDataTypeWithServiceResponseAsync(scope, name, request), serviceCallback);
    }

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request) {
        return updateDataTypeWithServiceResponseAsync(scope, name, request).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
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
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name, UpdateDataTypeRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updateDataType(scope, name, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataType>>>() {
                @Override
                public Observable<ServiceResponse<DataType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataType> clientResponse = updateDataTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataType> updateDataTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DataType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DataType>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinition object if successful.
     */
    public IUnitDefinition getUnitsFromDataType(String scope, String name) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, name).toBlocking().single().body();
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, final ServiceCallback<IUnitDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getUnitsFromDataTypeWithServiceResponseAsync(scope, name), serviceCallback);
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, name).map(new Func1<ServiceResponse<IUnitDefinition>, IUnitDefinition>() {
            @Override
            public IUnitDefinition call(ServiceResponse<IUnitDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        final List<String> units = null;
        final String filter = null;
        String unitsConverted = this.serializerAdapter().serializeList(units, CollectionFormat.CSV);
        return service.getUnitsFromDataType(scope, name, unitsConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IUnitDefinition>>>() {
                @Override
                public Observable<ServiceResponse<IUnitDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IUnitDefinition> clientResponse = getUnitsFromDataTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinition object if successful.
     */
    public IUnitDefinition getUnitsFromDataType(String scope, String name, List<String> units, String filter) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, name, units, filter).toBlocking().single().body();
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter, final ServiceCallback<IUnitDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getUnitsFromDataTypeWithServiceResponseAsync(scope, name, units, filter), serviceCallback);
    }

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, name, units, filter).map(new Func1<ServiceResponse<IUnitDefinition>, IUnitDefinition>() {
            @Override
            public IUnitDefinition call(ServiceResponse<IUnitDefinition> response) {
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
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name, List<String> units, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        Validator.validate(units);
        String unitsConverted = this.serializerAdapter().serializeList(units, CollectionFormat.CSV);
        return service.getUnitsFromDataType(scope, name, unitsConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IUnitDefinition>>>() {
                @Override
                public Observable<ServiceResponse<IUnitDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IUnitDefinition> clientResponse = getUnitsFromDataTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IUnitDefinition> getUnitsFromDataTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<IUnitDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<IUnitDefinition>() { }.getType())
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createDerivedPortfolio(String scope) {
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
    public ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createDerivedPortfolioAsync(String scope) {
        return createDerivedPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateDerivedTransactionPortfolioRequest portfolio = null;
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createDerivedPortfolioDelegate(response);
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createDerivedPortfolio(String scope, CreateDerivedTransactionPortfolioRequest portfolio) {
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
    public ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createDerivedPortfolioWithServiceResponseAsync(scope, portfolio), serviceCallback);
    }

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio) {
        return createDerivedPortfolioWithServiceResponseAsync(scope, portfolio).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(portfolio);
        return service.createDerivedPortfolio(scope, portfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createDerivedPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Portfolio> createDerivedPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Portfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<Portfolio>() { }.getType())
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
    public DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code) {
        return deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code).toBlocking().single().body();
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
    public ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
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
    public Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code) {
        return deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
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
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        return service.deleteDerivedPortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteDerivedPortfolioDetailsDelegate(response);
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
    public DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code, DateTime effectiveAt) {
        return deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
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
    public ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
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
    public Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt) {
        return deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
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
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deleteDerivedPortfolioDetails(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteDerivedPortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deleteDerivedPortfolioDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup portfolioGroupsSearch() {
        return portfolioGroupsSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(portfolioGroupsSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync() {
        return portfolioGroupsSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfPortfolioGroup>, ResourceListOfPortfolioGroup>() {
            @Override
            public ResourceListOfPortfolioGroup call(ServiceResponse<ResourceListOfPortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioGroup> clientResponse = portfolioGroupsSearchDelegate(response);
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
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
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
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPortfolioGroup>, ResourceListOfPortfolioGroup>() {
            @Override
            public ResourceListOfPortfolioGroup call(ServiceResponse<ResourceListOfPortfolioGroup> response) {
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
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.portfolioGroupsSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioGroup> clientResponse = portfolioGroupsSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPortfolioGroup> portfolioGroupsSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPortfolioGroup>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    public TryAddClientInstruments batchAddClientInstruments() {
        return batchAddClientInstrumentsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(final ServiceCallback<TryAddClientInstruments> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientInstrumentsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync() {
        return batchAddClientInstrumentsWithServiceResponseAsync().map(new Func1<ServiceResponse<TryAddClientInstruments>, TryAddClientInstruments>() {
            @Override
            public TryAddClientInstruments call(ServiceResponse<TryAddClientInstruments> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync() {
        final List<CreateClientInstrumentRequest> definitions = null;
        return service.batchAddClientInstruments(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryAddClientInstruments>>>() {
                @Override
                public Observable<ServiceResponse<TryAddClientInstruments>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryAddClientInstruments> clientResponse = batchAddClientInstrumentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    public TryAddClientInstruments batchAddClientInstruments(List<CreateClientInstrumentRequest> definitions) {
        return batchAddClientInstrumentsWithServiceResponseAsync(definitions).toBlocking().single().body();
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions, final ServiceCallback<TryAddClientInstruments> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientInstrumentsWithServiceResponseAsync(definitions), serviceCallback);
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions) {
        return batchAddClientInstrumentsWithServiceResponseAsync(definitions).map(new Func1<ServiceResponse<TryAddClientInstruments>, TryAddClientInstruments>() {
            @Override
            public TryAddClientInstruments call(ServiceResponse<TryAddClientInstruments> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync(List<CreateClientInstrumentRequest> definitions) {
        Validator.validate(definitions);
        return service.batchAddClientInstruments(definitions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TryAddClientInstruments>>>() {
                @Override
                public Observable<ServiceResponse<TryAddClientInstruments>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TryAddClientInstruments> clientResponse = batchAddClientInstrumentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TryAddClientInstruments> batchAddClientInstrumentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<TryAddClientInstruments, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TryAddClientInstruments>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    public DeleteClientInstrumentsResponse batchDeleteClientInstruments() {
        return batchDeleteClientInstrumentsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientInstrumentsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync() {
        return batchDeleteClientInstrumentsWithServiceResponseAsync().map(new Func1<ServiceResponse<DeleteClientInstrumentsResponse>, DeleteClientInstrumentsResponse>() {
            @Override
            public DeleteClientInstrumentsResponse call(ServiceResponse<DeleteClientInstrumentsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync() {
        final List<String> uids = null;
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.CSV);
        return service.batchDeleteClientInstruments(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteClientInstrumentsResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteClientInstrumentsResponse> clientResponse = batchDeleteClientInstrumentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    public DeleteClientInstrumentsResponse batchDeleteClientInstruments(List<String> uids) {
        return batchDeleteClientInstrumentsWithServiceResponseAsync(uids).toBlocking().single().body();
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids, final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientInstrumentsWithServiceResponseAsync(uids), serviceCallback);
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids) {
        return batchDeleteClientInstrumentsWithServiceResponseAsync(uids).map(new Func1<ServiceResponse<DeleteClientInstrumentsResponse>, DeleteClientInstrumentsResponse>() {
            @Override
            public DeleteClientInstrumentsResponse call(ServiceResponse<DeleteClientInstrumentsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync(List<String> uids) {
        Validator.validate(uids);
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.CSV);
        return service.batchDeleteClientInstruments(uidsConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteClientInstrumentsResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteClientInstrumentsResponse> clientResponse = batchDeleteClientInstrumentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<DeleteClientInstrumentsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeleteClientInstrumentsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    public Instrument getInstrument(String uid) {
        return getInstrumentWithServiceResponseAsync(uid).toBlocking().single().body();
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Instrument> getInstrumentAsync(String uid, final ServiceCallback<Instrument> serviceCallback) {
        return ServiceFuture.fromResponse(getInstrumentWithServiceResponseAsync(uid), serviceCallback);
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    public Observable<Instrument> getInstrumentAsync(String uid) {
        return getInstrumentWithServiceResponseAsync(uid).map(new Func1<ServiceResponse<Instrument>, Instrument>() {
            @Override
            public Instrument call(ServiceResponse<Instrument> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    public Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> instrumentPropertyKeys = null;
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.getInstrument(uid, asAt, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Instrument>>>() {
                @Override
                public Observable<ServiceResponse<Instrument>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Instrument> clientResponse = getInstrumentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    public Instrument getInstrument(String uid, DateTime asAt, List<String> instrumentPropertyKeys) {
        return getInstrumentWithServiceResponseAsync(uid, asAt, instrumentPropertyKeys).toBlocking().single().body();
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<Instrument> serviceCallback) {
        return ServiceFuture.fromResponse(getInstrumentWithServiceResponseAsync(uid, asAt, instrumentPropertyKeys), serviceCallback);
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    public Observable<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys) {
        return getInstrumentWithServiceResponseAsync(uid, asAt, instrumentPropertyKeys).map(new Func1<ServiceResponse<Instrument>, Instrument>() {
            @Override
            public Instrument call(ServiceResponse<Instrument> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    public Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        Validator.validate(instrumentPropertyKeys);
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.getInstrument(uid, asAt, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Instrument>>>() {
                @Override
                public Observable<ServiceResponse<Instrument>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Instrument> clientResponse = getInstrumentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Instrument> getInstrumentDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Instrument, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Instrument>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    public LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes() {
        return lookupInstrumentsFromCodesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(lookupInstrumentsFromCodesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync() {
        return lookupInstrumentsFromCodesWithServiceResponseAsync().map(new Func1<ServiceResponse<LookupInstrumentsFromCodesResponse>, LookupInstrumentsFromCodesResponse>() {
            @Override
            public LookupInstrumentsFromCodesResponse call(ServiceResponse<LookupInstrumentsFromCodesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync() {
        final String codeType = null;
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> instrumentPropertyKeys = null;
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.lookupInstrumentsFromCodes(codeType, codes, asAt, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>>>() {
                @Override
                public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LookupInstrumentsFromCodesResponse> clientResponse = lookupInstrumentsFromCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    public LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys) {
        return lookupInstrumentsFromCodesWithServiceResponseAsync(codeType, codes, asAt, instrumentPropertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(lookupInstrumentsFromCodesWithServiceResponseAsync(codeType, codes, asAt, instrumentPropertyKeys), serviceCallback);
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys) {
        return lookupInstrumentsFromCodesWithServiceResponseAsync(codeType, codes, asAt, instrumentPropertyKeys).map(new Func1<ServiceResponse<LookupInstrumentsFromCodesResponse>, LookupInstrumentsFromCodesResponse>() {
            @Override
            public LookupInstrumentsFromCodesResponse call(ServiceResponse<LookupInstrumentsFromCodesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys) {
        Validator.validate(codes);
        Validator.validate(instrumentPropertyKeys);
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.lookupInstrumentsFromCodes(codeType, codes, asAt, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>>>() {
                @Override
                public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LookupInstrumentsFromCodesResponse> clientResponse = lookupInstrumentsFromCodesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<LookupInstrumentsFromCodesResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<LookupInstrumentsFromCodesResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    public UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties() {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Upsert instrument properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertInstrumentPropertiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync() {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync().map(new Func1<ServiceResponse<UpsertInstrumentPropertiesResponse>, UpsertInstrumentPropertiesResponse>() {
            @Override
            public UpsertInstrumentPropertiesResponse call(ServiceResponse<UpsertInstrumentPropertiesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync() {
        final List<InstrumentProperty> classifications = null;
        return service.batchUpsertInstrumentProperties(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertInstrumentPropertiesResponse> clientResponse = batchUpsertInstrumentPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    public UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(List<InstrumentProperty> classifications) {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync(classifications).toBlocking().single().body();
    }

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications, final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertInstrumentPropertiesWithServiceResponseAsync(classifications), serviceCallback);
    }

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications) {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync(classifications).map(new Func1<ServiceResponse<UpsertInstrumentPropertiesResponse>, UpsertInstrumentPropertiesResponse>() {
            @Override
            public UpsertInstrumentPropertiesResponse call(ServiceResponse<UpsertInstrumentPropertiesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync(List<InstrumentProperty> classifications) {
        Validator.validate(classifications);
        return service.batchUpsertInstrumentProperties(classifications)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertInstrumentPropertiesResponse> clientResponse = batchUpsertInstrumentPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<UpsertInstrumentPropertiesResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertInstrumentPropertiesResponse>() { }.getType())
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
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getExcelDownloadUrl() {
        return getExcelDownloadUrlWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getExcelDownloadUrlAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getExcelDownloadUrlWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getExcelDownloadUrlAsync() {
        return getExcelDownloadUrlWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync() {
        final String version = null;
        return service.getExcelDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getExcelDownloadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getExcelDownloadUrl(String version) {
        return getExcelDownloadUrlWithServiceResponseAsync(version).toBlocking().single().body();
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getExcelDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getExcelDownloadUrlWithServiceResponseAsync(version), serviceCallback);
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getExcelDownloadUrlAsync(String version) {
        return getExcelDownloadUrlWithServiceResponseAsync(version).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync(String version) {
        return service.getExcelDownloadUrl(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getExcelDownloadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getExcelDownloadUrlDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionSummary object if successful.
     */
    public VersionSummary getLusidVersions() {
        return getLusidVersionsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns the current major application version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionSummary> getLusidVersionsAsync(final ServiceCallback<VersionSummary> serviceCallback) {
        return ServiceFuture.fromResponse(getLusidVersionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    public Observable<VersionSummary> getLusidVersionsAsync() {
        return getLusidVersionsWithServiceResponseAsync().map(new Func1<ServiceResponse<VersionSummary>, VersionSummary>() {
            @Override
            public VersionSummary call(ServiceResponse<VersionSummary> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    public Observable<ServiceResponse<VersionSummary>> getLusidVersionsWithServiceResponseAsync() {
        return service.getLusidVersions()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionSummary>>>() {
                @Override
                public Observable<ServiceResponse<VersionSummary>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionSummary> clientResponse = getLusidVersionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionSummary> getLusidVersionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<VersionSummary, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionSummary>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    public ResourceListOfPersonalisation getPersonalisations() {
        return getPersonalisationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(final ServiceCallback<ResourceListOfPersonalisation> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    public Observable<ResourceListOfPersonalisation> getPersonalisationsAsync() {
        return getPersonalisationsWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfPersonalisation>, ResourceListOfPersonalisation>() {
            @Override
            public ResourceListOfPersonalisation call(ServiceResponse<ResourceListOfPersonalisation> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    public Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync() {
        final String pattern = null;
        final String scope = null;
        final Boolean recursive = null;
        final Boolean wildcards = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPersonalisation>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPersonalisation>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPersonalisation> clientResponse = getPersonalisationsDelegate(response);
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
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    public ResourceListOfPersonalisation getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(pattern, scope, recursive, wildcards, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisation> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(pattern, scope, recursive, wildcards, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    public Observable<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(pattern, scope, recursive, wildcards, sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListOfPersonalisation>, ResourceListOfPersonalisation>() {
            @Override
            public ResourceListOfPersonalisation call(ServiceResponse<ResourceListOfPersonalisation> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    public Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getPersonalisations(pattern, scope, recursive, wildcards, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPersonalisation>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPersonalisation>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPersonalisation> clientResponse = getPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPersonalisation> getPersonalisationsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPersonalisation, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPersonalisation>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    public UpsertPersonalisationResponse upsertPersonalisations() {
        return upsertPersonalisationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    public Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync() {
        return upsertPersonalisationsWithServiceResponseAsync().map(new Func1<ServiceResponse<UpsertPersonalisationResponse>, UpsertPersonalisationResponse>() {
            @Override
            public UpsertPersonalisationResponse call(ServiceResponse<UpsertPersonalisationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    public Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync() {
        final List<Personalisation> personalisations = null;
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPersonalisationResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPersonalisationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPersonalisationResponse> clientResponse = upsertPersonalisationsDelegate(response);
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
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    public UpsertPersonalisationResponse upsertPersonalisations(List<Personalisation> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).toBlocking().single().body();
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations, final ServiceCallback<UpsertPersonalisationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(personalisations), serviceCallback);
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    public Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).map(new Func1<ServiceResponse<UpsertPersonalisationResponse>, UpsertPersonalisationResponse>() {
            @Override
            public UpsertPersonalisationResponse call(ServiceResponse<UpsertPersonalisationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    public Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync(List<Personalisation> personalisations) {
        Validator.validate(personalisations);
        return service.upsertPersonalisations(personalisations)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPersonalisationResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPersonalisationResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPersonalisationResponse> clientResponse = upsertPersonalisationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPersonalisationResponse> upsertPersonalisationsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<UpsertPersonalisationResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<UpsertPersonalisationResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePersonalisation() {
        return deletePersonalisationWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePersonalisationAsync() {
        return deletePersonalisationWithServiceResponseAsync().map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync() {
        final String key = null;
        final String scope = null;
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
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePersonalisation(String key, String scope, String group) {
        return deletePersonalisationWithServiceResponseAsync(key, scope, group).toBlocking().single().body();
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(key, scope, group), serviceCallback);
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group) {
        return deletePersonalisationWithServiceResponseAsync(key, scope, group).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String key, String scope, String group) {
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

    private ServiceResponse<DeletedEntityResponse> deletePersonalisationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
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
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup listPortfolioGroups(String scope) {
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
    public ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope) {
        return listPortfolioGroupsWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListOfPortfolioGroup>, ResourceListOfPortfolioGroup>() {
            @Override
            public ResourceListOfPortfolioGroup call(ServiceResponse<ResourceListOfPortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listPortfolioGroups(scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioGroup> clientResponse = listPortfolioGroupsDelegate(response);
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
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
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
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPortfolioGroup>, ResourceListOfPortfolioGroup>() {
            @Override
            public ResourceListOfPortfolioGroup call(ServiceResponse<ResourceListOfPortfolioGroup> response) {
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
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listPortfolioGroups(scope, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioGroup> clientResponse = listPortfolioGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPortfolioGroup> listPortfolioGroupsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup createPortfolioGroup(String scope) {
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
    public ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> createPortfolioGroupAsync(String scope) {
        return createPortfolioGroupWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreatePortfolioGroupRequest request = null;
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = createPortfolioGroupDelegate(response);
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
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).toBlocking().single().body();
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope, request), serviceCallback);
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope, CreatePortfolioGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(request);
        return service.createPortfolioGroup(scope, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = createPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> createPortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup getPortfolioGroup(String scope, String code) {
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
    public ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = getPortfolioGroupDelegate(response);
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup getPortfolioGroup(String scope, String code, DateTime asAt) {
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
    public ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code, asAt), serviceCallback);
    }

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code, asAt).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioGroup(scope, code, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = getPortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> getPortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup updatePortfolioGroup(String scope, String code) {
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
    public ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdatePortfolioGroupRequest request = null;
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = updatePortfolioGroupDelegate(response);
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
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup updatePortfolioGroup(String scope, String code, UpdatePortfolioGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdatePortfolioGroupRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolioGroup(scope, code, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = updatePortfolioGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> updatePortfolioGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioGroup>() { }.getType())
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
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String code) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
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
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final AggregationRequest request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByGroup(scope, code, request, sortByConverted, start, limit)
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
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code, request, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, code, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code, request, sortBy, start, limit).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
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
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByGroup(scope, code, request, sortByConverted, start, limit)
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
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String code) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final AggregationRequest request = null;
        return service.getNestedAggregationByGroup(scope, code, request)
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
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String code, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code, request).map(new Func1<ServiceResponse<NestedAggregationResponse>, NestedAggregationResponse>() {
            @Override
            public NestedAggregationResponse call(ServiceResponse<NestedAggregationResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    public Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.getNestedAggregationByGroup(scope, code, request)
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
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code) {
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
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListOfProcessedCommand>, ResourceListOfProcessedCommand>() {
            @Override
            public ResourceListOfProcessedCommand call(ServiceResponse<ResourceListOfProcessedCommand> response) {
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
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromAsAt = null;
        final DateTime toAsAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfProcessedCommand>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfProcessedCommand>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfProcessedCommand> clientResponse = getPortfolioGroupCommandsDelegate(response);
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
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfProcessedCommand>, ResourceListOfProcessedCommand>() {
            @Override
            public ResourceListOfProcessedCommand call(ServiceResponse<ResourceListOfProcessedCommand> response) {
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
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfProcessedCommand>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfProcessedCommand>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfProcessedCommand> clientResponse = getPortfolioGroupCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfProcessedCommand> getPortfolioGroupCommandsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfProcessedCommand, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfProcessedCommand>() { }.getType())
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
     * @return the ExpandedGroup object if successful.
     */
    public ExpandedGroup getPortfolioGroupExpansion(String scope, String code) {
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
    public ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    public Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ExpandedGroup>, ExpandedGroup>() {
            @Override
            public ExpandedGroup call(ServiceResponse<ExpandedGroup> response) {
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
     * @return the observable to the ExpandedGroup object
     */
    public Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> propertyFilter = null;
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.CSV);
        return service.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpandedGroup>>>() {
                @Override
                public Observable<ServiceResponse<ExpandedGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpandedGroup> clientResponse = getPortfolioGroupExpansionDelegate(response);
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
     * @return the ExpandedGroup object if successful.
     */
    public ExpandedGroup getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
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
    public ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroup> serviceCallback) {
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
     * @return the observable to the ExpandedGroup object
     */
    public Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).map(new Func1<ServiceResponse<ExpandedGroup>, ExpandedGroup>() {
            @Override
            public ExpandedGroup call(ServiceResponse<ExpandedGroup> response) {
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
     * @return the observable to the ExpandedGroup object
     */
    public Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(propertyFilter);
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.CSV);
        return service.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilterConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpandedGroup>>>() {
                @Override
                public Observable<ServiceResponse<ExpandedGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpandedGroup> clientResponse = getPortfolioGroupExpansionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpandedGroup> getPortfolioGroupExpansionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ExpandedGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ExpandedGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addPortfolioToGroup(String scope, String code) {
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
    public ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = addPortfolioToGroupDelegate(response);
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addPortfolioToGroup(String scope, String code, ResourceId identifier) {
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
    public ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addPortfolioToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = addPortfolioToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> addPortfolioToGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode) {
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
    public ServiceFuture<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<PortfolioGroup> serviceCallback) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode) {
        return deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = deletePortfolioFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> deletePortfolioFromGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addSubGroupToGroup(String scope, String code) {
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
    public ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final ResourceId identifier = null;
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = addSubGroupToGroupDelegate(response);
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addSubGroupToGroup(String scope, String code, ResourceId identifier) {
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
    public ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier), serviceCallback);
    }

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, identifier).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(identifier);
        return service.addSubGroupToGroup(scope, code, identifier)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = addSubGroupToGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> addSubGroupToGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode) {
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
    public ServiceFuture<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<PortfolioGroup> serviceCallback) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode) {
        return deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
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
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioGroup>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioGroup>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioGroup> clientResponse = deleteSubGroupFromGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioGroup> deleteSubGroupFromGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioGroup, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioGroup>() { }.getType())
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
     * @return the ResourceListOfScope object if successful.
     */
    public ResourceListOfScope listPortfolioScopes() {
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
    public ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListOfScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    public Observable<ResourceListOfScope> listPortfolioScopesAsync() {
        return listPortfolioScopesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfScope>, ResourceListOfScope>() {
            @Override
            public ResourceListOfScope call(ServiceResponse<ResourceListOfScope> response) {
                return response.body();
            }
        });
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    public Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfScope> clientResponse = listPortfolioScopesDelegate(response);
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
     * @param filter Filter to be applied to the list of scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    public ResourceListOfScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @param filter Filter to be applied to the list of scopes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @param filter Filter to be applied to the list of scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    public Observable<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfScope>, ResourceListOfScope>() {
            @Override
            public ResourceListOfScope call(ServiceResponse<ResourceListOfScope> response) {
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
     * @param filter Filter to be applied to the list of scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    public Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.listPortfolioScopes(sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfScope>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfScope>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfScope> clientResponse = listPortfolioScopesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfScope> listPortfolioScopesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfScope, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfScope>() { }.getType())
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
     * @return the ResourceListOfPortfolio object if successful.
     */
    public ResourceListOfPortfolio listPortfolios(String scope) {
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
    public ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolio> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    public Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope) {
        return listPortfoliosWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListOfPortfolio>, ResourceListOfPortfolio>() {
            @Override
            public ResourceListOfPortfolio call(ServiceResponse<ResourceListOfPortfolio> response) {
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
     * @return the observable to the ResourceListOfPortfolio object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listPortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolio>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolio> clientResponse = listPortfoliosDelegate(response);
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
     * @return the ResourceListOfPortfolio object if successful.
     */
    public ResourceListOfPortfolio listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolio> serviceCallback) {
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
     * @return the observable to the ResourceListOfPortfolio object
     */
    public Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPortfolio>, ResourceListOfPortfolio>() {
            @Override
            public ResourceListOfPortfolio call(ServiceResponse<ResourceListOfPortfolio> response) {
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
     * @return the observable to the ResourceListOfPortfolio object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.listPortfolios(scope, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolio>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolio> clientResponse = listPortfoliosDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPortfolio> listPortfoliosDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPortfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPortfolio>() { }.getType())
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
     * @return the Portfolio object if successful.
     */
    public Portfolio getPortfolio(String scope, String code) {
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
    public ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> getPortfolioAsync(String scope, String code) {
        return getPortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        return service.getPortfolio(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = getPortfolioDelegate(response);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param asAt The asAt date to use
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolio(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = getPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Portfolio> getPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Portfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Portfolio>() { }.getType())
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
     * @return the Portfolio object if successful.
     */
    public Portfolio updatePortfolio(String scope, String code) {
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
    public ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> updatePortfolioAsync(String scope, String code) {
        return updatePortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdatePortfolioRequest request = null;
        final DateTime effectiveAt = null;
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = updatePortfolioDelegate(response);
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
     * @return the Portfolio object if successful.
     */
    public Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
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
    public ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Portfolio> serviceCallback) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        return updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updatePortfolio(scope, code, request, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = updatePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Portfolio> updatePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Portfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Portfolio>() { }.getType())
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
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByPortfolio(String scope, String code) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
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
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final AggregationRequest request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByPortfolio(scope, code, request, sortByConverted, start, limit)
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
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByPortfolio(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, code, request, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, code, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByPortfolioWithServiceResponseAsync(scope, code, request, sortBy, start, limit).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
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
     * @param code the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByPortfolio(scope, code, request, sortByConverted, start, limit)
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
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code).toBlocking().single().body();
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
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListOfProcessedCommand>, ResourceListOfProcessedCommand>() {
            @Override
            public ResourceListOfProcessedCommand call(ServiceResponse<ResourceListOfProcessedCommand> response) {
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
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromAsAt = null;
        final DateTime toAsAt = null;
        final String filter = null;
        return service.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfProcessedCommand>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfProcessedCommand>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfProcessedCommand> clientResponse = getPortfolioCommandsDelegate(response);
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
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).toBlocking().single().body();
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
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter), serviceCallback);
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
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, filter).map(new Func1<ServiceResponse<ResourceListOfProcessedCommand>, ResourceListOfProcessedCommand>() {
            @Override
            public ResourceListOfProcessedCommand call(ServiceResponse<ResourceListOfProcessedCommand> response) {
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
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfProcessedCommand>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfProcessedCommand>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfProcessedCommand> clientResponse = getPortfolioCommandsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfProcessedCommand> getPortfolioCommandsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfProcessedCommand, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfProcessedCommand>() { }.getType())
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
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties getPortfolioProperties(String scope, String code) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
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
    public ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get properties.
     * Get properties attached to the portfolio.  If the asAt is not specified then
     the latest system time is used.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioProperties>, PortfolioProperties>() {
            @Override
            public PortfolioProperties call(ServiceResponse<PortfolioProperties> response) {
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
     * @return the observable to the PortfolioProperties object
     */
    public Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getPortfolioProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioProperties>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioProperties>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioProperties> clientResponse = getPortfolioPropertiesDelegate(response);
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
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties getPortfolioProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).toBlocking().single().body();
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
    public ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit), serviceCallback);
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
     * @return the observable to the PortfolioProperties object
     */
    public Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<PortfolioProperties>, PortfolioProperties>() {
            @Override
            public PortfolioProperties call(ServiceResponse<PortfolioProperties> response) {
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
     * @return the observable to the PortfolioProperties object
     */
    public Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getPortfolioProperties(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioProperties>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioProperties>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioProperties> clientResponse = getPortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioProperties> getPortfolioPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioProperties, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioProperties>() { }.getType())
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
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties upsertPortfolioProperties(String scope, String code) {
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
    public ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioProperties>, PortfolioProperties>() {
            @Override
            public PortfolioProperties call(ServiceResponse<PortfolioProperties> response) {
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
     * @return the observable to the PortfolioProperties object
     */
    public Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final Map<String, CreatePropertyRequest> portfolioProperties = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioProperties(scope, code, portfolioProperties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioProperties>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioProperties>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioProperties> clientResponse = upsertPortfolioPropertiesDelegate(response);
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
     * @param portfolioProperties the Map&lt;String, CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties upsertPortfolioProperties(String scope, String code, Map<String, CreatePropertyRequest> portfolioProperties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt).toBlocking().single().body();
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, CreatePropertyRequest> portfolioProperties, DateTime effectiveAt, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt), serviceCallback);
    }

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, CreatePropertyRequest> portfolioProperties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt).map(new Func1<ServiceResponse<PortfolioProperties>, PortfolioProperties>() {
            @Override
            public PortfolioProperties call(ServiceResponse<PortfolioProperties> response) {
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
     * @param portfolioProperties the Map&lt;String, CreatePropertyRequest&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, Map<String, CreatePropertyRequest> portfolioProperties, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(portfolioProperties);
        return service.upsertPortfolioProperties(scope, code, portfolioProperties, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioProperties>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioProperties>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioProperties> clientResponse = upsertPortfolioPropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioProperties> upsertPortfolioPropertiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioProperties, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioProperties>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
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
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
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
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
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
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
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
        final List<String> portfolioPropertyKeys = null;
        String portfolioPropertyKeysConverted = this.serializerAdapter().serializeList(portfolioPropertyKeys, CollectionFormat.CSV);
        return service.deletePortfolioProperties(scope, code, effectiveAt, portfolioPropertyKeysConverted)
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
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param portfolioPropertyKeys The keys of the property to be deleted. None specified indicates the intent to delete all properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, portfolioPropertyKeys).toBlocking().single().body();
    }

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param portfolioPropertyKeys The keys of the property to be deleted. None specified indicates the intent to delete all properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, portfolioPropertyKeys), serviceCallback);
    }

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param portfolioPropertyKeys The keys of the property to be deleted. None specified indicates the intent to delete all properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, portfolioPropertyKeys).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param portfolioPropertyKeys The keys of the property to be deleted. None specified indicates the intent to delete all properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(portfolioPropertyKeys);
        String portfolioPropertyKeysConverted = this.serializerAdapter().serializeList(portfolioPropertyKeys, CollectionFormat.CSV);
        return service.deletePortfolioProperties(scope, code, effectiveAt, portfolioPropertyKeysConverted)
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
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioSearchResult object if successful.
     */
    public ResourceListOfPortfolioSearchResult portfoliosSearch() {
        return portfoliosSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback) {
        return ServiceFuture.fromResponse(portfoliosSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    public Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync() {
        return portfoliosSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfPortfolioSearchResult>, ResourceListOfPortfolioSearchResult>() {
            @Override
            public ResourceListOfPortfolioSearchResult call(ServiceResponse<ResourceListOfPortfolioSearchResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioSearchResult> clientResponse = portfoliosSearchDelegate(response);
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
     * @return the ResourceListOfPortfolioSearchResult object if successful.
     */
    public ResourceListOfPortfolioSearchResult portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback) {
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
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    public Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPortfolioSearchResult>, ResourceListOfPortfolioSearchResult>() {
            @Override
            public ResourceListOfPortfolioSearchResult call(ServiceResponse<ResourceListOfPortfolioSearchResult> response) {
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
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.portfoliosSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPortfolioSearchResult> clientResponse = portfoliosSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPortfolioSearchResult> portfoliosSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPortfolioSearchResult, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPortfolioSearchResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition propertiesSearch() {
        return propertiesSearchWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync() {
        return propertiesSearchWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfPropertyDefinition>, ResourceListOfPropertyDefinition>() {
            @Override
            public ResourceListOfPropertyDefinition call(ServiceResponse<ResourceListOfPropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync() {
        final Object request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPropertyDefinition> clientResponse = propertiesSearchDelegate(response);
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
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
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
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPropertyDefinition>, ResourceListOfPropertyDefinition>() {
            @Override
            public ResourceListOfPropertyDefinition call(ServiceResponse<ResourceListOfPropertyDefinition> response) {
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
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.propertiesSearch(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPropertyDefinition> clientResponse = propertiesSearchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPropertyDefinition> propertiesSearchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPropertyDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPropertyDefinition>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition getMultiplePropertyDefinitions() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync() {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfPropertyDefinition>, ResourceListOfPropertyDefinition>() {
            @Override
            public ResourceListOfPropertyDefinition call(ServiceResponse<ResourceListOfPropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync() {
        final List<String> keys = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.CSV);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getMultiplePropertyDefinitions(keysConverted, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPropertyDefinition> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
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
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
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
    public ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
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
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(keys, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPropertyDefinition>, ResourceListOfPropertyDefinition>() {
            @Override
            public ResourceListOfPropertyDefinition call(ServiceResponse<ResourceListOfPropertyDefinition> response) {
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
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(keys);
        Validator.validate(sortBy);
        String keysConverted = this.serializerAdapter().serializeList(keys, CollectionFormat.CSV);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getMultiplePropertyDefinitions(keysConverted, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfPropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfPropertyDefinition> clientResponse = getMultiplePropertyDefinitionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfPropertyDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfPropertyDefinition>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition createPropertyDefinition() {
        return createPropertyDefinitionWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> createPropertyDefinitionAsync() {
        return createPropertyDefinitionWithServiceResponseAsync().map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync() {
        final CreatePropertyDefinitionRequest definition = null;
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = createPropertyDefinitionDelegate(response);
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
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition createPropertyDefinition(CreatePropertyDefinitionRequest definition) {
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
    public ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(definition), serviceCallback);
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition) {
        return createPropertyDefinitionWithServiceResponseAsync(definition).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition) {
        Validator.validate(definition);
        return service.createPropertyDefinition(definition)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = createPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinition> createPropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<PropertyDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<PropertyDefinition>() { }.getType())
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
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition getPropertyDefinition(String domain, String scope, String name) {
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
    public ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String name) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = getPropertyDefinitionDelegate(response);
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
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition getPropertyDefinition(String domain, String scope, String name, DateTime asAt) {
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
    public ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt, final ServiceCallback<PropertyDefinition> serviceCallback) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, name, asAt).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, DateTime asAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = getPropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinition> getPropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinition>() { }.getType())
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
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition updatePropertyDefinition(String domain, String scope, String name) {
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
    public ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name), serviceCallback);
    }

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String name) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = updatePropertyDefinitionDelegate(response);
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
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition updatePropertyDefinition(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
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
    public ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, name, definition).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
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
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertyDefinition>>>() {
                @Override
                public Observable<ServiceResponse<PropertyDefinition>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertyDefinition> clientResponse = updatePropertyDefinitionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertyDefinition> updatePropertyDefinitionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PropertyDefinition, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertyDefinition>() { }.getType())
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
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    public ResourceListOfReconciliationBreak performReconciliation() {
        return performReconciliationWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReconciliationBreak> performReconciliationAsync(final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback) {
        return ServiceFuture.fromResponse(performReconciliationWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ResourceListOfReconciliationBreak> performReconciliationAsync() {
        return performReconciliationWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfReconciliationBreak>, ResourceListOfReconciliationBreak>() {
            @Override
            public ResourceListOfReconciliationBreak call(ServiceResponse<ResourceListOfReconciliationBreak> response) {
                return response.body();
            }
        });
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> performReconciliationWithServiceResponseAsync() {
        final ReconciliationRequest request = null;
        return service.performReconciliation(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReconciliationBreak>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReconciliationBreak> clientResponse = performReconciliationDelegate(response);
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
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    public ResourceListOfReconciliationBreak performReconciliation(ReconciliationRequest request) {
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
    public ServiceFuture<ResourceListOfReconciliationBreak> performReconciliationAsync(ReconciliationRequest request, final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback) {
        return ServiceFuture.fromResponse(performReconciliationWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ResourceListOfReconciliationBreak> performReconciliationAsync(ReconciliationRequest request) {
        return performReconciliationWithServiceResponseAsync(request).map(new Func1<ServiceResponse<ResourceListOfReconciliationBreak>, ResourceListOfReconciliationBreak>() {
            @Override
            public ResourceListOfReconciliationBreak call(ServiceResponse<ResourceListOfReconciliationBreak> response) {
                return response.body();
            }
        });
    }

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> performReconciliationWithServiceResponseAsync(ReconciliationRequest request) {
        Validator.validate(request);
        return service.performReconciliation(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReconciliationBreak>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReconciliationBreak> clientResponse = performReconciliationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfReconciliationBreak> performReconciliationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfReconciliationBreak, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfReconciliationBreak>() { }.getType())
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createReferencePortfolio(String scope) {
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
    public ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createReferencePortfolioAsync(String scope) {
        return createReferencePortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateReferencePortfolioRequest referencePortfolio = null;
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createReferencePortfolioDelegate(response);
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createReferencePortfolio(String scope, CreateReferencePortfolioRequest referencePortfolio) {
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
    public ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio), serviceCallback);
    }

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio) {
        return createReferencePortfolioWithServiceResponseAsync(scope, referencePortfolio).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope, CreateReferencePortfolioRequest referencePortfolio) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(referencePortfolio);
        return service.createReferencePortfolio(scope, referencePortfolio)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createReferencePortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Portfolio> createReferencePortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Portfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<Portfolio>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituent object if successful.
     */
    public ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    public Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<ResourceListOfReferencePortfolioConstituent>, ResourceListOfReferencePortfolioConstituent>() {
            @Override
            public ResourceListOfReferencePortfolioConstituent call(ServiceResponse<ResourceListOfReferencePortfolioConstituent> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    public Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
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
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReferencePortfolioConstituent> clientResponse = getReferencePortfolioConstituentsDelegate(response);
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
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituent object if successful.
     */
    public ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    public Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListOfReferencePortfolioConstituent>, ResourceListOfReferencePortfolioConstituent>() {
            @Override
            public ResourceListOfReferencePortfolioConstituent call(ServiceResponse<ResourceListOfReferencePortfolioConstituent> response) {
                return response.body();
            }
        });
    }

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    public Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReferencePortfolioConstituent> clientResponse = getReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfReferencePortfolioConstituent, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfReferencePortfolioConstituent>() { }.getType())
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
     * @return the UpsertReferencePortfolioConstituentsResponse object if successful.
     */
    public UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
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
    public ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    public Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>, UpsertReferencePortfolioConstituentsResponse>() {
            @Override
            public UpsertReferencePortfolioConstituentsResponse call(ServiceResponse<UpsertReferencePortfolioConstituentsResponse> response) {
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
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final List<ReferencePortfolioConstituentRequest> constituents = null;
        return service.upsertReferencePortfolioConstituents(scope, code, effectiveAt, constituents)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertReferencePortfolioConstituentsResponse> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
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
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsResponse object if successful.
     */
    public UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).toBlocking().single().body();
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents), serviceCallback);
    }

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    public Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).map(new Func1<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>, UpsertReferencePortfolioConstituentsResponse>() {
            @Override
            public UpsertReferencePortfolioConstituentsResponse call(ServiceResponse<UpsertReferencePortfolioConstituentsResponse> response) {
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
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertReferencePortfolioConstituentsResponse> clientResponse = upsertReferencePortfolioConstituentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertReferencePortfolioConstituentsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertReferencePortfolioConstituentsResponse>() { }.getType())
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
     * @return the Results object if successful.
     */
    public Results getResults(String scope, String key, DateTime dateParameter) {
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
    public ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    public Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<Results>, Results>() {
            @Override
            public Results call(ServiceResponse<Results> response) {
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
     * @return the observable to the Results object
     */
    public Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getResults(scope, key, dateParameter, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Results>>>() {
                @Override
                public Observable<ServiceResponse<Results>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Results> clientResponse = getResultsDelegate(response);
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
     * @return the Results object if successful.
     */
    public Results getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Results> serviceCallback) {
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
     * @return the observable to the Results object
     */
    public Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit).map(new Func1<ServiceResponse<Results>, Results>() {
            @Override
            public Results call(ServiceResponse<Results> response) {
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
     * @return the observable to the Results object
     */
    public Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getResults(scope, key, dateParameter, asAt, sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Results>>>() {
                @Override
                public Observable<ServiceResponse<Results>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Results> clientResponse = getResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Results> getResultsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Results, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Results>() { }.getType())
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
     * @return the Results object if successful.
     */
    public Results upsertResults(String scope, String key, DateTime dateParameter) {
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
    public ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback) {
        return ServiceFuture.fromResponse(upsertResultsWithServiceResponseAsync(scope, key, dateParameter), serviceCallback);
    }

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    public Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter).map(new Func1<ServiceResponse<Results>, Results>() {
            @Override
            public Results call(ServiceResponse<Results> response) {
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
     * @return the observable to the Results object
     */
    public Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Parameter key is required and cannot be null.");
        }
        if (dateParameter == null) {
            throw new IllegalArgumentException("Parameter dateParameter is required and cannot be null.");
        }
        final CreateResults request = null;
        return service.upsertResults(scope, key, dateParameter, request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Results>>>() {
                @Override
                public Observable<ServiceResponse<Results>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Results> clientResponse = upsertResultsDelegate(response);
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
     * @return the Results object if successful.
     */
    public Results upsertResults(String scope, String key, DateTime dateParameter, CreateResults request) {
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
    public ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request, final ServiceCallback<Results> serviceCallback) {
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
     * @return the observable to the Results object
     */
    public Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request) {
        return upsertResultsWithServiceResponseAsync(scope, key, dateParameter, request).map(new Func1<ServiceResponse<Results>, Results>() {
            @Override
            public Results call(ServiceResponse<Results> response) {
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
     * @return the observable to the Results object
     */
    public Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResults request) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Results>>>() {
                @Override
                public Observable<ServiceResponse<Results>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Results> clientResponse = upsertResultsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Results> upsertResultsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Results, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Results>() { }.getType())
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
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByResultSet(scope, resultsKey, request, sortByConverted, start, limit)
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
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request, sortBy, start, limit).map(new Func1<ServiceResponse<ListAggregationResponse>, ListAggregationResponse>() {
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
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    public Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (resultsKey == null) {
            throw new IllegalArgumentException("Parameter resultsKey is required and cannot be null.");
        }
        Validator.validate(request);
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getAggregationByResultSet(scope, resultsKey, request, sortByConverted, start, limit)
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
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfString object if successful.
     */
    public ResourceListOfString listEntities() {
        return listEntitiesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List all available entities.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfString> listEntitiesAsync(final ServiceCallback<ResourceListOfString> serviceCallback) {
        return ServiceFuture.fromResponse(listEntitiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    public Observable<ResourceListOfString> listEntitiesAsync() {
        return listEntitiesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfString>, ResourceListOfString>() {
            @Override
            public ResourceListOfString call(ServiceResponse<ResourceListOfString> response) {
                return response.body();
            }
        });
    }

    /**
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    public Observable<ServiceResponse<ResourceListOfString>> listEntitiesWithServiceResponseAsync() {
        return service.listEntities()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfString>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfString>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfString> clientResponse = listEntitiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfString> listEntitiesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfString, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfString>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Schema object if successful.
     */
    public Schema getEntitySchema(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).toBlocking().single().body();
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Schema> getEntitySchemaAsync(String entity, final ServiceCallback<Schema> serviceCallback) {
        return ServiceFuture.fromResponse(getEntitySchemaWithServiceResponseAsync(entity), serviceCallback);
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    public Observable<Schema> getEntitySchemaAsync(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).map(new Func1<ServiceResponse<Schema>, Schema>() {
            @Override
            public Schema call(ServiceResponse<Schema> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    public Observable<ServiceResponse<Schema>> getEntitySchemaWithServiceResponseAsync(String entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Parameter entity is required and cannot be null.");
        }
        return service.getEntitySchema(entity)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Schema>>>() {
                @Override
                public Observable<ServiceResponse<Schema>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Schema> clientResponse = getEntitySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Schema> getEntitySchemaDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Schema, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Schema>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    public PropertySchema getPropertySchema() {
        return getPropertySchemaWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertySchema> getPropertySchemaAsync(final ServiceCallback<PropertySchema> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    public Observable<PropertySchema> getPropertySchemaAsync() {
        return getPropertySchemaWithServiceResponseAsync().map(new Func1<ServiceResponse<PropertySchema>, PropertySchema>() {
            @Override
            public PropertySchema call(ServiceResponse<PropertySchema> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    public Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync() {
        final List<String> propertyKeys = null;
        final DateTime asAt = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.CSV);
        return service.getPropertySchema(propertyKeysConverted, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertySchema>>>() {
                @Override
                public Observable<ServiceResponse<PropertySchema>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertySchema> clientResponse = getPropertySchemaDelegate(response);
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
     * @return the PropertySchema object if successful.
     */
    public PropertySchema getPropertySchema(List<String> propertyKeys, DateTime asAt) {
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
    public ServiceFuture<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchema> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt), serviceCallback);
    }

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    public Observable<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt).map(new Func1<ServiceResponse<PropertySchema>, PropertySchema>() {
            @Override
            public PropertySchema call(ServiceResponse<PropertySchema> response) {
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
     * @return the observable to the PropertySchema object
     */
    public Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt) {
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.CSV);
        return service.getPropertySchema(propertyKeysConverted, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PropertySchema>>>() {
                @Override
                public Observable<ServiceResponse<PropertySchema>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PropertySchema> clientResponse = getPropertySchemaDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PropertySchema> getPropertySchemaDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<PropertySchema, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PropertySchema>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    public ResourceListOfValueType getValueTypes() {
        return getValueTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfValueType> getValueTypesAsync(final ServiceCallback<ResourceListOfValueType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ResourceListOfValueType> getValueTypesAsync() {
        return getValueTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfValueType>, ResourceListOfValueType>() {
            @Override
            public ResourceListOfValueType call(ServiceResponse<ResourceListOfValueType> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfValueType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfValueType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfValueType> clientResponse = getValueTypesDelegate(response);
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
     * @return the ResourceListOfValueType object if successful.
     */
    public ResourceListOfValueType getValueTypes(List<String> sortBy, Integer start, Integer limit) {
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
    public ServiceFuture<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfValueType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit) {
        return getValueTypesWithServiceResponseAsync(sortBy, start, limit).map(new Func1<ServiceResponse<ResourceListOfValueType>, ResourceListOfValueType>() {
            @Override
            public ResourceListOfValueType call(ServiceResponse<ResourceListOfValueType> response) {
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
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);
        return service.getValueTypes(sortByConverted, start, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfValueType>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfValueType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfValueType> clientResponse = getValueTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfValueType> getValueTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfValueType, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfValueType>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    public ResourceListOfTransactionMetaData listConfigurationTransactionTypes() {
        return listConfigurationTransactionTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(listConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync() {
        return listConfigurationTransactionTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfTransactionMetaData>, ResourceListOfTransactionMetaData>() {
            @Override
            public ResourceListOfTransactionMetaData call(ServiceResponse<ResourceListOfTransactionMetaData> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> listConfigurationTransactionTypesWithServiceResponseAsync() {
        return service.listConfigurationTransactionTypes()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfTransactionMetaData>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfTransactionMetaData> clientResponse = listConfigurationTransactionTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfTransactionMetaData, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfTransactionMetaData>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    public ResourceListOfTransactionMetaData setConfigurationTransactionTypes() {
        return setConfigurationTransactionTypesWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(setConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync() {
        return setConfigurationTransactionTypesWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfTransactionMetaData>, ResourceListOfTransactionMetaData>() {
            @Override
            public ResourceListOfTransactionMetaData call(ServiceResponse<ResourceListOfTransactionMetaData> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync() {
        final List<TransactionConfigurationDataRequest> types = null;
        return service.setConfigurationTransactionTypes(types)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfTransactionMetaData>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfTransactionMetaData> clientResponse = setConfigurationTransactionTypesDelegate(response);
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
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    public ResourceListOfTransactionMetaData setConfigurationTransactionTypes(List<TransactionConfigurationDataRequest> types) {
        return setConfigurationTransactionTypesWithServiceResponseAsync(types).toBlocking().single().body();
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types, final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(setConfigurationTransactionTypesWithServiceResponseAsync(types), serviceCallback);
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types) {
        return setConfigurationTransactionTypesWithServiceResponseAsync(types).map(new Func1<ServiceResponse<ResourceListOfTransactionMetaData>, ResourceListOfTransactionMetaData>() {
            @Override
            public ResourceListOfTransactionMetaData call(ServiceResponse<ResourceListOfTransactionMetaData> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync(List<TransactionConfigurationDataRequest> types) {
        Validator.validate(types);
        return service.setConfigurationTransactionTypes(types)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfTransactionMetaData>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfTransactionMetaData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfTransactionMetaData> clientResponse = setConfigurationTransactionTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfTransactionMetaData, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfTransactionMetaData>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    public TransactionConfigurationData createConfigurationTransactionType() {
        return createConfigurationTransactionTypeWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(final ServiceCallback<TransactionConfigurationData> serviceCallback) {
        return ServiceFuture.fromResponse(createConfigurationTransactionTypeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    public Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync() {
        return createConfigurationTransactionTypeWithServiceResponseAsync().map(new Func1<ServiceResponse<TransactionConfigurationData>, TransactionConfigurationData>() {
            @Override
            public TransactionConfigurationData call(ServiceResponse<TransactionConfigurationData> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    public Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync() {
        final TransactionConfigurationDataRequest type = null;
        return service.createConfigurationTransactionType(type)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransactionConfigurationData>>>() {
                @Override
                public Observable<ServiceResponse<TransactionConfigurationData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransactionConfigurationData> clientResponse = createConfigurationTransactionTypeDelegate(response);
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
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    public TransactionConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest type) {
        return createConfigurationTransactionTypeWithServiceResponseAsync(type).toBlocking().single().body();
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type, final ServiceCallback<TransactionConfigurationData> serviceCallback) {
        return ServiceFuture.fromResponse(createConfigurationTransactionTypeWithServiceResponseAsync(type), serviceCallback);
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    public Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type) {
        return createConfigurationTransactionTypeWithServiceResponseAsync(type).map(new Func1<ServiceResponse<TransactionConfigurationData>, TransactionConfigurationData>() {
            @Override
            public TransactionConfigurationData call(ServiceResponse<TransactionConfigurationData> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    public Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync(TransactionConfigurationDataRequest type) {
        Validator.validate(type);
        return service.createConfigurationTransactionType(type)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransactionConfigurationData>>>() {
                @Override
                public Observable<ServiceResponse<TransactionConfigurationData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransactionConfigurationData> clientResponse = createConfigurationTransactionTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TransactionConfigurationData> createConfigurationTransactionTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<TransactionConfigurationData, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<TransactionConfigurationData>() { }.getType())
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createPortfolio(String scope) {
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
    public ServiceFuture<Portfolio> createPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createPortfolioAsync(String scope) {
        return createPortfolioWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final CreateTransactionPortfolioRequest createRequest = null;
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createPortfolioDelegate(response);
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
     * @return the Portfolio object if successful.
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest) {
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
    public ServiceFuture<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope, createRequest), serviceCallback);
    }

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    public Observable<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest) {
        return createPortfolioWithServiceResponseAsync(scope, createRequest).map(new Func1<ServiceResponse<Portfolio>, Portfolio>() {
            @Override
            public Portfolio call(ServiceResponse<Portfolio> response) {
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
     * @return the observable to the Portfolio object
     */
    public Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope, CreateTransactionPortfolioRequest createRequest) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(createRequest);
        return service.createPortfolio(scope, createRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Portfolio>>>() {
                @Override
                public Observable<ServiceResponse<Portfolio>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Portfolio> clientResponse = createPortfolioDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Portfolio> createPortfolioDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Portfolio, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<Portfolio>() { }.getType())
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
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails getDetails(String scope, String code) {
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
    public ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback) {
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
     * @return the observable to the PortfolioDetails object
     */
    public Observable<PortfolioDetails> getDetailsAsync(String scope, String code) {
        return getDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDetails>, PortfolioDetails>() {
            @Override
            public PortfolioDetails call(ServiceResponse<PortfolioDetails> response) {
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
     * @return the observable to the PortfolioDetails object
     */
    public Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        return service.getDetails(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetails>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetails>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetails> clientResponse = getDetailsDelegate(response);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt).toBlocking().single().body();
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
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    public Observable<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt).map(new Func1<ServiceResponse<PortfolioDetails>, PortfolioDetails>() {
            @Override
            public PortfolioDetails call(ServiceResponse<PortfolioDetails> response) {
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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    public Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getDetails(scope, code, effectiveAt, asAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetails>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetails>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetails> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDetails> getDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDetails, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetails>() { }.getType())
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
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code) {
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
    public ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback) {
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
     * @return the observable to the PortfolioDetails object
     */
    public Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<PortfolioDetails>, PortfolioDetails>() {
            @Override
            public PortfolioDetails call(ServiceResponse<PortfolioDetails> response) {
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
     * @return the observable to the PortfolioDetails object
     */
    public Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final CreatePortfolioDetails details = null;
        final DateTime effectiveAt = null;
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetails>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetails>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetails> clientResponse = upsertPortfolioDetailsDelegate(response);
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
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).toBlocking().single().body();
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt), serviceCallback);
    }

    /**
     * Add/update portfolio details.
     * Update the portfolio details for the given code or add if it doesn't already exist. Updates with
     null values will remove any existing values.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    public Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).map(new Func1<ServiceResponse<PortfolioDetails>, PortfolioDetails>() {
            @Override
            public PortfolioDetails call(ServiceResponse<PortfolioDetails> response) {
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
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    public Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(details);
        return service.upsertPortfolioDetails(scope, code, details, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortfolioDetails>>>() {
                @Override
                public Observable<ServiceResponse<PortfolioDetails>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortfolioDetails> clientResponse = upsertPortfolioDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortfolioDetails> upsertPortfolioDetailsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PortfolioDetails, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PortfolioDetails>() { }.getType())
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
     * @return the VersionedResourceListOfHolding object if successful.
     */
    public VersionedResourceListOfHolding getHoldings(String scope, String code) {
        return getHoldingsWithServiceResponseAsync(scope, code).toBlocking().single().body();
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
    public ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code) {
        return getHoldingsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<VersionedResourceListOfHolding>, VersionedResourceListOfHolding>() {
            @Override
            public VersionedResourceListOfHolding call(ServiceResponse<VersionedResourceListOfHolding> response) {
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
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code) {
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
        final List<String> instrumentPropertyKeys = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
        return service.getHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfHolding>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfHolding> clientResponse = getHoldingsDelegate(response);
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
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfHolding object if successful.
     */
    public VersionedResourceListOfHolding getHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        return getHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys).toBlocking().single().body();
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
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the holdings
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys), serviceCallback);
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
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        return getHoldingsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys).map(new Func1<ServiceResponse<VersionedResourceListOfHolding>, VersionedResourceListOfHolding>() {
            @Override
            public VersionedResourceListOfHolding call(ServiceResponse<VersionedResourceListOfHolding> response) {
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
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(instrumentPropertyKeys);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
        return service.getHoldings(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter, instrumentPropertyKeysConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfHolding>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfHolding> clientResponse = getHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionedResourceListOfHolding> getHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<VersionedResourceListOfHolding, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListOfHolding>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(setHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<AdjustHolding>, AdjustHolding>() {
            @Override
            public AdjustHolding call(ServiceResponse<AdjustHolding> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
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
        return service.setHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHolding>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHolding> clientResponse = setHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(setHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).map(new Func1<ServiceResponse<AdjustHolding>, AdjustHolding>() {
            @Override
            public AdjustHolding call(ServiceResponse<AdjustHolding> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
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
        return service.setHoldings(scope, code, effectiveAt, holdingAdjustments)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHolding>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHolding> clientResponse = setHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdjustHolding> setHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AdjustHolding, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AdjustHolding>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<AdjustHolding>, AdjustHolding>() {
            @Override
            public AdjustHolding call(ServiceResponse<AdjustHolding> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHolding>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHolding> clientResponse = adjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).toBlocking().single().body();
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).map(new Func1<ServiceResponse<AdjustHolding>, AdjustHolding>() {
            @Override
            public AdjustHolding call(ServiceResponse<AdjustHolding> response) {
                return response.body();
            }
        });
    }

    /**
     * Adjust holdings.
     * Create transactions in a specific portfolio to bring it to the specified holdings.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    public Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdjustHolding>>>() {
                @Override
                public Observable<ServiceResponse<AdjustHolding>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdjustHolding> clientResponse = adjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdjustHolding> adjustHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AdjustHolding, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AdjustHolding>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Cancel adjust-holdings.
     * Cancels a previous adjust holdings request.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse cancelAdjustHoldings(String scope, String code, DateTime effectiveAt) {
        return cancelAdjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Cancel adjust-holdings.
     * Cancels a previous adjust holdings request.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(cancelAdjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Cancel adjust-holdings.
     * Cancels a previous adjust holdings request.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt) {
        return cancelAdjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancel adjust-holdings.
     * Cancels a previous adjust holdings request.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> cancelAdjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        return service.cancelAdjustHoldings(scope, code, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = cancelAdjustHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> cancelAdjustHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfHoldingsAdjustmentHeader object if successful.
     */
    public ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback) {
        return ServiceFuture.fromResponse(listHoldingsAdjustmentsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>, ResourceListOfHoldingsAdjustmentHeader>() {
            @Override
            public ResourceListOfHoldingsAdjustmentHeader call(ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromEffectiveAt = null;
        final DateTime toEffectiveAt = null;
        final DateTime asAtTime = null;
        return service.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> clientResponse = listHoldingsAdjustmentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfHoldingsAdjustmentHeader object if successful.
     */
    public ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime).toBlocking().single().body();
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback) {
        return ServiceFuture.fromResponse(listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime), serviceCallback);
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime).map(new Func1<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>, ResourceListOfHoldingsAdjustmentHeader>() {
            @Override
            public ResourceListOfHoldingsAdjustmentHeader call(ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> clientResponse = listHoldingsAdjustmentsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfHoldingsAdjustmentHeader, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfHoldingsAdjustmentHeader>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustment> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt).map(new Func1<ServiceResponse<HoldingsAdjustment>, HoldingsAdjustment>() {
            @Override
            public HoldingsAdjustment call(ServiceResponse<HoldingsAdjustment> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        final DateTime asAtTime = null;
        return service.getHoldingsAdjustment(scope, code, effectiveAt, asAtTime)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HoldingsAdjustment>>>() {
                @Override
                public Observable<ServiceResponse<HoldingsAdjustment>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HoldingsAdjustment> clientResponse = getHoldingsAdjustmentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAtTime) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAtTime).toBlocking().single().body();
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime, final ServiceCallback<HoldingsAdjustment> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAtTime), serviceCallback);
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAtTime).map(new Func1<ServiceResponse<HoldingsAdjustment>, HoldingsAdjustment>() {
            @Override
            public HoldingsAdjustment call(ServiceResponse<HoldingsAdjustment> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        return service.getHoldingsAdjustment(scope, code, effectiveAt, asAtTime)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HoldingsAdjustment>>>() {
                @Override
                public Observable<ServiceResponse<HoldingsAdjustment>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HoldingsAdjustment> clientResponse = getHoldingsAdjustmentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HoldingsAdjustment> getHoldingsAdjustmentDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<HoldingsAdjustment, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<HoldingsAdjustment>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTransaction object if successful.
     */
    public VersionedResourceListOfTransaction getTransactions(String scope, String code) {
        return getTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(getTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    public Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code) {
        return getTransactionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<VersionedResourceListOfTransaction>, VersionedResourceListOfTransaction>() {
            @Override
            public VersionedResourceListOfTransaction call(ServiceResponse<VersionedResourceListOfTransaction> response) {
                return response.body();
            }
        });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    public Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime fromTransactionDate = null;
        final DateTime toTransactionDate = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final List<String> instrumentPropertyKeys = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, sortByConverted, start, limit, instrumentPropertyKeysConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfTransaction>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfTransaction>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfTransaction> clientResponse = getTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTransactionDate Include transactions with a transaction date equal or later than this date. If not supplied, no lower filter is applied
     * @param toTransactionDate Include transactions with a transaction date equal or before this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the transactions
     * @param filter Transaction filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTransaction object if successful.
     */
    public VersionedResourceListOfTransaction getTransactions(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter) {
        return getTransactionsWithServiceResponseAsync(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, instrumentPropertyKeys, filter).toBlocking().single().body();
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTransactionDate Include transactions with a transaction date equal or later than this date. If not supplied, no lower filter is applied
     * @param toTransactionDate Include transactions with a transaction date equal or before this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the transactions
     * @param filter Transaction filter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(getTransactionsWithServiceResponseAsync(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, instrumentPropertyKeys, filter), serviceCallback);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTransactionDate Include transactions with a transaction date equal or later than this date. If not supplied, no lower filter is applied
     * @param toTransactionDate Include transactions with a transaction date equal or before this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the transactions
     * @param filter Transaction filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    public Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter) {
        return getTransactionsWithServiceResponseAsync(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, instrumentPropertyKeys, filter).map(new Func1<ServiceResponse<VersionedResourceListOfTransaction>, VersionedResourceListOfTransaction>() {
            @Override
            public VersionedResourceListOfTransaction call(ServiceResponse<VersionedResourceListOfTransaction> response) {
                return response.body();
            }
        });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTransactionDate Include transactions with a transaction date equal or later than this date. If not supplied, no lower filter is applied
     * @param toTransactionDate Include transactions with a transaction date equal or before this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the transactions
     * @param filter Transaction filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    public Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(instrumentPropertyKeys);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, sortByConverted, start, limit, instrumentPropertyKeysConverted, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfTransaction>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfTransaction>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfTransaction> clientResponse = getTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionedResourceListOfTransaction> getTransactionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<VersionedResourceListOfTransaction, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListOfTransaction>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactions object if successful.
     */
    public UpsertPortfolioTransactions upsertTransactions(String scope, String code) {
        return upsertTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTransactions> upsertTransactionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTransactions> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactions object
     */
    public Observable<UpsertPortfolioTransactions> upsertTransactionsAsync(String scope, String code) {
        return upsertTransactionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<UpsertPortfolioTransactions>, UpsertPortfolioTransactions>() {
            @Override
            public UpsertPortfolioTransactions call(ServiceResponse<UpsertPortfolioTransactions> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactions object
     */
    public Observable<ServiceResponse<UpsertPortfolioTransactions>> upsertTransactionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<TransactionRequest> transactions = null;
        return service.upsertTransactions(scope, code, transactions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTransactions>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTransactions>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTransactions> clientResponse = upsertTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactions object if successful.
     */
    public UpsertPortfolioTransactions upsertTransactions(String scope, String code, List<TransactionRequest> transactions) {
        return upsertTransactionsWithServiceResponseAsync(scope, code, transactions).toBlocking().single().body();
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTransactions> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ServiceCallback<UpsertPortfolioTransactions> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTransactionsWithServiceResponseAsync(scope, code, transactions), serviceCallback);
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactions object
     */
    public Observable<UpsertPortfolioTransactions> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions) {
        return upsertTransactionsWithServiceResponseAsync(scope, code, transactions).map(new Func1<ServiceResponse<UpsertPortfolioTransactions>, UpsertPortfolioTransactions>() {
            @Override
            public UpsertPortfolioTransactions call(ServiceResponse<UpsertPortfolioTransactions> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactions object
     */
    public Observable<ServiceResponse<UpsertPortfolioTransactions>> upsertTransactionsWithServiceResponseAsync(String scope, String code, List<TransactionRequest> transactions) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(transactions);
        return service.upsertTransactions(scope, code, transactions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTransactions>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTransactions>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTransactions> clientResponse = upsertTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPortfolioTransactions> upsertTransactionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertPortfolioTransactions, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioTransactions>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteTransactions(String scope, String code) {
        return deleteTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code) {
        return deleteTransactionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<String> id = null;
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.CSV);
        return service.deleteTransactions(scope, code, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteTransactions(String scope, String code, List<String> id) {
        return deleteTransactionsWithServiceResponseAsync(scope, code, id).toBlocking().single().body();
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of transactions to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTransactionsWithServiceResponseAsync(scope, code, id), serviceCallback);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id) {
        return deleteTransactionsWithServiceResponseAsync(scope, code, id).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param id Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code, List<String> id) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(id);
        String idConverted = this.serializerAdapter().serializeList(id, CollectionFormat.CSV);
        return service.deleteTransactions(scope, code, idConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deleteTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deleteTransactionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId).toBlocking().single().body();
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId), serviceCallback);
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId).map(new Func1<ServiceResponse<AddTransactionPropertyResponse>, AddTransactionPropertyResponse>() {
            @Override
            public AddTransactionPropertyResponse call(ServiceResponse<AddTransactionPropertyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (transactionId == null) {
            throw new IllegalArgumentException("Parameter transactionId is required and cannot be null.");
        }
        final Map<String, CreatePerpetualPropertyRequest> transactionProperties = null;
        return service.addTransactionProperty(scope, code, transactionId, transactionProperties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddTransactionPropertyResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddTransactionPropertyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddTransactionPropertyResponse> clientResponse = addTransactionPropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @param transactionProperties Transaction properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, CreatePerpetualPropertyRequest> transactionProperties) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties).toBlocking().single().body();
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @param transactionProperties Transaction properties to add
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, CreatePerpetualPropertyRequest> transactionProperties, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties), serviceCallback);
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @param transactionProperties Transaction properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, CreatePerpetualPropertyRequest> transactionProperties) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties).map(new Func1<ServiceResponse<AddTransactionPropertyResponse>, AddTransactionPropertyResponse>() {
            @Override
            public AddTransactionPropertyResponse call(ServiceResponse<AddTransactionPropertyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Add/update transaction properties.
     * Add one or more properties to a specific transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of transaction to add properties to
     * @param transactionProperties Transaction properties to add
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId, Map<String, CreatePerpetualPropertyRequest> transactionProperties) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (transactionId == null) {
            throw new IllegalArgumentException("Parameter transactionId is required and cannot be null.");
        }
        Validator.validate(transactionProperties);
        return service.addTransactionProperty(scope, code, transactionId, transactionProperties)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddTransactionPropertyResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddTransactionPropertyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddTransactionPropertyResponse> clientResponse = addTransactionPropertyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddTransactionPropertyResponse> addTransactionPropertyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AddTransactionPropertyResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(201, new TypeToken<AddTransactionPropertyResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId) {
        return deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId).toBlocking().single().body();
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId), serviceCallback);
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId) {
        return deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (transactionId == null) {
            throw new IllegalArgumentException("Parameter transactionId is required and cannot be null.");
        }
        final String transactionPropertyKey = null;
        return service.deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePropertyFromTransactionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @param transactionPropertyKey The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey) {
        return deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId, transactionPropertyKey).toBlocking().single().body();
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @param transactionPropertyKey The key of the property to be deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId, transactionPropertyKey), serviceCallback);
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @param transactionPropertyKey The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey) {
        return deletePropertyFromTransactionWithServiceResponseAsync(scope, code, transactionId, transactionPropertyKey).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete transaction property.
     * Delete a property from a specific transaction.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactionId Id of the transaction to delete the property from
     * @param transactionPropertyKey The key of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId, String transactionPropertyKey) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (transactionId == null) {
            throw new IllegalArgumentException("Parameter transactionId is required and cannot be null.");
        }
        return service.deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeletedEntityResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeletedEntityResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeletedEntityResponse> clientResponse = deletePropertyFromTransactionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeletedEntityResponse> deletePropertyFromTransactionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeletedEntityResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeletedEntityResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code) {
        return buildTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(buildTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    public Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code) {
        return buildTransactionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<VersionedResourceListOfOutputTransaction>, VersionedResourceListOfOutputTransaction>() {
            @Override
            public VersionedResourceListOfOutputTransaction call(ServiceResponse<VersionedResourceListOfOutputTransaction> response) {
                return response.body();
            }
        });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    public Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final List<String> instrumentPropertyKeys = null;
        final String filter = null;
        final TransactionQueryParameters parameters = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.buildTransactions(scope, code, asAt, sortByConverted, start, limit, instrumentPropertyKeysConverted, filter, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfOutputTransaction> clientResponse = buildTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters) {
        return buildTransactionsWithServiceResponseAsync(scope, code, asAt, sortBy, start, limit, instrumentPropertyKeys, filter, parameters).toBlocking().single().body();
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(buildTransactionsWithServiceResponseAsync(scope, code, asAt, sortBy, start, limit, instrumentPropertyKeys, filter, parameters), serviceCallback);
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    public Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters) {
        return buildTransactionsWithServiceResponseAsync(scope, code, asAt, sortBy, start, limit, instrumentPropertyKeys, filter, parameters).map(new Func1<ServiceResponse<VersionedResourceListOfOutputTransaction>, VersionedResourceListOfOutputTransaction>() {
            @Override
            public VersionedResourceListOfOutputTransaction call(ServiceResponse<VersionedResourceListOfOutputTransaction> response) {
                return response.body();
            }
        });
    }

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param instrumentPropertyKeys Keys for the instrument properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    public Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(instrumentPropertyKeys);
        Validator.validate(parameters);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.CSV);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.CSV);
        return service.buildTransactions(scope, code, asAt, sortByConverted, start, limit, instrumentPropertyKeysConverted, filter, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>>>() {
                @Override
                public Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VersionedResourceListOfOutputTransaction> clientResponse = buildTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VersionedResourceListOfOutputTransaction> buildTransactionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<VersionedResourceListOfOutputTransaction, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<VersionedResourceListOfOutputTransaction>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
