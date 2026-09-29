# com.finbourne.lusid.model.FxForwardTenorPipsCurveData
Contains data (i.e. tenors and pips + metadata) for building fx forward curves (when combined with a spot rate and a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [Specifying tenors in LUSID](https://support.lusid.com/docs/specifying-tenors-in-lusid) | [default to List<String>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**pipMultiplier** | **java.math.BigDecimal** | Optional. The scaling factor applied to the pip rates to convert them into a forward rate adjustment,  so that forwardRate &#x3D; spotRate + pipRate generate justfile test_sdk pipMultiplier. Must be strictly positive when supplied.  When omitted, the market convention for the currency pair is used:  0.01 when the foreign (quote) currency is JPY, and 0.0001 (the four-decimal-place convention of the major pairs) otherwise. | [optional] [default to java.math.BigDecimal]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. | [optional] [default to List<FxTenorConvention>]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided. Available values: SingleCalendar, UnionCalendars. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.FxForwardTenorPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String FgnCcy = "example FgnCcy";
List<String> Tenors = new List<String>();
List<java.math.BigDecimal> PipRates = new List<java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal PipMultiplier = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
@jakarta.annotation.Nullable List<FxTenorConvention> Calendars = new List<FxTenorConvention>();
@jakarta.annotation.Nullable String SpotDaysCalculationType = "example SpotDaysCalculationType";
Version Version = new Version();


FxForwardTenorPipsCurveData fxForwardTenorPipsCurveDataInstance = new FxForwardTenorPipsCurveData()
    .BaseDate(BaseDate)
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .Tenors(Tenors)
    .PipRates(PipRates)
    .PipMultiplier(PipMultiplier)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Calendars(Calendars)
    .SpotDaysCalculationType(SpotDaysCalculationType)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
