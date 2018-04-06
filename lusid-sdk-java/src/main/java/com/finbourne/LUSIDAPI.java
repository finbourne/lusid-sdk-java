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

import com.finbourne.models.AggregationRequest;
import com.finbourne.models.CreateAnalyticStoreRequest;
import com.finbourne.models.CreateClientSecurityRequest;
import com.finbourne.models.CreateDerivedPortfolioRequest;
import com.finbourne.models.CreateGroupRequest;
import com.finbourne.models.CreatePortfolioRequest;
import com.finbourne.models.CreatePropertyDataFormatRequest;
import com.finbourne.models.CreatePropertyDefinitionRequest;
import com.finbourne.models.CreateResultsRequest;
import com.finbourne.models.HoldingAdjustmentDto;
import com.finbourne.models.PersonalisationDto;
import com.finbourne.models.PortfolioDetailsRequest;
import com.finbourne.models.PropertyDto;
import com.finbourne.models.ReferencePortfolioConstituentDto;
import com.finbourne.models.ResourceId;
import com.finbourne.models.SecurityAnalyticDataDto;
import com.finbourne.models.SecurityClassificationDto;
import com.finbourne.models.TradeDto;
import com.finbourne.models.UpdateGroupRequest;
import com.finbourne.models.UpdatePortfolioRequest;
import com.finbourne.models.UpdatePropertyDataFormatRequest;
import com.finbourne.models.UpdatePropertyDefinitionRequest;
import com.finbourne.models.WebLogMessage;
import com.microsoft.rest.RestException;
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
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getAggregationByGroup(String scope, String groupCode);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAggregationByGroupAsync(String scope, String groupCode);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode);
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
    Object getAggregationByGroup(String scope, String groupCode, AggregationRequest request);

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
    ServiceFuture<Object> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request);

    /**
     * Aggregate data in a group hierarchy.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request);

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
    Object getNestedAggregationByGroup(String scope, String groupCode);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getNestedAggregationByGroupAsync(String scope, String groupCode);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode);
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
    Object getNestedAggregationByGroup(String scope, String groupCode, AggregationRequest request);

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
    ServiceFuture<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getNestedAggregationByGroupAsync(String scope, String groupCode, AggregationRequest request);

    /**
     * Aggregation request data in a group hierarchy into a data tree.
     *
     * @param scope the String value
     * @param groupCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getNestedAggregationByGroupWithServiceResponseAsync(String scope, String groupCode, AggregationRequest request);

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
    Object getAggregationByPortfolio(String scope, String portfolioCode);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode);
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
    Object getAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request);

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
    ServiceFuture<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request);

    /**
     * Aggregate data in a portfolio.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request);

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
    Object getNestedAggregationByPortfolio(String scope, String portfolioCode);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode);
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
    Object getNestedAggregationByPortfolio(String scope, String portfolioCode, AggregationRequest request);

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
    ServiceFuture<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getNestedAggregationByPortfolioAsync(String scope, String portfolioCode, AggregationRequest request);

    /**
     * Aggregation request data in a portfolio into a data tree.
     *
     * @param scope the String value
     * @param portfolioCode the String value
     * @param request the AggregationRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getNestedAggregationByPortfolioWithServiceResponseAsync(String scope, String portfolioCode, AggregationRequest request);

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
    Object getAggregationByResultSet(String scope, String resultsKey, String resultsDate);

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
    ServiceFuture<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate);

    /**
     * Aggregate data from a result set.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, String resultsDate);
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
    Object getAggregationByResultSet(String scope, String resultsKey, String resultsDate, AggregationRequest request);

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
    ServiceFuture<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAggregationByResultSetAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request);

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
    Observable<ServiceResponse<Object>> getAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, String resultsDate, AggregationRequest request);

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
    Object getNestedAggregationByResultSet(String scope, String resultsKey, DateTime resultsDate);

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
    ServiceFuture<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, final ServiceCallback<Object> serviceCallback);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate);

    /**
     * Aggregate data from a result set into a nested structure.
     *
     * @param scope the String value
     * @param resultsKey the String value
     * @param resultsDate the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, DateTime resultsDate);
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
    Object getNestedAggregationByResultSet(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request);

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
    ServiceFuture<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getNestedAggregationByResultSetAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request);

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
    Observable<ServiceResponse<Object>> getNestedAggregationByResultSetWithServiceResponseAsync(String scope, String resultsKey, DateTime resultsDate, AggregationRequest request);

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object listAnalyticStores();

    /**
     * List all analytic stores in client.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listAnalyticStoresAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listAnalyticStoresAsync();

    /**
     * List all analytic stores in client.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listAnalyticStoresWithServiceResponseAsync();
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
    Object listAnalyticStores(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listAnalyticStoresAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> listAnalyticStoresWithServiceResponseAsync(DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createAnalyticStore();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createAnalyticStoreAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createAnalyticStoreAsync();

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createAnalyticStoreWithServiceResponseAsync();
    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createAnalyticStore(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createAnalyticStoreAsync(CreateAnalyticStoreRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createAnalyticStoreAsync(CreateAnalyticStoreRequest request);

    /**
     * Create a new analytic store for the given scope for the given date.
     *
     * @param request A valid and fully populated analytic store creation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createAnalyticStoreWithServiceResponseAsync(CreateAnalyticStoreRequest request);

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
    Object getAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<Object>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);
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
    Object getAnalyticStore(String scope, int year, int month, int day, DateTime asAt);

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
    ServiceFuture<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAnalyticStoreAsync(String scope, int year, int month, int day, DateTime asAt);

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
    Observable<ServiceResponse<Object>> getAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day, DateTime asAt);

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
    Object deleteAnalyticStore(String scope, int year, int month, int day);

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
    ServiceFuture<Object> deleteAnalyticStoreAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deleteAnalyticStoreAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<Object>> deleteAnalyticStoreWithServiceResponseAsync(String scope, int year, int month, int day);

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
    Object insertAnalytics(String scope, int year, int month, int day);

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
    ServiceFuture<Object> insertAnalyticsAsync(String scope, int year, int month, int day, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> insertAnalyticsAsync(String scope, int year, int month, int day);

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
    Observable<ServiceResponse<Object>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day);
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
    Object insertAnalytics(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

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
    ServiceFuture<Object> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> insertAnalyticsAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

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
    Observable<ServiceResponse<Object>> insertAnalyticsWithServiceResponseAsync(String scope, int year, int month, int day, List<SecurityAnalyticDataDto> data);

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertClassification();

    /**
     * Update classification data.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertClassificationAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertClassificationAsync();

    /**
     * Update classification data.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertClassificationWithServiceResponseAsync();
    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertClassification(List<SecurityClassificationDto> classifications);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertClassificationAsync(List<SecurityClassificationDto> classifications, final ServiceCallback<Object> serviceCallback);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertClassificationAsync(List<SecurityClassificationDto> classifications);

    /**
     * Update classification data.
     *
     * @param classifications the List&lt;SecurityClassificationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertClassificationWithServiceResponseAsync(List<SecurityClassificationDto> classifications);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getDownloadUrl();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getDownloadUrlAsync(final ServiceCallback<Object> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getDownloadUrlAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getDownloadUrlWithServiceResponseAsync();
    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getDownloadUrl(String version);

    /**
     *
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getDownloadUrlAsync(String version, final ServiceCallback<Object> serviceCallback);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getDownloadUrlAsync(String version);

    /**
     *
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getDownloadUrlWithServiceResponseAsync(String version);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getLatestVersion();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getLatestVersionAsync(final ServiceCallback<Object> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getLatestVersionAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getLatestVersionWithServiceResponseAsync();

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object listPortfolioGroups(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listPortfolioGroupsAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listPortfolioGroupsAsync(String scope);

    /**
     * List all groups in a specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listPortfolioGroupsWithServiceResponseAsync(String scope);
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
    Object listPortfolioGroups(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listPortfolioGroupsAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> listPortfolioGroupsWithServiceResponseAsync(String scope, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createPortfolioGroup(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPortfolioGroupAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPortfolioGroupAsync(String scope);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPortfolioGroupWithServiceResponseAsync(String scope);
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
    Object createPortfolioGroup(String scope, CreateGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPortfolioGroupAsync(String scope, CreateGroupRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPortfolioGroupAsync(String scope, CreateGroupRequest request);

    /**
     * Create a new group.
     *
     * @param scope the String value
     * @param request the CreateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPortfolioGroupWithServiceResponseAsync(String scope, CreateGroupRequest request);

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
    Object getPortfolioGroup(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPortfolioGroupAsync(String scope, String code);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    Object getPortfolioGroup(String scope, String code, DateTime asAt);

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
    ServiceFuture<Object> getPortfolioGroupAsync(String scope, String code, DateTime asAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPortfolioGroupAsync(String scope, String code, DateTime asAt);

    /**
     * Get an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param asAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPortfolioGroupWithServiceResponseAsync(String scope, String code, DateTime asAt);

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
    Object deletePortfolioGroup(String scope, String code);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deletePortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePortfolioGroupAsync(String scope, String code);

    /**
     * Delete a group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePortfolioGroupWithServiceResponseAsync(String scope, String code);

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
    Object getPortfolioGroupCommands(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPortfolioGroupCommandsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPortfolioGroupCommandsAsync(String scope, String code);

    /**
     * Gets all commands that modified the portfolio groups(s) with the specified id.
     *
     * @param scope The scope of the portfolio group
     * @param code The portfolio group id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code);
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
    Object getPortfolioGroupCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    ServiceFuture<Object> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPortfolioGroupCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    Observable<ServiceResponse<Object>> getPortfolioGroupCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    Object getPortfolioGroupExpansion(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPortfolioGroupExpansionAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPortfolioGroupExpansionAsync(String scope, String code);

    /**
     * Get a full expansion of an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code);
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
    Object getPortfolioGroupExpansion(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<Object> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPortfolioGroupExpansionAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<Object>> getPortfolioGroupExpansionWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Object addPortfolioToGroup(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> addPortfolioToGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addPortfolioToGroupAsync(String scope, String code);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code);
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
    Object addPortfolioToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<Object> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<Object> serviceCallback);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addPortfolioToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a portfolio to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> addPortfolioToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    Object deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode);

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
    ServiceFuture<Object> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    Observable<ServiceResponse<Object>> deletePortfolioFromGroupWithServiceResponseAsync(String scope, String code, String portfolioScope, String portfolioCode);

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
    Object addSubGroupToGroup(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> addSubGroupToGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addSubGroupToGroupAsync(String scope, String code);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code);
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
    Object addSubGroupToGroup(String scope, String code, ResourceId identifier);

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
    ServiceFuture<Object> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier, final ServiceCallback<Object> serviceCallback);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addSubGroupToGroupAsync(String scope, String code, ResourceId identifier);

    /**
     * Add a sub group to an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param identifier the ResourceId value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> addSubGroupToGroupWithServiceResponseAsync(String scope, String code, ResourceId identifier);

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
    Object deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode);

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
    ServiceFuture<Object> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    Observable<ServiceResponse<Object>> deleteSubGroupFromGroupWithServiceResponseAsync(String scope, String code, String subgroupScope, String subgroupCode);

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
    Object updatePortfolioGroup(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> updatePortfolioGroupAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePortfolioGroupAsync(String scope, String code);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code);
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
    Object updatePortfolioGroup(String scope, String code, UpdateGroupRequest request);

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
    ServiceFuture<Object> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePortfolioGroupAsync(String scope, String code, UpdateGroupRequest request);

    /**
     * Update an existing group.
     *
     * @param scope the String value
     * @param code the String value
     * @param request the UpdateGroupRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePortfolioGroupWithServiceResponseAsync(String scope, String code, UpdateGroupRequest request);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object portfolioGroupsSearch();

    /**
     * Search portfolio groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> portfolioGroupsSearchAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> portfolioGroupsSearchAsync();

    /**
     * Search portfolio groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> portfolioGroupsSearchWithServiceResponseAsync();
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
    Object portfolioGroupsSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> portfolioGroupsSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> portfolioGroupsSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getHealth();

    /**
     * Simple heartbeat method for the api.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getHealthAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getHealthAsync();

    /**
     * Simple heartbeat method for the api.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getHealthWithServiceResponseAsync();

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getLoginInfo();

    /**
     * Gets the login information.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getLoginInfoAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getLoginInfoAsync();

    /**
     * Gets the login information.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getLoginInfoWithServiceResponseAsync();

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object storeWebLogs();

    /**
     * Store a log message.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> storeWebLogsAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> storeWebLogsAsync();

    /**
     * Store a log message.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> storeWebLogsWithServiceResponseAsync();
    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object storeWebLogs(WebLogMessage message);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> storeWebLogsAsync(WebLogMessage message, final ServiceCallback<Object> serviceCallback);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> storeWebLogsAsync(WebLogMessage message);

    /**
     * Store a log message.
     *
     * @param message the WebLogMessage value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> storeWebLogsWithServiceResponseAsync(WebLogMessage message);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getBuildVersion();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getBuildVersionAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getBuildVersionAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getBuildVersionWithServiceResponseAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object verifyConnectivity();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> verifyConnectivityAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> verifyConnectivityAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> verifyConnectivityWithServiceResponseAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getVersion();

    /**
     * Returns the current assembly version.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getVersionAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getVersionAsync();

    /**
     * Returns the current assembly version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getVersionWithServiceResponseAsync();

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
    Object getPersonalisations(boolean recursive, boolean wildcards);

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, final ServiceCallback<Object> serviceCallback);

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards);

    /**
     * Get a personalisation, recursing to get any referenced if required.
     *
     * @param recursive Whether to recurse into dereference recursive settings
     * @param wildcards Whether to apply wildcards to the provided pattern and pull back any matching
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards);
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
    Object getPersonalisations(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPersonalisationsAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Object>> getPersonalisationsWithServiceResponseAsync(boolean recursive, boolean wildcards, String pattern, String scope, List<String> sortBy, Integer start, Integer limit);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertPersonalisations();

    /**
     * Upsert one or more personalisations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertPersonalisationsAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertPersonalisationsAsync();

    /**
     * Upsert one or more personalisations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertPersonalisationsWithServiceResponseAsync();
    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertPersonalisations(List<PersonalisationDto> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations, final ServiceCallback<Object> serviceCallback);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertPersonalisationsAsync(List<PersonalisationDto> personalisations);

    /**
     * Upsert one or more personalisations.
     *
     * @param personalisations the List&lt;PersonalisationDto&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertPersonalisationsWithServiceResponseAsync(List<PersonalisationDto> personalisations);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object deletePersonalisation(String scope);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deletePersonalisationAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePersonalisationAsync(String scope);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePersonalisationWithServiceResponseAsync(String scope);
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
    Object deletePersonalisation(String scope, String key, String group);

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
    ServiceFuture<Object> deletePersonalisationAsync(String scope, String key, String group, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePersonalisationAsync(String scope, String key, String group);

    /**
     * Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely).
     *
     * @param scope The scope to delete at (use ALL to purge the setting entirely). Possible values include: 'User', 'Group', 'Default', 'All'
     * @param key The key of the setting to be deleted
     * @param group If deleting a setting at group level, specify the group here
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePersonalisationWithServiceResponseAsync(String scope, String key, String group);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object listPortfolioScopes();

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listPortfolioScopesAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listPortfolioScopesAsync();

    /**
     * List scopes that contain portfolios.
     * Lists all scopes that have previously been used.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listPortfolioScopesWithServiceResponseAsync();
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
    Object listPortfolioScopes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listPortfolioScopesAsync(List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Object>> listPortfolioScopesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

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
    Object listPortfolios(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listPortfoliosAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listPortfoliosAsync(String scope);

    /**
     * Get all portfolios.
     * Get all portfolios in a scope.
     *
     * @param scope The scope to get portfolios from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listPortfoliosWithServiceResponseAsync(String scope);
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
    Object listPortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listPortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> listPortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Object createPortfolio(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPortfolioAsync(String scope);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPortfolioWithServiceResponseAsync(String scope);
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
    Object createPortfolio(String scope, CreatePortfolioRequest createRequest);

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
    ServiceFuture<Object> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest, final ServiceCallback<Object> serviceCallback);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPortfolioAsync(String scope, CreatePortfolioRequest createRequest);

    /**
     * Create portfolio.
     * Creates a new portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param createRequest The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest createRequest);

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
    Object getPortfolio(String scope, String code);

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
    ServiceFuture<Object> getPortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPortfolioAsync(String scope, String code);

    /**
     * Get portfolio.
     * Gets a single portfolio by code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPortfolioWithServiceResponseAsync(String scope, String code);
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
    Object getPortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<Object> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<Object>> getPortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object updatePortfolio(String scope, String code);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> updatePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePortfolioAsync(String scope, String code);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePortfolioWithServiceResponseAsync(String scope, String code);
    /**
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
    Object updatePortfolio(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

    /**
     *
     * @param scope The scope of the portfolio to be updated
     * @param code Code for the portfolio
     * @param request The update request
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePortfolioWithServiceResponseAsync(String scope, String code, UpdatePortfolioRequest request, DateTime effectiveAt);

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
    Object deletePortfolio(String scope, String code);

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
    ServiceFuture<Object> deletePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePortfolioAsync(String scope, String code);

    /**
     * Delete portfolio.
     * Deletes a portfolio from the given effectiveAt.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePortfolioWithServiceResponseAsync(String scope, String code);
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
    Object deletePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> deletePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePortfolioAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> deletePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getCommands(String scope, String code);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getCommandsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getCommandsAsync(String scope, String code);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getCommandsWithServiceResponseAsync(String scope, String code);
    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
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
    Object getCommands(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
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
    ServiceFuture<Object> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getCommandsAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

    /**
     * Gets all commands that modified the portfolio(s) with the specified id.
     *
     * @param scope The scope of the portfolio
     * @param code The portfolio id
     * @param fromAsAt Filters commands by those that were processed at or after this time. Null means there is no lower limit.
     * @param toAsAt Filters commands by those that were processed at or before this time. Null means there is no upper limit (latest).
     * @param filter Command filter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getCommandsWithServiceResponseAsync(String scope, String code, DateTime fromAsAt, DateTime toAsAt, String filter);

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
    Object getDetails(String scope, String code);

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
    ServiceFuture<Object> getDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<Object>> getDetailsWithServiceResponseAsync(String scope, String code);
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
    Object getDetails(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    ServiceFuture<Object> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getDetailsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Observable<ServiceResponse<Object>> getDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> propertyFilter);

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
    Object upsertPortfolioDetails(String scope, String code);

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
    ServiceFuture<Object> upsertPortfolioDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> upsertPortfolioDetailsAsync(String scope, String code);

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
    Observable<ServiceResponse<Object>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    Object upsertPortfolioDetails(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    ServiceFuture<Object> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> upsertPortfolioDetailsAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> upsertPortfolioDetailsWithServiceResponseAsync(String scope, String code, PortfolioDetailsRequest details, DateTime effectiveAt);

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
    Object deletePortfolioDetails(String scope, String code);

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
    ServiceFuture<Object> deletePortfolioDetailsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePortfolioDetailsAsync(String scope, String code);

    /**
     * Delete portfolio details.
     * Deletes the portfolio details for the given code.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code);
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
    Object deletePortfolioDetails(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePortfolioDetailsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> deletePortfolioDetailsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    Object getAggregateHoldings(String scope, String code);

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
    ServiceFuture<Object> getAggregateHoldingsAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAggregateHoldingsAsync(String scope, String code);

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
    Observable<ServiceResponse<Object>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code);
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
    Object getAggregateHoldings(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAggregateHoldingsAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> getAggregateHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Object adjustHoldings(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    Object adjustHoldings(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings);

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
    ServiceFuture<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> adjustHoldingsAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings);

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
    Observable<ServiceResponse<Object>> adjustHoldingsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<HoldingAdjustmentDto> holdings);

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
    Object getProperties(String scope, String code);

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
    ServiceFuture<Object> getPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPropertiesAsync(String scope, String code);

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
    Observable<ServiceResponse<Object>> getPropertiesWithServiceResponseAsync(String scope, String code);
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
    Object getProperties(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter);

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
    ServiceFuture<Object> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPropertiesAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter);

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
    Observable<ServiceResponse<Object>> getPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertPortfolioProperties(String scope, String code);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertPortfolioPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertPortfolioPropertiesAsync(String scope, String code);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code);
    /**
     * Create properties.
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
    Object upsertPortfolioProperties(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt);

    /**
     * Create properties.
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
    ServiceFuture<Object> upsertPortfolioPropertiesAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertPortfolioPropertiesAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt);

    /**
     * Create properties.
     * Create one or more properties on a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param properties the List&lt;PropertyDto&gt; value
     * @param effectiveAt The effective date for the change
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertPortfolioPropertiesWithServiceResponseAsync(String scope, String code, List<PropertyDto> properties, DateTime effectiveAt);

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
    Object deletePortfolioProperty(String scope, String code);

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
    ServiceFuture<Object> deletePortfolioPropertyAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePortfolioPropertyAsync(String scope, String code);

    /**
     * Delete property.
     * Delete a property from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code);
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
    Object deletePortfolioProperty(String scope, String code, String property, DateTime effectiveAt);

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
    ServiceFuture<Object> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePortfolioPropertyAsync(String scope, String code, String property, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> deletePortfolioPropertyWithServiceResponseAsync(String scope, String code, String property, DateTime effectiveAt);

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
    Object deletePortfolioProperties(String scope, String code);

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
    ServiceFuture<Object> deletePortfolioPropertiesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePortfolioPropertiesAsync(String scope, String code);

    /**
     * Delete properties.
     * Delete all properties from a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code);
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
    Object deletePortfolioProperties(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePortfolioPropertiesAsync(String scope, String code, DateTime effectiveAt);

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
    Observable<ServiceResponse<Object>> deletePortfolioPropertiesWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    Object getTrades(String scope, String code);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getTradesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getTradesAsync(String scope, String code);

    /**
     * Get trades.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getTradesWithServiceResponseAsync(String scope, String code);
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
    Object getTrades(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter);

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
    ServiceFuture<Object> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getTradesAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter);

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
    Observable<ServiceResponse<Object>> getTradesWithServiceResponseAsync(String scope, String code, DateTime fromTradeDate, DateTime toTradeDate, DateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyFilter, String filter);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertTrades(String scope, String code);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertTradesAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertTradesAsync(String scope, String code);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertTradesWithServiceResponseAsync(String scope, String code);
    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object upsertTrades(String scope, String code, List<TradeDto> trades);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> upsertTradesAsync(String scope, String code, List<TradeDto> trades, final ServiceCallback<Object> serviceCallback);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertTradesAsync(String scope, String code, List<TradeDto> trades);

    /**
     * Add/updates trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @param trades The trades to be updated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertTradesWithServiceResponseAsync(String scope, String code, List<TradeDto> trades);

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
    Object deleteTrades(String scope, String code, DateTime cancelDate);

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
    ServiceFuture<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate);

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
    Observable<ServiceResponse<Object>> deleteTradesWithServiceResponseAsync(String scope, String code, DateTime cancelDate);
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
    Object deleteTrades(String scope, String code, DateTime cancelDate, List<String> id);

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
    ServiceFuture<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, List<String> id, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deleteTradesAsync(String scope, String code, DateTime cancelDate, List<String> id);

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
    Observable<ServiceResponse<Object>> deleteTradesWithServiceResponseAsync(String scope, String code, DateTime cancelDate, List<String> id);

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
    Object addTradeProperty(String scope, String code, String tradeId);

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
    ServiceFuture<Object> addTradePropertyAsync(String scope, String code, String tradeId, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> addTradePropertyAsync(String scope, String code, String tradeId);

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
    Observable<ServiceResponse<Object>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId);
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
    Object addTradeProperty(String scope, String code, String tradeId, List<PropertyDto> properties);

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
    ServiceFuture<Object> addTradePropertyAsync(String scope, String code, String tradeId, List<PropertyDto> properties, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> addTradePropertyAsync(String scope, String code, String tradeId, List<PropertyDto> properties);

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
    Observable<ServiceResponse<Object>> addTradePropertyWithServiceResponseAsync(String scope, String code, String tradeId, List<PropertyDto> properties);

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
    Object deletePropertyFromTrade(String scope, String code, String tradeId);

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
    ServiceFuture<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId);

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
    Observable<ServiceResponse<Object>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId);
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
    Object deletePropertyFromTrade(String scope, String code, String tradeId, String property);

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
    ServiceFuture<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> deletePropertyFromTradeAsync(String scope, String code, String tradeId, String property);

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
    Observable<ServiceResponse<Object>> deletePropertyFromTradeWithServiceResponseAsync(String scope, String code, String tradeId, String property);

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
    Object addTradePropertyToAll(String scope, String code);

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
    ServiceFuture<Object> addTradePropertyToAllAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addTradePropertyToAllAsync(String scope, String code);

    /**
     * Add properties to all trades.
     * Add one or more properties to all trades in a portfolio.
     *
     * @param scope The scope of the portfolio
     * @param code Code for the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> addTradePropertyToAllWithServiceResponseAsync(String scope, String code);
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
    Object addTradePropertyToAll(String scope, String code, List<PropertyDto> properties);

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
    ServiceFuture<Object> addTradePropertyToAllAsync(String scope, String code, List<PropertyDto> properties, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> addTradePropertyToAllAsync(String scope, String code, List<PropertyDto> properties);

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
    Observable<ServiceResponse<Object>> addTradePropertyToAllWithServiceResponseAsync(String scope, String code, List<PropertyDto> properties);

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
    Object createDerivedPortfolio(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createDerivedPortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createDerivedPortfolioAsync(String scope);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createDerivedPortfolioWithServiceResponseAsync(String scope);
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
    Object createDerivedPortfolio(String scope, CreateDerivedPortfolioRequest portfolio);

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
    ServiceFuture<Object> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio, final ServiceCallback<Object> serviceCallback);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createDerivedPortfolioAsync(String scope, CreateDerivedPortfolioRequest portfolio);

    /**
     * Create derived portfolio.
     * Creates a portfolio that derives from an existing portfolio.
     *
     * @param scope The scope into which to create the new derived portfolio
     * @param portfolio The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createDerivedPortfolioWithServiceResponseAsync(String scope, CreateDerivedPortfolioRequest portfolio);

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object portfoliosSearch();

    /**
     * Search portfolios.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> portfoliosSearchAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> portfoliosSearchAsync();

    /**
     * Search portfolios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> portfoliosSearchWithServiceResponseAsync();
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
    Object portfoliosSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> portfoliosSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> portfoliosSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object propertiesSearch();

    /**
     * Search properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> propertiesSearchAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> propertiesSearchAsync();

    /**
     * Search properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> propertiesSearchWithServiceResponseAsync();
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
    Object propertiesSearch(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> propertiesSearchAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> propertiesSearchWithServiceResponseAsync(Object request, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getPropertyDefinitionDomains();

    /**
     * Gets the available property-definition domains.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPropertyDefinitionDomainsAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertyDefinitionDomainsAsync();

    /**
     * Gets the available property-definition domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertyDefinitionDomainsWithServiceResponseAsync();
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
    Object getPropertyDefinitionDomains(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertyDefinitionDomainsAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Gets the available property-definition domains.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertyDefinitionDomainsWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createPropertyDefinition();

    /**
     * Creates a new property definition.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPropertyDefinitionAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPropertyDefinitionAsync();

    /**
     * Creates a new property definition.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPropertyDefinitionWithServiceResponseAsync();
    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createPropertyDefinition(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition, final ServiceCallback<Object> serviceCallback);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPropertyDefinitionAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Creates a new property definition.
     *
     * @param definition the CreatePropertyDefinitionRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPropertyDefinitionWithServiceResponseAsync(CreatePropertyDefinitionRequest definition);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getMultiplePropertyDefinitions();

    /**
     * Gets multiple property definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getMultiplePropertyDefinitionsAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getMultiplePropertyDefinitionsAsync();

    /**
     * Gets multiple property definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getMultiplePropertyDefinitionsWithServiceResponseAsync();
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
    Object getMultiplePropertyDefinitions(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> getMultiplePropertyDefinitionsAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getMultiplePropertyDefinitionsAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> getMultiplePropertyDefinitionsWithServiceResponseAsync(List<String> keys, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getAllPropertyKeysInDomain(String domain);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAllPropertyKeysInDomainAsync(String domain, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAllPropertyKeysInDomainAsync(String domain);

    /**
     * Gets all available property definitions.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain);
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
    Object getAllPropertyKeysInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> getAllPropertyKeysInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAllPropertyKeysInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> getAllPropertyKeysInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getPropertyDefinitionScopesInDomain(String domain);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPropertyDefinitionScopesInDomainAsync(String domain, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertyDefinitionScopesInDomainAsync(String domain);

    /**
     * Gets the available property-definition scopes for the specified domain.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain);
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
    Object getPropertyDefinitionScopesInDomain(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPropertyDefinitionScopesInDomainAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> getPropertyDefinitionScopesInDomainWithServiceResponseAsync(String domain, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Object getAllPropertyKeysInScope(String domain, String scope);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAllPropertyKeysInScopeAsync(String domain, String scope);

    /**
     * Gets all properties in a scope.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope);
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
    Object getAllPropertyKeysInScope(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAllPropertyKeysInScopeAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> getAllPropertyKeysInScopeWithServiceResponseAsync(String domain, String scope, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Object getPropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<Object> getPropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Gets a property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);
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
    Object getPropertyDefinition(String domain, String scope, String name, DateTime asAt);

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
    ServiceFuture<Object> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getPropertyDefinitionAsync(String domain, String scope, String name, DateTime asAt);

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
    Observable<ServiceResponse<Object>> getPropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, DateTime asAt);

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
    Object updatePropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Updates the specified property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);
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
    Object updatePropertyDefinition(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    ServiceFuture<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> updatePropertyDefinitionAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    Observable<ServiceResponse<Object>> updatePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name, UpdatePropertyDefinitionRequest definition);

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
    Object deletePropertyDefinition(String domain, String scope, String name);

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
    ServiceFuture<Object> deletePropertyDefinitionAsync(String domain, String scope, String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deletePropertyDefinitionAsync(String domain, String scope, String name);

    /**
     * Deletes the property definition.
     *
     * @param domain Possible values include: 'Trade', 'Portfolio', 'Security', 'Holding', 'ReferenceHolding'
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deletePropertyDefinitionWithServiceResponseAsync(String domain, String scope, String name);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createPropertyDataFormat();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPropertyDataFormatAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPropertyDataFormatAsync();

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPropertyDataFormatWithServiceResponseAsync();
    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createPropertyDataFormat(CreatePropertyDataFormatRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createPropertyDataFormatAsync(CreatePropertyDataFormatRequest request);

    /**
     * Create a new PropertyDataFormat. Note: Only non-default formats can be created.
     *
     * @param request The definition of the new format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createPropertyDataFormatWithServiceResponseAsync(CreatePropertyDataFormatRequest request);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object listPropertyDataFormats(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listPropertyDataFormatsAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listPropertyDataFormatsAsync(String scope);

    /**
     * Lists all property data formats in the specified scope.
     *
     * @param scope the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listPropertyDataFormatsWithServiceResponseAsync(String scope);
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
    Object listPropertyDataFormats(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listPropertyDataFormatsAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> listPropertyDataFormatsWithServiceResponseAsync(String scope, Boolean includeDefault, Boolean includeSystem, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Object getPropertyDataFormat(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPropertyDataFormatAsync(String scope, String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertyDataFormatAsync(String scope, String name);

    /**
     * Gets a property data format.
     *
     * @param scope the String value
     * @param name the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertyDataFormatWithServiceResponseAsync(String scope, String name);

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
    Object updatePropertyDataFormat(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> updatePropertyDataFormatAsync(String scope, String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePropertyDataFormatAsync(String scope, String name);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name);
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
    Object updatePropertyDataFormat(String scope, String name, UpdatePropertyDataFormatRequest request);

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
    ServiceFuture<Object> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request, final ServiceCallback<Object> serviceCallback);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updatePropertyDataFormatAsync(String scope, String name, UpdatePropertyDataFormatRequest request);

    /**
     * Update a PropertyDataFormat. Note: Only non-default formats can be updated.
     *
     * @param scope The scope of the format being updated
     * @param name The name of the format to update
     * @param request The new definition of the format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updatePropertyDataFormatWithServiceResponseAsync(String scope, String name, UpdatePropertyDataFormatRequest request);

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
    Object listReferencePortfolios(String scope, DateTime effectiveAt);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt);

    /**
     * Get all reference portfolios in a scope.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt);
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
    Object listReferencePortfolios(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    ServiceFuture<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> listReferencePortfoliosAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

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
    Observable<ServiceResponse<Object>> listReferencePortfoliosWithServiceResponseAsync(String scope, DateTime effectiveAt, DateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object createReferencePortfolio(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createReferencePortfolioAsync(String scope, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createReferencePortfolioAsync(String scope);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createReferencePortfolioWithServiceResponseAsync(String scope);
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
    Object createReferencePortfolio(String scope, CreatePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio, final ServiceCallback<Object> serviceCallback);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createReferencePortfolioAsync(String scope, CreatePortfolioRequest referencePortfolio);

    /**
     * Create a new reference portfolio.
     *
     * @param scope The intended scope of the portfolio
     * @param referencePortfolio The portfolio creation request object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createReferencePortfolioWithServiceResponseAsync(String scope, CreatePortfolioRequest referencePortfolio);

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
    Object getReferencePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Get a reference portfolio by name (as opposed to id).
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    Object getReferencePortfolio(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    ServiceFuture<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Observable<ServiceResponse<Object>> getReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, DateTime asAt);

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
    Object deleteReferencePortfolio(String scope, String code);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteReferencePortfolioAsync(String scope, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteReferencePortfolioAsync(String scope, String code);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code);
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
    Object deleteReferencePortfolio(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteReferencePortfolioAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Delete a specific portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteReferencePortfolioWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);

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
    Object getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code);

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
    ServiceFuture<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, final ServiceCallback<Object> serviceCallback);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code);

    /**
     * Get all the constituents in a reference portfolio.
     *
     * @param scope the String value
     * @param effectiveAt the DateTime value
     * @param code the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code);
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
    Object getReferencePortfolioConstituents(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getReferencePortfolioConstituentsAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Object>> getReferencePortfolioConstituentsWithServiceResponseAsync(String scope, DateTime effectiveAt, String code, String referencePortfolioId, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Object upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt);

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
    ServiceFuture<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, final ServiceCallback<Object> serviceCallback);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt);

    /**
     * Add constituents to a specific reference portfolio.
     *
     * @param scope the String value
     * @param code the String value
     * @param effectiveAt the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt);
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
    Object upsertReferencePortfolioConstituents(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    ServiceFuture<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> upsertReferencePortfolioConstituentsAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    Observable<ServiceResponse<Object>> upsertReferencePortfolioConstituentsWithServiceResponseAsync(String scope, String code, DateTime effectiveAt, List<ReferencePortfolioConstituentDto> constituents);

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
    Object getResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Object> getResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Object> serviceCallback);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Retrieve some previously stored results.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data was loaded
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Object getResults(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getResultsAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Observable<ServiceResponse<Object>> getResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, DateTime asAt, List<String> sortBy, Integer start, Integer limit);

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
    Object upsertResults(String scope, String key, DateTime dateParameter);

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
    ServiceFuture<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, final ServiceCallback<Object> serviceCallback);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter);

    /**
     * Upsert precalculated results against a specified scope/key/date combination.
     *
     * @param scope The scope of the data
     * @param key The key that identifies the data
     * @param dateParameter The date for which the data is relevant
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter);
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
    Object upsertResults(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

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
    ServiceFuture<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> upsertResultsAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

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
    Observable<ServiceResponse<Object>> upsertResultsWithServiceResponseAsync(String scope, String key, DateTime dateParameter, CreateResultsRequest request);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getEntitySchema(String entity);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getEntitySchemaAsync(String entity, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getEntitySchemaAsync(String entity);

    /**
     * Gets the schema for a given entity.
     *
     * @param entity Possible values include: 'PropertyKey', 'FieldSchema', 'Personalisation', 'Security', 'Property', 'Login', 'PropertyDefinition', 'PropertyDataFormat', 'AggregationResponseNode', 'Portfolio', 'CompletePortfolio', 'PortfolioSearchResult', 'PortfolioDetails', 'PortfolioProperties', 'Version', 'AddTradeProperty', 'AnalyticStore', 'AnalyticStoreKey', 'UpsertPortfolioTrades', 'Group', 'Constituent', 'Trade', 'PortfolioHolding', 'AdjustHolding', 'ErrorDetail', 'ErrorResponse', 'InstrumentDefinition', 'ProcessedCommand', 'CreatePortfolio', 'CreateAnalyticStore', 'CreateClientSecurity', 'CreateDerivedPortfolio', 'CreateGroup', 'CreatePropertyDataFormat', 'CreatePropertyDefinition', 'UpdatePortfolio', 'UpdateGroup', 'UpdatePropertyDataFormat', 'UpdatePropertyDefinition', 'SecurityAnalytic', 'AggregationRequest', 'Aggregation', 'NestedAggregation', 'ResultDataSchema', 'Classification', 'SecurityClassification', 'WebLogMessage', 'UpsertPersonalisation', 'CreatePortfolioDetails', 'UpsertConstituent', 'CreateResults', 'Results', 'TryAddClientSecurities', 'TryDeleteClientSecurities', 'TryLookupSecuritiesFromCodes', 'ExpandedGroup'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getEntitySchemaWithServiceResponseAsync(String entity);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getPropertySchema();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPropertySchemaAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertySchemaAsync();

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertySchemaWithServiceResponseAsync();
    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getPropertySchema(List<String> propertyKeys);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getPropertySchemaAsync(List<String> propertyKeys, final ServiceCallback<Object> serviceCallback);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getPropertySchemaAsync(List<String> propertyKeys);

    /**
     * Get the schemas for the provided list of property keys.
     *
     * @param propertyKeys A comma delimited list of property keys in string format. e.g. "Portfolio/default/PropertyName,Portfolio/differentScope/MyProperty"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getPropertySchemaWithServiceResponseAsync(List<String> propertyKeys);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getValueTypes();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getValueTypesAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getValueTypesAsync();

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getValueTypesWithServiceResponseAsync();
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
    Object getValueTypes(List<String> sortBy, Integer start, Integer limit);

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
    ServiceFuture<Object> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getValueTypesAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Gets the available value types that could be returned in a schema.
     *
     * @param sortBy the List&lt;String&gt; value
     * @param start the Integer value
     * @param limit the Integer value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getValueTypesWithServiceResponseAsync(List<String> sortBy, Integer start, Integer limit);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object tryAddClientSecurity();

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> tryAddClientSecurityAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> tryAddClientSecurityAsync();

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> tryAddClientSecurityWithServiceResponseAsync();
    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object tryAddClientSecurity(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> tryAddClientSecurityAsync(List<CreateClientSecurityRequest> definitions, final ServiceCallback<Object> serviceCallback);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> tryAddClientSecurityAsync(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to create one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param definitions the List&lt;CreateClientSecurityRequest&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> tryAddClientSecurityWithServiceResponseAsync(List<CreateClientSecurityRequest> definitions);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object tryDeleteClientSecurity();

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> tryDeleteClientSecurityAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> tryDeleteClientSecurityAsync();

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> tryDeleteClientSecurityWithServiceResponseAsync();
    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object tryDeleteClientSecurity(List<String> uids);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> tryDeleteClientSecurityAsync(List<String> uids, final ServiceCallback<Object> serviceCallback);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> tryDeleteClientSecurityAsync(List<String> uids);

    /**
     * Attempt to delete one or more client securities. Failed securities will be identified in the body of the response.
     *
     * @param uids the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> tryDeleteClientSecurityWithServiceResponseAsync(List<String> uids);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getSecurity(String uid);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getSecurityAsync(String uid, final ServiceCallback<Object> serviceCallback);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getSecurityAsync(String uid);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getSecurityWithServiceResponseAsync(String uid);
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
    Object getSecurity(String uid, DateTime asAt, List<String> propertyKeys);

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
    ServiceFuture<Object> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getSecurityAsync(String uid, DateTime asAt, List<String> propertyKeys);

    /**
     * Get an individual security by the unique security uid.  Optionally, decorate each security with specific properties.
     *
     * @param uid The uid of the requested security
     * @param asAt As at date
     * @param propertyKeys Keys of the properties to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getSecurityWithServiceResponseAsync(String uid, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object lookupSecuritiesFromCodes(String codeType);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> lookupSecuritiesFromCodesAsync(String codeType, final ServiceCallback<Object> serviceCallback);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> lookupSecuritiesFromCodesAsync(String codeType);

    /**
     * Lookup more than one security by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType);
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
    Object lookupSecuritiesFromCodes(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

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
    ServiceFuture<Object> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> lookupSecuritiesFromCodesAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

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
    Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object lookupSecuritiesFromCodesBulk(String codeType);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, final ServiceCallback<Object> serviceCallback);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> lookupSecuritiesFromCodesBulkAsync(String codeType);

    /**
     * Lookup a large number of securities by supplying a collection of non-Finbourne codes.  Optionally, decorate each security with specific properties.
     *
     * @param codeType The type of identifier. Possible values include: 'Undefined', 'ReutersAssetId', 'CINS', 'Isin', 'Sedol', 'Cusip', 'ClientInternal', 'Figi', 'Wertpapier'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType);
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
    Object lookupSecuritiesFromCodesBulk(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

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
    ServiceFuture<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> lookupSecuritiesFromCodesBulkAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

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
    Observable<ServiceResponse<Object>> lookupSecuritiesFromCodesBulkWithServiceResponseAsync(String codeType, List<String> codes, DateTime asAt, List<String> propertyKeys);

}
