

# Order

An Order for a certain quantity of a specific instrument

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. |  [optional] |
|**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) |  |
|**orderBookId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**instrumentScope** | **String** | The scope in which the instrument lies |  [optional] |
|**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. |  |
|**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) |  [optional] |
|**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) |  [optional] |
|**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) |  [optional] |
|**date** | **OffsetDateTime** | The date on which the order was made |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**orderInstructionId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**packageId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. |  [optional] |
|**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


