# com.finbourne.lusid.model.RecExecution
The execution outcome for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outcome** | **String** | The execution outcome. Available values: Succeeded, Failed. | [default to String]
**errorDetail** | **String** | Detail of the execution failure. Populated when outcome is Failed. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecExecution;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Outcome = "example Outcome";
@jakarta.annotation.Nullable String ErrorDetail = "example ErrorDetail";


RecExecution recExecutionInstance = new RecExecution()
    .Outcome(Outcome)
    .ErrorDetail(ErrorDetail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
