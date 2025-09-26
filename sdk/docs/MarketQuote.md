# com.finbourne.lusid.model.MarketQuote
The market quote for an observable which will be used to calibrate the market data,  including the format of the quote.  e.g. a volatility quote for a specific strike and expiry  the par rate of a swap     This is a slimmed down version of a full Quote that can be stored in our QuoteStore to  remove lineage, price source etc. for ease of use when creating complex market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteType** | **String** | The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor | [default to String]
**value** | **java.math.BigDecimal** | Numeric value of the quote | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MarketQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

String QuoteType = "example QuoteType";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");


MarketQuote marketQuoteInstance = new MarketQuote()
    .QuoteType(QuoteType)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
