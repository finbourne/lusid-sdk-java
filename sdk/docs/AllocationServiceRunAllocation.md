# com.finbourne.lusid.model.AllocationServiceRunAllocation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocation** | [**Allocation**](Allocation.md) |  | [optional] [default to Allocation]
**outcome** | **String** | What the run did to this allocation. One of: Created (by this run), Updated (an existing allocation  whose fields changed), Unchanged (an existing allocation the run left as it was), Cancelled (moved to a  cancelled state or reduced to zero quantity), Skipped (left alone because transactions are already booked  against it; see the SkippedBooked warning). | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationServiceRunAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PlacementId = new ResourceId();
Allocation Allocation = new Allocation();
@jakarta.annotation.Nullable String Outcome = "example Outcome";


AllocationServiceRunAllocation allocationServiceRunAllocationInstance = new AllocationServiceRunAllocation()
    .PlacementId(PlacementId)
    .Allocation(Allocation)
    .Outcome(Outcome);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
