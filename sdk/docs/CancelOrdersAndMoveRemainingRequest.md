# com.finbourne.lusid.model.CancelOrdersAndMoveRemainingRequest
A request to create or update a Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**moveRemainingToOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**moveRemainingToBlockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.CancelOrdersAndMoveRemainingRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CancelOrderId = new ResourceId();
ResourceId MoveRemainingToOrderId = new ResourceId();
ResourceId MoveRemainingToBlockId = new ResourceId();


CancelOrdersAndMoveRemainingRequest cancelOrdersAndMoveRemainingRequestInstance = new CancelOrdersAndMoveRemainingRequest()
    .CancelOrderId(CancelOrderId)
    .MoveRemainingToOrderId(MoveRemainingToOrderId)
    .MoveRemainingToBlockId(MoveRemainingToBlockId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
