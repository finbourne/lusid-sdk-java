

# MarketQuote

The market quote for an observable which will be used to calibrate the market data, including the format of the quote. e.g. a volatility quote for a specific strike and expiry the par rate of a swap   This is a slimmed down version of a full Quote that can be stored in our QuoteStore to remove lineage, price source etc. for ease of use when creating complex market data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteType** | [**QuoteTypeEnum**](#QuoteTypeEnum) | The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor |  |
|**value** | **java.math.BigDecimal** | Numeric value of the quote |  |



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


