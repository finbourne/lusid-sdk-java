# com.finbourne.lusid.model.TransferAgencyTransactionCancellationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionId** | **String** |  | [optional] [default to String]
**amendedCashTransactionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransferAgencyTransactionCancellationResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String AmendedCashTransactionId = "example AmendedCashTransactionId";


TransferAgencyTransactionCancellationResult transferAgencyTransactionCancellationResultInstance = new TransferAgencyTransactionCancellationResult()
    .OrderId(OrderId)
    .TransactionId(TransactionId)
    .AmendedCashTransactionId(AmendedCashTransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
