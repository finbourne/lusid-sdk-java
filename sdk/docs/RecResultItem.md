# com.finbourne.lusid.model.RecResultItem
An individual item that makes up (one side of) a rec result. Polymorphic by itemType; each value has a  corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction, SettlementActivity, RelationalDataPoint or Instrument. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, both transaction rec types produce Transaction items, and a relational dataset side produces RelationalDataPoint items whatever the rec type. An instrument side of a LusidEntity rec produces Instrument items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding, RelationalDataPoint, Instrument. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]
**entityScope** | **String** | The scope of the entity the run read. Null for an entity type that has no scope. | [optional] [default to String]
**entityUniqueId** | **String** | The unique id of the entity the run read. It identifies the entity across scopes. | [default to String]
**entityDisplayName** | **String** | The display name of the entity, as it stood at the dates the run read its side. | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The unique identifiers of the entity, keyed by identifier property key. The values are as at the dates the run read the side of the item, so they can differ from the current values. | [default to Map<String, String>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioDisplayName** | **String** | The display name of the item&#39;s portfolio, as it stood at the asAt the run read its data. Null where the run did not read it. | [optional] [default to String]
**holdingId** | **String** | The holding identifier, at holding level: the same id whichever granularity the holding was read at, so that items of different rec types over one holding name it alike. | [optional] [default to String]
**taxLotId** | **String** | The tax lot the item is, where the source row was a single lot: a lot of a position read by tax lot, or a cash commitment. Null for an aggregated position and for a cash balance. Opaque: compare it whole, do not parse it. | [optional] [default to String]
**holdingInstrumentScope** | **String** | The scope of the holding&#39;s instrument. Null where the source does not state one. | [optional] [default to String]
**holdingLusidInstrumentId** | **String** | The LUID of the holding&#39;s instrument. Null where the source does not state it. | [optional] [default to String]
**holdingInstrumentName** | **String** | The name of the holding&#39;s instrument, as it stood at the asAt the run read its data. Null where the run did not resolve it. | [optional] [default to String]
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relationalDatasetDefinitionDisplayName** | **String** | The display name of the relational dataset definition the item&#39;s row belongs to, as it stood at the asAt the run read its data. Null where the run did not read it. | [optional] [default to String]
**relationalDataPointUniqueId** | **String** | The unique id of the relational data point the run read, as minted by the relational dataset store. Opaque: compare it whole, do not parse it. | [default to String]
**activityId** | **String** | The settlement activity identifier. | [optional] [default to String]
**activityInstrumentScope** | **String** | The scope of the settlement activity&#39;s instrument. Null where the source does not state one. | [optional] [default to String]
**activityLusidInstrumentId** | **String** | The LUID of the settlement activity&#39;s instrument. Null where the source does not state it. | [optional] [default to String]
**activityInstrumentName** | **String** | The name of the settlement activity&#39;s instrument, as it stood at the asAt the run read its data. Null where the run did not resolve it. | [optional] [default to String]
**transactionId** | **String** | The transaction identifier. | [optional] [default to String]
**transactionInstrumentScope** | **String** | The scope of the transaction&#39;s resolved instrument. Null where the source does not state one. | [optional] [default to String]
**transactionLusidInstrumentId** | **String** | The LUID of the transaction&#39;s resolved instrument. Null where the source does not state it. | [optional] [default to String]
**transactionInstrumentName** | **String** | The name of the transaction&#39;s resolved instrument, as it stood at the asAt the run read its data. Null where the run did not resolve it. | [optional] [default to String]
**settlementInstructionId** | **String** | The settlement instruction identifier. | [optional] [default to String]
**holdingImpacts** | [**List&lt;RecResultHoldingImpact&gt;**](RecResultHoldingImpact.md) | The holdings, and where the source states them the tax lots, the item impacted. A distinct set ordered by holdingId then taxLotId; may be empty. An input transaction has not run the movements engine and impacts nothing yet. | [default to List<RecResultHoldingImpact>]

```java
import com.finbourne.lusid.model.RecResultItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with RecResultExternalIdentifiersItem RecResultItem
RecResultExternalIdentifiersItem recResultItem = new RecResultExternalIdentifiersItem();
recResultItem.setType(RecResultExternalIdentifiersItem.TypeEnum.RECRESULTEXTERNALIDENTIFIERSITEM);
RecResultItem config = new RecResultItem(recResultItem);

```
 See all compatible oneOf types with RecResultItem
* [RecResultExternalIdentifiersItem](./RecResultExternalIdentifiersItem.md)

* [RecResultHoldingItem](./RecResultHoldingItem.md)

* [RecResultRelationalDataItem](./RecResultRelationalDataItem.md)

* [RecResultSettlementActivityItem](./RecResultSettlementActivityItem.md)

* [RecResultTransactionItem](./RecResultTransactionItem.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
