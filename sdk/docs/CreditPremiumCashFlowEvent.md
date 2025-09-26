# com.finbourne.lusid.model.CreditPremiumCashFlowEvent
Definition of a credit premium cash flow event.  This event describes a premium cashflow for credit default instruments (CDS or CDX).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-dividend date of the cashflow. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the cashflow. | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the cashflow is paid. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The cashflow amount received for each unit of the instrument held on the ex date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CreditPremiumCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");


CreditPremiumCashFlowEvent creditPremiumCashFlowEventInstance = new CreditPremiumCashFlowEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CashFlowPerUnit(CashFlowPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
