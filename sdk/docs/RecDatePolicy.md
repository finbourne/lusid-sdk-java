# com.finbourne.lusid.model.RecDatePolicy
The date policy of a rec definition: how the effective dates of successive instances may progress, whether each  side reconciles at the latest knowledge or at a pinned asAt, and — for activity-based rec types — how the  activity window is bounded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAtProgression** | **String** | How the effective dates of successive instances may progress. Series (the default): each instance&#39;s leftEffectiveAt and rightEffectiveAt must be strictly after the previous instance&#39;s. Unconstrained: no relationship between instances. Immutable once the definition has instances. Available values: Series, Unconstrained. | [optional] [default to String]
**asAtPolicy** | [**RecAsAtPolicy**](RecAsAtPolicy.md) |  | [optional] [default to RecAsAtPolicy]
**activityWindow** | [**RecActivityWindow**](RecActivityWindow.md) |  | [optional] [default to RecActivityWindow]

```java
import com.finbourne.lusid.model.RecDatePolicy;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EffectiveAtProgression = "example EffectiveAtProgression";
RecAsAtPolicy AsAtPolicy = new RecAsAtPolicy();
RecActivityWindow ActivityWindow = new RecActivityWindow();


RecDatePolicy recDatePolicyInstance = new RecDatePolicy()
    .EffectiveAtProgression(EffectiveAtProgression)
    .AsAtPolicy(AsAtPolicy)
    .ActivityWindow(ActivityWindow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
