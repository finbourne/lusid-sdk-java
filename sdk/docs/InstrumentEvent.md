

# InstrumentEvent

Base class for representing instrument events in LUSID, such as dividends, stock splits, and option exercises. This base class should not be directly instantiated; each supported InstrumentEventType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventType** | [**InstrumentEventTypeEnum**](#InstrumentEventTypeEnum) | The Type of Event. The available values are: TransitionEvent, InformationalEvent, OpenEvent, CloseEvent, StockSplitEvent, BondDefaultEvent, CashDividendEvent, AmortisationEvent, CashFlowEvent, ExerciseEvent, ResetEvent, TriggerEvent, RawVendorEvent, InformationalErrorEvent, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, TenderEvent, CallOnIntermediateSecuritiesEvent, IntermediateSecuritiesDistributionEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, ConversionEvent, FlexibleRepoPartialClosureEvent, FlexibleRepoFullClosureEvent |  |



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
| CREDITPREMIUMCASHFLOWEVENT | &quot;CreditPremiumCashFlowEvent&quot; |
| CDSCREDITEVENT | &quot;CdsCreditEvent&quot; |
| CDXCREDITEVENT | &quot;CdxCreditEvent&quot; |
| MBSCOUPONEVENT | &quot;MbsCouponEvent&quot; |
| MBSPRINCIPALEVENT | &quot;MbsPrincipalEvent&quot; |
| BONUSISSUEEVENT | &quot;BonusIssueEvent&quot; |
| MBSPRINCIPALWRITEOFFEVENT | &quot;MbsPrincipalWriteOffEvent&quot; |
| MBSINTERESTDEFERRALEVENT | &quot;MbsInterestDeferralEvent&quot; |
| MBSINTERESTSHORTFALLEVENT | &quot;MbsInterestShortfallEvent&quot; |
| TENDEREVENT | &quot;TenderEvent&quot; |
| CALLONINTERMEDIATESECURITIESEVENT | &quot;CallOnIntermediateSecuritiesEvent&quot; |
| INTERMEDIATESECURITIESDISTRIBUTIONEVENT | &quot;IntermediateSecuritiesDistributionEvent&quot; |
| OPTIONEXERCISEPHYSICALEVENT | &quot;OptionExercisePhysicalEvent&quot; |
| OPTIONEXERCISECASHEVENT | &quot;OptionExerciseCashEvent&quot; |
| PROTECTIONPAYOUTCASHFLOWEVENT | &quot;ProtectionPayoutCashFlowEvent&quot; |
| TERMDEPOSITINTERESTEVENT | &quot;TermDepositInterestEvent&quot; |
| TERMDEPOSITPRINCIPALEVENT | &quot;TermDepositPrincipalEvent&quot; |
| EARLYREDEMPTIONEVENT | &quot;EarlyRedemptionEvent&quot; |
| FUTUREMARKTOMARKETEVENT | &quot;FutureMarkToMarketEvent&quot; |
| ADJUSTGLOBALCOMMITMENTEVENT | &quot;AdjustGlobalCommitmentEvent&quot; |
| CONTRACTINITIALISATIONEVENT | &quot;ContractInitialisationEvent&quot; |
| DRAWDOWNEVENT | &quot;DrawdownEvent&quot; |
| LOANINTERESTREPAYMENTEVENT | &quot;LoanInterestRepaymentEvent&quot; |
| UPDATEDEPOSITAMOUNTEVENT | &quot;UpdateDepositAmountEvent&quot; |
| LOANPRINCIPALREPAYMENTEVENT | &quot;LoanPrincipalRepaymentEvent&quot; |
| DEPOSITINTERESTPAYMENTEVENT | &quot;DepositInterestPaymentEvent&quot; |
| DEPOSITCLOSEEVENT | &quot;DepositCloseEvent&quot; |
| LOANFACILITYCONTRACTROLLOVEREVENT | &quot;LoanFacilityContractRolloverEvent&quot; |
| REPURCHASEOFFEREVENT | &quot;RepurchaseOfferEvent&quot; |
| REPOPARTIALCLOSUREEVENT | &quot;RepoPartialClosureEvent&quot; |
| REPOCASHFLOWEVENT | &quot;RepoCashFlowEvent&quot; |
| FLEXIBLEREPOINTERESTPAYMENTEVENT | &quot;FlexibleRepoInterestPaymentEvent&quot; |
| FLEXIBLEREPOCASHFLOWEVENT | &quot;FlexibleRepoCashFlowEvent&quot; |
| FLEXIBLEREPOCOLLATERALEVENT | &quot;FlexibleRepoCollateralEvent&quot; |
| CONVERSIONEVENT | &quot;ConversionEvent&quot; |
| FLEXIBLEREPOPARTIALCLOSUREEVENT | &quot;FlexibleRepoPartialClosureEvent&quot; |
| FLEXIBLEREPOFULLCLOSUREEVENT | &quot;FlexibleRepoFullClosureEvent&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


