# com.finbourne.lusid.model.FlexibleRepo
Lusid representation of a repurchase agreement, where one party sells some collateral and agrees to re-buy it at a later date for some given price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the instrument. This is the date at which the repurchase will occur for a TermRepo.  Optional for OpenRepo, but if not provided, defaults to the StartDate plus a long period (e.g. 2099-12-31). | [optional] [default to OffsetDateTime]
**buyerOrSeller** | **String** | Is the user the Buyer or the Seller of this repo?  Every repo agreement has two sides, a buyer and a seller.  The Buyer pays the PurchasePrice to the Seller in exchange for legal ownership of the collateral.  At Maturity, the Buyer then receives the RepurchasePrice in exchange for returning legal ownership of the collateral.  Controls the direction of purchase and repurchase cashflows, as well as the recipient of cashflows from the collateral.    Supported string (enumeration) values are: [Buyer, Seller]. | [default to String]
**repoCcy** | **String** | Currency of the purchase and repurchase prices. May differ from the currencies on any collateral. | [default to String]
**repoType** | **String** | The type of the repurchase agreement, Open or Term.  If Term, the repurchase automatically takes place at Maturity.  If Open, the agreement is rolled by the given tenor, and an interest cashflow is paid out with each roll,  unless manually triggered by a FlexibleRepoFullClosureEvent.    Supported string (enumeration) values are: [OpenRepo, TermRepo]. | [default to String]
**accrualBasis** | **String** | For calculation of interest, the accrual day count to be used.  Required if no RepoRateSchedules are provided.  If both RepoRateSchedules and AccrualBasis are provided,  then AccrualBasis will take precedence.    Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM]. | [optional] [default to String]
**collateral** | [**Collateral**](Collateral.md) |  | [optional] [default to Collateral]
**haircut** | **java.math.BigDecimal** | Haircut on the value of the collateral, used to calculate PurchasePrice if not provided directly.  Haircut or Margin should be specified if PurchasePrice is not specified. | [optional] [default to java.math.BigDecimal]
**margin** | **java.math.BigDecimal** | Initial margin on the value of the collateral, used to calculate PurchasePrice if not provided directly.  Haircut or Margin should be specified if PurchasePrice is not specified. | [optional] [default to java.math.BigDecimal]
**openRepoRollingPeriod** | **String** | Required if the RepoType is Open.  The tenor representing the mandatory roll period if the FlexibleRepo is not manually matured.  If a user matures the FlexibleRepo via an instrument event, then the repurchase will delay until the end of this rolling period.  Generally this is set to 1D (one day), i.e. the repurchase will occur on the same day as the instrument event,  though any valid tenor is accepted with TenorUnit set to Day, Week, Month, or Year.  Note that TenorUnit T is not accepted here. | [optional] [default to String]
**purchasePrice** | **java.math.BigDecimal** | The initial purchase price of the collateral.  If provided directly in this field, then Collateral.CollateralValue,  Haircut, and Margin should not be provided. | [optional] [default to java.math.BigDecimal]
**repoRateSchedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Schedules used to calculate the repurchase price and any interest payments on the FlexibleRepo.  Only one schedule may be provided, and must be of type FixedSchedule or FloatSchedule.  If RepoType is OpenRepo, a FixedSchedule or FloatSchedule must be provided to calculate the expected Repo Rate,  and RepurchasePrice must be omitted.  If RepoType is TermRepo, only one of RepurchasePrice and RepoRateSchedules should be provided.  If a RepoRateSchedule is provided on a TermRepo, the PaymentFrequency in the FlowConventions should be 1T.  StubType must be set to None, and no ExDividend configuration should be provided. | [optional] [default to List<Schedule>]
**repurchasePrice** | **java.math.BigDecimal** | The repurchase price of the repo, if known.  Only one of RepurchasePrice and RepoRateSchedules should be provided.  In the case of an OpenRepo, RepurchasePrice should not be provided,  and RepoRateSchedules should be provided instead in order to calculate the RepoRate. | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**isCollateralTransferActivated** | **Boolean** | Indicates whether the FlexibleRepoCollateralTransfer event is activated.  Determines the behavior of manufactured coupons and related boolean parameters.  Defaults to false.  When true:  - Generates the FlexibleRepoCollateralTransfer event  - Processes collateral transfer transactions into holding changes  - Generates manufactured payments when due to be paid     When false:  - Does not generate the event  - Generates manufactured payments when due to be received | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FlexibleRepo;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MaturityDate = OffsetDateTime.now();
String BuyerOrSeller = "example BuyerOrSeller";
String RepoCcy = "example RepoCcy";
String RepoType = "example RepoType";
@jakarta.annotation.Nullable String AccrualBasis = "example AccrualBasis";
Collateral Collateral = new Collateral();
@jakarta.annotation.Nullable java.math.BigDecimal Haircut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Margin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String OpenRepoRollingPeriod = "example OpenRepoRollingPeriod";
@jakarta.annotation.Nullable java.math.BigDecimal PurchasePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Schedule> RepoRateSchedules = new List<Schedule>();
@jakarta.annotation.Nullable java.math.BigDecimal RepurchasePrice = new java.math.BigDecimal("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();
Boolean IsCollateralTransferActivated = true;


FlexibleRepo flexibleRepoInstance = new FlexibleRepo()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .BuyerOrSeller(BuyerOrSeller)
    .RepoCcy(RepoCcy)
    .RepoType(RepoType)
    .AccrualBasis(AccrualBasis)
    .Collateral(Collateral)
    .Haircut(Haircut)
    .Margin(Margin)
    .OpenRepoRollingPeriod(OpenRepoRollingPeriod)
    .PurchasePrice(PurchasePrice)
    .RepoRateSchedules(RepoRateSchedules)
    .RepurchasePrice(RepurchasePrice)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions)
    .IsCollateralTransferActivated(IsCollateralTransferActivated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
