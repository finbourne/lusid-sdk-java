# com.finbourne.lusid.model.OrderRequest
A request to create or update an Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [default to String]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstruction** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**_package** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.lusid.model.OrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String Side = "example Side";
ResourceId OrderBookId = new ResourceId();
ResourceId PortfolioId = new ResourceId();
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String State = "example State";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String TimeInForce = "example TimeInForce";
OffsetDateTime Date = OffsetDateTime.now();
CurrencyAndAmount Price = new CurrencyAndAmount();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();
ResourceId OrderInstruction = new ResourceId();
ResourceId Package = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount Amount = new CurrencyAndAmount();


OrderRequest orderRequestInstance = new OrderRequest()
    .Properties(Properties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .Side(Side)
    .OrderBookId(OrderBookId)
    .PortfolioId(PortfolioId)
    .Id(Id)
    .State(State)
    .Type(Type)
    .TimeInForce(TimeInForce)
    .Date(Date)
    .Price(Price)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .OrderInstruction(OrderInstruction)
    .Package(Package)
    .Weight(Weight)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
