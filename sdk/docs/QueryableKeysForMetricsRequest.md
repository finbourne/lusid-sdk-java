# com.finbourne.lusid.model.QueryableKeysForMetricsRequest
Specification of the metrics whose queryable key definitions are being requested.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | **List&lt;String&gt;** | The address keys of the metrics to describe, given exactly as they would be supplied as the key of  a valuation request&#39;s metrics, for example &#39;Valuation/PV&#39; or &#39;Holding/Properties[Holding/MyScope/Rating]&#39;. | [default to List<String>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time to describe the metrics at, for definitions and entitlements that vary  along the effective timeline. Optional; defaults to the current time. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at time to describe the metrics at. Optional; defaults to the latest. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.QueryableKeysForMetricsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Metrics = new List<String>();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


QueryableKeysForMetricsRequest queryableKeysForMetricsRequestInstance = new QueryableKeysForMetricsRequest()
    .Metrics(Metrics)
    .RecipeId(RecipeId)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
