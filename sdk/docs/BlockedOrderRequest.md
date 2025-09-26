# com.finbourne.lusid.model.BlockedOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [default to java.math.BigDecimal]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstruction** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**_package** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [optional] [default to String]

```java
import com.finbourne.lusid.model.BlockedOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
ResourceId OrderBookId = new ResourceId();
ResourceId PortfolioId = new ResourceId();
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String State = "example State";
OffsetDateTime Date = OffsetDateTime.now();
CurrencyAndAmount Price = new CurrencyAndAmount();
ResourceId OrderInstruction = new ResourceId();
ResourceId Package = new ResourceId();
@jakarta.annotation.Nullable String Side = "example Side";


BlockedOrderRequest blockedOrderRequestInstance = new BlockedOrderRequest()
    .Properties(Properties)
    .Quantity(Quantity)
    .OrderBookId(OrderBookId)
    .PortfolioId(PortfolioId)
    .Id(Id)
    .State(State)
    .Date(Date)
    .Price(Price)
    .OrderInstruction(OrderInstruction)
    .Package(Package)
    .Side(Side);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
