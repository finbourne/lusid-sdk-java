

# TargetTaxLot

Used to specify holdings target amounts at the tax-lot level
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **Double** | The number of units of the instrument in this tax-lot. | 
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**portfolioCost** | **Double** | The total cost of the tax-lot in the transaction portfolio&#39;s base currency. |  [optional]
**price** | **Double** | The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots. |  [optional]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots. |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the tax-lot&#39;s opening transaction. |  [optional]



