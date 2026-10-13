# com.finbourne.lusid.model.AllocationEventBookingWarning
One validation rule a booking was allowed to proceed through under the map's policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The rule that was allowed through, for instance OverCall. | [optional] [default to String]
**detail** | **String** | What the rule found. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventBookingWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Detail = "example Detail";


AllocationEventBookingWarning allocationEventBookingWarningInstance = new AllocationEventBookingWarning()
    .Code(Code)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
