# com.finbourne.lusid.model.HoldingContext
Holding context node.  Contains settings that control how LUSID handles holdings within portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotLevelHoldings** | **Boolean** | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to True. | [optional] [default to Boolean]
**aggregateCashCommitments** | **Boolean** | When true, cash commitment holdings sharing a SubHoldingKey are folded into a single aggregated  row per portfolio, mirroring how cash balances are already aggregated. Defaults to false to  preserve existing behaviour. Ignored when TaxLotLevelHoldings is true — tax-lot granularity  takes precedence. Aggregation is per-portfolio: cross-portfolio rows in portfolio-group / fund  responses stay separate, matching the behaviour of positions and cash balances. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.HoldingContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean TaxLotLevelHoldings = true;
Boolean AggregateCashCommitments = true;


HoldingContext holdingContextInstance = new HoldingContext()
    .TaxLotLevelHoldings(TaxLotLevelHoldings)
    .AggregateCashCommitments(AggregateCashCommitments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
