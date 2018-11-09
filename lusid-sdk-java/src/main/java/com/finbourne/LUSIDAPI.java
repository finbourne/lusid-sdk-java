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
import com.finbourne.models.DeleteQuotesResponse;
import com.finbourne.models.ErrorResponseException;
import com.finbourne.models.ExecutionRequest;
import com.finbourne.models.ExpandedGroup;
import com.finbourne.models.HoldingsAdjustment;
import com.finbourne.models.Instrument;
import com.finbourne.models.InstrumentAnalytic;
import com.finbourne.models.InstrumentProperty;
import com.finbourne.models.IUnitDefinitionDto;
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
import com.finbourne.models.ResourceListOfCorporateAction;
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
import com.finbourne.models.ResourceListOfTransactionConfigurationData;
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
import com.finbourne.models.VersionedResourceListOfOutputTransaction;
import com.finbourne.models.VersionedResourceListOfPortfolioHolding;
import com.finbourne.models.VersionedResourceListOfTransaction;
import com.finbourne.models.VersionSummaryDto;
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
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKey object if successful.
     */
    ResourceListOfAnalyticStoreKey listAnalyticStores();

    /**
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

    /**
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync();

    /**
     * List analytic stores.
     * List all defined analytic stores.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKey object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync();
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
    ResourceListOfAnalyticStoreKey listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKey> serviceCallback);

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
    Observable<ResourceListOfAnalyticStoreKey> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKey>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStore object if successful.
     */
    AnalyticStore createAnalyticStore();

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync();

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync();
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
    AnalyticStore createAnalyticStore(CreateAnalyticStoreRequest request);

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStore> serviceCallback);

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<AnalyticStore> createAnalyticStoreAsync(CreateAnalyticStoreRequest request);

    /**
     * Create analytic store.
     * Create a new analytic store for the specified scope and date.
     *
     * @param request A populated analytic store definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStore object
     */
    Observable<ServiceResponse<AnalyticStore>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request);

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
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStore getAnalyticStore(String scope, int year, int month, int day, DateTime asAt);

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
    ServiceFuture<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt);

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
    Observable<ServiceResponse<AnalyticStore>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt);

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
    DeletedEntityResponse deleteAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);

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
    AnalyticStore setAnalytics(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStore>> setAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStore setAnalytics(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

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
    ServiceFuture<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data, final ServiceCallback<AnalyticStore> serviceCallback);

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
    Observable<AnalyticStore> setAnalyticsAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

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
    Observable<ServiceResponse<AnalyticStore>> setAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<InstrumentAnalytic> data);

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfCorporateAction object if successful.
     */
    ResourceListOfCorporateAction getCorporateActions(String scope, String code);

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
    ServiceFuture<ResourceListOfCorporateAction> getCorporateActionsAsync(String scope, String code, final ServiceCallback<ResourceListOfCorporateAction> serviceCallback);

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateAction object
     */
    Observable<ResourceListOfCorporateAction> getCorporateActionsAsync(String scope, String code);

    /**
     * Get corporate actions.
     * Gets corporate actions from a specific corporate action source.
     *
     * @param scope The scope of the corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfCorporateAction object
     */
    Observable<ServiceResponse<ResourceListOfCorporateAction>> getCorporateActionsWithServiceResponseAsync(String scope, String code);
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
     * @return the ResourceListOfCorporateAction object if successful.
     */
    ResourceListOfCorporateAction getCorporateActions(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfCorporateAction> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfCorporateAction> serviceCallback);

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
     * @return the observable to the ResourceListOfCorporateAction object
     */
    Observable<ResourceListOfCorporateAction> getCorporateActionsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfCorporateAction object
     */
    Observable<ServiceResponse<ResourceListOfCorporateAction>> getCorporateActionsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code);

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
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code);

    /**
     * Upsert corporate actions.
     * Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.
     *
     * @param scope The scope of corporate action source
     * @param code The code of the corporate action source
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertCorporateActionsResponse object
     */
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code);
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
    UpsertCorporateActionsResponse batchUpsertCorporateActions(String scope, String code, List<CreateCorporateAction> actions);

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
    ServiceFuture<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions, final ServiceCallback<UpsertCorporateActionsResponse> serviceCallback);

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
    Observable<UpsertCorporateActionsResponse> batchUpsertCorporateActionsAsync(String scope, String code, List<CreateCorporateAction> actions);

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
    Observable<ServiceResponse<UpsertCorporateActionsResponse>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String code, List<CreateCorporateAction> actions);

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
    DataType createDataType();

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataType> createDataTypeAsync(final ServiceCallback<DataType> serviceCallback);

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync();

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync();
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
    DataType createDataType(CreateDataTypeRequest request);

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
    ServiceFuture<DataType> createDataTypeAsync(CreateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> createDataTypeAsync(CreateDataTypeRequest request);

    /**
     * Create data type definition.
     * Create a new data type definition
     Data types cannot be created in either the "default" or "system" scopes.
     *
     * @param request The definition of the new data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> createDataTypeWithServiceResponseAsync(CreateDataTypeRequest request);

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
    ResourceListOfDataType listDataTypes(String scope);

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, final ServiceCallback<ResourceListOfDataType> serviceCallback);

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope);

    /**
     * List data types.
     * List all data types in a specified scope.
     *
     * @param scope The requested scope of the data types
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfDataType object
     */
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope);
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
    ResourceListOfDataType listDataTypes(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfDataType> serviceCallback);

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
    Observable<ResourceListOfDataType> listDataTypesAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfDataType>> listDataTypesWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    DataType getDataType(String scope, String code);

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
    ServiceFuture<DataType> getDataTypeAsync(String scope, String code, final ServiceCallback<DataType> serviceCallback);

    /**
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<DataType> getDataTypeAsync(String scope, String code);

    /**
     * Get data type definition.
     * Get the definition of a specified data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataType object
     */
    Observable<ServiceResponse<DataType>> getDataTypeWithServiceResponseAsync(String scope, String code);

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
    DataType updateDataType(String scope, String code);

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
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String code, final ServiceCallback<DataType> serviceCallback);

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
    Observable<DataType> updateDataTypeAsync(String scope, String code);

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
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String code);
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
    DataType updateDataType(String scope, String code, UpdateDataTypeRequest request);

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
    ServiceFuture<DataType> updateDataTypeAsync(String scope, String code, UpdateDataTypeRequest request, final ServiceCallback<DataType> serviceCallback);

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
    Observable<DataType> updateDataTypeAsync(String scope, String code, UpdateDataTypeRequest request);

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
    Observable<ServiceResponse<DataType>> updateDataTypeWithServiceResponseAsync(String scope, String code, UpdateDataTypeRequest request);

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IUnitDefinitionDto object if successful.
     */
    IUnitDefinitionDto getUnitsFromDataType(String scope, String code);

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
    ServiceFuture<IUnitDefinitionDto> getUnitsFromDataTypeAsync(String scope, String code, final ServiceCallback<IUnitDefinitionDto> serviceCallback);

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<IUnitDefinitionDto> getUnitsFromDataTypeAsync(String scope, String code);

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<ServiceResponse<IUnitDefinitionDto>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String code);
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
     * @return the IUnitDefinitionDto object if successful.
     */
    IUnitDefinitionDto getUnitsFromDataType(String scope, String code, List<String> units, String filter);

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
    ServiceFuture<IUnitDefinitionDto> getUnitsFromDataTypeAsync(String scope, String code, List<String> units, String filter, final ServiceCallback<IUnitDefinitionDto> serviceCallback);

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<IUnitDefinitionDto> getUnitsFromDataTypeAsync(String scope, String code, List<String> units, String filter);

    /**
     * Get units from data type.
     * Get the definitions of the specified units associated bound to a specific data type.
     *
     * @param scope The scope of the data type
     * @param code The code of the data type
     * @param units One or more unit identifiers for which the definition is being requested
     * @param filter Optional. Expression to filter the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<ServiceResponse<IUnitDefinitionDto>> getUnitsFromDataTypeWithServiceResponseAsync(String scope, String code, List<String> units, String filter);

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
    Portfolio createDerivedPortfolio(String scope);

    /**
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope);

    /**
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createDerivedPortfolio(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

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
    ServiceFuture<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createDerivedPortfolioAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

    /**
     * Create derived transaction portfolio.
     * Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a "parent". Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio's transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent's portfolio's, if it is also a derived portfolio, and so on).
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedTransactionPortfolioRequest portfolio);

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
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the specified derived transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteDerivedPortfolioDetails(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteDerivedPortfolioDetailsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteDerivedPortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    TryAddClientInstruments batchAddClientInstruments();

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
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(final ServiceCallback<TryAddClientInstruments> serviceCallback);

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
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync();

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
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync();
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
    TryAddClientInstruments batchAddClientInstruments(Map<String, CreateClientInstrumentRequest> definitions);

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
    ServiceFuture<TryAddClientInstruments> batchAddClientInstrumentsAsync(Map<String, CreateClientInstrumentRequest> definitions, final ServiceCallback<TryAddClientInstruments> serviceCallback);

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
    Observable<TryAddClientInstruments> batchAddClientInstrumentsAsync(Map<String, CreateClientInstrumentRequest> definitions);

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
    Observable<ServiceResponse<TryAddClientInstruments>> batchAddClientInstrumentsWithServiceResponseAsync(Map<String, CreateClientInstrumentRequest> definitions);

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
    DeleteClientInstrumentsResponse batchDeleteClientInstruments();

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
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

    /**
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync();

    /**
     * Delete instrument.
     * Attempt to delete one or more "client" instruments.
     The response will include those instruments that could not be deleted (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteClientInstrumentsResponse object
     */
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync();
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
    DeleteClientInstrumentsResponse batchDeleteClientInstruments(List<String> uids);

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
    ServiceFuture<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids, final ServiceCallback<DeleteClientInstrumentsResponse> serviceCallback);

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
    Observable<DeleteClientInstrumentsResponse> batchDeleteClientInstrumentsAsync(List<String> uids);

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
    Observable<ServiceResponse<DeleteClientInstrumentsResponse>> batchDeleteClientInstrumentsWithServiceResponseAsync(List<String> uids);

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
    Instrument getInstrument(String uid);

    /**
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Instrument> getInstrumentAsync(String uid, final ServiceCallback<Instrument> serviceCallback);

    /**
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<Instrument> getInstrumentAsync(String uid);

    /**
     * Get instrument definition.
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     *
     * @param uid The uid of the requested instrument
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Instrument object
     */
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid);
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
    Instrument getInstrument(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

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
    ServiceFuture<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<Instrument> serviceCallback);

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
    Observable<Instrument> getInstrumentAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

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
    Observable<ServiceResponse<Instrument>> getInstrumentWithServiceResponseAsync(String uid, DateTime asAt, List<String> instrumentPropertyKeys);

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
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes();

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
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

    /**
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync();

    /**
     * Lookup instrument definition.
     * Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).
     It is important to always check the 'Failed' set for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LookupInstrumentsFromCodesResponse object
     */
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync();
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
    LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

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
    ServiceFuture<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys, final ServiceCallback<LookupInstrumentsFromCodesResponse> serviceCallback);

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
    Observable<LookupInstrumentsFromCodesResponse> lookupInstrumentsFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

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
    Observable<ServiceResponse<LookupInstrumentsFromCodesResponse>> lookupInstrumentsFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> instrumentPropertyKeys);

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
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties();

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
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

    /**
     * Upsert instrument properties.
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync();

    /**
     * Upsert instrument properties.
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.
     The response will include the details of any failures that occurred during data storage.
     It is important to always check the 'Failed' collection for any unsuccessful results.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertInstrumentPropertiesResponse object
     */
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync();
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
    UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(List<InstrumentProperty> instrumentProperties);

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
    ServiceFuture<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> instrumentProperties, final ServiceCallback<UpsertInstrumentPropertiesResponse> serviceCallback);

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
    Observable<UpsertInstrumentPropertiesResponse> batchUpsertInstrumentPropertiesAsync(List<InstrumentProperty> instrumentProperties);

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
    Observable<ServiceResponse<UpsertInstrumentPropertiesResponse>> batchUpsertInstrumentPropertiesWithServiceResponseAsync(List<InstrumentProperty> instrumentProperties);

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
    String getSamlIdentityProviderId(String domain);

    /**
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getSamlIdentityProviderIdAsync(String domain, final ServiceCallback<String> serviceCallback);

    /**
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getSamlIdentityProviderIdAsync(String domain);

    /**
     * Get SAML Identity Provider.
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @param domain The domain that the user will be logging in to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getSamlIdentityProviderIdWithServiceResponseAsync(String domain);

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelDownloadUrl();

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync();

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync();
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
    String getExcelDownloadUrl(String version);

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback);

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelDownloadUrlAsync(String version);

    /**
     * Get Excel download url.
     * Request an authorised url for an Excel client version.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelDownloadUrlWithServiceResponseAsync(String version);

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getExcelAddin();

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelAddinAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelAddinAsync();

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelAddinWithServiceResponseAsync();
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
    String getExcelAddin(String version);

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getExcelAddinAsync(String version, final ServiceCallback<String> serviceCallback);

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getExcelAddinAsync(String version);

    /**
     * Download Excel Addin.
     * Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned.
     *
     * @param version The requested version of the Excel plugin
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getExcelAddinWithServiceResponseAsync(String version);

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionSummaryDto object if successful.
     */
    VersionSummaryDto getLusidVersions();

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionSummaryDto> getLusidVersionsAsync(final ServiceCallback<VersionSummaryDto> serviceCallback);

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummaryDto object
     */
    Observable<VersionSummaryDto> getLusidVersionsAsync();

    /**
     * Get LUSID versions.
     * Get the semantic versions associated with LUSID and its ecosystem.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionSummaryDto object
     */
    Observable<ServiceResponse<VersionSummaryDto>> getLusidVersionsWithServiceResponseAsync();

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisation object if successful.
     */
    ResourceListOfPersonalisation getPersonalisations();

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync();

    /**
     * Get personalisation.
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisation object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync();
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
    ResourceListOfPersonalisation getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisation> serviceCallback);

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
    Observable<ResourceListOfPersonalisation> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfPersonalisation>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationResponse object if successful.
     */
    UpsertPersonalisationResponse upsertPersonalisations();

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync();

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync();
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
    UpsertPersonalisationResponse upsertPersonalisations(List<Personalisation> personalisations);

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations, final ServiceCallback<UpsertPersonalisationResponse> serviceCallback);

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<UpsertPersonalisationResponse> upsertPersonalisationsAsync(List<Personalisation> personalisations);

    /**
     * Upsert personalisations.
     * Upsert one or more personalisations.
     *
     * @param personalisations The set of personalisations to persist
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationResponse>> upsertPersonalisationsWithServiceResponseAsync(List<Personalisation> personalisations);

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeletedEntityResponse object if successful.
     */
    DeletedEntityResponse deletePersonalisation();

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePersonalisationAsync();

    /**
     * Delete a personalisation.
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync();
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
    DeletedEntityResponse deletePersonalisation(String key, String scope, String group);

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
    ServiceFuture<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePersonalisationAsync(String key, String scope, String group);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePersonalisationWithServiceResponseAsync(String key, String scope, String group);

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
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope);

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope);

    /**
     * List groups in scope.
     * Lists all portfolio groups in a specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope);
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
    ResourceListOfPortfolioGroup listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

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
    Observable<ResourceListOfPortfolioGroup> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    PortfolioGroup createPortfolioGroup(String scope);

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope);

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope);
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
    PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest request);

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
    ServiceFuture<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest request);

    /**
     * Create group.
     * Create a new portfolio group.
     *
     * @param scope The scope into which the portfolio group will be created
     * @param request The definition of the new portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> createPortfolioGroupWithServiceResponseAsync(String scope, CreatePortfolioGroupRequest request);

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
    PortfolioGroup getPortfolioGroup(String scope, String code);

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
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code);

    /**
     * Get portfolio group.
     * Get the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup getPortfolioGroup(String scope, String code, DateTime asAt);

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
    ServiceFuture<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> getPortfolioGroupAsync(String scope, String code, DateTime asAt);

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
    Observable<ServiceResponse<PortfolioGroup>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt);

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
    PortfolioGroup updatePortfolioGroup(String scope, String code);

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
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup updatePortfolioGroup(String scope, String code, UpdatePortfolioGroupRequest request);

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
    ServiceFuture<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> updatePortfolioGroupAsync(String scope, String code, UpdatePortfolioGroupRequest request);

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
    Observable<ServiceResponse<PortfolioGroup>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdatePortfolioGroupRequest request);

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
    DeletedEntityResponse deletePortfolioGroup(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioGroupAsync(String scope, String code);

    /**
     * Delete group.
     * Deletes the definition of the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code);

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
    ListAggregationResponse getAggregationByGroup(String scope, String code);

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
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code);

    /**
     * Aggregate data in a portfolio group.
     * Aggregate data sourced from the specified portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code);
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
    ListAggregationResponse getAggregationByGroup(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code);

    /**
     * Aggregate data in a portfolio group, as nested.
     * Obsolete - Aggregate data sourced from the specified portfolio group into a nested structure. Data is nested following the group-by specifications.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code);
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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String code, AggregationRequest request);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

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
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String code, AggregationRequest request);

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
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String code, AggregationRequest request);

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
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code);

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio group.
     *
     * @param scope The scope of the portfolio group
     * @param code The code of the portfolio group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

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
    Observable<ResourceListOfProcessedCommand> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code);

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
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroup> serviceCallback);

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code);

    /**
     * Get a full expansion of a portfolio group.
     * Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroup object
     */
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code);
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
    ExpandedGroup getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroup> serviceCallback);

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
    Observable<ExpandedGroup> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<ExpandedGroup>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    PortfolioGroup addPortfolioToGroup(String scope, String code);

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
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code);

    /**
     * Add portfolio to group.
     * Adds a portfolio to a previously defined portfolio group.
     *
     * @param scope The scope of the portfolio group to which a portfolio is being added
     * @param code The code of the portfolio group to which a portfolio is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup addPortfolioToGroup(String scope, String code, ResourceId portfolioId);

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
    ServiceFuture<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId portfolioId, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> addPortfolioToGroupAsync(String scope, String code, ResourceId portfolioId);

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
    Observable<ServiceResponse<PortfolioGroup>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId portfolioId);

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
    PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode);

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
    ServiceFuture<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    Observable<ServiceResponse<PortfolioGroup>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    PortfolioGroup addSubGroupToGroup(String scope, String code);

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
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<PortfolioGroup> serviceCallback);

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code);

    /**
     * Add group to group.
     * Adds a portfolio group, as a sub-group, to an existing portfolio group.
     *
     * @param scope The scope of the portfolio group to which a sub-group is being added
     * @param code The code of the portfolio group to which a sub-group is being added
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioGroup object
     */
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code);
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
    PortfolioGroup addSubGroupToGroup(String scope, String code, ResourceId portfolioGroupId);

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
    ServiceFuture<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId portfolioGroupId, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> addSubGroupToGroupAsync(String scope, String code, ResourceId portfolioGroupId);

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
    Observable<ServiceResponse<PortfolioGroup>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId portfolioGroupId);

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
    PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode);

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
    ServiceFuture<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<PortfolioGroup> serviceCallback);

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
    Observable<PortfolioGroup> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    Observable<ServiceResponse<PortfolioGroup>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode);

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope listPortfolioScopes();

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> listPortfolioScopesAsync();

    /**
     * List portfolio scopes.
     * Lists all scopes that are either currently or have previously had portfolios in them.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync();
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
    ResourceListOfScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback);

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
    Observable<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit, String filter);

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
    ResourceListOfPortfolio listPortfolios(String scope);

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope);

    /**
     * List portfolios.
     * List all the portfolios in the specified scope.
     *
     * @param scope The scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolio object
     */
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope);
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
    ResourceListOfPortfolio listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolio> serviceCallback);

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
    Observable<ResourceListOfPortfolio> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolio>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Portfolio getPortfolio(String scope, String code);

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
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> getPortfolioAsync(String scope, String code);

    /**
     * Get portfolio definition.
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code);
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
    Portfolio getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Portfolio> serviceCallback);

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
    Observable<Portfolio> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<Portfolio>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Portfolio updatePortfolio(String scope, String code);

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
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> updatePortfolioAsync(String scope, String code);

    /**
     * Update portfolio definition.
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code);
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
    Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    ServiceFuture<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Portfolio> serviceCallback);

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
    Observable<Portfolio> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    Observable<ServiceResponse<Portfolio>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolio(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio.
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code);

    /**
     * Delete portfolio.
     * Delete a portfolio at the specified effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    ListAggregationResponse getAggregationByPortfolio(String scope, String code);

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
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code);

    /**
     * Aggregate data in a portfolio.
     * Aggregate data sourced from the specified portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code);
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
    ListAggregationResponse getAggregationByPortfolio(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String code, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code);

    /**
     * Get commands.
     * Gets all commands that modified a specific portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommand object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfProcessedCommand> serviceCallback);

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
    Observable<ResourceListOfProcessedCommand> getPortfolioCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfProcessedCommand>> getPortfolioCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    PortfolioProperties getPortfolioProperties(String scope, String code);

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
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code);

    /**
     * Get portfolio properties.
     * Get the properties of a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    PortfolioProperties getPortfolioProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioProperties> serviceCallback);

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
    Observable<PortfolioProperties> getPortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<PortfolioProperties>> getPortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    PortfolioProperties upsertPortfolioProperties(String scope, String code);

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
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioProperties> serviceCallback);

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code);

    /**
     * Upsert properties.
     * Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioProperties object
     */
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    PortfolioProperties upsertPortfolioProperties(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

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
    ServiceFuture<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt, final ServiceCallback<PortfolioProperties> serviceCallback);

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
    Observable<PortfolioProperties> upsertPortfolioPropertiesAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioProperties>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, Map<String, PropertyValue> portfolioProperties, DateTime effectiveAt);

    /**
     * Delete portfolio properties.
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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code);

    /**
     * Delete portfolio properties.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio properties.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code);

    /**
     * Delete portfolio properties.
     * Delete one, many or all property values from a portfolio for the specified effectiveAt
     Specifying no effectiveAt will delete all properties.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
     * Delete portfolio properties.
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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     * Delete portfolio properties.
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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio properties.
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
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     * Delete portfolio properties.
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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<String> portfolioPropertyKeys);

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreak object if successful.
     */
    ResourceListOfReconciliationBreak reconcileHoldings();

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync();

    /**
     * Reconcile portfolio holdings.
     * Reconcile the holdings of two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreak object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync();
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
    ResourceListOfReconciliationBreak reconcileHoldings(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfReconciliationBreak> serviceCallback);

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
    Observable<ResourceListOfReconciliationBreak> reconcileHoldingsAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfReconciliationBreak>> reconcileHoldingsWithServiceResponseAsync(PortfoliosReconciliationRequest request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions();

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync();

    /**
     * Get multiple property definitions.
     * Get one or more property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync();
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
    ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

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
    Observable<ResourceListOfPropertyDefinition> getMultiplePropertyDefinitionsAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinition object if successful.
     */
    PropertyDefinition createPropertyDefinition();

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync();

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync();
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
    PropertyDefinition createPropertyDefinition(CreatePropertyDefinitionRequest definition);

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback);

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<PropertyDefinition> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Define a new property.
     * Create a new property definition.
     *
     * @param definition The definition of the new property
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinition object
     */
    Observable<ServiceResponse<PropertyDefinition>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition);

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
    PropertyDefinition getPropertyDefinition(String domain, String scope, String code);

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
    ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback);

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
    Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code);

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
    Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
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
    PropertyDefinition getPropertyDefinition(String domain, String scope, String code, DateTime asAt);

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
    ServiceFuture<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt, final ServiceCallback<PropertyDefinition> serviceCallback);

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
    Observable<PropertyDefinition> getPropertyDefinitionAsync(String domain, String scope, String code, DateTime asAt);

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
    Observable<ServiceResponse<PropertyDefinition>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, DateTime asAt);

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
    PropertyDefinition updatePropertyDefinition(String domain, String scope, String code);

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
    ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<PropertyDefinition> serviceCallback);

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
    Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code);

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
    Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);
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
    PropertyDefinition updatePropertyDefinition(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

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
    ServiceFuture<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinition> serviceCallback);

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
    Observable<PropertyDefinition> updatePropertyDefinitionAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

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
    Observable<ServiceResponse<PropertyDefinition>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code, UpdatePropertyDefinitionRequest definition);

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
    DeletedEntityResponse deletePropertyDefinition(String domain, String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String code);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String code);

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
    ResourceListOfQuote getQuotes(String scope);

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
    ServiceFuture<ResourceListOfQuote> getQuotesAsync(String scope, final ServiceCallback<ResourceListOfQuote> serviceCallback);

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
    Observable<ResourceListOfQuote> getQuotesAsync(String scope);

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
    Observable<ServiceResponse<ResourceListOfQuote>> getQuotesWithServiceResponseAsync(String scope);
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
    ResourceListOfQuote getQuotes(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit);

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
    ServiceFuture<ResourceListOfQuote> getQuotesAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit, final ServiceCallback<ResourceListOfQuote> serviceCallback);

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
    Observable<ResourceListOfQuote> getQuotesAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfQuote>> getQuotesWithServiceResponseAsync(String scope, List<String> quoteIds, DateTime effectiveAt, DateTime asAt, String maxAge, Integer page, Integer limit);

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
    UpsertQuotesResponse upsertQuotes(String scope);

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertQuotesResponse> upsertQuotesAsync(String scope, final ServiceCallback<UpsertQuotesResponse> serviceCallback);

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    Observable<UpsertQuotesResponse> upsertQuotesAsync(String scope);

    /**
     * Add quotes.
     * Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried.
     *
     * @param scope The scope of the quotes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertQuotesResponse object
     */
    Observable<ServiceResponse<UpsertQuotesResponse>> upsertQuotesWithServiceResponseAsync(String scope);
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
    UpsertQuotesResponse upsertQuotes(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt);

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
    ServiceFuture<UpsertQuotesResponse> upsertQuotesAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt, final ServiceCallback<UpsertQuotesResponse> serviceCallback);

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
    Observable<UpsertQuotesResponse> upsertQuotesAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt);

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
    Observable<ServiceResponse<UpsertQuotesResponse>> upsertQuotesWithServiceResponseAsync(String scope, List<UpsertQuoteRequest> quotes, DateTime effectiveAt);

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
    DeleteQuotesResponse deleteQuote(String scope);

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteQuotesResponse> deleteQuoteAsync(String scope, final ServiceCallback<DeleteQuotesResponse> serviceCallback);

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    Observable<DeleteQuotesResponse> deleteQuoteAsync(String scope);

    /**
     * Delete a quote.
     * Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.
     *
     * @param scope The scope of the quote
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteQuotesResponse object
     */
    Observable<ServiceResponse<DeleteQuotesResponse>> deleteQuoteWithServiceResponseAsync(String scope);
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
    DeleteQuotesResponse deleteQuote(String scope, String id, DateTime effectiveFrom);

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
    ServiceFuture<DeleteQuotesResponse> deleteQuoteAsync(String scope, String id, DateTime effectiveFrom, final ServiceCallback<DeleteQuotesResponse> serviceCallback);

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
    Observable<DeleteQuotesResponse> deleteQuoteAsync(String scope, String id, DateTime effectiveFrom);

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
    Observable<ServiceResponse<DeleteQuotesResponse>> deleteQuoteWithServiceResponseAsync(String scope, String id, DateTime effectiveFrom);

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
    Portfolio createReferencePortfolio(String scope);

    /**
     * Create reference portfolio.
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create reference portfolio.
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope);

    /**
     * Create reference portfolio.
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createReferencePortfolio(String scope, CreateReferencePortfolioRequest referencePortfolio);

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
    ServiceFuture<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create reference portfolio.
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createReferencePortfolioAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

    /**
     * Create reference portfolio.
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createReferencePortfolioWithServiceResponseAsync(String scope, CreateReferencePortfolioRequest referencePortfolio);

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
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

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
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    ResourceListOfReferencePortfolioConstituent getReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituent> serviceCallback);

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
    Observable<ResourceListOfReferencePortfolioConstituent> getReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituent>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

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
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsResponse> serviceCallback);

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
    Observable<UpsertReferencePortfolioConstituentsResponse> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsResponse>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentRequest> constituents);

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
    Results getResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter);

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
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Results getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Results>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Results upsertResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter);

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
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Results upsertResults(String scope, String key, DateTime dateParameter, CreateResults request);

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
    ServiceFuture<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request, final ServiceCallback<Results> serviceCallback);

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
    Observable<Results> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResults request);

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
    Observable<ServiceResponse<Results>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResults request);

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
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey);

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
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey);

    /**
     * Aggregate using result data.
     * Aggregate data from a previously-run Result data set into a flat row of results.
     *
     * @param scope The scope of the Result data set
     * @param resultsKey The key of the Result data set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey);
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
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ListAggregationResponse> serviceCallback);

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
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request, List<String> sortBy, Integer start, Integer limit);

    /**
     * List entities.
     * List all available entities for which schema information is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfString object if successful.
     */
    ResourceListOfString listEntities();

    /**
     * List entities.
     * List all available entities for which schema information is available.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfString> listEntitiesAsync(final ServiceCallback<ResourceListOfString> serviceCallback);

    /**
     * List entities.
     * List all available entities for which schema information is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ResourceListOfString> listEntitiesAsync();

    /**
     * List entities.
     * List all available entities for which schema information is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfString object
     */
    Observable<ServiceResponse<ResourceListOfString>> listEntitiesWithServiceResponseAsync();

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
    Schema getEntitySchema(String entity);

    /**
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Schema> getEntitySchemaAsync(String entity, final ServiceCallback<Schema> serviceCallback);

    /**
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<Schema> getEntitySchemaAsync(String entity);

    /**
     * Get schema.
     * Gets the schema and meta-data for a given entity.
     *
     * @param entity The name of a valid entity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Schema object
     */
    Observable<ServiceResponse<Schema>> getEntitySchemaWithServiceResponseAsync(String entity);

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchema object if successful.
     */
    PropertySchema getPropertySchema();

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchema> getPropertySchemaAsync(final ServiceCallback<PropertySchema> serviceCallback);

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync();

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync();
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
    PropertySchema getPropertySchema(List<String> propertyKeys, DateTime asAt);

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
    ServiceFuture<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchema> serviceCallback);

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<PropertySchema> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Get property schema.
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys One or more property keys for which the schema is requested
     * @param asAt Optional. The AsAt date of the data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchema object
     */
    Observable<ServiceResponse<PropertySchema>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfValueType object if successful.
     */
    ResourceListOfValueType getValueTypes();

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(final ServiceCallback<ResourceListOfValueType> serviceCallback);

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ResourceListOfValueType> getValueTypesAsync();

    /**
     * Get value types.
     * Gets the available value types for which a schema is available.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfValueType object
     */
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync();
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
    ResourceListOfValueType getValueTypes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfValueType> serviceCallback);

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
    Observable<ResourceListOfValueType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResourceListOfValueType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Search portfolio groups.
     * Search through all portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioGroup object if successful.
     */
    ResourceListOfPortfolioGroup portfolioGroupsSearch();

    /**
     * Search portfolio groups.
     * Search through all portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

    /**
     * Search portfolio groups.
     * Search through all portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync();

    /**
     * Search portfolio groups.
     * Search through all portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioGroup object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync();
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
    ResourceListOfPortfolioGroup portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioGroup> serviceCallback);

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
    Observable<ResourceListOfPortfolioGroup> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioGroup>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search portfolios.
     * Search through all portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioSearchResult object if successful.
     */
    ResourceListOfPortfolioSearchResult portfoliosSearch();

    /**
     * Search portfolios.
     * Search through all portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

    /**
     * Search portfolios.
     * Search through all portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync();

    /**
     * Search portfolios.
     * Search through all portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioSearchResult object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync();
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
    ResourceListOfPortfolioSearchResult portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioSearchResult> serviceCallback);

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
    Observable<ResourceListOfPortfolioSearchResult> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPortfolioSearchResult>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinition object if successful.
     */
    ResourceListOfPropertyDefinition propertiesSearch();

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync();

    /**
     * Search property definitions.
     * Search through all property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinition object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync();
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
    ResourceListOfPropertyDefinition propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinition> serviceCallback);

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
    Observable<ResourceListOfPropertyDefinition> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<ResourceListOfPropertyDefinition>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * List transaction types.
     * Get the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionConfigurationData object if successful.
     */
    ResourceListOfTransactionConfigurationData listConfigurationTransactionTypes();

    /**
     * List transaction types.
     * Get the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionConfigurationData> listConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionConfigurationData> serviceCallback);

    /**
     * List transaction types.
     * Get the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ResourceListOfTransactionConfigurationData> listConfigurationTransactionTypesAsync();

    /**
     * List transaction types.
     * Get the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionConfigurationData>> listConfigurationTransactionTypesWithServiceResponseAsync();

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionConfigurationData object if successful.
     */
    ResourceListOfTransactionConfigurationData setConfigurationTransactionTypes();

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTransactionConfigurationData> setConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTransactionConfigurationData> serviceCallback);

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ResourceListOfTransactionConfigurationData> setConfigurationTransactionTypesAsync();

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionConfigurationData>> setConfigurationTransactionTypesWithServiceResponseAsync();
    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTransactionConfigurationData object if successful.
     */
    ResourceListOfTransactionConfigurationData setConfigurationTransactionTypes(List<TransactionConfigurationDataRequest> types);

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
    ServiceFuture<ResourceListOfTransactionConfigurationData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types, final ServiceCallback<ResourceListOfTransactionConfigurationData> serviceCallback);

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ResourceListOfTransactionConfigurationData> setConfigurationTransactionTypesAsync(List<TransactionConfigurationDataRequest> types);

    /**
     * Set transaction types.
     * Set all transaction types to be used by the movements engine, for the organisation
     WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.
     *
     * @param types The complete set of transaction type definitions
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTransactionConfigurationData object
     */
    Observable<ServiceResponse<ResourceListOfTransactionConfigurationData>> setConfigurationTransactionTypesWithServiceResponseAsync(List<TransactionConfigurationDataRequest> types);

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransactionConfigurationData object if successful.
     */
    TransactionConfigurationData createConfigurationTransactionType();

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync();

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync();
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
    TransactionConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest type);

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type, final ServiceCallback<TransactionConfigurationData> serviceCallback);

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<TransactionConfigurationData> createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest type);

    /**
     * Create transaction type.
     * Create a new transaction type by specifying a definition and the mappings to movements.
     *
     * @param type A transaction type definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransactionConfigurationData object
     */
    Observable<ServiceResponse<TransactionConfigurationData>> createConfigurationTransactionTypeWithServiceResponseAsync(TransactionConfigurationDataRequest type);

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
    Portfolio createPortfolio(String scope);

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope);

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope);
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
    Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest);

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
    ServiceFuture<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ServiceCallback<Portfolio> serviceCallback);

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<Portfolio> createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest);

    /**
     * Create transaction portfolio.
     * Create a transaction portfolio in a specific scope.
     *
     * @param scope The scope into which the transaction portfolio will be created
     * @param createRequest The transaction portfolio definition
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Portfolio object
     */
    Observable<ServiceResponse<Portfolio>> createPortfolioWithServiceResponseAsync(String scope, CreateTransactionPortfolioRequest createRequest);

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
    PortfolioDetails getDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetails getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<PortfolioDetails>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    PortfolioDetails upsertPortfolioDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetails> serviceCallback);

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code);

    /**
     * Upsert details.
     * Update the portfolio details for the specified transaction portfolios or add if it doesn't already exist (in the case of a derived transaction portfolio).
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDetails object
     */
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    ServiceFuture<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt, final ServiceCallback<PortfolioDetails> serviceCallback);

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
    Observable<PortfolioDetails> upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioDetails>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, CreatePortfolioDetails details, DateTime effectiveAt);

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
    UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code);

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
    ServiceFuture<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioExecutionsResponse> serviceCallback);

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    Observable<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code);

    /**
     * Upsert executions.
     * Inserts new executions, or updates those already present.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioExecutionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> upsertExecutionsWithServiceResponseAsync(String scope, String code);
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
    UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code, List<ExecutionRequest> executions);

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
    ServiceFuture<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions, final ServiceCallback<UpsertPortfolioExecutionsResponse> serviceCallback);

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
    Observable<UpsertPortfolioExecutionsResponse> upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions);

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
    Observable<ServiceResponse<UpsertPortfolioExecutionsResponse>> upsertExecutionsWithServiceResponseAsync(String scope, String code, List<ExecutionRequest> executions);

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
     * @return the VersionedResourceListOfPortfolioHolding object if successful.
     */
    VersionedResourceListOfPortfolioHolding getHoldings(String scope, String code);

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
    ServiceFuture<VersionedResourceListOfPortfolioHolding> getHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfPortfolioHolding> serviceCallback);

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfPortfolioHolding object
     */
    Observable<VersionedResourceListOfPortfolioHolding> getHoldingsAsync(String scope, String code);

    /**
     * Get holdings.
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfPortfolioHolding object
     */
    Observable<ServiceResponse<VersionedResourceListOfPortfolioHolding>> getHoldingsWithServiceResponseAsync(String scope, String code);
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
     * @return the VersionedResourceListOfPortfolioHolding object if successful.
     */
    VersionedResourceListOfPortfolioHolding getHoldings(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

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
    ServiceFuture<VersionedResourceListOfPortfolioHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, final ServiceCallback<VersionedResourceListOfPortfolioHolding> serviceCallback);

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
     * @return the observable to the VersionedResourceListOfPortfolioHolding object
     */
    Observable<VersionedResourceListOfPortfolioHolding> getHoldingsAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

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
     * @return the observable to the VersionedResourceListOfPortfolioHolding object
     */
    Observable<ServiceResponse<VersionedResourceListOfPortfolioHolding>> getHoldingsWithServiceResponseAsync(String scope, String code, Boolean byTaxlots, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys);

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
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

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
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    AdjustHolding setHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    ServiceFuture<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

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
    Observable<AdjustHolding> setHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    Observable<ServiceResponse<AdjustHolding>> setHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHolding> serviceCallback);

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
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    AdjustHolding adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    ServiceFuture<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHolding> serviceCallback);

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
    Observable<AdjustHolding> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    Observable<ServiceResponse<AdjustHolding>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    DeletedEntityResponse cancelAdjustHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> cancelAdjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> cancelAdjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code);

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
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

    /**
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code);

    /**
     * List holdings adjustments.
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfHoldingsAdjustmentHeader object
     */
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code);
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
    ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt);

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
    ServiceFuture<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt, final ServiceCallback<ResourceListOfHoldingsAdjustmentHeader> serviceCallback);

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
    Observable<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<ResourceListOfHoldingsAdjustmentHeader>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAt);

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
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustment> serviceCallback);

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
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    HoldingsAdjustment getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<HoldingsAdjustment> serviceCallback);

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
    Observable<HoldingsAdjustment> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<HoldingsAdjustment>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    VersionedResourceListOfTransaction getTransactions(String scope, String code);

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
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

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
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code);

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
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code);
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
    VersionedResourceListOfTransaction getTransactions(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

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
    ServiceFuture<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTransaction> serviceCallback);

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
    Observable<VersionedResourceListOfTransaction> getTransactionsAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

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
    Observable<ServiceResponse<VersionedResourceListOfTransaction>> getTransactionsWithServiceResponseAsync(String scope, String code, DateTime fromTransactionDate, DateTime toTransactionDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter);

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
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code);

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
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code);

    /**
     * Upsert transactions into the specified transaction portfolio.
     * Upsert transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTransactionsResponse object
     */
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code);
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
    UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions);

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
    ServiceFuture<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ServiceCallback<UpsertPortfolioTransactionsResponse> serviceCallback);

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
    Observable<UpsertPortfolioTransactionsResponse> upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions);

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
    Observable<ServiceResponse<UpsertPortfolioTransactionsResponse>> upsertTransactionsWithServiceResponseAsync(String scope, String code, List<TransactionRequest> transactions);

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
    DeletedEntityResponse deleteTransactions(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code);

    /**
     * Delete transactions.
     * Delete one or more transactions from a transaction portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteTransactions(String scope, String code, List<String> transactionIds);

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
    ServiceFuture<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> transactionIds, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteTransactionsAsync(String scope, String code, List<String> transactionIds);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTransactionsWithServiceResponseAsync(String scope, String code, List<String> transactionIds);

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
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId);

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
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

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
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId);

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
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId);
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
    AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    ServiceFuture<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ServiceCallback<AddTransactionPropertyResponse> serviceCallback);

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
    Observable<AddTransactionPropertyResponse> addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    Observable<ServiceResponse<AddTransactionPropertyResponse>> addTransactionPropertyWithServiceResponseAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties);

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
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId);
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
    DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTransactionWithServiceResponseAsync(String scope, String code, String transactionId, String transactionPropertyKey);

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
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code);

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
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code);

    /**
     * Build output transactions.
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions.
     *
     * @param scope The scope of the portfolio
     * @param code The code of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransaction object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code);
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
    VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

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
    ServiceFuture<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransaction> serviceCallback);

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
    Observable<VersionedResourceListOfOutputTransaction> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

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
    Observable<ServiceResponse<VersionedResourceListOfOutputTransaction>> buildTransactionsWithServiceResponseAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> instrumentPropertyKeys, String filter, TransactionQueryParameters parameters);

}
