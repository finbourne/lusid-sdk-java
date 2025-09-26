# com.finbourne.lusid.model.CreditSpreadCurveData
A credit spread curve matching tenors against par spread quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the curve | [default to String]
**tenors** | **List&lt;String&gt;** | The tenors for which the rates apply  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**spreads** | **List&lt;java.math.BigDecimal&gt;** | Par spread quotes corresponding to the tenors. | [default to List<java.math.BigDecimal>]
**recoveryRate** | **java.math.BigDecimal** | The recovery rate in default. | [default to java.math.BigDecimal]
**referenceDate** | [**OffsetDateTime**](OffsetDateTime.md) | If tenors are provided, this is the date against which the tenors will be resolved.  This is of importance to CDX spread quotes, which are usually quoted in tenors relative to the CDX start date.  In this case, the ReferenceDate would be equal to the CDX start date, and the BaseDate would be the date for which the spreads are valid.  If not provided, this defaults to the BaseDate of the curve. | [optional] [default to OffsetDateTime]
**maturities** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The maturity dates for which the rates apply.  Either tenors or maturities should be provided, not both. | [optional] [default to List<OffsetDateTime>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]

```java
import com.finbourne.lusid.model.CreditSpreadCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
List<String> Tenors = new List<String>();
List<java.math.BigDecimal> Spreads = new List<java.math.BigDecimal>();
java.math.BigDecimal RecoveryRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ReferenceDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<OffsetDateTime> Maturities = new List<OffsetDateTime>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
MarketDataOptions MarketDataOptions = new MarketDataOptions();


CreditSpreadCurveData creditSpreadCurveDataInstance = new CreditSpreadCurveData()
    .BaseDate(BaseDate)
    .DomCcy(DomCcy)
    .Tenors(Tenors)
    .Spreads(Spreads)
    .RecoveryRate(RecoveryRate)
    .ReferenceDate(ReferenceDate)
    .Maturities(Maturities)
    .Lineage(Lineage)
    .MarketDataOptions(MarketDataOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
