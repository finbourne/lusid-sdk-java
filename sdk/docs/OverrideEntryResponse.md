# com.finbourne.lusid.model.OverrideEntryResponse
A single overrides entry on a virtual transaction override record: the replacement transaction(s) that  stand in for the overridden virtual transaction, plus its status and diagnostics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replacements** | [**List&lt;OverrideDefinitionResponse&gt;**](OverrideDefinitionResponse.md) | The replacement transactions that stand in for the overridden virtual transaction. | [optional] [default to List<OverrideDefinitionResponse>]
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.lusid.model.OverrideEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<OverrideDefinitionResponse> Replacements = new List<OverrideDefinitionResponse>();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String VirtualTransactionId = "example VirtualTransactionId";


OverrideEntryResponse overrideEntryResponseInstance = new OverrideEntryResponse()
    .Replacements(Replacements)
    .Status(Status)
    .VirtualTransactionId(VirtualTransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
