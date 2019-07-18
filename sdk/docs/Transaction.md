

# Transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | 
**type** | **String** | The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of instrument identifiers that can be used to resolve the transaction to a unique instrument. |  [optional]
**instrumentUid** | **String** | The unqiue Lusid Instrument Id (LUID) of the instrument that the transaction is in. | 
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the transaction. | 
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the transaction. | 
**units** | **Double** | The number of units transacted in the associated instrument. | 
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | 
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | 
**exchangeRate** | **Double** | The exchange rate between the transaction and settlement currency. For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. |  [optional]
**transactionCurrency** | **String** | The transaction currency. |  [optional]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the &#39;Trade&#39; domain. |  [optional]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. |  [optional]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. | 



