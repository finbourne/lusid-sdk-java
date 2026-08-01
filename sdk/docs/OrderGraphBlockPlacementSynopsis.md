# com.finbourne.lusid.model.OrderGraphBlockPlacementSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units placed. | [optional] [default to java.math.BigDecimal]
**quantityByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total number of units placed. | [optional] [default to Map<String, java.math.BigDecimal>]
**amount** | **java.math.BigDecimal** | Total monetary value placed, in the block currency. | [optional] [default to java.math.BigDecimal]
**amountByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total monetary value placed, broken down by placement state. | [optional] [default to Map<String, java.math.BigDecimal>]
**details** | [**List&lt;OrderGraphBlockPlacementDetail&gt;**](OrderGraphBlockPlacementDetail.md) | Identifiers for each placement in this block. | [default to List<OrderGraphBlockPlacementDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockPlacementSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> QuantityByState = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> AmountByState = new Map<String, java.math.BigDecimal>();
List<OrderGraphBlockPlacementDetail> Details = new List<OrderGraphBlockPlacementDetail>();


OrderGraphBlockPlacementSynopsis orderGraphBlockPlacementSynopsisInstance = new OrderGraphBlockPlacementSynopsis()
    .Quantity(Quantity)
    .QuantityByState(QuantityByState)
    .Amount(Amount)
    .AmountByState(AmountByState)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
