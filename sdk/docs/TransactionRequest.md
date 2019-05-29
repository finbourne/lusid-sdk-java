
# TransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Unique transaction identifier | 
**type** | **String** | LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | 
**transactionDate** | **String** | Transaction date | 
**settlementDate** | **String** | Settlement date | 
**units** | **Double** | Quantity of trade in units of the instrument | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) | Execution price for the transaction | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Total value of the transaction in settlement currency | 
**exchangeRate** | **Double** | Rate between transaction and settlement currency |  [optional]
**transactionCurrency** | **String** | Transaction currency |  [optional]
**properties** | [**Map&lt;String, PerpetualPropertyValue&gt;**](PerpetualPropertyValue.md) |  |  [optional]
**counterpartyId** | **String** | Counterparty identifier |  [optional]
**source** | **String** | Where this transaction came from |  [optional]
**nettingSet** | **String** |  |  [optional]



