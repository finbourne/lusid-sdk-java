# com.finbourne.lusid.model.Fee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**feeCode** | **String** | The code of the Fee. | [optional] [default to String]
**feeTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Fee. | [default to String]
**description** | **String** | A description for the Fee. | [optional] [default to String]
**origin** | **String** | The origin or source of the Fee accrual. | [optional] [default to String]
**calculationBase** | **String** | The calculation base for a Fee that is calculated using a percentage (TotalAnnualAccrualAmount and CalculationBase cannot both be present). When the Fee is a ShareClass Fee (i.e: when ShareClasses contains at least one value), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;ShareClass.GAV\&quot;, \&quot;ShareClass.GAV - ShareClass.Fees[ShareClassFeeCode1].Amount\&quot;, \&quot;ShareClass.Fees[ShareClassFeeCode1].CalculationBase\&quot;. When the Fee is a NonShareClassSpecific Fee (i.e: when ShareClasses contains no values), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;GAV\&quot;, \&quot;GAV - Fees[NonClassSpecificFeeCode1].Amount\&quot;, \&quot;Fees[NonClassSpecificFeeCode1].CalculationBase\&quot;.  | [optional] [default to String]
**accrualCurrency** | **String** | The accrual currency. | [default to String]
**treatment** | **String** | The accrual period of the Fee; &#39;Monthly&#39; or &#39;Daily&#39;. | [default to String]
**totalAnnualAccrualAmount** | **java.math.BigDecimal** | The total annual accrued amount for the Fee. (TotalAnnualAccrualAmount and CalculationBase cannot both be present) | [optional] [default to java.math.BigDecimal]
**feeRatePercentage** | **java.math.BigDecimal** | The fee rate percentage. (Required when CalculationBase is present and not compatible with TotalAnnualAccrualAmount) | [optional] [default to java.math.BigDecimal]
**payableFrequency** | **String** | The payable frequency for the Fee; &#39;Annually&#39;, &#39;Quarterly&#39; or &#39;Monthly&#39;. | [default to String]
**businessDayConvention** | **String** | The business day convention to use for Fee calculations on weekends or holidays. Supported string values are: [Previous, P, Following, F, None]. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the Fee. | [default to OffsetDateTime]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the Fee. | [optional] [default to OffsetDateTime]
**anchorDate** | [**DayMonth**](DayMonth.md) |  | [optional] [default to DayMonth]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shareClasses** | **List&lt;String&gt;** | The short codes of the ShareClasses that the Fee should be applied to. Optional: if this is null or empty, then the Fee will be divided between all the ShareClasses of the Fund according to the capital ratio. | [optional] [default to List<String>]
**navTypeCode** | **String** | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Fee;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String FeeCode = "example FeeCode";
ResourceId FeeTypeId = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Origin = "example Origin";
@jakarta.annotation.Nullable String CalculationBase = "example CalculationBase";
String AccrualCurrency = "example AccrualCurrency";
String Treatment = "example Treatment";
@jakarta.annotation.Nullable java.math.BigDecimal TotalAnnualAccrualAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FeeRatePercentage = new java.math.BigDecimal("100.00");
String PayableFrequency = "example PayableFrequency";
String BusinessDayConvention = "example BusinessDayConvention";
OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime EndDate = OffsetDateTime.now();
DayMonth AnchorDate = new DayMonth();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable List<String> ShareClasses = new List<String>();
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Fee feeInstance = new Fee()
    .Href(Href)
    .FeeCode(FeeCode)
    .FeeTypeId(FeeTypeId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Origin(Origin)
    .CalculationBase(CalculationBase)
    .AccrualCurrency(AccrualCurrency)
    .Treatment(Treatment)
    .TotalAnnualAccrualAmount(TotalAnnualAccrualAmount)
    .FeeRatePercentage(FeeRatePercentage)
    .PayableFrequency(PayableFrequency)
    .BusinessDayConvention(BusinessDayConvention)
    .StartDate(StartDate)
    .EndDate(EndDate)
    .AnchorDate(AnchorDate)
    .Properties(Properties)
    .Version(Version)
    .PortfolioId(PortfolioId)
    .ShareClasses(ShareClasses)
    .NavTypeCode(NavTypeCode)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
