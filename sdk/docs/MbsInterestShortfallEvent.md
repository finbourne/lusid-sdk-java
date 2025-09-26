# com.finbourne.lusid.model.MbsInterestShortfallEvent
Definition of an MBS Interest Shortfall Event  This is an event that describes the occurence of a cashflow due to unpaid interest that was deferred and  not capitalised into the outstanding principal balance of a mortgage-backed security.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the interest payment, usually several weeks prior to the payment date | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the interest | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the interest amount is notated | [default to String]
**interestPerUnit** | **java.math.BigDecimal** | The amount by which the coupon amount will fall short for each unit of the instrument held on the ex date | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MbsInterestShortfallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal InterestPerUnit = new java.math.BigDecimal("100.00");


MbsInterestShortfallEvent mbsInterestShortfallEventInstance = new MbsInterestShortfallEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .InterestPerUnit(InterestPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
