# com.finbourne.lusid.model.RecipeValue
Recipe value represents a data that is then used to perform an atomic operation which is then used in composition of Configuration Recipe.  This object either includes the data itself (in json form or as simple string) or is a reference where the data can be obtained from (from a Configuration Recipe say).  Only one field is to be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asJson** | **String** | Field to allow providing a potentially complex json value. | [optional] [default to String]
**asString** | **String** | For simple value, a single input value, note complex nested objects are not allowed here. | [optional] [default to String]
**fromRecipe** | [**FromRecipe**](FromRecipe.md) |  | [optional] [default to FromRecipe]

```java
import com.finbourne.lusid.model.RecipeValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String AsJson = "example AsJson";
@jakarta.annotation.Nullable String AsString = "example AsString";
FromRecipe FromRecipe = new FromRecipe();


RecipeValue recipeValueInstance = new RecipeValue()
    .AsJson(AsJson)
    .AsString(AsString)
    .FromRecipe(FromRecipe);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
