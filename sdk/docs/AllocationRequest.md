# com.finbourne.lusid.model.AllocationRequest
A request to create or update an Allocation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument allocated. | [default to java.math.BigDecimal]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
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

```java
import com.finbourne.lusid.model.AllocationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
ResourceId PortfolioId = new ResourceId();
ResourceId AllocatedOrderId = new ResourceId();
ResourceId Id = new ResourceId();
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


AllocationRequest allocationRequestInstance = new AllocationRequest()
    .Properties(Properties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .PortfolioId(PortfolioId)
    .AllocatedOrderId(AllocatedOrderId)
    .Id(Id)
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
    .ExecutionIds(ExecutionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
