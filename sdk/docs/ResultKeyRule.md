

# ResultKeyRule

Base class for representing result key rules in LUSID, which describe how to resolve (unit) result data.  This base class should not be directly instantiated; each supported ResultKeyRuleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultKeyRuleType** | [**ResultKeyRuleTypeEnum**](#ResultKeyRuleTypeEnum) | The available values are: Invalid, ResultDataKeyRule, PortfolioResultDataKeyRule | 



## Enum: ResultKeyRuleTypeEnum

Name | Value
---- | -----
INVALID | &quot;Invalid&quot;
RESULTDATAKEYRULE | &quot;ResultDataKeyRule&quot;
PORTFOLIORESULTDATAKEYRULE | &quot;PortfolioResultDataKeyRule&quot;



