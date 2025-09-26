# com.finbourne.lusid.model.CashPerpetual
LUSID representation of a Perpetual Cash Flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**principal** | **java.math.BigDecimal** | The face-value or principal for the cash at outset. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CashPerpetual;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
java.math.BigDecimal Principal = new java.math.BigDecimal("100.00");


CashPerpetual cashPerpetualInstance = new CashPerpetual()
    .StartDate(StartDate)
    .DomCcy(DomCcy)
    .Principal(Principal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
