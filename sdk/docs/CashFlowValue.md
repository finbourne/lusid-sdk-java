# com.finbourne.lusid.model.CashFlowValue
Result class for a cash flow value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the cash flow | [default to OffsetDateTime]
**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  | [optional] [default to ResultValueDictionary]
**cashFlowLineage** | [**CashFlowLineage**](CashFlowLineage.md) |  | [optional] [default to CashFlowLineage]
**paymentAmount** | **java.math.BigDecimal** | The amount paid or received | [default to java.math.BigDecimal]
**paymentCcy** | **String** | The currency of the transaction | [default to String]

```java
import com.finbourne.lusid.model.CashFlowValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
ResultValueDictionary Diagnostics = new ResultValueDictionary();
CashFlowLineage CashFlowLineage = new CashFlowLineage();
java.math.BigDecimal PaymentAmount = new java.math.BigDecimal("100.00");
String PaymentCcy = "example PaymentCcy";


CashFlowValue cashFlowValueInstance = new CashFlowValue()
    .PaymentDate(PaymentDate)
    .Diagnostics(Diagnostics)
    .CashFlowLineage(CashFlowLineage)
    .PaymentAmount(PaymentAmount)
    .PaymentCcy(PaymentCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
