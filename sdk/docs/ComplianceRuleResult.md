# com.finbourne.lusid.model.ComplianceRuleResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The unique identifierof a compliance rule | [default to String]
**ruleName** | **String** | The User-given name of the rule | [default to String]
**ruleDescription** | **String** | The User-given description of the rule | [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**passed** | **Boolean** | The result of an individual compliance run, true if passed | [default to Boolean]
**resultValue** | **java.math.BigDecimal** | The calculation result that was used to confirm a pass/fail | [default to java.math.BigDecimal]
**ruleInformationMatch** | **String** | The value matched by the rule | [default to String]
**ruleInformationKey** | **String** | The property key matched by the rule | [default to String]
**ruleLowerLimit** | **java.math.BigDecimal** | The lower limit of the rule | [default to java.math.BigDecimal]
**ruleUpperLimit** | **java.math.BigDecimal** | The upper limit of the rule | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ComplianceRuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
String RuleName = "example RuleName";
String RuleDescription = "example RuleDescription";
ResourceId Portfolio = new ResourceId();
Boolean Passed = true;
java.math.BigDecimal ResultValue = new java.math.BigDecimal("100.00");
String RuleInformationMatch = "example RuleInformationMatch";
String RuleInformationKey = "example RuleInformationKey";
java.math.BigDecimal RuleLowerLimit = new java.math.BigDecimal("100.00");
java.math.BigDecimal RuleUpperLimit = new java.math.BigDecimal("100.00");


ComplianceRuleResult complianceRuleResultInstance = new ComplianceRuleResult()
    .RuleId(RuleId)
    .RuleName(RuleName)
    .RuleDescription(RuleDescription)
    .Portfolio(Portfolio)
    .Passed(Passed)
    .ResultValue(ResultValue)
    .RuleInformationMatch(RuleInformationMatch)
    .RuleInformationKey(RuleInformationKey)
    .RuleLowerLimit(RuleLowerLimit)
    .RuleUpperLimit(RuleUpperLimit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
