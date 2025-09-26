# com.finbourne.lusid.model.BlockRequest
A request to create or update an Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The related order ids. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The total quantity of given instrument ordered. | [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc) | [default to String]
**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) | [default to String]
**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the block was made | [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**isSwept** | **Boolean** | Swept blocks are considered no longer of active interest, and no longer take part in various order management processes | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.BlockRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
List<ResourceId> OrderIds = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String Side = "example Side";
String Type = "example Type";
String TimeInForce = "example TimeInForce";
OffsetDateTime CreatedDate = OffsetDateTime.now();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();
Boolean IsSwept = true;


BlockRequest blockRequestInstance = new BlockRequest()
    .Id(Id)
    .OrderIds(OrderIds)
    .Properties(Properties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .Side(Side)
    .Type(Type)
    .TimeInForce(TimeInForce)
    .CreatedDate(CreatedDate)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .IsSwept(IsSwept);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
