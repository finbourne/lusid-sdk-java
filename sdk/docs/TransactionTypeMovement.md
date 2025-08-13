

# TransactionTypeMovement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**movementTypes** | **String** | Movement types determine the impact of the movement on the holdings. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, Deferred, CashDeferred. |  |
|**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration |  |
|**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement |  [optional] |
|**mappings** | [**List&lt;TransactionTypePropertyMapping&gt;**](TransactionTypePropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding |  [optional] |
|**name** | **String** | The movement name (optional) |  [optional] |
|**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39; and &#39;Income&#39; (works only with the movement type &#39;StockMovement&#39;). A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. |  [optional] |
|**settlementDateOverride** | **String** | Optional property key that must be in the Transaction domain when specified. When the movement is processed and the transaction has this property set to a valid date, then the property value will override the SettlementDate of the transaction. |  [optional] |
|**condition** | **String** | The condition that the transaction must satisfy to generate the movement, such as: Portfolio.BaseCurrency eq &#39;GBP&#39;. The condition can contain fields and properties from transactions and portfolios. If no condition is provided, the movement will apply for all transactions of this type. |  [optional] |
|**settlementMode** | **String** | Configures how movements should settle. Allowed values: &#39;Internal&#39; and &#39;External&#39;. A movement with &#39;Internal&#39; settlement mode will settle automatically on the contractual settlement date regardlesss of portfolio configuration or settlement instruction. An &#39;External&#39; movement can be settled automatically or by a settlement instruction. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


