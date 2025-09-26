# com.finbourne.lusid.model.AdditionalPayment
Record describing additional payment entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The payment amount. | [default to java.math.BigDecimal]
**currency** | **String** | The payment currency. | [default to String]
**payDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the payment is made. | [default to OffsetDateTime]
**payReceive** | **String** | Is it pay or receive.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]

```java
import com.finbourne.lusid.model.AdditionalPayment;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime PayDate = OffsetDateTime.now();
String PayReceive = "example PayReceive";


AdditionalPayment additionalPaymentInstance = new AdditionalPayment()
    .Amount(Amount)
    .Currency(Currency)
    .PayDate(PayDate)
    .PayReceive(PayReceive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
