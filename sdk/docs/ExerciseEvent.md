# com.finbourne.lusid.model.ExerciseEvent
Definition of an exercise event.  This is an event that occurs on transformation of an instrument owing to exercise. e.g. an option of  some type into its underlying.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**anchorDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the exercise window starts, or point it takes effect on. | [default to OffsetDateTime]
**eventWindowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date the exercise window ends, or point it takes effect on. | [optional] [readonly] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ExerciseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidInstrument Instrument = new LusidInstrument();
OffsetDateTime AnchorDate = OffsetDateTime.now();
OffsetDateTime EventWindowEnd = OffsetDateTime.now();


ExerciseEvent exerciseEventInstance = new ExerciseEvent()
    .Instrument(Instrument)
    .AnchorDate(AnchorDate)
    .EventWindowEnd(EventWindowEnd);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
