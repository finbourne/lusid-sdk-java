# com.finbourne.lusid.model.AdjustGlobalCommitmentEvent
Event to adjust the limit/balance of a LoanFacility.  Used to initially set up the facility, but also used to increase/reduce the associated limit and balance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Amount that the limit and balance are changed by.  A positive number signifies an increase, and a negative number here signifies a decrease. | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the adjustment. Signifies when the facility begins to accrue interest. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AdjustGlobalCommitmentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime Date = OffsetDateTime.now();


AdjustGlobalCommitmentEvent adjustGlobalCommitmentEventInstance = new AdjustGlobalCommitmentEvent()
    .Amount(Amount)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
