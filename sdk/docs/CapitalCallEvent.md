# com.finbourne.lusid.model.CapitalCallEvent
A call of committed capital on a CapitalInterest: the fund draws down the amount from the investor's  unfunded commitment, moving it to funded capital.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the capital call takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount of committed capital called. Must be positive. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CapitalCallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


CapitalCallEvent capitalCallEventInstance = new CapitalCallEvent()
    .Date(Date)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
