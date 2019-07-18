

# TransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | 
**type** | **String** | The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint. If it hasn&#39;t been pre-configured the transaction will still be updated or inserted however you will be unable to generate the resultant holdings for the portfolio that contains this transaction as LUSID does not know how to process it. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers to use to resolve the transaction to a unique instrument. | 
**transactionDate** | **String** | The date of the transaction. | 
**settlementDate** | **String** | The settlement date of the transaction. | 
**units** | **Double** | The number of units transacted in the associated instrument. | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**exchangeRate** | **Double** | The exchange rate between the transaction and settlement currency. For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. |  [optional]
**transactionCurrency** | **String** | The transaction currency. |  [optional]
**properties** | [**Map&lt;String, PerpetualPropertyValue&gt;**](PerpetualPropertyValue.md) | Set of unique transaction properties and associated values to store with the transaction. Each property must be from the &#39;Trade&#39; domain. |  [optional]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. |  [optional]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. |  [optional]



