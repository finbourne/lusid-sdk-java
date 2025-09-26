# com.finbourne.lusid.model.BondPrincipalEvent
Definition of a Bond Principal Event  This is an event that describes the occurence of a cashflow due to the principal payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the principal payment | [default to String]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Ex-Dividend date of the principal payment | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the principal payment | [optional] [default to OffsetDateTime]
**principalPerUnit** | **java.math.BigDecimal** | Principal per unit | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");


BondPrincipalEvent bondPrincipalEventInstance = new BondPrincipalEvent()
    .Currency(Currency)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .PrincipalPerUnit(PrincipalPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
