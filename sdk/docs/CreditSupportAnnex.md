

# CreditSupportAnnex

Entity to capture the calculable and queryable methods and practices of determining and transferring collateral  to a counterparty as part of margining of transactions. These typically come from a particular ISDA agreement  that is in place between the two counterparties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceCurrency** | **String** | The base, or reference, currency against which MtM value and exposure should be calculated  and in which the CSA parameters are defined if the currency is not otherwise explicitly stated. | 
**collateralCurrencies** | **List&lt;String&gt;** | The set of currencies within which it is acceptable to post cash collateral. | 
**isdaAgreementVersion** | **String** | The transactions will take place with reference to a particular ISDA master agreement. This  will likely be either the ISDA 1992 or ISDA 2002 agremeents or ISDA close-out 2009. | 
**marginCallFrequency** | **String** | The tenor, e.g. daily (1D) or biweekly (2W), at which frequency a margin call will be made, calculations  made and money transferred to readjust. The calculation might also require a specific time for valuation and notification. | 
**valuationAgent** | **String** | Are the calculations performed by the institutions&#39;s counterparty or the institution trading with them. | 
**thresholdAmount** | **java.math.BigDecimal** | At what level of exposure does collateral need to be posted. Will typically be zero for banks.  Should be stated in reference currency | 
**roundingDecimalPlaces** | **Integer** | Where a calculation needs to be rounded to a specific number of decimal places,  this states the number that that requires. | 
**initialMarginAmount** | **java.math.BigDecimal** | The initial margin that is required. In the reference currency | 
**minimumTransferAmount** | **java.math.BigDecimal** | The minimum amount, in the reference currency, that must be transferred when required. | 
**id** | [**ResourceId**](ResourceId.md) |  | 



