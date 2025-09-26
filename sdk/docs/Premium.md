# com.finbourne.lusid.model.Premium
A class containing information for a given premium payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Premium amount. | [default to java.math.BigDecimal]
**currency** | **String** | Premium currency. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date when premium paid. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.Premium;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime Date = OffsetDateTime.now();


Premium premiumInstance = new Premium()
    .Amount(Amount)
    .Currency(Currency)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
