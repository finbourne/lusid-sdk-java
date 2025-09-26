# com.finbourne.lusid.model.ReferenceListResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The name of the reference list. | [default to String]
**description** | **String** | The description of the reference list. | [optional] [default to String]
**tags** | **List&lt;String&gt;** | The tags associated with the reference list. | [optional] [default to List<String>]
**referenceList** | [**ReferenceList**](ReferenceList.md) |  | [default to ReferenceList]
**version** | [**Version**](Version.md) |  | [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ReferenceListResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Tags = new List<String>();
ReferenceList ReferenceList = new ReferenceList();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ReferenceListResponse referenceListResponseInstance = new ReferenceListResponse()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Tags(Tags)
    .ReferenceList(ReferenceList)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
