# ApplicationMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExcelAddin**](ApplicationMetadataApi.md#getExcelAddin) | **GET** /api/metadata/downloads/exceladdin | [EARLY ACCESS] Download Excel Addin
[**getLusidVersions**](ApplicationMetadataApi.md#getLusidVersions) | **GET** /api/metadata/versions | [EARLY ACCESS] Get LUSID versions
[**listAccessControlledResources**](ApplicationMetadataApi.md#listAccessControlledResources) | **GET** /api/metadata/access/resources | [EARLY ACCESS] Get resources available for access control


<a name="getExcelAddin"></a>
# **getExcelAddin**
> FileResponse getExcelAddin(version)

[EARLY ACCESS] Download Excel Addin

Download the LUSID Excel Addin for Microsoft Excel. Not providing a specific value will return the latest version being returned

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    String version = "version_example"; // String | The requested version of the Excel plugin
    try {
      FileResponse result = apiInstance.getExcelAddin(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#getExcelAddin");
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
 **version** | **String**| The requested version of the Excel plugin | [optional]

### Return type

[**FileResponse**](FileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getLusidVersions"></a>
# **getLusidVersions**
> VersionSummaryDto getLusidVersions()

[EARLY ACCESS] Get LUSID versions

Get the semantic versions associated with LUSID and its ecosystem

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    try {
      VersionSummaryDto result = apiInstance.getLusidVersions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#getLusidVersions");
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

[**VersionSummaryDto**](VersionSummaryDto.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of versions associated with LUSID |  -  |
**0** | Error response |  -  |

<a name="listAccessControlledResources"></a>
# **listAccessControlledResources**
> ResourceListOfAccessControlledResource listAccessControlledResources(filter)

[EARLY ACCESS] Get resources available for access control

Get the comprehensive set of resources that are available for access control

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#listAccessControlledResources");
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
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

