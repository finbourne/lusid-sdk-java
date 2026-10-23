# com.finbourne.lusid.model.FundPartnersTotals
Totals across every register line of the fund, independent of paging. Commitments are totalled per commitment  currency; amounts in different currencies are never added together.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committedByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | The total committed capital across all partners, per commitment currency, keyed by currency code. Commitments in different currencies are not added together. | [default to Map<String, java.math.BigDecimal>]
**partnerCount** | **Integer** | The number of partners (register lines) in the fund. | [default to Integer]

```java
import com.finbourne.lusid.model.FundPartnersTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, java.math.BigDecimal> CommittedByCurrency = new Map<String, java.math.BigDecimal>();
Integer PartnerCount = new Integer("100.00");


FundPartnersTotals fundPartnersTotalsInstance = new FundPartnersTotals()
    .CommittedByCurrency(CommittedByCurrency)
    .PartnerCount(PartnerCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
