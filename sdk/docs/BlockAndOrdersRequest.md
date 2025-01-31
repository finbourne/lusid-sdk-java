

# BlockAndOrdersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockId** | [**ResourceId**](ResourceId.md) |  |  |
|**orders** | [**List&lt;BlockedOrderRequest&gt;**](BlockedOrderRequest.md) | An order which belongs to a block. Fields common to both entities (such as instrument) should be derived from the block. |  |
|**blockProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc). BlockedOrders in the request which do not specify a side will have their side populated with this value. |  [optional] |
|**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) |  [optional] |
|**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) |  [optional] |
|**date** | **OffsetDateTime** | The date on which the block was made |  [optional] |
|**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


