# com.finbourne.lusid.model.OrderGraphPlacementPlacementSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List&lt;OrderGraphPlacementChildPlacementDetail&gt;**](OrderGraphPlacementChildPlacementDetail.md) | Identifiers for each child placement for this placement. | [default to List<OrderGraphPlacementChildPlacementDetail>]
**quantity** | **java.math.BigDecimal** | Total number of units placed. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.OrderGraphPlacementPlacementSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OrderGraphPlacementChildPlacementDetail> Details = new List<OrderGraphPlacementChildPlacementDetail>();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");


OrderGraphPlacementPlacementSynopsis orderGraphPlacementPlacementSynopsisInstance = new OrderGraphPlacementPlacementSynopsis()
    .Details(Details)
    .Quantity(Quantity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
