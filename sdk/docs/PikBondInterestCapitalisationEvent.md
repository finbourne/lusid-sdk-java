# com.finbourne.lusid.model.PikBondInterestCapitalisationEvent
Definition of a PIK Bond Interest Capitalisation Event  This is an event that describes the capitalised (paid-in-kind) portion of a coupon period on a  Payment-in-Kind ComplexBond, whereby the coupon amount is added to the bond's current face.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the coupon | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the coupon | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the coupon is denominated | [default to String]
**couponPerUnit** | **java.math.BigDecimal** | The capitalised coupon amount per unit of the held bond&#39;s current face. Never rounded. | [optional] [default to java.math.BigDecimal]
**faceRoundingConvention** | **String** | How the face credited to a holding is rounded once CouponPerUnit has been scaled by the holding&#39;s  current face. Defaults to null, which leaves it unrounded. Carried from the bond&#39;s PikSchedule; the  per-unit coupon itself is never rounded. BuyUp is one of the available values but is rejected for  this event: a capitalisation has no cash leg to fund the next whole unit from. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**faceRoundingDecimalPlaces** | **Integer** | The number of decimal places the credited face is rounded to. Required when  FaceRoundingConvention is RoundToDecimalPlaces and not permitted otherwise. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.PikBondInterestCapitalisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CouponPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FaceRoundingConvention = "example FaceRoundingConvention";
@jakarta.annotation.Nullable Integer FaceRoundingDecimalPlaces = new Integer("100.00");


PikBondInterestCapitalisationEvent pikBondInterestCapitalisationEventInstance = new PikBondInterestCapitalisationEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CouponPerUnit(CouponPerUnit)
    .FaceRoundingConvention(FaceRoundingConvention)
    .FaceRoundingDecimalPlaces(FaceRoundingDecimalPlaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
