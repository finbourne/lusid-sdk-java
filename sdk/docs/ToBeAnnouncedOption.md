# com.finbourne.lusid.model.ToBeAnnouncedOption
LUSID representation of an OTC option on a ToBeAnnounced (TBA) forward contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the option expires, i.e. the last exercise date of the option. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**optionType** | **String** | Type of optionality for the option.     Supported string (enumeration) values are: [Call, Put]. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**deliveryType** | **String** | Is the option cash settled or physical delivery of the underlying TBA.     Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**underlying** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]
**exerciseType** | **String** | Type of optionality that is present; European only in this scope.     Supported string (enumeration) values are: [European]. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [default to Premium]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendar for option exercise date to settlement date calculation. | [optional] [default to List<String>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.lusid.model.ToBeAnnouncedOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime ExpiryDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String OptionType = "example OptionType";
java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
String DeliveryType = "example DeliveryType";
MasteredInstrument Underlying = new MasteredInstrument();
String ExerciseType = "example ExerciseType";
Premium Premium = new Premium();
Integer DeliveryDays = new Integer("100.00");
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable List<String> SettlementCalendars = new List<String>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();


ToBeAnnouncedOption toBeAnnouncedOptionInstance = new ToBeAnnouncedOption()
    .StartDate(StartDate)
    .ExpiryDate(ExpiryDate)
    .DomCcy(DomCcy)
    .OptionType(OptionType)
    .Strike(Strike)
    .DeliveryType(DeliveryType)
    .Underlying(Underlying)
    .ExerciseType(ExerciseType)
    .Premium(Premium)
    .DeliveryDays(DeliveryDays)
    .BusinessDayConvention(BusinessDayConvention)
    .SettlementCalendars(SettlementCalendars)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
