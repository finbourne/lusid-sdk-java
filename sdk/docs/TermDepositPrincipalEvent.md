# com.finbourne.lusid.model.TermDepositPrincipalEvent
Definition of a Term Deposit Interest Event.  This is an event that describes the occurence of principal on a term deposit ().

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the principal payment. | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the principal payment. | [optional] [default to OffsetDateTime]
**principalPerUnit** | **java.math.BigDecimal** | The principal payment made per unit of the held . | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TermDepositPrincipalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPerUnit = new java.math.BigDecimal("100.00");


TermDepositPrincipalEvent termDepositPrincipalEventInstance = new TermDepositPrincipalEvent()
    .Currency(Currency)
    .PaymentDate(PaymentDate)
    .PrincipalPerUnit(PrincipalPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
