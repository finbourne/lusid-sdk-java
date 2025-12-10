# com.finbourne.lusid.model.DiscountFactorCurveData
A curve containing discount factors and dates to which they apply

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | BaseDate for the Curve | [default to OffsetDateTime]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates for which the discount factors apply | [default to List<OffsetDateTime>]
**discountFactors** | **List&lt;java.math.BigDecimal&gt;** | Discount factors to be applied to cashflow on the specified dates | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.DiscountFactorCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
List<OffsetDateTime> Dates = new List<OffsetDateTime>();
List<java.math.BigDecimal> DiscountFactors = new List<java.math.BigDecimal>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();
Version Version = new Version();


DiscountFactorCurveData discountFactorCurveDataInstance = new DiscountFactorCurveData()
    .BaseDate(BaseDate)
    .Dates(Dates)
    .DiscountFactors(DiscountFactors)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
