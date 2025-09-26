# com.finbourne.lusid.model.TermDepositInterestEvent
Definition of a Term Deposit Interest Event.  This is an event that describes the occurence of interest on a term deposit ().

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the interest payment. | [default to String]
**interestPerUnit** | **java.math.BigDecimal** | The interest payment made per unit of the held . | [optional] [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the interest payment. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TermDepositInterestEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal InterestPerUnit = new java.math.BigDecimal("100.00");
OffsetDateTime PaymentDate = OffsetDateTime.now();


TermDepositInterestEvent termDepositInterestEventInstance = new TermDepositInterestEvent()
    .Currency(Currency)
    .InterestPerUnit(InterestPerUnit)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
