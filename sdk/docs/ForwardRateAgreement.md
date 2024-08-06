

# ForwardRateAgreement

LUSID representation of a Forward Rate Agreement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The settlement date of the FRA |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**fixingDate** | **OffsetDateTime** | The date at which the rate to be paid, the reference rate, is confirmed/observed. |  |
|**fraRate** | **java.math.BigDecimal** | The rate at which the FRA is traded. |  |
|**notional** | **java.math.BigDecimal** | The amount for which the FRA is traded. |  |
|**indexConvention** | [**IndexConvention**](IndexConvention.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


