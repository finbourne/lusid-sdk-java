# com.finbourne.lusid.model.ReferenceListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The name of the reference list. | [default to String]
**description** | **String** | The description of the reference list. | [optional] [default to String]
**tags** | **List&lt;String&gt;** | The tags associated with the reference list. | [optional] [default to List<String>]
**referenceList** | [**ReferenceList**](ReferenceList.md) |  | [default to ReferenceList]

```java
import com.finbourne.lusid.model.ReferenceListRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> Tags = new List<String>();
ReferenceList ReferenceList = new ReferenceList();


ReferenceListRequest referenceListRequestInstance = new ReferenceListRequest()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Tags(Tags)
    .ReferenceList(ReferenceList);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
