# com.finbourne.lusid.model.DealingFlowSummary
The transfer agency estimates a swing decision was made on: the orders dealt at the valuation point, what they summed, and how many pending orders were left out and what those were worth.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | How many orders were summed. | [default to Integer]
**grossInflow** | **java.math.BigDecimal** | The sum of the inflows, in the fund currency. Zero or more. | [default to java.math.BigDecimal]
**grossOutflow** | **java.math.BigDecimal** | The sum of the outflows, in the fund currency, as a magnitude. Zero or more. | [default to java.math.BigDecimal]
**pendingNotCounted** | **Integer** | How many pending orders at the valuation point were left out of the sums because the fund&#39;s dealing estimates do not count pending orders. Zero when the fund counts them. | [default to Integer]
**pendingGrossInflow** | **java.math.BigDecimal** | The sum of the inflows among the pending orders left out, in the fund currency, with units at the estimate price. Zero or more; zero when the fund counts pending orders. | [default to java.math.BigDecimal]
**pendingGrossOutflow** | **java.math.BigDecimal** | The sum of the outflows among the pending orders left out, in the fund currency, as a magnitude, with units at the estimate price. Zero or more; zero when the fund counts pending orders. | [default to java.math.BigDecimal]
**pendingUnvaluedCount** | **Integer** | How many of the pending orders left out could not be valued, such as a unit order with no price yet. They are in pendingNotCounted but absent from pendingGrossInflow and pendingGrossOutflow. | [default to Integer]

```java
import com.finbourne.lusid.model.DealingFlowSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Count = new Integer("100.00");
java.math.BigDecimal GrossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal GrossOutflow = new java.math.BigDecimal("100.00");
Integer PendingNotCounted = new Integer("100.00");
java.math.BigDecimal PendingGrossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal PendingGrossOutflow = new java.math.BigDecimal("100.00");
Integer PendingUnvaluedCount = new Integer("100.00");


DealingFlowSummary dealingFlowSummaryInstance = new DealingFlowSummary()
    .Count(Count)
    .GrossInflow(GrossInflow)
    .GrossOutflow(GrossOutflow)
    .PendingNotCounted(PendingNotCounted)
    .PendingGrossInflow(PendingGrossInflow)
    .PendingGrossOutflow(PendingGrossOutflow)
    .PendingUnvaluedCount(PendingUnvaluedCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
