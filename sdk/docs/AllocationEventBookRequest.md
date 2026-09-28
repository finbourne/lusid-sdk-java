# com.finbourne.lusid.model.AllocationEventBookRequest
The request used to book a computed Allocation Event: the reference under which its shares were posted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingReference** | **String** | The reference under which the computed shares were posted, for instance a journal entry code. | [default to String]

```java
import com.finbourne.lusid.model.AllocationEventBookRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BookingReference = "example BookingReference";


AllocationEventBookRequest allocationEventBookRequestInstance = new AllocationEventBookRequest()
    .BookingReference(BookingReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
