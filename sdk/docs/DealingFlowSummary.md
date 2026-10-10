# com.finbourne.lusid.model.DealingFlowSummary
The transfer agency estimates a swing decision was made on: how many orders were dealt at the valuation point and what they summed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | How many orders were summed. | [default to Integer]
**grossInflow** | **java.math.BigDecimal** | The sum of the inflows, in the fund currency. Zero or more. | [default to java.math.BigDecimal]
**grossOutflow** | **java.math.BigDecimal** | The sum of the outflows, in the fund currency, as a magnitude. Zero or more. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.DealingFlowSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Count = new Integer("100.00");
java.math.BigDecimal GrossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal GrossOutflow = new java.math.BigDecimal("100.00");


DealingFlowSummary dealingFlowSummaryInstance = new DealingFlowSummary()
    .Count(Count)
    .GrossInflow(GrossInflow)
    .GrossOutflow(GrossOutflow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
