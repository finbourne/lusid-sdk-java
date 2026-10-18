# com.finbourne.lusid.model.MarginCallReference
A pointer to a margin call in another run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the referenced call belongs to. | [default to String]
**callId** | **String** | The business key of the referenced call. | [default to String]

```java
import com.finbourne.lusid.model.MarginCallReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
String CallId = "example CallId";


MarginCallReference marginCallReferenceInstance = new MarginCallReference()
    .RunId(RunId)
    .CallId(CallId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
