# com.finbourne.lusid.model.WorkspaceCreationRequest
A request to create an empty workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A workspace&#39;s name. | [default to String]
**description** | **String** | A friendly description for the workspace. | [default to String]

```java
import com.finbourne.lusid.model.WorkspaceCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Description = "example Description";


WorkspaceCreationRequest workspaceCreationRequestInstance = new WorkspaceCreationRequest()
    .Name(Name)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
