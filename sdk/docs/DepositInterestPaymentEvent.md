# com.finbourne.lusid.model.DepositInterestPaymentEvent
Event to signify the repayment of interest accrued against a deposit holding. Not applied when upserted  for a period the deposit settles partly or wholly in kind, as its scheduled events settle that period's interest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the interest is due to be paid. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]
**fraction** | **java.math.BigDecimal** | Fraction of the accrued interest to be paid, between 0 and 1 inclusive. Defaults to 1 if not set. | [optional] [default to java.math.BigDecimal]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the interest is paid. Stored but not yet acted on, so a chosen  lapse election does not stop the payment. Optional; if provided, exactly one. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.DepositInterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


DepositInterestPaymentEvent depositInterestPaymentEventInstance = new DepositInterestPaymentEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .Currency(Currency)
    .Fraction(Fraction)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
