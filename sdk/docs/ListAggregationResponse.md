# com.finbourne.lusid.model.ListAggregationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**aggregationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**data** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, Object>>]
**aggregationCurrency** | **String** |  | [optional] [default to String]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]
**aggregationFailures** | [**List&lt;AggregationMeasureFailureDetail&gt;**](AggregationMeasureFailureDetail.md) |  | [optional] [default to List<AggregationMeasureFailureDetail>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ListAggregationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AggregationEffectiveAt = OffsetDateTime.now();
OffsetDateTime AggregationAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Map<String, Object>> Data = new List<Map<String, Object>>();
@jakarta.annotation.Nullable String AggregationCurrency = "example AggregationCurrency";
ResultDataSchema DataSchema = new ResultDataSchema();
@jakarta.annotation.Nullable List<AggregationMeasureFailureDetail> AggregationFailures = new List<AggregationMeasureFailureDetail>();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ListAggregationResponse listAggregationResponseInstance = new ListAggregationResponse()
    .AggregationEffectiveAt(AggregationEffectiveAt)
    .AggregationAsAt(AggregationAsAt)
    .Href(Href)
    .Data(Data)
    .AggregationCurrency(AggregationCurrency)
    .DataSchema(DataSchema)
    .AggregationFailures(AggregationFailures)
    .RecipeId(RecipeId)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
