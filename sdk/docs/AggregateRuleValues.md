# com.finbourne.lusid.model.AggregateRuleValues
An aggregate matching rule and its values. The difference is the measured magnitude compared against  any applied tolerance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The name of the rule. | [default to String]
**leftValue** | **String** | The left-side value. | [optional] [default to String]
**rightValue** | **String** | The right-side value. | [optional] [default to String]
**difference** | **String** | The measured magnitude of the difference, ToString(ABS(leftValue - rightValue)). | [default to String]
**appliedTolerance** | [**AggregateToleranceBase**](AggregateToleranceBase.md) |  | [optional] [default to AggregateToleranceBase]

```java
import com.finbourne.lusid.model.AggregateRuleValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleName = "example RuleName";
@jakarta.annotation.Nullable String LeftValue = "example LeftValue";
@jakarta.annotation.Nullable String RightValue = "example RightValue";
String Difference = "example Difference";
AggregateToleranceBase AppliedTolerance = new AggregateToleranceBase();


AggregateRuleValues aggregateRuleValuesInstance = new AggregateRuleValues()
    .RuleName(RuleName)
    .LeftValue(LeftValue)
    .RightValue(RightValue)
    .Difference(Difference)
    .AppliedTolerance(AppliedTolerance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
