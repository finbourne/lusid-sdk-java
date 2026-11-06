# com.finbourne.lusid.model.RunComplianceV3Request
A request to run one or more V3 compliance rules against a portfolio group, valuing holdings with the  supplied recipe. The pre-trade variant additionally includes the group's live order flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**evaluationMode** | **String** | Available values: PerPortfolio, GroupTotal. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RunComplianceV3Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> RuleIds = new List<ResourceId>();
ResourceId PortfolioGroupId = new ResourceId();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String EvaluationMode = "example EvaluationMode";


RunComplianceV3Request runComplianceV3RequestInstance = new RunComplianceV3Request()
    .RuleIds(RuleIds)
    .PortfolioGroupId(PortfolioGroupId)
    .RecipeId(RecipeId)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .EvaluationMode(EvaluationMode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
