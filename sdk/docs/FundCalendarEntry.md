# com.finbourne.lusid.model.FundCalendarEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry. | [default to String]
**variant** | **String** | The Variant of the Calendar Entry. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [default to String]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**previousEntry** | [**PreviousFundCalendarEntry**](PreviousFundCalendarEntry.md) |  | [optional] [default to PreviousFundCalendarEntry]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**entryType** | **String** | The type of the Fund Calendar Entry. Only &#39;ValuationPoint&#39; currently supported. The available values are: ValuationPointFundCalendarEntry, BookmarkFundCalendarEntry | [default to String]
**status** | **String** | The status of the Fund Calendar Entry. Can be &#39;Estimate&#39;, &#39;Candidate&#39; or &#39;Final&#39;. | [optional] [default to String]
**applyClearDown** | **Boolean** | Set to true if that closed period shoould have the clear down applied. | [default to Boolean]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to Latest. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to Latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties for the Calendar Entry. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]

```java
import com.finbourne.lusid.model.FundCalendarEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Variant = "example Variant";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String NavTypeCode = "example NavTypeCode";
ResourceId TimelineId = new ResourceId();
PreviousFundCalendarEntry PreviousEntry = new PreviousFundCalendarEntry();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
String EntryType = "example EntryType";
@jakarta.annotation.Nullable String Status = "example Status";
Boolean ApplyClearDown = true;
@jakarta.annotation.Nullable OffsetDateTime HoldingsAsAtOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValuationsAsAtOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


FundCalendarEntry fundCalendarEntryInstance = new FundCalendarEntry()
    .Code(Code)
    .Variant(Variant)
    .DisplayName(DisplayName)
    .Description(Description)
    .NavTypeCode(NavTypeCode)
    .TimelineId(TimelineId)
    .PreviousEntry(PreviousEntry)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .EntryType(EntryType)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .HoldingsAsAtOverride(HoldingsAsAtOverride)
    .ValuationsAsAtOverride(ValuationsAsAtOverride)
    .Properties(Properties)
    .Version(Version)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
