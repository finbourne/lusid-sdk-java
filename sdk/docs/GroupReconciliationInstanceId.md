# com.finbourne.lusid.model.GroupReconciliationInstanceId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceIdType** | **String** | Type of the reconciliation run, manual or automatic (via the workflow). \&quot;Manual\&quot; | \&quot;WorkflowServiceTaskId\&quot; | [default to String]
**instanceIdValue** | **String** | Reconciliation run identifier: a manually-provided key or taskId. | [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationInstanceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstanceIdType = "example InstanceIdType";
String InstanceIdValue = "example InstanceIdValue";


GroupReconciliationInstanceId groupReconciliationInstanceIdInstance = new GroupReconciliationInstanceId()
    .InstanceIdType(InstanceIdType)
    .InstanceIdValue(InstanceIdValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
