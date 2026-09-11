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
**oversubscribeElections** | [**List&lt;OversubscribeElection&gt;**](OversubscribeElection.md) | List of possible oversubscribe elections for this event (OVER) — subscribe for more than the entitled amount. | [optional] [default to List<OversubscribeElection>]
**sellEntitlementElections** | [**List&lt;SellEntitlementElection&gt;**](SellEntitlementElection.md) | List of possible sell-entitlement elections for this event (SLLE) — sell the intermediate securities rather than exercise. | [optional] [default to List<SellEntitlementElection>]
**unknownProceedsElections** | [**List&lt;UnknownProceedsElection&gt;**](UnknownProceedsElection.md) | List of possible unknown-proceeds elections for this event (UNKNOWN) — the outturn is not yet known. | [optional] [default to List<UnknownProceedsElection>]

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
@jakarta.annotation.Nullable List<OversubscribeElection> OversubscribeElections = new List<OversubscribeElection>();
@jakarta.annotation.Nullable List<SellEntitlementElection> SellEntitlementElections = new List<SellEntitlementElection>();
@jakarta.annotation.Nullable List<UnknownProceedsElection> UnknownProceedsElections = new List<UnknownProceedsElection>();


CallOnIntermediateSecuritiesEvent callOnIntermediateSecuritiesEventInstance = new CallOnIntermediateSecuritiesEvent()
    .ExpiryDate(ExpiryDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .Price(Price)
    .ExerciseCurrency(ExerciseCurrency)
    .OptionExerciseElections(OptionExerciseElections)
    .LapseElections(LapseElections)
    .OversubscribeElections(OversubscribeElections)
    .SellEntitlementElections(SellEntitlementElections)
    .UnknownProceedsElections(UnknownProceedsElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
