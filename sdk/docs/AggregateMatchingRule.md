# com.finbourne.lusid.model.AggregateMatchingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The reference name of the rule. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**leftOperation** | **String** | Group-level operation applied to the left side&#39;s per-item values during reconciliation, e.g. Sum, Average, Count. Available values: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]
**rightOperation** | **String** | Group-level operation applied to the right side&#39;s per-item values during reconciliation, e.g. Sum, Average, Count. Available values: Sum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]

```java
import com.finbourne.lusid.model.AggregateMatchingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleName = "example RuleName";
String LeftFormula = "example LeftFormula";
String LeftOperation = "example LeftOperation";
String RightFormula = "example RightFormula";
String RightOperation = "example RightOperation";


AggregateMatchingRule aggregateMatchingRuleInstance = new AggregateMatchingRule()
    .RuleName(RuleName)
    .LeftFormula(LeftFormula)
    .LeftOperation(LeftOperation)
    .RightFormula(RightFormula)
    .RightOperation(RightOperation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
