# com.finbourne.lusid.model.OrderSetRequest
A request to create or update multiple Orders.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderRequests** | [**List&lt;OrderRequest&gt;**](OrderRequest.md) | A collection of OrderRequests. | [optional] [default to List<OrderRequest>]

```java
import com.finbourne.lusid.model.OrderSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<OrderRequest> OrderRequests = new List<OrderRequest>();


OrderSetRequest orderSetRequestInstance = new OrderSetRequest()
    .OrderRequests(OrderRequests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
