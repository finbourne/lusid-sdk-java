# com.finbourne.lusid.model.OrderGraphBlockTransactionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units booked. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockTransactionDetail&gt;**](OrderGraphBlockTransactionDetail.md) | Identifiers for each transaction in this block. | [default to List<OrderGraphBlockTransactionDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockTransactionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockTransactionDetail> Details = new List<OrderGraphBlockTransactionDetail>();


OrderGraphBlockTransactionSynopsis orderGraphBlockTransactionSynopsisInstance = new OrderGraphBlockTransactionSynopsis()
    .Quantity(Quantity)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
