# com.finbourne.lusid.model.InflationCurveData
Market data for an inflation curve, represented by a list of zero-coupon inflation swap  instruments and corresponding market quotes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildDate** | [**OffsetDateTime**](OffsetDateTime.md) | Build date of the curve - this is the reference date for resolution of the swap constituents. | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve.  The only supported instrument type is: [InflationSwap]. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | [default to List<MarketQuote>]
**seasonalFactors** | **List&lt;java.math.BigDecimal&gt;** | Optional multiplicative seasonal adjustment factors, one per calendar month starting from January.  If provided there must be exactly 12 factors. | [optional] [default to List<java.math.BigDecimal>]
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
