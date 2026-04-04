# com.finbourne.lusid.model.OverrideVirtualTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to unresolved instruments or non-existent transaction types for the override transactions. | [optional] [default to Map<String, List<ResponseMetaData>>]
**instrumentEventId** | **String** | The identifier of the instrument event that was overridden. | [default to String]
**cancelInstructionId** | **String** | The identifier of the cancel instruction that was created for the overridden instrument event. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.OverrideVirtualTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
String InstrumentEventId = "example InstrumentEventId";
String CancelInstructionId = "example CancelInstructionId";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


OverrideVirtualTransactionsResponse overrideVirtualTransactionsResponseInstance = new OverrideVirtualTransactionsResponse()
    .Version(Version)
    .Href(Href)
    .Metadata(Metadata)
    .InstrumentEventId(InstrumentEventId)
    .CancelInstructionId(CancelInstructionId)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
