

# LusidInstrument

Base class in the hierarchy for representing the full economic definition of instruments in LUSID.  These definitions are used to provide instrument analytics such as PV, accrual, cash flows, and risk.  This base class should not be directly instantiated; each supported InstrumentType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit |  |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| QUOTEDSECURITY | &quot;QuotedSecurity&quot; |
| INTERESTRATESWAP | &quot;InterestRateSwap&quot; |
| FXFORWARD | &quot;FxForward&quot; |
| FUTURE | &quot;Future&quot; |
| EXOTICINSTRUMENT | &quot;ExoticInstrument&quot; |
| FXOPTION | &quot;FxOption&quot; |
| CREDITDEFAULTSWAP | &quot;CreditDefaultSwap&quot; |
| INTERESTRATESWAPTION | &quot;InterestRateSwaption&quot; |
| BOND | &quot;Bond&quot; |
| EQUITYOPTION | &quot;EquityOption&quot; |
| FIXEDLEG | &quot;FixedLeg&quot; |
| FLOATINGLEG | &quot;FloatingLeg&quot; |
| BESPOKECASHFLOWSLEG | &quot;BespokeCashFlowsLeg&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| TERMDEPOSIT | &quot;TermDeposit&quot; |
| CONTRACTFORDIFFERENCE | &quot;ContractForDifference&quot; |
| EQUITYSWAP | &quot;EquitySwap&quot; |
| CASHPERPETUAL | &quot;CashPerpetual&quot; |
| CAPFLOOR | &quot;CapFloor&quot; |
| CASHSETTLED | &quot;CashSettled&quot; |
| CDSINDEX | &quot;CdsIndex&quot; |
| BASKET | &quot;Basket&quot; |
| FUNDINGLEG | &quot;FundingLeg&quot; |
| FXSWAP | &quot;FxSwap&quot; |
| FORWARDRATEAGREEMENT | &quot;ForwardRateAgreement&quot; |
| SIMPLEINSTRUMENT | &quot;SimpleInstrument&quot; |
| REPO | &quot;Repo&quot; |
| EQUITY | &quot;Equity&quot; |
| EXCHANGETRADEDOPTION | &quot;ExchangeTradedOption&quot; |
| REFERENCEINSTRUMENT | &quot;ReferenceInstrument&quot; |
| COMPLEXBOND | &quot;ComplexBond&quot; |
| INFLATIONLINKEDBOND | &quot;InflationLinkedBond&quot; |
| INFLATIONSWAP | &quot;InflationSwap&quot; |
| SIMPLECASHFLOWLOAN | &quot;SimpleCashFlowLoan&quot; |
| TOTALRETURNSWAP | &quot;TotalReturnSwap&quot; |
| INFLATIONLEG | &quot;InflationLeg&quot; |
| FUNDSHARECLASS | &quot;FundShareClass&quot; |
| FLEXIBLELOAN | &quot;FlexibleLoan&quot; |
| UNSETTLEDCASH | &quot;UnsettledCash&quot; |
| CASH | &quot;Cash&quot; |
| MASTEREDINSTRUMENT | &quot;MasteredInstrument&quot; |
| LOANFACILITY | &quot;LoanFacility&quot; |
| FLEXIBLEDEPOSIT | &quot;FlexibleDeposit&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


