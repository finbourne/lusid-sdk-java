# PersonsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:53099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPersonRelations**](PersonsApi.md#getPersonRelations) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/relations | [DEPRECATED] Get Relations for Person


<a name="getPersonRelations"></a>
# **getPersonRelations**
> ResourceListOfRelation getPersonRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes)

[DEPRECATED] Get Relations for Person

Get relations for the specified person.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PersonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:53099");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the person's relations. Defaults to return the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter the relations. Users should provide null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". They must be from the \"Person\" or \"LegalEntity\" domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array.
    try {
      ResourceListOfRelation result = apiInstance.getPersonRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPersonRelations");
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
 **idTypeScope** | **String**| Scope of the person identifier type. |
 **idTypeCode** | **String**| Code of the person identifier type. |
 **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. | [optional]
 **filter** | **String**| Expression to filter the relations. Users should provide null or empty string for this field until further notice. | [optional]
 **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. | [optional]

### Return type

[**ResourceListOfRelation**](ResourceListOfRelation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The relations for the specified person. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

