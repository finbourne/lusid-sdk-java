

# InterestRateSwap

LUSID representation of an Interest Rate Swap, including:      * Vanilla (single currency fixed-float non-amortising)    * CrossCurrency (>1 currency is used by the swap legs)    * Basis (single currency, floating-floating legs of different tenors)    * Amortising (the swap has 1+ leg with amortised notional)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**isNonDeliverable** | **Boolean** | Is the contract an IRS of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the settlement currency based on the difference between  the fixed and floating rates. |  [optional] |
|**legs** | [**List&lt;InstrumentLeg&gt;**](InstrumentLeg.md) | The set of instrument legs that define the swap instrument, these should be FloatingLeg or FixedLeg. |  |
|**settlementCcy** | **String** | Settlement currency if IRS is non-deliverable. |  [optional] |
|**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven fixed-floating swap.  The dates must be distinct and either all payments are Pay or all payments are receive |  [optional] |



