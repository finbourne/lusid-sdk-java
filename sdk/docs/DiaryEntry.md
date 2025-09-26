# com.finbourne.lusid.model.DiaryEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**aborId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**diaryEntryCode** | **String** | The code of the diary entry. | [optional] [default to String]
**type** | **String** | The type of the diary entry. | [default to String]
**name** | **String** | The name of the diary entry. | [optional] [default to String]
**status** | **String** | The status of the diary entry. Statuses are constrained and defaulted by &#39;Type&#39; specified.   Type &#39;Other&#39; defaults to &#39;Undefined&#39; and supports &#39;Undefined&#39;, &#39;Estimate&#39;, &#39;Candidate&#39;, and &#39;Final&#39;.  Type &#39;PeriodBoundary&#39; defaults to &#39;Estimate&#39; when closing a period, and supports &#39;Estimate&#39; and &#39;Final&#39; for closing periods and &#39;Final&#39; for locking periods.  Type &#39;ValuationPoint&#39; defaults to &#39;Estimate&#39; when upserting a diary entry, moves to &#39;Candidate&#39; or &#39;Final&#39; when a ValuationPoint is accepted, and &#39;Final&#39; when it is finalised. | [default to String]
**applyClearDown** | **Boolean** | Defaults to false. Set to true if you want that the closed period to have the clear down applied. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**previousEntryTime** | [**OffsetDateTime**](OffsetDateTime.md) | The entry time of the previous diary entry. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DiaryEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId AborId = new ResourceId();
@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
String Type = "example Type";
@jakarta.annotation.Nullable String Name = "example Name";
String Status = "example Status";
Boolean ApplyClearDown = true;
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime QueryAsAt = OffsetDateTime.now();
OffsetDateTime PreviousEntryTime = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DiaryEntry diaryEntryInstance = new DiaryEntry()
    .Href(Href)
    .AborId(AborId)
    .DiaryEntryCode(DiaryEntryCode)
    .Type(Type)
    .Name(Name)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .PreviousEntryTime(PreviousEntryTime)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
