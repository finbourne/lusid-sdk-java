# com.finbourne.lusid.model.MarginRunAllocation
How far the allocation pass over a run's base calls got: whether it ran, how many calls it proposed collateral  for, and what it left out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | How far the allocation pass got. One of Pending, Completed, Skipped or Failed. | [default to String]
**allocatedCallCount** | **Integer** | How many calls the pass proposed collateral for. | [default to Integer]
**detail** | **String** | Which calls the pass could not allocate and why, or why it failed. Null when every call that moves our collateral was allocated. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarginRunAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
Integer AllocatedCallCount = new Integer("100.00");
@jakarta.annotation.Nullable String Detail = "example Detail";


MarginRunAllocation marginRunAllocationInstance = new MarginRunAllocation()
    .Status(Status)
    .AllocatedCallCount(AllocatedCallCount)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
