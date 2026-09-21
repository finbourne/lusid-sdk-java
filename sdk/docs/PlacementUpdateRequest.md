# com.finbourne.lusid.model.PlacementUpdateRequest
A request to update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. | [optional] [default to Map<String, PerpetualProperty>]
**type** | **String** | Optionally changes the type of this placement (Market, Limit, Stop, StopLimit, etc). A type change is permitted only when the associated block is of type &#39;Market&#39;, and leaves the placement&#39;s prices as they are. | [optional] [default to String]
**limitPrice** | **java.math.BigDecimal** | Optionally updates the limit price of this placement, in the placement&#39;s limit price currency unless a currency is also specified. A price on a placement with no limit price currency is stored but not returned until a currency is supplied. | [optional] [default to java.math.BigDecimal]
**stopPrice** | **java.math.BigDecimal** | Optionally updates the stop price of this placement, in the placement&#39;s stop price currency unless a currency is also specified. A price on a placement with no stop price currency is stored but not returned until a currency is supplied. | [optional] [default to java.math.BigDecimal]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. Available values: Undecided, Manual, Direct, Ems, External. | [optional] [default to String]
**currency** | **String** | Optionally sets the ISO currency code of the placement&#39;s stop and/or limit price. Not permitted for a Market placement. For a value placement it must match the currency of the amount exactly, whether that amount is on the placement or in the update. When omitted, no currency checks are applied. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PlacementUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
CurrencyAndAmount Amount = new CurrencyAndAmount();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable java.math.BigDecimal LimitPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal StopPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable String ExecutionSystem = "example ExecutionSystem";
@jakarta.annotation.Nullable String EntryType = "example EntryType";
@jakarta.annotation.Nullable String Currency = "example Currency";


PlacementUpdateRequest placementUpdateRequestInstance = new PlacementUpdateRequest()
    .Id(Id)
    .Quantity(Quantity)
    .Amount(Amount)
    .Properties(Properties)
    .Type(Type)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .Counterparty(Counterparty)
    .ExecutionSystem(ExecutionSystem)
    .EntryType(EntryType)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
