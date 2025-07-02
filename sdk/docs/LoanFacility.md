

# LoanFacility

Loan Facility. This is a very lightweight instrument which acts as a placeholder for the state that is built  from the instrument events. The facility acts as an agreement between a single borrower and many lenders (investors).  Several contracts may be drawn up to enable the lending of funds to the borrower. These contracts are modelled via  FlexibleLoan instruments in LUSID. The instrument events on the facility may relate to the facility as a whole  (for example to define a global commitment amount), or they may relate to a single contract (such as a paydown  transaction on a particular contract).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**initialCommitment** | **java.math.BigDecimal** | The initial commitment for the loan facility. |  |
|**loanType** | **String** | LoanType for this facility. The facility can either be a revolving or a  term loan.    Supported string (enumeration) values are: [Revolver, TermLoan]. |  |
|**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Repayment schedules for the loan. |  |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


