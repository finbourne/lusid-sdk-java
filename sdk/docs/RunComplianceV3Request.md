# com.finbourne.lusid.model.RunComplianceV3Request
A request to run one or more V3 compliance rules against one or more individual portfolios, valuing  holdings with the supplied recipe. Each portfolio is evaluated on its own. The pre-trade variant  additionally includes each portfolio's live order flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**portfolioIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RunComplianceV3Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> RuleIds = new List<ResourceId>();
List<ResourceId> PortfolioIds = new List<ResourceId>();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


RunComplianceV3Request runComplianceV3RequestInstance = new RunComplianceV3Request()
    .RuleIds(RuleIds)
    .PortfolioIds(PortfolioIds)
    .RecipeId(RecipeId)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
