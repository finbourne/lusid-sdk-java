# com.finbourne.lusid.model.FundCalendarEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry | [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [default to String]
**previousEntry** | [**PreviousFundCalendarEntry**](PreviousFundCalendarEntry.md) |  | [optional] [default to PreviousFundCalendarEntry]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**entryType** | **String** | The type of the Fund Calendar Entry. Only &#39;ValuationPoint&#39; currently supported. The available values are: ValuationPointFundCalendarEntry, BookmarkFundCalendarEntry | [default to String]
**status** | **String** | The status of the Fund Calendar Entry. Can be &#39;Estimate&#39;, &#39;Candidate&#39; or &#39;Final&#39;. | [optional] [default to String]
**applyClearDown** | **Boolean** | Set to true if that closed period shoould have the clear down applied. | [default to Boolean]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties for the Calendar Entry. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]

```java
import com.finbourne.lusid.model.FundCalendarEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String NavTypeCode = "example NavTypeCode";
PreviousFundCalendarEntry PreviousEntry = new PreviousFundCalendarEntry();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
String EntryType = "example EntryType";
@jakarta.annotation.Nullable String Status = "example Status";
Boolean ApplyClearDown = true;
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


FundCalendarEntry fundCalendarEntryInstance = new FundCalendarEntry()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .NavTypeCode(NavTypeCode)
    .PreviousEntry(PreviousEntry)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .EntryType(EntryType)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .Properties(Properties)
    .Version(Version)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
