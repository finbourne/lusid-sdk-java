# com.finbourne.lusid.model.DepositCloseEvent
Event to trigger the termination of a deposit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the deposit is terminated. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.DepositCloseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();


DepositCloseEvent depositCloseEventInstance = new DepositCloseEvent()
    .EffectiveDate(EffectiveDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
