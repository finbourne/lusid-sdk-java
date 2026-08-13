# com.finbourne.lusid.model.BatchReviewRecResultResponse
The response to a batch review request. Keyed by the client-supplied batch item key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, BatchReviewRecResultItemResult&gt;**](BatchReviewRecResultItemResult.md) | The successfully-processed batch items, keyed by the client-supplied batch item key. | [default to Map<String, BatchReviewRecResultItemResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The failed batch items, keyed by the client-supplied batch item key. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Response metadata, keyed by the client-supplied batch item key. | [optional] [default to Map<String, List<ResponseMetaData>>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchReviewRecResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, BatchReviewRecResultItemResult> Values = new Map<String, BatchReviewRecResultItemResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchReviewRecResultResponse batchReviewRecResultResponseInstance = new BatchReviewRecResultResponse()
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
