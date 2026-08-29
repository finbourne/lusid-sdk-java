# com.finbourne.lusid.model.DepositSweepEvent
Sweeps the portfolio's eligible cash for a currency into a STIF FlexibleDeposit. Carries no amount of  its own, because it is resolved at processing time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sweepDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the sweep is effective, and whose cash balance is swept. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the swept cash balance. | [default to String]

```java
import com.finbourne.lusid.model.DepositSweepEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime SweepDate = OffsetDateTime.now();
String Currency = "example Currency";


DepositSweepEvent depositSweepEventInstance = new DepositSweepEvent()
    .SweepDate(SweepDate)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
