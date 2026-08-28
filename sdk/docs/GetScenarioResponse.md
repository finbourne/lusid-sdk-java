# com.finbourne.lusid.model.GetScenarioResponse
The response to a singular scenario read. There is deliberately no failure block on this  type: every route returning it is a singular (or list-of-singular) read, never a batch keyed  lookup, so there is no per-key error to report - an invalid entity is rejected at upsert and  a failed read fails the whole request. The IGetResponse batch members below throw for the  same reason; do not reintroduce a Failed property when copying this shape.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**ScenarioDefinition**](ScenarioDefinition.md) |  | [optional] [default to ScenarioDefinition]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetScenarioResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ScenarioDefinition Value = new ScenarioDefinition();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetScenarioResponse getScenarioResponseInstance = new GetScenarioResponse()
    .Href(Href)
    .Value(Value)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
