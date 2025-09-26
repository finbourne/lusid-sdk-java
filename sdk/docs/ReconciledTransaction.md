# com.finbourne.lusid.model.ReconciledTransaction
Information about reconciled transactions.  At least one of Left and Right will be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**right** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**percentageMatch** | **java.math.BigDecimal** | How good a match this is considered to be. | [optional] [default to java.math.BigDecimal]
**mappingRuleSetResults** | **List&lt;Boolean&gt;** | The result of each individual mapping rule result.  Will only be present if both Left and Right are populated. | [optional] [default to List<Boolean>]

```java
import com.finbourne.lusid.model.ReconciledTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

Transaction Left = new Transaction();
Transaction Right = new Transaction();
java.math.BigDecimal PercentageMatch = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Boolean> MappingRuleSetResults = new List<Boolean>();


ReconciledTransaction reconciledTransactionInstance = new ReconciledTransaction()
    .Left(Left)
    .Right(Right)
    .PercentageMatch(PercentageMatch)
    .MappingRuleSetResults(MappingRuleSetResults);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
