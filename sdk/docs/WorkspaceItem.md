# com.finbourne.lusid.model.WorkspaceItem
An item stored in a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the workspace item. | [default to String]
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**name** | **String** | A workspace item&#39;s name. | [default to String]
**group** | **String** | The group containing a workspace item. | [default to String]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.WorkspaceItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
Integer Format = new Integer("100.00");
String Name = "example Name";
String Group = "example Group";
String Description = "example Description";
@jakarta.annotation.Nullable Object Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


WorkspaceItem workspaceItemInstance = new WorkspaceItem()
    .Type(Type)
    .Format(Format)
    .Name(Name)
    .Group(Group)
    .Description(Description)
    .Content(Content)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
