

# QuoteSeriesId

The time invariant unique identifier of the quote. Combined with the effective datetime of the quote this  uniquely identifies the quote. This can be thought of as a unique identifier for a time series of quotes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The platform or vendor that provided the quote. The available values are: Client, DataScope, Lusid, Edi, TraderMade, FactSet, SIX, Bloomberg, Rimes, ICE, LSEG |  |
|**priceSource** | **String** | The source or originator of the quote, e.g. a bank or financial institution. |  [optional] |
|**instrumentId** | **String** | The value of the instrument identifier that uniquely identifies the instrument that the quote is for, e.g. &#39;BBG00JX0P539&#39;. |  |
|**instrumentIdType** | [**InstrumentIdTypeEnum**](#InstrumentIdTypeEnum) | The type of instrument identifier used to uniquely identify the instrument that the quote is for, e.g. &#39;Figi&#39;. The available values are: LusidInstrumentId, Figi, RIC, QuotePermId, Isin, CurrencyPair, ClientInternal, Sedol, Cusip |  |
|**quoteType** | [**QuoteTypeEnum**](#QuoteTypeEnum) | The type of the quote. This allows for quotes other than prices e.g. rates or spreads to be used. The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor |  |
|**field** | **String** | The field of the quote e.g. bid, mid, ask etc. This should be consistent across a time series of quotes. The allowed values depend on the provider according to the following rules: Client : *Any value is accepted*; DataScope : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;; Lusid : *Any value is accepted*; Edi : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; TraderMade : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;high&#39;, &#39;low&#39;; FactSet : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;; SIX : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;, &#39;referencePrice&#39;, &#39;highPrice&#39;, &#39;lowPrice&#39;, &#39;maxRedemptionPrice&#39;, &#39;maxSubscriptionPrice&#39;, &#39;openPrice&#39;, &#39;bestBidPrice&#39;, &#39;lastBidPrice&#39;, &#39;bestAskPrice&#39;, &#39;lastAskPrice&#39;, &#39;finalSettlementOptions&#39;, &#39;finalSettlementFutures&#39;, &#39;valuationPriceAmount&#39;; Bloomberg : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; Rimes : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; ICE : &#39;ask&#39;, &#39;bid&#39;, &#39;close&#39;, &#39;high&#39;, &#39;low&#39;, &#39;open&#39;, &#39;primaryExchangeTradePrice&#39;, &#39;vwap&#39;, &#39;mid&#39;; LSEG : &#39;ASK&#39;, &#39;BID&#39;, &#39;MID_PRICE&#39; |  |



## Enum: InstrumentIdTypeEnum

| Name | Value |
|---- | -----|
| LUSIDINSTRUMENTID | &quot;LusidInstrumentId&quot; |
| FIGI | &quot;Figi&quot; |
| RIC | &quot;RIC&quot; |
| QUOTEPERMID | &quot;QuotePermId&quot; |
| ISIN | &quot;Isin&quot; |
| CURRENCYPAIR | &quot;CurrencyPair&quot; |
| CLIENTINTERNAL | &quot;ClientInternal&quot; |
| SEDOL | &quot;Sedol&quot; |
| CUSIP | &quot;Cusip&quot; |



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


