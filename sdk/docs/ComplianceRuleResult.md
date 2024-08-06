

# ComplianceRuleResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **String** | The unique identifierof a compliance rule |  |
|**ruleName** | **String** | The User-given name of the rule |  |
|**ruleDescription** | **String** | The User-given description of the rule |  |
|**portfolio** | [**ResourceId**](ResourceId.md) |  |  |
|**passed** | **Boolean** | The result of an individual compliance run, true if passed |  |
|**resultValue** | **java.math.BigDecimal** | The calculation result that was used to confirm a pass/fail |  |
|**ruleInformationMatch** | **String** | The value matched by the rule |  |
|**ruleInformationKey** | **String** | The property key matched by the rule |  |
|**ruleLowerLimit** | **java.math.BigDecimal** | The lower limit of the rule |  |
|**ruleUpperLimit** | **java.math.BigDecimal** | The upper limit of the rule |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


