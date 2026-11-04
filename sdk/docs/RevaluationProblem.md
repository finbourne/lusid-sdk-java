# com.finbourne.lusid.model.RevaluationProblem
A reason why a revaluation amount could not be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | A machine-readable code identifying the type of problem (e.g. MissingFxRate, MissingBookedFxRate). | [optional] [default to String]
**message** | **String** | A human-readable description of why the revaluation amount could not be populated. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RevaluationProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Message = "example Message";


RevaluationProblem revaluationProblemInstance = new RevaluationProblem()
    .Code(Code)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
