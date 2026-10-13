# com.finbourne.lusid.model.AllocationEvent
One economic event shared across the participants of an Allocation Map: raised as a draft, computed into  per-investor shares, and finally booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** | A description of the Allocation Event. | [optional] [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default, Commitment or DealFunding. Selects the basis rule from the map. A recall is a CapitalCall with a Recall component. A Commitment event is not shared from a basis: its basis values are the signed commitment amounts per commitment line, and they must sum to the amount. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**status** | **String** | The lifecycle status of the event: Draft until its shares are computed, Computed once they are, Booking while its postings are being written, Booked once they all are, and Reversed once a booked event has been backed out. Available values: Draft, Computed, Booked, Booking, Reversed. | [default to String]
**basisSource** | **String** | Where the basis values came from when the shares were last computed. | [optional] [default to String]
**allocations** | [**List&lt;AllocationMapAllocation&gt;**](AllocationMapAllocation.md) | The per-investor shares of the amount, as last computed. | [default to List<AllocationMapAllocation>]
**bookingReference** | **String** | The reference under which the shares were posted. Set only once the event is booked. | [optional] [default to String]
**bookedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the event was booked. | [optional] [default to OffsetDateTime]
**reallocationReason** | **String** | The reason given when the event was last recomputed, if it has been. | [optional] [default to String]
**components** | [**List&lt;AllocationEventComponent&gt;**](AllocationEventComponent.md) | The parts the amount splits into, each shared on its own basis and booked to its own slot. The component amounts must sum to the event amount. Absent means the whole amount is one component: Investment for a CapitalCall, ROC for a Distribution. | [optional] [default to List<AllocationEventComponent>]
**residuals** | [**List&lt;AllocationEventRoundingResidual&gt;**](AllocationEventRoundingResidual.md) | The minor units left over when each component&#39;s shares were rounded to the currency, and which investor records took them. | [optional] [default to List<AllocationEventRoundingResidual>]
**basisDiagnostics** | [**AllocationEventBasisDiagnostics**](AllocationEventBasisDiagnostics.md) |  | [optional] [default to AllocationEventBasisDiagnostics]
**writtenIds** | **List&lt;String&gt;** | The identifiers of the postings the booking has written so far, in write order. Complete once the event is Booked. | [optional] [default to List<String>]
**bookingErrors** | [**List&lt;AllocationEventBookingError&gt;**](AllocationEventBookingError.md) | The postings the booking could not write. Non-empty leaves the event in Booking; book again under the same reference to resume, or unbook to cancel what was written. | [optional] [default to List<AllocationEventBookingError>]
**warnings** | [**List&lt;AllocationEventBookingWarning&gt;**](AllocationEventBookingWarning.md) | The validation rules the booking was allowed to proceed through under the map&#39;s policy, for instance an OverCall on a map that warns rather than refuses. Kept for the life of the event. | [optional] [default to List<AllocationEventBookingWarning>]
**transfers** | [**List&lt;AllocationEventTransfer&gt;**](AllocationEventTransfer.md) | For a Transfer event, the legs to book: each moves a fraction of one capital interest line to another. Required for a Transfer event and not allowed on any other type. The fractions out of one line must sum to at most one; the amount of a Transfer event is zero. | [optional] [default to List<AllocationEventTransfer>]
**equalisation** | [**AllocationEventEqualisation**](AllocationEventEqualisation.md) |  | [optional] [default to AllocationEventEqualisation]
**useOfProceeds** | [**List&lt;AllocationEventUseOfProceeds&gt;**](AllocationEventUseOfProceeds.md) | For a CapitalCall, what the call pays for: rows of purpose, deal and amount that sum to the call amount. An Investment row names a deal the vehicle has funded and is shared under that deal&#39;s participation, with each investor&#39;s share recorded as paid in for that deal; when the deal was funded from a facility the row repays the draw. Not allowed with components or on any other event type. | [optional] [default to List<AllocationEventUseOfProceeds>]
**dealFunding** | [**AllocationEventDealFunding**](AllocationEventDealFunding.md) |  | [optional] [default to AllocationEventDealFunding]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**parentAllocationEventId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**replaces** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reversal** | [**AllocationEventReversal**](AllocationEventReversal.md) |  | [optional] [default to AllocationEventReversal]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the notice went to investors. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the investors&#39; cash is due. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the postings settle. Defaults to the event date. | [optional] [default to OffsetDateTime]
**receipts** | [**List&lt;AllocationEventReceipt&gt;**](AllocationEventReceipt.md) | The cash received against the event, in the order it was recorded. | [optional] [default to List<AllocationEventReceipt>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AllocationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId AllocationMapId = new ResourceId();
String EventType = "example EventType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime EventDate = OffsetDateTime.now();
String Status = "example Status";
@jakarta.annotation.Nullable String BasisSource = "example BasisSource";
List<AllocationMapAllocation> Allocations = new List<AllocationMapAllocation>();
@jakarta.annotation.Nullable String BookingReference = "example BookingReference";
@jakarta.annotation.Nullable OffsetDateTime BookedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String ReallocationReason = "example ReallocationReason";
@jakarta.annotation.Nullable List<AllocationEventComponent> Components = new List<AllocationEventComponent>();
@jakarta.annotation.Nullable List<AllocationEventRoundingResidual> Residuals = new List<AllocationEventRoundingResidual>();
AllocationEventBasisDiagnostics BasisDiagnostics = new AllocationEventBasisDiagnostics();
@jakarta.annotation.Nullable List<String> WrittenIds = new List<String>();
@jakarta.annotation.Nullable List<AllocationEventBookingError> BookingErrors = new List<AllocationEventBookingError>();
@jakarta.annotation.Nullable List<AllocationEventBookingWarning> Warnings = new List<AllocationEventBookingWarning>();
@jakarta.annotation.Nullable List<AllocationEventTransfer> Transfers = new List<AllocationEventTransfer>();
AllocationEventEqualisation Equalisation = new AllocationEventEqualisation();
@jakarta.annotation.Nullable List<AllocationEventUseOfProceeds> UseOfProceeds = new List<AllocationEventUseOfProceeds>();
AllocationEventDealFunding DealFunding = new AllocationEventDealFunding();
Version Version = new Version();
ResourceId ParentAllocationEventId = new ResourceId();
ResourceId Replaces = new ResourceId();
AllocationEventReversal Reversal = new AllocationEventReversal();
@jakarta.annotation.Nullable OffsetDateTime NoticeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DueDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<AllocationEventReceipt> Receipts = new List<AllocationEventReceipt>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AllocationEvent allocationEventInstance = new AllocationEvent()
    .Href(Href)
    .Id(Id)
    .Description(Description)
    .AllocationMapId(AllocationMapId)
    .EventType(EventType)
    .Amount(Amount)
    .Currency(Currency)
    .EventDate(EventDate)
    .Status(Status)
    .BasisSource(BasisSource)
    .Allocations(Allocations)
    .BookingReference(BookingReference)
    .BookedAt(BookedAt)
    .ReallocationReason(ReallocationReason)
    .Components(Components)
    .Residuals(Residuals)
    .BasisDiagnostics(BasisDiagnostics)
    .WrittenIds(WrittenIds)
    .BookingErrors(BookingErrors)
    .Warnings(Warnings)
    .Transfers(Transfers)
    .Equalisation(Equalisation)
    .UseOfProceeds(UseOfProceeds)
    .DealFunding(DealFunding)
    .Version(Version)
    .ParentAllocationEventId(ParentAllocationEventId)
    .Replaces(Replaces)
    .Reversal(Reversal)
    .NoticeDate(NoticeDate)
    .DueDate(DueDate)
    .SettlementDate(SettlementDate)
    .Receipts(Receipts)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
