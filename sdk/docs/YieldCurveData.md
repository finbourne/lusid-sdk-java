# com.finbourne.lusid.model.YieldCurveData
Market data for a yield curve, represented by a list of instruments and corresponding market quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | [default to List<MarketQuote>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**fundingCurveName** | **String** | Optional name of the funding curve under which the calibration instruments are discounted,  for projection curves that are bootstrapped under a separate discount curve. This is the  funding identifier of the rates dependency for the calibration instruments&#39; domestic currency,  so a value of &#39;EUROIS&#39; names the discounting dependency Rates/EUR/EUROIS. When omitted the  calibration instruments are discounted on the curve being built, which is the classic  single-curve bootstrap. | [optional] [default to String]

```java
import com.finbourne.lusid.model.YieldCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
List<LusidInstrument> Instruments = new List<LusidInstrument>();
List<MarketQuote> Quotes = new List<MarketQuote>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
Version Version = new Version();
@jakarta.annotation.Nullable String FundingCurveName = "example FundingCurveName";


YieldCurveData yieldCurveDataInstance = new YieldCurveData()
    .BaseDate(BaseDate)
    .Instruments(Instruments)
    .Quotes(Quotes)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Version(Version)
    .FundingCurveName(FundingCurveName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
