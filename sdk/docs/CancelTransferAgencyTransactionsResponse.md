# com.finbourne.lusid.model.CancelTransferAgencyTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyTransactionCancellationResult&gt;**](TransferAgencyTransactionCancellationResult.md) | A dictionary of successfully un-priced orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyTransactionCancellationResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed un-pricing attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CancelTransferAgencyTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, TransferAgencyTransactionCancellationResult> Successes = new Map<String, TransferAgencyTransactionCancellationResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CancelTransferAgencyTransactionsResponse cancelTransferAgencyTransactionsResponseInstance = new CancelTransferAgencyTransactionsResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
