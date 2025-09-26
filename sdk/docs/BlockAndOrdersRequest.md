# com.finbourne.lusid.model.BlockAndOrdersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orders** | [**List&lt;BlockedOrderRequest&gt;**](BlockedOrderRequest.md) | An order which belongs to a block. Fields common to both entities (such as instrument) should be derived from the block. | [default to List<BlockedOrderRequest>]
**blockProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc). BlockedOrders in the request which do not specify a side will have their side populated with this value. | [optional] [default to String]
**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the block was made | [optional] [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.lusid.model.BlockAndOrdersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId BlockId = new ResourceId();
List<BlockedOrderRequest> Orders = new List<BlockedOrderRequest>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> BlockProperties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String Side = "example Side";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String TimeInForce = "example TimeInForce";
OffsetDateTime Date = OffsetDateTime.now();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();


BlockAndOrdersRequest blockAndOrdersRequestInstance = new BlockAndOrdersRequest()
    .BlockId(BlockId)
    .Orders(Orders)
    .BlockProperties(BlockProperties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Side(Side)
    .Type(Type)
    .TimeInForce(TimeInForce)
    .Date(Date)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
