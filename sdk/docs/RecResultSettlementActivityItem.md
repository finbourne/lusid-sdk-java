# com.finbourne.lusid.model.RecResultSettlementActivityItem
A settlement-activity item within a rec result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**activityId** | **String** | The settlement activity identifier. | [optional] [default to String]
**transactionId** | **String** | The transaction identifier. | [optional] [default to String]
**settlementInstructionId** | **String** | The settlement instruction identifier. | [optional] [default to String]
**holdingImpacts** | [**List&lt;RecResultHoldingImpact&gt;**](RecResultHoldingImpact.md) | The holdings, and where the source states them the tax lots, the item impacted. A distinct set ordered by holdingId then taxLotId; may be empty. An input transaction has not run the movements engine and impacts nothing yet. | [default to List<RecResultHoldingImpact>]
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction or SettlementActivity. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, and both transaction rec types produce Transaction items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.RecResultSettlementActivityItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String ActivityId = "example ActivityId";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String SettlementInstructionId = "example SettlementInstructionId";
List<RecResultHoldingImpact> HoldingImpacts = new List<RecResultHoldingImpact>();
String ItemType = "example ItemType";
@jakarta.annotation.Nullable Map<String, String> RuleAndAttributeValues = new Map<String, String>();


RecResultSettlementActivityItem recResultSettlementActivityItemInstance = new RecResultSettlementActivityItem()
    .PortfolioId(PortfolioId)
    .ActivityId(ActivityId)
    .TransactionId(TransactionId)
    .SettlementInstructionId(SettlementInstructionId)
    .HoldingImpacts(HoldingImpacts)
    .ItemType(ItemType)
    .RuleAndAttributeValues(RuleAndAttributeValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
