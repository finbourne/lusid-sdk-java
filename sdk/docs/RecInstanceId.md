# com.finbourne.lusid.model.RecInstanceId
Identifies a rec instance, and how it was created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceIdType** | **String** | How the instance was created. Available values: WorkflowServiceTaskId, Manual. | [default to String]
**instanceIdValue** | **String** | The instance identifier value (a GUID). | [default to String]

```java
import com.finbourne.lusid.model.RecInstanceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstanceIdType = "example InstanceIdType";
String InstanceIdValue = "example InstanceIdValue";


RecInstanceId recInstanceIdInstance = new RecInstanceId()
    .InstanceIdType(InstanceIdType)
    .InstanceIdValue(InstanceIdValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
