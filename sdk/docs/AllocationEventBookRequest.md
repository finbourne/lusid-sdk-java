# com.finbourne.lusid.model.AllocationEventBookRequest
The request used to book a computed Allocation Event: the reference under which its shares are posted, and  whether to only show what would be posted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingReference** | **String** | The reference under which the computed shares were posted, for instance a journal entry code. | [default to String]
**dryRun** | **Boolean** | Whether to only build and return the posting plan without writing anything. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationEventBookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BookingReference = "example BookingReference";
Boolean DryRun = true;


AllocationEventBookRequest allocationEventBookRequestInstance = new AllocationEventBookRequest()
    .BookingReference(BookingReference)
    .DryRun(DryRun);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
