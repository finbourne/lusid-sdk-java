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

package com.finbourne;

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
import com.finbourne.models.UpsertPortfolioTransactionsResponse;
import com.finbourne.models.UpsertReferencePortfolioConstituentsResponse;
import com.finbourne.models.VersionedResourceListOfHolding;
import com.finbourne.models.VersionedResourceListOfOutputTransaction;
import com.finbourne.models.VersionedResourceListOfTransaction;
import com.finbourne.models.VersionSummary;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import rx.Observable;
import com.microsoft.rest.RestClient;

/**
 * The interface for LUSIDAPI class.
 */
public interface LUSIDAPI {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    ResourceListOfAnalyticStoreKey listAnalyticStores();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync();
    /**
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
    ResourceListOfAnalyticStoreKey listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

    /**
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore createAnalyticStore();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync();
    /**
     *
     * @param request the CreateAnalyticStoreRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore createAnalyticStore(CreateAnalyticStoreRequest request);

    /**
     *
     * @param request the CreateAnalyticStoreRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @param request the CreateAnalyticStoreRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request);

    /**
     *
     * @param request the CreateAnalyticStoreRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);
    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deleteAnalyticStore(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore insertAnalytics(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day);
    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore insertAnalytics(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

    /**
     *
     * @param scope the String value
     * @param year the int value
     * @param month the int value
     * @param day the int value
     * @param data the List&lt;InstrumentAnalytic&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
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
    ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param actions the List&lt;CreateCorporateAction&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertCorporateActionsResponse object if successful.
     */
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code, List<CreateCorporateAction> actions);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param actions the List&lt;CreateCorporateAction&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param actions the List&lt;CreateCorporateAction&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param actions the List&lt;CreateCorporateAction&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code, List<CreateCorporateAction> actions);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType createDataType();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> createDataTypeAsync(final ServiceCallback<DataType> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync();
    /**
     *
     * @param request the CreateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType createDataType(CreateDataTypeRequest request);

    /**
     *
     * @param request the CreateDataTypeRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> createDataTypeAsync(CreateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

    /**
     *
     * @param request the CreateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync(CreateDataTypeRequest request);

    /**
     *
     * @param request the CreateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync(CreateDataTypeRequest request);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfDataType object if successful.
     */
    ResourceListOfDataType listDataTypes(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, final ServiceCallback<ResourceListOfDataType> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope);
    /**
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
    ResourceListOfDataType listDataTypes(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfDataType> serviceCallback);

    /**
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
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType getDataType(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> getDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> getDataTypeAsync(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> getDataTypeWithServiceResponseAsync(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType updateDataType(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> updateDataTypeAsync(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name);
    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param request the UpdateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType updateDataType(String scope, String name, UpdateDataTypeRequest request);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param request the UpdateDataTypeRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param request the UpdateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param request the UpdateDataTypeRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name, UpdateDataTypeRequest request);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinition object if successful.
     */
    IUnitDefinition getUnitsFromDataType(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, final ServiceCallback<IUnitDefinition> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name);
    /**
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
    IUnitDefinition getUnitsFromDataType(String scope, String name, List<String> units, String filter);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter, final ServiceCallback<IUnitDefinition> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter);

    /**
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name, List<String> units, String filter);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createDerivedPortfolio(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope);
    /**
     *
     * @param scope the String value
     * @param portfolio the CreateDerivedTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createDerivedPortfolio(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

    /**
     *
     * @param scope the String value
     * @param portfolio the CreateDerivedTransactionPortfolioRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param portfolio the CreateDerivedTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

    /**
     *
     * @param scope the String value
     * @param portfolio the CreateDerivedTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    TryAddClientInstruments batchAddClientInstruments();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(final ServiceCallback<TryAddClientInstruments> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync();
    /**
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    TryAddClientInstruments batchAddClientInstruments(List<CreateClientInstrumentRequest> definitions);

    /**
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions, final ServiceCallback<TryAddClientInstruments> serviceCallback);

    /**
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions);

    /**
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync(List<CreateClientInstrumentRequest> definitions);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    DeleteClientInstrumentsResponse batchDeleteClientInstruments();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync();
    /**
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    DeleteClientInstrumentsResponse batchDeleteClientInstruments(List<String> uids);

    /**
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids, final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

    /**
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids);

    /**
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync(List<String> uids);

    /**
     *
     * @param uid the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    Instrument getInstrument(String uid);

    /**
     *
     * @param uid the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Instrument> getInstrumentAsync(String uid, final ServiceCallback<Instrument> serviceCallback);

    /**
     *
     * @param uid the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<Instrument> getInstrumentAsync(String uid);

    /**
     *
     * @param uid the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid);
    /**
     *
     * @param uid the String value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    Instrument getInstrument(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @param uid the String value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<Instrument> serviceCallback);

    /**
     *
     * @param uid the String value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @param uid the String value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync();
    /**
     *
     * @param codeType Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @param codeType Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

    /**
     *
     * @param codeType Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @param codeType Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync();
    /**
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(List<InstrumentProperty> classifications);

    /**
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications, final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

    /**
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications);

    /**
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync(List<InstrumentProperty> classifications);

    /**
     *
     * @param domain the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getSamlIdentityProviderId(String domain);

    /**
     *
     * @param domain the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getSamlIdentityProviderIdAsync(String domain, final ServiceCallback<String> serviceCallback);

    /**
     *
     * @param domain the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getSamlIdentityProviderIdAsync(String domain);

    /**
     *
     * @param domain the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getSamlIdentityProviderIdWithServiceResponseAsync(String domain);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelDownloadUrl();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(final ServiceCallback<String> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync();
    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelDownloadUrl(String version);

    /**
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync(String version);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync(String version);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionSummary object if successful.
     */
    VersionSummary getLusidVersions();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionSummary> getLusidVersionsAsync(final ServiceCallback<VersionSummary> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    Observable<VersionSummary> getLusidVersionsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    Observable<ServiceResponse<VersionSummary>> getLusidVersionsWithServiceResponseAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    ResourceListOfPersonalisation getPersonalisations();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync();
    /**
     *
     * @param pattern the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive the Boolean value
     * @param wildcards the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    ResourceListOfPersonalisation getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param pattern the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive the Boolean value
     * @param wildcards the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

    /**
     *
     * @param pattern the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive the Boolean value
     * @param wildcards the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param pattern the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param recursive the Boolean value
     * @param wildcards the Boolean value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    UpsertPersonalisationResponse upsertPersonalisations();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync();
    /**
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    UpsertPersonalisationResponse upsertPersonalisations(List<Personalisation> personalisations);

    /**
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations, final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations);

    /**
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync(List<Personalisation> personalisations);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePersonalisation();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePersonalisationAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync();
    /**
     *
     * @param key the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePersonalisation(String key, String scope, String group);

    /**
     *
     * @param key the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param key the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group);

    /**
     *
     * @param key the String value
     * @param scope Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String key, String scope, String group);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope);
    /**
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
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
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup createPortfolioGroup(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope);
    /**
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope, CreatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup getPortfolioGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup getPortfolioGroup(String scope, String code, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup updatePortfolioGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup updatePortfolioGroup(String scope, String code, UpdatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdatePortfolioGroupRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePortfolioGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    ListAggregationResponse getAggregationByGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code);
    /**
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
    ListAggregationResponse getAggregationByGroup(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
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
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NestedAggregationResponse object if successful.
     */
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code, AggregationRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpandedGroup object if successful.
     */
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code);
    /**
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
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

    /**
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
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param propertyFilter the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup addPortfolioToGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup addPortfolioToGroup(String scope, String code, ResourceId identifier);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

    /**
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
    PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioScope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup addSubGroupToGroup(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup addSubGroupToGroup(String scope, String code, ResourceId identifier);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

    /**
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
    PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param subgroupScope the String value
     * @param subgroupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope listPortfolioScopes();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> listPortfolioScopesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync();
    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolio object if successful.
     */
    ResourceListOfPortfolio listPortfolios(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope);
    /**
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
     * @return the ResourceListOfPortfolio object if successful.
     */
    ResourceListOfPortfolio listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio getPortfolio(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> getPortfolioAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio updatePortfolio(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> updatePortfolioAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioRequest value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioRequest value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioRequest value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioRequest value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePortfolio(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePortfolio(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    ListAggregationResponse getAggregationByPortfolio(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code);
    /**
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
    ListAggregationResponse getAggregationByPortfolio(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
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
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommand object if successful.
     */
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromAsAt the DateTime value
     * @param toAsAt the DateTime value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    PortfolioProperties getPortfolioProperties(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
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
     * @return the PortfolioProperties object if successful.
     */
    PortfolioProperties getPortfolioProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
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
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    PortfolioProperties upsertPortfolioProperties(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    PortfolioProperties upsertPortfolioProperties(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePortfolioProperties(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param portfolioPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param portfolioPropertyKeys the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param portfolioPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param portfolioPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    ResourceListOfReconciliationBreak reconcileHoldings();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync();
    /**
     *
     * @param request the PortfoliosReconciliationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    ResourceListOfReconciliationBreak reconcileHoldings(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param request the PortfoliosReconciliationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

    /**
     *
     * @param request the PortfoliosReconciliationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param request the PortfoliosReconciliationRequest value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync();
    /**
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
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
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
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition createPropertyDefinition();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync();
    /**
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition createPropertyDefinition(CreatePropertyDefinitionRequest definition);

    /**
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition);

    /**
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition getPropertyDefinition(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition getPropertyDefinition(String domain, String scope, String code, DateTime asAt);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, DateTime asAt);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition updatePropertyDefinition(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition updatePropertyDefinition(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param definition the UpdatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePropertyDefinition(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code);

    /**
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createReferencePortfolio(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope);
    /**
     *
     * @param scope the String value
     * @param referencePortfolio the CreateReferencePortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createReferencePortfolio(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     *
     * @param scope the String value
     * @param referencePortfolio the CreateReferencePortfolioRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param referencePortfolio the CreateReferencePortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     *
     * @param scope the String value
     * @param referencePortfolio the CreateReferencePortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituent object if successful.
     */
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
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
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
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
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

    /**
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
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
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
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertReferencePortfolioConstituentsResponse object if successful.
     */
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
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
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param constituents the List&lt;ReferencePortfolioConstituentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Results object if successful.
     */
    Results getResults(String scope, String key, DateTime dateParameter);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Results object if successful.
     */
    Results getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Results> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Results object if successful.
     */
    Results upsertResults(String scope, String key, DateTime dateParameter);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param request the CreateResults value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Results object if successful.
     */
    Results upsertResults(String scope, String key, DateTime dateParameter, CreateResults request);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param request the CreateResults value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request, final ServiceCallback<Results> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param request the CreateResults value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request);

    /**
     *
     * @param scope the String value
     * @param key the String value
     * @param dateParameter the DateTime value
     * @param request the CreateResults value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResults request);

    /**
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey);

    /**
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey);

    /**
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey);
    /**
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
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
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
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfString object if successful.
     */
    ResourceListOfString listEntities();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfString> listEntitiesAsync(final ServiceCallback<ResourceListOfString> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ResourceListOfString> listEntitiesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ServiceResponse<ResourceListOfString>> listEntitiesWithServiceResponseAsync();

    /**
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Schema object if successful.
     */
    Schema getEntitySchema(String entity);

    /**
     *
     * @param entity the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Schema> getEntitySchemaAsync(String entity, final ServiceCallback<Schema> serviceCallback);

    /**
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<Schema> getEntitySchemaAsync(String entity);

    /**
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<ServiceResponse<Schema>> getEntitySchemaWithServiceResponseAsync(String entity);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    PropertySchema getPropertySchema();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchema> getPropertySchemaAsync(final ServiceCallback<PropertySchema> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync();
    /**
     *
     * @param propertyKeys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    PropertySchema getPropertySchema(List<String> propertyKeys, DateTime asAt);

    /**
     *
     * @param propertyKeys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchema> serviceCallback);

    /**
     *
     * @param propertyKeys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt);

    /**
     *
     * @param propertyKeys the List&lt;String&gt; value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    ResourceListOfValueType getValueTypes();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(final ServiceCallback<ResourceListOfValueType> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ResourceListOfValueType> getValueTypesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync();
    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    ResourceListOfValueType getValueTypes(List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfValueType> serviceCallback);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup portfolioGroupsSearch();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync();
    /**
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
    ResourceListOfPortfolioGroup portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioSearchResult object if successful.
     */
    ResourceListOfPortfolioSearchResult portfoliosSearch();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync();
    /**
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
    ResourceListOfPortfolioSearchResult portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition propertiesSearch();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync();
    /**
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
    ResourceListOfPropertyDefinition propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
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
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData listConfigurationTransactionTypes();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> listConfigurationTransactionTypesWithServiceResponseAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData setConfigurationTransactionTypes();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync();
    /**
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData setConfigurationTransactionTypes(List<TransactionConfigurationDataRequest> types);

    /**
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types, final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types);

    /**
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync(List<TransactionConfigurationDataRequest> types);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    TransactionConfigurationData createConfigurationTransactionType();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync();
    /**
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    TransactionConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest type);

    /**
     *
     * @param type the TransactionConfigurationDataRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type, final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type);

    /**
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync(TransactionConfigurationDataRequest type);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createPortfolio(String scope);

    /**
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope);

    /**
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope);
    /**
     *
     * @param scope the String value
     * @param createRequest the CreateTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest);

    /**
     *
     * @param scope the String value
     * @param createRequest the CreateTransactionPortfolioRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ServiceCallback<Portfolio> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param createRequest the CreateTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest);

    /**
     *
     * @param scope the String value
     * @param createRequest the CreateTransactionPortfolioRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope, CreateTransactionPortfolioRequest createRequest);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    PortfolioDetails getDetails(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    PortfolioDetails getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<PortfolioDetails> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    PortfolioDetails upsertPortfolioDetails(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDetails object if successful.
     */
    PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt, final ServiceCallback<PortfolioDetails> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param details the CreatePortfolioDetails value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfHolding object if successful.
     */
    VersionedResourceListOfHolding getHoldings(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param byTaxlots the Boolean value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfHolding object if successful.
     */
    VersionedResourceListOfHolding getHoldings(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param byTaxlots the Boolean value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param byTaxlots the Boolean value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param byTaxlots the Boolean value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHolding object
     */
    Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse cancelAdjustHoldings(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> cancelAdjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfHoldingsAdjustmentHeader object if successful.
     */
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromEffectiveAt the DateTime value
     * @param toEffectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfHoldingsAdjustmentHeader object if successful.
     */
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromEffectiveAt the DateTime value
     * @param toEffectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromEffectiveAt the DateTime value
     * @param toEffectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromEffectiveAt the DateTime value
     * @param toEffectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustment> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustment object if successful.
     */
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime, final ServiceCallback<HoldingsAdjustment> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAtTime the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustment object
     */
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTransaction object if successful.
     */
    VersionedResourceListOfTransaction getTransactions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromTransactionDate the DateTime value
     * @param toTransactionDate the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTransaction object if successful.
     */
    VersionedResourceListOfTransaction getTransactions(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromTransactionDate the DateTime value
     * @param toTransactionDate the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromTransactionDate the DateTime value
     * @param toTransactionDate the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param fromTransactionDate the DateTime value
     * @param toTransactionDate the DateTime value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactions the List&lt;TransactionRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactions the List&lt;TransactionRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactions the List&lt;TransactionRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactions the List&lt;TransactionRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code, List<TransactionRequest> transactions);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deleteTransactions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param id the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deleteTransactions(String scope, String code, List<String> id);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param id the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param id the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param id the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code, List<String> id);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionProperties the Map&lt;String, PerpetualPropertyValue&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddTransactionPropertyResponse object if successful.
     */
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionProperties the Map&lt;String, PerpetualPropertyValue&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionProperties the Map&lt;String, PerpetualPropertyValue&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionProperties the Map&lt;String, PerpetualPropertyValue&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddTransactionPropertyResponse object
     */
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionPropertyKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionPropertyKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionPropertyKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param transactionId the String value
     * @param transactionPropertyKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId, String transactionPropertyKey);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @param parameters the TransactionQueryParameters value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransaction object if successful.
     */
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @param parameters the TransactionQueryParameters value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @param parameters the TransactionQueryParameters value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

    /**
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param instrumentPropertyKeys the List&lt;String&gt; value
     * @param filter the String value
     * @param parameters the TransactionQueryParameters value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

}
