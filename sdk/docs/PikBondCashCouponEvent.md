# com.finbourne.lusid.model.PikBondCashCouponEvent
Definition of a PIK Bond Cash Coupon Event  This is an event that describes the cash portion of a Payment-in-Kind coupon period on a ComplexBond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the coupon | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the coupon | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the coupon is paid | [default to String]
**couponPerUnit** | **java.math.BigDecimal** | The cash coupon amount per unit of the held bond&#39;s current face | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PikBondCashCouponEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CouponPerUnit = new java.math.BigDecimal("100.00");


PikBondCashCouponEvent pikBondCashCouponEventInstance = new PikBondCashCouponEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CouponPerUnit(CouponPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
