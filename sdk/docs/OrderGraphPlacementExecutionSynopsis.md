# com.finbourne.lusid.model.OrderGraphPlacementExecutionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units executed. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphPlacementExecutionDetail&gt;**](OrderGraphPlacementExecutionDetail.md) | Identifiers info for each execution against this placement. | [default to List<OrderGraphPlacementExecutionDetail>]

```java
import com.finbourne.lusid.model.OrderGraphPlacementExecutionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
List<OrderGraphPlacementExecutionDetail> Details = new List<OrderGraphPlacementExecutionDetail>();


OrderGraphPlacementExecutionSynopsis orderGraphPlacementExecutionSynopsisInstance = new OrderGraphPlacementExecutionSynopsis()
    .Quantity(Quantity)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
