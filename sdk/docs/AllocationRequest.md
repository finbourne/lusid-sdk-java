

# AllocationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. |  [optional]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | 
**quantity** | **Integer** | The quantity of given instrument allocated. | 
**portfolioId** | [**ResourceId**](ResourceId.md) |  | 
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | 
**id** | [**ResourceId**](ResourceId.md) |  | 
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



