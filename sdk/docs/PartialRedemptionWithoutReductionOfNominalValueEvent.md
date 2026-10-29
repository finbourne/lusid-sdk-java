# com.finbourne.lusid.model.PartialRedemptionWithoutReductionOfNominalValueEvent
Partial Redemption Without Reduction of Nominal Value (PRED, AMI-SeCo SCoRE section 4.47): securities are  redeemed in part before their scheduled final maturity date, the redemption is reflected in a pool factor  reduction and no movement of securities occurs. A notified PRED on an asset-backed ComplexBond. The holder  keeps its original face (units), the pool factor falls from previousFactor to nextFactor and the current face  falls with it; principalPerUnit of original face is repaid at pricePerUnit, par when omitted. Mandatory  participation only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date of the paydown. A PRED notification carries a record date (:98A::RDTE) and no ex-date;  the record date goes here. Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the principal is paid and the date the next factor takes effect (:98A::PAYD). Required; on or  after exDate. | [optional] [default to OffsetDateTime]
**currency** | **String** | The ISO 4217 code of the currency in which the principal is paid (:11A::OPTN). Required. | [default to String]
**principalPerUnit** | **java.math.BigDecimal** | The principal repaid per unit of original face (AMI-SeCo RATE, per 1 of original face; a percentage is  divided by 100). Required and strictly positive. It may differ from previousFactor minus nextFactor,  because a write-off or an interest deferral in the same period moves the factor too. | [optional] [default to java.math.BigDecimal]
**previousFactor** | **java.math.BigDecimal** | The pool factor in force until paymentDate (:92A::PRFC). Required, together with nextFactor, so the  notified pool factor reduction can be reconciled against the custodian&#39;s factor file. | [optional] [default to java.math.BigDecimal]
**nextFactor** | **java.math.BigDecimal** | The pool factor in force from paymentDate (:92A::NWFC). Required, together with previousFactor; strictly  positive and below previousFactor. | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | The price per 1 of principal repaid (:90A::OFFR or :90B::OFFR), with 1 representing par; PRCT/98 is sent as  0.98. Optional; a null is read as 1, so an omitted price is par. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartialRedemptionWithoutReductionOfNominalValueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NextFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PricePerUnit = new java.math.BigDecimal("100.00");


PartialRedemptionWithoutReductionOfNominalValueEvent partialRedemptionWithoutReductionOfNominalValueEventInstance = new PartialRedemptionWithoutReductionOfNominalValueEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .PrincipalPerUnit(PrincipalPerUnit)
    .PreviousFactor(PreviousFactor)
    .NextFactor(NextFactor)
    .PricePerUnit(PricePerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
