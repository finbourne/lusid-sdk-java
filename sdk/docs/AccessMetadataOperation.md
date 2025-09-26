# com.finbourne.lusid.model.AccessMetadataOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md) |  | [default to List<AccessMetadataValue>]
**path** | **String** |  | [default to String]
**op** | **String** | The available values are: add, remove | [default to String]
**from** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.AccessMetadataOperation;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AccessMetadataValue> Value = new List<AccessMetadataValue>();
String Path = "example Path";
String Op = "example Op";
@jakarta.annotation.Nullable String From = "example From";


AccessMetadataOperation accessMetadataOperationInstance = new AccessMetadataOperation()
    .Value(Value)
    .Path(Path)
    .Op(Op)
    .From(From);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
