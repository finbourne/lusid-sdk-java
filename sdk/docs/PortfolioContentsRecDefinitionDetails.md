# com.finbourne.lusid.model.PortfolioContentsRecDefinitionDetails
A definition reconciling the contents of LUSID portfolios on at least one side, with a relational dataset  permitted on the other.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the left side. Empty when the left side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**rightPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the right side. Empty when the right side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**valuationRecipes** | [**RecDefRecipeIds**](RecDefRecipeIds.md) |  | [optional] [default to RecDefRecipeIds]
**currencies** | [**RecDefCurrencies**](RecDefCurrencies.md) |  | [optional] [default to RecDefCurrencies]
**rulesets** | [**List&lt;RecDefRuleset&gt;**](RecDefRuleset.md) | The types of reconciliation included in the group, each naming the matching ruleset that drives it. At least one entry is required, and each rec type may appear at most once. | [default to List<RecDefRuleset>]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.lusid.model.PortfolioContentsRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecDefSource> LeftPortfolioSources = new List<RecDefSource>();
List<RecDefSource> RightPortfolioSources = new List<RecDefSource>();
RecDefRecipeIds ValuationRecipes = new RecDefRecipeIds();
RecDefCurrencies Currencies = new RecDefCurrencies();
List<RecDefRuleset> Rulesets = new List<RecDefRuleset>();
String DefinitionType = "example DefinitionType";


PortfolioContentsRecDefinitionDetails portfolioContentsRecDefinitionDetailsInstance = new PortfolioContentsRecDefinitionDetails()
    .LeftPortfolioSources(LeftPortfolioSources)
    .RightPortfolioSources(RightPortfolioSources)
    .ValuationRecipes(ValuationRecipes)
    .Currencies(Currencies)
    .Rulesets(Rulesets)
    .DefinitionType(DefinitionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
