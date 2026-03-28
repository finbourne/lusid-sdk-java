# com.finbourne.lusid.model.WorkspacePermittedItemActions
The workspace item actions a user is permitted to perform within a workspace.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readItem** | **Boolean** | Whether the user is permitted to read workspace items. | [optional] [default to Boolean]
**addItem** | **Boolean** | Whether the user is permitted to add workspace items. | [optional] [default to Boolean]
**updateItem** | **Boolean** | Whether the user is permitted to update workspace items. | [optional] [default to Boolean]
**deleteItem** | **Boolean** | Whether the user is permitted to delete workspace items. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.WorkspacePermittedItemActions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean ReadItem = true;
Boolean AddItem = true;
Boolean UpdateItem = true;
Boolean DeleteItem = true;


WorkspacePermittedItemActions workspacePermittedItemActionsInstance = new WorkspacePermittedItemActions()
    .ReadItem(ReadItem)
    .AddItem(AddItem)
    .UpdateItem(UpdateItem)
    .DeleteItem(DeleteItem);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
