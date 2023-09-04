

# ReconciliationRule

Base class for representing reconciliation rules in LUSID.  Reconciliation rules describe how a comparison between two items in the reconciliation should be performed and what constitutes equality.  This does not influence WHAT constitutes a match, but only whether once a line has been matched whether an item within it matches another item.  If a rule is not given for an item, it will default to equality comparison.  This base class should not be directly instantiated; each supported ReconciliationRuleType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The available values are: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact |  |



## Enum: RuleTypeEnum

| Name | Value |
|---- | -----|
| RECONCILENUMERICRULE | &quot;ReconcileNumericRule&quot; |
| RECONCILEDATETIMERULE | &quot;ReconcileDateTimeRule&quot; |
| RECONCILESTRINGRULE | &quot;ReconcileStringRule&quot; |
| RECONCILEEXACT | &quot;ReconcileExact&quot; |



