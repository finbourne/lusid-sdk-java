# com.finbourne.lusid.model.InflationLinkedBond
Inflation Linked Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the bond. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**inflationIndexConventions** | [**InflationIndexConventions**](InflationIndexConventions.md) |  | [default to InflationIndexConventions]
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | [default to java.math.BigDecimal]
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [optional] [default to Map<String, String>]
**baseCPI** | **java.math.BigDecimal** | BaseCPI value. This is optional, if not provided the BaseCPI value will be calculated from the BaseCPIDate,  if that too is not present the StartDate will be used.     If provided then this value will always set the BaseCPI on this bond.     The BaseCPI of an inflation linked bond is calculated using the following logic:  - If a BaseCPI value is provided, this is used.  - Otherwise, if BaseCPIDate is provided, the CPI for this date is calculated and used.  - Otherwise, the CPI for the StartDate is calculated and used.     Note that if both BaseCPI and BaseCPIDate are set, the BaseCPI value will be used and the BaseCPIDate  will be ignored but can still be added for informative purposes.     Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the BaseCPIDate. | [optional] [default to java.math.BigDecimal]
**baseCPIDate** | [**OffsetDateTime**](OffsetDateTime.md) | BaseCPIDate. This is optional. Gives the date that the BaseCPI is calculated for.     Note this is an un-lagged date (similar to StartDate) so the Bond ObservationLag will  be applied to this date when calculating the CPI.     The BaseCPI of an inflation linked bond is calculated using the following logic:  - If a BaseCPI value is provided, this is used.  - Otherwise, if BaseCPIDate is provided, the CPI for this date is calculated and used.  - Otherwise, the CPI for the StartDate is calculated and used.     Note that if both BaseCPI and BaseCPIDate are set, the BaseCPI value will be used and the BaseCPIDate  will be ignored but can still be added for informative purposes.     Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the actual BaseCPI. | [optional] [default to OffsetDateTime]
**calculationType** | **String** | The calculation type applied to the bond coupon and principal amount.  The default CalculationType is &#x60;Standard&#x60;.    Supported string (enumeration) values are: [Standard, Quarterly, Ratio, Brazil, StandardAccruedOnly, RatioAccruedOnly, StandardWithCappedAccruedInterest]. | [optional] [default to String]
**exDividendDays** | **Integer** | Number of Good Business Days before the next coupon payment, in which the bond goes ex-dividend. | [optional] [default to Integer]
**indexPrecision** | **Integer** | Number of decimal places used to round IndexRatio. This defaults to 5 if not set. | [optional] [default to Integer]
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset. | [default to java.math.BigDecimal]
**principalProtection** | **Boolean** | If true then the principal is protected in that the redemption amount will be at least the face value (Principal).  This is typically set to true for inflation linked bonds issued by the United States and France (for example).  This is typically set to false for inflation linked bonds issued by the United Kingdom (post 2005).  For other sovereigns this can vary from issue to issue.  If not set this property defaults to true.  This is sometimes referred to as Deflation protection or an inflation floor of 0%. | [optional] [default to Boolean]
**stubType** | **String** | StubType. Most Inflation linked bonds have a ShortFront stub type so this is the default, however in some cases  with a long front stub LongFront should be selected.  StubType Both is not supported for InflationLinkedBonds.    Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both]. | [optional] [default to String]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. | [optional] [default to List<RoundingConvention>]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**originalIssuePrice** | **java.math.BigDecimal** | The price the bond was issued at. This is to be entered as a percentage of par, for example a value of 98.5 would represent 98.5%. | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.InflationLinkedBond;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
FlowConventions FlowConventions = new FlowConventions();
InflationIndexConventions InflationIndexConventions = new InflationIndexConventions();
java.math.BigDecimal CouponRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable java.math.BigDecimal BaseCPI = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime BaseCPIDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String CalculationType = "example CalculationType";
@jakarta.annotation.Nullable Integer ExDividendDays = new Integer("100.00");
Integer IndexPrecision = new Integer("100.00");
java.math.BigDecimal Principal = new java.math.BigDecimal("100.00");
Boolean PrincipalProtection = true;
@jakarta.annotation.Nullable String StubType = "example StubType";
@jakarta.annotation.Nullable List<RoundingConvention> RoundingConventions = new List<RoundingConvention>();
TradingConventions TradingConventions = new TradingConventions();
@jakarta.annotation.Nullable java.math.BigDecimal OriginalIssuePrice = new java.math.BigDecimal("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


InflationLinkedBond inflationLinkedBondInstance = new InflationLinkedBond()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .InflationIndexConventions(InflationIndexConventions)
    .CouponRate(CouponRate)
    .Identifiers(Identifiers)
    .BaseCPI(BaseCPI)
    .BaseCPIDate(BaseCPIDate)
    .CalculationType(CalculationType)
    .ExDividendDays(ExDividendDays)
    .IndexPrecision(IndexPrecision)
    .Principal(Principal)
    .PrincipalProtection(PrincipalProtection)
    .StubType(StubType)
    .RoundingConventions(RoundingConventions)
    .TradingConventions(TradingConventions)
    .OriginalIssuePrice(OriginalIssuePrice)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
