# com.finbourne.lusid.model.MovedOrderToDifferentBlockResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationBlock** | [**Block**](Block.md) |  | [optional] [default to Block]
**order** | [**Order**](Order.md) |  | [optional] [default to Order]
**sourceBlockId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.MovedOrderToDifferentBlockResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block DestinationBlock = new Block();
Order Order = new Order();
ResourceId SourceBlockId = new ResourceId();


MovedOrderToDifferentBlockResponse movedOrderToDifferentBlockResponseInstance = new MovedOrderToDifferentBlockResponse()
    .DestinationBlock(DestinationBlock)
    .Order(Order)
    .SourceBlockId(SourceBlockId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
