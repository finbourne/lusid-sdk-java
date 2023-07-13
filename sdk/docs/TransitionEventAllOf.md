

# TransitionEventAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | **OffsetDateTime** | The announcement date of the corporate action |  [optional]
**exDate** | **OffsetDateTime** | The ex date of the corporate action |  [optional]
**recordDate** | **OffsetDateTime** | The record date of the corporate action |  [optional]
**paymentDate** | **OffsetDateTime** | The payment date of the corporate action |  [optional]
**inputTransition** | [**InputTransition**](InputTransition.md) |  |  [optional]
**outputTransitions** | [**List&lt;OutputTransition&gt;**](OutputTransition.md) | The resulting transitions from this event |  [optional]
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



