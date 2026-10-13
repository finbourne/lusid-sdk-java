# com.finbourne.lusid.model.AllocationEventUnbookRequest
The request used to take a half-booked Allocation Event back to Computed, cancelling what it wrote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the half-booked event is being taken back to Computed. | [default to String]

```java
import com.finbourne.lusid.model.AllocationEventUnbookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Reason = "example Reason";


AllocationEventUnbookRequest allocationEventUnbookRequestInstance = new AllocationEventUnbookRequest()
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
