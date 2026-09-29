# com.finbourne.lusid.model.FxForwardPipsCurveData
Contains data (i.e. dates and pips + metadata) for building fx forward curves (when combined with a spot rate to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates for which the forward rates apply | [default to List<OffsetDateTime>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**pipMultiplier** | **java.math.BigDecimal** | Optional. The scaling factor applied to the pip rates to convert them into a forward rate adjustment,  so that forwardRate &#x3D; spotRate + pipRate generate justfile test_sdk pipMultiplier. Must be strictly positive when supplied.  When omitted, the market convention for the currency pair is used:  0.01 when the foreign (quote) currency is JPY, and 0.0001 (the four-decimal-place convention of the major pairs) otherwise. | [optional] [default to java.math.BigDecimal]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.FxForwardPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String FgnCcy = "example FgnCcy";
List<OffsetDateTime> Dates = new List<OffsetDateTime>();
List<java.math.BigDecimal> PipRates = new List<java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal PipMultiplier = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
Version Version = new Version();


FxForwardPipsCurveData fxForwardPipsCurveDataInstance = new FxForwardPipsCurveData()
    .BaseDate(BaseDate)
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .Dates(Dates)
    .PipRates(PipRates)
    .PipMultiplier(PipMultiplier)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
