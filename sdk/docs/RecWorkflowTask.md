# com.finbourne.lusid.model.RecWorkflowTask
The workflow service task that instantiated a rec instance.  Minimal placeholder until the full workflow service task DTO is available.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the workflow service task. | [optional] [default to String]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**state** | **String** | The current state of the workflow service task. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecWorkflowTask;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable String State = "example State";


RecWorkflowTask recWorkflowTaskInstance = new RecWorkflowTask()
    .Id(Id)
    .TaskDefinitionId(TaskDefinitionId)
    .State(State);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
