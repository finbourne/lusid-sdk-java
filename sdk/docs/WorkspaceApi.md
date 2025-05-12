# WorkspaceApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItem**](WorkspaceApi.md#createItem) | **POST** /api/workspaces/{visibility}/{workspaceName}/items | [EXPERIMENTAL] CreateItem: Create a new item in a workspace. |
| [**createWorkspace**](WorkspaceApi.md#createWorkspace) | **POST** /api/workspaces/{visibility} | [EXPERIMENTAL] CreateWorkspace: Create a new workspace. |
| [**deleteItem**](WorkspaceApi.md#deleteItem) | **DELETE** /api/workspaces/{visibility}/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] DeleteItem: Delete an item from a workspace. |
| [**deleteWorkspace**](WorkspaceApi.md#deleteWorkspace) | **DELETE** /api/workspaces/{visibility}/{workspaceName} | [EXPERIMENTAL] DeleteWorkspace: Delete a workspace. |
| [**getItem**](WorkspaceApi.md#getItem) | **GET** /api/workspaces/{visibility}/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] GetItem: Get a single workspace item. |
| [**getWorkspace**](WorkspaceApi.md#getWorkspace) | **GET** /api/workspaces/{visibility}/{workspaceName} | [EXPERIMENTAL] GetWorkspace: Get a workspace. |
| [**listItems**](WorkspaceApi.md#listItems) | **GET** /api/workspaces/{visibility}/{workspaceName}/items | [EXPERIMENTAL] ListItems: List the items in a workspace. |
| [**listWorkspaces**](WorkspaceApi.md#listWorkspaces) | **GET** /api/workspaces/{visibility} | [EXPERIMENTAL] ListWorkspaces: List workspaces. |
| [**searchItems**](WorkspaceApi.md#searchItems) | **GET** /api/workspaces/{visibility}/items | [EXPERIMENTAL] SearchItems: List items across all workspaces. |
| [**updateItem**](WorkspaceApi.md#updateItem) | **PUT** /api/workspaces/{visibility}/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] UpdateItem: Update an item in a workspace. |
| [**updateWorkspace**](WorkspaceApi.md#updateWorkspace) | **PUT** /api/workspaces/{visibility}/{workspaceName} | [EXPERIMENTAL] UpdateWorkspace: Update a workspace. |



## createItem

> WorkspaceItem createItem(visibility, workspaceName, workspaceItemCreationRequest)

[EXPERIMENTAL] CreateItem: Create a new item in a workspace.

Create a new item in a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        WorkspaceItemCreationRequest workspaceItemCreationRequest = new WorkspaceItemCreationRequest(); // WorkspaceItemCreationRequest | The item to be created.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.createItem(visibility, workspaceName, workspaceItemCreationRequest).execute(opts);

            WorkspaceItem result = apiInstance.createItem(visibility, workspaceName, workspaceItemCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The item&#39;s workspace name. | |
| **workspaceItemCreationRequest** | [**WorkspaceItemCreationRequest**](WorkspaceItemCreationRequest.md)| The item to be created. | [optional] |

### Return type

[**WorkspaceItem**](WorkspaceItem.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The workspace item created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createWorkspace

> Workspace createWorkspace(visibility, workspaceCreationRequest)

[EXPERIMENTAL] CreateWorkspace: Create a new workspace.

Create a new workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the workspace being created. Must be `shared` or `personal`; case is important.
        WorkspaceCreationRequest workspaceCreationRequest = new WorkspaceCreationRequest(); // WorkspaceCreationRequest | The workspace to be created.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.createWorkspace(visibility, workspaceCreationRequest).execute(opts);

            Workspace result = apiInstance.createWorkspace(visibility, workspaceCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createWorkspace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the workspace being created. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceCreationRequest** | [**WorkspaceCreationRequest**](WorkspaceCreationRequest.md)| The workspace to be created. | [optional] |

### Return type

[**Workspace**](Workspace.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The workspace created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteItem

> DeletedEntityResponse deleteItem(visibility, workspaceName, groupName, itemName)

[EXPERIMENTAL] DeleteItem: Delete an item from a workspace.

Delete an item from a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The name of the workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteItem(visibility, workspaceName, groupName, itemName).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteItem(visibility, workspaceName, groupName, itemName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deleteItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The name of the workspace. | |
| **groupName** | **String**| The group containing the item. | |
| **itemName** | **String**| The name of the item. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The result of deleting a workspace item. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteWorkspace

> DeletedEntityResponse deleteWorkspace(visibility, workspaceName)

[EXPERIMENTAL] DeleteWorkspace: Delete a workspace.

Delete a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The name of the workspace.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteWorkspace(visibility, workspaceName).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteWorkspace(visibility, workspaceName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deleteWorkspace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The name of the workspace. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The result of deleting a workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getItem

> WorkspaceItem getItem(visibility, workspaceName, groupName, itemName, asAt)

[EXPERIMENTAL] GetItem: Get a single workspace item.

Get a single workspace item.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The name of the workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The datetime at which to request the workspace item. If not provided, defaults to 'latest'.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.getItem(visibility, workspaceName, groupName, itemName, asAt).execute(opts);

            WorkspaceItem result = apiInstance.getItem(visibility, workspaceName, groupName, itemName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The name of the workspace. | |
| **groupName** | **String**| The group containing the item. | |
| **itemName** | **String**| The name of the item. | |
| **asAt** | **OffsetDateTime**| The datetime at which to request the workspace item. If not provided, defaults to &#39;latest&#39;. | [optional] |

### Return type

[**WorkspaceItem**](WorkspaceItem.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspace item requested. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWorkspace

> Workspace getWorkspace(visibility, workspaceName, asAt)

[EXPERIMENTAL] GetWorkspace: Get a workspace.

Get a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.getWorkspace(visibility, workspaceName, asAt).execute(opts);

            Workspace result = apiInstance.getWorkspace(visibility, workspaceName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getWorkspace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The workspace name. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspaces. Defaults to &#39;latest&#39; if not specified. | [optional] |

### Return type

[**Workspace**](Workspace.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listItems

> PagedResourceListOfWorkspaceItem listItems(visibility, workspaceName, asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListItems: List the items in a workspace.

List the items in a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspace items. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspaceItem result = apiInstance.listItems(visibility, workspaceName, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspaceItem result = apiInstance.listItems(visibility, workspaceName, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The item&#39;s workspace name. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspace items. Defaults to &#39;latest&#39; if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfWorkspaceItem**](PagedResourceListOfWorkspaceItem.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The items in a workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listWorkspaces

> PagedResourceListOfWorkspace listWorkspaces(visibility, asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListWorkspaces: List workspaces.

List workspaces.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the workspaces. Must be `shared` or `personal`; case is important.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces from a previous call to list workspaces.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspace result = apiInstance.listWorkspaces(visibility, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspace result = apiInstance.listWorkspaces(visibility, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listWorkspaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the workspaces. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspaces. Defaults to &#39;latest&#39; if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing workspaces from a previous call to list workspaces.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfWorkspace**](PagedResourceListOfWorkspace.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspaces. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## searchItems

> PagedResourceListOfItemAndWorkspace searchItems(visibility, asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] SearchItems: List items across all workspaces.

List items across all workspaces.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspace items. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfItemAndWorkspace result = apiInstance.searchItems(visibility, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfItemAndWorkspace result = apiInstance.searchItems(visibility, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#searchItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspace items. Defaults to &#39;latest&#39; if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfItemAndWorkspace**](PagedResourceListOfItemAndWorkspace.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Items across all workspaces. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateItem

> WorkspaceItem updateItem(visibility, workspaceName, groupName, itemName, workspaceItemUpdateRequest)

[EXPERIMENTAL] UpdateItem: Update an item in a workspace.

Update an item in a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the containing workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The workspace name.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The item name.
        WorkspaceItemUpdateRequest workspaceItemUpdateRequest = new WorkspaceItemUpdateRequest(); // WorkspaceItemUpdateRequest | The new item details.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.updateItem(visibility, workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute(opts);

            WorkspaceItem result = apiInstance.updateItem(visibility, workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updateItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the containing workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The workspace name. | |
| **groupName** | **String**| The group containing the item. | |
| **itemName** | **String**| The item name. | |
| **workspaceItemUpdateRequest** | [**WorkspaceItemUpdateRequest**](WorkspaceItemUpdateRequest.md)| The new item details. | [optional] |

### Return type

[**WorkspaceItem**](WorkspaceItem.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspace item updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateWorkspace

> Workspace updateWorkspace(visibility, workspaceName, workspaceUpdateRequest)

[EXPERIMENTAL] UpdateWorkspace: Update a workspace.

Update a workspace.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WorkspaceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkspaceApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // WorkspaceApi apiInstance = apiFactory.build(WorkspaceApi.class);

        WorkspaceApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkspaceApi.class);
        String visibility = "shared"; // String | The visibility for the workspace. Must be `shared` or `personal`; case is important.
        String workspaceName = "workspaceName_example"; // String | The workspace name.
        WorkspaceUpdateRequest workspaceUpdateRequest = new WorkspaceUpdateRequest(); // WorkspaceUpdateRequest | The new workspace details.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.updateWorkspace(visibility, workspaceName, workspaceUpdateRequest).execute(opts);

            Workspace result = apiInstance.updateWorkspace(visibility, workspaceName, workspaceUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updateWorkspace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**| The visibility for the workspace. Must be &#x60;shared&#x60; or &#x60;personal&#x60;; case is important. | [enum: shared, personal] |
| **workspaceName** | **String**| The workspace name. | |
| **workspaceUpdateRequest** | [**WorkspaceUpdateRequest**](WorkspaceUpdateRequest.md)| The new workspace details. | [optional] |

### Return type

[**Workspace**](Workspace.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspace updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

