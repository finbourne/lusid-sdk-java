# com.finbourne.lusid.model.EquityCurveByPricesData
Contains data (i.e. dates and prices + metadata) for building Equity curves

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the provided prices | [default to OffsetDateTime]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates provided for the forward price of the Equity at the corresponding price in Prices.  These dates should be in the future with respect to the BaseDate. | [default to List<OffsetDateTime>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**prices** | **List&lt;java.math.BigDecimal&gt;** | Prices provided for the forward price of the Equity at the corresponding date in Dates. | [default to List<java.math.BigDecimal>]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]

```java
import com.finbourne.lusid.model.EquityCurveByPricesData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
List<OffsetDateTime> Dates = new List<OffsetDateTime>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
List<java.math.BigDecimal> Prices = new List<java.math.BigDecimal>();
MarketDataOptions MarketDataOptions = new MarketDataOptions();


EquityCurveByPricesData equityCurveByPricesDataInstance = new EquityCurveByPricesData()
    .BaseDate(BaseDate)
    .Dates(Dates)
    .Lineage(Lineage)
    .Prices(Prices)
    .MarketDataOptions(MarketDataOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
