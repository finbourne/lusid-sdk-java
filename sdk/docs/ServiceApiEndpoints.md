# com.finbourne.lusid.model.ServiceApiEndpoints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [default to String]
**endpoints** | [**List&lt;ApiEndpoint&gt;**](ApiEndpoint.md) |  | [default to List<ApiEndpoint>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ServiceApiEndpoints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Application = "example Application";
List<ApiEndpoint> Endpoints = new List<ApiEndpoint>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ServiceApiEndpoints serviceApiEndpointsInstance = new ServiceApiEndpoints()
    .Application(Application)
    .Endpoints(Endpoints)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
