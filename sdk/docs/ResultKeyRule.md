

# ResultKeyRule

Base class for representing result key rules in LUSID, which describe how to resolve (unit) result data. This base class should not be directly instantiated; each supported ResultKeyRuleType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultKeyRuleType** | [**ResultKeyRuleTypeEnum**](#ResultKeyRuleTypeEnum) | The available values are: Invalid, ResultDataKeyRule, PortfolioResultDataKeyRule |  |



## Enum: ResultKeyRuleTypeEnum

| Name | Value |
|---- | -----|
| INVALID | &quot;Invalid&quot; |
| RESULTDATAKEYRULE | &quot;ResultDataKeyRule&quot; |
| PORTFOLIORESULTDATAKEYRULE | &quot;PortfolioResultDataKeyRule&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


