

# RealisedGainLoss

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentUid** | **String** | The unqiue Lusid Instrument Id (LUID) of the instrument that this gain or loss is associated with. | 
**units** | **Double** | The number of units of the associated instrument against which the gain or loss has been realised. | 
**purchaseTradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime that the units associated with this gain or loss where originally purchased. |  [optional]
**purchaseSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime that the units associated with this gain or loss where originally settled. |  [optional]
**purchasePrice** | **Double** | The purchase price of each unit associated with this gain or loss. |  [optional]
**costTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**realisedTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**realisedTotal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**realisedMarket** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**realisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]



