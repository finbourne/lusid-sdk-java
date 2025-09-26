# com.finbourne.lusid.model.RecipeComposer
Recipe composer is an object used to dynamically compose Configuration Recipe from atomic operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used when updating or inserting the Recipe Composer. | [default to String]
**code** | **String** | User given string name (code) to identify the recipe. | [default to String]
**operations** | [**List&lt;RecipeBlock&gt;**](RecipeBlock.md) | Atomic operations used to compose a Configuration Recipe. | [optional] [default to List<RecipeBlock>]

```java
import com.finbourne.lusid.model.RecipeComposer;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable List<RecipeBlock> Operations = new List<RecipeBlock>();


RecipeComposer recipeComposerInstance = new RecipeComposer()
    .Scope(Scope)
    .Code(Code)
    .Operations(Operations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
