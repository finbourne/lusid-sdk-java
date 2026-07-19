# com.finbourne.lusid.model.GetScenarioResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**ScenarioDefinition**](ScenarioDefinition.md) |  | [optional] [default to ScenarioDefinition]
**failed** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetScenarioResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ScenarioDefinition Value = new ScenarioDefinition();
ErrorDetail Failed = new ErrorDetail();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetScenarioResponse getScenarioResponseInstance = new GetScenarioResponse()
    .Href(Href)
    .Value(Value)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
