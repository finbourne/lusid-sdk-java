# com.finbourne.lusid.model.InstalmentCallEvent
Instalment Call Event (PPMT) — the issuer calls the next instalment due on a partly-paid equity line.  The holder pays the call price per unit and the holding moves from the partly-paid line to the  line carrying the higher paid-up amount. Under MandatoryWithChoices the holder may instead lapse,  in which case nothing moves and the partly-paid line survives.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the call cash and the replacement units settle. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which entitlement is struck. Optional; when absent, entitlement strikes on the payment date. | [optional] [default to OffsetDateTime]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deadline by which the holder must instruct. Required when the participation type is  MandatoryWithChoices; must be null when it is Mandatory. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deadline by which the custodian must forward instructions to the market. Required when the  participation type is MandatoryWithChoices; must be null when it is Mandatory. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**callPricePerUnit** | **java.math.BigDecimal** | The amount of money payable per eligible unit on this instalment, in the call currency.  This is money per unit, not a percentage of the issue price: a 40 per cent call on a 2.50 issue  price is supplied as 1.00. | [default to java.math.BigDecimal]
**callCurrency** | **String** | The currency in which the call settles. Must match the currency of the new instrument. | [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | The election to pay the call and receive the new instrument. Exactly one is required.  Under Mandatory participation it must be both default and chosen. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | The election to decline the call, leaving the partly-paid line unchanged. Exactly one is required  under MandatoryWithChoices participation; none may be supplied under Mandatory participation. | [optional] [default to List<LapseElection>]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor.  Supported values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, BankerRounding. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to. Not used by any of the supported rounding conventions. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.InstalmentCallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
java.math.BigDecimal CallPricePerUnit = new java.math.BigDecimal("100.00");
String CallCurrency = "example CallCurrency";
@jakarta.annotation.Nullable List<OptionExerciseElection> OptionExerciseElections = new List<OptionExerciseElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");


InstalmentCallEvent instalmentCallEventInstance = new InstalmentCallEvent()
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .CallPricePerUnit(CallPricePerUnit)
    .CallCurrency(CallCurrency)
    .OptionExerciseElections(OptionExerciseElections)
    .LapseElections(LapseElections)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
