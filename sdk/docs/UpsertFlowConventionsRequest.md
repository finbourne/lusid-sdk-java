# com.finbourne.lusid.model.UpsertFlowConventionsRequest
Flow conventions that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]

```java
import com.finbourne.lusid.model.UpsertFlowConventionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions FlowConventions = new FlowConventions();


UpsertFlowConventionsRequest upsertFlowConventionsRequestInstance = new UpsertFlowConventionsRequest()
    .FlowConventions(FlowConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
