# com.finbourne.lusid.model.PerformanceReturn
A list of Returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the return. | [default to OffsetDateTime]
**rateOfReturn** | **java.math.BigDecimal** | The return number. | [default to java.math.BigDecimal]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**period** | **String** | Upsert the returns on a Daily or Monthly period. Defaults to Daily. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PerformanceReturn;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
java.math.BigDecimal RateOfReturn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OpeningMarketValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ClosingMarketValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Period = "example Period";


PerformanceReturn performanceReturnInstance = new PerformanceReturn()
    .EffectiveAt(EffectiveAt)
    .RateOfReturn(RateOfReturn)
    .OpeningMarketValue(OpeningMarketValue)
    .ClosingMarketValue(ClosingMarketValue)
    .Period(Period);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
