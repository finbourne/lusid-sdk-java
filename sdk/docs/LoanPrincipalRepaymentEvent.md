

# LoanPrincipalRepaymentEvent

Event to signify the repayment of some or all of the principal balance of a loan contract.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Date that the Principal is due to be paid. |  [optional] |
|**currency** | **String** | Currency of the repayment. |  |
|**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the Principal is paid automatically or not. Exactly one election must be provided. |  [optional] |
|**fraction** | **java.math.BigDecimal** | Fraction of the outstanding settled principal balance to be repaid. Must be between 0 and 1, inclusive. Defaults to 1 if not set. Ignored if the field Amount is set to a value different than zero. |  [optional] |
|**amount** | **java.math.BigDecimal** | Amount to be repaid (independent of the fraction). This field is not used at all if not set or set to 0, in this case the fraction field will be used instead. Otherwise, the fraction field is ignored. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


