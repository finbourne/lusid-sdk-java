# SystemConfigurationApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfigurationTransactionType**](SystemConfigurationApi.md#createConfigurationTransactionType) | **POST** /api/systemconfiguration/transactiontypes | [EARLY ACCESS] Create transaction type
[**listConfigurationTransactionTypes**](SystemConfigurationApi.md#listConfigurationTransactionTypes) | **GET** /api/systemconfiguration/transactiontypes | [EARLY ACCESS] List transaction types


<a name="createConfigurationTransactionType"></a>
# **createConfigurationTransactionType**
> ResourceListOfTransactionConfigurationData createConfigurationTransactionType(type)

[EARLY ACCESS] Create transaction type

Create a new transaction type by specifying a definition and the mappings to movements

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SystemConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SystemConfigurationApi apiInstance = new SystemConfigurationApi(defaultClient);
    TransactionConfigurationDataRequest type = new TransactionConfigurationDataRequest(); // TransactionConfigurationDataRequest | A transaction type definition
    try {
      ResourceListOfTransactionConfigurationData result = apiInstance.createConfigurationTransactionType(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemConfigurationApi#createConfigurationTransactionType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listConfigurationTransactionTypes"></a>
# **listConfigurationTransactionTypes**
> ResourceListOfTransactionConfigurationData listConfigurationTransactionTypes()

[EARLY ACCESS] List transaction types

Get the list of persisted transaction types

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SystemConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SystemConfigurationApi apiInstance = new SystemConfigurationApi(defaultClient);
    try {
      ResourceListOfTransactionConfigurationData result = apiInstance.listConfigurationTransactionTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemConfigurationApi#listConfigurationTransactionTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Error response |  -  |

