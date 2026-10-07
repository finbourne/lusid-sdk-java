# com.finbourne.lusid.model.UpsertInstrumentEventsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, InstrumentEventHolder&gt;**](InstrumentEventHolder.md) | The instrument events which have been successfully updated or inserted. | [optional] [default to Map<String, InstrumentEventHolder>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instrument events that could not be updated or inserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**staged** | [**Map&lt;String, InstrumentEventHolder&gt;**](InstrumentEventHolder.md) | The instrument events that have been staged pending approval. | [optional] [default to Map<String, InstrumentEventHolder>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertInstrumentEventsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, InstrumentEventHolder> Values = new Map<String, InstrumentEventHolder>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, InstrumentEventHolder> Staged = new Map<String, InstrumentEventHolder>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertInstrumentEventsResponse upsertInstrumentEventsResponseInstance = new UpsertInstrumentEventsResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Staged(Staged)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
