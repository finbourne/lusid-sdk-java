# com.finbourne.lusid.model.GetQuotesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, Quote&gt;**](Quote.md) | The quotes which have been successfully retrieved. | [optional] [default to Map<String, Quote>]
**notFound** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be found along with a reason why. | [optional] [default to Map<String, ErrorDetail>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be retrieved due to an error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetQuotesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, Quote> Values = new Map<String, Quote>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> NotFound = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetQuotesResponse getQuotesResponseInstance = new GetQuotesResponse()
    .Href(Href)
    .Values(Values)
    .NotFound(NotFound)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
