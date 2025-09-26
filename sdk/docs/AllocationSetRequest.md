# com.finbourne.lusid.model.AllocationSetRequest
A request to create or update multiple Allocations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationRequests** | [**List&lt;AllocationRequest&gt;**](AllocationRequest.md) | A collection of AllocationRequests. | [optional] [default to List<AllocationRequest>]

```java
import com.finbourne.lusid.model.AllocationSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AllocationRequest> AllocationRequests = new List<AllocationRequest>();


AllocationSetRequest allocationSetRequestInstance = new AllocationSetRequest()
    .AllocationRequests(AllocationRequests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
