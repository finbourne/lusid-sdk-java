

# EquityOption

LUSID representation of a plain vanilla OTC Equity Option.

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



