# com.finbourne.lusid.model.SwapPrincipalEvent
Definition of a Swap Principal Event.  This is an event that describes the occurence of a cashflow due to the principal payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date of the principal payment. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the principal. | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the principal is paid. | [default to String]
**principalPerUnit** | **java.math.BigDecimal** | The principal amount received for each unit of the instrument held on the ex date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SwapPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");


SwapPrincipalEvent swapPrincipalEventInstance = new SwapPrincipalEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .PrincipalPerUnit(PrincipalPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
