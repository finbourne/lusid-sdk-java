# ApplicationMetadataApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExcelAddin**](ApplicationMetadataApi.md#getExcelAddin) | **GET** /api/metadata/downloads/exceladdin | Download Excel Addin
[**getExcelDownloadUrl**](ApplicationMetadataApi.md#getExcelDownloadUrl) | **GET** /api/metadata/downloads/excel | Get Excel download url
[**getLusidVersions**](ApplicationMetadataApi.md#getLusidVersions) | **GET** /api/metadata/versions | Get LUSID versions


<a name="getExcelAddin"></a>
# **getExcelAddin**
> FileResponse getExcelAddin(version)

Download Excel Addin

Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ApplicationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApplicationMetadataApi apiInstance = new ApplicationMetadataApi();
String version = "version_example"; // String | The requested version of the Excel plugin
try {
    FileResponse result = apiInstance.getExcelAddin(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationMetadataApi#getExcelAddin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The requested version of the Excel plugin | [optional]

### Return type

[**FileResponse**](FileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getExcelDownloadUrl"></a>
# **getExcelDownloadUrl**
> String getExcelDownloadUrl(version)

Get Excel download url

Request an authorised url for an Excel client version

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ApplicationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApplicationMetadataApi apiInstance = new ApplicationMetadataApi();
String version = "version_example"; // String | The requested version of the Excel plugin
try {
    String result = apiInstance.getExcelDownloadUrl(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationMetadataApi#getExcelDownloadUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The requested version of the Excel plugin | [optional]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getLusidVersions"></a>
# **getLusidVersions**
> VersionSummaryDto getLusidVersions()

Get LUSID versions

Get the semantic versions associated with LUSID and its ecosystem

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ApplicationMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApplicationMetadataApi apiInstance = new ApplicationMetadataApi();
try {
    VersionSummaryDto result = apiInstance.getLusidVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationMetadataApi#getLusidVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VersionSummaryDto**](VersionSummaryDto.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

