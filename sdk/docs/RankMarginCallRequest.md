# com.finbourne.lusid.model.RankMarginCallRequest
Ranks a margin call's collateral again against the holdings as they stand now, keeping the assets the user chose.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overrides** | [**List&lt;CollateralAllocationOverride&gt;**](CollateralAllocationOverride.md) | The assets and units the user chose, each validated against the agreement&#39;s constraints and kept with its reason when it fails one. Optional. | [optional] [default to List<CollateralAllocationOverride>]
**fillRemainder** | **Boolean** | Whether to fill what the overrides leave uncovered from the ranking, cheapest first. Defaults to true. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.RankMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<CollateralAllocationOverride> Overrides = new List<CollateralAllocationOverride>();
@jakarta.annotation.Nullable Boolean FillRemainder = true;


RankMarginCallRequest rankMarginCallRequestInstance = new RankMarginCallRequest()
    .Overrides(Overrides)
    .FillRemainder(FillRemainder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
