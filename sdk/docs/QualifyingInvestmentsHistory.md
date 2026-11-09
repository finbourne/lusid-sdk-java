# com.finbourne.lusid.model.QualifyingInvestmentsHistory
The daily qualifying-investments history of one collective investment scheme and the flips within it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**luid** | **String** | The LUSID instrument identifier of the collective investment scheme. | [default to String]
**thresholdPercent** | **java.math.BigDecimal** | The qualifying investments percentage the scheme must exceed to be a bond fund. | [default to java.math.BigDecimal]
**observations** | [**List&lt;QualifyingInvestmentsObservation&gt;**](QualifyingInvestmentsObservation.md) | The daily qualifying investments observations in the requested window, oldest first. | [default to List<QualifyingInvestmentsObservation>]
**crossings** | [**List&lt;QualifyingInvestmentsCrossing&gt;**](QualifyingInvestmentsCrossing.md) | Each pair of consecutive observations where the bond fund result flipped. | [default to List<QualifyingInvestmentsCrossing>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.QualifyingInvestmentsHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String Luid = "example Luid";
java.math.BigDecimal ThresholdPercent = new java.math.BigDecimal("100.00");
List<QualifyingInvestmentsObservation> Observations = new List<QualifyingInvestmentsObservation>();
List<QualifyingInvestmentsCrossing> Crossings = new List<QualifyingInvestmentsCrossing>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


QualifyingInvestmentsHistory qualifyingInvestmentsHistoryInstance = new QualifyingInvestmentsHistory()
    .Href(Href)
    .Luid(Luid)
    .ThresholdPercent(ThresholdPercent)
    .Observations(Observations)
    .Crossings(Crossings)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
