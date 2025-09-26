# com.finbourne.lusid.model.ItemAndWorkspace
An item plus its containing workspace name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workspaceName** | **String** | A workspace&#39;s name. | [default to String]
**workspaceItem** | [**WorkspaceItem**](WorkspaceItem.md) |  | [default to WorkspaceItem]

```java
import com.finbourne.lusid.model.ItemAndWorkspace;
import java.util.*;
import java.lang.System;
import java.net.URI;

String WorkspaceName = "example WorkspaceName";
WorkspaceItem WorkspaceItem = new WorkspaceItem();


ItemAndWorkspace itemAndWorkspaceInstance = new ItemAndWorkspace()
    .WorkspaceName(WorkspaceName)
    .WorkspaceItem(WorkspaceItem);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
