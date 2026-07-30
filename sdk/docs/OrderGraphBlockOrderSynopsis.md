# com.finbourne.lusid.model.OrderGraphBlockOrderSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units ordered. | [optional] [default to java.math.BigDecimal]
**quantityByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total number of units placed. | [optional] [default to Map<String, java.math.BigDecimal>]
**amount** | **java.math.BigDecimal** | Total monetary value ordered, in the block currency. | [optional] [default to java.math.BigDecimal]
**amountByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total monetary value ordered, broken down by order state. | [optional] [default to Map<String, java.math.BigDecimal>]
**details** | [**List&lt;OrderGraphBlockOrderDetail&gt;**](OrderGraphBlockOrderDetail.md) | Identifiers and other info for each order in this block. | [default to List<OrderGraphBlockOrderDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockOrderSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> QuantityByState = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> AmountByState = new Map<String, java.math.BigDecimal>();
List<OrderGraphBlockOrderDetail> Details = new List<OrderGraphBlockOrderDetail>();


OrderGraphBlockOrderSynopsis orderGraphBlockOrderSynopsisInstance = new OrderGraphBlockOrderSynopsis()
    .Quantity(Quantity)
    .QuantityByState(QuantityByState)
    .Amount(Amount)
    .AmountByState(AmountByState)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
