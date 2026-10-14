# com.finbourne.lusid.model.ProcessingGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Processing Group. | [optional] [default to String]
**description** | **String** | A description for the Processing Group. | [optional] [default to String]
**schedule** | [**ProcessingGroupSchedule**](ProcessingGroupSchedule.md) |  | [optional] [default to ProcessingGroupSchedule]
**referenceListId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**resolvedReferenceList** | [**ReferenceList**](ReferenceList.md) |  | [optional] [default to ReferenceList]
**listExceptionFilter** | **String** | A filter selecting reference list items to exclude whenever this Processing Group resolves its reference list. Optional. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ProcessingGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ProcessingGroupSchedule Schedule = new ProcessingGroupSchedule();
ResourceId ReferenceListId = new ResourceId();
ResourceId WorkflowId = new ResourceId();
ReferenceList ResolvedReferenceList = new ReferenceList();
@jakarta.annotation.Nullable String ListExceptionFilter = "example ListExceptionFilter";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ProcessingGroup processingGroupInstance = new ProcessingGroup()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Schedule(Schedule)
    .ReferenceListId(ReferenceListId)
    .WorkflowId(WorkflowId)
    .ResolvedReferenceList(ResolvedReferenceList)
    .ListExceptionFilter(ListExceptionFilter)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
