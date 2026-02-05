# com.finbourne.lusid.model.OrderGraphBlockAllocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of this allocation, with direction relative to the containing block. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.OrderGraphBlockAllocationDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId AllocatedOrderId = new ResourceId();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");


OrderGraphBlockAllocationDetail orderGraphBlockAllocationDetailInstance = new OrderGraphBlockAllocationDetail()
    .Id(Id)
    .AllocatedOrderId(AllocatedOrderId)
    .Quantity(Quantity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
