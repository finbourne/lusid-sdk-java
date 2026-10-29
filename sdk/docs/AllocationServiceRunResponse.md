# com.finbourne.lusid.model.AllocationServiceRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The placements that were allocated successfully. | [optional] [default to List<ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The placements that could not be allocated, keyed by placement, with the reason. | [optional] [default to Map<String, ErrorDetail>]
**allocations** | [**List&lt;AllocationServiceRunAllocation&gt;**](AllocationServiceRunAllocation.md) | Every allocation the run touched across the successful placements, each with its outcome. | [optional] [default to List<AllocationServiceRunAllocation>]
**warnings** | [**List&lt;AllocationServiceRunWarning&gt;**](AllocationServiceRunWarning.md) | Warnings raised while allocating the successful placements. | [optional] [default to List<AllocationServiceRunWarning>]

```java
import com.finbourne.lusid.model.AllocationServiceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ResourceId> Values = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<AllocationServiceRunAllocation> Allocations = new List<AllocationServiceRunAllocation>();
@jakarta.annotation.Nullable List<AllocationServiceRunWarning> Warnings = new List<AllocationServiceRunWarning>();


AllocationServiceRunResponse allocationServiceRunResponseInstance = new AllocationServiceRunResponse()
    .Values(Values)
    .Failed(Failed)
    .Allocations(Allocations)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
