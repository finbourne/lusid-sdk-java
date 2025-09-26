# com.finbourne.lusid.model.InflationLeg
LUSID representation of an Inflation Leg.  This leg instrument is part of the InflationSwap instrument, but can also be used as a standalone instrument.  The implementation supports the following inflation leg types:  * Zero Coupon inflation leg (CPI Leg), with a single payment at maturity.  * Year on Year inflation leg  * LPI Swap Leg (capped and floored YoY)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**baseCPI** | **java.math.BigDecimal** | Optional BaseCPI, if specified it will be used in place of BaseCPI(StartDate).  This should not be required for standard inflation swaps. | [optional] [default to java.math.BigDecimal]
**calculationType** | **String** | The calculation type.  ZeroCoupon is used for CPILegs where there is a single payment at maturity of  Notional generate justfile test_sdk (CPI(T) / CPI(T0) - 1)  where CPI(T0) is the BaseCPI of this leg  YearOnYear is used for YoY and LPI swap legs where there is a series of annual payments  Notional generate justfile test_sdk dayCount generate justfile test_sdk (CPI(t) / CPI(t-1) - 1)  If a cap and floor is added to this it becomes an LPI swap leg.  Compounded is used for inflation swap legs where there is a series of annual payments  Notional generate justfile test_sdk dayCount generate justfile test_sdk (CPI(t) / CPI(T0) - 1)  i.e. the BaseCPI is used every year. These swaps are not as common as CPI or    Supported string (enumeration) values are: [ZeroCoupon, YearOnYear, Compounded]. | [default to String]
**capRate** | **java.math.BigDecimal** | Optional cap, needed for LPI Legs or CPI Legs with Caps | [optional] [default to java.math.BigDecimal]
**floorRate** | **java.math.BigDecimal** | Optional floor, needed for LPI Legs or CPI Legs with Floors. | [optional] [default to java.math.BigDecimal]
**inflationIndexConventions** | [**InflationIndexConventions**](InflationIndexConventions.md) |  | [default to InflationIndexConventions]
**notional** | **java.math.BigDecimal** | The notional | [default to java.math.BigDecimal]
**payReceive** | **String** | PayReceive flag for the inflation leg.  This field is optional and defaults to Pay.    Supported string (enumeration) values are: [Pay, Receive]. | [optional] [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.InflationLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
FlowConventions FlowConventions = new FlowConventions();
@jakarta.annotation.Nullable java.math.BigDecimal BaseCPI = new java.math.BigDecimal("100.00");
String CalculationType = "example CalculationType";
@jakarta.annotation.Nullable java.math.BigDecimal CapRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FloorRate = new java.math.BigDecimal("100.00");
InflationIndexConventions InflationIndexConventions = new InflationIndexConventions();
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PayReceive = "example PayReceive";
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


InflationLeg inflationLegInstance = new InflationLeg()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .BaseCPI(BaseCPI)
    .CalculationType(CalculationType)
    .CapRate(CapRate)
    .FloorRate(FloorRate)
    .InflationIndexConventions(InflationIndexConventions)
    .Notional(Notional)
    .PayReceive(PayReceive)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
