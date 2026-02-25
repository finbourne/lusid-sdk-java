# com.finbourne.lusid.model.FundEstimateValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry. | [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [default to String]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**previousEntry** | [**PreviousFundCalendarEntry**](PreviousFundCalendarEntry.md) |  | [optional] [default to PreviousFundCalendarEntry]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**entryType** | **String** | The type of the Fund Calendar Entry. The available values are: FinalisedValuationPoint, FundEstimateValuationPoint, FundBookmark | [default to String]
**status** | **String** | The status of the Fund Calendar Entry. Can be &#39;Estimate&#39;, &#39;Unofficial&#39; or &#39;Final&#39;. | [optional] [default to String]
**applyClearDown** | **Boolean** | Set to true if that closed period should have the clear down applied. | [optional] [default to Boolean]
**leaderNavTypeCode** | **String** | The code of the Nav Type that this Nav Type will follow when set. | [optional] [default to String]
**variants** | [**List&lt;EstimateVariant&gt;**](EstimateVariant.md) | The variants of the Estimate Valuation Point.  | [optional] [default to List<EstimateVariant>]

```java
import com.finbourne.lusid.model.FundEstimateValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String NavTypeCode = "example NavTypeCode";
ResourceId TimelineId = new ResourceId();
PreviousFundCalendarEntry PreviousEntry = new PreviousFundCalendarEntry();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
String EntryType = "example EntryType";
@jakarta.annotation.Nullable String Status = "example Status";
Boolean ApplyClearDown = true;
@jakarta.annotation.Nullable String LeaderNavTypeCode = "example LeaderNavTypeCode";
@jakarta.annotation.Nullable List<EstimateVariant> Variants = new List<EstimateVariant>();


FundEstimateValuationPoint fundEstimateValuationPointInstance = new FundEstimateValuationPoint()
    .Code(Code)
    .NavTypeCode(NavTypeCode)
    .TimelineId(TimelineId)
    .PreviousEntry(PreviousEntry)
    .EffectiveAt(EffectiveAt)
    .EntryType(EntryType)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .LeaderNavTypeCode(LeaderNavTypeCode)
    .Variants(Variants);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
