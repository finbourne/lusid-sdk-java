# com.finbourne.lusid.model.TransferAgencyOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransferAgencyOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";


TransferAgencyOrderResult transferAgencyOrderResultInstance = new TransferAgencyOrderResult()
    .OrderId(OrderId)
    .TransactionId(TransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
