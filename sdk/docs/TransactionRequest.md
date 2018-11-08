
# TransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Unique transaction identifier | 
**type** | **String** | LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | 
**instrumentUid** | **String** | Unique instrument identifier | 
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Transaction date | 
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date | 
**units** | **Double** | Quantity of transaction in units of the instrument | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) | Execution price for the transaction | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Total value of the transaction, in settlement currency | 
**exchangeRate** | **Double** | Rate between transaction and settle currency |  [optional]
**transactionCurrency** | **String** | Transaction currency |  [optional]
**properties** | [**Map&lt;String, PerpetualPropertyValue&gt;**](PerpetualPropertyValue.md) |  |  [optional]
**counterpartyId** | **String** | Counterparty identifier |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Where this transaction came from, either Client or System | 
**nettingSet** | **String** |  |  [optional]


<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
SYSTEM | &quot;System&quot;
CLIENT | &quot;Client&quot;



