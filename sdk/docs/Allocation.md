

# Allocation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | 
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | 
**portfolioId** | [**ResourceId**](ResourceId.md) |  | 
**quantity** | **Integer** | The quantity of given instrument allocated. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | 
**version** | [**Version**](Version.md) |  |  [optional]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. |  [optional]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument allocated. | 
**placementIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A placement - also known as an order placed in the market - associated with this allocation. |  [optional]
**state** | **String** | The state of this allocation. |  [optional]
**side** | **String** | The side of this allocation (examples: Buy, Sell, ...). |  [optional]
**type** | **String** | The type of order associated with this allocation (examples: Limit, Market, ...). |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date for this allocation. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of this allocation. |  [optional]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**settlementCurrency** | **String** | The settlement currency of this allocation. |  [optional]
**settlementCurrencyFxRate** | **Double** | The settlement currency to allocation currency FX rate. |  [optional]
**counterparty** | **String** | The counterparty for this allocation. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



