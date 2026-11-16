# com.finbourne.lusid.model.InflationLeg
LUSID representation of an Inflation Leg.  This leg instrument is part of the InflationSwap instrument, but can also be used as a standalone instrument.  The implementation supports the following inflation leg types:  * Zero Coupon inflation leg (CPI Leg), with a single payment at maturity.  * Year on Year inflation leg  * LPI Swap Leg (capped and floored YoY)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**baseCPI** | **java.math.BigDecimal** | Optional BaseCPI, if specified it will be used in place of BaseCPI(StartDate).  This should not be required for standard inflation swaps. | [optional] [default to java.math.BigDecimal]
**calculationType** | **String** | The calculation type.  ZeroCoupon is used for CPILegs where there is a single payment at maturity of  Notional docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk (CPI(T) / CPI(T0) - 1)  where CPI(T0) is the BaseCPI of this leg  YearOnYear is used for YoY and LPI swap legs where there is a series of annual payments  Notional docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk dayCount docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk (CPI(t) / CPI(t-1) - 1)  If a cap and floor is added to this it becomes an LPI swap leg.  Compounded is used for inflation swap legs where there is a series of annual payments  Notional docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk dayCount docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk (CPI(t) / CPI(T0) - 1)  i.e. the BaseCPI is used every year. These swaps are not as common as CPI or    IndexedCoupon is used for the coupon stream of an inflation-linked bond, where each period pays  Notional docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk FixedRate docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk dayCount docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk IndexRatio(t)  and IndexRatio(t) is CPI(t) / BaseCPI rounded to IndexPrecision, as on InflationLinkedBond.     Supported string (enumeration) values are: [ZeroCoupon, YearOnYear, Compounded, IndexedCoupon]. | [default to String]
**capRate** | **java.math.BigDecimal** | Optional cap on a YearOnYear leg: each period&#39;s 12-month inflation rate is clamped to at most this rate before  the accrual fraction is applied, at any payment frequency, so an LPI leg caps each year at 5%. In the legs  form of an InflationSwap it is rejected on a ZeroCoupon, Compounded or IndexedCoupon leg, where it would clamp  the total change since the start. In the deprecated inflationLeg form a ZeroCoupon or Compounded cap keeps  clamping that total change, as today. | [optional] [default to java.math.BigDecimal]
**floorRate** | **java.math.BigDecimal** | Optional floor on a YearOnYear leg: each period&#39;s 12-month inflation rate is clamped to at least this rate  before the accrual fraction is applied, at any payment frequency, so a 0% floor stops deflation being paid.  In the legs form of an InflationSwap it is rejected on a ZeroCoupon, Compounded or IndexedCoupon leg, where it  would clamp the total change since the start. In the deprecated inflationLeg form a ZeroCoupon or Compounded  floor keeps clamping that total change, as today. | [optional] [default to java.math.BigDecimal]
**inflationIndexConventions** | [**InflationIndexConventions**](InflationIndexConventions.md) |  | [default to InflationIndexConventions]
**notional** | **java.math.BigDecimal** | The notional | [default to java.math.BigDecimal]
**payReceive** | **String** | PayReceive flag for the inflation leg.  This field is optional and defaults to Pay.    Supported string (enumeration) values are: [Pay, Receive]. | [optional] [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**fixedRate** | **java.math.BigDecimal** | The real coupon rate of an IndexedCoupon leg: each period pays Notional docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk FixedRate docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk dayCount docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk IndexRatio.  Required when CalculationType is IndexedCoupon and not allowed otherwise. | [optional] [default to java.math.BigDecimal]
**baseCPIDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional date the base CPI is observed on, with the same meaning as on InflationLinkedBond: the un-lagged  date (for a bond asset swap, the bond&#39;s dated date) whose reference CPI is the base. Defaults to the StartDate.  Ignored when BaseCPI is given. | [optional] [default to OffsetDateTime]
**indexPrecision** | **Integer** | Number of decimal places the IndexedCoupon index ratio is rounded to, as on InflationLinkedBond. Defaults to 5. | [optional] [default to Integer]
**principalProtection** | **Boolean** | Whether an indexed final notional exchange is floored at par, paying max(IndexRatio, 1) times the amount, as on  InflationLinkedBond. Coupons are never floored. Defaults to true. | [optional] [default to Boolean]
**notionalExchangeType** | **String** | Which notional exchanges the leg makes. The start exchange pays the un-indexed amount against the leg; the  maturity exchange pays the amount times the index ratio with the leg, floored at par under PrincipalProtection.     Supported string (enumeration) values are: [None, Initial, Final, Both].  Defaults to \&quot;None\&quot; if not set. | [optional] [default to String]
**initialExchangeAmount** | **java.math.BigDecimal** | The amount exchanged at the start of the leg, when NotionalExchangeType is Initial or Both. Defaults to the  notional. Never indexed. Must be non-negative. | [optional] [default to java.math.BigDecimal]
**finalExchangeAmount** | **java.math.BigDecimal** | The real amount exchanged at maturity, when NotionalExchangeType is Final or Both. Defaults to the notional.  Paid times the index ratio, floored at par under PrincipalProtection. Must be non-negative. | [optional] [default to java.math.BigDecimal]

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
@jakarta.annotation.Nullable java.math.BigDecimal FixedRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime BaseCPIDate = OffsetDateTime.now();
Integer IndexPrecision = new Integer("100.00");
Boolean PrincipalProtection = true;
@jakarta.annotation.Nullable String NotionalExchangeType = "example NotionalExchangeType";
@jakarta.annotation.Nullable java.math.BigDecimal InitialExchangeAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FinalExchangeAmount = new java.math.BigDecimal("100.00");


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
    .TimeZoneConventions(TimeZoneConventions)
    .FixedRate(FixedRate)
    .BaseCPIDate(BaseCPIDate)
    .IndexPrecision(IndexPrecision)
    .PrincipalProtection(PrincipalProtection)
    .NotionalExchangeType(NotionalExchangeType)
    .InitialExchangeAmount(InitialExchangeAmount)
    .FinalExchangeAmount(FinalExchangeAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
