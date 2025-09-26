# com.finbourne.lusid.model.UpsertCustomEntitiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities which have been successfully updated or created. | [optional] [default to Map<String, CustomEntityResponse>]
**staged** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities that have been staged for update or creation. | [optional] [default to Map<String, CustomEntityResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The custom-entities that could not be updated or created or were left unchanged without error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertCustomEntitiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, CustomEntityResponse> Values = new Map<String, CustomEntityResponse>();
@jakarta.annotation.Nullable Map<String, CustomEntityResponse> Staged = new Map<String, CustomEntityResponse>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertCustomEntitiesResponse upsertCustomEntitiesResponseInstance = new UpsertCustomEntitiesResponse()
    .Href(Href)
    .Values(Values)
    .Staged(Staged)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
