# com.finbourne.lusid.model.CreateGroupReconciliationDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** | The name of the Group Reconciliation Definition | [default to String]
**description** | **String** | The description of the Group Reconciliation Definition | [optional] [default to String]
**portfolioEntityIds** | [**GroupReconciliationDefinitionPortfolioEntityIds**](GroupReconciliationDefinitionPortfolioEntityIds.md) |  | [default to GroupReconciliationDefinitionPortfolioEntityIds]
**recipeIds** | [**GroupReconciliationDefinitionRecipeIds**](GroupReconciliationDefinitionRecipeIds.md) |  | [optional] [default to GroupReconciliationDefinitionRecipeIds]
**currencies** | [**GroupReconciliationDefinitionCurrencies**](GroupReconciliationDefinitionCurrencies.md) |  | [optional] [default to GroupReconciliationDefinitionCurrencies]
**transactionDateWindows** | [**TransactionDateWindows**](TransactionDateWindows.md) |  | [optional] [default to TransactionDateWindows]
**comparisonRulesetIds** | [**GroupReconciliationDefinitionComparisonRulesetIds**](GroupReconciliationDefinitionComparisonRulesetIds.md) |  | [optional] [default to GroupReconciliationDefinitionComparisonRulesetIds]
**breakCodeSource** | [**BreakCodeSource**](BreakCodeSource.md) |  | [optional] [default to BreakCodeSource]
**primarySchedule** | [**PrimarySchedule**](PrimarySchedule.md) |  | [optional] [default to PrimarySchedule]

```java
import com.finbourne.lusid.model.CreateGroupReconciliationDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
GroupReconciliationDefinitionPortfolioEntityIds PortfolioEntityIds = new GroupReconciliationDefinitionPortfolioEntityIds();
GroupReconciliationDefinitionRecipeIds RecipeIds = new GroupReconciliationDefinitionRecipeIds();
GroupReconciliationDefinitionCurrencies Currencies = new GroupReconciliationDefinitionCurrencies();
TransactionDateWindows TransactionDateWindows = new TransactionDateWindows();
GroupReconciliationDefinitionComparisonRulesetIds ComparisonRulesetIds = new GroupReconciliationDefinitionComparisonRulesetIds();
BreakCodeSource BreakCodeSource = new BreakCodeSource();
PrimarySchedule PrimarySchedule = new PrimarySchedule();


CreateGroupReconciliationDefinitionRequest createGroupReconciliationDefinitionRequestInstance = new CreateGroupReconciliationDefinitionRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .PortfolioEntityIds(PortfolioEntityIds)
    .RecipeIds(RecipeIds)
    .Currencies(Currencies)
    .TransactionDateWindows(TransactionDateWindows)
    .ComparisonRulesetIds(ComparisonRulesetIds)
    .BreakCodeSource(BreakCodeSource)
    .PrimarySchedule(PrimarySchedule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
