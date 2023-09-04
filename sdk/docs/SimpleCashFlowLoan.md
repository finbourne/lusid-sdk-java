

# SimpleCashFlowLoan

LUSID representation of a SimpleCashFlowLoan.  This is a simple loan, with interest payments and nationals provided and not calculated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**periods** | [**List&lt;LoanPeriod&gt;**](LoanPeriod.md) | Periods of the underlying loan |  |



