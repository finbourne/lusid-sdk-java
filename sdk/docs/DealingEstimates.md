# com.finbourne.lusid.model.DealingEstimates
How a fund treats estimated dealing when it strikes a valuation point before dealing is final.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | **List&lt;String&gt;** | Reserved; not yet enforced. Where the Fund&#39;s dealing estimates are read from: LusidTA, orders held in LUSID Transfer Agency, or External, estimates supplied from outside LUSID. At least one, each at most once. Available values: LusidTA, External. | [default to List<String>]
**requireComplete** | **Boolean** | Reserved; not yet enforced. Whether every source must have reported before the valuation point can be struck. Defaults to true. | [optional] [default to Boolean]
**countPending** | **Boolean** | Whether pending orders count towards the estimated flow alongside confirmed ones. Defaults to false. | [optional] [default to Boolean]
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
