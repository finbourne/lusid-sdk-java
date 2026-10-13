# com.finbourne.lusid.model.AllocationEventReverseRequest
The request used to reverse a booked Allocation Event: why, and when the mirror postings are dated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Why the booked event is being reversed. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date to post the mirror entries at. Defaults to the original event date unless that period is closed, when it defaults to the current date. | [optional] [default to OffsetDateTime]
**backdated** | **Boolean** | Whether to post the mirror entries at the original event date even when that period is closed. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationEventReverseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Reason = "example Reason";
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
Boolean Backdated = true;


AllocationEventReverseRequest allocationEventReverseRequestInstance = new AllocationEventReverseRequest()
    .Reason(Reason)
    .EffectiveAt(EffectiveAt)
    .Backdated(Backdated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
