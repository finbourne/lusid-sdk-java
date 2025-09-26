# com.finbourne.lusid.model.CancelOrdersAndMoveRemainingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CancelOrderAndMoveRemainingResult&gt;**](CancelOrderAndMoveRemainingResult.md) | The orders which have been successfully cancelled, and any remaining quantities moved. | [optional] [default to Map<String, CancelOrderAndMoveRemainingResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The orders that could not be cancelled, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Meta data associated with the cancellation event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CancelOrdersAndMoveRemainingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, CancelOrderAndMoveRemainingResult> Values = new Map<String, CancelOrderAndMoveRemainingResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CancelOrdersAndMoveRemainingResponse cancelOrdersAndMoveRemainingResponseInstance = new CancelOrdersAndMoveRemainingResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
