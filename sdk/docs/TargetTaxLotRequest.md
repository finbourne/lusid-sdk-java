
# TargetTaxLotRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **Double** | Quantity of holding | 
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) | Book cost of holding in transaction currency |  [optional]
**portfolioCost** | **Double** | Book cost of holding in portfolio currency |  [optional]
**price** | **Double** | Purchase price. Part of the unique key required for multiple taxlots |  [optional]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Purchase Date. Part of the unique key required for multiple taxlots |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Original settlement date of the tax-lot&#39;s opening transaction. |  [optional]



