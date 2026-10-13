# com.finbourne.lusid.model.FundPartnerUnfundedReconciliation
The unfunded commitment statement of one partner over a period: the register's opening unfunded, the booked  activity that moves it, the closing unfunded that implies, and the register's own closing unfunded it is checked against.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the statement is for. | [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**currency** | **String** | The currency of every amount on the statement, being the commitment currency of the register line. | [default to String]
**periodFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime the statement opens at. | [default to OffsetDateTime]
**periodTo** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime the statement closes at. | [default to OffsetDateTime]
**openingUnfunded** | **java.math.BigDecimal** | The unfunded commitment at the opening datetime, from the register. | [default to java.math.BigDecimal]
**contributionsInsideCommitment** | **java.math.BigDecimal** | Capital called inside the commitment over the period, which reduces unfunded. Contributions outside the commitment, such as equalisation interest, are listed but do not count here. | [default to java.math.BigDecimal]
**recallableDistributions** | **java.math.BigDecimal** | Distributions over the period returned as recallable, which restore unfunded. | [default to java.math.BigDecimal]
**expiredRecallable** | **java.math.BigDecimal** | Recallable distributions whose recall deadline passed in the period without being recalled, which reduce unfunded. | [default to java.math.BigDecimal]
**commitmentChanges** | **java.math.BigDecimal** | Changes to the commitment over the period, which move unfunded one for one. | [default to java.math.BigDecimal]
**transfers** | **java.math.BigDecimal** | Commitment transferred in or out over the period, which moves unfunded one for one. | [default to java.math.BigDecimal]
**closingUnfunded** | **java.math.BigDecimal** | Opening unfunded less contributions inside the commitment, plus recallable distributions, less expired recallable, plus or minus commitment changes and transfers. | [default to java.math.BigDecimal]
**registerUnfunded** | **java.math.BigDecimal** | The unfunded commitment at the closing datetime, from the register. | [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | Closing unfunded less the register&#39;s unfunded at the closing datetime. Zero when the statement ties. | [default to java.math.BigDecimal]
**ties** | **Boolean** | Whether the closing unfunded equals the register&#39;s unfunded at the closing datetime. | [default to Boolean]
**lines** | [**List&lt;FundPartnerUnfundedReconciliationLine&gt;**](FundPartnerUnfundedReconciliationLine.md) | Every booked allocation to the partner over the period, in event date order, with the ILPA transaction type each is reported under and its effect on unfunded. | [default to List<FundPartnerUnfundedReconciliationLine>]

```java
import com.finbourne.lusid.model.FundPartnerUnfundedReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
ResourceId FundId = new ResourceId();
String Currency = "example Currency";
OffsetDateTime PeriodFrom = OffsetDateTime.now();
OffsetDateTime PeriodTo = OffsetDateTime.now();
java.math.BigDecimal OpeningUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal ContributionsInsideCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal RecallableDistributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal ExpiredRecallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal CommitmentChanges = new java.math.BigDecimal("100.00");
java.math.BigDecimal Transfers = new java.math.BigDecimal("100.00");
java.math.BigDecimal ClosingUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal RegisterUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");
Boolean Ties = true;
List<FundPartnerUnfundedReconciliationLine> Lines = new List<FundPartnerUnfundedReconciliationLine>();


FundPartnerUnfundedReconciliation fundPartnerUnfundedReconciliationInstance = new FundPartnerUnfundedReconciliation()
    .InvestorRecordId(InvestorRecordId)
    .FundId(FundId)
    .Currency(Currency)
    .PeriodFrom(PeriodFrom)
    .PeriodTo(PeriodTo)
    .OpeningUnfunded(OpeningUnfunded)
    .ContributionsInsideCommitment(ContributionsInsideCommitment)
    .RecallableDistributions(RecallableDistributions)
    .ExpiredRecallable(ExpiredRecallable)
    .CommitmentChanges(CommitmentChanges)
    .Transfers(Transfers)
    .ClosingUnfunded(ClosingUnfunded)
    .RegisterUnfunded(RegisterUnfunded)
    .Difference(Difference)
    .Ties(Ties)
    .Lines(Lines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
