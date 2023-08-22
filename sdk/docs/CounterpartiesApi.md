# CounterpartiesApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCounterpartyAgreement**](CounterpartiesApi.md#deleteCounterpartyAgreement) | **DELETE** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] DeleteCounterpartyAgreement: Delete the Counterparty Agreement of given scope and code |
| [**deleteCreditSupportAnnex**](CounterpartiesApi.md#deleteCreditSupportAnnex) | **DELETE** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] DeleteCreditSupportAnnex: Delete the Credit Support Annex of given scope and code |
| [**getCounterpartyAgreement**](CounterpartiesApi.md#getCounterpartyAgreement) | **GET** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] GetCounterpartyAgreement: Get Counterparty Agreement |
| [**getCreditSupportAnnex**](CounterpartiesApi.md#getCreditSupportAnnex) | **GET** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] GetCreditSupportAnnex: Get Credit Support Annex |
| [**listCounterpartyAgreements**](CounterpartiesApi.md#listCounterpartyAgreements) | **GET** /api/counterparties/counterpartyagreements | [EARLY ACCESS] ListCounterpartyAgreements: List the set of Counterparty Agreements |
| [**listCreditSupportAnnexes**](CounterpartiesApi.md#listCreditSupportAnnexes) | **GET** /api/counterparties/creditsupportannexes | [EARLY ACCESS] ListCreditSupportAnnexes: List the set of Credit Support Annexes |
| [**upsertCounterpartyAgreement**](CounterpartiesApi.md#upsertCounterpartyAgreement) | **POST** /api/counterparties/counterpartyagreements | [EARLY ACCESS] UpsertCounterpartyAgreement: Upsert Counterparty Agreement |
| [**upsertCreditSupportAnnex**](CounterpartiesApi.md#upsertCreditSupportAnnex) | **POST** /api/counterparties/creditsupportannexes | [EARLY ACCESS] UpsertCreditSupportAnnex: Upsert Credit Support Annex |


<a id="deleteCounterpartyAgreement"></a>
# **deleteCounterpartyAgreement**
> AnnulSingleStructuredDataResponse deleteCounterpartyAgreement(scope, code)

[EARLY ACCESS] DeleteCounterpartyAgreement: Delete the Counterparty Agreement of given scope and code

Delete the specified Counterparty Agreement from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.                It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Counterparty Agreement to delete.
    String code = "code_example"; // String | The Counterparty Agreement to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteCounterpartyAgreement(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#deleteCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Counterparty Agreement to delete. | |
| **code** | **String**| The Counterparty Agreement to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteCreditSupportAnnex"></a>
# **deleteCreditSupportAnnex**
> AnnulSingleStructuredDataResponse deleteCreditSupportAnnex(scope, code)

[EARLY ACCESS] DeleteCreditSupportAnnex: Delete the Credit Support Annex of given scope and code

Delete the specified Credit Support Annex from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.                It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Credit Support Annex to delete.
    String code = "code_example"; // String | The Credit Support Annex to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteCreditSupportAnnex(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#deleteCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Credit Support Annex to delete. | |
| **code** | **String**| The Credit Support Annex to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCounterpartyAgreement"></a>
# **getCounterpartyAgreement**
> GetCounterpartyAgreementResponse getCounterpartyAgreement(scope, code, asAt)

[EARLY ACCESS] GetCounterpartyAgreement: Get Counterparty Agreement

Get a Counterparty Agreement from a single scope.  The response will return either the Counterparty Agreement that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Counterparty Agreement to retrieve.
    String code = "code_example"; // String | The name of the Counterparty Agreement to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified.
    try {
      GetCounterpartyAgreementResponse result = apiInstance.getCounterpartyAgreement(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#getCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Counterparty Agreement to retrieve. | |
| **code** | **String**| The name of the Counterparty Agreement to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetCounterpartyAgreementResponse**](GetCounterpartyAgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Counterparty Agreement or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCreditSupportAnnex"></a>
# **getCreditSupportAnnex**
> GetCreditSupportAnnexResponse getCreditSupportAnnex(scope, code, asAt)

[EARLY ACCESS] GetCreditSupportAnnex: Get Credit Support Annex

Get a Credit Support Annex from a single scope.  The response will return either the Credit Support Annex that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Credit Support Annex to retrieve.
    String code = "code_example"; // String | The name of the Credit Support Annex to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified.
    try {
      GetCreditSupportAnnexResponse result = apiInstance.getCreditSupportAnnex(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#getCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Credit Support Annex to retrieve. | |
| **code** | **String**| The name of the Credit Support Annex to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetCreditSupportAnnexResponse**](GetCreditSupportAnnexResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved credit support annexes or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCounterpartyAgreements"></a>
# **listCounterpartyAgreements**
> ResourceListOfGetCounterpartyAgreementResponse listCounterpartyAgreements(asAt)

[EARLY ACCESS] ListCounterpartyAgreements: List the set of Counterparty Agreements

List the set of Counterparty Agreements at the specified AsAt date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified.
    try {
      ResourceListOfGetCounterpartyAgreementResponse result = apiInstance.listCounterpartyAgreements(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#listCounterpartyAgreements");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetCounterpartyAgreementResponse**](ResourceListOfGetCounterpartyAgreementResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Counterparty Agreements |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCreditSupportAnnexes"></a>
# **listCreditSupportAnnexes**
> ResourceListOfGetCreditSupportAnnexResponse listCreditSupportAnnexes(asAt)

[EARLY ACCESS] ListCreditSupportAnnexes: List the set of Credit Support Annexes

List the set of Credit Support Annexes at the specified AsAt date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified.
    try {
      ResourceListOfGetCreditSupportAnnexResponse result = apiInstance.listCreditSupportAnnexes(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#listCreditSupportAnnexes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetCreditSupportAnnexResponse**](ResourceListOfGetCreditSupportAnnexResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Credit Support Annexes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCounterpartyAgreement"></a>
# **upsertCounterpartyAgreement**
> UpsertSingleStructuredDataResponse upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest)

[EARLY ACCESS] UpsertCounterpartyAgreement: Upsert Counterparty Agreement

Update or insert Counterparty Agreement in a single scope. An item will be updated if it already exists and inserted if it does not.                The response will return the successfully updated or inserted Counterparty Agreement or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    UpsertCounterpartyAgreementRequest upsertCounterpartyAgreementRequest = new UpsertCounterpartyAgreementRequest(); // UpsertCounterpartyAgreementRequest | The Counterparty Agreement to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#upsertCounterpartyAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertCounterpartyAgreementRequest** | [**UpsertCounterpartyAgreementRequest**](UpsertCounterpartyAgreementRequest.md)| The Counterparty Agreement to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted Counterparty Agreement or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCreditSupportAnnex"></a>
# **upsertCreditSupportAnnex**
> UpsertSingleStructuredDataResponse upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest)

[EARLY ACCESS] UpsertCreditSupportAnnex: Upsert Credit Support Annex

Update or insert Credit Support Annex in a single scope. An item will be updated if it already exists and inserted if it does not.                The response will return the successfully updated or inserted Credit Support Annex or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CounterpartiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CounterpartiesApi apiInstance = new CounterpartiesApi(defaultClient);
    UpsertCreditSupportAnnexRequest upsertCreditSupportAnnexRequest = new UpsertCreditSupportAnnexRequest(); // UpsertCreditSupportAnnexRequest | The Credit Support Annex to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CounterpartiesApi#upsertCreditSupportAnnex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertCreditSupportAnnexRequest** | [**UpsertCreditSupportAnnexRequest**](UpsertCreditSupportAnnexRequest.md)| The Credit Support Annex to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

