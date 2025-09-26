# com.finbourne.lusid.model.CorporateActionTransitionRequest
A 'transition' within a corporate action, representing a set of output movements paired to a single input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputTransition** | [**CorporateActionTransitionComponentRequest**](CorporateActionTransitionComponentRequest.md) |  | [optional] [default to CorporateActionTransitionComponentRequest]
**outputTransitions** | [**List&lt;CorporateActionTransitionComponentRequest&gt;**](CorporateActionTransitionComponentRequest.md) |  | [optional] [default to List<CorporateActionTransitionComponentRequest>]

```java
import com.finbourne.lusid.model.CorporateActionTransitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CorporateActionTransitionComponentRequest InputTransition = new CorporateActionTransitionComponentRequest();
@jakarta.annotation.Nullable List<CorporateActionTransitionComponentRequest> OutputTransitions = new List<CorporateActionTransitionComponentRequest>();


CorporateActionTransitionRequest corporateActionTransitionRequestInstance = new CorporateActionTransitionRequest()
    .InputTransition(InputTransition)
    .OutputTransitions(OutputTransitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
