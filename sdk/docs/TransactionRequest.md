

# TransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the transaction. | 
**type** | **String** | The type of the transaction, for example &#39;Buy&#39; or &#39;Sell&#39;. The transaction type must have been pre-configured using the System Configuration API. If not, this operation will succeed but you are not able to calculate holdings for the portfolio that include this transaction. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. | 
**transactionDate** | **String** | The date of the transaction. | 
**settlementDate** | **String** | The settlement date of the transaction. | 
**units** | **Double** | The number of units of the transacted instrument. | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  |  [optional]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**exchangeRate** | **Double** | The exchange rate between the transaction and settlement currency (settlement currency being represented by TotalConsideration.Currency). For example, if the transaction currency is USD and the settlement currency is GBP, this would be the appropriate USD/GBP rate. |  [optional]
**transactionCurrency** | **String** | The transaction currency. |  [optional]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | A list of unique transaction properties and associated values to store for the transaction. Each property must be from the &#39;Transaction&#39; domain. |  [optional]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. |  [optional]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. |  [optional]



