# com.finbourne.lusid.model.DepositInterestPaymentEvent
Event to signify the repayment of interest accrued against a deposit holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the interest is due to be paid. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the accrued interest is calculated up until. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the repayment. | [default to String]

```java
import com.finbourne.lusid.model.DepositInterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
String Currency = "example Currency";


DepositInterestPaymentEvent depositInterestPaymentEventInstance = new DepositInterestPaymentEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
