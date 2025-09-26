# com.finbourne.lusid.model.OrderBreachHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**breachesByRule** | [**Map&lt;String, List&lt;OrderRuleBreach&gt;&gt;**](List.md) | Compliance rule breaches associations with the order and run. | [optional] [default to Map<String, List<OrderRuleBreach>>]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the order breach was created in LUSID. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.OrderBreachHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId OrderId = new ResourceId();
ResourceId RunId = new ResourceId();
@jakarta.annotation.Nullable Map<String, List<OrderRuleBreach>> BreachesByRule = new Map<String, List<OrderRuleBreach>>();
OffsetDateTime AsAt = OffsetDateTime.now();


OrderBreachHistory orderBreachHistoryInstance = new OrderBreachHistory()
    .Id(Id)
    .OrderId(OrderId)
    .RunId(RunId)
    .BreachesByRule(BreachesByRule)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
