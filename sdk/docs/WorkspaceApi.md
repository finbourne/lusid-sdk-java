# WorkspaceApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPersonalItem**](WorkspaceApi.md#createPersonalItem) | **POST** /api/workspaces/personal/{workspaceName}/items | [EXPERIMENTAL] CreatePersonalItem: Create a new item in a personal workspace. |
| [**createPersonalWorkspace**](WorkspaceApi.md#createPersonalWorkspace) | **POST** /api/workspaces/personal | [EXPERIMENTAL] CreatePersonalWorkspace: Create a new personal workspace. |
| [**createSharedItem**](WorkspaceApi.md#createSharedItem) | **POST** /api/workspaces/shared/{workspaceName}/items | [EXPERIMENTAL] CreateSharedItem: Create a new item in a shared workspace. |
| [**createSharedWorkspace**](WorkspaceApi.md#createSharedWorkspace) | **POST** /api/workspaces/shared | [EXPERIMENTAL] CreateSharedWorkspace: Create a new shared workspace. |
| [**deletePersonalItem**](WorkspaceApi.md#deletePersonalItem) | **DELETE** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] DeletePersonalItem: Delete an item from a personal workspace. |
| [**deletePersonalWorkspace**](WorkspaceApi.md#deletePersonalWorkspace) | **DELETE** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] DeletePersonalWorkspace: Delete a personal workspace. |
| [**deleteSharedItem**](WorkspaceApi.md#deleteSharedItem) | **DELETE** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] DeleteSharedItem: Delete an item from a shared workspace. |
| [**deleteSharedWorkspace**](WorkspaceApi.md#deleteSharedWorkspace) | **DELETE** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] DeleteSharedWorkspace: Delete a shared workspace. |
| [**getPersonalItem**](WorkspaceApi.md#getPersonalItem) | **GET** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] GetPersonalItem: Get a single personal workspace item. |
| [**getPersonalWorkspace**](WorkspaceApi.md#getPersonalWorkspace) | **GET** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] GetPersonalWorkspace: Get a personal workspace. |
| [**getSharedItem**](WorkspaceApi.md#getSharedItem) | **GET** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] GetSharedItem: Get a single shared workspace item. |
| [**getSharedWorkspace**](WorkspaceApi.md#getSharedWorkspace) | **GET** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] GetSharedWorkspace: Get a shared workspace. |
| [**listPersonalItems**](WorkspaceApi.md#listPersonalItems) | **GET** /api/workspaces/personal/{workspaceName}/items | [EXPERIMENTAL] ListPersonalItems: List the items in a personal workspace. |
| [**listPersonalWorkspaces**](WorkspaceApi.md#listPersonalWorkspaces) | **GET** /api/workspaces/personal | [EXPERIMENTAL] ListPersonalWorkspaces: List personal workspaces. |
| [**listSharedItems**](WorkspaceApi.md#listSharedItems) | **GET** /api/workspaces/shared/{workspaceName}/items | [EXPERIMENTAL] ListSharedItems: List the items in a shared workspace. |
| [**listSharedWorkspaces**](WorkspaceApi.md#listSharedWorkspaces) | **GET** /api/workspaces/shared | [EXPERIMENTAL] ListSharedWorkspaces: List shared workspaces. |
| [**updatePersonalItem**](WorkspaceApi.md#updatePersonalItem) | **PUT** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] UpdatePersonalItem: Update an item in a personal workspace. |
| [**updatePersonalWorkspace**](WorkspaceApi.md#updatePersonalWorkspace) | **PUT** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] UpdatePersonalWorkspace: Update a personal workspace. |
| [**updateSharedItem**](WorkspaceApi.md#updateSharedItem) | **PUT** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] UpdateSharedItem: Update an item in a shared workspace. |
| [**updateSharedWorkspace**](WorkspaceApi.md#updateSharedWorkspace) | **PUT** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] UpdateSharedWorkspace: Update a shared workspace. |



## createPersonalItem

> WorkspaceItem createPersonalItem(workspaceName, workspaceItemCreationRequest)

[EXPERIMENTAL] CreatePersonalItem: Create a new item in a personal workspace.

Create a new item in a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        WorkspaceItemCreationRequest workspaceItemCreationRequest = new WorkspaceItemCreationRequest(); // WorkspaceItemCreationRequest | The item to be created.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.createPersonalItem(workspaceName, workspaceItemCreationRequest).execute(opts);

            WorkspaceItem result = apiInstance.createPersonalItem(workspaceName, workspaceItemCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createPersonalItem");
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


## createPersonalWorkspace

> Workspace createPersonalWorkspace(workspaceCreationRequest)

[EXPERIMENTAL] CreatePersonalWorkspace: Create a new personal workspace.

Create a new personal workspace.

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
        WorkspaceCreationRequest workspaceCreationRequest = new WorkspaceCreationRequest(); // WorkspaceCreationRequest | The workspace to be created.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.createPersonalWorkspace(workspaceCreationRequest).execute(opts);

            Workspace result = apiInstance.createPersonalWorkspace(workspaceCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createPersonalWorkspace");
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


## createSharedItem

> WorkspaceItem createSharedItem(workspaceName, workspaceItemCreationRequest)

[EXPERIMENTAL] CreateSharedItem: Create a new item in a shared workspace.

Create a new item in a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        WorkspaceItemCreationRequest workspaceItemCreationRequest = new WorkspaceItemCreationRequest(); // WorkspaceItemCreationRequest | The item to be created.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.createSharedItem(workspaceName, workspaceItemCreationRequest).execute(opts);

            WorkspaceItem result = apiInstance.createSharedItem(workspaceName, workspaceItemCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createSharedItem");
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


## createSharedWorkspace

> Workspace createSharedWorkspace(workspaceCreationRequest)

[EXPERIMENTAL] CreateSharedWorkspace: Create a new shared workspace.

Create a new shared workspace.

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
        WorkspaceCreationRequest workspaceCreationRequest = new WorkspaceCreationRequest(); // WorkspaceCreationRequest | The workspace to be created.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.createSharedWorkspace(workspaceCreationRequest).execute(opts);

            Workspace result = apiInstance.createSharedWorkspace(workspaceCreationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#createSharedWorkspace");
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


## deletePersonalItem

> DeletedEntityResponse deletePersonalItem(workspaceName, groupName, itemName)

[EXPERIMENTAL] DeletePersonalItem: Delete an item from a personal workspace.

Delete an item from a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The name of the personal workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePersonalItem(workspaceName, groupName, itemName).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePersonalItem(workspaceName, groupName, itemName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deletePersonalItem");
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
| **workspaceName** | **String**| The name of the personal workspace. | |
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
| **200** | The result of deleting a personal workspace item. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePersonalWorkspace

> DeletedEntityResponse deletePersonalWorkspace(workspaceName)

[EXPERIMENTAL] DeletePersonalWorkspace: Delete a personal workspace.

Delete a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The name of the personal workspace.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePersonalWorkspace(workspaceName).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePersonalWorkspace(workspaceName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deletePersonalWorkspace");
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
| **workspaceName** | **String**| The name of the personal workspace. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The result of deleting a personal workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteSharedItem

> DeletedEntityResponse deleteSharedItem(workspaceName, groupName, itemName)

[EXPERIMENTAL] DeleteSharedItem: Delete an item from a shared workspace.

Delete an item from a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The name of the shared workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteSharedItem(workspaceName, groupName, itemName).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteSharedItem(workspaceName, groupName, itemName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deleteSharedItem");
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
| **workspaceName** | **String**| The name of the shared workspace. | |
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
| **200** | The result of deleting a shared workspace item. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteSharedWorkspace

> DeletedEntityResponse deleteSharedWorkspace(workspaceName)

[EXPERIMENTAL] DeleteSharedWorkspace: Delete a shared workspace.

Delete a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The name of the shared workspace.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteSharedWorkspace(workspaceName).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteSharedWorkspace(workspaceName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#deleteSharedWorkspace");
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
| **workspaceName** | **String**| The name of the shared workspace. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The result of deleting a shared workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPersonalItem

> WorkspaceItem getPersonalItem(workspaceName, groupName, itemName, asAt)

[EXPERIMENTAL] GetPersonalItem: Get a single personal workspace item.

Get a single personal workspace item.

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
        String workspaceName = "workspaceName_example"; // String | The name of the personal workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The datetime at which to request the workspace item. If not provided, defaults to 'latest'.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.getPersonalItem(workspaceName, groupName, itemName, asAt).execute(opts);

            WorkspaceItem result = apiInstance.getPersonalItem(workspaceName, groupName, itemName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getPersonalItem");
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
| **workspaceName** | **String**| The name of the personal workspace. | |
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


## getPersonalWorkspace

> Workspace getPersonalWorkspace(workspaceName, asAt)

[EXPERIMENTAL] GetPersonalWorkspace: Get a personal workspace.

Get a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The personal workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.getPersonalWorkspace(workspaceName, asAt).execute(opts);

            Workspace result = apiInstance.getPersonalWorkspace(workspaceName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getPersonalWorkspace");
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
| **workspaceName** | **String**| The personal workspace name. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspaces. Defaults to &#39;latest&#39; if not specified. | [optional] |

### Return type

[**Workspace**](Workspace.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The personal workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSharedItem

> WorkspaceItem getSharedItem(workspaceName, groupName, itemName, asAt)

[EXPERIMENTAL] GetSharedItem: Get a single shared workspace item.

Get a single shared workspace item.

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
        String workspaceName = "workspaceName_example"; // String | The name of the shared workspace.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The name of the item.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The datetime at which to request the workspace item. If not provided, defaults to 'latest'.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.getSharedItem(workspaceName, groupName, itemName, asAt).execute(opts);

            WorkspaceItem result = apiInstance.getSharedItem(workspaceName, groupName, itemName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getSharedItem");
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
| **workspaceName** | **String**| The name of the shared workspace. | |
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


## getSharedWorkspace

> Workspace getSharedWorkspace(workspaceName, asAt)

[EXPERIMENTAL] GetSharedWorkspace: Get a shared workspace.

Get a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The shared workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.getSharedWorkspace(workspaceName, asAt).execute(opts);

            Workspace result = apiInstance.getSharedWorkspace(workspaceName, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#getSharedWorkspace");
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
| **workspaceName** | **String**| The shared workspace name. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve workspaces. Defaults to &#39;latest&#39; if not specified. | [optional] |

### Return type

[**Workspace**](Workspace.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The shared workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPersonalItems

> PagedResourceListOfWorkspaceItem listPersonalItems(workspaceName, asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListPersonalItems: List the items in a personal workspace.

List the items in a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspace items. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspaceItem result = apiInstance.listPersonalItems(workspaceName, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspaceItem result = apiInstance.listPersonalItems(workspaceName, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listPersonalItems");
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
| **200** | The items in a personal workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPersonalWorkspaces

> PagedResourceListOfWorkspace listPersonalWorkspaces(asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListPersonalWorkspaces: List personal workspaces.

List personal workspaces.

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
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces from a previous call to list workspaces.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspace result = apiInstance.listPersonalWorkspaces(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspace result = apiInstance.listPersonalWorkspaces(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listPersonalWorkspaces");
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
| **200** | The personal workspaces. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSharedItems

> PagedResourceListOfWorkspaceItem listSharedItems(workspaceName, asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListSharedItems: List the items in a shared workspace.

List the items in a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The item's workspace name.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspace items. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces items from a previous call to list workspaces items.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspaceItem result = apiInstance.listSharedItems(workspaceName, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspaceItem result = apiInstance.listSharedItems(workspaceName, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listSharedItems");
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
| **200** | The items in a shared workspace. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSharedWorkspaces

> PagedResourceListOfWorkspace listSharedWorkspaces(asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListSharedWorkspaces: List shared workspaces.

List shared workspaces.

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
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve workspaces. Defaults to 'latest' if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing workspaces from a previous call to list workspaces.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkspace result = apiInstance.listSharedWorkspaces(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfWorkspace result = apiInstance.listSharedWorkspaces(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#listSharedWorkspaces");
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
| **200** | The shared workspaces. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePersonalItem

> WorkspaceItem updatePersonalItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest)

[EXPERIMENTAL] UpdatePersonalItem: Update an item in a personal workspace.

Update an item in a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The personal workspace name.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The item name.
        WorkspaceItemUpdateRequest workspaceItemUpdateRequest = new WorkspaceItemUpdateRequest(); // WorkspaceItemUpdateRequest | The new item details.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.updatePersonalItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute(opts);

            WorkspaceItem result = apiInstance.updatePersonalItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updatePersonalItem");
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
| **workspaceName** | **String**| The personal workspace name. | |
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


## updatePersonalWorkspace

> Workspace updatePersonalWorkspace(workspaceName, workspaceUpdateRequest)

[EXPERIMENTAL] UpdatePersonalWorkspace: Update a personal workspace.

Update a personal workspace.

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
        String workspaceName = "workspaceName_example"; // String | The personal workspace name.
        WorkspaceUpdateRequest workspaceUpdateRequest = new WorkspaceUpdateRequest(); // WorkspaceUpdateRequest | The new workspace details.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.updatePersonalWorkspace(workspaceName, workspaceUpdateRequest).execute(opts);

            Workspace result = apiInstance.updatePersonalWorkspace(workspaceName, workspaceUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updatePersonalWorkspace");
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
| **workspaceName** | **String**| The personal workspace name. | |
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


## updateSharedItem

> WorkspaceItem updateSharedItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest)

[EXPERIMENTAL] UpdateSharedItem: Update an item in a shared workspace.

Update an item in a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The shared workspace name.
        String groupName = "groupName_example"; // String | The group containing the item.
        String itemName = "itemName_example"; // String | The item name.
        WorkspaceItemUpdateRequest workspaceItemUpdateRequest = new WorkspaceItemUpdateRequest(); // WorkspaceItemUpdateRequest | The new item details.
        try {
            // uncomment the below to set overrides at the request level
            // WorkspaceItem result = apiInstance.updateSharedItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute(opts);

            WorkspaceItem result = apiInstance.updateSharedItem(workspaceName, groupName, itemName, workspaceItemUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updateSharedItem");
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
| **workspaceName** | **String**| The shared workspace name. | |
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


## updateSharedWorkspace

> Workspace updateSharedWorkspace(workspaceName, workspaceUpdateRequest)

[EXPERIMENTAL] UpdateSharedWorkspace: Update a shared workspace.

Update a shared workspace.

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
        String workspaceName = "workspaceName_example"; // String | The shared workspace name.
        WorkspaceUpdateRequest workspaceUpdateRequest = new WorkspaceUpdateRequest(); // WorkspaceUpdateRequest | The new workspace details.
        try {
            // uncomment the below to set overrides at the request level
            // Workspace result = apiInstance.updateSharedWorkspace(workspaceName, workspaceUpdateRequest).execute(opts);

            Workspace result = apiInstance.updateSharedWorkspace(workspaceName, workspaceUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#updateSharedWorkspace");
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
| **workspaceName** | **String**| The shared workspace name. | |
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

