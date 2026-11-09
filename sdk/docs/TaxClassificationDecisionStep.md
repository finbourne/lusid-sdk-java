# com.finbourne.lusid.model.TaxClassificationDecisionStep
One question the decision tree asked on the way to the leaf.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | **Integer** | The position of the step in the decision trace, starting at 1. | [default to Integer]
**rule** | **String** | The decision-tree rule the step evaluated. | [default to String]
**question** | **String** | The question the rule asked of the inputs. | [default to String]
**answer** | **String** | The answer the rule took. | [default to String]

```java
import com.finbourne.lusid.model.TaxClassificationDecisionStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Order = new Integer("100.00");
String Rule = "example Rule";
String Question = "example Question";
String Answer = "example Answer";


TaxClassificationDecisionStep taxClassificationDecisionStepInstance = new TaxClassificationDecisionStep()
    .Order(Order)
    .Rule(Rule)
    .Question(Question)
    .Answer(Answer);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
