# com.finbourne.lusid.model.AggregatedReturnsEntityRequest
The request body for the aggregated-returns (TWR) endpoint: the entity to calculate returns for, the  Returns entity that configures the calculation, the effective window, the metrics to calculate and the  period grid granularity. Supports a single `Portfolio` entity, the period `Return` metric and  a `Daily` grid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**AggregatedReturnsEntityId**](AggregatedReturnsEntityId.md) |  | [default to AggregatedReturnsEntityId]
**returnsScope** | **String** |  | [default to String]
**returnsCode** | **String** |  | [default to String]
**metrics** | [**List&lt;ReturnsMetric&gt;**](ReturnsMetric.md) |  | [default to List<ReturnsMetric>]
**period** | **String** | Available values: Daily, Monthly. | [optional] [default to String]
**fromEffectiveAt** | **String** |  | [optional] [default to String]
**toEffectiveAt** | **String** |  | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AggregatedReturnsEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregatedReturnsEntityId Entity = new AggregatedReturnsEntityId();
String ReturnsScope = "example ReturnsScope";
String ReturnsCode = "example ReturnsCode";
List<ReturnsMetric> Metrics = new List<ReturnsMetric>();
@jakarta.annotation.Nullable String Period = "example Period";
@jakarta.annotation.Nullable String FromEffectiveAt = "example FromEffectiveAt";
@jakarta.annotation.Nullable String ToEffectiveAt = "example ToEffectiveAt";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


AggregatedReturnsEntityRequest aggregatedReturnsEntityRequestInstance = new AggregatedReturnsEntityRequest()
    .Entity(Entity)
    .ReturnsScope(ReturnsScope)
    .ReturnsCode(ReturnsCode)
    .Metrics(Metrics)
    .Period(Period)
    .FromEffectiveAt(FromEffectiveAt)
    .ToEffectiveAt(ToEffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
