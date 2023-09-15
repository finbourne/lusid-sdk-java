

# TransactionTypeMovement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**movementTypes** | **String** | Movement types determine the impact of the movement on the holdings |  |
|**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration |  |
|**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement |  [optional] |
|**mappings** | [**List&lt;TransactionTypePropertyMapping&gt;**](TransactionTypePropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding |  [optional] |
|**name** | **String** | The movement name (optional) |  [optional] |
|**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The only option currently available is &#39;DirectAdjustment&#39;. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the unitsof a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. |  [optional] |
|**settlementDateOverride** | **String** | Optional property key that must be in the Transaction domain when specified. When the movement is processed and the transaction has this property set to a valid date, then the property value will override the SettlementDate of the transaction. |  [optional] |



