

# MarketDataKeyRule

When performing analytics, instruments and models have dependencies on market data.  A market data key rule essentially tells lusid to \"resolve dependencies matching the pattern 'X' using data of the form 'Y'\".  The parameter 'X' is defined by the key of the key rule, and might specify \"all USD rates curves\" or \"all RIC-based prices\".  The parameter 'Y' is defined by the remaining fields of the key rule, and allows the user to configure things such as  where to look for data, what sort of data should be looked for (e.g. bid/mid/ask), and how old the data is allowed to be.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | A dot-separated string that defines a pattern for matching market data dependencies.  The form of the string depends on the type of the dependency; see below for basic types and the Knowledge Base for further info.  Quote lookup: \&quot;Quote.{CodeType}.*\&quot; e.g. \&quot;Quote.RIC.*\&quot; refers to &#39;any RIC quote&#39;  Fx rates: \&quot;Fx.CurrencyPair.*\&quot;, which refers to &#39;any FX rate&#39;  Discounting curves: \&quot;Rates.{Currency}.{Currency}OIS e.g. \&quot;Rates.USD.USDOIS\&quot; refers to the OIS USD discounting curve     For non-fx and non-quote rules, trailing parameters can be replaced by the wildcard character &#39;*&#39;.  e.g. \&quot;Rates.*.*\&quot; matches any dependency on a discounting curve. |  |
|**supplier** | **String** | The market data supplier (where the data comes from) |  |
|**dataScope** | **String** | The scope in which the data should be found when using this rule. |  |
|**quoteType** | [**QuoteTypeEnum**](#QuoteTypeEnum) | The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor |  |
|**field** | **String** | The conceptual qualification for the field, typically &#39;bid&#39;, &#39;mid&#39; (default), or &#39;ask&#39;, but can also be &#39;open&#39;, &#39;close&#39;, etc.  When resolving quotes from LUSID&#39;s database, only quotes whose Field is identical to the Field specified here  will be accepted as market data.  When resolving data from an external supplier, the Field must be one of a defined set for the given supplier.     Note: Applies to the retrieval of quotes only. Has no impact on the resolution of complex market data. |  [optional] |
|**quoteInterval** | **String** | Shorthand for the time interval used to select market data. This must be a dot-separated string   nominating a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). The syntax   is &lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;.&lt;i&gt;int&lt;/i&gt;&lt;i&gt;char&lt;/i&gt;, where &lt;i&gt;char&lt;/i&gt; is one of   D(ay), Bd(business day), W(eek), M(onth) or Y(ear).   Business days are calculated using the calendars specified on the Valuation Request.   If no calendar is provided in the request, then it will default to only skipping weekends.   For example, if the valuation date is a Monday, then a quote interval of \&quot;1Bd\&quot; would behave as \&quot;3D\&quot;,   looking back to the Friday. Data with effectiveAt on the weekend will still be found in that window. |  [optional] |
|**asAt** | **OffsetDateTime** | Deprecated field which no longer has any effect on market data resolution. |  [optional] |
|**priceSource** | **String** | The source of the quote. For a given provider/supplier of market data there may be an additional qualifier, e.g. the exchange or bank that provided the quote |  [optional] |
|**mask** | **String** | Allows for partial or complete override of the market asset resolved for a dependency  Either a named override or a dot separated string (A.B.C.D.*).  e.g. for Rates curve &#39;EUR.*&#39; will replace the resolve MarketAsset &#39;GBP/12M&#39;, &#39;GBP/3M&#39; with the EUR equivalent, if there  are no wildcards in the mask, the mask is taken as the MarketAsset for any dependency matching the rule. |  [optional] |
|**sourceSystem** | **String** | If set, this parameter will seek an external source of market data.  Optional and, if omitted, will default to \&quot;Lusid\&quot;.  This means that data will be retrieved from the LUSID Quote Store and LUSID Complex Market Data Store.     This can be set to \&quot;MarketDataOverrides\&quot; if Supplier is set to \&quot;Client\&quot;. |  [optional] |
|**fallThroughOnAccessDenied** | **Boolean** | When a user attempts to use a rule to access data to which they are not entitled,  the rule will fail to resolve any market data.  By default, such an access denied failure will stop any further attempts to resolve market data.  This is so that differently entitled users always receive the same market data from market data resolution,  if they have sufficient entitlements to retrieve the required data.  If set to true, then an access denied failure will not stop further market data resolution,  and resolution will continue with the next specified MarketDataKeyRule.  Optional, and defaults to false. |  [optional] |



## Enum: QuoteTypeEnum

| Name | Value |
|---- | -----|
| PRICE | &quot;Price&quot; |
| SPREAD | &quot;Spread&quot; |
| RATE | &quot;Rate&quot; |
| LOGNORMALVOL | &quot;LogNormalVol&quot; |
| NORMALVOL | &quot;NormalVol&quot; |
| PARSPREAD | &quot;ParSpread&quot; |
| ISDASPREAD | &quot;IsdaSpread&quot; |
| UPFRONT | &quot;Upfront&quot; |
| INDEX | &quot;Index&quot; |
| RATIO | &quot;Ratio&quot; |
| DELTA | &quot;Delta&quot; |
| POOLFACTOR | &quot;PoolFactor&quot; |
| INFLATIONASSUMPTION | &quot;InflationAssumption&quot; |
| DIRTYPRICE | &quot;DirtyPrice&quot; |
| PRINCIPALWRITEOFF | &quot;PrincipalWriteOff&quot; |
| INTERESTDEFERRED | &quot;InterestDeferred&quot; |
| INTERESTSHORTFALL | &quot;InterestShortfall&quot; |
| CONSTITUENTWEIGHTFACTOR | &quot;ConstituentWeightFactor&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


