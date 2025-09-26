# com.finbourne.lusid.model.ReconciliationRule
Base class for representing reconciliation rules in LUSID.  Reconciliation rules describe how a comparison between two items in the reconciliation should be performed and what constitutes equality.  This does not influence WHAT constitutes a match, but only whether once a line has been matched whether an item within it matches another item.  If a rule is not given for an item, it will default to equality comparison.  This base class should not be directly instantiated; each supported ReconciliationRuleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleType** | **String** | The available values are: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact | [default to String]

```java
import com.finbourne.lusid.model.ReconciliationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleType = "example RuleType";


ReconciliationRule reconciliationRuleInstance = new ReconciliationRule()
    .RuleType(RuleType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
