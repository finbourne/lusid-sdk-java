# com.finbourne.lusid.model.Repo
LUSID representation of a sale and repurchase agreement, supporting haircut, margin or repo rate methods.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**accrualBasis** | **String** | For calculation of interest, the accrual basis to be used.  For more information on day counts, see [knowledge base article KA-01798](https://support.lusid.com/knowledgebase/article/KA-01798)     Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM]. | [default to String]
**collateral** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The actual collateral in the Repo.  This property is for informational purposes only, Lusid pricing is not affected. | [optional] [default to List<LusidInstrument>]
**collateralValue** | **java.math.BigDecimal** | The full market value of the collateral in domestic currency, before any margin or haircut is applied. | [optional] [default to java.math.BigDecimal]
**haircut** | **java.math.BigDecimal** | The haircut (or margin percentage) applied to the collateral, this should be a number between 0 and 1, i.e. for a 5% haircut this should be 0.05.  This is defined as (CollateralValue - PurchasePrice) / CollateralValue.  If this property is specified, so too must CollateralValue.  While this property is optional, one, and only one, of PurchasePrice, Margin and Haircut must be specified. | [optional] [default to java.math.BigDecimal]
**margin** | **java.math.BigDecimal** | The initial margin (or margin ratio) applied to the collateral, this should be a number greater than or equal to 1.0,  i.e. for a 102% margin this should be 1.02. A value of 1.0 means no margin (100%).  This is defined as CollateralValue / PurchasePrice.  If this property is specified, so too must CollateralValue.  While this property is optional, one, and only one, of PurchasePrice, Margin and Haircut must be specified. | [optional] [default to java.math.BigDecimal]
**purchasePrice** | **java.math.BigDecimal** | The price the collateral is initially purchased for, this property can be used to explicitly set the purchase price and not require  collateral value and a margin or haircut.  While this property is optional, one, and only one, of PurchasePrice, Margin and Haircut must be specified. | [optional] [default to java.math.BigDecimal]
**repoRate** | **java.math.BigDecimal** | The rate at which interest is to be accrue and be paid upon redemption of the collateral at maturity.  This field is used to calculate the Repurchase price.  While this property is optional, one, and only one, of the RepoRate and RepurchasePrice must be specified. | [optional] [default to java.math.BigDecimal]
**repurchasePrice** | **java.math.BigDecimal** | The price at which the collateral is repurchased, this field is optional and can be explicitly set here or will be calculated  from the PurchasePrice and RepoRate.  One, and only one, of the RepoRate and RepurchasePrice must be specified. | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.Repo;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String AccrualBasis = "example AccrualBasis";
@jakarta.annotation.Nullable List<LusidInstrument> Collateral = new List<LusidInstrument>();
@jakarta.annotation.Nullable java.math.BigDecimal CollateralValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Haircut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Margin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PurchasePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RepoRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RepurchasePrice = new java.math.BigDecimal("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


Repo repoInstance = new Repo()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .AccrualBasis(AccrualBasis)
    .Collateral(Collateral)
    .CollateralValue(CollateralValue)
    .Haircut(Haircut)
    .Margin(Margin)
    .PurchasePrice(PurchasePrice)
    .RepoRate(RepoRate)
    .RepurchasePrice(RepurchasePrice)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
