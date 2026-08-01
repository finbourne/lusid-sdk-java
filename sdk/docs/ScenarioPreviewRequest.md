# com.finbourne.lusid.model.ScenarioPreviewRequest
Request to preview a scenario against a portfolio's market data without running a valuation: the  portfolio's market data dependencies are resolved and the scenario's shifts applied, and the  response reports which targets each shift changed (with values before and after) and which market  data was skipped. Supply either a reference to a stored scenario or inline shift definitions  (for previewing a definition before saving it), not both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The portfolios whose market data dependencies the scenario is previewed against. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date to resolve market data at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at time to resolve at. Defaults to the latest. | [optional] [default to OffsetDateTime]
**scenario** | [**ScenarioReference**](ScenarioReference.md) |  | [optional] [default to ScenarioReference]
**shifts** | [**List&lt;ScenarioShiftDefinition&gt;**](ScenarioShiftDefinition.md) | Inline shift definitions to preview without saving a scenario, e.g. to test what a definition  would match while authoring it. Mutually exclusive with supplying a stored scenario reference. | [optional] [default to List<ScenarioShiftDefinition>]

```java
import com.finbourne.lusid.model.ScenarioPreviewRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecipeId = new ResourceId();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
ScenarioReference Scenario = new ScenarioReference();
@jakarta.annotation.Nullable List<ScenarioShiftDefinition> Shifts = new List<ScenarioShiftDefinition>();


ScenarioPreviewRequest scenarioPreviewRequestInstance = new ScenarioPreviewRequest()
    .RecipeId(RecipeId)
    .PortfolioEntityIds(PortfolioEntityIds)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Scenario(Scenario)
    .Shifts(Shifts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
