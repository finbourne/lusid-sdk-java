

# OrderRequest

A request to create or update an Order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. |  [optional] |
|**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) |  |
|**orderBookId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) |  [optional] |
|**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) |  [optional] |
|**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) |  [optional] |
|**date** | **OffsetDateTime** | The date on which the order was made |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**orderInstruction** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**_package** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. |  [optional] |
|**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


