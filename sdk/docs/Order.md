# com.finbourne.lusid.model.Order
An Order for a certain quantity of a specific instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [default to String]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | [default to String]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstructionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**packageId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Order;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Version Version = new Version();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String Side = "example Side";
ResourceId OrderBookId = new ResourceId();
ResourceId PortfolioId = new ResourceId();
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String State = "example State";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String TimeInForce = "example TimeInForce";
OffsetDateTime Date = OffsetDateTime.now();
CurrencyAndAmount Price = new CurrencyAndAmount();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();
ResourceId OrderInstructionId = new ResourceId();
ResourceId PackageId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount Amount = new CurrencyAndAmount();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Order orderInstance = new Order()
    .Properties(Properties)
    .Version(Version)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .Side(Side)
    .OrderBookId(OrderBookId)
    .PortfolioId(PortfolioId)
    .Id(Id)
    .InstrumentScope(InstrumentScope)
    .LusidInstrumentId(LusidInstrumentId)
    .State(State)
    .Type(Type)
    .TimeInForce(TimeInForce)
    .Date(Date)
    .Price(Price)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .OrderInstructionId(OrderInstructionId)
    .PackageId(PackageId)
    .Weight(Weight)
    .Amount(Amount)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
