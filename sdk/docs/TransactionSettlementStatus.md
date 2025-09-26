# com.finbourne.lusid.model.TransactionSettlementStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | [default to String]
**settlementBuckets** | [**List&lt;TransactionSettlementBucket&gt;**](TransactionSettlementBucket.md) | The transaction&#39;s external movements (ie: with SettlementMode&#x3D;External) are grouped into buckets with each bucket uniquely defined by the combination of SettlementCategory, LusidInstrumentId, InstrumentScope and ContractualSettlementDate. | [optional] [default to List<TransactionSettlementBucket>]
**invalidInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | Invalid settlement instructions where the referenced transaction exists but the settlement bucket implied by the settlement instruction does not exist. | [optional] [default to List<TransactionSettlementInstruction>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionSettlementStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable List<TransactionSettlementBucket> SettlementBuckets = new List<TransactionSettlementBucket>();
@jakarta.annotation.Nullable List<TransactionSettlementInstruction> InvalidInstructions = new List<TransactionSettlementInstruction>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionSettlementStatus transactionSettlementStatusInstance = new TransactionSettlementStatus()
    .TransactionId(TransactionId)
    .SettlementBuckets(SettlementBuckets)
    .InvalidInstructions(InvalidInstructions)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
