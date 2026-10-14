# com.finbourne.lusid.model.PaymentInstructionStatusTransitionRequest
A request to move one Payment Instruction to a new status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**status** | **String** | The status to move the Payment Instruction to. One of: Created, Staged, Released, Instructed, Sent, Cancelled, Failed. The transition must be permitted from the instruction&#39;s current status. Available values: Created, Staged, Released, Instructed, Sent, Cancelled, Failed. | [default to String]

```java
import com.finbourne.lusid.model.PaymentInstructionStatusTransitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Status = "example Status";


PaymentInstructionStatusTransitionRequest paymentInstructionStatusTransitionRequestInstance = new PaymentInstructionStatusTransitionRequest()
    .Id(Id)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
