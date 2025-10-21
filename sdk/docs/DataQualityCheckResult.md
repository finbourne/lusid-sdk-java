# com.finbourne.lusid.model.DataQualityCheckResult
Represents the result of a data quality check operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkDefinitionScope** | **String** | The scope of the check definition | [optional] [default to String]
**checkDefinitionCode** | **String** | The code of the check definition | [optional] [default to String]
**checkDefinitionDisplayName** | **String** | The display name of the check definition | [optional] [default to String]
**checkRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the check was run | [optional] [default to OffsetDateTime]
**resultType** | **String** | The type of result from the check | [optional] [default to String]
**ruleSetKey** | **String** | The key identifying the ruleset | [optional] [default to String]
**ruleSetDisplayName** | **String** | The display name of the ruleset | [optional] [default to String]
**ruleKey** | **String** | The key identifying the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleDisplayName** | **String** | The display name of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleDescription** | **String** | The description of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleFormula** | **String** | The formula of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**severity** | **Integer** | The severity level | [optional] [default to Integer]
**lusidEntity** | [**LusidEntityResult**](LusidEntityResult.md) |  | [optional] [default to LusidEntityResult]
**countRuleBreaches** | **Integer** | The count of rule breaches (1 for RuleBreached, multiple for RuleBreachesOverLimit) | [optional] [default to Integer]
**errorDetail** | **String** | Error details (for RulesetInvalid, RuleInvalid) | [optional] [default to String]
**resultId** | **String** | Unique identifier for the result in format: {{GUID of Check Definition}}-{{resultType}}-{{rulesetKey}}-{{ruleKey}}-{{entity GUID}} | [optional] [default to String]

```java
import com.finbourne.lusid.model.DataQualityCheckResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CheckDefinitionScope = "example CheckDefinitionScope";
@jakarta.annotation.Nullable String CheckDefinitionCode = "example CheckDefinitionCode";
@jakarta.annotation.Nullable String CheckDefinitionDisplayName = "example CheckDefinitionDisplayName";
OffsetDateTime CheckRunAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String ResultType = "example ResultType";
@jakarta.annotation.Nullable String RuleSetKey = "example RuleSetKey";
@jakarta.annotation.Nullable String RuleSetDisplayName = "example RuleSetDisplayName";
@jakarta.annotation.Nullable String RuleKey = "example RuleKey";
@jakarta.annotation.Nullable String RuleDisplayName = "example RuleDisplayName";
@jakarta.annotation.Nullable String RuleDescription = "example RuleDescription";
@jakarta.annotation.Nullable String RuleFormula = "example RuleFormula";
@jakarta.annotation.Nullable Integer Severity = new Integer("100.00");
LusidEntityResult LusidEntity = new LusidEntityResult();
@jakarta.annotation.Nullable Integer CountRuleBreaches = new Integer("100.00");
@jakarta.annotation.Nullable String ErrorDetail = "example ErrorDetail";
@jakarta.annotation.Nullable String ResultId = "example ResultId";


DataQualityCheckResult dataQualityCheckResultInstance = new DataQualityCheckResult()
    .CheckDefinitionScope(CheckDefinitionScope)
    .CheckDefinitionCode(CheckDefinitionCode)
    .CheckDefinitionDisplayName(CheckDefinitionDisplayName)
    .CheckRunAsAt(CheckRunAsAt)
    .ResultType(ResultType)
    .RuleSetKey(RuleSetKey)
    .RuleSetDisplayName(RuleSetDisplayName)
    .RuleKey(RuleKey)
    .RuleDisplayName(RuleDisplayName)
    .RuleDescription(RuleDescription)
    .RuleFormula(RuleFormula)
    .Severity(Severity)
    .LusidEntity(LusidEntity)
    .CountRuleBreaches(CountRuleBreaches)
    .ErrorDetail(ErrorDetail)
    .ResultId(ResultId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
