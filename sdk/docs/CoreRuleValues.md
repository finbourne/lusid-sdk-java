# com.finbourne.lusid.model.CoreRuleValues
A core matching rule and the values that pin a rec result to its reconciled position. These values  contribute to the result id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The name of the rule. | [default to String]
**leftValue** | **String** | The left-side value. | [optional] [default to String]
**rightValue** | **String** | The right-side value. | [optional] [default to String]
**appliedTolerance** | [**CoreToleranceBase**](CoreToleranceBase.md) |  | [optional] [default to CoreToleranceBase]

```java
import com.finbourne.lusid.model.CoreRuleValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleName = "example RuleName";
@jakarta.annotation.Nullable String LeftValue = "example LeftValue";
@jakarta.annotation.Nullable String RightValue = "example RightValue";
CoreToleranceBase AppliedTolerance = new CoreToleranceBase();


CoreRuleValues coreRuleValuesInstance = new CoreRuleValues()
    .RuleName(RuleName)
    .LeftValue(LeftValue)
    .RightValue(RightValue)
    .AppliedTolerance(AppliedTolerance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
