# SystemConfigurationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfigurationTransactionType**](SystemConfigurationApi.md#createConfigurationTransactionType) | **POST** /api/systemconfiguration/transactiontypes | Create transaction type
[**listConfigurationTransactionTypes**](SystemConfigurationApi.md#listConfigurationTransactionTypes) | **GET** /api/systemconfiguration/transactiontypes | List transaction types
[**setConfigurationTransactionTypes**](SystemConfigurationApi.md#setConfigurationTransactionTypes) | **PUT** /api/systemconfiguration/transactiontypes | Set transaction types


<a name="createConfigurationTransactionType"></a>
# **createConfigurationTransactionType**
> ResourceListOfTransactionConfigurationData createConfigurationTransactionType(type)

Create transaction type

Create a new transaction type by specifying a definition and the mappings to movements

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SystemConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemConfigurationApi apiInstance = new SystemConfigurationApi();
TransactionConfigurationDataRequest type = new TransactionConfigurationDataRequest(); // TransactionConfigurationDataRequest | A transaction type definition
try {
    ResourceListOfTransactionConfigurationData result = apiInstance.createConfigurationTransactionType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemConfigurationApi#createConfigurationTransactionType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**TransactionConfigurationDataRequest**](TransactionConfigurationDataRequest.md)| A transaction type definition | [optional]

### Return type

[**ResourceListOfTransactionConfigurationData**](ResourceListOfTransactionConfigurationData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listConfigurationTransactionTypes"></a>
# **listConfigurationTransactionTypes**
> ResourceListOfTransactionConfigurationData listConfigurationTransactionTypes()

List transaction types

Get the list of persisted transaction types

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SystemConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemConfigurationApi apiInstance = new SystemConfigurationApi();
try {
    ResourceListOfTransactionConfigurationData result = apiInstance.listConfigurationTransactionTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemConfigurationApi#listConfigurationTransactionTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfTransactionConfigurationData**](ResourceListOfTransactionConfigurationData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="setConfigurationTransactionTypes"></a>
# **setConfigurationTransactionTypes**
> ResourceListOfTransactionConfigurationData setConfigurationTransactionTypes(types)

Set transaction types

Set all transaction types to be used by the movements engine, for the organisation                WARNING! Changing these mappings will have a material impact on how data, new and old, is processed and aggregated by LUSID. This will affect your whole organisation. Only change if you are fully aware of the implications of the change.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SystemConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemConfigurationApi apiInstance = new SystemConfigurationApi();
List<TransactionConfigurationDataRequest> types = Arrays.asList(new TransactionConfigurationDataRequest()); // List<TransactionConfigurationDataRequest> | The complete set of transaction type definitions
try {
    ResourceListOfTransactionConfigurationData result = apiInstance.setConfigurationTransactionTypes(types);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemConfigurationApi#setConfigurationTransactionTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | [**List&lt;TransactionConfigurationDataRequest&gt;**](TransactionConfigurationDataRequest.md)| The complete set of transaction type definitions | [optional]

### Return type

[**ResourceListOfTransactionConfigurationData**](ResourceListOfTransactionConfigurationData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

