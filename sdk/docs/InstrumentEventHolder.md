# com.finbourne.lusid.model.InstrumentEventHolder
An instrument event equipped with additional metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | The unique identifier of this corporate action. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | The LUID for the instrument. | [default to String]
**instrumentScope** | **String** | The scope of the instrument. | [default to String]
**description** | **String** | The description of the instrument event. | [default to String]
**eventDateRange** | [**EventDateRange**](EventDateRange.md) |  | [default to EventDateRange]
**completeness** | **String** | Is the event Economically Complete, or is it missing some DataDependent fields (Incomplete). | [optional] [readonly] [default to String]
**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  | [default to InstrumentEvent]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. | [optional] [default to List<PerpetualProperty>]
**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. | [optional] [default to Integer]
**participationType** | **String** | Is participation in this event Mandatory, MandatoryWithChoices, or Voluntary. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the instrument event, if available. This is a readonly field and should not be provided on upsert. | [optional] [readonly] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.InstrumentEventHolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentEventId = "example InstrumentEventId";
ResourceId CorporateActionSourceId = new ResourceId();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String LusidInstrumentId = "example LusidInstrumentId";
String InstrumentScope = "example InstrumentScope";
String Description = "example Description";
EventDateRange EventDateRange = new EventDateRange();
@jakarta.annotation.Nullable String Completeness = "example Completeness";
InstrumentEvent InstrumentEvent = new InstrumentEvent();
@jakarta.annotation.Nullable List<PerpetualProperty> Properties = new List<PerpetualProperty>();
Integer SequenceNumber = new Integer("100.00");
@jakarta.annotation.Nullable String ParticipationType = "example ParticipationType";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


InstrumentEventHolder instrumentEventHolderInstance = new InstrumentEventHolder()
    .InstrumentEventId(InstrumentEventId)
    .CorporateActionSourceId(CorporateActionSourceId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .Description(Description)
    .EventDateRange(EventDateRange)
    .Completeness(Completeness)
    .InstrumentEvent(InstrumentEvent)
    .Properties(Properties)
    .SequenceNumber(SequenceNumber)
    .ParticipationType(ParticipationType)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
