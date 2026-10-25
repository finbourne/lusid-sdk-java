# com.finbourne.lusid.model.CapitalInterestTransferEvent
The movement of a proportion of a CapitalInterest line's capital balances from one line to another.  The source (Out) side moves every balance by the fraction; the destination (In) side receives the  amounts given on the event. Mode distinguishes a genuine transfer between investors from a correction  of a mis-booked position. The portfolio-currency twin amounts (PaidInCapitalPortfolioCcyAmount,  ReturnedCapitalPortfolioCcyAmount and ExcessCapitalReturnedPortfolioCcyAmount) are not derived: an In side  that omits them books zero for the ...PortfolioCcy twins while the Out side gives up its share, and a  client-maintained transaction type configuration must include the ...PortfolioCcy twin movements for the  twins to move at all.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the transfer takes effect. | [optional] [default to OffsetDateTime]
**direction** | **String** | Which side of the transfer this event books: &#39;Out&#39; on the source line or &#39;In&#39; on the destination line. Available values: Out, In. | [default to String]
**fraction** | **java.math.BigDecimal** | The fraction of the source line being transferred. Must be greater than zero and at most one;  a fraction of one moves the whole line. | [default to java.math.BigDecimal]
**fromLineId** | **String** | The identifier of the line the balances move from. | [default to String]
**toLineId** | **String** | The identifier of the line the balances move to. | [default to String]
**mode** | **String** | &#39;Transfer&#39; for a genuine transfer between investors or &#39;Correction&#39; for a backdated fix of a  mis-booked position. Defaults to &#39;Transfer&#39;. Available values: Transfer, Correction. | [optional] [default to String]
**toPortfolioId** | **String** | The identifier of the portfolio holding the destination line, if different from the source. | [optional] [default to String]
**considerationAmount** | **java.math.BigDecimal** | The consideration paid for the transferred interest, if any. Must not be negative. | [optional] [default to java.math.BigDecimal]
**considerationCurrency** | **String** | The currency of the consideration, if any. | [optional] [default to String]
**considerationRecordOnly** | **Boolean** | True when the consideration is recorded for information only and does not settle. | [optional] [default to Boolean]
**reason** | **String** | The reason for the transfer, if given: &#39;TaxStatusChange&#39;, &#39;Redomicile&#39;, &#39;SecondaryBuyerIneligible&#39;,  &#39;BenefitPlanLimit&#39;, &#39;WrongVehicleAtClose&#39;, &#39;AffiliateTransfer&#39;, &#39;Regulatory&#39;, &#39;VehicleMergerOrClosure&#39;,  &#39;NomineeUnwind&#39; or &#39;BlockerOrAivElection&#39;. Available values: None, TaxStatusChange, Redomicile, SecondaryBuyerIneligible, BenefitPlanLimit, WrongVehicleAtClose, AffiliateTransfer, Regulatory, VehicleMergerOrClosure, NomineeUnwind, BlockerOrAivElection. | [optional] [default to String]
**scope** | **String** | &#39;Whole&#39; to move the whole line or &#39;Deal&#39; to move only one deal&#39;s balances. &#39;Deal&#39; is only allowed  with reason &#39;BlockerOrAivElection&#39;. Defaults to &#39;Whole&#39;. Available values: Whole, Deal. | [optional] [default to String]
**dealId** | **String** | The identifier of the deal the transfer relates to, if any. | [optional] [default to String]
**taxTreatmentAcknowledged** | **Boolean** | Acknowledges that the tax treatment of a blocker or AIV election has been reviewed. Required to be  true when the reason is &#39;BlockerOrAivElection&#39;. | [optional] [default to Boolean]
**committedCapitalAmount** | **java.math.BigDecimal** | The committed capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**calledCommitmentAmount** | **java.math.BigDecimal** | The called part of the commitment received by the destination line, which lowers its uncalled commitment. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**paidInCapitalAmount** | **java.math.BigDecimal** | The paid-in capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnedCapitalAmount** | **java.math.BigDecimal** | The returned capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallableCapitalAmount** | **java.math.BigDecimal** | The recallable capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**nonRecallableCapitalAmount** | **java.math.BigDecimal** | The non-recallable capital received by the destination line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**fundedCapitalAmount** | **java.math.BigDecimal** | The funded capital received by the destination line, for a line whose drawdowns were booked against the stored funded balance rather than paid-in capital. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**excessCapitalReturnedAmount** | **java.math.BigDecimal** | The cumulative excess capital returned that the destination line takes over from the source line. Used on the &#39;In&#39; side only; must not be negative. | [optional] [default to java.math.BigDecimal]
**paidInCapitalPortfolioCcyAmount** | **java.math.BigDecimal** | The paid-in capital the destination line takes over, already in the portfolio&#39;s base currency: the source line&#39;s PaidInCapitalPortfolioCcy balance share, accumulated at historical rates, not a spot conversion of PaidInCapitalAmount. Used on the &#39;In&#39; side only; must not be negative. An In side that omits it books zero for PaidInCapitalPortfolioCcy while the Out side gives up its share, and the transaction type configuration must include the PaidInCapitalPortfolioCcy movement for the twin to move. | [optional] [default to java.math.BigDecimal]
**returnedCapitalPortfolioCcyAmount** | **java.math.BigDecimal** | The returned capital the destination line takes over, already in the portfolio&#39;s base currency at the source line&#39;s historical rates. Used on the &#39;In&#39; side only; must not be negative. An In side that omits it books zero for ReturnedCapitalPortfolioCcy while the Out side gives up its share, and the transaction type configuration must include the ReturnedCapitalPortfolioCcy movement for the twin to move. | [optional] [default to java.math.BigDecimal]
**excessCapitalReturnedPortfolioCcyAmount** | **java.math.BigDecimal** | The cumulative excess capital returned that the destination line takes over, already in the portfolio&#39;s base currency at the source line&#39;s historical rates. Used on the &#39;In&#39; side only; must not be negative. An In side that omits it books zero for ExcessCapitalReturnedPortfolioCcy while the Out side gives up its share, and the transaction type configuration must include the ExcessCapitalReturnedPortfolioCcy movement for the twin to move. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CapitalInterestTransferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
String Direction = "example Direction";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
String FromLineId = "example FromLineId";
String ToLineId = "example ToLineId";
@jakarta.annotation.Nullable String Mode = "example Mode";
@jakarta.annotation.Nullable String ToPortfolioId = "example ToPortfolioId";
@jakarta.annotation.Nullable java.math.BigDecimal ConsiderationAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsiderationCurrency = "example ConsiderationCurrency";
@jakarta.annotation.Nullable Boolean ConsiderationRecordOnly = true;
@jakarta.annotation.Nullable String Reason = "example Reason";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String DealId = "example DealId";
@jakarta.annotation.Nullable Boolean TaxTreatmentAcknowledged = true;
@jakarta.annotation.Nullable java.math.BigDecimal CommittedCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CalledCommitmentAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PaidInCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReturnedCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RecallableCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NonRecallableCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FundedCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ExcessCapitalReturnedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PaidInCapitalPortfolioCcyAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReturnedCapitalPortfolioCcyAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ExcessCapitalReturnedPortfolioCcyAmount = new java.math.BigDecimal("100.00");


