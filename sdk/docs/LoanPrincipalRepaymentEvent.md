# com.finbourne.lusid.model.LoanPrincipalRepaymentEvent
Event to signify the repayment of some or all of the principal balance of a loan contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the Principal is due to be paid. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the Principal is paid automatically or not.  Exactly one election must be provided. | [optional] [default to List<LapseElection>]
**fraction** | **java.math.BigDecimal** | Fraction of the outstanding settled principal balance to be repaid. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. Ignored if the field Amount is set to a value different than zero. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | Amount to be repaid (independent of the fraction).  This field is not used at all if not set or set to 0, in this case the fraction field will be used instead.  Otherwise, the fraction field is ignored. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.LoanPrincipalRepaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


LoanPrincipalRepaymentEvent loanPrincipalRepaymentEventInstance = new LoanPrincipalRepaymentEvent()
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .LapseElections(LapseElections)
    .Fraction(Fraction)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
