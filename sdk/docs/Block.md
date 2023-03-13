

# Block

A block of orders for the same instrument, intended to record for example a trader's aggregation  of outstanding orders at a given time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | 
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The related order ids. | 
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. |  [optional]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | 
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | 
**quantity** | **java.math.BigDecimal** | The total quantity of given instrument ordered. | 
**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc) | 
**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) | 
**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) | 
**createdDate** | **OffsetDateTime** | The date on which the block was made | 
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



