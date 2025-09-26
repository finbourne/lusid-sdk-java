# com.finbourne.lusid.model.TransitionEvent
A 'transition' within a corporate action, representing a set of output movements paired to a single input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The announcement date of the corporate action | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date of the corporate action | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the corporate action | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the corporate action | [optional] [default to OffsetDateTime]
**inputTransition** | [**InputTransition**](InputTransition.md) |  | [optional] [default to InputTransition]
**outputTransitions** | [**List&lt;OutputTransition&gt;**](OutputTransition.md) | The resulting transitions from this event | [optional] [default to List<OutputTransition>]

```java
import com.finbourne.lusid.model.TransitionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AnnouncementDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
InputTransition InputTransition = new InputTransition();
@jakarta.annotation.Nullable List<OutputTransition> OutputTransitions = new List<OutputTransition>();


TransitionEvent transitionEventInstance = new TransitionEvent()
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .InputTransition(InputTransition)
    .OutputTransitions(OutputTransitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
