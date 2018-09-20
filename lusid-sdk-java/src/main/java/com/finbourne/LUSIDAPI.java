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
import com.finbourne.models.HoldingsAdjustmentDto;
import com.finbourne.models.HoldingsAdjustmentHeaderDto;
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
import com.finbourne.models.ResourceListOfAnalyticStoreKeyDto;
import com.finbourne.models.ResourceListOfGroupDto;
import com.finbourne.models.ResourceListOfPersonalisationDto;
import com.finbourne.models.ResourceListOfPortfolioDto;
import com.finbourne.models.ResourceListOfPortfolioSearchResult;
import com.finbourne.models.ResourceListOfProcessedCommandDto;
import com.finbourne.models.ResourceListOfPropertyDataFormatDto;
import com.finbourne.models.ResourceListOfPropertyDefinitionDto;
import com.finbourne.models.ResourceListOfPropertyDomain;
import com.finbourne.models.ResourceListOfPropertyKey;
import com.finbourne.models.ResourceListOfReconciliationBreakDto;
import com.finbourne.models.ResourceListOfReferencePortfolioConstituentDto;
import com.finbourne.models.ResourceListOfScope;
import com.finbourne.models.ResourceListOfTxnMetaDataDto;
import com.finbourne.models.ResourceListOfUiDataType;
import com.finbourne.models.ResultsDto;
import com.finbourne.models.SchemaDto;
import com.finbourne.models.SecurityAnalyticDataDto;
import com.finbourne.models.SecurityClassificationDto;
import com.finbourne.models.SecurityDto;
import com.finbourne.models.TransactionQueryParameters;
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
import com.finbourne.models.VersionedResourceListOfHoldingDto;
import com.finbourne.models.VersionedResourceListOfOutputTransactionDto;
import com.finbourne.models.VersionedResourceListOfTradeDto;
import com.finbourne.models.WebLogMessage;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClearEntityCachesDto object if successful.
     */
    ClearEntityCachesDto clearEntityCaches();

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ClearEntityCachesDto> clearEntityCachesAsync(final ServiceCallback<ClearEntityCachesDto> serviceCallback);

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClearEntityCachesDto object
     */
    Observable<ClearEntityCachesDto> clearEntityCachesAsync();

    /**
     * Clears the entity caches on the instance that serves this request only.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClearEntityCachesDto object
     */
    Observable<ServiceResponse<ClearEntityCachesDto>> clearEntityCachesWithServiceResponseAsync();

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
    ListAggregationResponse getAggregationByGroup(String scope, String groupCode);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode);
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
    ListAggregationResponse getAggregationByGroup(String scope, String groupCode, AggregationRequest request);

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
    ServiceFuture<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request);

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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String groupCode);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode);
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
    NestedAggregationResponse getNestedAggregationByGroup(String scope, String groupCode, AggregationRequest request);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request);

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
    ListAggregationResponse getAggregationByPortfolio(String scope, String portfolioCode);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode);
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
    ListAggregationResponse getAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request);

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
    ServiceFuture<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request);

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
    NestedAggregationResponse getNestedAggregationByPortfolio(String scope, String portfolioCode);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode);
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
    NestedAggregationResponse getNestedAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request);

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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ListAggregationResponse object if successful.
     */
    ListAggregationResponse getAggregationByResultSet(String scope, String resultsKey, AggregationRequest request);

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
    ServiceFuture<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, final ServiceCallback<ListAggregationResponse> serviceCallback);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ListAggregationResponse> getAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ListAggregationResponse object
     */
    Observable<ServiceResponse<ListAggregationResponse>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request);

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
    NestedAggregationResponse getNestedAggregationByResultSet(String scope, String resultsKey);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey);
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
    NestedAggregationResponse getNestedAggregationByResultSet(String scope, String resultsKey, AggregationRequest request);

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
    ServiceFuture<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request, final ServiceCallback<NestedAggregationResponse> serviceCallback);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<NestedAggregationResponse> getNestedAggregationByResultSetAsync(String scope, String resultsKey, AggregationRequest request);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NestedAggregationResponse object
     */
    Observable<ServiceResponse<NestedAggregationResponse>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, AggregationRequest request);

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfAnalyticStoreKeyDto object if successful.
     */
    ResourceListOfAnalyticStoreKeyDto listAnalyticStores();

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfAnalyticStoreKeyDto> listAnalyticStoresAsync(final ServiceCallback<ResourceListOfAnalyticStoreKeyDto> serviceCallback);

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKeyDto object
     */
    Observable<ResourceListOfAnalyticStoreKeyDto> listAnalyticStoresAsync();

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKeyDto object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKeyDto>> listAnalyticStoresWithServiceResponseAsync();
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
     * @return the ResourceListOfAnalyticStoreKeyDto object if successful.
     */
    ResourceListOfAnalyticStoreKeyDto listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfAnalyticStoreKeyDto> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfAnalyticStoreKeyDto> serviceCallback);

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKeyDto object
     */
    Observable<ResourceListOfAnalyticStoreKeyDto> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * List all analytic stores in client.
     *
     * @param asAt the DateTime value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfAnalyticStoreKeyDto object
     */
    Observable<ServiceResponse<ResourceListOfAnalyticStoreKeyDto>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    AnalyticStoreDto createAnalyticStore();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStoreDto> createAnalyticStoreAsync(final ServiceCallback<AnalyticStoreDto> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    Observable<AnalyticStoreDto> createAnalyticStoreAsync();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    Observable<ServiceResponse<AnalyticStoreDto>> createAnalyticStoreWithServiceResponseAsync();
    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AnalyticStoreDto object if successful.
     */
    AnalyticStoreDto createAnalyticStore(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AnalyticStoreDto> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<AnalyticStoreDto> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    Observable<AnalyticStoreDto> createAnalyticStoreAsync(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AnalyticStoreDto object
     */
    Observable<ServiceResponse<AnalyticStoreDto>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request);

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
    AnalyticStoreDto getAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStoreDto> serviceCallback);

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
    Observable<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStoreDto>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStoreDto getAnalyticStore(String scope, int year, int month, int day, DateTime asAt);

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
    ServiceFuture<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<AnalyticStoreDto> serviceCallback);

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
    Observable<AnalyticStoreDto> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt);

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
    Observable<ServiceResponse<AnalyticStoreDto>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt);

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
     * @return the AnalyticStoreDto object if successful.
     */
    AnalyticStoreDto insertAnalytics(String scope, int year, int month, int day);

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
    ServiceFuture<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<AnalyticStoreDto> serviceCallback);

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
    Observable<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<AnalyticStoreDto>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day);
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
    AnalyticStoreDto insertAnalytics(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

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
    ServiceFuture<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data, final ServiceCallback<AnalyticStoreDto> serviceCallback);

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
    Observable<AnalyticStoreDto> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

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
    Observable<ServiceResponse<AnalyticStoreDto>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertAnalytics(String scope);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertAnalyticsAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertAnalyticsAsync(String scope);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertAnalyticsWithServiceResponseAsync(String scope);
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
    Object upsertAnalytics(String scope, AnalyticsStorageRequest request);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertAnalyticsAsync(String scope, AnalyticsStorageRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertAnalyticsAsync(String scope, AnalyticsStorageRequest request);

    /**
     * Upsert Analytics.
     *
     * @param scope Scope of the analytic
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertAnalyticsWithServiceResponseAsync(String scope, AnalyticsStorageRequest request);

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClassificationsDto object if successful.
     */
    ClassificationsDto upsertClassification();

    /**
     * Update classification data.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ClassificationsDto> upsertClassificationAsync(final ServiceCallback<ClassificationsDto> serviceCallback);

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    Observable<ClassificationsDto> upsertClassificationAsync();

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    Observable<ServiceResponse<ClassificationsDto>> upsertClassificationWithServiceResponseAsync();
    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClassificationsDto object if successful.
     */
    ClassificationsDto upsertClassification(List<SecurityClassificationDto> classifications);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ClassificationsDto> upsertClassificationAsync(List<SecurityClassificationDto> classifications, final ServiceCallback<ClassificationsDto> serviceCallback);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    Observable<ClassificationsDto> upsertClassificationAsync(List<SecurityClassificationDto> classifications);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClassificationsDto object
     */
    Observable<ServiceResponse<ClassificationsDto>> upsertClassificationWithServiceResponseAsync(List<SecurityClassificationDto> classifications);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TxnMetaDataDto object if successful.
     */
    TxnMetaDataDto addConfigurationTransactionType();

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TxnMetaDataDto> addConfigurationTransactionTypeAsync(final ServiceCallback<TxnMetaDataDto> serviceCallback);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    Observable<TxnMetaDataDto> addConfigurationTransactionTypeAsync();

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    Observable<ServiceResponse<TxnMetaDataDto>> addConfigurationTransactionTypeWithServiceResponseAsync();
    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TxnMetaDataDto object if successful.
     */
    TxnMetaDataDto addConfigurationTransactionType(TxnMetaDataDto type);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TxnMetaDataDto> addConfigurationTransactionTypeAsync(TxnMetaDataDto type, final ServiceCallback<TxnMetaDataDto> serviceCallback);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    Observable<TxnMetaDataDto> addConfigurationTransactionTypeAsync(TxnMetaDataDto type);

    /**
     * Adds a new transaction type movement to the list of existing types.
     *
     * @param type the TxnMetaDataDto value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TxnMetaDataDto object
     */
    Observable<ServiceResponse<TxnMetaDataDto>> addConfigurationTransactionTypeWithServiceResponseAsync(TxnMetaDataDto type);

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTxnMetaDataDto object if successful.
     */
    ResourceListOfTxnMetaDataDto getConfigurationTransactionTypes();

    /**
     * Gets the list of persisted transaction types.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTxnMetaDataDto> getConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTxnMetaDataDto> serviceCallback);

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ResourceListOfTxnMetaDataDto> getConfigurationTransactionTypesAsync();

    /**
     * Gets the list of persisted transaction types.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ServiceResponse<ResourceListOfTxnMetaDataDto>> getConfigurationTransactionTypesWithServiceResponseAsync();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTxnMetaDataDto object if successful.
     */
    ResourceListOfTxnMetaDataDto uploadConfigurationTransactionTypes();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(final ServiceCallback<ResourceListOfTxnMetaDataDto> serviceCallback);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ResourceListOfTxnMetaDataDto> uploadConfigurationTransactionTypesAsync();

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ServiceResponse<ResourceListOfTxnMetaDataDto>> uploadConfigurationTransactionTypesWithServiceResponseAsync();
    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfTxnMetaDataDto object if successful.
     */
    ResourceListOfTxnMetaDataDto uploadConfigurationTransactionTypes(List<TxnMetaDataDto> types);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(List<TxnMetaDataDto> types, final ServiceCallback<ResourceListOfTxnMetaDataDto> serviceCallback);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ResourceListOfTxnMetaDataDto> uploadConfigurationTransactionTypesAsync(List<TxnMetaDataDto> types);

    /**
     * Uploads a list of transaction types to be used by the movements engine.
     *
     * @param types the List&lt;TxnMetaDataDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfTxnMetaDataDto object
     */
    Observable<ServiceResponse<ResourceListOfTxnMetaDataDto>> uploadConfigurationTransactionTypesWithServiceResponseAsync(List<TxnMetaDataDto> types);

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
    List<CorporateActionEventDto> listCorporateActions(String scope, String corporateActionSourceCode);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, final ServiceCallback<List<CorporateActionEventDto>> serviceCallback);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    Observable<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode);

    /**
     * Gets a corporate action based on dates.
     *
     * @param scope Scope
     * @param corporateActionSourceCode Corporate action source id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CorporateActionEventDto&gt; object
     */
    Observable<ServiceResponse<List<CorporateActionEventDto>>> listCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode);
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
    List<CorporateActionEventDto> listCorporateActions(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt, final ServiceCallback<List<CorporateActionEventDto>> serviceCallback);

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
    Observable<List<CorporateActionEventDto>> listCorporateActionsAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<List<CorporateActionEventDto>>> listCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode, DateTime effectiveAt, DateTime asAt);

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
    TryUpsertCorporateActionsDto batchUpsertCorporateActions(String scope, String corporateActionSourceCode);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, final ServiceCallback<TryUpsertCorporateActionsDto> serviceCallback);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    Observable<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    Observable<ServiceResponse<TryUpsertCorporateActionsDto>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode);
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
    TryUpsertCorporateActionsDto batchUpsertCorporateActions(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions);

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
    ServiceFuture<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions, final ServiceCallback<TryUpsertCorporateActionsDto> serviceCallback);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    Observable<TryUpsertCorporateActionsDto> batchUpsertCorporateActionsAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions);

    /**
     * Attempt to create/update one or more corporate action. Failed actions will be identified in the body of the response.
     *
     * @param scope The intended scope of the corporate action
     * @param corporateActionSourceCode Source of the corporate action
     * @param actions The corporate actions to create
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryUpsertCorporateActionsDto object
     */
    Observable<ServiceResponse<TryUpsertCorporateActionsDto>> batchUpsertCorporateActionsWithServiceResponseAsync(String scope, String corporateActionSourceCode, List<UpsertCorporateActionRequest> actions);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getDownloadUrl();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getDownloadUrlAsync(final ServiceCallback<String> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getDownloadUrlAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getDownloadUrlWithServiceResponseAsync();
    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getDownloadUrl(String version);

    /**
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getDownloadUrlAsync(String version, final ServiceCallback<String> serviceCallback);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getDownloadUrlAsync(String version);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getDownloadUrlWithServiceResponseAsync(String version);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getLatestVersion();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getLatestVersionAsync(final ServiceCallback<String> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getLatestVersionAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getLatestVersionWithServiceResponseAsync();

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfGroupDto object if successful.
     */
    ResourceListOfGroupDto listPortfolioGroups(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfGroupDto> listPortfolioGroupsAsync(String scope, final ServiceCallback<ResourceListOfGroupDto> serviceCallback);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ResourceListOfGroupDto> listPortfolioGroupsAsync(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ServiceResponse<ResourceListOfGroupDto>> listPortfolioGroupsWithServiceResponseAsync(String scope);
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
     * @return the ResourceListOfGroupDto object if successful.
     */
    ResourceListOfGroupDto listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfGroupDto> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfGroupDto> serviceCallback);

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
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ResourceListOfGroupDto> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ServiceResponse<ResourceListOfGroupDto>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupDto object if successful.
     */
    GroupDto createPortfolioGroup(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> createPortfolioGroupAsync(String scope, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> createPortfolioGroupAsync(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> createPortfolioGroupWithServiceResponseAsync(String scope);
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
    GroupDto createPortfolioGroup(String scope, CreateGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> createPortfolioGroupAsync(String scope, CreateGroupRequest request, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> createPortfolioGroupAsync(String scope, CreateGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> createPortfolioGroupWithServiceResponseAsync(String scope, CreateGroupRequest request);

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
    GroupDto getPortfolioGroup(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> getPortfolioGroupAsync(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> getPortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    GroupDto getPortfolioGroup(String scope, String code, DateTime asAt);

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
    ServiceFuture<GroupDto> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> getPortfolioGroupAsync(String scope, String code, DateTime asAt);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt);

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
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommandDto object if successful.
     */
    ResourceListOfProcessedCommandDto getPortfolioGroupCommands(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommandDto> serviceCallback);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ResourceListOfProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommandDto>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code);
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
     * @return the ResourceListOfProcessedCommandDto object if successful.
     */
    ResourceListOfProcessedCommandDto getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListOfProcessedCommandDto> serviceCallback);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ResourceListOfProcessedCommandDto> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter A filter expression to apply to the result set
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommandDto>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    ExpandedGroupDto getPortfolioGroupExpansion(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<ExpandedGroupDto> serviceCallback);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    Observable<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpandedGroupDto object
     */
    Observable<ServiceResponse<ExpandedGroupDto>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code);
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
    ExpandedGroupDto getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<ExpandedGroupDto> serviceCallback);

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
    Observable<ExpandedGroupDto> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<ExpandedGroupDto>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    GroupDto addPortfolioToGroup(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> addPortfolioToGroupAsync(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code);
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
    GroupDto addPortfolioToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<GroupDto> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    GroupDto deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode);

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
    ServiceFuture<GroupDto> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<GroupDto> serviceCallback);

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
    Observable<GroupDto> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    Observable<ServiceResponse<GroupDto>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    GroupDto addSubGroupToGroup(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> addSubGroupToGroupAsync(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code);
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
    GroupDto addSubGroupToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<GroupDto> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    GroupDto deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode);

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
    ServiceFuture<GroupDto> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<GroupDto> serviceCallback);

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
    Observable<GroupDto> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    Observable<ServiceResponse<GroupDto>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    GroupDto updatePortfolioGroup(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupDto> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> updatePortfolioGroupAsync(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    GroupDto updatePortfolioGroup(String scope, String code, UpdateGroupRequest request);

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
    ServiceFuture<GroupDto> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request, final ServiceCallback<GroupDto> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<GroupDto> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupDto object
     */
    Observable<ServiceResponse<GroupDto>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdateGroupRequest request);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfGroupDto object if successful.
     */
    ResourceListOfGroupDto portfolioGroupsSearch();

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfGroupDto> portfolioGroupsSearchAsync(final ServiceCallback<ResourceListOfGroupDto> serviceCallback);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ResourceListOfGroupDto> portfolioGroupsSearchAsync();

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ServiceResponse<ResourceListOfGroupDto>> portfolioGroupsSearchWithServiceResponseAsync();
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
     * @return the ResourceListOfGroupDto object if successful.
     */
    ResourceListOfGroupDto portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfGroupDto> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfGroupDto> serviceCallback);

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ResourceListOfGroupDto> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search portfolio groups.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfGroupDto object
     */
    Observable<ServiceResponse<ResourceListOfGroupDto>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getHealth();

    /**
     * Simple heartbeat method for the api.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getHealthAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getHealthAsync();

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getHealthWithServiceResponseAsync();

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginResponse object if successful.
     */
    LoginResponse getLoginInfo();

    /**
     * Gets the login information.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LoginResponse> getLoginInfoAsync(final ServiceCallback<LoginResponse> serviceCallback);

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginResponse object
     */
    Observable<LoginResponse> getLoginInfoAsync();

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginResponse object
     */
    Observable<ServiceResponse<LoginResponse>> getLoginInfoWithServiceResponseAsync();

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
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String storeWebLogs();

    /**
     * Store a log message.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> storeWebLogsAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> storeWebLogsAsync();

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> storeWebLogsWithServiceResponseAsync();
    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String storeWebLogs(WebLogMessage message);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> storeWebLogsAsync(WebLogMessage message, final ServiceCallback<String> serviceCallback);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> storeWebLogsAsync(WebLogMessage message);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> storeWebLogsWithServiceResponseAsync(WebLogMessage message);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getBuildVersion();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getBuildVersionAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getBuildVersionAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getBuildVersionWithServiceResponseAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String verifyConnectivity();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> verifyConnectivityAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> verifyConnectivityAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> verifyConnectivityWithServiceResponseAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getVersion();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getVersionAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getVersionAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getVersionWithServiceResponseAsync();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPersonalisationDto object if successful.
     */
    ResourceListOfPersonalisationDto getPersonalisations();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPersonalisationDto> getPersonalisationsAsync(final ServiceCallback<ResourceListOfPersonalisationDto> serviceCallback);

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisationDto object
     */
    Observable<ResourceListOfPersonalisationDto> getPersonalisationsAsync();

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPersonalisationDto object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisationDto>> getPersonalisationsWithServiceResponseAsync();
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
     * @return the ResourceListOfPersonalisationDto object if successful.
     */
    ResourceListOfPersonalisationDto getPersonalisations(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfPersonalisationDto> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPersonalisationDto> serviceCallback);

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
     * @return the observable to the ResourceListOfPersonalisationDto object
     */
    Observable<ResourceListOfPersonalisationDto> getPersonalisationsAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

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
     * @return the observable to the ResourceListOfPersonalisationDto object
     */
    Observable<ServiceResponse<ResourceListOfPersonalisationDto>> getPersonalisationsWithServiceResponseAsync(String pattern, String scope, Boolean recursive, Boolean wildcards, List<String> sortBy, Integer start, Integer limit);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationsResponse object if successful.
     */
    UpsertPersonalisationsResponse upsertPersonalisations();

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(final ServiceCallback<UpsertPersonalisationsResponse> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    Observable<UpsertPersonalisationsResponse> upsertPersonalisationsAsync();

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationsResponse>> upsertPersonalisationsWithServiceResponseAsync();
    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UpsertPersonalisationsResponse object if successful.
     */
    UpsertPersonalisationsResponse upsertPersonalisations(List<PersonalisationDto> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations, final ServiceCallback<UpsertPersonalisationsResponse> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    Observable<UpsertPersonalisationsResponse> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPersonalisationsResponse object
     */
    Observable<ServiceResponse<UpsertPersonalisationsResponse>> upsertPersonalisationsWithServiceResponseAsync(List<PersonalisationDto> personalisations);

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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope listPortfolioScopes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param sortBy How to order the returned scopes
     * @param start The starting index for the returned scopes
     * @param limit The final index for the returned scopes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioDto object if successful.
     */
    ResourceListOfPortfolioDto listPortfolios(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioDto> listPortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolioDto> serviceCallback);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ResourceListOfPortfolioDto> listPortfoliosAsync(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioDto>> listPortfoliosWithServiceResponseAsync(String scope);
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
     * @return the ResourceListOfPortfolioDto object if successful.
     */
    ResourceListOfPortfolioDto listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioDto> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioDto> serviceCallback);

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
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ResourceListOfPortfolioDto> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioDto>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    PortfolioDto createPortfolio(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDto> createPortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createPortfolioAsync(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createPortfolioWithServiceResponseAsync(String scope);
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
    PortfolioDto createPortfolio(String scope, CreatePortfolioRequest createRequest);

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
    ServiceFuture<PortfolioDto> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createPortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest createRequest);

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
    PortfolioDto getPortfolio(String scope, String code);

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
    ServiceFuture<PortfolioDto> getPortfolioAsync(String scope, String code, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> getPortfolioAsync(String scope, String code);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> getPortfolioWithServiceResponseAsync(String scope, String code);
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
    PortfolioDto getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<PortfolioDto> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<PortfolioDto> serviceCallback);

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
    Observable<PortfolioDto> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<PortfolioDto>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    PortfolioDto updatePortfolio(String scope, String code);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDto> updatePortfolioAsync(String scope, String code, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> updatePortfolioAsync(String scope, String code);

    /**
     * Update portfolio.
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> updatePortfolioWithServiceResponseAsync(String scope, String code);
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
    PortfolioDto updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    ServiceFuture<PortfolioDto> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<PortfolioDto> serviceCallback);

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
    Observable<PortfolioDto> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioDto>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfProcessedCommandDto object if successful.
     */
    ResourceListOfProcessedCommandDto getCommands(String scope, String code);

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
    ServiceFuture<ResourceListOfProcessedCommandDto> getCommandsAsync(String scope, String code, final ServiceCallback<ResourceListOfProcessedCommandDto> serviceCallback);

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ResourceListOfProcessedCommandDto> getCommandsAsync(String scope, String code);

    /**
     * Get modifications.
     * Gets all commands that modified the portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommandDto>> getCommandsWithServiceResponseAsync(String scope, String code);
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
     * @return the ResourceListOfProcessedCommandDto object if successful.
     */
    ResourceListOfProcessedCommandDto getCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    ServiceFuture<ResourceListOfProcessedCommandDto> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<ResourceListOfProcessedCommandDto> serviceCallback);

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
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ResourceListOfProcessedCommandDto> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
     * @return the observable to the ResourceListOfProcessedCommandDto object
     */
    Observable<ServiceResponse<ResourceListOfProcessedCommandDto>> getCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    PortfolioDetailsDto getDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetailsDto> getDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetailsDto> serviceCallback);

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
    Observable<PortfolioDetailsDto> getDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioDetailsDto>> getDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetailsDto getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<PortfolioDetailsDto> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<PortfolioDetailsDto> serviceCallback);

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
    Observable<PortfolioDetailsDto> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<PortfolioDetailsDto>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    PortfolioDetailsDto upsertPortfolioDetails(String scope, String code);

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
    ServiceFuture<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<PortfolioDetailsDto> serviceCallback);

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
    Observable<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioDetailsDto>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    PortfolioDetailsDto upsertPortfolioDetails(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    ServiceFuture<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt, final ServiceCallback<PortfolioDetailsDto> serviceCallback);

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
    Observable<PortfolioDetailsDto> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioDetailsDto>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolioDetails(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolioDetails(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
     * @return the VersionedResourceListOfHoldingDto object if successful.
     */
    VersionedResourceListOfHoldingDto getAggregateHoldings(String scope, String code);

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
    ServiceFuture<VersionedResourceListOfHoldingDto> getAggregateHoldingsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfHoldingDto> serviceCallback);

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHoldingDto object
     */
    Observable<VersionedResourceListOfHoldingDto> getAggregateHoldingsAsync(String scope, String code);

    /**
     * Get holdings.
     * Get the aggregate holdings of a portfolio.  If no effectiveAt or asAt
     are supplied then values will be defaulted to the latest system time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfHoldingDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfHoldingDto>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code);
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
     * @return the VersionedResourceListOfHoldingDto object if successful.
     */
    VersionedResourceListOfHoldingDto getAggregateHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys);

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
    ServiceFuture<VersionedResourceListOfHoldingDto> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys, final ServiceCallback<VersionedResourceListOfHoldingDto> serviceCallback);

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
     * @return the observable to the VersionedResourceListOfHoldingDto object
     */
    Observable<VersionedResourceListOfHoldingDto> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys);

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
     * @return the observable to the VersionedResourceListOfHoldingDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfHoldingDto>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> securityPropertyKeys);

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
    AdjustHoldingsDto adjustAllHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHoldingsDto> serviceCallback);

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
    Observable<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<AdjustHoldingsDto>> adjustAllHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    AdjustHoldingsDto adjustAllHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    ServiceFuture<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHoldingsDto> serviceCallback);

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
    Observable<AdjustHoldingsDto> adjustAllHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    Observable<ServiceResponse<AdjustHoldingsDto>> adjustAllHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    AdjustHoldingsDto adjustHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<AdjustHoldingsDto> serviceCallback);

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
    Observable<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<AdjustHoldingsDto>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    AdjustHoldingsDto adjustHoldings(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    ServiceFuture<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ServiceCallback<AdjustHoldingsDto> serviceCallback);

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
    Observable<AdjustHoldingsDto> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

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
    Observable<ServiceResponse<AdjustHoldingsDto>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<AdjustHoldingRequest> holdingAdjustments);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HoldingsAdjustmentHeaderDto object if successful.
     */
    HoldingsAdjustmentHeaderDto listHoldingsAdjustments(String scope, String code);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<HoldingsAdjustmentHeaderDto> listHoldingsAdjustmentsAsync(String scope, String code, final ServiceCallback<HoldingsAdjustmentHeaderDto> serviceCallback);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentHeaderDto object
     */
    Observable<HoldingsAdjustmentHeaderDto> listHoldingsAdjustmentsAsync(String scope, String code);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentHeaderDto object
     */
    Observable<ServiceResponse<HoldingsAdjustmentHeaderDto>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code);
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
     * @return the HoldingsAdjustmentHeaderDto object if successful.
     */
    HoldingsAdjustmentHeaderDto listHoldingsAdjustments(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

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
    ServiceFuture<HoldingsAdjustmentHeaderDto> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime, final ServiceCallback<HoldingsAdjustmentHeaderDto> serviceCallback);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentHeaderDto object
     */
    Observable<HoldingsAdjustmentHeaderDto> listHoldingsAdjustmentsAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

    /**
     * Gets holdings adjustments in an interval of effective time.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromEffectiveAt Events between this time (inclusive) and the toEffectiveAt are returned.
     * @param toEffectiveAt Events between this time (inclusive) and the fromEffectiveAt are returned.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentHeaderDto object
     */
    Observable<ServiceResponse<HoldingsAdjustmentHeaderDto>> listHoldingsAdjustmentsWithServiceResponseAsync(String scope, String code, DateTime fromEffectiveAt, DateTime toEffectiveAt, DateTime asAtTime);

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
     * @return the HoldingsAdjustmentDto object if successful.
     */
    HoldingsAdjustmentDto getHoldingsAdjustment(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<HoldingsAdjustmentDto> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<HoldingsAdjustmentDto> serviceCallback);

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentDto object
     */
    Observable<HoldingsAdjustmentDto> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentDto object
     */
    Observable<ServiceResponse<HoldingsAdjustmentDto>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
     * @return the HoldingsAdjustmentDto object if successful.
     */
    HoldingsAdjustmentDto getHoldingsAdjustment(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

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
    ServiceFuture<HoldingsAdjustmentDto> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime, final ServiceCallback<HoldingsAdjustmentDto> serviceCallback);

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentDto object
     */
    Observable<HoldingsAdjustmentDto> getHoldingsAdjustmentAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

    /**
     * Get a holdings adjustment for a single portfolio at a specific effective time.
     If no adjustment exists at this effective time, not found is returned.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param effectiveAt The effective time of the holdings adjustment.
     * @param asAtTime The as-at time for which the result is valid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HoldingsAdjustmentDto object
     */
    Observable<ServiceResponse<HoldingsAdjustmentDto>> getHoldingsAdjustmentWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAtTime);

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
    PortfolioPropertiesDto getProperties(String scope, String code);

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
    ServiceFuture<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioPropertiesDto> serviceCallback);

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
    Observable<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code);

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
    Observable<ServiceResponse<PortfolioPropertiesDto>> getPropertiesWithServiceResponseAsync(String scope, String code);
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
    PortfolioPropertiesDto getProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<PortfolioPropertiesDto> serviceCallback);

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
    Observable<PortfolioPropertiesDto> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<PortfolioPropertiesDto>> getPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    PortfolioPropertiesDto upsertPortfolioProperties(String scope, String code);

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
    ServiceFuture<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<PortfolioPropertiesDto> serviceCallback);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    Observable<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code);

    /**
     * Update properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioPropertiesDto object
     */
    Observable<ServiceResponse<PortfolioPropertiesDto>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    PortfolioPropertiesDto upsertPortfolioProperties(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt);

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
    ServiceFuture<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt, final ServiceCallback<PortfolioPropertiesDto> serviceCallback);

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
    Observable<PortfolioPropertiesDto> upsertPortfolioPropertiesAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt);

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
    Observable<ServiceResponse<PortfolioPropertiesDto>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, List<CreatePropertyRequest> properties, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolioProperty(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code);

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolioProperty(String scope, String code, String property, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code, String property, DateTime effectiveAt);

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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code);

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deletePortfolioProperties(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTradeDto object if successful.
     */
    VersionedResourceListOfTradeDto getTrades(String scope, String code);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfTradeDto> getTradesAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfTradeDto> serviceCallback);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTradeDto object
     */
    Observable<VersionedResourceListOfTradeDto> getTradesAsync(String scope, String code);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTradeDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfTradeDto>> getTradesWithServiceResponseAsync(String scope, String code);
    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Exclude trades with a trade-date less than this date. If not supplied, no lower filter is applied
     * @param toTradeDate Exclude trades with a trade-date greater than this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfTradeDto object if successful.
     */
    VersionedResourceListOfTradeDto getTrades(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Exclude trades with a trade-date less than this date. If not supplied, no lower filter is applied
     * @param toTradeDate Exclude trades with a trade-date greater than this date. If not supplied, no upper filter is applied
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
    ServiceFuture<VersionedResourceListOfTradeDto> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, final ServiceCallback<VersionedResourceListOfTradeDto> serviceCallback);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Exclude trades with a trade-date less than this date. If not supplied, no lower filter is applied
     * @param toTradeDate Exclude trades with a trade-date greater than this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTradeDto object
     */
    Observable<VersionedResourceListOfTradeDto> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param fromTradeDate Exclude trades with a trade-date less than this date. If not supplied, no lower filter is applied
     * @param toTradeDate Exclude trades with a trade-date greater than this date. If not supplied, no upper filter is applied
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfTradeDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfTradeDto>> getTradesWithServiceResponseAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter);

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
    UpsertPortfolioTradesDto upsertTrades(String scope, String code);

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, final ServiceCallback<UpsertPortfolioTradesDto> serviceCallback);

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    Observable<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code);

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    Observable<ServiceResponse<UpsertPortfolioTradesDto>> upsertTradesWithServiceResponseAsync(String scope, String code);
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
    UpsertPortfolioTradesDto upsertTrades(String scope, String code, List<UpsertPortfolioTradeRequest> trades);

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
    ServiceFuture<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades, final ServiceCallback<UpsertPortfolioTradesDto> serviceCallback);

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    Observable<UpsertPortfolioTradesDto> upsertTradesAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades);

    /**
     * Add/update trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertPortfolioTradesDto object
     */
    Observable<ServiceResponse<UpsertPortfolioTradesDto>> upsertTradesWithServiceResponseAsync(String scope, String code, List<UpsertPortfolioTradeRequest> trades);

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
    DeletedEntityResponse deleteTrades(String scope, String code);

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
    ServiceFuture<DeletedEntityResponse> deleteTradesAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteTradesAsync(String scope, String code);

    /**
     * Delete trades.
     * Delete one or more trades from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTradesWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteTrades(String scope, String code, List<String> id);

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
    ServiceFuture<DeletedEntityResponse> deleteTradesAsync(String scope, String code, List<String> id, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deleteTradesAsync(String scope, String code, List<String> id);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deleteTradesWithServiceResponseAsync(String scope, String code, List<String> id);

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
    AddTradePropertyDto addTradeProperty(String scope, String code, String tradeId);

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
    ServiceFuture<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, final ServiceCallback<AddTradePropertyDto> serviceCallback);

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
    Observable<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId);

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
    Observable<ServiceResponse<AddTradePropertyDto>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId);
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
    AddTradePropertyDto addTradeProperty(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties);

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
    ServiceFuture<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties, final ServiceCallback<AddTradePropertyDto> serviceCallback);

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
    Observable<AddTradePropertyDto> addTradePropertyAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties);

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
    Observable<ServiceResponse<AddTradePropertyDto>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId, List<CreatePerpetualPropertyRequest> properties);

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
    DeletedEntityResponse deletePropertyFromTrade(String scope, String code, String tradeId);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId);
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
    DeletedEntityResponse deletePropertyFromTrade(String scope, String code, String tradeId, String property);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property, final ServiceCallback<DeletedEntityResponse> serviceCallback);

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
    Observable<DeletedEntityResponse> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property);

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
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId, String property);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransactionDto object if successful.
     */
    VersionedResourceListOfOutputTransactionDto buildTransactions(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfOutputTransactionDto> buildTransactionsAsync(String scope, String code, final ServiceCallback<VersionedResourceListOfOutputTransactionDto> serviceCallback);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransactionDto object
     */
    Observable<VersionedResourceListOfOutputTransactionDto> buildTransactionsAsync(String scope, String code);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransactionDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransactionDto>> buildTransactionsWithServiceResponseAsync(String scope, String code);
    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionedResourceListOfOutputTransactionDto object if successful.
     */
    VersionedResourceListOfOutputTransactionDto buildTransactions(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, TransactionQueryParameters parameters);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VersionedResourceListOfOutputTransactionDto> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, TransactionQueryParameters parameters, final ServiceCallback<VersionedResourceListOfOutputTransactionDto> serviceCallback);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransactionDto object
     */
    Observable<VersionedResourceListOfOutputTransactionDto> buildTransactionsAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, TransactionQueryParameters parameters);

    /**
     * Get transactions.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param asAt the DateTime value
     * @param sortBy The columns to sort the returned data by
     * @param start How many items to skip from the returned set
     * @param limit How many items to return from the set
     * @param securityPropertyKeys Keys for the security properties to be decorated onto the trades
     * @param filter Trade filter
     * @param parameters Core query parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionedResourceListOfOutputTransactionDto object
     */
    Observable<ServiceResponse<VersionedResourceListOfOutputTransactionDto>> buildTransactionsWithServiceResponseAsync(String scope, String code, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> securityPropertyKeys, String filter, TransactionQueryParameters parameters);

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
    PortfolioDto createDerivedPortfolio(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDto> createDerivedPortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createDerivedPortfolioAsync(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createDerivedPortfolioWithServiceResponseAsync(String scope);
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
    PortfolioDto createDerivedPortfolio(String scope, CreateDerivedPortfolioRequest portfolio);

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
    ServiceFuture<PortfolioDto> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedPortfolioRequest portfolio);

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
     * @return the ResourceListOfPropertyDefinitionDto object if successful.
     */
    ResourceListOfPropertyDefinitionDto propertiesSearch();

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinitionDto> propertiesSearchAsync(final ServiceCallback<ResourceListOfPropertyDefinitionDto> serviceCallback);

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ResourceListOfPropertyDefinitionDto> propertiesSearchAsync();

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinitionDto>> propertiesSearchWithServiceResponseAsync();
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
     * @return the ResourceListOfPropertyDefinitionDto object if successful.
     */
    ResourceListOfPropertyDefinitionDto propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinitionDto> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinitionDto> serviceCallback);

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ResourceListOfPropertyDefinitionDto> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search properties.
     *
     * @param request the Object value
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinitionDto>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDomain object if successful.
     */
    ResourceListOfPropertyDomain getPropertyDefinitionDomains();

    /**
     * Gets the available property-definition domains.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDomain> getPropertyDefinitionDomainsAsync(final ServiceCallback<ResourceListOfPropertyDomain> serviceCallback);

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDomain object
     */
    Observable<ResourceListOfPropertyDomain> getPropertyDefinitionDomainsAsync();

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDomain object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDomain>> getPropertyDefinitionDomainsWithServiceResponseAsync();
    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDomain object if successful.
     */
    ResourceListOfPropertyDomain getPropertyDefinitionDomains(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfPropertyDomain> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfPropertyDomain> serviceCallback);

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDomain object
     */
    Observable<ResourceListOfPropertyDomain> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDomain object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDomain>> getPropertyDefinitionDomainsWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    PropertyDefinitionDto createPropertyDefinition();

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinitionDto> createPropertyDefinitionAsync(final ServiceCallback<PropertyDefinitionDto> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<PropertyDefinitionDto> createPropertyDefinitionAsync();

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<ServiceResponse<PropertyDefinitionDto>> createPropertyDefinitionWithServiceResponseAsync();
    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDefinitionDto object if successful.
     */
    PropertyDefinitionDto createPropertyDefinition(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDefinitionDto> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinitionDto> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<PropertyDefinitionDto> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<ServiceResponse<PropertyDefinitionDto>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDefinitionDto object if successful.
     */
    ResourceListOfPropertyDefinitionDto getMultiplePropertyDefinitions();

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(final ServiceCallback<ResourceListOfPropertyDefinitionDto> serviceCallback);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ResourceListOfPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync();

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinitionDto>> getMultiplePropertyDefinitionsWithServiceResponseAsync();
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
     * @return the ResourceListOfPropertyDefinitionDto object if successful.
     */
    ResourceListOfPropertyDefinitionDto getMultiplePropertyDefinitions(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDefinitionDto> serviceCallback);

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
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ResourceListOfPropertyDefinitionDto> getMultiplePropertyDefinitionsAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPropertyDefinitionDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDefinitionDto>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyKey object if successful.
     */
    ResourceListOfPropertyKey getAllPropertyKeysInDomain(String domain);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyKey> getAllPropertyKeysInDomainAsync(String domain, final ServiceCallback<ResourceListOfPropertyKey> serviceCallback);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ResourceListOfPropertyKey> getAllPropertyKeysInDomainAsync(String domain);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ServiceResponse<ResourceListOfPropertyKey>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain);
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
     * @return the ResourceListOfPropertyKey object if successful.
     */
    ResourceListOfPropertyKey getAllPropertyKeysInDomain(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyKey> getAllPropertyKeysInDomainAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyKey> serviceCallback);

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
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ResourceListOfPropertyKey> getAllPropertyKeysInDomainAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ServiceResponse<ResourceListOfPropertyKey>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope getPropertyDefinitionScopesInDomain(String domain);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfScope> getPropertyDefinitionScopesInDomainAsync(String domain, final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> getPropertyDefinitionScopesInDomainAsync(String domain);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain);
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
     * @return the ResourceListOfScope object if successful.
     */
    ResourceListOfScope getPropertyDefinitionScopesInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfScope> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfScope> serviceCallback);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ResourceListOfScope> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @param filter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfScope object
     */
    Observable<ServiceResponse<ResourceListOfScope>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyKey object if successful.
     */
    ResourceListOfPropertyKey getAllPropertyKeysInScope(String domain, String scope);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, final ServiceCallback<ResourceListOfPropertyKey> serviceCallback);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ResourceListOfPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ServiceResponse<ResourceListOfPropertyKey>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope);
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
     * @return the ResourceListOfPropertyKey object if successful.
     */
    ResourceListOfPropertyKey getAllPropertyKeysInScope(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyKey> serviceCallback);

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
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ResourceListOfPropertyKey> getAllPropertyKeysInScopeAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPropertyKey object
     */
    Observable<ServiceResponse<ResourceListOfPropertyKey>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    PropertyDefinitionDto getPropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinitionDto> serviceCallback);

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<ServiceResponse<PropertyDefinitionDto>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);
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
    PropertyDefinitionDto getPropertyDefinition(String domain, String scope, String name, DateTime asAt);

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
    ServiceFuture<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt, final ServiceCallback<PropertyDefinitionDto> serviceCallback);

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
    Observable<PropertyDefinitionDto> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt);

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
    Observable<ServiceResponse<PropertyDefinitionDto>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, DateTime asAt);

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
    PropertyDefinitionDto updatePropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<PropertyDefinitionDto> serviceCallback);

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDefinitionDto object
     */
    Observable<ServiceResponse<PropertyDefinitionDto>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);
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
    PropertyDefinitionDto updatePropertyDefinition(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    ServiceFuture<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition, final ServiceCallback<PropertyDefinitionDto> serviceCallback);

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
    Observable<PropertyDefinitionDto> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    Observable<ServiceResponse<PropertyDefinitionDto>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    DeletedEntityResponse deletePropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deletePropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding', 'TxnType'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    PropertyDataFormatDto createPropertyDataFormat();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDataFormatDto> createPropertyDataFormatAsync(final ServiceCallback<PropertyDataFormatDto> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<PropertyDataFormatDto> createPropertyDataFormatAsync();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<ServiceResponse<PropertyDataFormatDto>> createPropertyDataFormatWithServiceResponseAsync();
    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertyDataFormatDto object if successful.
     */
    PropertyDataFormatDto createPropertyDataFormat(CreatePropertyDataFormatRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDataFormatDto> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request, final ServiceCallback<PropertyDataFormatDto> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<PropertyDataFormatDto> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<ServiceResponse<PropertyDataFormatDto>> createPropertyDataFormatWithServiceResponseAsync(CreatePropertyDataFormatRequest request);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPropertyDataFormatDto object if successful.
     */
    ResourceListOfPropertyDataFormatDto listPropertyDataFormats(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, final ServiceCallback<ResourceListOfPropertyDataFormatDto> serviceCallback);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDataFormatDto object
     */
    Observable<ResourceListOfPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPropertyDataFormatDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDataFormatDto>> listPropertyDataFormatsWithServiceResponseAsync(String scope);
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
     * @return the ResourceListOfPropertyDataFormatDto object if successful.
     */
    ResourceListOfPropertyDataFormatDto listPropertyDataFormats(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPropertyDataFormatDto> serviceCallback);

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
     * @return the observable to the ResourceListOfPropertyDataFormatDto object
     */
    Observable<ResourceListOfPropertyDataFormatDto> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPropertyDataFormatDto object
     */
    Observable<ServiceResponse<ResourceListOfPropertyDataFormatDto>> listPropertyDataFormatsWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    PropertyDataFormatDto getPropertyDataFormat(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDataFormatDto> getPropertyDataFormatAsync(String scope, String name, final ServiceCallback<PropertyDataFormatDto> serviceCallback);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<PropertyDataFormatDto> getPropertyDataFormatAsync(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<ServiceResponse<PropertyDataFormatDto>> getPropertyDataFormatWithServiceResponseAsync(String scope, String name);

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
    PropertyDataFormatDto updatePropertyDataFormat(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, final ServiceCallback<PropertyDataFormatDto> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<ServiceResponse<PropertyDataFormatDto>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name);
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
    PropertyDataFormatDto updatePropertyDataFormat(String scope, String name, UpdatePropertyDataFormatRequest request);

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
    ServiceFuture<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request, final ServiceCallback<PropertyDataFormatDto> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<PropertyDataFormatDto> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertyDataFormatDto object
     */
    Observable<ServiceResponse<PropertyDataFormatDto>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name, UpdatePropertyDataFormatRequest request);

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
    IUnitDefinitionDto getUnitsFromPropertyDataFormat(String scope, String name, List<String> units);

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
    ServiceFuture<IUnitDefinitionDto> getUnitsFromPropertyDataFormatAsync(String scope, String name, List<String> units, final ServiceCallback<IUnitDefinitionDto> serviceCallback);

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<IUnitDefinitionDto> getUnitsFromPropertyDataFormatAsync(String scope, String name, List<String> units);

    /**
     * Return the definitions for the specified list of units.
     *
     * @param scope the String value
     * @param name the String value
     * @param units the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IUnitDefinitionDto object
     */
    Observable<ServiceResponse<IUnitDefinitionDto>> getUnitsFromPropertyDataFormatWithServiceResponseAsync(String scope, String name, List<String> units);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreakDto object if successful.
     */
    ResourceListOfReconciliationBreakDto performReconciliation();

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreakDto> performReconciliationAsync(final ServiceCallback<ResourceListOfReconciliationBreakDto> serviceCallback);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreakDto object
     */
    Observable<ResourceListOfReconciliationBreakDto> performReconciliationAsync();

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreakDto object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreakDto>> performReconciliationWithServiceResponseAsync();
    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReconciliationBreakDto object if successful.
     */
    ResourceListOfReconciliationBreakDto performReconciliation(ReconciliationRequest request);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReconciliationBreakDto> performReconciliationAsync(ReconciliationRequest request, final ServiceCallback<ResourceListOfReconciliationBreakDto> serviceCallback);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreakDto object
     */
    Observable<ResourceListOfReconciliationBreakDto> performReconciliationAsync(ReconciliationRequest request);

    /**
     * Perform a reconciliation between two portfolios.
     *
     * @param request the ReconciliationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReconciliationBreakDto object
     */
    Observable<ServiceResponse<ResourceListOfReconciliationBreakDto>> performReconciliationWithServiceResponseAsync(ReconciliationRequest request);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfPortfolioDto object if successful.
     */
    ResourceListOfPortfolioDto listReferencePortfolios(String scope);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfPortfolioDto> listReferencePortfoliosAsync(String scope, final ServiceCallback<ResourceListOfPortfolioDto> serviceCallback);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ResourceListOfPortfolioDto> listReferencePortfoliosAsync(String scope);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioDto>> listReferencePortfoliosWithServiceResponseAsync(String scope);
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
     * @return the ResourceListOfPortfolioDto object if successful.
     */
    ResourceListOfPortfolioDto listReferencePortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<ResourceListOfPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<ResourceListOfPortfolioDto> serviceCallback);

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
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ResourceListOfPortfolioDto> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
     * @return the observable to the ResourceListOfPortfolioDto object
     */
    Observable<ServiceResponse<ResourceListOfPortfolioDto>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortfolioDto object if successful.
     */
    PortfolioDto createReferencePortfolio(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDto> createReferencePortfolioAsync(String scope, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createReferencePortfolioAsync(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createReferencePortfolioWithServiceResponseAsync(String scope);
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
    PortfolioDto createReferencePortfolio(String scope, CreatePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortfolioDto> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio, final ServiceCallback<PortfolioDto> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<PortfolioDto> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortfolioDto object
     */
    Observable<ServiceResponse<PortfolioDto>> createReferencePortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest referencePortfolio);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituentDto object if successful.
     */
    ResourceListOfReferencePortfolioConstituentDto getReferencePortfolio(String scope, String code);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, final ServiceCallback<ResourceListOfReferencePortfolioConstituentDto> serviceCallback);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituentDto>> getReferencePortfolioWithServiceResponseAsync(String scope, String code);
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
     * @return the ResourceListOfReferencePortfolioConstituentDto object if successful.
     */
    ResourceListOfReferencePortfolioConstituentDto getReferencePortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<ResourceListOfReferencePortfolioConstituentDto> serviceCallback);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituentDto>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    DeletedEntityResponse deleteReferencePortfolio(String scope, String code);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code);
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
    DeletedEntityResponse deleteReferencePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<DeletedEntityResponse> serviceCallback);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<DeletedEntityResponse> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeletedEntityResponse object
     */
    Observable<ServiceResponse<DeletedEntityResponse>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfReferencePortfolioConstituentDto object if successful.
     */
    ResourceListOfReferencePortfolioConstituentDto getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, final ServiceCallback<ResourceListOfReferencePortfolioConstituentDto> serviceCallback);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituentDto>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code);
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
     * @return the ResourceListOfReferencePortfolioConstituentDto object if successful.
     */
    ResourceListOfReferencePortfolioConstituentDto getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfReferencePortfolioConstituentDto> serviceCallback);

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
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ResourceListOfReferencePortfolioConstituentDto> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
     * @return the observable to the ResourceListOfReferencePortfolioConstituentDto object
     */
    Observable<ServiceResponse<ResourceListOfReferencePortfolioConstituentDto>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    UpsertReferencePortfolioConstituentsDto upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<UpsertReferencePortfolioConstituentsDto> serviceCallback);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    Observable<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UpsertReferencePortfolioConstituentsDto object
     */
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    UpsertReferencePortfolioConstituentsDto upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    ServiceFuture<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents, final ServiceCallback<UpsertReferencePortfolioConstituentsDto> serviceCallback);

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
    Observable<UpsertReferencePortfolioConstituentsDto> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    Observable<ServiceResponse<UpsertReferencePortfolioConstituentsDto>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    ResultsDto getResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<ResultsDto> serviceCallback);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    Observable<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    Observable<ServiceResponse<ResultsDto>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    ResultsDto getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResultsDto> serviceCallback);

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
    Observable<ResultsDto> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<ResultsDto>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ResultsDto upsertResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<ResultsDto> serviceCallback);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    Observable<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResultsDto object
     */
    Observable<ServiceResponse<ResultsDto>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    ResultsDto upsertResults(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

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
    ServiceFuture<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request, final ServiceCallback<ResultsDto> serviceCallback);

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
    Observable<ResultsDto> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

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
    Observable<ServiceResponse<ResultsDto>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

    /**
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest', 'HoldingsAdjustment', 'HoldingsAdjustmentHeader', 'OutputTransaction', 'RealisedGainLoss'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaDto object if successful.
     */
    SchemaDto getEntitySchema(String entity);

    /**
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest', 'HoldingsAdjustment', 'HoldingsAdjustmentHeader', 'OutputTransaction', 'RealisedGainLoss'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaDto> getEntitySchemaAsync(String entity, final ServiceCallback<SchemaDto> serviceCallback);

    /**
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest', 'HoldingsAdjustment', 'HoldingsAdjustmentHeader', 'OutputTransaction', 'RealisedGainLoss'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaDto object
     */
    Observable<SchemaDto> getEntitySchemaAsync(String entity);

    /**
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'CreatePropertyRequest', 'CreatePerpetualPropertyRequest', 'PerpetualProperty', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'UpsertPortfolioTradesRequest', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup', 'CreateCorporateAction', 'CorporateAction', 'CorporateActionTransition', 'ReconciliationRequest', 'ReconciliationBreak', 'TransactionConfigurationData', 'TransactionConfigurationMovementData', 'TransactionConfigurationTypeAlias', 'TryUpsertCorporateActions', 'Iso4217CurrencyUnit', 'BasicUnit', 'CorporateActionTransitionComponent', 'TargetTaxlot', 'AdjustHoldingRequest', 'HoldingsAdjustment', 'HoldingsAdjustmentHeader', 'OutputTransaction', 'RealisedGainLoss'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaDto object
     */
    Observable<ServiceResponse<SchemaDto>> getEntitySchemaWithServiceResponseAsync(String entity);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PropertySchemaDto object if successful.
     */
    PropertySchemaDto getPropertySchema();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchemaDto> getPropertySchemaAsync(final ServiceCallback<PropertySchemaDto> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    Observable<PropertySchemaDto> getPropertySchemaAsync();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    Observable<ServiceResponse<PropertySchemaDto>> getPropertySchemaWithServiceResponseAsync();
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
    PropertySchemaDto getPropertySchema(List<String> propertyKeys, DateTime asAt);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PropertySchemaDto> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt, final ServiceCallback<PropertySchemaDto> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    Observable<PropertySchemaDto> getPropertySchemaAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PropertySchemaDto object
     */
    Observable<ServiceResponse<PropertySchemaDto>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys, DateTime asAt);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfUiDataType object if successful.
     */
    ResourceListOfUiDataType getValueTypes();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListOfUiDataType> getValueTypesAsync(final ServiceCallback<ResourceListOfUiDataType> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfUiDataType object
     */
    Observable<ResourceListOfUiDataType> getValueTypesAsync();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfUiDataType object
     */
    Observable<ServiceResponse<ResourceListOfUiDataType>> getValueTypesWithServiceResponseAsync();
    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListOfUiDataType object if successful.
     */
    ResourceListOfUiDataType getValueTypes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<ResourceListOfUiDataType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<ResourceListOfUiDataType> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfUiDataType object
     */
    Observable<ResourceListOfUiDataType> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListOfUiDataType object
     */
    Observable<ServiceResponse<ResourceListOfUiDataType>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientSecuritiesDto object if successful.
     */
    TryAddClientSecuritiesDto batchAddClientSecurities();

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(final ServiceCallback<TryAddClientSecuritiesDto> serviceCallback);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    Observable<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync();

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    Observable<ServiceResponse<TryAddClientSecuritiesDto>> batchAddClientSecuritiesWithServiceResponseAsync();
    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryAddClientSecuritiesDto object if successful.
     */
    TryAddClientSecuritiesDto batchAddClientSecurities(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions, final ServiceCallback<TryAddClientSecuritiesDto> serviceCallback);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    Observable<TryAddClientSecuritiesDto> batchAddClientSecuritiesAsync(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryAddClientSecuritiesDto object
     */
    Observable<ServiceResponse<TryAddClientSecuritiesDto>> batchAddClientSecuritiesWithServiceResponseAsync(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryDeleteClientSecuritiesDto object if successful.
     */
    TryDeleteClientSecuritiesDto batchDeleteClientSecurities();

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(final ServiceCallback<TryDeleteClientSecuritiesDto> serviceCallback);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    Observable<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync();

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> batchDeleteClientSecuritiesWithServiceResponseAsync();
    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryDeleteClientSecuritiesDto object if successful.
     */
    TryDeleteClientSecuritiesDto batchDeleteClientSecurities(List<String> uids);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(List<String> uids, final ServiceCallback<TryDeleteClientSecuritiesDto> serviceCallback);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    Observable<TryDeleteClientSecuritiesDto> batchDeleteClientSecuritiesAsync(List<String> uids);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryDeleteClientSecuritiesDto object
     */
    Observable<ServiceResponse<TryDeleteClientSecuritiesDto>> batchDeleteClientSecuritiesWithServiceResponseAsync(List<String> uids);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecurityDto object if successful.
     */
    SecurityDto getSecurity(String uid);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SecurityDto> getSecurityAsync(String uid, final ServiceCallback<SecurityDto> serviceCallback);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    Observable<SecurityDto> getSecurityAsync(String uid);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    Observable<ServiceResponse<SecurityDto>> getSecurityWithServiceResponseAsync(String uid);
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
    SecurityDto getSecurity(String uid, DateTime asAt, List<String> propertyKeys);

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
    ServiceFuture<SecurityDto> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys, final ServiceCallback<SecurityDto> serviceCallback);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    Observable<SecurityDto> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityDto object
     */
    Observable<ServiceResponse<SecurityDto>> getSecurityWithServiceResponseAsync(String uid, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodes(String codeType);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType);
    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodesBulk(String codeType);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType);
    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TryLookupSecuritiesFromCodesDto object if successful.
     */
    TryLookupSecuritiesFromCodesDto lookupSecuritiesFromCodesBulk(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<TryLookupSecuritiesFromCodesDto> serviceCallback);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<TryLookupSecuritiesFromCodesDto> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'Ticker', 'ClientInternal', 'Figi', 'CompositeFigi', 'ShareClassFigi', 'Wertpapier'
     * @param codes An array of codes
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TryLookupSecuritiesFromCodesDto object
     */
    Observable<ServiceResponse<TryLookupSecuritiesFromCodesDto>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

}
