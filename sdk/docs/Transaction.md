

# Transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Unique transaction identifier | 
**type** | **String** | LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers |  [optional]
**instrumentUid** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | 
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Transaction date | 
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date | 
**units** | **Double** | Quantity of trade in units of the instrument | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**exchangeRate** | **Double** | Rate between transaction and settlement currency |  [optional]
**transactionCurrency** | **String** | Transaction currency |  [optional]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**counterpartyId** | **String** | Counterparty identifier |  [optional]
**source** | **String** | Where this transaction came from | 



