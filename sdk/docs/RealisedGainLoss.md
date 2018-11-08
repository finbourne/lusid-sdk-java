
# RealisedGainLoss

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentUid** | **String** | Unique instrument identifier |  [optional]
**units** | **Double** | Quantity against which gain has been made in units of the instrument |  [optional]
**purchaseTradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the position was originally purchased |  [optional]
**purchaseSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the position originally settled |  [optional]
**purchasePrice** | **Double** | Price the instrument was purchased at |  [optional]
**costTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Purchase cost in the trade currency |  [optional]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Purchase cost in the trade currency |  [optional]
**realisedTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Gains or losses in the trade currency |  [optional]
**realisedTotal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Total gains or losses in the portfolio currency |  [optional]
**realisedMarket** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Market gains or losses in the portfolio currency |  [optional]
**realisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Currency gains or losses in the portfolio currency |  [optional]



