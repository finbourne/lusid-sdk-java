# com.finbourne.lusid.model.WorkspaceItemCreationRequest
A request to create an item in a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**name** | **String** | A workspace item&#39;s name. | [default to String]
**group** | **String** | The group containing a workspace item. | [default to String]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**type** | **String** | The type of the workspace item. | [default to String]

```java
import com.finbourne.lusid.model.WorkspaceItemCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Format = new Integer("100.00");
String Name = "example Name";
String Group = "example Group";
String Description = "example Description";
@jakarta.annotation.Nullable Object String Type = "example Type";


WorkspaceItemCreationRequest workspaceItemCreationRequestInstance = new WorkspaceItemCreationRequest()
    .Format(Format)
    .Name(Name)
    .Group(Group)
    .Description(Description)
    .Content(Content)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
