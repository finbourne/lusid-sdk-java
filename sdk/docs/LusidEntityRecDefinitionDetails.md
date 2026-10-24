# com.finbourne.lusid.model.LusidEntityRecDefinitionDetails
A definition that reconciles one type of LUSID entity. A filter selects the population of each side, and a single  matching ruleset of that entity type drives the definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of LUSID entity to reconcile, which is also the rec type of the results. Supported types: Instrument. Must equal the reconciliationType of the matching ruleset. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity, External, Instrument. | [default to String]
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftFilter** | **String** | Optional filter that selects the population of the left side, e.g. \&quot;scope eq &#39;default&#39;\&quot;. It resolves against the left side entity fields. Null reads the whole population of the side. | [optional] [default to String]
**rightFilter** | **String** | Optional filter that selects the population of the right side. It resolves against the right side entity fields. Null reads the whole population of the side. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.lusid.model.LusidEntityRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
ResourceId MatchingRulesetId = new ResourceId();
@jakarta.annotation.Nullable String LeftFilter = "example LeftFilter";
@jakarta.annotation.Nullable String RightFilter = "example RightFilter";
String DefinitionType = "example DefinitionType";


LusidEntityRecDefinitionDetails lusidEntityRecDefinitionDetailsInstance = new LusidEntityRecDefinitionDetails()
    .EntityType(EntityType)
    .MatchingRulesetId(MatchingRulesetId)
    .LeftFilter(LeftFilter)
    .RightFilter(RightFilter)
    .DefinitionType(DefinitionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
