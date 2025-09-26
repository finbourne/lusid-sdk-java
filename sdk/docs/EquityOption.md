# com.finbourne.lusid.model.EquityOption
LUSID representation of a plain vanilla OTC Equity Option.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**optionMaturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [default to OffsetDateTime]
**optionSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the option. | [optional] [default to OffsetDateTime]
**deliveryType** | **String** | Is the option cash settled or physical delivery of option    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**optionType** | **String** | Type of optionality for the option    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**underlyingIdentifier** | **String** | The market identifier type of the underlying code, e.g RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].  Optional field, should be used in combination with the Code field.  Not compatible with the Underlying field. | [optional] [default to String]
**code** | **String** | The identifying code for the equity underlying, e.g. &#39;IBM.N&#39;.  Optional field, should be used in combination with the UnderlyingIdentifier field.  Not compatible with the Underlying field. | [optional] [default to String]
**equityOptionType** | **String** | Equity option types. E.g. Vanilla (default), RightsIssue, Warrant.    Supported string (enumeration) values are: [Vanilla, RightsIssue, Warrant]. | [optional] [default to String]
**numberOfShares** | **java.math.BigDecimal** | The amount of shares to exchange if the option is exercised. | [optional] [default to java.math.BigDecimal]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**exerciseType** | **String** | Type of optionality that is present; European, American.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest].  Defaults to \&quot;F\&quot; if not set. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. | [optional] [default to List<String>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.EquityOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime OptionMaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime OptionSettlementDate = OffsetDateTime.now();
String DeliveryType = "example DeliveryType";
String OptionType = "example OptionType";
java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable String UnderlyingIdentifier = "example UnderlyingIdentifier";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String EquityOptionType = "example EquityOptionType";
@jakarta.annotation.Nullable java.math.BigDecimal NumberOfShares = new java.math.BigDecimal("100.00");
Premium Premium = new Premium();
@jakarta.annotation.Nullable String ExerciseType = "example ExerciseType";
LusidInstrument Underlying = new LusidInstrument();
Integer DeliveryDays = new Integer("100.00");
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable List<String> SettlementCalendars = new List<String>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


EquityOption equityOptionInstance = new EquityOption()
    .StartDate(StartDate)
    .OptionMaturityDate(OptionMaturityDate)
    .OptionSettlementDate(OptionSettlementDate)
    .DeliveryType(DeliveryType)
    .OptionType(OptionType)
    .Strike(Strike)
    .DomCcy(DomCcy)
    .UnderlyingIdentifier(UnderlyingIdentifier)
    .Code(Code)
    .EquityOptionType(EquityOptionType)
    .NumberOfShares(NumberOfShares)
    .Premium(Premium)
    .ExerciseType(ExerciseType)
    .Underlying(Underlying)
    .DeliveryDays(DeliveryDays)
    .BusinessDayConvention(BusinessDayConvention)
    .SettlementCalendars(SettlementCalendars)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
