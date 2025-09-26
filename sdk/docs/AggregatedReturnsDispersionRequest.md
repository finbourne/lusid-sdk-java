# com.finbourne.lusid.model.AggregatedReturnsDispersionRequest
The request used in the AggregatedReturnsDispersionMetric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toEffectiveAt** | **String** | The end date for when the you want the dispersion to be calculated. | [optional] [default to String]
**yearsCount** | **Integer** | For how many years to calculate the dispersion. Default to 10. | [optional] [default to Integer]
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. | [optional] [default to List<ResourceId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance: Equal/Asset. | [optional] [default to String]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AggregatedReturnsDispersionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ToEffectiveAt = "example ToEffectiveAt";
Integer YearsCount = new Integer("100.00");
@jakarta.annotation.Nullable List<ResourceId> ReturnIds = new List<ResourceId>();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String CompositeMethod = "example CompositeMethod";
@jakarta.annotation.Nullable String AlternativeInceptionDate = "example AlternativeInceptionDate";


AggregatedReturnsDispersionRequest aggregatedReturnsDispersionRequestInstance = new AggregatedReturnsDispersionRequest()
    .ToEffectiveAt(ToEffectiveAt)
    .YearsCount(YearsCount)
    .ReturnIds(ReturnIds)
    .RecipeId(RecipeId)
    .CompositeMethod(CompositeMethod)
    .AlternativeInceptionDate(AlternativeInceptionDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
