# com.finbourne.lusid.model.RecResultItem
An individual item that makes up (one side of) a rec result. Polymorphic by itemType; each value has a  corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction or SettlementActivity. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, and both transaction rec types produce Transaction items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **String** | The holding identifier, at holding level: the same id whichever granularity the holding was read at, so that items of different rec types over one holding name it alike. | [optional] [default to String]
**taxLotId** | **String** | The tax lot the item is, where the source row was a single lot: a lot of a position read by tax lot, or a cash commitment. Null for an aggregated position and for a cash balance. Opaque: compare it whole, do not parse it. | [optional] [default to String]
**activityId** | **String** | The settlement activity identifier. | [optional] [default to String]
**transactionId** | **String** | The transaction identifier. | [optional] [default to String]
**settlementInstructionId** | **String** | The settlement instruction identifier. | [optional] [default to String]
**holdingImpacts** | [**List&lt;RecResultHoldingImpact&gt;**](RecResultHoldingImpact.md) | The holdings, and where the source states them the tax lots, the item impacted. A distinct set ordered by holdingId then taxLotId; may be empty. An input transaction has not run the movements engine and impacts nothing yet. | [default to List<RecResultHoldingImpact>]

```java
import com.finbourne.lusid.model.RecResultItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with RecResultHoldingItem RecResultItem
RecResultHoldingItem recResultItem = new RecResultHoldingItem();
recResultItem.setType(RecResultHoldingItem.TypeEnum.RECRESULTHOLDINGITEM);
RecResultItem config = new RecResultItem(recResultItem);

```
 See all compatible oneOf types with RecResultItem
* [RecResultHoldingItem](./RecResultHoldingItem.md)

* [RecResultSettlementActivityItem](./RecResultSettlementActivityItem.md)

* [RecResultTransactionItem](./RecResultTransactionItem.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
