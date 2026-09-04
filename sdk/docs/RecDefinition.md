# com.finbourne.lusid.model.RecDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, naming the kind of dataset that must be present on at least one side. One of: PortfolioContents, LusidEntity, RelationalData. Only PortfolioContents is currently supported. Available values: PortfolioContents, LusidEntity, RelationalData. | [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**leftPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the left side. Empty when the left side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**rightPortfolioSources** | [**List&lt;RecDefSource&gt;**](RecDefSource.md) | The portfolios, portfolio groups and funds contributing to the right side. Empty when the right side draws on relational data instead, which requires every ruleset to declare relational data for that side. Both sides cannot be empty. | [default to List<RecDefSource>]
**valuationRecipes** | [**RecDefRecipeIds**](RecDefRecipeIds.md) |  | [optional] [default to RecDefRecipeIds]
**currencies** | [**RecDefCurrencies**](RecDefCurrencies.md) |  | [optional] [default to RecDefCurrencies]
**rulesets** | [**List&lt;RecDefRuleset&gt;**](RecDefRuleset.md) | The types of reconciliation included in the group, each naming the matching ruleset that drives it. At least one entry is required, and each rec type may appear at most once. | [default to List<RecDefRuleset>]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [default to RecReviewConfiguration]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RecDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String DefinitionType = "example DefinitionType";
RecDefSideNames SideNames = new RecDefSideNames();
List<RecDefSource> LeftPortfolioSources = new List<RecDefSource>();
List<RecDefSource> RightPortfolioSources = new List<RecDefSource>();
RecDefRecipeIds ValuationRecipes = new RecDefRecipeIds();
RecDefCurrencies Currencies = new RecDefCurrencies();
List<RecDefRuleset> Rulesets = new List<RecDefRuleset>();
RecReviewConfiguration ReviewConfiguration = new RecReviewConfiguration();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecDefinition recDefinitionInstance = new RecDefinition()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .DefinitionType(DefinitionType)
    .SideNames(SideNames)
    .LeftPortfolioSources(LeftPortfolioSources)
    .RightPortfolioSources(RightPortfolioSources)
    .ValuationRecipes(ValuationRecipes)
    .Currencies(Currencies)
    .Rulesets(Rulesets)
    .ReviewConfiguration(ReviewConfiguration)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
