# com.finbourne.lusid.model.InflationCurveData
Market data for an inflation curve, represented by a list of zero-coupon inflation swap  instruments and corresponding market quotes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildDate** | [**OffsetDateTime**](OffsetDateTime.md) | Build date of the curve - this is the reference date for resolution of the swap constituents. | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve.  The only supported instrument type is: [InflationSwap].  Each is a zero-coupon swap starting on the build date. Their maturities form a contiguous monthly run (one per CPI month, each maturing on the index&#39;s inflationRollDay), then whole-year pillars one year apart; either part may be empty, and a curve with no monthly run starts at 1Y.  A monthly pillar on a month whose index print is already published fails the curve build. Quarterly (3M) indices take whole-year pillars only. A solved index that moves more than 25% from one period to the next (a forward rate above about 1,355% a year for a monthly index, 144% for a quarterly one) fails the curve build; published prints are exempt. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | [default to List<MarketQuote>]
**seasonalFactors** | **List&lt;java.math.BigDecimal&gt;** | Optional multiplicative seasonal adjustment factors, one per calendar month starting from January.  If provided there must be exactly 12 factors.  Seasonal factors only shape the months between pillars, so they have no effect on a curve with a pillar for every month; no warning is given. | [optional] [default to List<java.math.BigDecimal>]
**outputType** | **String** | What the values of the built curve represent.  Supported string (enumeration) values are: [Level, Ratio].  Defaults to \&quot;Level\&quot; if not provided. | [optional] [default to String]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.InflationCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BuildDate = OffsetDateTime.now();
List<LusidInstrument> Instruments = new List<LusidInstrument>();
List<MarketQuote> Quotes = new List<MarketQuote>();
@jakarta.annotation.Nullable List<java.math.BigDecimal> SeasonalFactors = new List<java.math.BigDecimal>();
@jakarta.annotation.Nullable String OutputType = "example OutputType";
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
Version Version = new Version();


InflationCurveData inflationCurveDataInstance = new InflationCurveData()
    .BuildDate(BuildDate)
    .Instruments(Instruments)
    .Quotes(Quotes)
    .SeasonalFactors(SeasonalFactors)
    .OutputType(OutputType)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
