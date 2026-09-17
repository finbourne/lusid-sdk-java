# com.finbourne.lusid.model.SuppressionEntryResponse
A single suppressions entry on a virtual transaction override record: the status of the suppression.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SuppressionEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String VirtualTransactionId = "example VirtualTransactionId";


SuppressionEntryResponse suppressionEntryResponseInstance = new SuppressionEntryResponse()
    .Status(Status)
    .VirtualTransactionId(VirtualTransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
