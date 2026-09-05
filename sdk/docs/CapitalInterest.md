# com.finbourne.lusid.model.CapitalInterest
LUSID representation of a CapitalInterest.  A CapitalInterest represents an investor's interest in a single commitment line to a  private-markets fund: one instrument per (fund, investor, commitment line). Units act as  a liveness flag (1 while the line is open, 0 once closed) and the economics are carried  by cost, fair value and the running capital balances rather than by quantity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantityBasis** | **String** | How the quantity of the holding is interpreted. Under the &#39;Anchored&#39; basis, units act as a  liveness flag: 1 while the commitment line is open and 0 once it is closed. Only &#39;Anchored&#39;  is currently supported.     Supported string (enumeration) values are: [Anchored, Unitless]. Available values: Anchored, Unitless. | [default to String]
**commitmentCurrency** | **String** | The currency the commitment is denominated in. May differ from both the fund currency  and the portfolio base currency. | [default to String]
**fundEntityId** | **String** | The identifier of the fund entity the commitment is made to. | [default to String]
**investorEntityId** | **String** | The identifier of the investor entity holding the commitment. | [default to String]
**commitmentLineId** | **String** | The identifier of the commitment line, unique for a given fund and investor. | [default to String]
**originalCommitment** | **java.math.BigDecimal** | The committed amount at inception, in the commitment currency. May be zero for evergreen  funds. This is the original value only; subsequent amendments are carried by the running  capital balances, not by the instrument. | [default to java.math.BigDecimal]
**commitmentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the commitment closed. | [default to OffsetDateTime]
**vintage** | **Integer** | The vintage year of the commitment. Defaults to the year of the commitment date. | [optional] [default to Integer]
**capitalInterestAssetClass** | **String** | The private-markets asset class of the fund the commitment is made to,  for example private equity, venture capital or infrastructure.     Supported string (enumeration) values are: [PrivateEquity, VentureCapital, PrivateCredit, RealAssets, Infrastructure, FundOfFunds, Secondary, CoInvestment, DirectEquity, ShareholderLoan, Other]. Available values: PrivateEquity, VentureCapital, PrivateCredit, RealAssets, Infrastructure, FundOfFunds, Secondary, CoInvestment, DirectEquity, ShareholderLoan, Other. | [optional] [default to String]
**reliefPolicy** | **String** | How distributions from the commitment line are relieved against the cost of the holding.  Defaults to &#39;InstructedCharacter&#39;.     Supported string (enumeration) values are: [InstructedCharacter, CostRecovery, ProportionalToFairValue, ProportionalToPercentageInterest, NoRelief]. Available values: InstructedCharacter, CostRecovery, ProportionalToFairValue, ProportionalToPercentageInterest, NoRelief. | [optional] [default to String]
**reliefRevisionMode** | **String** | How revisions to previously applied distribution relief are handled.  Defaults to &#39;ProspectiveTrueUp&#39;.     Supported string (enumeration) values are: [ProspectiveTrueUp, Restate, Final]. Available values: ProspectiveTrueUp, Restate, Final. | [optional] [default to String]
**fairValueSourcePrecedence** | **List&lt;String&gt;** | The order of precedence of the sources a fair value for the interest can be taken from.  Defaults to the reported NAV rolled forward for subsequent capital activity, then cost.     Supported string (enumeration) values for each entry are: [ReportedNav, RollForward, Independent, Cost]. | [optional] [default to List<String>]
**terminationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expected end of the fund&#39;s life, if known. This is expected rather than contractual  and does not act as a maturity date for the instrument. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CapitalInterest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String QuantityBasis = "example QuantityBasis";
String CommitmentCurrency = "example CommitmentCurrency";
String FundEntityId = "example FundEntityId";
String InvestorEntityId = "example InvestorEntityId";
String CommitmentLineId = "example CommitmentLineId";
java.math.BigDecimal OriginalCommitment = new java.math.BigDecimal("100.00");
OffsetDateTime CommitmentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer Vintage = new Integer("100.00");
@jakarta.annotation.Nullable String CapitalInterestAssetClass = "example CapitalInterestAssetClass";
@jakarta.annotation.Nullable String ReliefPolicy = "example ReliefPolicy";
@jakarta.annotation.Nullable String ReliefRevisionMode = "example ReliefRevisionMode";
@jakarta.annotation.Nullable List<String> FairValueSourcePrecedence = new List<String>();
@jakarta.annotation.Nullable OffsetDateTime TerminationDate = OffsetDateTime.now();


CapitalInterest capitalInterestInstance = new CapitalInterest()
    .QuantityBasis(QuantityBasis)
    .CommitmentCurrency(CommitmentCurrency)
    .FundEntityId(FundEntityId)
    .InvestorEntityId(InvestorEntityId)
    .CommitmentLineId(CommitmentLineId)
    .OriginalCommitment(OriginalCommitment)
    .CommitmentDate(CommitmentDate)
    .Vintage(Vintage)
    .CapitalInterestAssetClass(CapitalInterestAssetClass)
    .ReliefPolicy(ReliefPolicy)
    .ReliefRevisionMode(ReliefRevisionMode)
    .FairValueSourcePrecedence(FairValueSourcePrecedence)
    .TerminationDate(TerminationDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
