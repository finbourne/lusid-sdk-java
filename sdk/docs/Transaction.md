

# Transaction

A list of transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The unique identifier for the transaction. |  |
|**type** | **String** | The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint. |  |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. |  [optional] |
|**instrumentScope** | **String** | The scope in which the transaction&#39;s instrument lies. |  [optional] |
|**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the transaction is in. |  |
|**transactionDate** | **OffsetDateTime** | The date of the transaction. |  |
|**settlementDate** | **OffsetDateTime** | The settlement date of the transaction. |  |
|**units** | **java.math.BigDecimal** | The number of units transacted in the associated instrument. |  |
|**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  |  [optional] |
|**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the transaction and settlement currency (settlement currency being represented by the TotalConsideration.Currency). For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. |  [optional] |
|**transactionCurrency** | **String** | The transaction currency. |  [optional] |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the &#39;Transaction&#39; domain. |  [optional] |
|**counterpartyId** | **String** | The identifier for the counterparty of the transaction. |  [optional] |
|**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. |  [optional] |
|**entryDateTime** | **OffsetDateTime** | The asAt datetime that the transaction was added to LUSID. |  [optional] |
|**otcConfirmation** | [**OtcConfirmation**](OtcConfirmation.md) |  |  [optional] |
|**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | The status of the transaction. The available values are: Active, Amended, Cancelled |  [optional] |
|**cancelDateTime** | **OffsetDateTime** | If the transaction has been cancelled, the asAt datetime that the transaction was cancelled. |  [optional] |
|**orderId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**allocationId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**custodianAccount** | [**CustodianAccount**](CustodianAccount.md) |  |  [optional] |
|**transactionGroupId** | **String** | The identifier for grouping economic events across multiple transactions |  [optional] |
|**strategyTag** | [**List&lt;Strategy&gt;**](Strategy.md) | A list of strategies representing the allocation of units across multiple sub-holding keys |  [optional] |
|**resolvedTransactionTypeDetails** | [**TransactionTypeDetails**](TransactionTypeDetails.md) |  |  [optional] |
|**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  |  [optional] |



## Enum: TransactionStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| AMENDED | &quot;Amended&quot; |
| CANCELLED | &quot;Cancelled&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


