# com.finbourne.lusid.model.ProposedBlockAndOrders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**BlockAndOrdersRequest**](BlockAndOrdersRequest.md) |  | [optional] [default to BlockAndOrdersRequest]
**netQuantity** | **java.math.BigDecimal** | The block&#39;s quantity, netted by direction, where any order is quantity-based. | [optional] [default to java.math.BigDecimal]
**netAmount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.lusid.model.ProposedBlockAndOrders;
import java.util.*;
import java.lang.System;
import java.net.URI;

BlockAndOrdersRequest Request = new BlockAndOrdersRequest();
@jakarta.annotation.Nullable java.math.BigDecimal NetQuantity = new java.math.BigDecimal("100.00");
CurrencyAndAmount NetAmount = new CurrencyAndAmount();


ProposedBlockAndOrders proposedBlockAndOrdersInstance = new ProposedBlockAndOrders()
    .Request(Request)
    .NetQuantity(NetQuantity)
    .NetAmount(NetAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
