# com.finbourne.lusid.model.CompositeDispersion
A list of Dispersion calculations for the given years.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date for which dipsersion calculation has been done. This should be 31 Dec for each given year. | [default to OffsetDateTime]
**dispersionCalculation** | **java.math.BigDecimal** | The result for the dispersion calculation on the given effectiveAt. | [optional] [default to java.math.BigDecimal]
**variance** | **java.math.BigDecimal** | The variance on the given effectiveAt. | [optional] [default to java.math.BigDecimal]
**firstQuartile** | **java.math.BigDecimal** | First Quartile (Q1) &#x3D; (lower quartile) &#x3D; the middle of the bottom half of the returns. | [optional] [default to java.math.BigDecimal]
**thirdQuartile** | **java.math.BigDecimal** | Third Quartile (Q3) &#x3D; (higher quartile) &#x3D; the middle of the top half of the returns. | [optional] [default to java.math.BigDecimal]
**range** | **java.math.BigDecimal** | Highest return - Lowest return. | [optional] [default to java.math.BigDecimal]
**constituentsInScope** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which are part of the dispersion calcualtion. | [optional] [default to List<ResourceId>]
**constituentsExcluded** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing the Composite members which are not part of the dispersion calculation | [optional] [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.CompositeDispersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal DispersionCalculation = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Variance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FirstQuartile = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ThirdQuartile = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Range = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<ResourceId> ConstituentsInScope = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> ConstituentsExcluded = new List<ResourceId>();


CompositeDispersion compositeDispersionInstance = new CompositeDispersion()
    .EffectiveAt(EffectiveAt)
    .DispersionCalculation(DispersionCalculation)
    .Variance(Variance)
    .FirstQuartile(FirstQuartile)
    .ThirdQuartile(ThirdQuartile)
    .Range(Range)
    .ConstituentsInScope(ConstituentsInScope)
    .ConstituentsExcluded(ConstituentsExcluded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
