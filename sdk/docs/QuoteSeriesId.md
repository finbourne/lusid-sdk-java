

# QuoteSeriesId

The time invariant unique identifier of the quote. Combined with the effective datetime of the quote this  uniquely identifies the quote. This can be thought of as a unique identifier for a time series of quotes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider** | **String** | The platform or vendor that provided the quote. The available values are: Client, DataScope, Lusid, Edi, TraderMade, FactSet, SIX, Bloomberg, Rimes | 
**priceSource** | **String** | The source or originator of the quote, e.g. a bank or financial institution. |  [optional]
**instrumentId** | **String** | The value of the instrument identifier that uniquely identifies the instrument that the quote is for, e.g. &#39;BBG00JX0P539&#39;. | 
**instrumentIdType** | [**InstrumentIdTypeEnum**](#InstrumentIdTypeEnum) | The type of instrument identifier used to uniquely identify the instrument that the quote is for, e.g. &#39;Figi&#39;. The available values are: LusidInstrumentId, Figi, RIC, QuotePermId, Isin, CurrencyPair, ClientInternal, Sedol, Cusip | 
**quoteType** | [**QuoteTypeEnum**](#QuoteTypeEnum) | The type of the quote. This allows for quotes other than prices e.g. rates or spreads to be used. The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor | 
**field** | **String** | The field of the quote e.g. bid, mid, ask etc. This should be consistent across a time series of quotes. The allowed values depend on the provider according to the following rules: Client : *Any value is accepted*; DataScope : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;; Lusid : *Any value is accepted*; Edi : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; TraderMade : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;high&#39;, &#39;low&#39;; FactSet : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;; SIX : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; Bloomberg : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39;; Rimes : &#39;bid&#39;, &#39;mid&#39;, &#39;ask&#39;, &#39;open&#39;, &#39;close&#39;, &#39;last&#39; | 



## Enum: InstrumentIdTypeEnum

Name | Value
---- | -----
LUSIDINSTRUMENTID | &quot;LusidInstrumentId&quot;
FIGI | &quot;Figi&quot;
RIC | &quot;RIC&quot;
QUOTEPERMID | &quot;QuotePermId&quot;
ISIN | &quot;Isin&quot;
CURRENCYPAIR | &quot;CurrencyPair&quot;
CLIENTINTERNAL | &quot;ClientInternal&quot;
SEDOL | &quot;Sedol&quot;
CUSIP | &quot;Cusip&quot;



## Enum: QuoteTypeEnum

Name | Value
---- | -----
PRICE | &quot;Price&quot;
SPREAD | &quot;Spread&quot;
RATE | &quot;Rate&quot;
LOGNORMALVOL | &quot;LogNormalVol&quot;
NORMALVOL | &quot;NormalVol&quot;
PARSPREAD | &quot;ParSpread&quot;
ISDASPREAD | &quot;IsdaSpread&quot;
UPFRONT | &quot;Upfront&quot;
INDEX | &quot;Index&quot;
RATIO | &quot;Ratio&quot;
DELTA | &quot;Delta&quot;
POOLFACTOR | &quot;PoolFactor&quot;



