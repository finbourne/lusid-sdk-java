

# CallOnIntermediateSecuritiesEvent

CallOnIntermediateSecuritiesEvent event (EXRI), representing an exercise on intermediate securities resulting from an intermediate securities distribution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiryDate** | **OffsetDateTime** | The date on which the issue ends. |  |
|**paymentDate** | **OffsetDateTime** | The payment date of the event. |  |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |
|**price** | **java.math.BigDecimal** | The price at which new units are purchased. |  |
|**exerciseCurrency** | **String** | The currency of the exercise. |  |
|**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this event. |  [optional] |
|**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse election for this event. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


