# com.finbourne.lusid.model.OptionExerciseCashEvent
Event for cash option exercises.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashFlowPerUnit** | **java.math.BigDecimal** | The cashflow per unit | [optional] [default to java.math.BigDecimal]
**exerciseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The exercise date of the option. | [optional] [default to OffsetDateTime]
**deliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The delivery date of the option. | [optional] [default to OffsetDateTime]
**exerciseType** | **String** | The optionality type of the underlying option e.g. American, European.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [optional] [default to OffsetDateTime]
**moneyness** | **String** | The moneyness of the option e.g. InTheMoney, OutOfTheMoney.    Supported string (enumeration) values are: [InTheMoney, OutOfTheMoney, AtTheMoney]. | [optional] [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this OptionExercisePhysicalEvent. | [optional] [default to List<OptionExerciseElection>]
**optionType** | **String** | Type of optionality that is present e.g. call, put.    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the option. | [optional] [default to OffsetDateTime]
**strikeCurrency** | **String** | The strike currency of the equity option. | [default to String]
**strikePerUnit** | **java.math.BigDecimal** | The strike of the equity option times the number of shares to exchange if exercised. | [default to java.math.BigDecimal]
**underlyingValuePerUnit** | **java.math.BigDecimal** | The underlying price times the number of shares to exchange if exercised. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.OptionExerciseCashEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ExerciseDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DeliveryDate = OffsetDateTime.now();
String ExerciseType = "example ExerciseType";
OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Moneyness = "example Moneyness";
@jakarta.annotation.Nullable List<OptionExerciseElection> OptionExerciseElections = new List<OptionExerciseElection>();
String OptionType = "example OptionType";
OffsetDateTime StartDate = OffsetDateTime.now();
String StrikeCurrency = "example StrikeCurrency";
java.math.BigDecimal StrikePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UnderlyingValuePerUnit = new java.math.BigDecimal("100.00");


OptionExerciseCashEvent optionExerciseCashEventInstance = new OptionExerciseCashEvent()
    .CashFlowPerUnit(CashFlowPerUnit)
    .ExerciseDate(ExerciseDate)
    .DeliveryDate(DeliveryDate)
    .ExerciseType(ExerciseType)
    .MaturityDate(MaturityDate)
    .Moneyness(Moneyness)
    .OptionExerciseElections(OptionExerciseElections)
    .OptionType(OptionType)
    .StartDate(StartDate)
    .StrikeCurrency(StrikeCurrency)
    .StrikePerUnit(StrikePerUnit)
    .UnderlyingValuePerUnit(UnderlyingValuePerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
