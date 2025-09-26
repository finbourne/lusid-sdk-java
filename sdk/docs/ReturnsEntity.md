# com.finbourne.lusid.model.ReturnsEntity
Returns entity, used for configuring the calculation of aggregated returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**recipeEntity** | **String** | Entity a recipe is retrieved from for use in the aggregated returns calculation. Either RecipeId or RecipeEntity must be specified. | [optional] [default to String]
**feeHandling** | **String** | Configures how fees are handled in the aggregated returns calculation. | [optional] [default to String]
**flowHandling** | **String** | Configures how flows are handled in the aggregated returns calculation. | [optional] [default to String]
**businessCalendar** | **String** | Calendar used in the aggregated returns calculation. | [optional] [default to String]
**handleFlowDiscrepancy** | **String** | Configures handling for the case where net flows do not match the sum of tagged flows. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReturnsEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String RecipeEntity = "example RecipeEntity";
@jakarta.annotation.Nullable String FeeHandling = "example FeeHandling";
@jakarta.annotation.Nullable String FlowHandling = "example FlowHandling";
@jakarta.annotation.Nullable String BusinessCalendar = "example BusinessCalendar";
@jakarta.annotation.Nullable String HandleFlowDiscrepancy = "example HandleFlowDiscrepancy";


ReturnsEntity returnsEntityInstance = new ReturnsEntity()
    .Id(Id)
    .RecipeId(RecipeId)
    .RecipeEntity(RecipeEntity)
    .FeeHandling(FeeHandling)
    .FlowHandling(FlowHandling)
    .BusinessCalendar(BusinessCalendar)
    .HandleFlowDiscrepancy(HandleFlowDiscrepancy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
