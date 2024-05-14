# PropertyDefinitionsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDerivedPropertyDefinition**](PropertyDefinitionsApi.md#createDerivedPropertyDefinition) | **POST** /api/propertydefinitions/derived | [EARLY ACCESS] CreateDerivedPropertyDefinition: Create derived property definition |
| [**createPropertyDefinition**](PropertyDefinitionsApi.md#createPropertyDefinition) | **POST** /api/propertydefinitions | CreatePropertyDefinition: Create property definition |
| [**deletePropertyDefinition**](PropertyDefinitionsApi.md#deletePropertyDefinition) | **DELETE** /api/propertydefinitions/{domain}/{scope}/{code} | DeletePropertyDefinition: Delete property definition |
| [**deletePropertyDefinitionProperties**](PropertyDefinitionsApi.md#deletePropertyDefinitionProperties) | **POST** /api/propertydefinitions/{domain}/{scope}/{code}/properties/$delete | [EARLY ACCESS] DeletePropertyDefinitionProperties: Delete property definition properties |
| [**getMultiplePropertyDefinitions**](PropertyDefinitionsApi.md#getMultiplePropertyDefinitions) | **GET** /api/propertydefinitions | GetMultiplePropertyDefinitions: Get multiple property definitions |
| [**getPropertyDefinition**](PropertyDefinitionsApi.md#getPropertyDefinition) | **GET** /api/propertydefinitions/{domain}/{scope}/{code} | GetPropertyDefinition: Get property definition |
| [**getPropertyDefinitionPropertyTimeSeries**](PropertyDefinitionsApi.md#getPropertyDefinitionPropertyTimeSeries) | **GET** /api/propertydefinitions/{domain}/{scope}/{code}/properties/time-series | [EARLY ACCESS] GetPropertyDefinitionPropertyTimeSeries: Get Property Definition Property Time Series |
| [**listPropertyDefinitions**](PropertyDefinitionsApi.md#listPropertyDefinitions) | **GET** /api/propertydefinitions/$list | ListPropertyDefinitions: List property definitions |
| [**updateDerivedPropertyDefinition**](PropertyDefinitionsApi.md#updateDerivedPropertyDefinition) | **PUT** /api/propertydefinitions/derived/{domain}/{scope}/{code} | [EARLY ACCESS] UpdateDerivedPropertyDefinition: Update a pre-existing derived property definition |
| [**updatePropertyDefinition**](PropertyDefinitionsApi.md#updatePropertyDefinition) | **PUT** /api/propertydefinitions/{domain}/{scope}/{code} | UpdatePropertyDefinition: Update property definition |
| [**upsertPropertyDefinitionProperties**](PropertyDefinitionsApi.md#upsertPropertyDefinitionProperties) | **POST** /api/propertydefinitions/{domain}/{scope}/{code}/properties | [EARLY ACCESS] UpsertPropertyDefinitionProperties: Upsert properties to a property definition |


<a id="createDerivedPropertyDefinition"></a>
# **createDerivedPropertyDefinition**
> PropertyDefinition createDerivedPropertyDefinition(createDerivedPropertyDefinitionRequest).execute();

[EARLY ACCESS] CreateDerivedPropertyDefinition: Create derived property definition

Define a new derived property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    CreateDerivedPropertyDefinitionRequest createDerivedPropertyDefinitionRequest = new CreateDerivedPropertyDefinitionRequest(); // CreateDerivedPropertyDefinitionRequest | The definition of the new derived property.
    try {
      PropertyDefinition result = apiInstance.createDerivedPropertyDefinition(createDerivedPropertyDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#createDerivedPropertyDefinition");
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
| **createDerivedPropertyDefinitionRequest** | [**CreateDerivedPropertyDefinitionRequest**](CreateDerivedPropertyDefinitionRequest.md)| The definition of the new derived property. | |

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created derived property definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createPropertyDefinition"></a>
# **createPropertyDefinition**
> PropertyDefinition createPropertyDefinition(createPropertyDefinitionRequest).execute();

CreatePropertyDefinition: Create property definition

Define a new property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    CreatePropertyDefinitionRequest createPropertyDefinitionRequest = new CreatePropertyDefinitionRequest(); // CreatePropertyDefinitionRequest | The definition of the new property.
    try {
      PropertyDefinition result = apiInstance.createPropertyDefinition(createPropertyDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#createPropertyDefinition");
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
| **createPropertyDefinitionRequest** | [**CreatePropertyDefinitionRequest**](CreatePropertyDefinitionRequest.md)| The definition of the new property. | |

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created property definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePropertyDefinition"></a>
# **deletePropertyDefinition**
> DeletedEntityResponse deletePropertyDefinition(domain, scope, code).execute();

DeletePropertyDefinition: Delete property definition

Delete the definition of the specified property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the property to be deleted.
    String scope = "scope_example"; // String | The scope of the property to be deleted.
    String code = "code_example"; // String | The code of the property to be deleted. Together with the domain and scope this uniquely   identifies the property.
    try {
      DeletedEntityResponse result = apiInstance.deletePropertyDefinition(domain, scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#deletePropertyDefinition");
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
| **domain** | **String**| The domain of the property to be deleted. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the property to be deleted. | |
| **code** | **String**| The code of the property to be deleted. Together with the domain and scope this uniquely   identifies the property. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time that the property definition was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePropertyDefinitionProperties"></a>
# **deletePropertyDefinitionProperties**
> DeletedEntityResponse deletePropertyDefinitionProperties(domain, scope, code, requestBody).effectiveAt(effectiveAt).execute();

[EARLY ACCESS] DeletePropertyDefinitionProperties: Delete property definition properties

Delete one or more properties from a single property definition. If the properties are time-variant then an effective date time from which the  properties will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the property definition to delete properties from.
    String scope = "scope_example"; // String | The scope of the property definition to delete properties from.
    String code = "code_example"; // String | The code of the property definition to delete properties from.
    List<String> requestBody = ["PropertyDefinition/MyScope/MyPropertyName","PropertyDefinition/MyScope/MyPropertyName2"]; // List<String> | The property keys of the properties to delete. These must take the format   {domain}/{scope}/{code} e.g \"PropertyDefinition/myScope/someAttributeKey\". Each property must be from the \"PropertyDefinition\" domain.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is before   the time-variant property exists then a failure is returned. Do not specify this parameter if an of the properties to delete are perpetual.
    try {
      DeletedEntityResponse result = apiInstance.deletePropertyDefinitionProperties(domain, scope, code, requestBody)
            .effectiveAt(effectiveAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#deletePropertyDefinitionProperties");
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
| **domain** | **String**| The domain of the property definition to delete properties from. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the property definition to delete properties from. | |
| **code** | **String**| The code of the property definition to delete properties from. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These must take the format   {domain}/{scope}/{code} e.g \&quot;PropertyDefinition/myScope/someAttributeKey\&quot;. Each property must be from the \&quot;PropertyDefinition\&quot; domain. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is before   the time-variant property exists then a failure is returned. Do not specify this parameter if an of the properties to delete are perpetual. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the properties were deleted from the specified definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getMultiplePropertyDefinitions"></a>
# **getMultiplePropertyDefinitions**
> ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(propertyKeys).asAt(asAt).filter(filter).effectiveAt(effectiveAt).execute();

GetMultiplePropertyDefinitions: Get multiple property definitions

Retrieve the definition of one or more specified properties.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    List<String> propertyKeys = Arrays.asList(); // List<String> | One or more property keys which identify each property that a definition should   be retrieved for. The format for each property key is {domain}/{scope}/{code}, e.g. 'Portfolio/Manager/Id'.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the property definitions. Defaults to return   the latest version of each definition if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.    For example, to filter on the Lifetime, use \"lifeTime eq 'Perpetual'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list properties attached to the Property Definition.   Defaults to the current LUSID system datetime if not specified.
    try {
      ResourceListOfPropertyDefinition result = apiInstance.getMultiplePropertyDefinitions(propertyKeys)
            .asAt(asAt)
            .filter(filter)
            .effectiveAt(effectiveAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#getMultiplePropertyDefinitions");
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
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| One or more property keys which identify each property that a definition should   be retrieved for. The format for each property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the property definitions. Defaults to return   the latest version of each definition if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    For example, to filter on the Lifetime, use \&quot;lifeTime eq &#39;Perpetual&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list properties attached to the Property Definition.   Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**ResourceListOfPropertyDefinition**](ResourceListOfPropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested property definitions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPropertyDefinition"></a>
# **getPropertyDefinition**
> PropertyDefinition getPropertyDefinition(domain, scope, code).asAt(asAt).effectiveAt(effectiveAt).execute();

GetPropertyDefinition: Get property definition

Retrieve the definition of a specified property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the specified property.
    String scope = "scope_example"; // String | The scope of the specified property.
    String code = "code_example"; // String | The code of the specified property. Together with the domain and scope this uniquely   identifies the property.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the property definition. Defaults to return   the latest version of the definition if not specified.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list properties attached to the Property Definition.   Defaults to the current LUSID system datetime if not specified.
    try {
      PropertyDefinition result = apiInstance.getPropertyDefinition(domain, scope, code)
            .asAt(asAt)
            .effectiveAt(effectiveAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#getPropertyDefinition");
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
| **domain** | **String**| The domain of the specified property. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the specified property. | |
| **code** | **String**| The code of the specified property. Together with the domain and scope this uniquely   identifies the property. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the property definition. Defaults to return   the latest version of the definition if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list properties attached to the Property Definition.   Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested property definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPropertyDefinitionPropertyTimeSeries"></a>
# **getPropertyDefinitionPropertyTimeSeries**
> ResourceListOfPropertyInterval getPropertyDefinitionPropertyTimeSeries(domain, scope, code, propertyKey).asAt(asAt).filter(filter).page(page).limit(limit).execute();

[EARLY ACCESS] GetPropertyDefinitionPropertyTimeSeries: Get Property Definition Property Time Series

List the complete time series of a property definition property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the property definition to which the property is attached
    String scope = "scope_example"; // String | The scope of the property definition to which the property is attached
    String code = "code_example"; // String | The code of the property definition to which the property is attached
    String propertyKey = "propertyKey_example"; // String | The property key of the property whose history to show. This must be from the \"Property Definition\" domain and in the format   {domain}/{scope}/{code}, for example \"PropertyDefinition/myScope/someAttributeKey\".
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to show the history. Defaults to the current datetime if not specified.
    String filter = "filter_example"; // String | Expression to filter the results. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String page = "page_example"; // String | The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    try {
      ResourceListOfPropertyInterval result = apiInstance.getPropertyDefinitionPropertyTimeSeries(domain, scope, code, propertyKey)
            .asAt(asAt)
            .filter(filter)
            .page(page)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#getPropertyDefinitionPropertyTimeSeries");
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
| **domain** | **String**| The domain of the property definition to which the property is attached | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the property definition to which the property is attached | |
| **code** | **String**| The code of the property definition to which the property is attached | |
| **propertyKey** | **String**| The property key of the property whose history to show. This must be from the \&quot;Property Definition\&quot; domain and in the format   {domain}/{scope}/{code}, for example \&quot;PropertyDefinition/myScope/someAttributeKey\&quot;. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to show the history. Defaults to the current datetime if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfPropertyInterval**](ResourceListOfPropertyInterval.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPropertyDefinitions"></a>
# **listPropertyDefinitions**
> PagedResourceListOfPropertyDefinition listPropertyDefinitions().effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

ListPropertyDefinitions: List property definitions

List all the property definitions matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the property definitions. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the property definitions. Defaults to returning the latest version   of each property definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Property Definition' domain to decorate onto   property definitions. These must take the format   {domain}/{scope}/{code} e.g \"PropertyDefinition/myScope/someAttributeKey\". Each property must be from the \"PropertyDefinition\" domain.
    String page = "page_example"; // String | The pagination token to use to continue listing property definitions; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the display name, specify \"DisplayName eq 'DisplayName'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfPropertyDefinition result = apiInstance.listPropertyDefinitions()
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#listPropertyDefinitions");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the property definitions. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the property definitions. Defaults to returning the latest version   of each property definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Property Definition&#39; domain to decorate onto   property definitions. These must take the format   {domain}/{scope}/{code} e.g \&quot;PropertyDefinition/myScope/someAttributeKey\&quot;. Each property must be from the \&quot;PropertyDefinition\&quot; domain. | [optional] |
| **page** | **String**| The pagination token to use to continue listing property definitions; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the display name, specify \&quot;DisplayName eq &#39;DisplayName&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfPropertyDefinition**](PagedResourceListOfPropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolios |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateDerivedPropertyDefinition"></a>
# **updateDerivedPropertyDefinition**
> PropertyDefinition updateDerivedPropertyDefinition(domain, scope, code, updateDerivedPropertyDefinitionRequest).execute();

[EARLY ACCESS] UpdateDerivedPropertyDefinition: Update a pre-existing derived property definition

This will fail if the property definition does not exist

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | Domain of the property definition
    String scope = "scope_example"; // String | Scope of the property definition
    String code = "code_example"; // String | Code of the property definition
    UpdateDerivedPropertyDefinitionRequest updateDerivedPropertyDefinitionRequest = new UpdateDerivedPropertyDefinitionRequest(); // UpdateDerivedPropertyDefinitionRequest | Information about the derived property definition being updated
    try {
      PropertyDefinition result = apiInstance.updateDerivedPropertyDefinition(domain, scope, code, updateDerivedPropertyDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#updateDerivedPropertyDefinition");
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
| **domain** | **String**| Domain of the property definition | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| Scope of the property definition | |
| **code** | **String**| Code of the property definition | |
| **updateDerivedPropertyDefinitionRequest** | [**UpdateDerivedPropertyDefinitionRequest**](UpdateDerivedPropertyDefinitionRequest.md)| Information about the derived property definition being updated | |

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated derived property definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updatePropertyDefinition"></a>
# **updatePropertyDefinition**
> PropertyDefinition updatePropertyDefinition(domain, scope, code, updatePropertyDefinitionRequest).execute();

UpdatePropertyDefinition: Update property definition

Update the definition of a specified existing property. Not all elements within a property definition  are modifiable due to the potential implications for values already stored against the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the property being updated.
    String scope = "scope_example"; // String | The scope of the property being updated.
    String code = "code_example"; // String | The code of the property being updated. Together with the domain and scope this uniquely   identifies the property.
    UpdatePropertyDefinitionRequest updatePropertyDefinitionRequest = new UpdatePropertyDefinitionRequest(); // UpdatePropertyDefinitionRequest | The updated definition of the property.
    try {
      PropertyDefinition result = apiInstance.updatePropertyDefinition(domain, scope, code, updatePropertyDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#updatePropertyDefinition");
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
| **domain** | **String**| The domain of the property being updated. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the property being updated. | |
| **code** | **String**| The code of the property being updated. Together with the domain and scope this uniquely   identifies the property. | |
| **updatePropertyDefinitionRequest** | [**UpdatePropertyDefinitionRequest**](UpdatePropertyDefinitionRequest.md)| The updated definition of the property. | |

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated property definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertPropertyDefinitionProperties"></a>
# **upsertPropertyDefinitionProperties**
> BatchUpsertPropertyDefinitionPropertiesResponse upsertPropertyDefinitionProperties(domain, scope, code, requestBody).successMode(successMode).execute();

[EARLY ACCESS] UpsertPropertyDefinitionProperties: Upsert properties to a property definition

Create or update properties for a particular property definition

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PropertyDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi(defaultClient);
    String domain = "NotDefined"; // String | The domain of the specified property.
    String scope = "scope_example"; // String | The scope of the specified property.
    String code = "code_example"; // String | The code of the specified property. Together with the domain and scope this uniquely
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be created or updated. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example   'PropertyDefinition/Manager/Id'.
    String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.
    try {
      BatchUpsertPropertyDefinitionPropertiesResponse result = apiInstance.upsertPropertyDefinitionProperties(domain, scope, code, requestBody)
            .successMode(successMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyDefinitionsApi#upsertPropertyDefinitionProperties");
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
| **domain** | **String**| The domain of the specified property. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation] |
| **scope** | **String**| The scope of the specified property. | |
| **code** | **String**| The code of the specified property. Together with the domain and scope this uniquely | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be created or updated. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example   &#39;PropertyDefinition/Manager/Id&#39;. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. | [optional] [default to Partial] |

### Return type

[**BatchUpsertPropertyDefinitionPropertiesResponse**](BatchUpsertPropertyDefinitionPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asAt datetime at which the properties were updated or created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

