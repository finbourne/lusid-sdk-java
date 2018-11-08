# PersonalisationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePersonalisation**](PersonalisationsApi.md#deletePersonalisation) | **DELETE** /api/personalisations | Delete a personalisation
[**getPersonalisations**](PersonalisationsApi.md#getPersonalisations) | **GET** /api/personalisations | Get personalisation
[**upsertPersonalisations**](PersonalisationsApi.md#upsertPersonalisations) | **POST** /api/personalisations | Upsert personalisations


<a name="deletePersonalisation"></a>
# **deletePersonalisation**
> DeletedEntityResponse deletePersonalisation(key, scope, group)

Delete a personalisation

Delete a personalisation at a specific scope (or use scope ALL to purge the setting entirely)

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PersonalisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PersonalisationsApi apiInstance = new PersonalisationsApi();
String key = "key_example"; // String | The key of the setting to be deleted
String scope = "scope_example"; // String | The scope to delete at (use ALL to purge the setting entirely)
String group = "group_example"; // String | Optional. If deleting a setting at group level, specify the group here
try {
    DeletedEntityResponse result = apiInstance.deletePersonalisation(key, scope, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalisationsApi#deletePersonalisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The key of the setting to be deleted | [optional]
 **scope** | **String**| The scope to delete at (use ALL to purge the setting entirely) | [optional] [enum: User, Group, Default, All]
 **group** | **String**| Optional. If deleting a setting at group level, specify the group here | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPersonalisations"></a>
# **getPersonalisations**
> ResourceListOfPersonalisation getPersonalisations(pattern, scope, recursive, wildcards, sortBy, start, limit)

Get personalisation

Get a personalisation, recursing to get any referenced if required.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PersonalisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PersonalisationsApi apiInstance = new PersonalisationsApi();
String pattern = "pattern_example"; // String | The search pattern or specific key
String scope = "scope_example"; // String | Optional. The scope level to request for
Boolean recursive = false; // Boolean | Optional. Whether to recurse into dereference recursive settings
Boolean wildcards = false; // Boolean | Optional. Whether to apply wildcards to the provided pattern and pull back any matching
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
try {
    ResourceListOfPersonalisation result = apiInstance.getPersonalisations(pattern, scope, recursive, wildcards, sortBy, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalisationsApi#getPersonalisations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **String**| The search pattern or specific key | [optional]
 **scope** | **String**| Optional. The scope level to request for | [optional] [enum: User, Group, Default, All]
 **recursive** | **Boolean**| Optional. Whether to recurse into dereference recursive settings | [optional] [default to false]
 **wildcards** | **Boolean**| Optional. Whether to apply wildcards to the provided pattern and pull back any matching | [optional] [default to false]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]

### Return type

[**ResourceListOfPersonalisation**](ResourceListOfPersonalisation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertPersonalisations"></a>
# **upsertPersonalisations**
> UpsertPersonalisationResponse upsertPersonalisations(personalisations)

Upsert personalisations

Upsert one or more personalisations

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PersonalisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PersonalisationsApi apiInstance = new PersonalisationsApi();
List<Personalisation> personalisations = Arrays.asList(new Personalisation()); // List<Personalisation> | The set of personalisations to persist
try {
    UpsertPersonalisationResponse result = apiInstance.upsertPersonalisations(personalisations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalisationsApi#upsertPersonalisations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personalisations** | [**List&lt;Personalisation&gt;**](Personalisation.md)| The set of personalisations to persist | [optional]

### Return type

[**UpsertPersonalisationResponse**](UpsertPersonalisationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

