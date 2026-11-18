# com.finbourne.lusid.model.InterestPaymentWithPrincipalEvent
Interest Payment with Principal (PRII, ISO 15022 :22F::CAEV//PRII): an event which consists of two components,  the decrease of the amortised value of a pool factor security and an interest payment. A notified PRII on an  asset-backed ComplexBond (RMBS, CMO or ABS) carries the interest of one payment date and the principal paydown  of the same date side by side: couponPerUnit of original face is paid as interest, and principalPerUnit of  original face is repaid at pricePerUnit, par when omitted, as the pool factor falls from previousFactor to  nextFactor. The holder keeps its original face (units) and the current face falls with the factor. On its  payment date it replaces the schedule's MbsCouponEvent and MbsPrincipalEvent. Mandatory participation only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date of both the interest and the principal (:98A::RDTE). Units settled on this date are  eligible. Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the interest and the principal are paid, and the date the next factor takes effect (:98A::PAYD).  Required; on or after exDate. It must equal the scheduled payment date for the event to replace the  schedule&#39;s coupon and paydown. | [optional] [default to OffsetDateTime]
**currency** | **String** | The ISO 4217 code of the currency in which both the interest and the principal are paid (:11A::OPTN).  Required. | [default to String]
**couponPerUnit** | **java.math.BigDecimal** | The gross interest paid for each unit of original face held on the ex date, before any shortfall or  deferral. Required and strictly positive. | [optional] [default to java.math.BigDecimal]
**principalPerUnit** | **java.math.BigDecimal** | The principal repaid for each unit of original face held on the ex date: previous minus next factor, minus  any same-date write-off factor, plus any same-date deferral factor. Required and strictly positive. It is not  checked against the two factors, because a same-date write-off or deferral legitimately moves the factor  difference away from the principal paid. | [optional] [default to java.math.BigDecimal]
**previousFactor** | **java.math.BigDecimal** | The pool factor in force until paymentDate (:92A::PRFC). Required, together with nextFactor and above it, so  the notified pool factor reduction can be reconciled against the custodian&#39;s factor file. | [optional] [default to java.math.BigDecimal]
**nextFactor** | **java.math.BigDecimal** | The pool factor in force from paymentDate (:92A::NWFC). Required, together with previousFactor; strictly  positive and below previousFactor. | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | The price per 1 of principal repaid (:90A::OFFR or :90B::OFFR), with 1 representing par; PRCT/98 is sent as  0.98. Optional, above 0 and below 2; a null is read as 1, so an omitted price is par. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.InterestPaymentWithPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CouponPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NextFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PricePerUnit = new java.math.BigDecimal("100.00");


InterestPaymentWithPrincipalEvent interestPaymentWithPrincipalEventInstance = new InterestPaymentWithPrincipalEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CouponPerUnit(CouponPerUnit)
    .PrincipalPerUnit(PrincipalPerUnit)
    .PreviousFactor(PreviousFactor)
    .NextFactor(NextFactor)
    .PricePerUnit(PricePerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
