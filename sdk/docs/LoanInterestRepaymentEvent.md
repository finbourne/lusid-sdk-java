

# LoanInterestRepaymentEvent

Event to signify the repayment of interest accrued against a loan holding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Date that the interest is due to be paid. |  |
|**exDate** | **OffsetDateTime** | Date that the accrued interest is calculated up until. |  |
|**currency** | **String** | Currency of the repayment. |  |
|**fraction** | **java.math.BigDecimal** | Fraction of the accrued on the holding to be repaid. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

