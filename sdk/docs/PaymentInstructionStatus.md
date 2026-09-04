# com.finbourne.lusid.model.PaymentInstructionStatus
The current status of a Payment Instruction. Managed exclusively via the dedicated  status transition API — not accepted on upsert.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentValue** | **String** | The current status value. One of: Created, Staged, Released, Instructed, Sent, Cancelled, Failed. | [default to String]
**asAtLastTransition** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp of the most recent status transition. | [default to OffsetDateTime]
**userIdLastTransition** | **String** | The ID of the user who made the most recent status transition. | [default to String]

```java
import com.finbourne.lusid.model.PaymentInstructionStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CurrentValue = "example CurrentValue";
OffsetDateTime AsAtLastTransition = OffsetDateTime.now();
String UserIdLastTransition = "example UserIdLastTransition";


PaymentInstructionStatus paymentInstructionStatusInstance = new PaymentInstructionStatus()
    .CurrentValue(CurrentValue)
    .AsAtLastTransition(AsAtLastTransition)
    .UserIdLastTransition(UserIdLastTransition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
