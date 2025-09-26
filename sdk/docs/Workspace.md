# com.finbourne.lusid.model.Workspace
A workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A workspace&#39;s name. | [default to String]
**description** | **String** | A friendly description for the workspace. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Workspace;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Description = "example Description";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Workspace workspaceInstance = new Workspace()
    .Name(Name)
    .Description(Description)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
