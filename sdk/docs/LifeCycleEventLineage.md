# com.finbourne.lusid.model.LifeCycleEventLineage
The lineage of the event value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of the event | [optional] [default to String]
**instrumentType** | **String** | The instrument type of the instrument for the event. | [optional] [default to String]
**instrumentId** | **String** | The LUID of the instrument for the event. | [optional] [default to String]
**legId** | **String** | Leg id for the event. | [optional] [default to String]
**sourceTransactionId** | **String** | The source transaction of the instrument for the event. | [optional] [default to String]

```java
import com.finbourne.lusid.model.LifeCycleEventLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EventType = "example EventType";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String LegId = "example LegId";
@jakarta.annotation.Nullable String SourceTransactionId = "example SourceTransactionId";


LifeCycleEventLineage lifeCycleEventLineageInstance = new LifeCycleEventLineage()
    .EventType(EventType)
    .InstrumentType(InstrumentType)
    .InstrumentId(InstrumentId)
    .LegId(LegId)
    .SourceTransactionId(SourceTransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
