# com.finbourne.lusid.model.FxForwardTenorPipsCurveData
Contains data (i.e. tenors and pips + metadata) for building fx forward curves (when combined with a spot rate and a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. | [optional] [default to List<FxTenorConvention>]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided.  Supported string (enumeration) values are: [ SingleCalendar, UnionCalendars ] | [optional] [default to String]

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
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
@jakarta.annotation.Nullable List<FxTenorConvention> Calendars = new List<FxTenorConvention>();
@jakarta.annotation.Nullable String SpotDaysCalculationType = "example SpotDaysCalculationType";


FxForwardTenorPipsCurveData fxForwardTenorPipsCurveDataInstance = new FxForwardTenorPipsCurveData()
    .BaseDate(BaseDate)
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .Tenors(Tenors)
    .PipRates(PipRates)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Calendars(Calendars)
    .SpotDaysCalculationType(SpotDaysCalculationType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
