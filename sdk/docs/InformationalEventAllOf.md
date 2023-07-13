

# InformationalEventAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | What type of internal event does this represent; reset, exercise, amortisation etc. |  [readonly]
**eventStatus** | **String** | What is the event status, is it a known (ie historic) or unknown (ie projected) event? | 
**anchorDate** | **OffsetDateTime** | In the case of a point event, the single date on which the event occurs. In the case of an event which is  spread over a window, e.g. a barrier or American option, the start of that window. | 
**eventWindowEnd** | **OffsetDateTime** | In the case of a point event this is identical to the anchor date. In the case of an event that is spread over a window,  this is the end of that window. |  [optional] [readonly]
**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  |  [optional]
**instrumentEventType** | [**InstrumentEventTypeEnum**](#InstrumentEventTypeEnum) | The Type of Event. The available values are: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent | 



## Enum: InstrumentEventTypeEnum

Name | Value
---- | -----
TRANSITIONEVENT | &quot;TransitionEvent&quot;
INFORMATIONALEVENT | &quot;InformationalEvent&quot;
OPENEVENT | &quot;OpenEvent&quot;
CLOSEEVENT | &quot;CloseEvent&quot;
STOCKSPLITEVENT | &quot;StockSplitEvent&quot;
BONDDEFAULTEVENT | &quot;BondDefaultEvent&quot;
CASHDIVIDENDEVENT | &quot;CashDividendEvent&quot;
AMORTISATIONEVENT | &quot;AmortisationEvent&quot;
CASHFLOWEVENT | &quot;CashFlowEvent&quot;
EXERCISEEVENT | &quot;ExerciseEvent&quot;
RESETEVENT | &quot;ResetEvent&quot;
TRIGGEREVENT | &quot;TriggerEvent&quot;
RAWVENDOREVENT | &quot;RawVendorEvent&quot;
INFORMATIONALERROREVENT | &quot;InformationalErrorEvent&quot;



