# com.finbourne.lusid.model.AggregatedReturnsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;AggregatedReturn&gt;&gt;**](List.md) | Aggregated returns grouped by ReturnId | [optional] [default to Map<String, List<AggregatedReturn>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AggregatedReturnsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, List<AggregatedReturn>> Results = new Map<String, List<AggregatedReturn>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AggregatedReturnsResponse aggregatedReturnsResponseInstance = new AggregatedReturnsResponse()
    .Href(Href)
    .Results(Results)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
