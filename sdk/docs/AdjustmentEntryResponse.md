# com.finbourne.lusid.model.AdjustmentEntryResponse
A single adjustments entry on a virtual transaction override record: the fields it changes and its status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjustment** | [**AdjustmentDefinitionResponse**](AdjustmentDefinitionResponse.md) |  | [optional] [default to AdjustmentDefinitionResponse]
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AdjustmentEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

AdjustmentDefinitionResponse Adjustment = new AdjustmentDefinitionResponse();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String VirtualTransactionId = "example VirtualTransactionId";


AdjustmentEntryResponse adjustmentEntryResponseInstance = new AdjustmentEntryResponse()
    .Adjustment(Adjustment)
    .Status(Status)
    .VirtualTransactionId(VirtualTransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
