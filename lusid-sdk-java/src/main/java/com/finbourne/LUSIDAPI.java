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
import com.finbourne.models.PropertyDefinition;
import com.finbourne.models.PropertySchema;
import com.finbourne.models.PropertyValue;
import com.finbourne.models.ReconciliationRequest;
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
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    ResourceListOfAnalyticStoreKey listAnalyticStores();

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync();

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync();
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
    ResourceListOfAnalyticStoreKey listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

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
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore createAnalyticStore();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync();
    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore createAnalyticStore(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request);

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
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day, DateTime asAt);

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
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt);

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
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt);

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
    DeletedEntityResponse deleteAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);

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
    AnalyticStore insertAnalytics(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStore insertAnalytics(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

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
    ServiceFuture<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> insertAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

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
    Observable<ServiceResponse<AnalyticStore>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param code Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code);
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
     * @return the ResourceListOfCorporateActionEvent object if successful.
     */
    ResourceListOfCorporateActionEvent getCorporateActions(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfCorporateActionEvent> serviceCallback);

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
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ResourceListOfCorporateActionEvent> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfCorporateActionEvent object
     */
    Observable<ServiceResponse<ResourceListOfCorporateActionEvent>> getCorporateActionsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code);
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
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code, List<CreateCorporateAction> actions);

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
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param code Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code, List<CreateCorporateAction> actions);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType createDataType();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> createDataTypeAsync(final ServiceCallback<DataType> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync();
    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataType object if successful.
     */
    DataType createDataType(CreateDataTypeRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> createDataTypeAsync(CreateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync(CreateDataTypeRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync(CreateDataTypeRequest request);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfDataType object if successful.
     */
    ResourceListOfDataType listDataTypes(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, final ServiceCallback<ResourceListOfDataType> serviceCallback);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope);
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
    ResourceListOfDataType listDataTypes(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfDataType> serviceCallback);

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
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    DataType getDataType(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> getDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> getDataTypeAsync(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> getDataTypeWithServiceResponseAsync(String scope, String name);

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
    DataType updateDataType(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, final ServiceCallback<DataType> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> updateDataTypeAsync(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name);
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
    DataType updateDataType(String scope, String name, UpdateDataTypeRequest request);

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
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> updateDataTypeAsync(String scope, String name, UpdateDataTypeRequest request);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String name, UpdateDataTypeRequest request);

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
    IUnitDefinition getUnitsFromDataType(String scope, String name);

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, final ServiceCallback<IUnitDefinition> serviceCallback);

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name);

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinition object
     */
    Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name);
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
    IUnitDefinition getUnitsFromDataType(String scope, String name, List<String> units, String filter);

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
    ServiceFuture<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter, final ServiceCallback<IUnitDefinition> serviceCallback);

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
    Observable<IUnitDefinition> getUnitsFromDataTypeAsync(String scope, String name, List<String> units, String filter);

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
    Observable<ServiceResponse<IUnitDefinition>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String name, List<String> units, String filter);

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
    Portfolio createDerivedPortfolio(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createDerivedPortfolio(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

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
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

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
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    TryAddClientInstruments batchAddClientInstruments();

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(final ServiceCallback<TryAddClientInstruments> serviceCallback);

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync();

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync();
    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientInstruments object if successful.
     */
    TryAddClientInstruments batchAddClientInstruments(List<CreateClientInstrumentRequest> definitions);

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions, final ServiceCallback<TryAddClientInstruments> serviceCallback);

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync(List<CreateClientInstrumentRequest> definitions);

    /**
     * Attempt to create one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientInstrumentRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientInstruments object
     */
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync(List<CreateClientInstrumentRequest> definitions);

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    DeleteClientInstrumentsResponse batchDeleteClientInstruments();

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync();

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync();
    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteClientInstrumentsResponse object if successful.
     */
    DeleteClientInstrumentsResponse batchDeleteClientInstruments(List<String> uids);

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids, final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids);

    /**
     * Attempt to delete one or more client instruments. Failed instruments will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync(List<String> uids);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Instrument object if successful.
     */
    Instrument getInstrument(String uid);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Instrument> getInstrumentAsync(String uid, final ServiceCallback<Instrument> serviceCallback);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<Instrument> getInstrumentAsync(String uid);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid);
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
    Instrument getInstrument(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

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
    ServiceFuture<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<Instrument> serviceCallback);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     * Get an individual instrument by the unique instrument uid.  Optionally, decorate each instrument with specific properties.
     *
     * @param uid The uid of the requested instrument
     * @param asAt As at date
     * @param instrumentPropertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LookupInstrumentsFromCodesResponse object if successful.
     */
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes();

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync();

    /**
     * Lookup a large number of instruments by supplying a collection of non-Finbourne codes.  Optionally, decorate each instrument with specific properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync();
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
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

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
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

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
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

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
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties();

    /**
     * Upsert instrument properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync();

    /**
     * Upsert instrument properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync();
    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertInstrumentPropertiesResponse object if successful.
     */
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(List<InstrumentProperty> classifications);

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications, final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> classifications);

    /**
     * Upsert instrument properties.
     *
     * @param classifications the List&lt;InstrumentProperty&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync(List<InstrumentProperty> classifications);

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getSamlIdentityProviderId(String domain);

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getSamlIdentityProviderIdAsync(String domain, final ServiceCallback<String> serviceCallback);

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getSamlIdentityProviderIdAsync(String domain);

    /**
     * Get the unique identifier for the SAML Identity Provider to be used by domain.
     *
     * @param domain The domain that the user will be logging in to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getSamlIdentityProviderIdWithServiceResponseAsync(String domain);

    /**
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelDownloadUrl();

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync();

    /**
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync();
    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelDownloadUrl(String version);

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback);

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync(String version);

    /**
     * Request an authorised url for an Excel client version.
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync(String version);

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionSummary object if successful.
     */
    VersionSummary getLusidVersions();

    /**
     * Returns the current major application version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionSummary> getLusidVersionsAsync(final ServiceCallback<VersionSummary> serviceCallback);

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    Observable<VersionSummary> getLusidVersionsAsync();

    /**
     * Returns the current major application version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummary object
     */
    Observable<ServiceResponse<VersionSummary>> getLusidVersionsWithServiceResponseAsync();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    ResourceListOfPersonalisation getPersonalisations();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync();
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
    ResourceListOfPersonalisation getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

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
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    UpsertPersonalisationResponse upsertPersonalisations();

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync();

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync();
    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    UpsertPersonalisationResponse upsertPersonalisations(List<Personalisation> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations, final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;Personalisation&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync(List<Personalisation> personalisations);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePersonalisation();

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePersonalisationAsync();

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync();
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
    DeletedEntityResponse deletePersonalisation(String key, String scope, String group);

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
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param key The key of the setting to be deleted
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String key, String scope, String group);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope);
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
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

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
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioGroup object if successful.
     */
    PortfolioGroup createPortfolioGroup(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope);
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
    PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope, CreatePortfolioGroupRequest request);

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
    PortfolioGroup getPortfolioGroup(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup getPortfolioGroup(String scope, String code, DateTime asAt);

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
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt);

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
    PortfolioGroup updatePortfolioGroup(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup updatePortfolioGroup(String scope, String code, UpdatePortfolioGroupRequest request);

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
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdatePortfolioGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdatePortfolioGroupRequest request);

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
    DeletedEntityResponse deletePortfolioGroup(String scope, String code);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code);

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
    ListAggregationResponse getAggregationByGroup(String scope, String code);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code);
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
    ListAggregationResponse getAggregationByGroup(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code);

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code);

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code);
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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code, AggregationRequest request);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request);

    /**
     * Obsolete - Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request);

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
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

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
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroup> serviceCallback);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code);
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
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroup> serviceCallback);

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
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    PortfolioGroup addPortfolioToGroup(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup addPortfolioToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode);

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
    ServiceFuture<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    Observable<ServiceResponse<PortfolioGroup>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    PortfolioGroup addSubGroupToGroup(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup addSubGroupToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode);

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
    ServiceFuture<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    Observable<ServiceResponse<PortfolioGroup>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope listPortfolioScopes();

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> listPortfolioScopesAsync();

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync();
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
    ResourceListOfScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback);

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
    Observable<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit, String filter);

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
    ResourceListOfPortfolio listPortfolios(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope);
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
    ResourceListOfPortfolio listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

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
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Portfolio getPortfolio(String scope, String code);

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
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> getPortfolioAsync(String scope, String code);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code);
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
    Portfolio getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Portfolio> serviceCallback);

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
    Observable<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Portfolio updatePortfolio(String scope, String code);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> updatePortfolioAsync(String scope, String code);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code);
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
    Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Portfolio> serviceCallback);

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
    Observable<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolio(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code);

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    ListAggregationResponse getAggregationByPortfolio(String scope, String code);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code);
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
    ListAggregationResponse getAggregationByPortfolio(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code);

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

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
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    PortfolioProperties getPortfolioProperties(String scope, String code);

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
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

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
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    PortfolioProperties getPortfolioProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioProperties> serviceCallback);

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
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    PortfolioProperties upsertPortfolioProperties(String scope, String code);

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
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioProperties object if successful.
     */
    PortfolioProperties upsertPortfolioProperties(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param portfolioProperties the Map&lt;String, PropertyValue&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code);

    /**
     * Delete one, many or all properties from a portfolio for a specified effective date.
     * Specifying no properties will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions();

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync();

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync();
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
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

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
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition createPropertyDefinition();

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync();

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync();
    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition createPropertyDefinition(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Gets a property definition.
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
     * Gets a property definition.
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
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code);

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
    /**
     * Gets a property definition.
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
     * Gets a property definition.
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
     * Gets a property definition.
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
     * Gets a property definition.
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
     * Updates the specified property definition.
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
     * Updates the specified property definition.
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
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code);

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
    /**
     * Updates the specified property definition.
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
     * Updates the specified property definition.
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
     * Updates the specified property definition.
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
     * Updates the specified property definition.
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
     * Deletes the property definition.
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
     * Deletes the property definition.
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
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code);

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    ResourceListOfReconciliationBreak performReconciliation();

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreak> performReconciliationAsync(final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ResourceListOfReconciliationBreak> performReconciliationAsync();

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> performReconciliationWithServiceResponseAsync();
    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    ResourceListOfReconciliationBreak performReconciliation(ReconciliationRequest request);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreak> performReconciliationAsync(ReconciliationRequest request, final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ResourceListOfReconciliationBreak> performReconciliationAsync(ReconciliationRequest request);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> performReconciliationWithServiceResponseAsync(ReconciliationRequest request);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Portfolio object if successful.
     */
    Portfolio createReferencePortfolio(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createReferencePortfolio(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

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
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituent object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

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
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsResponse object
     */
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

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
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    Results getResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Results getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Results upsertResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Results object
     */
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Results upsertResults(String scope, String key, DateTime dateParameter, CreateResults request);

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
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request);

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
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResults request);

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
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey);
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
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfString object if successful.
     */
    ResourceListOfString listEntities();

    /**
     * List all available entities.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfString> listEntitiesAsync(final ServiceCallback<ResourceListOfString> serviceCallback);

    /**
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ResourceListOfString> listEntitiesAsync();

    /**
     * List all available entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ServiceResponse<ResourceListOfString>> listEntitiesWithServiceResponseAsync();

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Schema object if successful.
     */
    Schema getEntitySchema(String entity);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Schema> getEntitySchemaAsync(String entity, final ServiceCallback<Schema> serviceCallback);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<Schema> getEntitySchemaAsync(String entity);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<ServiceResponse<Schema>> getEntitySchemaWithServiceResponseAsync(String entity);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    PropertySchema getPropertySchema();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchema> getPropertySchemaAsync(final ServiceCallback<PropertySchema> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync();
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
    PropertySchema getPropertySchema(List<String> propertyKeys, DateTime asAt);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchema> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    ResourceListOfValueType getValueTypes();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(final ServiceCallback<ResourceListOfValueType> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ResourceListOfValueType> getValueTypesAsync();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync();
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
    ResourceListOfValueType getValueTypes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfValueType> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup portfolioGroupsSearch();

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync();

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync();
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
    ResourceListOfPortfolioGroup portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

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
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioSearchResult object if successful.
     */
    ResourceListOfPortfolioSearchResult portfoliosSearch();

    /**
     * Search portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync();

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync();
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
    ResourceListOfPortfolioSearchResult portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

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
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition propertiesSearch();

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync();

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync();
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
    ResourceListOfPropertyDefinition propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

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
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData listConfigurationTransactionTypes();

    /**
     * Gets the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> listConfigurationTransactionTypesAsync();

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> listConfigurationTransactionTypesWithServiceResponseAsync();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData setConfigurationTransactionTypes();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync();
    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionMetaData object if successful.
     */
    ResourceListOfTransactionMetaData setConfigurationTransactionTypes(List<TransactionConfigurationDataRequest> types);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types, final ServiceCallback<ResourceListOfTransactionMetaData> serviceCallback);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ResourceListOfTransactionMetaData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TransactionConfigurationDataRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionMetaData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionMetaData>> setConfigurationTransactionTypesWithServiceResponseAsync(List<TransactionConfigurationDataRequest> types);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    TransactionConfigurationData createConfigurationTransactionType();

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync();

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync();
    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    TransactionConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest type);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type, final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TransactionConfigurationDataRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync(TransactionConfigurationDataRequest type);

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
    Portfolio createPortfolio(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest);

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
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope, CreateTransactionPortfolioRequest createRequest);

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
    PortfolioDetails getDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetails getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    PortfolioDetails upsertPortfolioDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    VersionedResourceListOfHolding getHoldings(String scope, String code);

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
    ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback);

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
    Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code);

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
    Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code);
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
    VersionedResourceListOfHolding getHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

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
    ServiceFuture<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, final ServiceCallback<VersionedResourceListOfHolding> serviceCallback);

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
    Observable<VersionedResourceListOfHolding> getHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

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
    Observable<ServiceResponse<VersionedResourceListOfHolding>> getHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
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
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Set All Holdings.
     * Create transactions in a specific portfolio to bring all holdings to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdjustHolding object if successful.
     */
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
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
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Adjust Selected Holdings.
     * Create transactions in a specific portfolio to bring the selected holdings up to the specified targets.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt Effective date
     * @param holdingAdjustments the List&lt;AdjustHoldingRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdjustHolding object
     */
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    DeletedEntityResponse cancelAdjustHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> cancelAdjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

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
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

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
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

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
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

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
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustment> serviceCallback);

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
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

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
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime, final ServiceCallback<HoldingsAdjustment> serviceCallback);

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
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

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
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

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
    VersionedResourceListOfTransaction getTransactions(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code);
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
    VersionedResourceListOfTransaction getTransactions(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

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
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

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
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

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
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPortfolioTransactionsResponse object if successful.
     */
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions);

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
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions);

    /**
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param transactions The transactions to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code, List<TransactionRequest> transactions);

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
    DeletedEntityResponse deleteTransactions(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code);

    /**
     * Delete transactions.
     * Delete one or more transactions from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteTransactions(String scope, String code, List<String> id);

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
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> id);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code, List<String> id);

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
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId);

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
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

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
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId);

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
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId);
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
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

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
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId);
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
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId, String transactionPropertyKey);

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
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code);
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
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

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
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

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
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

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
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

}
