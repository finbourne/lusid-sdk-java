# com.finbourne.lusid.model.BlockAndOrders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block** | [**Block**](Block.md) |  | [default to Block]
**orders** | [**List&lt;Order&gt;**](Order.md) |  | [default to List<Order>]

```java
import com.finbourne.lusid.model.BlockAndOrders;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block Block = new Block();
List<Order> Orders = new List<Order>();


BlockAndOrders blockAndOrdersInstance = new BlockAndOrders()
    .Block(Block)
    .Orders(Orders);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
