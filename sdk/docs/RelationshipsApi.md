# RelationshipsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRelationship**](RelationshipsApi.md#createRelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships | CreateRelationship: Create Relationship |
| [**deleteRelationship**](RelationshipsApi.md#deleteRelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships/$delete | [EARLY ACCESS] DeleteRelationship: Delete Relationship |



## createRelationship

> CompleteRelationship createRelationship(scope, code, createRelationshipRequest)

CreateRelationship: Create Relationship

Create a relationship between two entity objects by their identifiers

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationshipsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationshipsApiExample {

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
        // RelationshipsApi apiInstance = apiFactory.build(RelationshipsApi.class);

        RelationshipsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationshipsApi.class);
        String scope = "scope_example"; // String | The scope of the relationship
        String code = "code_example"; // String | The code of the relationship
        CreateRelationshipRequest createRelationshipRequest = new CreateRelationshipRequest(); // CreateRelationshipRequest | The details of the relationship to create.
        try {
            // uncomment the below to set overrides at the request level
            // CompleteRelationship result = apiInstance.createRelationship(scope, code, createRelationshipRequest).execute(opts);

            CompleteRelationship result = apiInstance.createRelationship(scope, code, createRelationshipRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#createRelationship");
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
| **scope** | **String**| The scope of the relationship | |
| **code** | **String**| The code of the relationship | |
| **createRelationshipRequest** | [**CreateRelationshipRequest**](CreateRelationshipRequest.md)| The details of the relationship to create. | |

### Return type

[**CompleteRelationship**](CompleteRelationship.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created relationship. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteRelationship

> DeletedEntityResponse deleteRelationship(scope, code, deleteRelationshipRequest)

[EARLY ACCESS] DeleteRelationship: Delete Relationship

Delete a relationship between two entity objects represented by their identifiers

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationshipsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationshipsApiExample {

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
        // RelationshipsApi apiInstance = apiFactory.build(RelationshipsApi.class);

        RelationshipsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationshipsApi.class);
        String scope = "scope_example"; // String | The scope of the relationship
        String code = "code_example"; // String | The code of the relationship
        DeleteRelationshipRequest deleteRelationshipRequest = new DeleteRelationshipRequest(); // DeleteRelationshipRequest | The details of the relationship to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteRelationship(scope, code, deleteRelationshipRequest).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteRelationship(scope, code, deleteRelationshipRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#deleteRelationship");
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
| **scope** | **String**| The scope of the relationship | |
| **code** | **String**| The code of the relationship | |
| **deleteRelationshipRequest** | [**DeleteRelationshipRequest**](DeleteRelationshipRequest.md)| The details of the relationship to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the relationship is deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

