# AnalyticsStoresApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnalyticStore**](AnalyticsStoresApi.md#createAnalyticStore) | **POST** /api/analytics | Create analytic store
[**deleteAnalyticStore**](AnalyticsStoresApi.md#deleteAnalyticStore) | **DELETE** /api/analytics/{scope}/{year}/{month}/{day} | Delete analytic store
[**getAnalyticStore**](AnalyticsStoresApi.md#getAnalyticStore) | **GET** /api/analytics/{scope}/{year}/{month}/{day} | Get analytic store
[**listAnalyticStores**](AnalyticsStoresApi.md#listAnalyticStores) | **GET** /api/analytics | List analytic stores
[**setAnalytics**](AnalyticsStoresApi.md#setAnalytics) | **PUT** /api/analytics/{scope}/{year}/{month}/{day}/prices | Set analytic data


<a name="createAnalyticStore"></a>
# **createAnalyticStore**
> AnalyticStore createAnalyticStore(request)

Create analytic store

Create a new analytic store for the specified scope and date

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.AnalyticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsStoresApi apiInstance = new AnalyticsStoresApi();
CreateAnalyticStoreRequest request = new CreateAnalyticStoreRequest(); // CreateAnalyticStoreRequest | A populated analytic store definition
try {
    AnalyticStore result = apiInstance.createAnalyticStore(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsStoresApi#createAnalyticStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateAnalyticStoreRequest**](CreateAnalyticStoreRequest.md)| A populated analytic store definition | [optional]

### Return type

[**AnalyticStore**](AnalyticStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deleteAnalyticStore"></a>
# **deleteAnalyticStore**
> DeletedEntityResponse deleteAnalyticStore(scope, year, month, day)

Delete analytic store

Delete stored analytic data in the specified scope for the specified date

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.AnalyticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsStoresApi apiInstance = new AnalyticsStoresApi();
String scope = "scope_example"; // String | The analytics data scope
Integer year = 56; // Integer | The year component of the date
Integer month = 56; // Integer | The month component of the date
Integer day = 56; // Integer | The day component of the date
try {
    DeletedEntityResponse result = apiInstance.deleteAnalyticStore(scope, year, month, day);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsStoresApi#deleteAnalyticStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The analytics data scope |
 **year** | **Integer**| The year component of the date |
 **month** | **Integer**| The month component of the date |
 **day** | **Integer**| The day component of the date |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getAnalyticStore"></a>
# **getAnalyticStore**
> AnalyticStore getAnalyticStore(scope, year, month, day, asAt)

Get analytic store

Get the meta data associated with a specified scope and date combination (analytic store)

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.AnalyticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsStoresApi apiInstance = new AnalyticsStoresApi();
String scope = "scope_example"; // String | The analytics data scope
Integer year = 56; // Integer | The year component of the date for the data in the scope
Integer month = 56; // Integer | The month component of the date for the data in the scope
Integer day = 56; // Integer | The day component of the date for the data in the scope
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    AnalyticStore result = apiInstance.getAnalyticStore(scope, year, month, day, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsStoresApi#getAnalyticStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The analytics data scope |
 **year** | **Integer**| The year component of the date for the data in the scope |
 **month** | **Integer**| The month component of the date for the data in the scope |
 **day** | **Integer**| The day component of the date for the data in the scope |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**AnalyticStore**](AnalyticStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listAnalyticStores"></a>
# **listAnalyticStores**
> ResourceListOfAnalyticStoreKey listAnalyticStores(asAt, sortBy, start, limit, filter)

List analytic stores

List all defined analytic stores

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.AnalyticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsStoresApi apiInstance = new AnalyticsStoresApi();
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfAnalyticStoreKey result = apiInstance.listAnalyticStores(asAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsStoresApi#listAnalyticStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfAnalyticStoreKey**](ResourceListOfAnalyticStoreKey.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="setAnalytics"></a>
# **setAnalytics**
> AnalyticStore setAnalytics(scope, year, month, day, data)

Set analytic data

Store the complete set of analytics for an existing analytic store for the specified scope and date

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.AnalyticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsStoresApi apiInstance = new AnalyticsStoresApi();
String scope = "scope_example"; // String | The scope of the data being stored
Integer year = 56; // Integer | The year component of the date for the data
Integer month = 56; // Integer | The month component of the date for the data
Integer day = 56; // Integer | The day component of the date for the data
List<InstrumentAnalytic> data = Arrays.asList(new InstrumentAnalytic()); // List<InstrumentAnalytic> | The analytic data being inserted
try {
    AnalyticStore result = apiInstance.setAnalytics(scope, year, month, day, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsStoresApi#setAnalytics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data being stored |
 **year** | **Integer**| The year component of the date for the data |
 **month** | **Integer**| The month component of the date for the data |
 **day** | **Integer**| The day component of the date for the data |
 **data** | [**List&lt;InstrumentAnalytic&gt;**](InstrumentAnalytic.md)| The analytic data being inserted | [optional]

### Return type

[**AnalyticStore**](AnalyticStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