CapitalInterestTransferEvent capitalInterestTransferEventInstance = new CapitalInterestTransferEvent()
    .Date(Date)
    .Direction(Direction)
    .Fraction(Fraction)
    .FromLineId(FromLineId)
    .ToLineId(ToLineId)
    .Mode(Mode)
    .ToPortfolioId(ToPortfolioId)
    .ConsiderationAmount(ConsiderationAmount)
    .ConsiderationCurrency(ConsiderationCurrency)
    .ConsiderationRecordOnly(ConsiderationRecordOnly)
    .Reason(Reason)
    .Scope(Scope)
    .DealId(DealId)
    .TaxTreatmentAcknowledged(TaxTreatmentAcknowledged)
    .CommittedCapitalAmount(CommittedCapitalAmount)
    .CalledCommitmentAmount(CalledCommitmentAmount)
    .PaidInCapitalAmount(PaidInCapitalAmount)
    .ReturnedCapitalAmount(ReturnedCapitalAmount)
    .RecallableCapitalAmount(RecallableCapitalAmount)
    .NonRecallableCapitalAmount(NonRecallableCapitalAmount)
    .FundedCapitalAmount(FundedCapitalAmount)
    .ExcessCapitalReturnedAmount(ExcessCapitalReturnedAmount)
    .PaidInCapitalPortfolioCcyAmount(PaidInCapitalPortfolioCcyAmount)
    .ReturnedCapitalPortfolioCcyAmount(ReturnedCapitalPortfolioCcyAmount)
    .ExcessCapitalReturnedPortfolioCcyAmount(ExcessCapitalReturnedPortfolioCcyAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
