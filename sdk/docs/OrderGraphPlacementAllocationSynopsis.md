# com.finbourne.lusid.model.OrderGraphPlacementAllocationSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units allocated. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphPlacementAllocationDetail&gt;**](OrderGraphPlacementAllocationDetail.md) | Identifiers for each allocation in this placement. | [default to List<OrderGraphPlacementAllocationDetail>]

```java
import com.finbourne.lusid.model.OrderGraphPlacementAllocationSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
List<OrderGraphPlacementAllocationDetail> Details = new List<OrderGraphPlacementAllocationDetail>();


OrderGraphPlacementAllocationSynopsis orderGraphPlacementAllocationSynopsisInstance = new OrderGraphPlacementAllocationSynopsis()
    .Quantity(Quantity)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
