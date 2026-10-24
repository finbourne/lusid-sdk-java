# com.finbourne.lusid.model.ExternalRecDefinitionDetails
A definition reconciling relational data on both sides, driven by a single External matching ruleset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftFilter** | **String** | Optional filter over the left dataset&#39;s rows, in the dataset&#39;s own grammar, e.g. \&quot;Values[custodian] eq &#39;something&#39;\&quot;. | [optional] [default to String]
**rightFilter** | **String** | Optional filter over the right dataset&#39;s rows, in the dataset&#39;s own grammar. | [optional] [default to String]
**definitionType** | **String** | What this definition reconciles, and so which shape of details it carries. Available values: PortfolioContents, LusidEntity, External. | [default to String]

```java
import com.finbourne.lusid.model.ExternalRecDefinitionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId MatchingRulesetId = new ResourceId();
@jakarta.annotation.Nullable String LeftFilter = "example LeftFilter";
@jakarta.annotation.Nullable String RightFilter = "example RightFilter";
String DefinitionType = "example DefinitionType";


ExternalRecDefinitionDetails externalRecDefinitionDetailsInstance = new ExternalRecDefinitionDetails()
    .MatchingRulesetId(MatchingRulesetId)
    .LeftFilter(LeftFilter)
    .RightFilter(RightFilter)
    .DefinitionType(DefinitionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
