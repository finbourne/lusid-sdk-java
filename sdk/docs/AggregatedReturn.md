# com.finbourne.lusid.model.AggregatedReturn
A list of Aggregated Returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the return. | [default to OffsetDateTime]
**endOfPeriod** | [**OffsetDateTime**](OffsetDateTime.md) | The end of period date. For the monthly period this will be the Month End Date. | [default to OffsetDateTime]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**metricsValue** | **Map&lt;String, java.math.BigDecimal&gt;** | The value for the specified metric. | [default to Map<String, java.math.BigDecimal>]
**frequency** | **String** | Show the aggregated output returns on a Daily or Monthly period. | [optional] [default to String]
**compositeMembers** | **Integer** | The number of members in the Composite on the given day. | [optional] [default to Integer]
**compositeMembersWithoutReturn** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which post no return on the given day. | [optional] [default to List<ResourceId>]
**warnings** | **List&lt;String&gt;** | List of the warnings about the calculation of the aggregated return. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.AggregatedReturn;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime EndOfPeriod = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal OpeningMarketValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ClosingMarketValue = new java.math.BigDecimal("100.00");
Map<String, java.math.BigDecimal> MetricsValue = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable String Frequency = "example Frequency";
@jakarta.annotation.Nullable Integer CompositeMembers = new Integer("100.00");
@jakarta.annotation.Nullable List<ResourceId> CompositeMembersWithoutReturn = new List<ResourceId>();
@jakarta.annotation.Nullable List<String> Warnings = new List<String>();


AggregatedReturn aggregatedReturnInstance = new AggregatedReturn()
    .EffectiveAt(EffectiveAt)
    .EndOfPeriod(EndOfPeriod)
    .OpeningMarketValue(OpeningMarketValue)
    .ClosingMarketValue(ClosingMarketValue)
    .MetricsValue(MetricsValue)
    .Frequency(Frequency)
    .CompositeMembers(CompositeMembers)
    .CompositeMembersWithoutReturn(CompositeMembersWithoutReturn)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
