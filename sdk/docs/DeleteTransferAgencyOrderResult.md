# com.finbourne.lusid.model.DeleteTransferAgencyOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**cancelledTransactionIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.DeleteTransferAgencyOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
@jakarta.annotation.Nullable List<String> CancelledTransactionIds = new List<String>();


DeleteTransferAgencyOrderResult deleteTransferAgencyOrderResultInstance = new DeleteTransferAgencyOrderResult()
    .OrderId(OrderId)
    .CancelledTransactionIds(CancelledTransactionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
