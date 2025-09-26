# com.finbourne.lusid.model.FloatingLeg
LUSID representation of a Floating Rate Leg.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**legDefinition** | [**LegDefinition**](LegDefinition.md) |  | [default to LegDefinition]
**notional** | **java.math.BigDecimal** | Scaling factor to apply to leg quantities. | [default to java.math.BigDecimal]
**overrides** | [**FixedLegAllOfOverrides**](FixedLegAllOfOverrides.md) |  | [optional] [default to FixedLegAllOfOverrides]
**capRate** | **java.math.BigDecimal** | The maximum floating rate which a cashflow can accrue. | [optional] [default to java.math.BigDecimal]
**floorRate** | **java.math.BigDecimal** | The minimum floating rate which a cashflow can accrue. | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.FloatingLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
LegDefinition LegDefinition = new LegDefinition();
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable FixedLegAllOfOverrides Overrides = new FixedLegAllOfOverrides();
@jakarta.annotation.Nullable java.math.BigDecimal CapRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FloorRate = new java.math.BigDecimal("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


FloatingLeg floatingLegInstance = new FloatingLeg()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .LegDefinition(LegDefinition)
    .Notional(Notional)
    .Overrides(Overrides)
    .CapRate(CapRate)
    .FloorRate(FloorRate)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
