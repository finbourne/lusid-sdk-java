# com.finbourne.lusid.model.WarrantsExerciseEvent
Warrants Exercise (EXWA) — the holder's election to exercise an outstanding warrant, paying the  strike and receiving the underlying security, or to let it lapse at zero proceeds. Elective  (Voluntary / MandatoryWithChoices) on EquityOption (EquityOptionType = Warrant) and SimpleInstrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The DvP settlement date on which the strike is paid and the underlying is delivered.  Must be on or after PeriodOfActionEnd. | [optional] [default to OffsetDateTime]
**periodOfActionStart** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the exercise window. | [optional] [default to OffsetDateTime]
**periodOfActionEnd** | [**OffsetDateTime**](OffsetDateTime.md) | End of the exercise window. | [optional] [default to OffsetDateTime]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Holder response deadline. Required when participation is MandatoryWithChoices. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Market deadline. Required when participation is MandatoryWithChoices. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Early response deadline. Optional; populated by some vendor wires. | [optional] [default to OffsetDateTime]
**strikePerUnit** | **java.math.BigDecimal** | Cash payable per warrant on exercise. Null-allowed on upsert if the warrant instrument resolves  a non-null EquityOption.Strike (instrument-level fallback applied later). If supplied, must be  strictly positive and accompanied by a StrikeCurrency. | [optional] [default to java.math.BigDecimal]
**strikeCurrency** | **String** | Currency of the strike (ISO 4217 3-letter code). Required if StrikePerUnit is non-null. | [optional] [default to String]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [optional] [default to UnitsRatio]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**fractionDisposition** | **String** | Handling of fractional underlying units. Defaults to round-down (RDDN) in the holdings engine when null.     Supported string (enumeration) values are: [RDDN, CINL]. Available values: RDDN, CINL. | [optional] [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise elections for this event. At least one entry. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections for this event. Required when participation is MandatoryWithChoices or when the  issuer publishes a no-action default. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.WarrantsExerciseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime PeriodOfActionStart = OffsetDateTime.now();
OffsetDateTime PeriodOfActionEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal StrikePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StrikeCurrency = "example StrikeCurrency";
UnitsRatio UnitsRatio = new UnitsRatio();
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable String FractionDisposition = "example FractionDisposition";
@jakarta.annotation.Nullable List<OptionExerciseElection> OptionExerciseElections = new List<OptionExerciseElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


WarrantsExerciseEvent warrantsExerciseEventInstance = new WarrantsExerciseEvent()
    .PaymentDate(PaymentDate)
    .PeriodOfActionStart(PeriodOfActionStart)
    .PeriodOfActionEnd(PeriodOfActionEnd)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .StrikePerUnit(StrikePerUnit)
    .StrikeCurrency(StrikeCurrency)
    .UnitsRatio(UnitsRatio)
    .NewInstrument(NewInstrument)
    .FractionDisposition(FractionDisposition)
    .OptionExerciseElections(OptionExerciseElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
