# com.finbourne.lusid.model.ExchangeTradedOptionContractDetails
Most, if not all, information about contracts is standardised. See, e.g. https://www.cmegroup.com/ for  common codes and similar data. This appears to be in common use by well known market information providers, e.g. Bloomberg and Refinitiv.  There is a lot of overlap with this and FuturesContractDetails but as that is an established DTO we must duplicate a number of fields here

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | Currency in which the contract is paid. | [default to String]
**strike** | **java.math.BigDecimal** | The option strike, this can be negative for some options. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Size of a single contract. By default this should be set to 1000 if otherwise unknown and is defaulted to such. | [default to java.math.BigDecimal]
**country** | **String** | Country (code) for the exchange. | [default to String]
**deliveryType** | **String** | The delivery type, cash or physical. An option on a future is physically settled if upon exercising the  holder receives a future.    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**description** | **String** | Description of contract | [default to String]
**exchangeCode** | **String** | Exchange code for contract. This can be any string to uniquely identify the exchange (e.g. Exchange Name, MIC, BBG code). | [default to String]
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last exercise date of the option. | [default to OffsetDateTime]
**exerciseType** | **String** | The exercise type, European, American or Bermudan.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**optionCode** | **String** | Option Contract Code, typically one or two letters, e.g. OG &#x3D;&gt; Option on Gold. | [default to String]
**optionType** | **String** | The option type, Call or Put.    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**underlyingCode** | **String** | Code of the underlying, for an option on futures this should be the futures code. | [default to String]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | The adjustment type to apply to dates that fall upon a non-business day, e.g. modified following or following.  Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest].  Defaults to \&quot;F\&quot; if not set. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | An array of strings denoting calendars used in calculating the option settlement date. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ExchangeTradedOptionContractDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DomCcy = "example DomCcy";
java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
String Country = "example Country";
String DeliveryType = "example DeliveryType";
String Description = "example Description";
String ExchangeCode = "example ExchangeCode";
OffsetDateTime ExerciseDate = OffsetDateTime.now();
String ExerciseType = "example ExerciseType";
String OptionCode = "example OptionCode";
String OptionType = "example OptionType";
LusidInstrument Underlying = new LusidInstrument();
String UnderlyingCode = "example UnderlyingCode";
Integer DeliveryDays = new Integer("100.00");
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable List<String> SettlementCalendars = new List<String>();


ExchangeTradedOptionContractDetails exchangeTradedOptionContractDetailsInstance = new ExchangeTradedOptionContractDetails()
    .DomCcy(DomCcy)
    .Strike(Strike)
    .ContractSize(ContractSize)
    .Country(Country)
    .DeliveryType(DeliveryType)
    .Description(Description)
    .ExchangeCode(ExchangeCode)
    .ExerciseDate(ExerciseDate)
    .ExerciseType(ExerciseType)
    .OptionCode(OptionCode)
    .OptionType(OptionType)
    .Underlying(Underlying)
    .UnderlyingCode(UnderlyingCode)
    .DeliveryDays(DeliveryDays)
    .BusinessDayConvention(BusinessDayConvention)
    .SettlementCalendars(SettlementCalendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
