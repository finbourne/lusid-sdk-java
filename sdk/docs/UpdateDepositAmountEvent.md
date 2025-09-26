# com.finbourne.lusid.model.UpdateDepositAmountEvent
Event to update the deposit be a given amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the adjustment to the deposit. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The signed amount of the adjustment to make to the deposit. Positive implies an increase, and negative implies a decrease. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UpdateDepositAmountEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


UpdateDepositAmountEvent updateDepositAmountEventInstance = new UpdateDepositAmountEvent()
    .Date(Date)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
