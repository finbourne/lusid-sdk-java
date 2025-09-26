# com.finbourne.lusid.model.UpsertInstrumentEventRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | Free string that uniquely identifies the event within the corporate action source | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. | [default to Map<String, String>]
**description** | **String** | The description of the instrument event. | [optional] [default to String]
**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  | [default to InstrumentEvent]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. | [optional] [default to List<PerpetualProperty>]
**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. | [optional] [default to Integer]
**participationType** | **String** | Is participation in this event Mandatory, MandatoryWithChoices, or Voluntary. | [optional] [default to String]
**eventDateStamps** | [**Map&lt;String, YearMonthDay&gt;**](YearMonthDay.md) | The date stamps corresponding to the relevant date-time fields for the instrument event. The key for each provided date stamp must match the field name of a valid datetime field from the InstrumentEvent DTO. | [optional] [default to Map<String, YearMonthDay>]

```java
import com.finbourne.lusid.model.UpsertInstrumentEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentEventId = "example InstrumentEventId";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String Description = "example Description";
InstrumentEvent InstrumentEvent = new InstrumentEvent();
@jakarta.annotation.Nullable List<PerpetualProperty> Properties = new List<PerpetualProperty>();
Integer SequenceNumber = new Integer("100.00");
@jakarta.annotation.Nullable String ParticipationType = "example ParticipationType";
@jakarta.annotation.Nullable Map<String, YearMonthDay> EventDateStamps = new Map<String, YearMonthDay>();


UpsertInstrumentEventRequest upsertInstrumentEventRequestInstance = new UpsertInstrumentEventRequest()
    .InstrumentEventId(InstrumentEventId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Description(Description)
    .InstrumentEvent(InstrumentEvent)
    .Properties(Properties)
    .SequenceNumber(SequenceNumber)
    .ParticipationType(ParticipationType)
    .EventDateStamps(EventDateStamps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
