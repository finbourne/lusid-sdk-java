# com.finbourne.lusid.model.FlexibleRepoCollateralSubstitutionEvent
Event representing the substitution of collateral on a repurchase agreement booked as a FlexibleRepo.  One or more outgoing collateral instruments are returned by the Buyer and replaced by one or more incoming  collateral instruments provided by the Seller, without closing or modifying the repo itself.  The outgoing instruments are held on the repo until the settlement date and the incoming instruments from it,  in the units given on each CollateralIn entry. Optional flags allow deferral of the manufactured and cash  payments to repo maturity, and payment of the repo interest accrued to the entitlement date.  Specific to a FlexibleRepo instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required property.  The date on which the substitution takes effect. Must be on or before the settlement date.  This is a required field, unless otherwise supplied via \&quot;EventDateStamps\&quot; in  the instrument event upsert request. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required property.  The date on which the collateral transfers settle: the outgoing instruments are held on the repo until this  date and the incoming instruments from it. Must be on or after the entitlement date and strictly before the  repo maturity date.  This is a required field, unless otherwise supplied via \&quot;EventDateStamps\&quot; in  the instrument event upsert request. | [optional] [default to OffsetDateTime]
**collateralOut** | [**List&lt;CollateralSubstitutionConstituent&gt;**](CollateralSubstitutionConstituent.md) | The collateral instruments being removed from the repo. If omitted, every collateral instrument held on the  repo on the settlement date is substituted in full. If provided, must contain at least one entry, each of an  instrument held on the repo from before the settlement date. | [optional] [default to List<CollateralSubstitutionConstituent>]
**collateralIn** | [**List&lt;CollateralSubstitutionConstituent&gt;**](CollateralSubstitutionConstituent.md) | The collateral instruments being added to the repo. Must contain at least one entry. | [default to List<CollateralSubstitutionConstituent>]
**amount** | **java.math.BigDecimal** | Not supported: must be omitted. Partial substitution of the outgoing collateral is not available; the amounts  are given on each CollateralOut and CollateralIn entry. | [optional] [default to java.math.BigDecimal]
**amountType** | **String** | Not supported: must be omitted. See Amount.  Supported string (enumeration) values are: [Percentage, Units]. Available values: Percentage, Units. | [optional] [default to String]
**adjustCollateralUnits** | **Boolean** | Required property.  Must be false: the incoming collateral units are taken from the Amount on each CollateralIn entry.  Sizing the incoming units so that their market value matches the outgoing collateral (true) is not yet supported. | [default to Boolean]
**deferCashPayment** | **Boolean** | Only valid if AdjustCollateralUnits is false. If true, the residual cash payment is deferred to repo maturity.  Defaults to false. | [optional] [default to Boolean]
**accrueDeferredCashPayment** | **Boolean** | Only valid if DeferCashPayment is true. If true, the deferred cash payment accrues interest at the repo rate  until maturity. Defaults to false. | [optional] [default to Boolean]
**payAccruedRepoInterestAtSubstitution** | **Boolean** | If true, the repo interest accrued from the repo start date to the entitlement date is paid on the settlement  date, and repo interest resets and resumes from the entitlement date to maturity. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FlexibleRepoCollateralSubstitutionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EntitlementDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CollateralSubstitutionConstituent> CollateralOut = new List<CollateralSubstitutionConstituent>();
List<CollateralSubstitutionConstituent> CollateralIn = new List<CollateralSubstitutionConstituent>();
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String AmountType = "example AmountType";
Boolean AdjustCollateralUnits = true;
Boolean DeferCashPayment = true;
Boolean AccrueDeferredCashPayment = true;
Boolean PayAccruedRepoInterestAtSubstitution = true;


FlexibleRepoCollateralSubstitutionEvent flexibleRepoCollateralSubstitutionEventInstance = new FlexibleRepoCollateralSubstitutionEvent()
    .EntitlementDate(EntitlementDate)
    .SettlementDate(SettlementDate)
    .CollateralOut(CollateralOut)
    .CollateralIn(CollateralIn)
    .Amount(Amount)
    .AmountType(AmountType)
    .AdjustCollateralUnits(AdjustCollateralUnits)
    .DeferCashPayment(DeferCashPayment)
    .AccrueDeferredCashPayment(AccrueDeferredCashPayment)
    .PayAccruedRepoInterestAtSubstitution(PayAccruedRepoInterestAtSubstitution);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
