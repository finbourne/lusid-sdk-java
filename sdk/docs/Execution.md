# com.finbourne.lusid.model.Execution
The record of a number of executions against a single Placement (directly analogous to  a partial or full fill against a street order).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument execution. | [default to String]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [default to java.math.BigDecimal]
**state** | **String** | The state of this execution (typically a FIX state; Open, Filled, etc). | [default to String]
**side** | **String** | The side (Buy, Sell, ...) of this execution. | [default to String]
**type** | **String** | The type of this execution (Market, Limit, etc). | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this execution. | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The (optional) settlement date for this execution | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**settlementCurrency** | **String** | The execution&#39;s settlement currency. | [default to String]
**settlementCurrencyFxRate** | **java.math.BigDecimal** | The exectuion&#39;s settlement currency rate. | [default to java.math.BigDecimal]
**counterparty** | **String** | The market entity this placement is placed with. | [default to String]
**averagePrice** | **java.math.BigDecimal** | The average price of all executions for a given placement at the time of upsert | [optional] [default to java.math.BigDecimal]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Execution;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId PlacementId = new ResourceId();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String LusidInstrumentId = "example LusidInstrumentId";
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String State = "example State";
String Side = "example Side";
String Type = "example Type";
OffsetDateTime CreatedDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
CurrencyAndAmount Price = new CurrencyAndAmount();
String SettlementCurrency = "example SettlementCurrency";
java.math.BigDecimal SettlementCurrencyFxRate = new java.math.BigDecimal("100.00");
String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable java.math.BigDecimal AveragePrice = new java.math.BigDecimal("100.00");
Version Version = new Version();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Execution executionInstance = new Execution()
    .Id(Id)
    .PlacementId(PlacementId)
    .Properties(Properties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .Quantity(Quantity)
    .State(State)
    .Side(Side)
    .Type(Type)
    .CreatedDate(CreatedDate)
    .SettlementDate(SettlementDate)
    .Price(Price)
    .SettlementCurrency(SettlementCurrency)
    .SettlementCurrencyFxRate(SettlementCurrencyFxRate)
    .Counterparty(Counterparty)
    .AveragePrice(AveragePrice)
    .Version(Version)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
