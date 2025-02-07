

# LoanPrincipalRepaymentEvent

Event to signify the repayment of some or all of the principal balance of a loan contract.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Date that the Principal is due to be paid. |  |
|**currency** | **String** | Currency of the repayment. |  |
|**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the Principal is paid automatically or not.  Exactly one election must be provided. |  [optional] |
|**fraction** | **java.math.BigDecimal** | Fraction of the principal balance to be repaid. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


