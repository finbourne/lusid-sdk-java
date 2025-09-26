# com.finbourne.lusid.model.CompositeBreakdownResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;CompositeBreakdown&gt;&gt;**](List.md) | The Composite calculation with the constituens which were included. | [default to Map<String, List<CompositeBreakdown>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CompositeBreakdownResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Map<String, List<CompositeBreakdown>> Results = new Map<String, List<CompositeBreakdown>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CompositeBreakdownResponse compositeBreakdownResponseInstance = new CompositeBreakdownResponse()
    .Href(Href)
    .Results(Results)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
