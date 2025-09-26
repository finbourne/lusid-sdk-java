# com.finbourne.lusid.model.OrderGraphBlockExecutionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units executed. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockExecutionDetail&gt;**](OrderGraphBlockExecutionDetail.md) | Identifiers for each execution in this block. | [default to List<OrderGraphBlockExecutionDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockExecutionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockExecutionDetail> Details = new List<OrderGraphBlockExecutionDetail>();


OrderGraphBlockExecutionSynopsis orderGraphBlockExecutionSynopsisInstance = new OrderGraphBlockExecutionSynopsis()
    .Quantity(Quantity)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
