# com.finbourne.lusid.model.ExecutionSetRequest
A request to create or update multiple Executions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;ExecutionRequest&gt;**](ExecutionRequest.md) | A collection of ExecutionRequests. | [optional] [default to List<ExecutionRequest>]

```java
import com.finbourne.lusid.model.ExecutionSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ExecutionRequest> Requests = new List<ExecutionRequest>();


ExecutionSetRequest executionSetRequestInstance = new ExecutionSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
