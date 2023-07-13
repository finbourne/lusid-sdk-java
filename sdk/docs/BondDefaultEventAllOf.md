

# BondDefaultEventAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Percentage or amount of each share held to be given to shareholders. | 
**couponPaidDate** | **OffsetDateTime** | Date that the missed coupon is paid if payment is made within grace period. | 
**defaultStatus** | **String** | The status of the bond default (i.e., technical or default)    Supported string (enumeration) values are: [Technical, Default]. | 
**defaultType** | **String** | The type of the default. (coupon payment, principal payment, covenant ...)    Supported string (enumeration) values are: [CouponPayment, CouponAndPrincipalPayment, PrincipalPayment, Covenant, Bankruptcy, BuyBackOption]. | 
**graceEndDate** | **OffsetDateTime** | Date the grace period for making coupon payment ends. | 
**paymentDate** | **OffsetDateTime** | The date the coupon payment was missed. | 
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



