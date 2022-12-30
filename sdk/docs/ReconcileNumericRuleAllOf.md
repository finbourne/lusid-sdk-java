

# ReconcileNumericRuleAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisonType** | [**ComparisonTypeEnum**](#ComparisonTypeEnum) | The available values are: Exact, AbsoluteDifference, RelativeDifference | 
**tolerance** | **java.math.BigDecimal** | For a numeric type only (i.e. decimal, integer, date or datetime offset possibly controversially), this is the quantity used in the comparison.  The units of the tolerance must be set appropriately for the item being compared.  For a number such as a currency or amount that will be a simple quantity, for a DateTime or DateTimeOffset it should be days. If fewer than a single day then this should be  passed as a fraction. |  [optional]
**appliesTo** | [**AggregateSpec**](AggregateSpec.md) |  | 
**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The available values are: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact | 



## Enum: ComparisonTypeEnum

Name | Value
---- | -----
EXACT | &quot;Exact&quot;
ABSOLUTEDIFFERENCE | &quot;AbsoluteDifference&quot;
RELATIVEDIFFERENCE | &quot;RelativeDifference&quot;



## Enum: RuleTypeEnum

Name | Value
---- | -----
RECONCILENUMERICRULE | &quot;ReconcileNumericRule&quot;
RECONCILEDATETIMERULE | &quot;ReconcileDateTimeRule&quot;
RECONCILESTRINGRULE | &quot;ReconcileStringRule&quot;
RECONCILEEXACT | &quot;ReconcileExact&quot;



