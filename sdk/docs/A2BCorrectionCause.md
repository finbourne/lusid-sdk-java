# com.finbourne.lusid.model.A2BCorrectionCause
A transaction behind a BackdatedCorrection movement, with the journal action that put it there

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the transaction behind the correction. | [optional] [default to String]
**action** | **String** | How the late change reached the ledger: TrueUp for a transaction that was booked, Reversal for one that was cancelled, ReversalAndTrueUp for one that was amended. Available values: TrueUp, Reversal, ReversalAndTrueUp. | [optional] [default to String]

```java
import com.finbourne.lusid.model.A2BCorrectionCause;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String Action = "example Action";


A2BCorrectionCause a2BCorrectionCauseInstance = new A2BCorrectionCause()
    .TransactionId(TransactionId)
    .Action(Action);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
