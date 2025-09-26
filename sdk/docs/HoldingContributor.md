# com.finbourne.lusid.model.HoldingContributor
A list of transactions contributed to a holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction** | [**Transaction**](Transaction.md) |  | [default to Transaction]
**holdingId** | **Long** | The unique holding identifier | [optional] [default to Long]
**movements** | [**List&lt;MovementSettlementSummary&gt;**](MovementSettlementSummary.md) | Movements contributed to holding | [optional] [default to List<MovementSettlementSummary>]

```java
import com.finbourne.lusid.model.HoldingContributor;
import java.util.*;
import java.lang.System;
import java.net.URI;

Transaction Transaction = new Transaction();
@jakarta.annotation.Nullable Long HoldingId = new Long("100.00");
@jakarta.annotation.Nullable List<MovementSettlementSummary> Movements = new List<MovementSettlementSummary>();


HoldingContributor holdingContributorInstance = new HoldingContributor()
    .Transaction(Transaction)
    .HoldingId(HoldingId)
    .Movements(Movements);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
