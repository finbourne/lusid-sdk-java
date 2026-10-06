# com.finbourne.lusid.model.AggregatedReturnsEntityRequest
The request body for the aggregated-returns (TWR) endpoint: the entity to calculate returns for, the  Returns entity that configures the calculation, the effective window, the metrics to calculate and the  period grid granularity. Supports a single `Portfolio` entity, the period `Return` metric and  a `Daily` grid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**AggregatedReturnsEntityId**](AggregatedReturnsEntityId.md) |  | [default to AggregatedReturnsEntityId]
**returnsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**metrics** | [**List&lt;ReturnsMetric&gt;**](ReturnsMetric.md) |  | [default to List<ReturnsMetric>]
**period** | **String** | Available values: Daily, Monthly. | [optional] [default to String]
**fromEffectiveAt** | **String** |  | [optional] [default to String]
**toEffectiveAt** | **String** |  | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**currency** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.AggregatedReturnsEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregatedReturnsEntityId Entity = new AggregatedReturnsEntityId();
ResourceId ReturnsId = new ResourceId();
List<ReturnsMetric> Metrics = new List<ReturnsMetric>();
@jakarta.annotation.Nullable String Period = "example Period";
@jakarta.annotation.Nullable String FromEffectiveAt = "example FromEffectiveAt";
@jakarta.annotation.Nullable String ToEffectiveAt = "example ToEffectiveAt";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Currency = "example Currency";


AggregatedReturnsEntityRequest aggregatedReturnsEntityRequestInstance = new AggregatedReturnsEntityRequest()
    .Entity(Entity)
    .ReturnsId(ReturnsId)
    .Metrics(Metrics)
    .Period(Period)
    .FromEffectiveAt(FromEffectiveAt)
    .ToEffectiveAt(ToEffectiveAt)
    .AsAt(AsAt)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
