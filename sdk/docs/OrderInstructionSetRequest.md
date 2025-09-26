# com.finbourne.lusid.model.OrderInstructionSetRequest
A request to create or update multiple OrderInstructions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;OrderInstructionRequest&gt;**](OrderInstructionRequest.md) | A collection of OrderInstructionRequests. | [optional] [default to List<OrderInstructionRequest>]

```java
import com.finbourne.lusid.model.OrderInstructionSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<OrderInstructionRequest> Requests = new List<OrderInstructionRequest>();


OrderInstructionSetRequest orderInstructionSetRequestInstance = new OrderInstructionSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
