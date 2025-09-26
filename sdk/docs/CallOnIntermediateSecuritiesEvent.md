# com.finbourne.lusid.model.CallOnIntermediateSecuritiesEvent
CallOnIntermediateSecuritiesEvent event (EXRI), representing an exercise on intermediate securities resulting from an intermediate securities distribution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the issue ends. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the event. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**price** | **java.math.BigDecimal** | The price at which new units are purchased. | [default to java.math.BigDecimal]
**exerciseCurrency** | **String** | The currency of the exercise. | [default to String]
**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this event. | [optional] [default to List<OptionExerciseElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse election for this event. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.CallOnIntermediateSecuritiesEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExpiryDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
String ExerciseCurrency = "example ExerciseCurrency";
@jakarta.annotation.Nullable List<OptionExerciseElection> OptionExerciseElections = new List<OptionExerciseElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


CallOnIntermediateSecuritiesEvent callOnIntermediateSecuritiesEventInstance = new CallOnIntermediateSecuritiesEvent()
    .ExpiryDate(ExpiryDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .Price(Price)
    .ExerciseCurrency(ExerciseCurrency)
    .OptionExerciseElections(OptionExerciseElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
