# com.finbourne.lusid.model.UpsertRecipeRequest
A recipe that is to be stored in the recipe structured data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationRecipe** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  | [optional] [default to ConfigurationRecipe]

```java
import com.finbourne.lusid.model.UpsertRecipeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ConfigurationRecipe ConfigurationRecipe = new ConfigurationRecipe();


UpsertRecipeRequest upsertRecipeRequestInstance = new UpsertRecipeRequest()
    .ConfigurationRecipe(ConfigurationRecipe);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
