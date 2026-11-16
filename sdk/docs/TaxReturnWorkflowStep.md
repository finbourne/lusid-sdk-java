# com.finbourne.lusid.model.TaxReturnWorkflowStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The workflow status of the return. Available values: Draft, Prepared, Reviewed, SignedOff, Final. Available values: Draft, Prepared, Reviewed, SignedOff, Final. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the workflow step was recorded. | [optional] [default to OffsetDateTime]
**reason** | **String** | The reason given when the return was advanced or sent back. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxReturnWorkflowStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Status = "example Status";
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Reason = "example Reason";


TaxReturnWorkflowStep taxReturnWorkflowStepInstance = new TaxReturnWorkflowStep()
    .Status(Status)
    .AsAt(AsAt)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
