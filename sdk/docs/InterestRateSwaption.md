# com.finbourne.lusid.model.InterestRateSwaption
LUSID representation of an Interest Rate Swaption.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**payOrReceiveFixed** | **String** | Pay or Receive the fixed leg of the underlying swap.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**deliveryMethod** | **String** | How does the option settle    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**swap** | [**InterestRateSwap**](InterestRateSwap.md) |  | [optional] [default to InterestRateSwap]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.     Defaults to 0. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. | [optional] [default to List<String>]
**domCcy** | **String** | The currency the option settles in.     If not specified, the currency of the underlying swap is used. When specified it must be one of  the currencies of the underlying swap. | [optional] [default to String]
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the option expires, and for European exercise the date it is exercised.     If not specified, the start date of the underlying swap is used. | [optional] [default to OffsetDateTime]
**exerciseType** | **String** | Type of optionality that is present; European, American.     Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set.     A European option is exercised on its exercise date, so its exercise event is generated with  that date already set. An American option may be exercised at any point in its life, so it  carries no scheduled date and the exercise date is supplied on the exercise event instead.     The swap delivered on exercise keeps the start date it was defined with, so exercising early  or late leaves it aged or forward-starting relative to the exercise. Keeping that swap  correct for the intended exercise is the responsibility of whoever defines it. | [optional] [default to String]
**strike** | **java.math.BigDecimal** | The rate the option strikes against.     May only be specified when the underlying swap has no single fixed leg, as otherwise that leg&#39;s  fixed rate is the strike. It must be specified when the underlying swap has two fixed legs, as  there is then no single rate to strike against. | [optional] [default to java.math.BigDecimal]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.lusid.model.InterestRateSwaption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
String PayOrReceiveFixed = "example PayOrReceiveFixed";
Premium Premium = new Premium();
String DeliveryMethod = "example DeliveryMethod";
InterestRateSwap Swap = new InterestRateSwap();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
LusidInstrument Underlying = new LusidInstrument();
Integer DeliveryDays = new Integer("100.00");
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable List<String> SettlementCalendars = new List<String>();
@jakarta.annotation.Nullable String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable OffsetDateTime ExerciseDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String ExerciseType = "example ExerciseType";
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
TradingConventions TradingConventions = new TradingConventions();


InterestRateSwaption interestRateSwaptionInstance = new InterestRateSwaption()
    .StartDate(StartDate)
    .PayOrReceiveFixed(PayOrReceiveFixed)
    .Premium(Premium)
    .DeliveryMethod(DeliveryMethod)
    .Swap(Swap)
    .TimeZoneConventions(TimeZoneConventions)
    .Underlying(Underlying)
    .DeliveryDays(DeliveryDays)
    .BusinessDayConvention(BusinessDayConvention)
    .SettlementCalendars(SettlementCalendars)
    .DomCcy(DomCcy)
    .ExerciseDate(ExerciseDate)
    .ExerciseType(ExerciseType)
    .Strike(Strike)
    .TradingConventions(TradingConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
