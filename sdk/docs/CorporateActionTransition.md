# com.finbourne.lusid.model.CorporateActionTransition
A 'transition' within a corporate action, representing a set of output movements paired to a single input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputTransition** | [**CorporateActionTransitionComponent**](CorporateActionTransitionComponent.md) |  | [optional] [default to CorporateActionTransitionComponent]
**outputTransitions** | [**List&lt;CorporateActionTransitionComponent&gt;**](CorporateActionTransitionComponent.md) | What will be generated relative to the input transition | [optional] [default to List<CorporateActionTransitionComponent>]

```java
import com.finbourne.lusid.model.CorporateActionTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

CorporateActionTransitionComponent InputTransition = new CorporateActionTransitionComponent();
@jakarta.annotation.Nullable List<CorporateActionTransitionComponent> OutputTransitions = new List<CorporateActionTransitionComponent>();


CorporateActionTransition corporateActionTransitionInstance = new CorporateActionTransition()
    .InputTransition(InputTransition)
    .OutputTransitions(OutputTransitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
