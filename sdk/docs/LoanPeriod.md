# com.finbourne.lusid.model.LoanPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**notional** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**interestAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.LoanPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
java.math.BigDecimal InterestAmount = new java.math.BigDecimal("100.00");


LoanPeriod loanPeriodInstance = new LoanPeriod()
    .PaymentDate(PaymentDate)
    .Notional(Notional)
    .InterestAmount(InterestAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
