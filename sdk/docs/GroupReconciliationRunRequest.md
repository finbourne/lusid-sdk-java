# com.finbourne.lusid.model.GroupReconciliationRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | Reconciliation run Id. Consists of run type (manual or workflow) and identifier. | [default to String]
**datesToReconcile** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [optional] [default to GroupReconciliationDates]

```java
import com.finbourne.lusid.model.GroupReconciliationRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstanceId = "example InstanceId";
GroupReconciliationDates DatesToReconcile = new GroupReconciliationDates();


GroupReconciliationRunRequest groupReconciliationRunRequestInstance = new GroupReconciliationRunRequest()
    .InstanceId(InstanceId)
    .DatesToReconcile(DatesToReconcile);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
