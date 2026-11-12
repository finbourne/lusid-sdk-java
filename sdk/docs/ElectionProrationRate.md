# com.finbourne.lusid.model.ElectionProrationRate
The proration rate the issuer applies to one option of a multi-option event, keyed by the option's election key.  An entry overrides the event-level proration rate for that election only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | The election key of the option this proration rate applies to. | [default to String]
**prorationRate** | **java.math.BigDecimal** | The fraction of the quantity instructed on this option that the issuer accepts. Must be in (0, 1]. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ElectionProrationRate;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");


ElectionProrationRate electionProrationRateInstance = new ElectionProrationRate()
    .ElectionKey(ElectionKey)
    .ProrationRate(ProrationRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
