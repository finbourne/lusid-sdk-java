# com.finbourne.lusid.model.DealingEstimates
How a fund treats estimated dealing when it strikes a valuation point before dealing is final.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | **List&lt;String&gt;** | Where the Fund&#39;s dealing estimates are read from: LusidTA, orders held in LUSID Transfer Agency, or External, orders dealt outside LUSID and reported to it. At least one, each at most once. Naming both sums the two books with no de-duplication between them; each source&#39;s completeness is tracked on its own. Available values: LusidTA, External. | [default to List<String>]
**requireComplete** | **Boolean** | Whether the dealing book must be complete before a swing is proposed. For the LusidTA source the book is complete once each share class&#39;s TA/DealingSchedule cut-off has passed at the strike&#39;s as-at; a class with no cut-off configured is treated as complete and the audit says so. An order written after its class&#39;s cut-off is late: reported on the audit but not counted. When true and the book is incomplete the valuation point is still struck, at the unswung baseline, and no swing is proposed; the audit says why. Defaults to true. | [optional] [default to Boolean]
**countPending** | **Boolean** | Whether a Pending order at the valuation point counts towards the estimated flow. Orders in the New and Priced states always count. When true a Pending order is folded into the flows like them; when false it is left out of the decision and reported on the audit as pending and not counted, with its value where one can be read. Defaults to false. | [optional] [default to Boolean]
**unitValuation** | **String** | The price estimated flows are turned into units at: EstimatePrice, the estimate struck at this valuation point, or LastOfficialPrice, the last official dealing price the Fund published. Available values: EstimatePrice, LastOfficialPrice. | [default to String]

```java
import com.finbourne.lusid.model.DealingEstimates;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Sources = new List<String>();
@jakarta.annotation.Nullable Boolean RequireComplete = true;
@jakarta.annotation.Nullable Boolean CountPending = true;
String UnitValuation = "example UnitValuation";


DealingEstimates dealingEstimatesInstance = new DealingEstimates()
    .Sources(Sources)
    .RequireComplete(RequireComplete)
    .CountPending(CountPending)
    .UnitValuation(UnitValuation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
