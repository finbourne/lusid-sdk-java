# com.finbourne.lusid.model.AllocationEventBookingError
One posting a booking could not write.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The rule or write step that failed, for instance WriteFailed. | [optional] [default to String]
**id** | **String** | The identifier of the posting that could not be written. | [optional] [default to String]
**message** | **String** | What went wrong. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventBookingError;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Message = "example Message";


AllocationEventBookingError allocationEventBookingErrorInstance = new AllocationEventBookingError()
    .Code(Code)
    .Id(Id)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
