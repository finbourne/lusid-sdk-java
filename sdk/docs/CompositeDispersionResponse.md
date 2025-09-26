# com.finbourne.lusid.model.CompositeDispersionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;CompositeDispersion&gt;&gt;**](List.md) | Dispersion returns calculation grouped by ReturnId | [optional] [default to Map<String, List<CompositeDispersion>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CompositeDispersionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, List<CompositeDispersion>> Results = new Map<String, List<CompositeDispersion>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CompositeDispersionResponse compositeDispersionResponseInstance = new CompositeDispersionResponse()
    .Href(Href)
    .Results(Results)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
