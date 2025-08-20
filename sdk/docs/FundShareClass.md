

# FundShareClass

LUSID representation of a FundShareClass. A ShareClass represents a pool of shares, held by investors, within a fund.  A ShareClass can represent a differing investment approach by either Fees,  Income, Currency Risk and Investor type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shortCode** | **String** | A short identifier, unique across a single fund, usually made up of the ShareClass components. Eg \&quot;A Accumulation Euro Hedged Class\&quot; could become \&quot;A Acc H EUR\&quot;. |  |
|**fundShareClassType** | **String** | The type of distribution that the ShareClass will calculate. Can be either &#39;Income&#39; or &#39;Accumulation&#39; - Income classes will pay out and Accumulation classes will retain their ShareClass attributable income.  Supported string (enumeration) values are: [Income, Accumulation]. |  |
|**distributionPaymentType** | **String** | The tax treatment applied to any distributions calculated within the ShareClass. Can be either &#39;Net&#39; (Distribution Calculated net of tax) or &#39;Gross&#39; (Distribution calculated gross of tax).  Supported string (enumeration) values are: [Gross, Net]. |  |
|**hedging** | **String** | A flag to indicate the ShareClass is operating currency hedging as a means to limit currency risk as part of it&#39;s investment strategy.  Supported string (enumeration) values are: [Invalid, None, ApplyHedging]. |  |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**roundingConventions** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding Convention used for the FundShareClass quotes |  [optional] |
|**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


