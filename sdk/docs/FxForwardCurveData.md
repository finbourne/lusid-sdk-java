# com.finbourne.lusid.model.FxForwardCurveData
Contains data (i.e. dates and rates + metadata) for building fx forward curves

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates for which the forward rates apply | [default to List<OffsetDateTime>]
**rates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy) | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.FxForwardCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String FgnCcy = "example FgnCcy";
List<OffsetDateTime> Dates = new List<OffsetDateTime>();
List<java.math.BigDecimal> Rates = new List<java.math.BigDecimal>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
Version Version = new Version();


FxForwardCurveData fxForwardCurveDataInstance = new FxForwardCurveData()
    .BaseDate(BaseDate)
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .Dates(Dates)
    .Rates(Rates)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
