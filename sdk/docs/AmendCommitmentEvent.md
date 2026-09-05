# com.finbourne.lusid.model.AmendCommitmentEvent
Amends the total committed capital of a CapitalInterest. A positive amount increases the commitment and a  negative amount decreases it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the commitment amendment takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The signed change to the total commitment. Positive implies an increase, and negative implies a  decrease. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AmendCommitmentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


AmendCommitmentEvent amendCommitmentEventInstance = new AmendCommitmentEvent()
    .Date(Date)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
