

# Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | 
**quantity** | **Integer** | The quantity of given instrument ordered. | 
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | 
**orderBookId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | 
**id** | [**ResourceId**](ResourceId.md) |  | 
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | 
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) |  [optional]
**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) |  [optional]
**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made |  [optional]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**orderInstructionId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**packageId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



