

# EquitySwap

LUSID representation of an Equity Swap.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the EquitySwap. | 
**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | 
**code** | **String** | The code of the underlying. | 
**equityFlowConventions** | [**FlowConventions**](FlowConventions.md) |  | 
**fundingLeg** | [**InstrumentLeg**](InstrumentLeg.md) |  | 
**includeDividends** | **Boolean** | Dividend inclusion flag, if true dividends are included in the equity leg (total return). | 
**initialPrice** | **java.math.BigDecimal** | The initial equity price of the Equity Swap. | 
**notionalReset** | **Boolean** | Notional reset flag, if true the notional of the funding leg is reset at the start of every  coupon to match the value of the equity leg (equity price at start of coupon times quantity). | 
**quantity** | **java.math.BigDecimal** | The quantity or number of shares in the Equity Swap. | 
**underlyingIdentifier** | **String** | external market codes and identifiers for the EquitySwap, e.g. RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. | 
**equitySwapDividendPaymentTiming** | **String** | Determines how the payment of dividends is handled for the equity swap.  Defaults to paying at the next Equity coupon date.                Supported string (enumeration) values are: [PayAtNextEquityCouponDate, PayAtMaturityOfSwap, PayAtNextFundingLegCouponDate, PayAtPaymentDateOfDividendEvent]. |  [optional]



