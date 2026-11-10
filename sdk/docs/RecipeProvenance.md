# com.finbourne.lusid.model.RecipeProvenance
The recipe a fund valuation was priced with, and where it came from. Absent when the fund has no portfolios  at the effective date, as nothing is priced and no recipe is resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** | Where the recipe came from. &#39;NavType&#39; when it is the recipe on the nominated NAV type&#39;s definition;  &#39;Request&#39; when the request named a recipeId that replaced it for pricing in that request only. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecipeProvenance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String Source = "example Source";


RecipeProvenance recipeProvenanceInstance = new RecipeProvenance()
    .RecipeId(RecipeId)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
