# com.finbourne.lusid.model.HoldingEntitlement
What one holding receives under a corporate action, in the client's own figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingEntitlementId** | **String** | The unique identifier of the entitlement within the portfolio | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingId** | **Long** | The id of the holding the entitlement is for, as the holdings endpoints report it | [optional] [default to Long]
**instrumentScope** | **String** | The scope of the holding&#39;s instrument | [optional] [default to String]
**instrumentId** | **String** | The LUSID instrument identifier of the holding&#39;s instrument | [optional] [default to String]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the entitlement is booked at. Must be in UTC | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the entitlement&#39;s transactions settle. Must be in UTC and not before the ex date | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the corporate action was announced. Optional; must be in UTC and not after the ex date | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which holders are recorded as entitled. Optional; must be in UTC and not after the payment date | [optional] [default to OffsetDateTime]
**description** | **String** | A description of the entitlement | [optional] [default to String]
**parentUnitsRetained** | **java.math.BigDecimal** | The units of the parent holding that the holder keeps. The remainder of the holding leaves the parent. Cannot be given with ParentUnitsDelivered | [optional] [default to java.math.BigDecimal]
**parentUnitsDelivered** | **java.math.BigDecimal** | The units of the parent holding that leave it. The alternative to ParentUnitsRetained. Where neither is given, no units leave the parent | [optional] [default to java.math.BigDecimal]
**parentCostAdjustment** | **java.math.BigDecimal** | A signed adjustment to the parent holding&#39;s cost, apportioned across its tax lots. Used where cost moves with no child position and no cash | [optional] [default to java.math.BigDecimal]
**parentLotSelection** | **String** | How the parent&#39;s units leave its tax lots when they are realised. ProRata takes units from every lot in proportion to its units. PortfolioSalesRule takes them by the portfolio&#39;s accounting method. A departure at book value is always pro rata. The default is ProRata | [optional] [default to String]
**childLotTreatment** | **String** | The tax lots of a position that carries the parent&#39;s cost, from a CarryCost or ReceiveAndSell leg. RetainLots gives one lot for each parent lot, with that lot&#39;s purchase date. NewLot gives one lot with the ex date as its purchase date. The default is RetainLots. A ParentLotSelection of PortfolioSalesRule requires NewLot | [optional] [default to String]
**capitalAdjustmentSpread** | **String** | How a return of capital and income reclassified as capital are spread across the parent&#39;s tax lots. ByCost spreads by each lot&#39;s cost, and ByUnits by each lot&#39;s units. The default is ByCost | [optional] [default to String]
**transactionProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The transaction properties to set on every transaction the entitlement books, at most 100. Each must be in the Transaction domain. A value given here replaces the value the transaction template gives for the same property, and a leg&#39;s value replaces it on the transactions of that leg. A property that is a sub-holding key of the portfolio cannot be given | [optional] [default to Map<String, PerpetualProperty>]
**legs** | [**List&lt;EntitlementLeg&gt;**](EntitlementLeg.md) | The child positions and cash movements the corporate action produces for this holding, at most 100. May be empty where the entitlement only adjusts the parent&#39;s cost | [optional] [default to List<EntitlementLeg>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The uri for this version of this entitlement | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.HoldingEntitlement;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingEntitlementId = "example HoldingEntitlementId";
ResourceId PortfolioId = new ResourceId();
Long HoldingId = new Long("100.00");
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable java.math.BigDecimal ParentUnitsRetained = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ParentUnitsDelivered = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ParentCostAdjustment = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ParentLotSelection = "example ParentLotSelection";
@jakarta.annotation.Nullable String ChildLotTreatment = "example ChildLotTreatment";
@jakarta.annotation.Nullable String CapitalAdjustmentSpread = "example CapitalAdjustmentSpread";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> TransactionProperties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<EntitlementLeg> Legs = new List<EntitlementLeg>();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


HoldingEntitlement holdingEntitlementInstance = new HoldingEntitlement()
    .HoldingEntitlementId(HoldingEntitlementId)
    .PortfolioId(PortfolioId)
    .HoldingId(HoldingId)
    .InstrumentScope(InstrumentScope)
    .InstrumentId(InstrumentId)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .AnnouncementDate(AnnouncementDate)
    .RecordDate(RecordDate)
    .Description(Description)
    .ParentUnitsRetained(ParentUnitsRetained)
    .ParentUnitsDelivered(ParentUnitsDelivered)
    .ParentCostAdjustment(ParentCostAdjustment)
    .ParentLotSelection(ParentLotSelection)
    .ChildLotTreatment(ChildLotTreatment)
    .CapitalAdjustmentSpread(CapitalAdjustmentSpread)
    .TransactionProperties(TransactionProperties)
    .Legs(Legs)
    .Version(Version)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
