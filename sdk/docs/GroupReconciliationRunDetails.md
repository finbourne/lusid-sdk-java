# com.finbourne.lusid.model.GroupReconciliationRunDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionStatus** | **String** | Provides the reconciliation completion status \&quot;Completed\&quot; | \&quot;FailedToComplete\&quot; | [default to String]
**errorDetail** | **String** | Error information if the reconciliation failed to complete | [optional] [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationRunDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CompletionStatus = "example CompletionStatus";
@jakarta.annotation.Nullable String ErrorDetail = "example ErrorDetail";


GroupReconciliationRunDetails groupReconciliationRunDetailsInstance = new GroupReconciliationRunDetails()
    .CompletionStatus(CompletionStatus)
    .ErrorDetail(ErrorDetail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
