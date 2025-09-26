# com.finbourne.lusid.model.UpsertInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments which have been successfully updated or created. | [optional] [default to Map<String, Instrument>]
**staged** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments that have been staged for updation or creation. | [optional] [default to Map<String, Instrument>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instruments that could not be updated or created or were left unchanged without error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Meta data associated with the upsert event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertInstrumentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, Instrument> Values = new Map<String, Instrument>();
@jakarta.annotation.Nullable Map<String, Instrument> Staged = new Map<String, Instrument>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertInstrumentsResponse upsertInstrumentsResponseInstance = new UpsertInstrumentsResponse()
    .Href(Href)
    .Values(Values)
    .Staged(Staged)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
