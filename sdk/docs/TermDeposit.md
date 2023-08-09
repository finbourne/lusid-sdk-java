

# TermDeposit

LUSID representation of a Term Deposit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the instrument. For term deposits this is the start date of the interest calculation period. | 
**maturityDate** | **OffsetDateTime** | The maturity date of the instrument. For term deposits this is the last date of the interest calculation period. | 
**contractSize** | **java.math.BigDecimal** | The principal amount of the term deposit. | 
**flowConvention** | [**FlowConventions**](FlowConventions.md) |  | 
**rate** | **java.math.BigDecimal** | The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest | 
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions. |  [optional]



