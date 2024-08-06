# OrderGraphApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listOrderGraphBlocks**](OrderGraphApi.md#listOrderGraphBlocks) | **GET** /api/ordergraph/blocks | [EARLY ACCESS] ListOrderGraphBlocks: Lists blocks that pass the filter provided, and builds a summary picture of the state of their associated order entities. |
| [**listOrderGraphPlacementChildren**](OrderGraphApi.md#listOrderGraphPlacementChildren) | **GET** /api/ordergraph/placementchildren/{scope}/{code} | [EARLY ACCESS] ListOrderGraphPlacementChildren: Lists all placements for the parent placement specified by the scope and code, and builds a summary picture of the state of their associated order entities. |
| [**listOrderGraphPlacements**](OrderGraphApi.md#listOrderGraphPlacements) | **GET** /api/ordergraph/placements | [EARLY ACCESS] ListOrderGraphPlacements: Lists placements that pass the filter provided, and builds a summary picture of the state of their associated order entities. |



## listOrderGraphBlocks

> PagedResourceListOfOrderGraphBlock listOrderGraphBlocks(asAt, paginationToken, sortBy, limit, filter, propertyKeys, useComplianceV2)

[EARLY ACCESS] ListOrderGraphBlocks: Lists blocks that pass the filter provided, and builds a summary picture of the state of their associated order entities.

Lists all blocks of orders, subject to the filter, along with the IDs of orders, placements, allocations and  executions in the block, the total quantities of each, and a simple text field describing the overall state.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderGraphApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderGraphApiExample {

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

        OrderGraphApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderGraphApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | See https://support.lusid.com/knowledgebase/article/KA-01832/
        String paginationToken = "paginationToken_example"; // String | See https://support.lusid.com/knowledgebase/article/KA-01915/
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | See https://support.lusid.com/knowledgebase/article/KA-01915/
        String filter = ""; // String | See https://support.lusid.com/knowledgebase/article/KA-01914/
        List<String> propertyKeys = Arrays.asList(); // List<String> | Must be block-level properties. See https://support.lusid.com/knowledgebase/article/KA-01855/
        Boolean useComplianceV2 = false; // Boolean | Whether to use the V2 compliance engine when deriving compliance statuses for orders. (default: false)
        try {
            PagedResourceListOfOrderGraphBlock result = apiInstance.listOrderGraphBlocks(asAt, paginationToken, sortBy, limit, filter, propertyKeys, useComplianceV2).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderGraphApi#listOrderGraphBlocks");
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
| **asAt** | **OffsetDateTime**| See https://support.lusid.com/knowledgebase/article/KA-01832/ | [optional] |
| **paginationToken** | **String**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **filter** | **String**| See https://support.lusid.com/knowledgebase/article/KA-01914/ | [optional] [default to ] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| Must be block-level properties. See https://support.lusid.com/knowledgebase/article/KA-01855/ | [optional] |
| **useComplianceV2** | **Boolean**| Whether to use the V2 compliance engine when deriving compliance statuses for orders. (default: false) | [optional] [default to false] |

### Return type

[**PagedResourceListOfOrderGraphBlock**](PagedResourceListOfOrderGraphBlock.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Blocks in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listOrderGraphPlacementChildren

> PagedResourceListOfOrderGraphPlacement listOrderGraphPlacementChildren(scope, code, asAt, paginationToken, sortBy, limit, propertyKeys)

[EARLY ACCESS] ListOrderGraphPlacementChildren: Lists all placements for the parent placement specified by the scope and code, and builds a summary picture of the state of their associated order entities.

Lists all child order placements, for the specified parent placement, along with the IDs of the block and order that the  placement is for, each placement&#39;s quantity, the IDs of all allocations and executions in the placement  and the total quantities of those, and a simple text field describing the overall state of the placement.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderGraphApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderGraphApiExample {

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

        OrderGraphApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderGraphApi.class);
        String scope = "scope_example"; // String | The parent placement's scope
        String code = "code_example"; // String | The parent placement's code
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | See https://support.lusid.com/knowledgebase/article/KA-01832/
        String paginationToken = "paginationToken_example"; // String | See https://support.lusid.com/knowledgebase/article/KA-01915/
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer limit = 56; // Integer | See https://support.lusid.com/knowledgebase/article/KA-01915/
        List<String> propertyKeys = Arrays.asList(); // List<String> | Must be placement properties. See https://support.lusid.com/knowledgebase/article/KA-01855/
        try {
            PagedResourceListOfOrderGraphPlacement result = apiInstance.listOrderGraphPlacementChildren(scope, code, asAt, paginationToken, sortBy, limit, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderGraphApi#listOrderGraphPlacementChildren");
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
| **scope** | **String**| The parent placement&#39;s scope | |
| **code** | **String**| The parent placement&#39;s code | |
| **asAt** | **OffsetDateTime**| See https://support.lusid.com/knowledgebase/article/KA-01832/ | [optional] |
| **paginationToken** | **String**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **limit** | **Integer**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| Must be placement properties. See https://support.lusid.com/knowledgebase/article/KA-01855/ | [optional] |

### Return type

[**PagedResourceListOfOrderGraphPlacement**](PagedResourceListOfOrderGraphPlacement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all child Placements for the specified Placement. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listOrderGraphPlacements

> PagedResourceListOfOrderGraphPlacement listOrderGraphPlacements(asAt, paginationToken, sortBy, limit, filter, propertyKeys)

[EARLY ACCESS] ListOrderGraphPlacements: Lists placements that pass the filter provided, and builds a summary picture of the state of their associated order entities.

Lists all order placements, subject to the filter, along with the IDs of the block and order that the  placement is for, each placement&#39;s quantity, the IDs of all allocations and executions in the placement  and the total quantities of those, and a simple text field describing the overall state of the placement.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderGraphApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderGraphApiExample {

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

        OrderGraphApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderGraphApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | See https://support.lusid.com/knowledgebase/article/KA-01832/
        String paginationToken = "paginationToken_example"; // String | See https://support.lusid.com/knowledgebase/article/KA-01915/
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | See https://support.lusid.com/knowledgebase/article/KA-01915/
        String filter = ""; // String | See https://support.lusid.com/knowledgebase/article/KA-01914/
        List<String> propertyKeys = Arrays.asList(); // List<String> | Must be placement properties. See https://support.lusid.com/knowledgebase/article/KA-01855/
        try {
            PagedResourceListOfOrderGraphPlacement result = apiInstance.listOrderGraphPlacements(asAt, paginationToken, sortBy, limit, filter, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderGraphApi#listOrderGraphPlacements");
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
| **asAt** | **OffsetDateTime**| See https://support.lusid.com/knowledgebase/article/KA-01832/ | [optional] |
| **paginationToken** | **String**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| See https://support.lusid.com/knowledgebase/article/KA-01915/ | [optional] |
| **filter** | **String**| See https://support.lusid.com/knowledgebase/article/KA-01914/ | [optional] [default to ] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| Must be placement properties. See https://support.lusid.com/knowledgebase/article/KA-01855/ | [optional] |

### Return type

[**PagedResourceListOfOrderGraphPlacement**](PagedResourceListOfOrderGraphPlacement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Placements in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

