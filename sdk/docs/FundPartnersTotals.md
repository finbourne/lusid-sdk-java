# com.finbourne.lusid.model.FundPartnersTotals
Totals across every register line of the fund, independent of paging.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committed** | **java.math.BigDecimal** | The total committed capital across all partners. | [default to java.math.BigDecimal]
**partnerCount** | **Integer** | The number of partners (register lines) in the fund. | [default to Integer]

```java
import com.finbourne.lusid.model.FundPartnersTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Committed = new java.math.BigDecimal("100.00");
Integer PartnerCount = new Integer("100.00");


FundPartnersTotals fundPartnersTotalsInstance = new FundPartnersTotals()
    .Committed(Committed)
    .PartnerCount(PartnerCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
