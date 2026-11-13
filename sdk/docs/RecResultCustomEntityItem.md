# com.finbourne.lusid.model.RecResultCustomEntityItem
An item within a rec result for one custom entity: one entity on a side of a LusidEntity rec of a custom entity  type. The entity unique id identifies it. The item also holds the display name and the identifiers of the entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The custom entity type of the entity the run read. It starts with a tilde. | [default to String]
**entityUniqueId** | **String** | The unique id of the entity the run read. It identifies the entity across scopes. | [default to String]
**entityDisplayName** | **String** | The display name of the entity, as it stood at the dates the run read its side. | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The unique identifiers of the entity, keyed by identifier property key. The values are as at the dates the run read the side of the item, so they can differ from the current values. | [default to Map<String, String>]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction, SettlementActivity, RelationalDataPoint or the entity type of a LusidEntity rec. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, both transaction rec types produce Transaction items, and a relational dataset side produces RelationalDataPoint items whatever the rec type. A LusidEntity rec produces items of its entity type, for example Instrument items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding, RelationalDataPoint, Instrument, LegalEntity, Portfolio, CustomEntity. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.lusid.model.RecResultCustomEntityItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable String EntityDisplayName = "example EntityDisplayName";
Map<String, String> Identifiers = new Map<String, String>();
String ItemType = "example ItemType";
@jakarta.annotation.Nullable Map<String, String> RuleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> WritebackSuggestions = new List<WritebackSuggestion>();


RecResultCustomEntityItem recResultCustomEntityItemInstance = new RecResultCustomEntityItem()
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .EntityDisplayName(EntityDisplayName)
    .Identifiers(Identifiers)
    .ItemType(ItemType)
    .RuleAndAttributeValues(RuleAndAttributeValues)
    .WritebackSuggestions(WritebackSuggestions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
