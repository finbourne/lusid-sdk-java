# com.finbourne.lusid.model.AllocationEventNoticeCumulative
Cumulative balances to date for a partner on a notice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contributions** | **java.math.BigDecimal** | Cumulative contributions after the event. | [default to java.math.BigDecimal]
**distributions** | **java.math.BigDecimal** | Cumulative distributions after the event, tax withheld on the partner&#39;s behalf included, as the capital account&#39;s distributions row counts them. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | Cumulative recallable distributions after the event. | [default to java.math.BigDecimal]
**taxWithheld** | **java.math.BigDecimal** | Tax withheld from the partner&#39;s distributions to date and paid to the tax authority on its behalf: counted in the cumulative distributions, so the cash the partner actually received is distributions less this. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventNoticeCumulative;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Contributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal Distributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal Recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal TaxWithheld = new java.math.BigDecimal("100.00");


AllocationEventNoticeCumulative allocationEventNoticeCumulativeInstance = new AllocationEventNoticeCumulative()
    .Contributions(Contributions)
    .Distributions(Distributions)
    .Recallable(Recallable)
    .TaxWithheld(TaxWithheld);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
