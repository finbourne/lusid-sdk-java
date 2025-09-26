# com.finbourne.lusid.model.GetRecipeResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  | [optional] [default to ConfigurationRecipe]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetRecipeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ConfigurationRecipe Value = new ConfigurationRecipe();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetRecipeResponse getRecipeResponseInstance = new GetRecipeResponse()
    .Href(Href)
    .Value(Value)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
