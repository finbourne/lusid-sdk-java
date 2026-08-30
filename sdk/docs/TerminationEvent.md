# com.finbourne.lusid.model.TerminationEvent
Termination of a derivative at fair settlement value before or at its own maturity, triggered by the  economic life of a referenced underlying ending first (redemption, tender, repurchase offer, spin-off,  conversion, exchange offer), or by the derivative maturing while the underlying still has remaining  value. Synthesised by the instrument itself; the settlement amounts are painted on by post-processing  and the resulting transaction closes the holding and settles the net amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the termination takes effect: the triggering event&#39;s own effective/exchange date, or the  instrument&#39;s own maturity date for a maturity-triggered termination. Required. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the net termination amount settles. Required. | [optional] [default to OffsetDateTime]
**settlementCurrency** | **String** | The currency the net termination amount settles in. Required. | [default to String]
**triggeringEventType** | **String** | The type of the event on the underlying that triggered the termination, for provenance. Required.  A maturity-triggered termination is marked with the MaturityEvent type. Available values: Unknown, CashDividendEvent, StockSplitEvent, BondDefaultEvent, Exercise, Trigger, Default, Reset, Coupon, Amortisation, Principal, Start, EarlyClose, Maturity, CloseEvent, OpenEvent, CorporateAction, Premium, CashSettlement, BondCouponEvent, DividendReinvestmentEvent, AccumulationEvent, BondPrincipalEvent, DividendOptionEvent, MaturityEvent, FxForwardSettlementEvent, ExpiryEvent, ScripDividendEvent, StockDividendEvent, ReverseStockSplitEvent, CapitalDistributionEvent, SpinOffEvent, MergerEvent, FutureExpiryEvent, SwapCashFlowEvent, SwapPrincipalEvent, CreditPremiumCashFlowEvent, CdsCreditEvent, CdxCreditEvent, OptionExercisePhysicalEvent, OptionExerciseCashEvent, MbsCouponEvent, MbsPrincipalEvent, BonusIssueEvent, MbsPrincipalWriteOffEvent, TenderEvent, IntermediateSecuritiesDistributionEvent, MbsInterestDeferralEvent, MbsInterestShortfallEvent, CallOnIntermediateSecuritiesEvent, ProtectionPayoutCashFlowEvent, TermDepositInterestEvent, TermDepositPrincipalEvent, EarlyRedemptionEvent, FutureMarkToMarketEvent, AdjustGlobalCommitmentEvent, ContractInitialisationEvent, DrawdownEvent, LoanInterestRepaymentEvent, UpdateDepositAmountEvent, LoanPrincipalRepaymentEvent, DepositInterestPaymentEvent, DepositCloseEvent, LoanFacilityContractRolloverEvent, RepurchaseOfferEvent, RepoPartialClosureEvent, RepoCashFlowEvent, FlexibleRepoCashFlowEvent, FlexibleRepoCollateralEvent, FlexibleRepoInterestPaymentEvent, FlexibleRepoPartialClosureEvent, ConversionEvent, FlexibleRepoFullClosureEvent, CapletFloorletCashFlowEvent, DepositRollEvent, EarlyCloseOutEvent, ConsentEvent, DrawingEvent, CapitalGainsDistributionEvent, ExchangeOfferEvent, DutchAuctionEvent, WorthlessEvent, PutRedemptionEvent, LoanFacilityDelayedCompensationPaymentEvent, InterestPaymentEvent, PriorityIssueEvent, ClassActionEvent, BankruptcyEvent, LiquidationPaymentEvent, PartialDefeasanceEvent, SecurityWriteOffEvent, WarrantsExerciseEvent, PariPassuEvent, PikBondCouponEvent, PikBondCashCouponEvent, PikBondInterestCapitalisationEvent, PikBondPrincipalEvent, ChangeEvent, DelistingEvent, PikBondInterestEvent, CommodityForwardCashSettlementEvent, PaymentInKindEvent, CommodityForwardPhysicalSettlementEvent, CancelSwapEvent, BondOptionTerminationEvent, TerminationEvent, CommodityCalendarSwapCashFlowEvent, DepositSweepEvent, CapitalCallEvent, FundDistributionEvent, NavReportEvent, AmendCommitmentEvent. | [default to String]
**triggeringEventId** | **String** | The event id of the triggering event on the underlying, for provenance and diagnostics. Optional. | [optional] [default to String]
**settlementMethod** | **String** | The basis on which the asset-side settlement amount is computed, determined by the trigger. Required.     Supported string (enumeration) values are: [CurrentNotionalPlusAccrued, CashOfferPlusAccrued, CashOfferPlusRealAccrued, FairValue, CashOffer]. Available values: CurrentNotionalPlusAccrued, CashOfferPlusAccrued, CashOfferPlusRealAccrued, FairValue, CashOffer. | [default to String]
**assetSettlementAmount** | **java.math.BigDecimal** | The asset-side settlement value per the settlement method, unsigned by leg direction.  Optional — populated by post-processing from market data; absent until enriched. | [optional] [default to java.math.BigDecimal]
**fundingAccruedAmount** | **java.math.BigDecimal** | The funding leg&#39;s financing accrued to the effective date, signed by the funding leg&#39;s own  direction. Optional — populated by post-processing from market data; absent until enriched. | [optional] [default to java.math.BigDecimal]
**terminationAmount** | **java.math.BigDecimal** | The net amount settled on termination: the asset settlement amount signed by the asset leg&#39;s  direction, netted with the funding accrued. Optional — populated by post-processing; absent  until enriched. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TerminationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
String SettlementCurrency = "example SettlementCurrency";
String TriggeringEventType = "example TriggeringEventType";
@jakarta.annotation.Nullable String TriggeringEventId = "example TriggeringEventId";
String SettlementMethod = "example SettlementMethod";
@jakarta.annotation.Nullable java.math.BigDecimal AssetSettlementAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FundingAccruedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TerminationAmount = new java.math.BigDecimal("100.00");


TerminationEvent terminationEventInstance = new TerminationEvent()
    .EffectiveDate(EffectiveDate)
    .SettlementDate(SettlementDate)
    .SettlementCurrency(SettlementCurrency)
    .TriggeringEventType(TriggeringEventType)
    .TriggeringEventId(TriggeringEventId)
    .SettlementMethod(SettlementMethod)
    .AssetSettlementAmount(AssetSettlementAmount)
    .FundingAccruedAmount(FundingAccruedAmount)
    .TerminationAmount(TerminationAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
