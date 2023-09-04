

# ExerciseEvent

Definition of an exercise event.  This is an event that occurs on transformation of an instrument owing to exercise. e.g. an option of  some type into its underlying.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrument** | [**LusidInstrument**](LusidInstrument.md) |  |  |
|**eventStatus** | **String** | What is the event status, is it a known (ie historic) or unknown (ie projected) event? |  |
|**anchorDate** | **OffsetDateTime** | The date the exercise window starts, or point it takes effect on. |  |
|**eventWindowEnd** | **OffsetDateTime** | The date the exercise window ends, or point it takes effect on. |  [optional] [readonly] |



