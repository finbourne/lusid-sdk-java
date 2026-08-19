# com.finbourne.lusid.model.CoreMatchingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The reference name of the rule. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]
**isCaseSensitive** | **Boolean** | Whether the core rule comparison is case sensitive. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CoreMatchingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleName = "example RuleName";
String LeftFormula = "example LeftFormula";
String RightFormula = "example RightFormula";
Boolean IsCaseSensitive = true;


CoreMatchingRule coreMatchingRuleInstance = new CoreMatchingRule()
    .RuleName(RuleName)
    .LeftFormula(LeftFormula)
    .RightFormula(RightFormula)
    .IsCaseSensitive(IsCaseSensitive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
