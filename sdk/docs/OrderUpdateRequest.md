# com.finbourne.lusid.model.OrderUpdateRequest
A request to create or update a Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [optional] [default to String]

```java
import com.finbourne.lusid.model.OrderUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
CurrencyAndAmount Price = new CurrencyAndAmount();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();
@jakarta.annotation.Nullable OffsetDateTime Date = OffsetDateTime.now();
@jakarta.annotation.Nullable String Side = "example Side";


OrderUpdateRequest orderUpdateRequestInstance = new OrderUpdateRequest()
    .Id(Id)
    .Quantity(Quantity)
    .PortfolioId(PortfolioId)
    .Properties(Properties)
    .Price(Price)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .Date(Date)
    .Side(Side);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
