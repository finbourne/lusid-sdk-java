# com.finbourne.lusid.model.UpsertRecipeComposerRequest
A recipe composer that is to be stored in the recipe composer data store or used for inline resolving.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeComposer** | [**RecipeComposer**](RecipeComposer.md) |  | [optional] [default to RecipeComposer]

```java
import com.finbourne.lusid.model.UpsertRecipeComposerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecipeComposer RecipeComposer = new RecipeComposer();


UpsertRecipeComposerRequest upsertRecipeComposerRequestInstance = new UpsertRecipeComposerRequest()
    .RecipeComposer(RecipeComposer);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
