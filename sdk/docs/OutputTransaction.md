

# OutputTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Unique transaction identifier |  [optional]
**type** | **String** | LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc |  [optional]
**description** | **String** | LUSID transaction description |  [optional]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers |  [optional]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers |  [optional]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Transaction date |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date |  [optional]
**units** | **Double** | Quantity of trade in units of the instrument |  [optional]
**transactionAmount** | **Double** | Total value of the transaction in trade currency |  [optional]
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  |  [optional]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**exchangeRate** | **Double** | Rate between transaction and settlement currency |  [optional]
**transactionToPortfolioRate** | **Double** | Rate between transaction and portfolio currency |  [optional]
**transactionCurrency** | **String** | Transaction currency |  [optional]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**counterpartyId** | **String** | Counterparty identifier |  [optional]
**source** | **String** | Where this transaction came from |  [optional]
**nettingSet** | **String** |  |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Transaction status (active, amended or cancelled) |  [optional]
**entryDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date / time the transaction was booked into LUSID |  [optional]
**cancelDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date / time the cancellation was booked into LUSID |  [optional]
**realisedGainLoss** | [**List&lt;RealisedGainLoss&gt;**](RealisedGainLoss.md) | Collection of gains or losses |  [optional]



## Enum: TransactionStatusEnum

Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
AMENDED | &quot;Amended&quot;
CANCELLED | &quot;Cancelled&quot;



