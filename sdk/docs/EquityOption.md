

# EquityOption

LUSID representation of a plain vanilla OTC Equity Option.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**optionMaturityDate** | **OffsetDateTime** | The maturity date of the option. |  |
|**optionSettlementDate** | **OffsetDateTime** | The settlement date of the option. |  [optional] |
|**deliveryType** | **String** | Is the option cash settled or physical delivery of option    Supported string (enumeration) values are: [Cash, Physical]. |  |
|**optionType** | **String** | Type of optionality for the option    Supported string (enumeration) values are: [Call, Put]. |  |
|**strike** | **java.math.BigDecimal** | The strike of the option. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**underlyingIdentifier** | **String** | The market identifier type of the underlying code, e.g RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].  Optional field, should be used in combination with the Code field.  Not compatible with the Underlying field. |  [optional] |
|**code** | **String** | The identifying code for the equity underlying, e.g. &#39;IBM.N&#39;.  Optional field, should be used in combination with the UnderlyingIdentifier field.  Not compatible with the Underlying field. |  [optional] |
|**equityOptionType** | **String** | Equity option types. E.g. Vanilla (default), RightsIssue, Warrant.    Supported string (enumeration) values are: [Vanilla, RightsIssue, Warrant]. |  [optional] |
|**numberOfShares** | **java.math.BigDecimal** | The amount of shares to exchange if the option is exercised. |  [optional] |
|**premium** | [**Premium**](Premium.md) |  |  [optional] |
|**exerciseType** | **String** | Type of optionality that is present; European, American.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. |  [optional] |
|**underlying** | [**LusidInstrument**](LusidInstrument.md) |  |  [optional] |
|**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. |  [optional] |
|**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest].  Defaults to \&quot;F\&quot; if not set. |  [optional] |
|**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


