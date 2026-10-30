# com.finbourne.lusid.model.RecResultSettlementActivityItem
A settlement-activity item within a rec result. Names the portfolio, the activity's instrument and the settled  transaction's resolved instrument alongside, for display.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioDisplayName** | **String** | The display name of the item&#39;s portfolio, as it stood at the asAt the run read its data. Null where the run did not read it. | [optional] [default to String]
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
**itemType** | **String** | The polymorphic item-type discriminator: Holding, ValuedHolding, Transaction, SettlementActivity, RelationalDataPoint or Instrument. Names the item rather than the rec type: Holding and CashHolding recs produce Holding items, a Valuation rec produces ValuedHolding items, both transaction rec types produce Transaction items, and a relational dataset side produces RelationalDataPoint items whatever the rec type. An instrument side of a LusidEntity rec produces Instrument items. Available values: SettlementActivity, Holding, Transaction, ValuedHolding, RelationalDataPoint, Instrument. | [default to String]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [default to Map<String, String>]
**writebackSuggestions** | [**List&lt;WritebackSuggestion&gt;**](WritebackSuggestion.md) | The writebacks suggested against this item, as configured by the matching ruleset&#39;s writebackConfigurations. Only ever populated on target-side items. Suggestions only: a user is expected to review them before acting. Required, but may be empty. | [readonly] [default to List<WritebackSuggestion>]

```java
import com.finbourne.lusid.model.RecResultSettlementActivityItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String PortfolioDisplayName = "example PortfolioDisplayName";
@jakarta.annotation.Nullable String ActivityId = "example ActivityId";
@jakarta.annotation.Nullable String ActivityInstrumentScope = "example ActivityInstrumentScope";
@jakarta.annotation.Nullable String ActivityLusidInstrumentId = "example ActivityLusidInstrumentId";
@jakarta.annotation.Nullable String ActivityInstrumentName = "example ActivityInstrumentName";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String TransactionInstrumentScope = "example TransactionInstrumentScope";
@jakarta.annotation.Nullable String TransactionLusidInstrumentId = "example TransactionLusidInstrumentId";
@jakarta.annotation.Nullable String TransactionInstrumentName = "example TransactionInstrumentName";
@jakarta.annotation.Nullable String SettlementInstructionId = "example SettlementInstructionId";
List<RecResultHoldingImpact> HoldingImpacts = new List<RecResultHoldingImpact>();
String ItemType = "example ItemType";
@jakarta.annotation.Nullable Map<String, String> RuleAndAttributeValues = new Map<String, String>();
List<WritebackSuggestion> WritebackSuggestions = new List<WritebackSuggestion>();


RecResultSettlementActivityItem recResultSettlementActivityItemInstance = new RecResultSettlementActivityItem()
    .PortfolioId(PortfolioId)
    .PortfolioDisplayName(PortfolioDisplayName)
    .ActivityId(ActivityId)
    .ActivityInstrumentScope(ActivityInstrumentScope)
    .ActivityLusidInstrumentId(ActivityLusidInstrumentId)
    .ActivityInstrumentName(ActivityInstrumentName)
    .TransactionId(TransactionId)
    .TransactionInstrumentScope(TransactionInstrumentScope)
    .TransactionLusidInstrumentId(TransactionLusidInstrumentId)
    .TransactionInstrumentName(TransactionInstrumentName)
    .SettlementInstructionId(SettlementInstructionId)
    .HoldingImpacts(HoldingImpacts)
    .ItemType(ItemType)
    .RuleAndAttributeValues(RuleAndAttributeValues)
    .WritebackSuggestions(WritebackSuggestions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
