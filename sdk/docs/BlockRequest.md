

# BlockRequest

A request to create or update an Order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The related order ids. |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**quantity** | **java.math.BigDecimal** | The total quantity of given instrument ordered. |  |
|**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc) |  |
|**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) |  |
|**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) |  |
|**createdDate** | **OffsetDateTime** | The date on which the block was made |  |
|**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**isSwept** | **Boolean** | Swept blocks are considered no longer of active interest, and no longer take part in various order management processes |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


