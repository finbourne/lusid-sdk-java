# com.finbourne.lusid.model.ThresholdAllocation
How a threshold is split between the two parties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**we** | **java.math.BigDecimal** | Our share of the threshold. | [default to java.math.BigDecimal]
**they** | **java.math.BigDecimal** | The counterparty&#39;s share of the threshold. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ThresholdAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal We = new java.math.BigDecimal("100.00");
java.math.BigDecimal They = new java.math.BigDecimal("100.00");


ThresholdAllocation thresholdAllocationInstance = new ThresholdAllocation()
    .We(We)
    .They(They);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
