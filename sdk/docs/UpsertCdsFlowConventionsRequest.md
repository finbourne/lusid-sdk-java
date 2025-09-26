# com.finbourne.lusid.model.UpsertCdsFlowConventionsRequest
CDS Flow convention that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdsFlowConventions** | [**CdsFlowConventions**](CdsFlowConventions.md) |  | [optional] [default to CdsFlowConventions]

```java
import com.finbourne.lusid.model.UpsertCdsFlowConventionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CdsFlowConventions CdsFlowConventions = new CdsFlowConventions();


UpsertCdsFlowConventionsRequest upsertCdsFlowConventionsRequestInstance = new UpsertCdsFlowConventionsRequest()
    .CdsFlowConventions(CdsFlowConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
