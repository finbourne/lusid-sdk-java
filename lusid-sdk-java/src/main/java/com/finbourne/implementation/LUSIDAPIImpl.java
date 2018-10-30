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
import com.finbourne.models.CreateAnalyticStoreRequest;
import com.finbourne.models.CreateClientInstrumentRequest;
import com.finbourne.models.CreateCorporateAction;
import com.finbourne.models.CreateDataTypeRequest;
import com.finbourne.models.CreateDerivedTransactionPortfolioRequest;
import com.finbourne.models.CreatePortfolioDetails;
import com.finbourne.models.CreatePortfolioGroupRequest;
import com.finbourne.models.CreatePropertyDefinitionRequest;
import com.finbourne.models.CreateReferencePortfolioRequest;
import com.finbourne.models.CreateResults;
import com.finbourne.models.CreateTransactionPortfolioRequest;
import com.finbourne.models.DataType;
import com.finbourne.models.DeleteClientInstrumentsResponse;
import com.finbourne.models.DeletedEntityResponse;
import com.finbourne.models.DeleteQuotesResponse;
import com.finbourne.models.ErrorResponseException;
import com.finbourne.models.ExecutionRequest;
import com.finbourne.models.ExpandedGroup;
import com.finbourne.models.HoldingsAdjustment;
import com.finbourne.models.Instrument;
import com.finbourne.models.InstrumentAnalytic;
import com.finbourne.models.InstrumentProperty;
import com.finbourne.models.IUnitDefinition;
import com.finbourne.models.ListAggregationResponse;
import com.finbourne.models.LookupInstrumentsFromCodesResponse;
import com.finbourne.models.NestedAggregationResponse;
import com.finbourne.models.PerpetualPropertyValue;
import com.finbourne.models.Personalisation;
import com.finbourne.models.Portfolio;
import com.finbourne.models.PortfolioDetails;
import com.finbourne.models.PortfolioGroup;
import com.finbourne.models.PortfolioProperties;
import com.finbourne.models.PortfoliosReconciliationRequest;
import com.finbourne.models.PropertyDefinition;
import com.finbourne.models.PropertySchema;
import com.finbourne.models.PropertyValue;
import com.finbourne.models.ReferencePortfolioConstituentRequest;
import com.finbourne.models.ResourceId;
import com.finbourne.models.ResourceListOfAnalyticStoreKey;
import com.finbourne.models.ResourceListOfCorporateActionEvent;
import com.finbourne.models.ResourceListOfDataType;
import com.finbourne.models.ResourceListOfHoldingsAdjustmentHeader;
import com.finbourne.models.ResourceListOfPersonalisation;
import com.finbourne.models.ResourceListOfPortfolio;
import com.finbourne.models.ResourceListOfPortfolioGroup;
import com.finbourne.models.ResourceListOfPortfolioSearchResult;
import com.finbourne.models.ResourceListOfProcessedCommand;
import com.finbourne.models.ResourceListOfPropertyDefinition;
import com.finbourne.models.ResourceListOfQuote;
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
import com.finbourne.models.UpsertPortfolioExecutionsResponse;
import com.finbourne.models.UpsertPortfolioTransactionsResponse;
import com.finbourne.models.UpsertQuoteRequest;
import com.finbourne.models.UpsertQuotesResponse;
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

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI setAnalytics" })
        @PUT("api/analytics/{scope}/{year}/{month}/{day}/prices")
        Observable<Response<ResponseBody>> setAnalytics(@Path("scope") String scope, @Path("year") int year, @Path("month") int month, @Path("day") int day, @Body List<InstrumentAnalytic> data);

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
        @GET("api/datatypes/{scope}/{code}")
        Observable<Response<ResponseBody>> getDataType(@Path("scope") String scope, @Path("code") String code);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updateDataType" })
        @PUT("api/datatypes/{scope}/{code}")
        Observable<Response<ResponseBody>> updateDataType(@Path("scope") String scope, @Path("code") String code, @Body UpdateDataTypeRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getUnitsFromDataType" })
        @GET("api/datatypes/{scope}/{code}/units")
        Observable<Response<ResponseBody>> getUnitsFromDataType(@Path("scope") String scope, @Path("code") String code, @Query("units") String units, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createDerivedPortfolio" })
        @POST("api/derivedtransactionportfolios/{scope}")
        Observable<Response<ResponseBody>> createDerivedPortfolio(@Path("scope") String scope, @Body CreateDerivedTransactionPortfolioRequest portfolio);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteDerivedPortfolioDetails" })
        @HTTP(path = "api/derivedtransactionportfolios/{scope}/{code}/details", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteDerivedPortfolioDetails(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI batchAddClientInstruments" })
        @POST("api/instruments")
        Observable<Response<ResponseBody>> batchAddClientInstruments(@Body Map<String, CreateClientInstrumentRequest> definitions);

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
        Observable<Response<ResponseBody>> batchUpsertInstrumentProperties(@Body List<InstrumentProperty> instrumentProperties);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getSamlIdentityProviderId" })
        @GET("api/login/saml/{domain}")
        Observable<Response<ResponseBody>> getSamlIdentityProviderId(@Path("domain") String domain);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getExcelDownloadUrl" })
        @GET("api/metadata/downloads/excel")
        Observable<Response<ResponseBody>> getExcelDownloadUrl(@Query("version") String version);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getExcelAddin" })
        @GET("api/metadata/downloads/exceladdin")
        Observable<Response<ResponseBody>> getExcelAddin(@Query("version") String version);

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
        Observable<Response<ResponseBody>> addPortfolioToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId portfolioId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioFromGroup" })
        @HTTP(path = "api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioFromGroup(@Path("scope") String scope, @Path("code") String code, @Path("portfolioScope") String portfolioScope, @Path("portfolioCode") String portfolioCode);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addSubGroupToGroup" })
        @POST("api/portfoliogroups/{scope}/{code}/subgroups")
        Observable<Response<ResponseBody>> addSubGroupToGroup(@Path("scope") String scope, @Path("code") String code, @Body ResourceId portfolioGroupId);

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
        Observable<Response<ResponseBody>> getPortfolioCommands(@Path("scope") String scope, @Path("code") String code, @Query("fromAsAt") DateTime fromAsAt, @Query("toAsAt") DateTime toAsAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPortfolioProperties" })
        @GET("api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> getPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertPortfolioProperties" })
        @POST("api/portfolios/{scope}/{code}/properties")
        Observable<Response<ResponseBody>> upsertPortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Body Map<String, PropertyValue> portfolioProperties, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePortfolioProperties" })
        @HTTP(path = "api/portfolios/{scope}/{code}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePortfolioProperties(@Path("scope") String scope, @Path("code") String code, @Query("effectiveAt") DateTime effectiveAt, @Query("portfolioPropertyKeys") String portfolioPropertyKeys);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI reconcileHoldings" })
        @POST("api/portfolios/$reconcileholdings")
        Observable<Response<ResponseBody>> reconcileHoldings(@Body PortfoliosReconciliationRequest request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getMultiplePropertyDefinitions" })
        @GET("api/propertydefinitions")
        Observable<Response<ResponseBody>> getMultiplePropertyDefinitions(@Query("propertyKeys") String propertyKeys, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI createPropertyDefinition" })
        @POST("api/propertydefinitions")
        Observable<Response<ResponseBody>> createPropertyDefinition(@Body CreatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getPropertyDefinition" })
        @GET("api/propertydefinitions/{domain}/{scope}/{code}")
        Observable<Response<ResponseBody>> getPropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("code") String code, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI updatePropertyDefinition" })
        @PUT("api/propertydefinitions/{domain}/{scope}/{code}")
        Observable<Response<ResponseBody>> updatePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("code") String code, @Body UpdatePropertyDefinitionRequest definition);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyDefinition" })
        @HTTP(path = "api/propertydefinitions/{domain}/{scope}/{code}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyDefinition(@Path("domain") String domain, @Path("scope") String scope, @Path("code") String code);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getQuotes" })
        @GET("api/quotes/{scope}")
        Observable<Response<ResponseBody>> getQuotes(@Path("scope") String scope, @Query("quoteIds") String quoteIds, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("maxAge") String maxAge, @Query("page") Integer page, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertQuotes" })
        @POST("api/quotes/{scope}")
        Observable<Response<ResponseBody>> upsertQuotes(@Path("scope") String scope, @Body List<UpsertQuoteRequest> quotes, @Query("effectiveAt") DateTime effectiveAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteQuote" })
        @HTTP(path = "api/quotes/{scope}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteQuote(@Path("scope") String scope, @Query("id") String id, @Query("effectiveFrom") DateTime effectiveFrom);

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

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfolioGroupsSearch" })
        @POST("api/search/portfoliogroups")
        Observable<Response<ResponseBody>> portfolioGroupsSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI portfoliosSearch" })
        @POST("api/search/portfolios")
        Observable<Response<ResponseBody>> portfoliosSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI propertiesSearch" })
        @POST("api/search/propertydefinitions")
        Observable<Response<ResponseBody>> propertiesSearch(@Body Object request, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter);

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

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertExecutions" })
        @POST("api/transactionportfolios/{scope}/{code}/executions")
        Observable<Response<ResponseBody>> upsertExecutions(@Path("scope") String scope, @Path("code") String code, @Body List<ExecutionRequest> executions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getHoldings" })
        @GET("api/transactionportfolios/{scope}/{code}/holdings")
        Observable<Response<ResponseBody>> getHoldings(@Path("scope") String scope, @Path("code") String code, @Query("byTaxlots") Boolean byTaxlots, @Query("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("filter") String filter, @Query("instrumentPropertyKeys") String instrumentPropertyKeys);

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
        Observable<Response<ResponseBody>> listHoldingsAdjustments(@Path("scope") String scope, @Path("code") String code, @Query("fromEffectiveAt") DateTime fromEffectiveAt, @Query("toEffectiveAt") DateTime toEffectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getHoldingsAdjustment" })
        @GET("api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt}")
        Observable<Response<ResponseBody>> getHoldingsAdjustment(@Path("scope") String scope, @Path("code") String code, @Path("effectiveAt") DateTime effectiveAt, @Query("asAt") DateTime asAt);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI getTransactions" })
        @GET("api/transactionportfolios/{scope}/{code}/transactions")
        Observable<Response<ResponseBody>> getTransactions(@Path("scope") String scope, @Path("code") String code, @Query("fromTransactionDate") DateTime fromTransactionDate, @Query("toTransactionDate") DateTime toTransactionDate, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("instrumentPropertyKeys") String instrumentPropertyKeys, @Query("filter") String filter);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI upsertTransactions" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions")
        Observable<Response<ResponseBody>> upsertTransactions(@Path("scope") String scope, @Path("code") String code, @Body List<TransactionRequest> transactions);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deleteTransactions" })
        @HTTP(path = "api/transactionportfolios/{scope}/{code}/transactions", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteTransactions(@Path("scope") String scope, @Path("code") String code, @Query("transactionIds") String transactionIds);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI addTransactionProperty" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties")
        Observable<Response<ResponseBody>> addTransactionProperty(@Path("scope") String scope, @Path("code") String code, @Path("transactionId") String transactionId, @Body Map<String, PerpetualPropertyValue> transactionProperties);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI deletePropertyFromTransaction" })
        @HTTP(path = "api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deletePropertyFromTransaction(@Path("scope") String scope, @Path("code") String code, @Path("transactionId") String transactionId, @Query("transactionPropertyKey") String transactionPropertyKey);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.finbourne.LUSIDAPI buildTransactions" })
        @POST("api/transactionportfolios/{scope}/{code}/transactions/$build")
        Observable<Response<ResponseBody>> buildTransactions(@Path("scope") String scope, @Path("code") String code, @Query("asAt") DateTime asAt, @Query("sortBy") String sortBy, @Query("start") Integer start, @Query("limit") Integer limit, @Query("instrumentPropertyKeys") String instrumentPropertyKeys, @Query("filter") String filter, @Body TransactionQueryParameters parameters);

    }

    /**
     * List analytic stores.
     * List all defined analytic stores.
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
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List analytic stores.
     * List all defined analytic stores.
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
     * List analytic stores.
     * List all defined analytic stores.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    public ResourceListOfAnalyticStoreKey listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback) {
        return ServiceFuture.fromResponse(listAnalyticStoresWithServiceResponseAsync(asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    public Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
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
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> createAnalyticStoreAsync(final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
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
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
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
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore createAnalyticStore(CreateAnalyticStoreRequest request) {
        return createAnalyticStoreWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(createAnalyticStoreWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
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
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore getAnalyticStore(String scope, int year, int month, int day, DateTime asAt) {
        return getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt).toBlocking().single().body();
    }

    /**
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(getAnalyticStoreWithServiceResponseAsync(scope, year, month, day, asAt), serviceCallback);
    }

    /**
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt Optional. The AsAt date of the data
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
     * Get analytic store.
     * Get the meta data associated with a specified scope and date combination (analytic store).
     *
     * @param scope The analytics data scope
     * @param year The year component of the date for the data in the scope
     * @param month The month component of the date for the data in the scope
     * @param day The day component of the date for the data in the scope
     * @param asAt Optional. The AsAt date of the data
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
     * Delete analytic store.
     * Delete stored analytic data in the specified scope for the specified date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date
     * @param month The month component of the date
     * @param day The day component of the date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteAnalyticStore(String scope, int year, int month, int day) {
        return deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day).toBlocking().single().body();
    }

    /**
     * Delete analytic store.
     * Delete stored analytic data in the specified scope for the specified date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date
     * @param month The month component of the date
     * @param day The day component of the date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteAnalyticStoreWithServiceResponseAsync(scope, year, month, day), serviceCallback);
    }

    /**
     * Delete analytic store.
     * Delete stored analytic data in the specified scope for the specified date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date
     * @param month The month component of the date
     * @param day The day component of the date
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
     * Delete analytic store.
     * Delete stored analytic data in the specified scope for the specified date.
     *
     * @param scope The analytics data scope
     * @param year The year component of the date
     * @param month The month component of the date
     * @param day The day component of the date
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
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore setAnalytics(String scope, int year, int month, int day) {
        return setAnalyticsWithServiceResponseAsync(scope, year, month, day).toBlocking().single().body();
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(setAnalyticsWithServiceResponseAsync(scope, year, month, day), serviceCallback);
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day) {
        return setAnalyticsWithServiceResponseAsync(scope, year, month, day).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
                return response.body();
            }
        });
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> setAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<InstrumentAnalytic> data = null;
        return service.setAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = setAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @param data The analytic data being inserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    public AnalyticStore setAnalytics(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        return setAnalyticsWithServiceResponseAsync(scope, year, month, day, data).toBlocking().single().body();
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @param data The analytic data being inserted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data, final ServiceCallback<AnalyticStore> serviceCallback) {
        return ServiceFuture.fromResponse(setAnalyticsWithServiceResponseAsync(scope, year, month, day, data), serviceCallback);
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @param data The analytic data being inserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        return setAnalyticsWithServiceResponseAsync(scope, year, month, day, data).map(new Func1<ServiceResponse<AnalyticStore>, AnalyticStore>() {
            @Override
            public AnalyticStore call(ServiceResponse<AnalyticStore> response) {
                return response.body();
            }
        });
    }

    /**
     * Set analytic data.
     * Store the complete set of analytics for an existing analytic store for the specified scope and date.
     *
     * @param scope The scope of the data being stored
     * @param year The year component of the date for the data
     * @param month The month component of the date for the data
     * @param day The day component of the date for the data
     * @param data The analytic data being inserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    public Observable<ServiceResponse<AnalyticStore>> setAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(data);
        return service.setAnalytics(scope, year, month, day, data)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AnalyticStore>>>() {
                @Override
                public Observable<ServiceResponse<AnalyticStore>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AnalyticStore> clientResponse = setAnalyticsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AnalyticStore> setAnalyticsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<AnalyticStore, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<AnalyticStore>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    public ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code) {
        return getCorporateActionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback) {
        return ServiceFuture.fromResponse(getCorporateActionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    public Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code) {
        return getCorporateActionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<ResourceListOfCorporateActionEvent>, ResourceListOfCorporateActionEvent>() {
            @Override
            public ResourceListOfCorporateActionEvent call(ServiceResponse<ResourceListOfCorporateActionEvent> response) {
                return response.body();
            }
        });
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    public Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code) {
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
        return service.getCorporateActions(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfCorporateActionEvent>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfCorporateActionEvent> clientResponse = getCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    public ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback) {
        return ServiceFuture.fromResponse(getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    public Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getCorporateActionsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfCorporateActionEvent>, ResourceListOfCorporateActionEvent>() {
            @Override
            public ResourceListOfCorporateActionEvent call(ServiceResponse<ResourceListOfCorporateActionEvent> response) {
                return response.body();
            }
        });
    }

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    public Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getCorporateActions(scope, code, effectiveAt, asAt, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfCorporateActionEvent>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfCorporateActionEvent> clientResponse = getCorporateActionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfCorporateActionEvent> getCorporateActionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfCorporateActionEvent, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfCorporateActionEvent>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    public UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
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
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
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
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @param actions The corporate action definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    public UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code, List<CreateCorporateAction> actions) {
        return batchUpsertCorporateActionsWithServiceResponseAsync(scope, code, actions).toBlocking().single().body();
    }

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @param actions The corporate action definitions
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertCorporateActionsWithServiceResponseAsync(scope, code, actions), serviceCallback);
    }

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @param actions The corporate action definitions
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
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @param actions The corporate action definitions
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
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
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
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> createDataTypeAsync(final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(createDataTypeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
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
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
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
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    public DataType createDataType(CreateDataTypeRequest request) {
        return createDataTypeWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> createDataTypeAsync(CreateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(createDataTypeWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
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
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
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
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfDataType object if successful.
     */
    public ResourceListOfDataType listDataTypes(String scope) {
        return listDataTypesWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, final ServiceCallback<ResourceListOfDataType> serviceCallback) {
        return ServiceFuture.fromResponse(listDataTypesWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
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
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param includeDefault Whether to additionally include those data types in the "default" scope
     * @param includeSystem Whether to additionally include those data types in the "system" scope
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfDataType object if successful.
     */
    public ResourceListOfDataType listDataTypes(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listDataTypesWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param includeDefault Whether to additionally include those data types in the "default" scope
     * @param includeSystem Whether to additionally include those data types in the "system" scope
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfDataType> serviceCallback) {
        return ServiceFuture.fromResponse(listDataTypesWithServiceResponseAsync(scope, includeDefault, includeSystem, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param includeDefault Whether to additionally include those data types in the "default" scope
     * @param includeSystem Whether to additionally include those data types in the "system" scope
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param includeDefault Whether to additionally include those data types in the "default" scope
     * @param includeSystem Whether to additionally include those data types in the "system" scope
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    public Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    public DataType getDataType(String scope, String code) {
        return getDataTypeWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> getDataTypeAsync(String scope, String code, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(getDataTypeWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> getDataTypeAsync(String scope, String code) {
        return getDataTypeWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> getDataTypeWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getDataType(scope, code)
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
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    public DataType updateDataType(String scope, String code) {
        return updateDataTypeWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> updateDataTypeAsync(String scope, String code, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(updateDataTypeWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> updateDataTypeAsync(String scope, String code) {
        return updateDataTypeWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdateDataTypeRequest request = null;
        return service.updateDataType(scope, code, request)
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
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param request The updated definition of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    public DataType updateDataType(String scope, String code, UpdateDataTypeRequest request) {
        return updateDataTypeWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param request The updated definition of the data type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataType> updateDataTypeAsync(String scope, String code, UpdateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback) {
        return ServiceFuture.fromResponse(updateDataTypeWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param request The updated definition of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<DataType> updateDataTypeAsync(String scope, String code, UpdateDataTypeRequest request) {
        return updateDataTypeWithServiceResponseAsync(scope, code, request).map(new Func1<ServiceResponse<DataType>, DataType>() {
            @Override
            public DataType call(ServiceResponse<DataType> response) {
                return response.body();
            }
        });
    }

    /**
     * Update data type definition.
     * Update the definition of the specified existing data type
     Not all elements within a data type definition are modifiable due to the potential implications for data
     already stored against the types.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param request The updated definition of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    public Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String code, UpdateDataTypeRequest request) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(request);
        return service.updateDataType(scope, code, request)
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
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinition object if successful.
     */
    public IUnitDefinition getUnitsFromDataType(String scope, String code) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String code, final ServiceCallback<IUnitDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getUnitsFromDataTypeWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String code) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<IUnitDefinition>, IUnitDefinition>() {
            @Override
            public IUnitDefinition call(ServiceResponse<IUnitDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<String> units = null;
        final String filter = null;
        String unitsConverted = this.serializerAdapter().serializeList(units, CollectionFormat.MULTI);
        return service.getUnitsFromDataType(scope, code, unitsConverted, filter)
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
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinition object if successful.
     */
    public IUnitDefinition getUnitsFromDataType(String scope, String code, List<String> units, String filter) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, code, units, filter).toBlocking().single().body();
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String code, List<String> units, String filter, final ServiceCallback<IUnitDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getUnitsFromDataTypeWithServiceResponseAsync(scope, code, units, filter), serviceCallback);
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String code, List<String> units, String filter) {
        return getUnitsFromDataTypeWithServiceResponseAsync(scope, code, units, filter).map(new Func1<ServiceResponse<IUnitDefinition>, IUnitDefinition>() {
            @Override
            public IUnitDefinition call(ServiceResponse<IUnitDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    public Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String code, List<String> units, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(units);
        String unitsConverted = this.serializerAdapter().serializeList(units, CollectionFormat.MULTI);
        return service.getUnitsFromDataType(scope, code, unitsConverted, filter)
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteDerivedPortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(final ServiceCallback<TryAddClientInstruments> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientInstrumentsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync() {
        final Map<String, CreateClientInstrumentRequest> definitions = null;
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
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param definitions The client instrument definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    public TryAddClientInstruments batchAddClientInstruments(Map<String, CreateClientInstrumentRequest> definitions) {
        return batchAddClientInstrumentsWithServiceResponseAsync(definitions).toBlocking().single().body();
    }

    /**
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param definitions The client instrument definitions
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(Map<String, CreateClientInstrumentRequest> definitions, final ServiceCallback<TryAddClientInstruments> serviceCallback) {
        return ServiceFuture.fromResponse(batchAddClientInstrumentsWithServiceResponseAsync(definitions), serviceCallback);
    }

    /**
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param definitions The client instrument definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync(Map<String, CreateClientInstrumentRequest> definitions) {
        return batchAddClientInstrumentsWithServiceResponseAsync(definitions).map(new Func1<ServiceResponse<TryAddClientInstruments>, TryAddClientInstruments>() {
            @Override
            public TryAddClientInstruments call(ServiceResponse<TryAddClientInstruments> response) {
                return response.body();
            }
        });
    }

    /**
     * Create instrument.
     * Attempt to create one or more "client" instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.
     The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the
     request.
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param definitions The client instrument definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    public Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync(Map<String, CreateClientInstrumentRequest> definitions) {
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
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientInstrumentsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync() {
        final List<String> uids = null;
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
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
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param uids The unique identifiers of the instruments to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    public DeleteClientInstrumentsResponse batchDeleteClientInstruments(List<String> uids) {
        return batchDeleteClientInstrumentsWithServiceResponseAsync(uids).toBlocking().single().body();
    }

    /**
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param uids The unique identifiers of the instruments to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids, final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchDeleteClientInstrumentsWithServiceResponseAsync(uids), serviceCallback);
    }

    /**
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param uids The unique identifiers of the instruments to delete
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
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param uids The unique identifiers of the instruments to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    public Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync(List<String> uids) {
        Validator.validate(uids);
        String uidsConverted = this.serializerAdapter().serializeList(uids, CollectionFormat.MULTI);
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
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
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    public Instrument getInstrument(String uid, DateTime asAt, List<String> instrumentPropertyKeys) {
        return getInstrumentWithServiceResponseAsync(uid, asAt, instrumentPropertyKeys).toBlocking().single().body();
    }

    /**
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<Instrument> serviceCallback) {
        return ServiceFuture.fromResponse(getInstrumentWithServiceResponseAsync(uid, asAt, instrumentPropertyKeys), serviceCallback);
    }

    /**
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
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
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    public Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys) {
        if (uid == null) {
            throw new IllegalArgumentException("Parameter uid is required and cannot be null.");
        }
        Validator.validate(instrumentPropertyKeys);
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(lookupInstrumentsFromCodesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
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
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync() {
        final String codeType = null;
        final List<String> codes = null;
        final DateTime asAt = null;
        final List<String> instrumentPropertyKeys = null;
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param codeType The type of identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes One or more identifiers of the type specified in the codeType
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    public LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys) {
        return lookupInstrumentsFromCodesWithServiceResponseAsync(codeType, codes, asAt, instrumentPropertyKeys).toBlocking().single().body();
    }

    /**
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param codeType The type of identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes One or more identifiers of the type specified in the codeType
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(lookupInstrumentsFromCodesWithServiceResponseAsync(codeType, codes, asAt, instrumentPropertyKeys), serviceCallback);
    }

    /**
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param codeType The type of identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes One or more identifiers of the type specified in the codeType
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
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
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @param codeType The type of identifiers. Possible values include: 'Undefined', 'LusidInstrumentId', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes One or more identifiers of the type specified in the codeType
     * @param asAt Optional. The AsAt date of the data
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    public Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys) {
        Validator.validate(codes);
        Validator.validate(instrumentPropertyKeys);
        String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
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
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
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
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
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
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync() {
        final List<InstrumentProperty> instrumentProperties = null;
        return service.batchUpsertInstrumentProperties(instrumentProperties)
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
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @param instrumentProperties The instrument property data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    public UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(List<InstrumentProperty> instrumentProperties) {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync(instrumentProperties).toBlocking().single().body();
    }

    /**
     * Upsert instrument properties.
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @param instrumentProperties The instrument property data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> instrumentProperties, final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(batchUpsertInstrumentPropertiesWithServiceResponseAsync(instrumentProperties), serviceCallback);
    }

    /**
     * Upsert instrument properties.
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @param instrumentProperties The instrument property data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> instrumentProperties) {
        return batchUpsertInstrumentPropertiesWithServiceResponseAsync(instrumentProperties).map(new Func1<ServiceResponse<UpsertInstrumentPropertiesResponse>, UpsertInstrumentPropertiesResponse>() {
            @Override
            public UpsertInstrumentPropertiesResponse call(ServiceResponse<UpsertInstrumentPropertiesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert instrument properties.
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @param instrumentProperties The instrument property data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    public Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync(List<InstrumentProperty> instrumentProperties) {
        Validator.validate(instrumentProperties);
        return service.batchUpsertInstrumentProperties(instrumentProperties)
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
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getSamlIdentityProviderId(String domain) {
        return getSamlIdentityProviderIdWithServiceResponseAsync(domain).toBlocking().single().body();
    }

    /**
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getSamlIdentityProviderIdAsync(String domain, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getSamlIdentityProviderIdWithServiceResponseAsync(domain), serviceCallback);
    }

    /**
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
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
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
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
     * Get Excel download url.
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
     * Get Excel download url.
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
     * Get Excel download url.
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
     * Get Excel download url.
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
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getExcelDownloadUrl(String version) {
        return getExcelDownloadUrlWithServiceResponseAsync(version).toBlocking().single().body();
    }

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getExcelDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getExcelDownloadUrlWithServiceResponseAsync(version), serviceCallback);
    }

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
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
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
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
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getExcelAddin() {
        return getExcelAddinWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getExcelAddinAsync(final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getExcelAddinWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getExcelAddinAsync() {
        return getExcelAddinWithServiceResponseAsync().map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getExcelAddinWithServiceResponseAsync() {
        final String version = null;
        return service.getExcelAddin(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getExcelAddinDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getExcelAddin(String version) {
        return getExcelAddinWithServiceResponseAsync(version).toBlocking().single().body();
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getExcelAddinAsync(String version, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getExcelAddinWithServiceResponseAsync(version), serviceCallback);
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getExcelAddinAsync(String version) {
        return getExcelAddinWithServiceResponseAsync(version).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getExcelAddinWithServiceResponseAsync(String version) {
        return service.getExcelAddin(version)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getExcelAddinDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getExcelAddinDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<String, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
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
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionSummary> getLusidVersionsAsync(final ServiceCallback<VersionSummary> serviceCallback) {
        return ServiceFuture.fromResponse(getLusidVersionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
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
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
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
     * Get personalisation.
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
     * Get personalisation.
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
     * Get personalisation.
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
     * Get personalisation.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope Optional. The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Optional. Whether to recurse into dereference recursive settings
     * @param wildcards Optional. Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    public ResourceListOfPersonalisation getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit) {
        return getPersonalisationsWithServiceResponseAsync(pattern, scope, recursive, wildcards, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope Optional. The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Optional. Whether to recurse into dereference recursive settings
     * @param wildcards Optional. Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisation> serviceCallback) {
        return ServiceFuture.fromResponse(getPersonalisationsWithServiceResponseAsync(pattern, scope, recursive, wildcards, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope Optional. The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Optional. Whether to recurse into dereference recursive settings
     * @param wildcards Optional. Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param pattern The search pattern or specific key
     * @param scope Optional. The scope level to request for. Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive Optional. Whether to recurse into dereference recursive settings
     * @param wildcards Optional. Whether to apply wildcards to the provided pattern and pull back any matching
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    public Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Upsert personalisations.
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
     * Upsert personalisations.
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
     * Upsert personalisations.
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
     * Upsert personalisations.
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
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    public UpsertPersonalisationResponse upsertPersonalisations(List<Personalisation> personalisations) {
        return upsertPersonalisationsWithServiceResponseAsync(personalisations).toBlocking().single().body();
    }

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations, final ServiceCallback<UpsertPersonalisationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPersonalisationsWithServiceResponseAsync(personalisations), serviceCallback);
    }

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
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
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
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
     * Delete a personalisation.
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
     * Delete a personalisation.
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
     * Delete a personalisation.
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
     * Delete a personalisation.
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
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group Optional. If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePersonalisation(String key, String scope, String group) {
        return deletePersonalisationWithServiceResponseAsync(key, scope, group).toBlocking().single().body();
    }

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group Optional. If deleting a setting at group level, specify the group here
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePersonalisationWithServiceResponseAsync(key, scope, group), serviceCallback);
    }

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group Optional. If deleting a setting at group level, specify the group here
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
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group Optional. If deleting a setting at group level, specify the group here
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
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup listPortfolioGroups(String scope) {
        return listPortfolioGroupsWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
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
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    public ResourceListOfPortfolioGroup listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioGroupsWithServiceResponseAsync(scope, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup createPortfolioGroup(String scope) {
        return createPortfolioGroupWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
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
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
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
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest request) {
        return createPortfolioGroupWithServiceResponseAsync(scope, request).toBlocking().single().body();
    }

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioGroupWithServiceResponseAsync(scope, request), serviceCallback);
    }

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
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
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
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
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup getPortfolioGroup(String scope, String code) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup getPortfolioGroup(String scope, String code, DateTime asAt) {
        return getPortfolioGroupWithServiceResponseAsync(scope, code, asAt).toBlocking().single().body();
    }

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupWithServiceResponseAsync(scope, code, asAt), serviceCallback);
    }

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param asAt Optional. The AsAt date of the data
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
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param asAt Optional. The AsAt date of the data
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
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup updatePortfolioGroup(String scope, String code) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The updated definition of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup updatePortfolioGroup(String scope, String code, UpdatePortfolioGroupRequest request) {
        return updatePortfolioGroupWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The updated definition of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The updated definition of the portfolio group
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
     * Update group.
     * Update the definition of the specified existing portfolio group.
     Not all elements within a portfolio group definition are modifiable after creation.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The updated definition of the portfolio group
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
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioGroup(String scope, String code) {
        return deletePortfolioGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String code) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByGroup(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByGroupWithServiceResponseAsync(scope, code, request, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByGroupWithServiceResponseAsync(scope, code, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String code) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    public NestedAggregationResponse getNestedAggregationByGroup(String scope, String code, AggregationRequest request) {
        return getNestedAggregationByGroupWithServiceResponseAsync(scope, code, request).toBlocking().single().body();
    }

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getNestedAggregationByGroupWithServiceResponseAsync(scope, code, request), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
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
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param request The request specifying the parameters of the aggregation
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
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
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
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpandedGroup object if successful.
     */
    public ExpandedGroup getPortfolioGroupExpansion(String scope, String code) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
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
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param propertyFilter Optional. The restricted set of properties that should be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpandedGroup object if successful.
     */
    public ExpandedGroup getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter) {
        return getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter).toBlocking().single().body();
    }

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param propertyFilter Optional. The restricted set of properties that should be returned
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroup> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioGroupExpansionWithServiceResponseAsync(scope, code, effectiveAt, asAt, propertyFilter), serviceCallback);
    }

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param propertyFilter Optional. The restricted set of properties that should be returned
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
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param propertyFilter Optional. The restricted set of properties that should be returned
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
        String propertyFilterConverted = this.serializerAdapter().serializeList(propertyFilter, CollectionFormat.MULTI);
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
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addPortfolioToGroup(String scope, String code) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
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
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
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
        final ResourceId portfolioId = null;
        return service.addPortfolioToGroup(scope, code, portfolioId)
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
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @param portfolioId The id of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addPortfolioToGroup(String scope, String code, ResourceId portfolioId) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, portfolioId).toBlocking().single().body();
    }

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @param portfolioId The id of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId portfolioId, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addPortfolioToGroupWithServiceResponseAsync(scope, code, portfolioId), serviceCallback);
    }

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @param portfolioId The id of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId portfolioId) {
        return addPortfolioToGroupWithServiceResponseAsync(scope, code, portfolioId).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @param portfolioId The id of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId portfolioId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(portfolioId);
        return service.addPortfolioToGroup(scope, code, portfolioId)
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
     * Remove portfolio from group.
     * Removes a portfolio from a portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param portfolioScope The scope of the portfolio being removed
     * @param portfolioCode The code of the portfolio being removed
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode) {
        return deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode).toBlocking().single().body();
    }

    /**
     * Remove portfolio from group.
     * Removes a portfolio from a portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param portfolioScope The scope of the portfolio being removed
     * @param portfolioCode The code of the portfolio being removed
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioFromGroupWithServiceResponseAsync(scope, code, portfolioScope, portfolioCode), serviceCallback);
    }

    /**
     * Remove portfolio from group.
     * Removes a portfolio from a portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param portfolioScope The scope of the portfolio being removed
     * @param portfolioCode The code of the portfolio being removed
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
     * Remove portfolio from group.
     * Removes a portfolio from a portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param portfolioScope The scope of the portfolio being removed
     * @param portfolioCode The code of the portfolio being removed
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
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addSubGroupToGroup(String scope, String code) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
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
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
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
        final ResourceId portfolioGroupId = null;
        return service.addSubGroupToGroup(scope, code, portfolioGroupId)
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
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @param portfolioGroupId The id of the portfolio group being added as a sub-group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup addSubGroupToGroup(String scope, String code, ResourceId portfolioGroupId) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, portfolioGroupId).toBlocking().single().body();
    }

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @param portfolioGroupId The id of the portfolio group being added as a sub-group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId portfolioGroupId, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(addSubGroupToGroupWithServiceResponseAsync(scope, code, portfolioGroupId), serviceCallback);
    }

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @param portfolioGroupId The id of the portfolio group being added as a sub-group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId portfolioGroupId) {
        return addSubGroupToGroupWithServiceResponseAsync(scope, code, portfolioGroupId).map(new Func1<ServiceResponse<PortfolioGroup>, PortfolioGroup>() {
            @Override
            public PortfolioGroup call(ServiceResponse<PortfolioGroup> response) {
                return response.body();
            }
        });
    }

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @param portfolioGroupId The id of the portfolio group being added as a sub-group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    public Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId portfolioGroupId) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(portfolioGroupId);
        return service.addSubGroupToGroup(scope, code, portfolioGroupId)
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
     * Remove group from group.
     * Remove a portfolio group (sub-group) from a parent portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param subgroupScope The scope of the sub-group being removed
     * @param subgroupCode The code of the sub-group being removed
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    public PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode) {
        return deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode).toBlocking().single().body();
    }

    /**
     * Remove group from group.
     * Remove a portfolio group (sub-group) from a parent portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param subgroupScope The scope of the sub-group being removed
     * @param subgroupCode The code of the sub-group being removed
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<PortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(deleteSubGroupFromGroupWithServiceResponseAsync(scope, code, subgroupScope, subgroupCode), serviceCallback);
    }

    /**
     * Remove group from group.
     * Remove a portfolio group (sub-group) from a parent portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param subgroupScope The scope of the sub-group being removed
     * @param subgroupCode The code of the sub-group being removed
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
     * Remove group from group.
     * Remove a portfolio group (sub-group) from a parent portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @param subgroupScope The scope of the sub-group being removed
     * @param subgroupCode The code of the sub-group being removed
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListOfScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Filter to be applied to the list of scopes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfolioScopesWithServiceResponseAsync(sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolio object if successful.
     */
    public ResourceListOfPortfolio listPortfolios(String scope) {
        return listPortfoliosWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolio> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
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
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolio object if successful.
     */
    public ResourceListOfPortfolio listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolio> serviceCallback) {
        return ServiceFuture.fromResponse(listPortfoliosWithServiceResponseAsync(scope, effectiveAt, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio getPortfolio(String scope, String code) {
        return getPortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
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
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
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
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio updatePortfolio(String scope, String code) {
        return updatePortfolioWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The updated portfolio definition
     * @param effectiveAt Optional. The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt) {
        return updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt).toBlocking().single().body();
    }

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The updated portfolio definition
     * @param effectiveAt Optional. The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(updatePortfolioWithServiceResponseAsync(scope, code, request, effectiveAt), serviceCallback);
    }

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The updated portfolio definition
     * @param effectiveAt Optional. The effective date for the change
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
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The updated portfolio definition
     * @param effectiveAt Optional. The effective date for the change
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete portfolio.
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Delete portfolio.
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
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
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByPortfolioWithServiceResponseAsync(scope, code, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate data in a portfolio.
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioCommandsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPortfolioCommands(scope, code, fromAsAt, toAsAt, sortByConverted, start, limit, filter)
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
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    public ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getPortfolioCommandsWithServiceResponseAsync(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfProcessedCommand>, ResourceListOfProcessedCommand>() {
            @Override
            public ResourceListOfProcessedCommand call(ServiceResponse<ResourceListOfProcessedCommand> response) {
                return response.body();
            }
        });
    }

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    public Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getPortfolioCommands(scope, code, fromAsAt, toAsAt, sortByConverted, start, limit, filter)
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
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties getPortfolioProperties(String scope, String code) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties getPortfolioProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getPortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(getPortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties upsertPortfolioProperties(String scope, String code) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        final Map<String, PropertyValue> portfolioProperties = null;
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
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param portfolioProperties The property values to be upserted to the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    public PortfolioProperties upsertPortfolioProperties(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt).toBlocking().single().body();
    }

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param portfolioProperties The property values to be upserted to the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt, final ServiceCallback<PortfolioProperties> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt), serviceCallback);
    }

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param portfolioProperties The property values to be upserted to the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt) {
        return upsertPortfolioPropertiesWithServiceResponseAsync(scope, code, portfolioProperties, effectiveAt).map(new Func1<ServiceResponse<PortfolioProperties>, PortfolioProperties>() {
            @Override
            public PortfolioProperties call(ServiceResponse<PortfolioProperties> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param portfolioProperties The property values to be upserted to the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    public Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt) {
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
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
        String portfolioPropertyKeysConverted = this.serializerAdapter().serializeList(portfolioPropertyKeys, CollectionFormat.MULTI);
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys) {
        return deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, portfolioPropertyKeys).toBlocking().single().body();
    }

    /**
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePortfolioPropertiesWithServiceResponseAsync(scope, code, effectiveAt, portfolioPropertyKeys), serviceCallback);
    }

    /**
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio
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
     * Delete portfolios.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Optional. The effective date of the deletion
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio
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
        String portfolioPropertyKeysConverted = this.serializerAdapter().serializeList(portfolioPropertyKeys, CollectionFormat.MULTI);
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
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    public ResourceListOfReconciliationBreak reconcileHoldings() {
        return reconcileHoldingsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback) {
        return ServiceFuture.fromResponse(reconcileHoldingsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync() {
        return reconcileHoldingsWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceListOfReconciliationBreak>, ResourceListOfReconciliationBreak>() {
            @Override
            public ResourceListOfReconciliationBreak call(ServiceResponse<ResourceListOfReconciliationBreak> response) {
                return response.body();
            }
        });
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync() {
        final PortfoliosReconciliationRequest request = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.reconcileHoldings(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReconciliationBreak>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReconciliationBreak> clientResponse = reconcileHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param request The specifications of the inputs to the reconciliation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    public ResourceListOfReconciliationBreak reconcileHoldings(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return reconcileHoldingsWithServiceResponseAsync(request, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param request The specifications of the inputs to the reconciliation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback) {
        return ServiceFuture.fromResponse(reconcileHoldingsWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param request The specifications of the inputs to the reconciliation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return reconcileHoldingsWithServiceResponseAsync(request, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfReconciliationBreak>, ResourceListOfReconciliationBreak>() {
            @Override
            public ResourceListOfReconciliationBreak call(ServiceResponse<ResourceListOfReconciliationBreak> response) {
                return response.body();
            }
        });
    }

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param request The specifications of the inputs to the reconciliation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(request);
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.reconcileHoldings(request, sortByConverted, start, limit, filter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfReconciliationBreak>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfReconciliationBreak>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfReconciliationBreak> clientResponse = reconcileHoldingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfReconciliationBreak> reconcileHoldingsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.restClient().responseBuilderFactory().<ResourceListOfReconciliationBreak, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfReconciliationBreak>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
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
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
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
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync() {
        final List<String> propertyKeys = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(propertyKeysConverted, asAt, sortByConverted, start, limit, filter)
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
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param propertyKeys One or more keys for properties for which the schema should be returned
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(propertyKeys, asAt, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param propertyKeys One or more keys for properties for which the schema should be returned
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getMultiplePropertyDefinitionsWithServiceResponseAsync(propertyKeys, asAt, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param propertyKeys One or more keys for properties for which the schema should be returned
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        return getMultiplePropertyDefinitionsWithServiceResponseAsync(propertyKeys, asAt, sortBy, start, limit, filter).map(new Func1<ServiceResponse<ResourceListOfPropertyDefinition>, ResourceListOfPropertyDefinition>() {
            @Override
            public ResourceListOfPropertyDefinition call(ServiceResponse<ResourceListOfPropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param propertyKeys One or more keys for properties for which the schema should be returned
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(propertyKeys);
        Validator.validate(sortBy);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
        return service.getMultiplePropertyDefinitions(propertyKeysConverted, asAt, sortByConverted, start, limit, filter)
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
     * Define a new property.
     * Create a new property definition.
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
     * Define a new property.
     * Create a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Define a new property.
     * Create a new property definition.
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
     * Define a new property.
     * Create a new property definition.
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
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition createPropertyDefinition(CreatePropertyDefinitionRequest definition) {
        return createPropertyDefinitionWithServiceResponseAsync(definition).toBlocking().single().body();
    }

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(createPropertyDefinitionWithServiceResponseAsync(definition), serviceCallback);
    }

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
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
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
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
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition getPropertyDefinition(String domain, String scope, String code) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, code).toBlocking().single().body();
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, code), serviceCallback);
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, code).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final DateTime asAt = null;
        return service.getPropertyDefinition(domain, scope, code, asAt)
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
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition getPropertyDefinition(String domain, String scope, String code, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, code, asAt).toBlocking().single().body();
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertyDefinitionWithServiceResponseAsync(domain, scope, code, asAt), serviceCallback);
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt) {
        return getPropertyDefinitionWithServiceResponseAsync(domain, scope, code, asAt).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Get property definition.
     * Retrieve the definition for the identified property.
     *
     * @param domain The Property Domain of the requested property. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the requested property
     * @param code The code of the requested property
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, DateTime asAt) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.getPropertyDefinition(domain, scope, code, asAt)
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
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition updatePropertyDefinition(String domain, String scope, String code) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code).toBlocking().single().body();
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code), serviceCallback);
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final UpdatePropertyDefinitionRequest definition = null;
        return service.updatePropertyDefinition(domain, scope, code, definition)
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
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @param definition The updated definition of the property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    public PropertyDefinition updatePropertyDefinition(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code, definition).toBlocking().single().body();
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @param definition The updated definition of the property
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code, definition), serviceCallback);
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @param definition The updated definition of the property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition) {
        return updatePropertyDefinitionWithServiceResponseAsync(domain, scope, code, definition).map(new Func1<ServiceResponse<PropertyDefinition>, PropertyDefinition>() {
            @Override
            public PropertyDefinition call(ServiceResponse<PropertyDefinition> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the definition of the specified existing property.
     * Not all elements within a property definition are modifiable due to the potential implications for data
     already stored against these properties.
     *
     * @param domain The Property Domain of the property being updated. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be updated
     * @param code The code of the property to be updated
     * @param definition The updated definition of the property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    public Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(definition);
        return service.updatePropertyDefinition(domain, scope, code, definition)
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
     * Delete property definition.
     * Delete the definition of the specified property.
     *
     * @param domain The Property Domain of the property to be deleted. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be deleted
     * @param code The code of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deletePropertyDefinition(String domain, String scope, String code) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, code).toBlocking().single().body();
    }

    /**
     * Delete property definition.
     * Delete the definition of the specified property.
     *
     * @param domain The Property Domain of the property to be deleted. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be deleted
     * @param code The code of the property to be deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deletePropertyDefinitionWithServiceResponseAsync(domain, scope, code), serviceCallback);
    }

    /**
     * Delete property definition.
     * Delete the definition of the specified property.
     *
     * @param domain The Property Domain of the property to be deleted. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be deleted
     * @param code The code of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code) {
        return deletePropertyDefinitionWithServiceResponseAsync(domain, scope, code).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete property definition.
     * Delete the definition of the specified property.
     *
     * @param domain The Property Domain of the property to be deleted. Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType', 'Instrument'
     * @param scope The scope of the property to be deleted
     * @param code The code of the property to be deleted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code) {
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.deletePropertyDefinition(domain, scope, code)
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
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfQuote object if successful.
     */
    public ResourceListOfQuote getQuotes(String scope) {
        return getQuotesWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfQuote> getQuotesAsync(String scope, final ServiceCallback<ResourceListOfQuote> serviceCallback) {
        return ServiceFuture.fromResponse(getQuotesWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfQuote object
     */
    public Observable<ResourceListOfQuote> getQuotesAsync(String scope) {
        return getQuotesWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<ResourceListOfQuote>, ResourceListOfQuote>() {
            @Override
            public ResourceListOfQuote call(ServiceResponse<ResourceListOfQuote> response) {
                return response.body();
            }
        });
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfQuote object
     */
    public Observable<ServiceResponse<ResourceListOfQuote>> getQuotesWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<String> quoteIds = null;
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final String maxAge = null;
        final Integer page = null;
        final Integer limit = null;
        String quoteIdsConverted = this.serializerAdapter().serializeList(quoteIds, CollectionFormat.MULTI);
        return service.getQuotes(scope, quoteIdsConverted, effectiveAt, asAt, maxAge, page, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfQuote>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfQuote>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfQuote> clientResponse = getQuotesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @param quoteIds The ids of the quotes
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @param asAt Optional. The 'AsAt' date/time
     * @param maxAge Optional. The quote staleness tolerance
     * @param page Optional. The page of results to return
     * @param limit Optional. The number of results per page
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfQuote object if successful.
     */
    public ResourceListOfQuote getQuotes(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit) {
        return getQuotesWithServiceResponseAsync(scope, quoteIds, effectiveAt, asAt, maxAge, page, limit).toBlocking().single().body();
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @param quoteIds The ids of the quotes
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @param asAt Optional. The 'AsAt' date/time
     * @param maxAge Optional. The quote staleness tolerance
     * @param page Optional. The page of results to return
     * @param limit Optional. The number of results per page
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfQuote> getQuotesAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit, final ServiceCallback<ResourceListOfQuote> serviceCallback) {
        return ServiceFuture.fromResponse(getQuotesWithServiceResponseAsync(scope, quoteIds, effectiveAt, asAt, maxAge, page, limit), serviceCallback);
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @param quoteIds The ids of the quotes
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @param asAt Optional. The 'AsAt' date/time
     * @param maxAge Optional. The quote staleness tolerance
     * @param page Optional. The page of results to return
     * @param limit Optional. The number of results per page
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfQuote object
     */
    public Observable<ResourceListOfQuote> getQuotesAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit) {
        return getQuotesWithServiceResponseAsync(scope, quoteIds, effectiveAt, asAt, maxAge, page, limit).map(new Func1<ServiceResponse<ResourceListOfQuote>, ResourceListOfQuote>() {
            @Override
            public ResourceListOfQuote call(ServiceResponse<ResourceListOfQuote> response) {
                return response.body();
            }
        });
    }

    /**
     * Get quotes.
     * Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.
     Quotes which are older than this at the time of the effective date/time will not be returned.
     MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).
     The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page.
     *
     * @param scope The scope of the quotes
     * @param quoteIds The ids of the quotes
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @param asAt Optional. The 'AsAt' date/time
     * @param maxAge Optional. The quote staleness tolerance
     * @param page Optional. The page of results to return
     * @param limit Optional. The number of results per page
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfQuote object
     */
    public Observable<ServiceResponse<ResourceListOfQuote>> getQuotesWithServiceResponseAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(quoteIds);
        String quoteIdsConverted = this.serializerAdapter().serializeList(quoteIds, CollectionFormat.MULTI);
        return service.getQuotes(scope, quoteIdsConverted, effectiveAt, asAt, maxAge, page, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceListOfQuote>>>() {
                @Override
                public Observable<ServiceResponse<ResourceListOfQuote>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceListOfQuote> clientResponse = getQuotesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceListOfQuote> getQuotesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceListOfQuote, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceListOfQuote>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertQuotesResponse object if successful.
     */
    public UpsertQuotesResponse upsertQuotes(String scope) {
        return upsertQuotesWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertQuotesResponse> upsertQuotesAsync(String scope, final ServiceCallback<UpsertQuotesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertQuotesWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    public Observable<UpsertQuotesResponse> upsertQuotesAsync(String scope) {
        return upsertQuotesWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<UpsertQuotesResponse>, UpsertQuotesResponse>() {
            @Override
            public UpsertQuotesResponse call(ServiceResponse<UpsertQuotesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    public Observable<ServiceResponse<UpsertQuotesResponse>> upsertQuotesWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final List<UpsertQuoteRequest> quotes = null;
        final DateTime effectiveAt = null;
        return service.upsertQuotes(scope, quotes, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertQuotesResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertQuotesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertQuotesResponse> clientResponse = upsertQuotesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param quotes The quotes to add
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertQuotesResponse object if successful.
     */
    public UpsertQuotesResponse upsertQuotes(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt) {
        return upsertQuotesWithServiceResponseAsync(scope, quotes, effectiveAt).toBlocking().single().body();
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param quotes The quotes to add
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertQuotesResponse> upsertQuotesAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt, final ServiceCallback<UpsertQuotesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertQuotesWithServiceResponseAsync(scope, quotes, effectiveAt), serviceCallback);
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param quotes The quotes to add
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    public Observable<UpsertQuotesResponse> upsertQuotesAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt) {
        return upsertQuotesWithServiceResponseAsync(scope, quotes, effectiveAt).map(new Func1<ServiceResponse<UpsertQuotesResponse>, UpsertQuotesResponse>() {
            @Override
            public UpsertQuotesResponse call(ServiceResponse<UpsertQuotesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param quotes The quotes to add
     * @param effectiveAt Optional. The date/time from which the quotes are effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    public Observable<ServiceResponse<UpsertQuotesResponse>> upsertQuotesWithServiceResponseAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        Validator.validate(quotes);
        return service.upsertQuotes(scope, quotes, effectiveAt)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertQuotesResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertQuotesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertQuotesResponse> clientResponse = upsertQuotesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertQuotesResponse> upsertQuotesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertQuotesResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertQuotesResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteQuotesResponse object if successful.
     */
    public DeleteQuotesResponse deleteQuote(String scope) {
        return deleteQuoteWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteQuotesResponse> deleteQuoteAsync(String scope, final ServiceCallback<DeleteQuotesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteQuoteWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    public Observable<DeleteQuotesResponse> deleteQuoteAsync(String scope) {
        return deleteQuoteWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<DeleteQuotesResponse>, DeleteQuotesResponse>() {
            @Override
            public DeleteQuotesResponse call(ServiceResponse<DeleteQuotesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    public Observable<ServiceResponse<DeleteQuotesResponse>> deleteQuoteWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        final String id = null;
        final DateTime effectiveFrom = null;
        return service.deleteQuote(scope, id, effectiveFrom)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteQuotesResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeleteQuotesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteQuotesResponse> clientResponse = deleteQuoteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param id The quote id
     * @param effectiveFrom The date/time from which the quote is effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteQuotesResponse object if successful.
     */
    public DeleteQuotesResponse deleteQuote(String scope, String id, DateTime effectiveFrom) {
        return deleteQuoteWithServiceResponseAsync(scope, id, effectiveFrom).toBlocking().single().body();
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param id The quote id
     * @param effectiveFrom The date/time from which the quote is effective
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteQuotesResponse> deleteQuoteAsync(String scope, String id, DateTime effectiveFrom, final ServiceCallback<DeleteQuotesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteQuoteWithServiceResponseAsync(scope, id, effectiveFrom), serviceCallback);
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param id The quote id
     * @param effectiveFrom The date/time from which the quote is effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    public Observable<DeleteQuotesResponse> deleteQuoteAsync(String scope, String id, DateTime effectiveFrom) {
        return deleteQuoteWithServiceResponseAsync(scope, id, effectiveFrom).map(new Func1<ServiceResponse<DeleteQuotesResponse>, DeleteQuotesResponse>() {
            @Override
            public DeleteQuotesResponse call(ServiceResponse<DeleteQuotesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param id The quote id
     * @param effectiveFrom The date/time from which the quote is effective
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    public Observable<ServiceResponse<DeleteQuotesResponse>> deleteQuoteWithServiceResponseAsync(String scope, String id, DateTime effectiveFrom) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        return service.deleteQuote(scope, id, effectiveFrom)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteQuotesResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeleteQuotesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteQuotesResponse> clientResponse = deleteQuoteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeleteQuotesResponse> deleteQuoteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DeleteQuotesResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DeleteQuotesResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Create reference portfolio.
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
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituent object if successful.
     */
    public ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
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
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituent object if successful.
     */
    public ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback) {
        return ServiceFuture.fromResponse(getReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
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
     * Get constituents.
     * Get all the constituents in the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The scope of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsResponse object if successful.
     */
    public UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
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
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
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
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param constituents The constituents to upload to the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsResponse object if successful.
     */
    public UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents) {
        return upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents).toBlocking().single().body();
    }

    /**
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param constituents The constituents to upload to the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertReferencePortfolioConstituentsWithServiceResponseAsync(scope, code, effectiveAt, constituents), serviceCallback);
    }

    /**
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param constituents The constituents to upload to the portfolio
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
     * Add constituents.
     * Add constituents to the specified reference portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param constituents The constituents to upload to the portfolio
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
     * Get results.
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
     * Get results.
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
     * Get results.
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
     * Get results.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get results.
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Results object if successful.
     */
    public Results getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit) {
        return getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get results.
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Results> serviceCallback) {
        return ServiceFuture.fromResponse(getResultsWithServiceResponseAsync(scope, key, dateParameter, asAt, sortBy, start, limit), serviceCallback);
    }

    /**
     * Get results.
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Get results.
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Upsert results.
     * Upsert pre-calculated results against a specified scope/key/date combination.
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
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey).toBlocking().single().body();
    }

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey), serviceCallback);
    }

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
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
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    public ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit) {
        return getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request, sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getAggregationByResultSetWithServiceResponseAsync(scope, resultsKey, request, sortBy, start, limit), serviceCallback);
    }

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @param request The request specifying the parameters of the aggregation
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List entities.
     * List all available entities for which schema information is available.
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
     * List entities.
     * List all available entities for which schema information is available.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfString> listEntitiesAsync(final ServiceCallback<ResourceListOfString> serviceCallback) {
        return ServiceFuture.fromResponse(listEntitiesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List entities.
     * List all available entities for which schema information is available.
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
     * List entities.
     * List all available entities for which schema information is available.
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
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Schema object if successful.
     */
    public Schema getEntitySchema(String entity) {
        return getEntitySchemaWithServiceResponseAsync(entity).toBlocking().single().body();
    }

    /**
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Schema> getEntitySchemaAsync(String entity, final ServiceCallback<Schema> serviceCallback) {
        return ServiceFuture.fromResponse(getEntitySchemaWithServiceResponseAsync(entity), serviceCallback);
    }

    /**
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
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
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
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
     * Get property schema.
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
     * Get property schema.
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
     * Get property schema.
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
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    public Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync() {
        final List<String> propertyKeys = null;
        final DateTime asAt = null;
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
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
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    public PropertySchema getPropertySchema(List<String> propertyKeys, DateTime asAt) {
        return getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt).toBlocking().single().body();
    }

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchema> serviceCallback) {
        return ServiceFuture.fromResponse(getPropertySchemaWithServiceResponseAsync(propertyKeys, asAt), serviceCallback);
    }

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
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
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    public Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt) {
        Validator.validate(propertyKeys);
        String propertyKeysConverted = this.serializerAdapter().serializeList(propertyKeys, CollectionFormat.MULTI);
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
     * Get value types.
     * Gets the available value types for which a schema is available.
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
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfValueType> getValueTypesAsync(final ServiceCallback<ResourceListOfValueType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
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
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync() {
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    public ResourceListOfValueType getValueTypes(List<String> sortBy, Integer start, Integer limit) {
        return getValueTypesWithServiceResponseAsync(sortBy, start, limit).toBlocking().single().body();
    }

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfValueType> serviceCallback) {
        return ServiceFuture.fromResponse(getValueTypesWithServiceResponseAsync(sortBy, start, limit), serviceCallback);
    }

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
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
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    public Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search portfolio groups.
     * Search through all portfolio groups.
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
     * Search through all portfolio groups.
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
     * Search through all portfolio groups.
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
     * Search through all portfolio groups.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search through all portfolio groups.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Search through all portfolio groups.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback) {
        return ServiceFuture.fromResponse(portfolioGroupsSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search portfolio groups.
     * Search through all portfolio groups.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Search through all portfolio groups.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search portfolios.
     * Search through all portfolios.
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
     * Search through all portfolios.
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
     * Search through all portfolios.
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
     * Search through all portfolios.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search through all portfolios.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Search through all portfolios.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback) {
        return ServiceFuture.fromResponse(portfoliosSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search portfolios.
     * Search through all portfolios.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Search through all portfolios.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    public Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search property definitions.
     * Search through all property definitions.
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
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search property definitions.
     * Search through all property definitions.
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
     * Search property definitions.
     * Search through all property definitions.
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    public ResourceListOfPropertyDefinition propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        return propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter).toBlocking().single().body();
    }

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback) {
        return ServiceFuture.fromResponse(propertiesSearchWithServiceResponseAsync(request, sortBy, start, limit, filter), serviceCallback);
    }

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
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
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param request A valid Elasticsearch 5.x request
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    public Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter) {
        Validator.validate(sortBy);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);
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
     * List transaction types.
     * Get the list of persisted transaction types.
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
     * List transaction types.
     * Get the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(listConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List transaction types.
     * Get the list of persisted transaction types.
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
     * List transaction types.
     * Get the list of persisted transaction types.
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
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
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
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(setConfigurationTransactionTypesWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
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
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
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
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    public ResourceListOfTransactionMetaData setConfigurationTransactionTypes(List<TransactionConfigurationDataRequest> types) {
        return setConfigurationTransactionTypesWithServiceResponseAsync(types).toBlocking().single().body();
    }

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types, final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback) {
        return ServiceFuture.fromResponse(setConfigurationTransactionTypesWithServiceResponseAsync(types), serviceCallback);
    }

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
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
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
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
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
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
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(final ServiceCallback<TransactionConfigurationData> serviceCallback) {
        return ServiceFuture.fromResponse(createConfigurationTransactionTypeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
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
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
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
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    public TransactionConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest type) {
        return createConfigurationTransactionTypeWithServiceResponseAsync(type).toBlocking().single().body();
    }

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type, final ServiceCallback<TransactionConfigurationData> serviceCallback) {
        return ServiceFuture.fromResponse(createConfigurationTransactionTypeWithServiceResponseAsync(type), serviceCallback);
    }

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
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
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
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
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio createPortfolio(String scope) {
        return createPortfolioWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> createPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
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
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
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
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest) {
        return createPortfolioWithServiceResponseAsync(scope, createRequest).toBlocking().single().body();
    }

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ServiceCallback<Portfolio> serviceCallback) {
        return ServiceFuture.fromResponse(createPortfolioWithServiceResponseAsync(scope, createRequest), serviceCallback);
    }

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
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
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get portfolio details.
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Get portfolio details.
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
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
     * Get the details document associated with a transaction portfolio
     When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt Optional. The effective date of the data
     * @param asAt Optional. The AsAt date of the data
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
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioDetailsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param details The set of details for the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt) {
        return upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt).toBlocking().single().body();
    }

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param details The set of details for the portfolio
     * @param effectiveAt Optional. The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt, final ServiceCallback<PortfolioDetails> serviceCallback) {
        return ServiceFuture.fromResponse(upsertPortfolioDetailsWithServiceResponseAsync(scope, code, details, effectiveAt), serviceCallback);
    }

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param details The set of details for the portfolio
     * @param effectiveAt Optional. The effective date of the change
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
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param details The set of details for the portfolio
     * @param effectiveAt Optional. The effective date of the change
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
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioExecutionsResponse object if successful.
     */
    public UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code) {
        return upsertExecutionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioExecutionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertExecutionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    public Observable<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code) {
        return upsertExecutionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<UpsertPortfolioExecutionsResponse>, UpsertPortfolioExecutionsResponse>() {
            @Override
            public UpsertPortfolioExecutionsResponse call(ServiceResponse<UpsertPortfolioExecutionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    public Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> upsertExecutionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<ExecutionRequest> executions = null;
        return service.upsertExecutions(scope, code, executions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioExecutionsResponse> clientResponse = upsertExecutionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param executions The executions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioExecutionsResponse object if successful.
     */
    public UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code, List<ExecutionRequest> executions) {
        return upsertExecutionsWithServiceResponseAsync(scope, code, executions).toBlocking().single().body();
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param executions The executions to be updated
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions, final ServiceCallback<UpsertPortfolioExecutionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertExecutionsWithServiceResponseAsync(scope, code, executions), serviceCallback);
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param executions The executions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    public Observable<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions) {
        return upsertExecutionsWithServiceResponseAsync(scope, code, executions).map(new Func1<ServiceResponse<UpsertPortfolioExecutionsResponse>, UpsertPortfolioExecutionsResponse>() {
            @Override
            public UpsertPortfolioExecutionsResponse call(ServiceResponse<UpsertPortfolioExecutionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param executions The executions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    public Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> upsertExecutionsWithServiceResponseAsync(String scope, String code, List<ExecutionRequest> executions) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(executions);
        return service.upsertExecutions(scope, code, executions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioExecutionsResponse> clientResponse = upsertExecutionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPortfolioExecutionsResponse> upsertExecutionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertPortfolioExecutionsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioExecutionsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        final Boolean byTaxlots = null;
        final DateTime effectiveAt = null;
        final DateTime asAt = null;
        final List<String> sortBy = null;
        final Integer start = null;
        final Integer limit = null;
        final String filter = null;
        final List<String> instrumentPropertyKeys = null;
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
        return service.getHoldings(scope, code, byTaxlots, effectiveAt, asAt, sortByConverted, start, limit, filter, instrumentPropertyKeysConverted)
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
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots
     * @param effectiveAt Optional. The effective date of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfHolding object if successful.
     */
    public VersionedResourceListOfHolding getHoldings(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        return getHoldingsWithServiceResponseAsync(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys).toBlocking().single().body();
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots
     * @param effectiveAt Optional. The effective date of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the holdings
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsWithServiceResponseAsync(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys), serviceCallback);
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots
     * @param effectiveAt Optional. The effective date of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        return getHoldingsWithServiceResponseAsync(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, instrumentPropertyKeys).map(new Func1<ServiceResponse<VersionedResourceListOfHolding>, VersionedResourceListOfHolding>() {
            @Override
            public VersionedResourceListOfHolding call(ServiceResponse<VersionedResourceListOfHolding> response) {
                return response.body();
            }
        });
    }

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots
     * @param effectiveAt Optional. The effective date of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param filter Optional. Expression to filter the result set
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the holdings
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    public Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(sortBy);
        Validator.validate(instrumentPropertyKeys);
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
        return service.getHoldings(scope, code, byTaxlots, effectiveAt, asAt, sortByConverted, start, limit, filter, instrumentPropertyKeysConverted)
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
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(setHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
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
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
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
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    public AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) {
        return setHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments).toBlocking().single().body();
    }

    /**
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(setHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio
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
     * Set all holdings on a transaction portfolio.
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the transaction portfolio
     * @param code The code of the transaction portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The selected set of holdings adjustments
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The selected set of holdings adjustments
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback) {
        return ServiceFuture.fromResponse(adjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt, holdingAdjustments), serviceCallback);
    }

    /**
     * Adjust holdings.
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The selected set of holdings adjustments
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
     * Adjust one or more holdings in a transaction portfolio
     Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param holdingAdjustments The selected set of holdings adjustments
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
     * Cancel holdings adjustments.
     * Cancel previous adjust-holdings for the portfolio for a specific date.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse cancelAdjustHoldings(String scope, String code, DateTime effectiveAt) {
        return cancelAdjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Cancel holdings adjustments.
     * Cancel previous adjust-holdings for the portfolio for a specific date.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(cancelAdjustHoldingsWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Cancel holdings adjustments.
     * Cancel previous adjust-holdings for the portfolio for a specific date.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
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
     * Cancel holdings adjustments.
     * Cancel previous adjust-holdings for the portfolio for a specific date.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective date of the change
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
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
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
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
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
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
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
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
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
        final DateTime asAt = null;
        return service.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt)
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
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfHoldingsAdjustmentHeader object if successful.
     */
    public ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback) {
        return ServiceFuture.fromResponse(listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAt), serviceCallback);
    }

    /**
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt) {
        return listHoldingsAdjustmentsWithServiceResponseAsync(scope, code, fromEffectiveAt, toEffectiveAt, asAt).map(new Func1<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>, ResourceListOfHoldingsAdjustmentHeader>() {
            @Override
            public ResourceListOfHoldingsAdjustmentHeader call(ServiceResponse<ResourceListOfHoldingsAdjustmentHeader> response) {
                return response.body();
            }
        });
    }

    /**
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    public Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        return service.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt)
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
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt).toBlocking().single().body();
    }

    /**
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustment> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt), serviceCallback);
    }

    /**
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
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
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
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
        final DateTime asAt = null;
        return service.getHoldingsAdjustment(scope, code, effectiveAt, asAt)
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
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAt).toBlocking().single().body();
    }

    /**
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @param asAt Optional. The AsAt date of the data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<HoldingsAdjustment> serviceCallback) {
        return ServiceFuture.fromResponse(getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAt), serviceCallback);
    }

    /**
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        return getHoldingsAdjustmentWithServiceResponseAsync(scope, code, effectiveAt, asAt).map(new Func1<ServiceResponse<HoldingsAdjustment>, HoldingsAdjustment>() {
            @Override
            public HoldingsAdjustment call(ServiceResponse<HoldingsAdjustment> response) {
                return response.body();
            }
        });
    }

    /**
     * Get holding adjustment.
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.
     A holdings adjustment definition will only be returned if one exists for the specified effective time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param effectiveAt The effective time of the holdings adjustment
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    public Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (effectiveAt == null) {
            throw new IllegalArgumentException("Parameter effectiveAt is required and cannot be null.");
        }
        return service.getHoldingsAdjustment(scope, code, effectiveAt, asAt)
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(getTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Get transactions.
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values that will be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values that will be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(getTransactionsWithServiceResponseAsync(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, instrumentPropertyKeys, filter), serviceCallback);
    }

    /**
     * Get transactions.
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values that will be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
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
     * Get the transactions from a transaction portfolio
     When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values that will be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    public UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code) {
        return upsertTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    public Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code) {
        return upsertTransactionsWithServiceResponseAsync(scope, code).map(new Func1<ServiceResponse<UpsertPortfolioTransactionsResponse>, UpsertPortfolioTransactionsResponse>() {
            @Override
            public UpsertPortfolioTransactionsResponse call(ServiceResponse<UpsertPortfolioTransactionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    public Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        final List<TransactionRequest> transactions = null;
        return service.upsertTransactions(scope, code, transactions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTransactionsResponse> clientResponse = upsertTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @param transactions The transactions to be upserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    public UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions) {
        return upsertTransactionsWithServiceResponseAsync(scope, code, transactions).toBlocking().single().body();
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @param transactions The transactions to be upserted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(upsertTransactionsWithServiceResponseAsync(scope, code, transactions), serviceCallback);
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @param transactions The transactions to be upserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    public Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions) {
        return upsertTransactionsWithServiceResponseAsync(scope, code, transactions).map(new Func1<ServiceResponse<UpsertPortfolioTransactionsResponse>, UpsertPortfolioTransactionsResponse>() {
            @Override
            public UpsertPortfolioTransactionsResponse call(ServiceResponse<UpsertPortfolioTransactionsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @param transactions The transactions to be upserted
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    public Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code, List<TransactionRequest> transactions) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(transactions);
        return service.upsertTransactions(scope, code, transactions)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>>>() {
                @Override
                public Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UpsertPortfolioTransactionsResponse> clientResponse = upsertTransactionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UpsertPortfolioTransactionsResponse> upsertTransactionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<UpsertPortfolioTransactionsResponse, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<UpsertPortfolioTransactionsResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        final List<String> transactionIds = null;
        String transactionIdsConverted = this.serializerAdapter().serializeList(transactionIds, CollectionFormat.MULTI);
        return service.deleteTransactions(scope, code, transactionIdsConverted)
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
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionIds Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    public DeletedEntityResponse deleteTransactions(String scope, String code, List<String> transactionIds) {
        return deleteTransactionsWithServiceResponseAsync(scope, code, transactionIds).toBlocking().single().body();
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionIds Ids of transactions to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> transactionIds, final ServiceCallback<DeletedEntityResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTransactionsWithServiceResponseAsync(scope, code, transactionIds), serviceCallback);
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionIds Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> transactionIds) {
        return deleteTransactionsWithServiceResponseAsync(scope, code, transactionIds).map(new Func1<ServiceResponse<DeletedEntityResponse>, DeletedEntityResponse>() {
            @Override
            public DeletedEntityResponse call(ServiceResponse<DeletedEntityResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionIds Ids of transactions to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    public Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code, List<String> transactionIds) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        Validator.validate(transactionIds);
        String transactionIdsConverted = this.serializerAdapter().serializeList(transactionIds, CollectionFormat.MULTI);
        return service.deleteTransactions(scope, code, transactionIdsConverted)
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
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId).toBlocking().single().body();
    }

    /**
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId), serviceCallback);
    }

    /**
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
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
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
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
        final Map<String, PerpetualPropertyValue> transactionProperties = null;
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
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @param transactionProperties Transaction properties values
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties).toBlocking().single().body();
    }

    /**
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @param transactionProperties Transaction properties values
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties), serviceCallback);
    }

    /**
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @param transactionProperties Transaction properties values
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties) {
        return addTransactionPropertyWithServiceResponseAsync(scope, code, transactionId, transactionProperties).map(new Func1<ServiceResponse<AddTransactionPropertyResponse>, AddTransactionPropertyResponse>() {
            @Override
            public AddTransactionPropertyResponse call(ServiceResponse<AddTransactionPropertyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Add transaction properties.
     * Upsert one or more transaction properties to a single transaction in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param transactionId Id of transaction
     * @param transactionProperties Transaction properties values
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    public Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties) {
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
                .register(200, new TypeToken<AddTransactionPropertyResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete transaction property.
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Delete a property value from a single transaction in a portfolio.
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
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code) {
        return buildTransactionsWithServiceResponseAsync(scope, code).toBlocking().single().body();
    }

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(buildTransactionsWithServiceResponseAsync(scope, code), serviceCallback);
    }

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
     * @param parameters Optional. Transaction query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters) {
        return buildTransactionsWithServiceResponseAsync(scope, code, asAt, sortBy, start, limit, instrumentPropertyKeys, filter, parameters).toBlocking().single().body();
    }

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
     * @param parameters Optional. Transaction query parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback) {
        return ServiceFuture.fromResponse(buildTransactionsWithServiceResponseAsync(scope, code, asAt, sortBy, start, limit, instrumentPropertyKeys, filter, parameters), serviceCallback);
    }

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
     * @param parameters Optional. Transaction query parameters
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
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @param asAt Optional. The AsAt date of the data
     * @param sortBy Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
     * @param start Optional. When paginating, skip this number of results
     * @param limit Optional. When paginating, limit the number of returned results to this many.
     * @param instrumentPropertyKeys Optional. Keys for the instrument property values to be decorated onto the transactions
     * @param filter Optional. Expression to filter the result set
     * @param parameters Optional. Transaction query parameters
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
        String sortByConverted = this.serializerAdapter().serializeList(sortBy, CollectionFormat.MULTI);String instrumentPropertyKeysConverted = this.serializerAdapter().serializeList(instrumentPropertyKeys, CollectionFormat.MULTI);
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
