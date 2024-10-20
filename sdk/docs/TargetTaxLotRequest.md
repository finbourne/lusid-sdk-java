

# TargetTaxLotRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**units** | **java.math.BigDecimal** | The number of units of the instrument in this tax-lot. |  |
|**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**portfolioCost** | **java.math.BigDecimal** | The total cost of the tax-lot in the transaction portfolio&#39;s base currency. |  [optional] |
|**price** | **java.math.BigDecimal** | The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots. |  [optional] |
|**purchaseDate** | **OffsetDateTime** | The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots. |  [optional] |
|**settlementDate** | **OffsetDateTime** | The settlement date of the tax-lot&#39;s opening transaction. |  [optional] |
|**notionalCost** | **java.math.BigDecimal** | The notional cost of the tax-lot&#39;s opening transaction. |  [optional] |
|**variationMargin** | **java.math.BigDecimal** | The variation margin of the tax-lot&#39;s opening transaction. |  [optional] |
|**variationMarginPortfolioCcy** | **java.math.BigDecimal** | The variation margin in portfolio currency of the tax-lot&#39;s opening transaction. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


