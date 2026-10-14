# com.finbourne.lusid.model.ProcessingGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group. | [default to String]
**displayName** | **String** | The name of the Processing Group. | [default to String]
**description** | **String** | A description for the Processing Group. | [optional] [default to String]
**schedule** | [**ProcessingGroupSchedule**](ProcessingGroupSchedule.md) |  | [default to ProcessingGroupSchedule]
**referenceListId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**listExceptionFilter** | **String** | A filter selecting reference list items to exclude whenever this Processing Group resolves its reference list. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ProcessingGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ProcessingGroupSchedule Schedule = new ProcessingGroupSchedule();
ResourceId ReferenceListId = new ResourceId();
ResourceId WorkflowId = new ResourceId();
@jakarta.annotation.Nullable String ListExceptionFilter = "example ListExceptionFilter";


ProcessingGroupRequest processingGroupRequestInstance = new ProcessingGroupRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Schedule(Schedule)
    .ReferenceListId(ReferenceListId)
    .WorkflowId(WorkflowId)
    .ListExceptionFilter(ListExceptionFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
