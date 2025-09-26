# com.finbourne.lusid.model.CancelOrderAndMoveRemainingResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelledOrder** | [**Order**](Order.md) |  | [optional] [default to Order]
**newOrder** | [**Order**](Order.md) |  | [optional] [default to Order]
**newBlockId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.CancelOrderAndMoveRemainingResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Order CancelledOrder = new Order();
Order NewOrder = new Order();
ResourceId NewBlockId = new ResourceId();


CancelOrderAndMoveRemainingResult cancelOrderAndMoveRemainingResultInstance = new CancelOrderAndMoveRemainingResult()
    .CancelledOrder(CancelledOrder)
    .NewOrder(NewOrder)
    .NewBlockId(NewBlockId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
