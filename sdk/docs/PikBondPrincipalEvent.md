# com.finbourne.lusid.model.PikBondPrincipalEvent
Definition of a PIK Bond Principal Event  This is an event that describes the principal repayment of a Payment-in-Kind ComplexBond at  maturity or redemption.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the principal payment | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the principal | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the principal is expressed | [default to String]
**principalPerUnit** | **java.math.BigDecimal** | The principal amount per unit of the held bond&#39;s current face | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PikBondPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");


PikBondPrincipalEvent pikBondPrincipalEventInstance = new PikBondPrincipalEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .PrincipalPerUnit(PrincipalPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
