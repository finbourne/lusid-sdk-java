
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Unique transaction identifier | 
**type** | **String** | LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. |  [optional]
**instrumentUid** | **String** | Unique instrument identifier | 
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Transaction date | 
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date | 
**units** | **Double** | Quantity of transaction in units of the instrument | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) | Execution price for the transaction | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Total value of the transaction in settlement currency | 
**exchangeRate** | **Double** | Rate between transaction and settle currency |  [optional]
**transactionCurrency** | **String** | Transaction currency |  [optional]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**counterpartyId** | **String** | Counterparty identifier |  [optional]
**source** | **String** | Where this transaction came from | 
**nettingSet** | **String** |  |  [optional]



