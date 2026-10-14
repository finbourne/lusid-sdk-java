# com.finbourne.lusid.model.SeriesBreakdown
The valuation of one series within a share class at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifier** | **String** | The identifier of the series within its share class. | [default to String]
**units** | **java.math.BigDecimal** | The units in issue in the series at the valuation point. | [default to java.math.BigDecimal]
**nav** | **java.math.BigDecimal** | The series&#39; share of the share class NAV, in the fund currency. | [default to java.math.BigDecimal]
**navPerUnit** | **java.math.BigDecimal** | The series NAV per unit in the share class currency, rounded as the share class unit price is. | [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The series&#39; opening NAV as a proportion of the share class&#39;s opening NAV. Zero for a series with no units; sums to 1 across the series that hold units. | [default to java.math.BigDecimal]
**pnl** | **java.math.BigDecimal** | The P&amp;L apportioned to the series in the period: its NAV less its opening NAV. | [default to java.math.BigDecimal]
**previousNav** | **java.math.BigDecimal** | The series NAV at the previous valuation point, in the fund currency. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SeriesBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeriesIdentifier = "example SeriesIdentifier";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal Nav = new java.math.BigDecimal("100.00");
java.math.BigDecimal NavPerUnit = new java.math.BigDecimal("100.00");
java.math.BigDecimal CapitalRatio = new java.math.BigDecimal("100.00");
java.math.BigDecimal Pnl = new java.math.BigDecimal("100.00");
java.math.BigDecimal PreviousNav = new java.math.BigDecimal("100.00");


SeriesBreakdown seriesBreakdownInstance = new SeriesBreakdown()
    .SeriesIdentifier(SeriesIdentifier)
    .Units(Units)
    .Nav(Nav)
    .NavPerUnit(NavPerUnit)
    .CapitalRatio(CapitalRatio)
    .Pnl(Pnl)
    .PreviousNav(PreviousNav);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
