

# BlockedOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional] |
|**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. |  |
|**orderBookId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) |  [optional] |
|**date** | **OffsetDateTime** | The date on which the order was made |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**orderInstruction** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**_package** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


