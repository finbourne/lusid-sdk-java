# com.finbourne.lusid.model.GetRecipeComposerResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**RecipeComposer**](RecipeComposer.md) |  | [optional] [default to RecipeComposer]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetRecipeComposerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
RecipeComposer Value = new RecipeComposer();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetRecipeComposerResponse getRecipeComposerResponseInstance = new GetRecipeComposerResponse()
    .Href(Href)
    .Value(Value)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
