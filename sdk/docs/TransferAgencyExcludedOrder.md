# com.finbourne.lusid.model.TransferAgencyExcludedOrder
An order left out of the sizing an estimate was struck from, with the reason it was left out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransferAgencyExcludedOrder;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
@jakarta.annotation.Nullable String Reason = "example Reason";


TransferAgencyExcludedOrder transferAgencyExcludedOrderInstance = new TransferAgencyExcludedOrder()
    .OrderId(OrderId)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
