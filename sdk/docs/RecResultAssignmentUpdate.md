# com.finbourne.lusid.model.RecResultAssignmentUpdate
An assignment update (assigned user or role) within a batch review item. Omitting the object leaves  the existing value untouched; a null value nullifies it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value to set, or null to nullify. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecResultAssignmentUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Value = "example Value";


RecResultAssignmentUpdate recResultAssignmentUpdateInstance = new RecResultAssignmentUpdate()
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
