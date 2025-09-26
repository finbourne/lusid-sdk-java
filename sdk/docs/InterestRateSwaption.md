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
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest].     Defaults to \&quot;F\&quot;. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. | [optional] [default to List<String>]

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
    .SettlementCalendars(SettlementCalendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
