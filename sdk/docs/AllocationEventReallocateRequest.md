# com.finbourne.lusid.model.AllocationEventReallocateRequest
The request used to recompute an unbooked Allocation Event: why, and with which basis values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the event is being recomputed. | [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | Optional replacement basis values per investor record. | [optional] [default to List<AllocationMapBasisValue>]

```java
import com.finbourne.lusid.model.AllocationEventReallocateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Reason = "example Reason";
@jakarta.annotation.Nullable List<AllocationMapBasisValue> BasisValues = new List<AllocationMapBasisValue>();


AllocationEventReallocateRequest allocationEventReallocateRequestInstance = new AllocationEventReallocateRequest()
    .Reason(Reason)
    .BasisValues(BasisValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
