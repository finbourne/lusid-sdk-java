# com.finbourne.lusid.model.ClosedPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period | [optional] [default to String]
**displayName** | **String** | The name of the Closed Period. | [optional] [default to String]
**description** | **String** | A description for the Closed Period. | [optional] [default to String]
**effectiveStart** | [**OffsetDateTime**](OffsetDateTime.md) | The effective start of the Closed Period | [optional] [default to OffsetDateTime]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end of the Closed Period | [optional] [default to OffsetDateTime]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt closed datetime for the Closed Period | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**postCloseActivities** | [**List&lt;PostCloseActivity&gt;**](PostCloseActivity.md) | All the post close activities for the closed period. | [optional] [default to List<PostCloseActivity>]
**holdingsAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**valuationAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for performing valuations in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**branchStatus** | **String** | The branch status of the closed period, e.g. Confirmed/Unconfirmed. | [optional] [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ClosedPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ClosedPeriodId = "example ClosedPeriodId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime EffectiveStart = OffsetDateTime.now();
OffsetDateTime EffectiveEnd = OffsetDateTime.now();
OffsetDateTime AsAtClosed = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<PostCloseActivity> PostCloseActivities = new List<PostCloseActivity>();
@jakarta.annotation.Nullable OffsetDateTime HoldingsAsAtClosedOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValuationAsAtClosedOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable String BranchStatus = "example BranchStatus";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ClosedPeriod closedPeriodInstance = new ClosedPeriod()
    .ClosedPeriodId(ClosedPeriodId)
    .DisplayName(DisplayName)
    .Description(Description)
    .EffectiveStart(EffectiveStart)
    .EffectiveEnd(EffectiveEnd)
    .AsAtClosed(AsAtClosed)
    .Properties(Properties)
    .Version(Version)
    .PostCloseActivities(PostCloseActivities)
    .HoldingsAsAtClosedOverride(HoldingsAsAtClosedOverride)
    .ValuationAsAtClosedOverride(ValuationAsAtClosedOverride)
    .BranchStatus(BranchStatus)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
