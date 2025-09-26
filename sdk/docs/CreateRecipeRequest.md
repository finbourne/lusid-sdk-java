# com.finbourne.lusid.model.CreateRecipeRequest
Specification class to request for the creation/supplementing of a configuration recipe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeCreationMarketDataScopes** | **List&lt;String&gt;** | The scopes in which the recipe creation would look for quotes/data. | [default to List<String>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**inlineRecipe** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  | [optional] [default to ConfigurationRecipe]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to use | [optional] [default to OffsetDateTime]
**effectiveAt** | **String** | The market data time, i.e. the recipe generated will look for rules with this effectiveAt. | [default to String]

```java
import com.finbourne.lusid.model.CreateRecipeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> RecipeCreationMarketDataScopes = new List<String>();
ResourceId RecipeId = new ResourceId();
ConfigurationRecipe InlineRecipe = new ConfigurationRecipe();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
String EffectiveAt = "example EffectiveAt";


CreateRecipeRequest createRecipeRequestInstance = new CreateRecipeRequest()
    .RecipeCreationMarketDataScopes(RecipeCreationMarketDataScopes)
    .RecipeId(RecipeId)
    .InlineRecipe(InlineRecipe)
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
