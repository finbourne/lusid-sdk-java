

# MarketOptions

The set of options that control miscellaneous and default market resolution behaviour.  These are aimed at a 'crude' level of control for those who do not wish to fine tune the way that data is resolved.  For clients who wish to simply match instruments to prices this is quite possibly sufficient. For those wishing to control market data sources  according to requirements based on accuracy or timeliness it is not. In more advanced cases the options should largely be ignored and rules specified  per source. Be aware that where no specified rule matches the final fallback is on to the logic implied here.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultSupplier** | **String** | The default supplier of data. This controls which &#39;dialect&#39; is used to find particular market data. e.g. one supplier might address data by RIC, another by PermId |  [optional]
**defaultInstrumentCodeType** | **String** | When instrument quotes are searched for, what identifier should be used by default |  [optional]
**defaultScope** | **String** | For default rules, which scope should data be searched for in | 
**attemptToInferMissingFx** | **Boolean** | if true will calculate a missing Fx pair (e.g. THBJPY) from the inverse JPYTHB or from standardised pairs against USD, e.g. THBUSD and JPYUSD |  [optional]
**calendarScope** | **String** | The scope in which holiday calendars stored |  [optional]
**conventionScope** | **String** | The scope in which holiday calendars stored |  [optional]



