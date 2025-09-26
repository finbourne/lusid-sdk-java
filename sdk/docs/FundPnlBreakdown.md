# com.finbourne.lusid.model.FundPnlBreakdown
The breakdown of PnL for a Fund on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nonClassSpecificPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for PnL within the queried period that is not specific to any share class. | [default to Map<String, FundAmount>]
**aggregatedClassPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the sum of class PnL across all share classes in a fund and within the queried period. | [default to Map<String, FundAmount>]
**totalPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the sum of class PnL and PnL not specific to a class within the queried period. | [default to Map<String, FundAmount>]

```java
import com.finbourne.lusid.model.FundPnlBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, FundAmount> NonClassSpecificPnl = new Map<String, FundAmount>();
Map<String, FundAmount> AggregatedClassPnl = new Map<String, FundAmount>();
Map<String, FundAmount> TotalPnl = new Map<String, FundAmount>();


FundPnlBreakdown fundPnlBreakdownInstance = new FundPnlBreakdown()
    .NonClassSpecificPnl(NonClassSpecificPnl)
    .AggregatedClassPnl(AggregatedClassPnl)
    .TotalPnl(TotalPnl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
