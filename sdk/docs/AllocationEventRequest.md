# com.finbourne.lusid.model.AllocationEventRequest
The request used to raise or replace an Allocation Event. The event is computed against its map straight away.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Allocation Event. Together with the scope this uniquely identifies the event. | [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default, Commitment or DealFunding. Selects the basis rule from the map. A recall is a CapitalCall with a Recall component. A Commitment event is not shared from a basis: its basis values are the signed commitment amounts per commitment line, and they must sum to the amount. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**description** | **String** | A description of the Allocation Event. | [optional] [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | Optional basis values per investor record, used when the map&#39;s basis is not resolvable from stored data. | [optional] [default to List<AllocationMapBasisValue>]
**components** | [**List&lt;AllocationEventComponent&gt;**](AllocationEventComponent.md) | The parts the amount splits into, each shared on its own basis and booked to its own slot. The component amounts must sum to the event amount. Absent means the whole amount is one component: Investment for a CapitalCall, ROC for a Distribution. | [optional] [default to List<AllocationEventComponent>]
**transfers** | [**List&lt;AllocationEventTransfer&gt;**](AllocationEventTransfer.md) | For a Transfer event, the legs to book: each moves a fraction of one capital interest line to another. Required for a Transfer event and not allowed on any other type. The fractions out of one line must sum to at most one; the amount of a Transfer event is zero. | [optional] [default to List<AllocationEventTransfer>]
**equalisation** | [**AllocationEventEqualisation**](AllocationEventEqualisation.md) |  | [optional] [default to AllocationEventEqualisation]
**useOfProceeds** | [**List&lt;AllocationEventUseOfProceeds&gt;**](AllocationEventUseOfProceeds.md) | For a CapitalCall, what the call pays for: rows of purpose, deal and amount that sum to the call amount. An Investment row names a deal the vehicle has funded and is shared under that deal&#39;s participation, with each investor&#39;s share recorded as paid in for that deal; when the deal was funded from a facility the row repays the draw. Not allowed with components or on any other event type. | [optional] [default to List<AllocationEventUseOfProceeds>]
**dealFunding** | [**AllocationEventDealFunding**](AllocationEventDealFunding.md) |  | [optional] [default to AllocationEventDealFunding]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the event is created or replaced. Defaults to the earliest effective time on create and the current LUSID system datetime on replace. | [optional] [default to OffsetDateTime]
**replaces** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the notice went to investors. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the investors&#39; cash is due. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the postings settle. Defaults to the event date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
ResourceId AllocationMapId = new ResourceId();
String EventType = "example EventType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime EventDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<AllocationMapBasisValue> BasisValues = new List<AllocationMapBasisValue>();
@jakarta.annotation.Nullable List<AllocationEventComponent> Components = new List<AllocationEventComponent>();
@jakarta.annotation.Nullable List<AllocationEventTransfer> Transfers = new List<AllocationEventTransfer>();
AllocationEventEqualisation Equalisation = new AllocationEventEqualisation();
@jakarta.annotation.Nullable List<AllocationEventUseOfProceeds> UseOfProceeds = new List<AllocationEventUseOfProceeds>();
AllocationEventDealFunding DealFunding = new AllocationEventDealFunding();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
ResourceId Replaces = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime NoticeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DueDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();


AllocationEventRequest allocationEventRequestInstance = new AllocationEventRequest()
    .Code(Code)
    .AllocationMapId(AllocationMapId)
    .EventType(EventType)
    .Amount(Amount)
    .Currency(Currency)
    .EventDate(EventDate)
    .Description(Description)
    .BasisValues(BasisValues)
    .Components(Components)
    .Transfers(Transfers)
    .Equalisation(Equalisation)
    .UseOfProceeds(UseOfProceeds)
    .DealFunding(DealFunding)
    .EffectiveAt(EffectiveAt)
    .Replaces(Replaces)
    .NoticeDate(NoticeDate)
    .DueDate(DueDate)
    .SettlementDate(SettlementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
