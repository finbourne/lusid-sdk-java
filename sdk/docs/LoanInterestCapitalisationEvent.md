# com.finbourne.lusid.model.LoanInterestCapitalisationEvent
Event to signify that interest accrued against a loan holding is settled in kind: the amount is  capitalised into the loan's balance instead of being paid in cash.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the capitalisation is effective. Capitalisation has no cash to settle, so nothing can lag  the accrual it capitalises and this is the ex-date. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the in-kind accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the capitalised amount. | [default to String]
**fraction** | **java.math.BigDecimal** | Fraction of the in-kind accrued on the holding to be capitalised. Must be between 0 and 1, inclusive.  Defaults to 1 if not set. The accrual is reset in full whatever this is: an issuer who elects to  capitalise part of the in-kind leg has still settled the period. | [optional] [default to java.math.BigDecimal]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Election for controlling whether the interest is capitalised automatically or not.  Exactly one election must be provided. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.LoanInterestCapitalisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


LoanInterestCapitalisationEvent loanInterestCapitalisationEventInstance = new LoanInterestCapitalisationEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .Currency(Currency)
    .Fraction(Fraction)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
