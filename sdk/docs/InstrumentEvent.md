

# InstrumentEvent

Base class for representing instrument events in LUSID, such as dividends, stock splits, and option exercises.  This base class should not be directly instantiated; each supported InstrumentEventType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventType** | [**InstrumentEventTypeEnum**](#InstrumentEventTypeEnum) | The Type of Event. The available values are: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent |  |



## Enum: InstrumentEventTypeEnum

| Name | Value |
|---- | -----|
| TRANSITIONEVENT | &quot;TransitionEvent&quot; |
| INFORMATIONALEVENT | &quot;InformationalEvent&quot; |
| OPENEVENT | &quot;OpenEvent&quot; |
| CLOSEEVENT | &quot;CloseEvent&quot; |
| STOCKSPLITEVENT | &quot;StockSplitEvent&quot; |
| BONDDEFAULTEVENT | &quot;BondDefaultEvent&quot; |
| CASHDIVIDENDEVENT | &quot;CashDividendEvent&quot; |
| AMORTISATIONEVENT | &quot;AmortisationEvent&quot; |
| CASHFLOWEVENT | &quot;CashFlowEvent&quot; |
| EXERCISEEVENT | &quot;ExerciseEvent&quot; |
| RESETEVENT | &quot;ResetEvent&quot; |
| TRIGGEREVENT | &quot;TriggerEvent&quot; |
| RAWVENDOREVENT | &quot;RawVendorEvent&quot; |
| INFORMATIONALERROREVENT | &quot;InformationalErrorEvent&quot; |
| BONDCOUPONEVENT | &quot;BondCouponEvent&quot; |
| DIVIDENDREINVESTMENTEVENT | &quot;DividendReinvestmentEvent&quot; |
| ACCUMULATIONEVENT | &quot;AccumulationEvent&quot; |
| BONDPRINCIPALEVENT | &quot;BondPrincipalEvent&quot; |
| DIVIDENDOPTIONEVENT | &quot;DividendOptionEvent&quot; |
| MATURITYEVENT | &quot;MaturityEvent&quot; |
| FXFORWARDSETTLEMENTEVENT | &quot;FxForwardSettlementEvent&quot; |
| EXPIRYEVENT | &quot;ExpiryEvent&quot; |
| SCRIPDIVIDENDEVENT | &quot;ScripDividendEvent&quot; |
| STOCKDIVIDENDEVENT | &quot;StockDividendEvent&quot; |
| REVERSESTOCKSPLITEVENT | &quot;ReverseStockSplitEvent&quot; |
| CAPITALDISTRIBUTIONEVENT | &quot;CapitalDistributionEvent&quot; |
| SPINOFFEVENT | &quot;SpinOffEvent&quot; |
| MERGEREVENT | &quot;MergerEvent&quot; |
| FUTUREEXPIRYEVENT | &quot;FutureExpiryEvent&quot; |
| SWAPCASHFLOWEVENT | &quot;SwapCashFlowEvent&quot; |
| SWAPPRINCIPALEVENT | &quot;SwapPrincipalEvent&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


