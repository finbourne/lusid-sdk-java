# com.finbourne.lusid.model.OptionExercisePhysicalEvent
Event for physical option exercises.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The exercise date of the option. | [optional] [default to OffsetDateTime]
**deliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The delivery date of the option. | [optional] [default to OffsetDateTime]
**exerciseType** | **String** | The optionality type of the underlying option e.g. American, European.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [optional] [default to OffsetDateTime]
**moneyness** | **String** | The moneyness of the option e.g. InTheMoney, OutOfTheMoney.    Supported string (enumeration) values are: [InTheMoney, OutOfTheMoney, AtTheMoney]. | [optional] [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this OptionExercisePhysicalEvent. | [optional] [default to List<OptionExerciseElection>]
**optionType** | **String** | Type of optionality that is present e.g. call, put.    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The trade date of the option. | [optional] [default to OffsetDateTime]
**strikeCurrency** | **String** | The strike currency of the equity option. | [default to String]
**strikePerUnit** | **java.math.BigDecimal** | The strike of the equity option times the number of shares to exchange if exercised. | [default to java.math.BigDecimal]
**underlyingValuePerUnit** | **java.math.BigDecimal** | The underlying price times the number of shares to exchange if exercised. | [optional] [default to java.math.BigDecimal]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.lusid.model.OptionExercisePhysicalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime ExerciseDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DeliveryDate = OffsetDateTime.now();
String ExerciseType = "example ExerciseType";
OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Moneyness = "example Moneyness";
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable List<OptionExerciseElection> OptionExerciseElections = new List<OptionExerciseElection>();
String OptionType = "example OptionType";
OffsetDateTime StartDate = OffsetDateTime.now();
String StrikeCurrency = "example StrikeCurrency";
java.math.BigDecimal StrikePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UnderlyingValuePerUnit = new java.math.BigDecimal("100.00");
UnitsRatio UnitsRatio = new UnitsRatio();


OptionExercisePhysicalEvent optionExercisePhysicalEventInstance = new OptionExercisePhysicalEvent()
    .ExerciseDate(ExerciseDate)
    .DeliveryDate(DeliveryDate)
    .ExerciseType(ExerciseType)
    .MaturityDate(MaturityDate)
    .Moneyness(Moneyness)
    .NewInstrument(NewInstrument)
    .OptionExerciseElections(OptionExerciseElections)
    .OptionType(OptionType)
    .StartDate(StartDate)
    .StrikeCurrency(StrikeCurrency)
    .StrikePerUnit(StrikePerUnit)
    .UnderlyingValuePerUnit(UnderlyingValuePerUnit)
    .UnitsRatio(UnitsRatio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
