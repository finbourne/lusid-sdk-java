# com.finbourne.lusid.model.Facility

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**facilityCode** | **String** | The code of the Facility, unique within the Fund. | [optional] [default to String]
**displayName** | **String** | The name of the Facility. | [default to String]
**description** | **String** | A description for the Facility. | [optional] [default to String]
**lender** | **String** | The name of the lender providing the Facility. | [default to String]
**limit** | **java.math.BigDecimal** | The committed limit of the Facility. Must be greater than zero. | [default to java.math.BigDecimal]
**currency** | **String** | The three-letter currency code in which the Facility is denominated. | [default to String]
**rateReference** | **String** | The reference rate the Facility interest is based on, for example SOFR. Optional. | [optional] [default to String]
**margin** | **java.math.BigDecimal** | The margin over the reference rate, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**commitmentFeeRate** | **java.math.BigDecimal** | The annual commitment fee rate charged on the undrawn balance, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day count convention used to accrue interest. One of: Act360, Act365, Act365F, Thirty360. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Facility;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String FacilityCode = "example FacilityCode";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Lender = "example Lender";
java.math.BigDecimal Limit = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
@jakarta.annotation.Nullable String RateReference = "example RateReference";
java.math.BigDecimal Margin = new java.math.BigDecimal("100.00");
java.math.BigDecimal CommitmentFeeRate = new java.math.BigDecimal("100.00");
String DayCountConvention = "example DayCountConvention";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Facility facilityInstance = new Facility()
    .Href(Href)
    .FacilityCode(FacilityCode)
    .DisplayName(DisplayName)
    .Description(Description)
    .Lender(Lender)
    .Limit(Limit)
    .Currency(Currency)
    .RateReference(RateReference)
    .Margin(Margin)
    .CommitmentFeeRate(CommitmentFeeRate)
    .DayCountConvention(DayCountConvention)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
