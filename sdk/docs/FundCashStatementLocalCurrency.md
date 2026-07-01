# com.finbourne.lusid.model.FundCashStatementLocalCurrency
A single row in the local-currency Fund Cash Statement report. Each row is a settled cash  movement with a running balance in local currency only; base-currency columns are out of  scope for this variant and are not returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [optional] [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [optional] [default to Integer]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**sourceId** | **String** | The transaction ID that sourced this cash movement. | [optional] [default to String]
**cashStatementActionType** | **String** | The action type: Default, Reversal, TrueUp, SystemCorrection, Opening, or Closing. | [optional] [default to String]
**entryType** | **String** | What drove the row: SystemGenerated (accounting-engine housekeeping such as a reversal/true-up around a backdated transaction) or UserEntered (a real cash movement booked by a user, e.g. a late trade or amendment). | [optional] [default to String]
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The accounting date of the cash movement. | [optional] [default to OffsetDateTime]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date (trade/settlement date) of the cash movement. | [optional] [default to OffsetDateTime]
**movementName** | **String** | The movement type (e.g. Receivable_Cash_Trade, Payable_Cash_Trade). | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instructionType** | **String** | The settlement instruction type: Automatic, Instructed_Complete, Instructed - Cancel Automatic. | [optional] [default to String]
**diaryEntryCode** | **String** | The diary entry code of the valuation point this row belongs to. | [optional] [default to String]
**originDiaryEntryCode** | **String** | For Reversal/TrueUp rows: the diary entry code of the period the original row belonged to. | [optional] [default to String]
**cashflowLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested properties decorated onto the cash statement row. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundCashStatementLocalCurrency;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer GroupById = new Integer("100.00");
Integer SequenceNumber = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String SourceId = "example SourceId";
@jakarta.annotation.Nullable String CashStatementActionType = "example CashStatementActionType";
@jakarta.annotation.Nullable String EntryType = "example EntryType";
OffsetDateTime AccountingDate = OffsetDateTime.now();
OffsetDateTime ActivityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String MovementName = "example MovementName";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String InstructionType = "example InstructionType";
@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String OriginDiaryEntryCode = "example OriginDiaryEntryCode";
CurrencyAndAmount CashflowLocal = new CurrencyAndAmount();
CurrencyAndAmount BalanceLocal = new CurrencyAndAmount();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundCashStatementLocalCurrency fundCashStatementLocalCurrencyInstance = new FundCashStatementLocalCurrency()
    .GroupById(GroupById)
    .SequenceNumber(SequenceNumber)
    .SubHoldingKeys(SubHoldingKeys)
    .SourceId(SourceId)
    .CashStatementActionType(CashStatementActionType)
    .EntryType(EntryType)
    .AccountingDate(AccountingDate)
    .ActivityDate(ActivityDate)
    .MovementName(MovementName)
    .PortfolioId(PortfolioId)
    .InstructionType(InstructionType)
    .DiaryEntryCode(DiaryEntryCode)
    .OriginDiaryEntryCode(OriginDiaryEntryCode)
    .CashflowLocal(CashflowLocal)
    .BalanceLocal(BalanceLocal)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
