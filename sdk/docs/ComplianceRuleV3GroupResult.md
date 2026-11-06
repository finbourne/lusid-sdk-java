# com.finbourne.lusid.model.ComplianceRuleV3GroupResult
The result of one rule for a single evaluated group: its status, the group key identifying it, the  measured value, the unit the value and limits are expressed in, the limits it was checked against, the  portfolios and orders it affects, and, when it could not be assessed, the missing-data details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Available values: Passed, Failed, Warning, MissingData. | [optional] [default to String]
**groupKey** | **String** |  | [optional] [default to String]
**measuredValue** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**hardLimit** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**softLimit** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**unit** | **String** | Available values: Absolute, Percentage. | [optional] [default to String]
**affectedPortfolioIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**affectedOrderIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**missingDataDetails** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ComplianceRuleV3GroupResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String GroupKey = "example GroupKey";
@jakarta.annotation.Nullable java.math.BigDecimal MeasuredValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal HardLimit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SoftLimit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Unit = "example Unit";
@jakarta.annotation.Nullable List<String> AffectedPortfolioIds = new List<String>();
@jakarta.annotation.Nullable List<String> AffectedOrderIds = new List<String>();
@jakarta.annotation.Nullable List<String> MissingDataDetails = new List<String>();


ComplianceRuleV3GroupResult complianceRuleV3GroupResultInstance = new ComplianceRuleV3GroupResult()
    .Status(Status)
    .GroupKey(GroupKey)
    .MeasuredValue(MeasuredValue)
    .HardLimit(HardLimit)
    .SoftLimit(SoftLimit)
    .Unit(Unit)
    .AffectedPortfolioIds(AffectedPortfolioIds)
    .AffectedOrderIds(AffectedOrderIds)
    .MissingDataDetails(MissingDataDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
