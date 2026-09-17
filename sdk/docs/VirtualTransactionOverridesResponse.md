# com.finbourne.lusid.model.VirtualTransactionOverridesResponse
The overrides and suppressions affecting a single instrument event in the requested portfolio. A derived  portfolio is affected by its own record and by every record held by an ancestor, so one record per  holding portfolio is returned, nearest first.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**instrumentEventId** | **String** | The identifier of the instrument event whose overrides and suppressions are returned. | [default to String]
**records** | [**List&lt;VirtualTransactionOverrideRecord&gt;**](VirtualTransactionOverrideRecord.md) | The override and suppression records affecting the requested portfolio for this instrument event, nearest first. A derived portfolio is affected by its own record and by every record held by an ancestor. | [optional] [default to List<VirtualTransactionOverrideRecord>]
**live** | **List&lt;String&gt;** | The virtual transaction ids the event currently generates in the requested portfolio that no returned record targets, and so keep generating unmodified. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.VirtualTransactionOverridesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String InstrumentEventId = "example InstrumentEventId";
@jakarta.annotation.Nullable List<VirtualTransactionOverrideRecord> Records = new List<VirtualTransactionOverrideRecord>();
@jakarta.annotation.Nullable List<String> Live = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VirtualTransactionOverridesResponse virtualTransactionOverridesResponseInstance = new VirtualTransactionOverridesResponse()
    .Version(Version)
    .Href(Href)
    .InstrumentEventId(InstrumentEventId)
    .Records(Records)
    .Live(Live)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
