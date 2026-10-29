# com.finbourne.lusid.model.AllocationServiceRunWarning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**code** | **String** | The kind of warning. One of: OffMinimumIncrement (an allocation&#39;s quantity is not a multiple of the  instrument&#39;s minimum increment), SkippedBooked (an allocation was not changed because transactions are  already booked against it), ExecutionNotAllocated (an execution was excluded from the run). | [optional] [default to String]
**message** | **String** | A description of the warning and, where known, why it arose. | [optional] [default to String]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**executionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.AllocationServiceRunWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PlacementId = new ResourceId();
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Message = "example Message";
ResourceId AllocationId = new ResourceId();
ResourceId PortfolioId = new ResourceId();
ResourceId ExecutionId = new ResourceId();


AllocationServiceRunWarning allocationServiceRunWarningInstance = new AllocationServiceRunWarning()
    .PlacementId(PlacementId)
    .Code(Code)
    .Message(Message)
    .AllocationId(AllocationId)
    .PortfolioId(PortfolioId)
    .ExecutionId(ExecutionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
