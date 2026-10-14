# com.finbourne.lusid.model.AllocationPaymentHoldRequest
The request used to place, move or release a hold on a partner's payment against an allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The hold status to set: Blocked, Escrow or Released. A hold may only be released by a different user from the one who placed it. | [default to String]
**reason** | **String** | The reason for the hold. | [optional] [default to String]
**reference** | **String** | An external reference for the hold, such as a compliance case number. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationPaymentHoldRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
@jakarta.annotation.Nullable String Reason = "example Reason";
@jakarta.annotation.Nullable String Reference = "example Reference";


AllocationPaymentHoldRequest allocationPaymentHoldRequestInstance = new AllocationPaymentHoldRequest()
    .Status(Status)
    .Reason(Reason)
    .Reference(Reference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
