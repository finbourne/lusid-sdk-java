# com.finbourne.lusid.model.ShareClassPnlBreakdown
The breakdown of PnL for a Share Class on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apportionedNonClassSpecificPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL within the queried period not explicitly allocated to any share class but has been apportioned to the share class. | [default to Map<String, ShareClassAmount>]
**classPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for PnL specific to the share class within the queried period. | [default to Map<String, ShareClassAmount>]
**totalPnl** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the sum of class PnL and PnL not specific to a class within the queried period. | [default to Map<String, ShareClassAmount>]

```java
import com.finbourne.lusid.model.ShareClassPnlBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> ApportionedNonClassSpecificPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> ClassPnl = new Map<String, ShareClassAmount>();
Map<String, ShareClassAmount> TotalPnl = new Map<String, ShareClassAmount>();


ShareClassPnlBreakdown shareClassPnlBreakdownInstance = new ShareClassPnlBreakdown()
    .ApportionedNonClassSpecificPnl(ApportionedNonClassSpecificPnl)
    .ClassPnl(ClassPnl)
    .TotalPnl(TotalPnl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
