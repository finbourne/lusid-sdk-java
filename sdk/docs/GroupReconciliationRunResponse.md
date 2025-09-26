# com.finbourne.lusid.model.GroupReconciliationRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reconciliationSummaries** | [**List&lt;GroupReconciliationSummary&gt;**](GroupReconciliationSummary.md) | One summary record for each of the \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; reconciliations performed | [default to List<GroupReconciliationSummary>]

```java
import com.finbourne.lusid.model.GroupReconciliationRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<GroupReconciliationSummary> ReconciliationSummaries = new List<GroupReconciliationSummary>();


GroupReconciliationRunResponse groupReconciliationRunResponseInstance = new GroupReconciliationRunResponse()
    .ReconciliationSummaries(ReconciliationSummaries);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
