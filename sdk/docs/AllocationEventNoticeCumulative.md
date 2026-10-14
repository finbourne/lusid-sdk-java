# com.finbourne.lusid.model.AllocationEventNoticeCumulative
Cumulative balances to date for a partner on a notice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contributions** | **java.math.BigDecimal** | Cumulative contributions after the event. | [default to java.math.BigDecimal]
**distributions** | **java.math.BigDecimal** | Cumulative distributions after the event. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | Cumulative recallable distributions after the event. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventNoticeCumulative;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Contributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal Distributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal Recallable = new java.math.BigDecimal("100.00");


AllocationEventNoticeCumulative allocationEventNoticeCumulativeInstance = new AllocationEventNoticeCumulative()
    .Contributions(Contributions)
    .Distributions(Distributions)
    .Recallable(Recallable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
