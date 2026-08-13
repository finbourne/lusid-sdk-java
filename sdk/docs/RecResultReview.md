# com.finbourne.lusid.model.RecResultReview
The per-result review axis: the workflow state and the recorded review decision. Always present,  including on Match and Cross.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The review workflow state: NotRequired, Required or Reviewed. Available values: NotRequired, Required, Reviewed. | [default to String]
**decision** | **String** | The recorded review decision. Null until a decision is made. Available values: Acknowledge, FixAtSource, FixAsGroup, Accept, ForceMatch, Tolerate. | [optional] [default to String]
**decisionGroup** | [**RecResultDecisionGroup**](RecResultDecisionGroup.md) |  | [optional] [default to RecResultDecisionGroup]

```java
import com.finbourne.lusid.model.RecResultReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
@jakarta.annotation.Nullable String Decision = "example Decision";
RecResultDecisionGroup DecisionGroup = new RecResultDecisionGroup();


RecResultReview recResultReviewInstance = new RecResultReview()
    .Status(Status)
    .Decision(Decision)
    .DecisionGroup(DecisionGroup);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
