

# InterestRateSwaption

LUSID representation of an Interest Rate Swaption.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**payOrReceiveFixed** | **String** | Pay or Receive the fixed leg of the underlying swap.    Supported string (enumeration) values are: [Pay, Receive]. |  |
|**premium** | [**Premium**](Premium.md) |  |  [optional] |
|**deliveryMethod** | **String** | How does the option settle    Supported string (enumeration) values are: [Cash, Physical]. |  |
|**swap** | [**InterestRateSwap**](InterestRateSwap.md) |  |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |
|**underlying** | [**LusidInstrument**](LusidInstrument.md) |  |  [optional] |
|**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.     Defaults to 0. |  [optional] |
|**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest].     Defaults to \&quot;F\&quot;. |  [optional] |
|**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


