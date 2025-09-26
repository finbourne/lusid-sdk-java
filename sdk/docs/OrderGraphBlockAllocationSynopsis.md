# com.finbourne.lusid.model.OrderGraphBlockAllocationSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units allocated. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockAllocationDetail&gt;**](OrderGraphBlockAllocationDetail.md) | Identifiers for each allocation in this block. | [default to List<OrderGraphBlockAllocationDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockAllocationSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockAllocationDetail> Details = new List<OrderGraphBlockAllocationDetail>();


OrderGraphBlockAllocationSynopsis orderGraphBlockAllocationSynopsisInstance = new OrderGraphBlockAllocationSynopsis()
    .Quantity(Quantity)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
