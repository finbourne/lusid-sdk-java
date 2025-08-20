

# AdjustGlobalCommitmentEvent

Event to adjust the limit/balance of a LoanFacility. Used to initially set up the facility, but also used to increase/reduce the associated limit and balance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **java.math.BigDecimal** | Amount that the limit and balance are changed by. A positive number signifies an increase, and a negative number here signifies a decrease. |  |
|**date** | **OffsetDateTime** | Date of the adjustment. Signifies when the facility begins to accrue interest. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


