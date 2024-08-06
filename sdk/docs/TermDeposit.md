

# TermDeposit

LUSID representation of a Term Deposit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. For term deposits this is the start date of the interest calculation period. |  |
|**maturityDate** | **OffsetDateTime** | The maturity date of the instrument. For term deposits this is the last date of the interest calculation period. |  |
|**contractSize** | **java.math.BigDecimal** | The principal amount of the term deposit. |  |
|**flowConvention** | [**FlowConventions**](FlowConventions.md) |  |  |
|**rate** | **java.math.BigDecimal** | The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest |  |
|**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions.  You do not need to populate this field for Term Deposits in LUSID as all functionality is driven by the Currency set on the FlowConventions.  LUSID will not store values saved on this field. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


