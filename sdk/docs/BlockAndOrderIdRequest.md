# com.finbourne.lusid.model.BlockAndOrderIdRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationBlockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.BlockAndOrderIdRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId DestinationBlockId = new ResourceId();
ResourceId OrderId = new ResourceId();


BlockAndOrderIdRequest blockAndOrderIdRequestInstance = new BlockAndOrderIdRequest()
    .DestinationBlockId(DestinationBlockId)
    .OrderId(OrderId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
