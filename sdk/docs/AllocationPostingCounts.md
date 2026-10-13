# com.finbourne.lusid.model.AllocationPostingCounts
How many postings a plan writes on each side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lpSide** | **Integer** | The number of instrument events on investors&#39; lines. | [optional] [default to Integer]
**rollUps** | **Integer** | The number of roll-ups. | [optional] [default to Integer]
**fundSide** | **Integer** | The number of fund-side transactions. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.AllocationPostingCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer LpSide = new Integer("100.00");
Integer RollUps = new Integer("100.00");
Integer FundSide = new Integer("100.00");


AllocationPostingCounts allocationPostingCountsInstance = new AllocationPostingCounts()
    .LpSide(LpSide)
    .RollUps(RollUps)
    .FundSide(FundSide);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
