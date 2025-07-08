

# OrderUpdateRequest

A request to create or update a Order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


