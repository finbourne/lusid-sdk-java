# com.finbourne.lusid.model.BondCouponEvent
Definition of a Bond Coupon Event  This is an event that describes the occurence of a cashflow due to a fixed rate bond coupon payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Ex-Dividend date of the coupon payment | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the coupon payment | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the coupon payment | [default to String]
**couponPerUnit** | **java.math.BigDecimal** | CouponRate*Principal | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondCouponEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CouponPerUnit = new java.math.BigDecimal("100.00");


BondCouponEvent bondCouponEventInstance = new BondCouponEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CouponPerUnit(CouponPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
