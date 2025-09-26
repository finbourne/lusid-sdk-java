# com.finbourne.lusid.model.WorkspaceItemUpdateRequest
A request to update a workspace item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **Integer** | A simple integer format identifier. | [default to Integer]
**description** | **String** | The description of a workspace item. | [default to String]
**content** | **Object** | The content associated with a workspace item. | [default to Object]
**type** | **String** | The type of the workspace item. | [default to String]

```java
import com.finbourne.lusid.model.WorkspaceItemUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Format = new Integer("100.00");
String Description = "example Description";
@jakarta.annotation.Nullable Object String Type = "example Type";


WorkspaceItemUpdateRequest workspaceItemUpdateRequestInstance = new WorkspaceItemUpdateRequest()
    .Format(Format)
    .Description(Description)
    .Content(Content)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
