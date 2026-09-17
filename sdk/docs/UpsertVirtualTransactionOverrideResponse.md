# com.finbourne.lusid.model.UpsertVirtualTransactionOverrideResponse
The result of upserting overrides and suppressions of virtual transactions for a single instrument event.  Returns the record as it was persisted and the new version of the record. Whether each entry currently  applies, and which virtual transactions the event still generates unmodified.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to unresolved instruments, non-existent transaction types, sub-holding key mismatches, or closed accounting periods for the override transactions. | [optional] [default to Map<String, List<ResponseMetaData>>]
**instrumentEventId** | **String** | The identifier of the instrument event that was overridden. | [default to String]
**overrides** | [**Map&lt;String, List&lt;StoredOverrideDefinition&gt;&gt;**](List.md) | The replacement transactions persisted for the instrument event, keyed by the virtual transaction id being overridden. | [optional] [default to Map<String, List<StoredOverrideDefinition>>]
**suppressions** | **List&lt;String&gt;** | The virtual transaction ids suppressed for the instrument event. | [optional] [default to List<String>]
**cancelActive** | **Boolean** | True when an active event-level Cancel instruction also exists for this instrument event, taking precedence over the entries in this record. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertVirtualTransactionOverrideResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
String InstrumentEventId = "example InstrumentEventId";
@jakarta.annotation.Nullable Map<String, List<StoredOverrideDefinition>> Overrides = new Map<String, List<StoredOverrideDefinition>>();
@jakarta.annotation.Nullable List<String> Suppressions = new List<String>();
@jakarta.annotation.Nullable Boolean CancelActive = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertVirtualTransactionOverrideResponse upsertVirtualTransactionOverrideResponseInstance = new UpsertVirtualTransactionOverrideResponse()
    .Version(Version)
    .Href(Href)
    .Metadata(Metadata)
    .InstrumentEventId(InstrumentEventId)
    .Overrides(Overrides)
    .Suppressions(Suppressions)
    .CancelActive(CancelActive)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
