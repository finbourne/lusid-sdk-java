# com.finbourne.lusid.model.CdsOption
LUSID representation of an option on a single-name Credit Default Swap or a CDX/iTraxx index,  discriminated by the MasteredInstrumentType field of the referenced MasteredInstrument, which is derived  from the resolved type of the underlying. Referenced via a MasteredInstrument.  Quote-driven by default: it has no coupon or projected interim cashflow, its only cash movement being  the spot premium.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**businessDayConvention** | **String** | Business day convention for the maturity-to-settlement date calculation.  Default value: F.     Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest]. Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**deliveryDays** | **Integer** | Number of business days between the option maturity date and settlement, used to compute  OptionSettlementDate when not explicitly overridden. Defaults to 2 if not set. | [optional] [default to Integer]
**deliveryType** | **String** | Is the option cash settled or physical delivery of the underlying.     Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**exerciseType** | **String** | Type of optionality that is present; European only in this scope.  Default value: European.     Supported string (enumeration) values are: [European, Bermudan, American]. Default value: European. Available values: None, European, Bermudan, American. | [optional] [default to String]
**notional** | **java.math.BigDecimal** | Fixed per-unit reference multiplier. Aggregate exposure &#x3D; Holding/Units x Notional; not a mutable total. | [default to java.math.BigDecimal]
**optionMaturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last exercise date of the option. | [default to OffsetDateTime]
**optionSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Explicit override of the option&#39;s settlement date. If not supplied, it is computed as a  business-day-adjusted delivery of DeliveryDays after OptionMaturityDate. | [optional] [default to OffsetDateTime]
**optionType** | **String** | The direction of the credit option: Payer or Receiver.     Supported string (enumeration) values are: [Payer, Receiver]. Available values: Payer, Receiver. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for the maturity-to-settlement date calculation. | [optional] [default to List<String>]
**underlying** | [**MasteredInstrument**](MasteredInstrument.md) |  | [optional] [default to MasteredInstrument]
**underlyingVersion** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt timestamp of the underlying&#39;s definition at the time this option was written, pinning  lookups of the underlying&#39;s composition and terms independently of subsequent index rolls or re-upserts. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CdsOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
Integer DeliveryDays = new Integer("100.00");
String DeliveryType = "example DeliveryType";
@jakarta.annotation.Nullable String ExerciseType = "example ExerciseType";
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
OffsetDateTime OptionMaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime OptionSettlementDate = OffsetDateTime.now();
String OptionType = "example OptionType";
Premium Premium = new Premium();
@jakarta.annotation.Nullable List<String> SettlementCalendars = new List<String>();
MasteredInstrument Underlying = new MasteredInstrument();
OffsetDateTime UnderlyingVersion = OffsetDateTime.now();


CdsOption cdsOptionInstance = new CdsOption()
    .StartDate(StartDate)
    .DomCcy(DomCcy)
    .Strike(Strike)
    .BusinessDayConvention(BusinessDayConvention)
    .DeliveryDays(DeliveryDays)
    .DeliveryType(DeliveryType)
    .ExerciseType(ExerciseType)
    .Notional(Notional)
    .OptionMaturityDate(OptionMaturityDate)
    .OptionSettlementDate(OptionSettlementDate)
    .OptionType(OptionType)
    .Premium(Premium)
    .SettlementCalendars(SettlementCalendars)
    .Underlying(Underlying)
    .UnderlyingVersion(UnderlyingVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
