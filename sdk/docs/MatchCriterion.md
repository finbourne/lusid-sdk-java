# com.finbourne.lusid.model.MatchCriterion
A condition to be evaluated.  Each supported CriterionType has a corresponding schema.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionType** | **String** | The available values are: PropertyValueEquals, PropertyValueIn, SubHoldingKeyValueEquals | [default to String]

```java
import com.finbourne.lusid.model.MatchCriterion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CriterionType = "example CriterionType";


MatchCriterion matchCriterionInstance = new MatchCriterion()
    .CriterionType(CriterionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
