# com.finbourne.lusid.model.GetVirtualDocumentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, VirtualDocument&gt;**](VirtualDocument.md) | The set of values that were successfully retrieved. | [optional] [default to Map<String, VirtualDocument>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The set of calues that could not be retrieved along with a reason for this, e.g. badly formed request. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetVirtualDocumentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, VirtualDocument> Values = new Map<String, VirtualDocument>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetVirtualDocumentResponse getVirtualDocumentResponseInstance = new GetVirtualDocumentResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
