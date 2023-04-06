

# EquityOptionAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. | 
**optionMaturityDate** | **OffsetDateTime** | The maturity date of the option. | 
**optionSettlementDate** | **OffsetDateTime** | The settlement date of the option. | 
**deliveryType** | **String** | is the option cash settled or physical delivery of option    Supported string (enumeration) values are: [Cash, Physical]. | 
**optionType** | **String** | Type of optionality for the option    Supported string (enumeration) values are: [Call, Put]. | 
**strike** | **java.math.BigDecimal** | The strike of the option. | 
**domCcy** | **String** | The domestic currency of the instrument. | 
**underlyingIdentifier** | **String** | The market identifier type of the underlying code, e.g RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. | 
**code** | **String** | The identifying code for the equity underlying, e.g. &#39;IBM.N&#39;. | 
**equityOptionType** | **String** | Equity option types. E.g. Vanilla (default), RightsIssue, Warrant.    Supported string (enumeration) values are: [Vanilla, RightsIssue, Warrant]. |  [optional]
**numberOfShares** | **java.math.BigDecimal** | The amount of shares to exchange if the option is exercised. |  [optional]
**premium** | [**Premium**](Premium.md) |  |  [optional]
**exerciseType** | **String** | Type of optionality that is present; European, American.    Supported string (enumeration) values are: [European, American]. |  [optional]
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan | 



## Enum: InstrumentTypeEnum

Name | Value
---- | -----
QUOTEDSECURITY | &quot;QuotedSecurity&quot;
INTERESTRATESWAP | &quot;InterestRateSwap&quot;
FXFORWARD | &quot;FxForward&quot;
FUTURE | &quot;Future&quot;
EXOTICINSTRUMENT | &quot;ExoticInstrument&quot;
FXOPTION | &quot;FxOption&quot;
CREDITDEFAULTSWAP | &quot;CreditDefaultSwap&quot;
INTERESTRATESWAPTION | &quot;InterestRateSwaption&quot;
BOND | &quot;Bond&quot;
EQUITYOPTION | &quot;EquityOption&quot;
FIXEDLEG | &quot;FixedLeg&quot;
FLOATINGLEG | &quot;FloatingLeg&quot;
BESPOKECASHFLOWSLEG | &quot;BespokeCashFlowsLeg&quot;
UNKNOWN | &quot;Unknown&quot;
TERMDEPOSIT | &quot;TermDeposit&quot;
CONTRACTFORDIFFERENCE | &quot;ContractForDifference&quot;
EQUITYSWAP | &quot;EquitySwap&quot;
CASHPERPETUAL | &quot;CashPerpetual&quot;
CAPFLOOR | &quot;CapFloor&quot;
CASHSETTLED | &quot;CashSettled&quot;
CDSINDEX | &quot;CdsIndex&quot;
BASKET | &quot;Basket&quot;
FUNDINGLEG | &quot;FundingLeg&quot;
FXSWAP | &quot;FxSwap&quot;
FORWARDRATEAGREEMENT | &quot;ForwardRateAgreement&quot;
SIMPLEINSTRUMENT | &quot;SimpleInstrument&quot;
REPO | &quot;Repo&quot;
EQUITY | &quot;Equity&quot;
EXCHANGETRADEDOPTION | &quot;ExchangeTradedOption&quot;
REFERENCEINSTRUMENT | &quot;ReferenceInstrument&quot;
COMPLEXBOND | &quot;ComplexBond&quot;
INFLATIONLINKEDBOND | &quot;InflationLinkedBond&quot;
INFLATIONSWAP | &quot;InflationSwap&quot;
SIMPLECASHFLOWLOAN | &quot;SimpleCashFlowLoan&quot;



