# com.finbourne.lusid.model.LoanInterestRepaymentEvent
Event to signify the repayment of interest accrued against a loan holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the interest is due to be paid. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]
**fraction** | **java.math.BigDecimal** | Fraction of the accrued on the holding to be repaid. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. | [optional] [default to java.math.BigDecimal]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the interest is paid automatically or not.  Exactly one election must be provided. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.LoanInterestRepaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


LoanInterestRepaymentEvent loanInterestRepaymentEventInstance = new LoanInterestRepaymentEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .Currency(Currency)
    .Fraction(Fraction)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
