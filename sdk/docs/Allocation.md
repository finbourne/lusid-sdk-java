# com.finbourne.lusid.model.Allocation
An Allocation of a certain quantity of a specific instrument against an originating  Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument allocated. | [default to java.math.BigDecimal]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | [default to Map<String, String>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument allocated. | [default to String]
**placementIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A placement - also known as an order placed in the market - associated with this allocation. | [optional] [default to List<ResourceId>]
**state** | **String** | The state of this allocation. | [optional] [default to String]
**side** | **String** | The side of this allocation (examples: Buy, Sell, ...). | [optional] [default to String]
**type** | **String** | The type of order associated with this allocation (examples: Limit, Market, ...). | [optional] [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date for this allocation. | [optional] [default to OffsetDateTime]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of this allocation. | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**settlementCurrency** | **String** | The settlement currency of this allocation. | [optional] [default to String]
**settlementCurrencyFxRate** | **java.math.BigDecimal** | The settlement currency to allocation currency FX rate. | [optional] [default to java.math.BigDecimal]
**counterparty** | **String** | The counterparty for this allocation. | [optional] [default to String]
**executionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The executions associated with this allocation | [optional] [default to List<ResourceId>]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Allocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId AllocatedOrderId = new ResourceId();
ResourceId PortfolioId = new ResourceId();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable List<ResourceId> PlacementIds = new List<ResourceId>();
@jakarta.annotation.Nullable String State = "example State";
@jakarta.annotation.Nullable String Side = "example Side";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
OffsetDateTime Date = OffsetDateTime.now();
CurrencyAndAmount Price = new CurrencyAndAmount();
@jakarta.annotation.Nullable String SettlementCurrency = "example SettlementCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal SettlementCurrencyFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable List<ResourceId> ExecutionIds = new List<ResourceId>();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Allocation allocationInstance = new Allocation()
    .Id(Id)
    .AllocatedOrderId(AllocatedOrderId)
    .PortfolioId(PortfolioId)
    .Quantity(Quantity)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Version(Version)
    .Properties(Properties)
    .InstrumentScope(InstrumentScope)
    .LusidInstrumentId(LusidInstrumentId)
    .PlacementIds(PlacementIds)
    .State(State)
    .Side(Side)
    .Type(Type)
    .SettlementDate(SettlementDate)
    .Date(Date)
    .Price(Price)
    .SettlementCurrency(SettlementCurrency)
    .SettlementCurrencyFxRate(SettlementCurrencyFxRate)
    .Counterparty(Counterparty)
    .ExecutionIds(ExecutionIds)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
