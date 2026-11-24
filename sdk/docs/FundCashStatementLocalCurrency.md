# com.finbourne.lusid.model.FundCashStatementLocalCurrency
A single row in the local-currency Fund Cash Statement report. Each row is a settled cash  movement with a running balance in local currency, and the base-currency cash flow, realised FX  (split into its trade-date-to-settlement-date and cash pool parts), cost basis, balance at the  recipe's rate on the row's date and the unrealised FX between the two.

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
**cashflowBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**tradeDateToSettlementDateFxPnlBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**cashPoolFxPnlBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**costBasisBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**unrealisedFxPnlBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceFxRate** | **java.math.BigDecimal** | The FX rate BalanceBase was struck at, from the row&#39;s currency to the base currency, or 1 for a balance already in the base currency. Not returned when BalanceBase is not, nor when BalanceLocal is zero and no rate was found. | [optional] [default to java.math.BigDecimal]
**balanceBaseFailureReason** | **String** | Why BalanceBase, BalanceFxRate and UnrealisedFxPnlBase are not returned on this row: no FX rate was found for the row&#39;s currency at its accounting date within the recipe&#39;s quote interval, the rate found was not positive, or the rates could not be read. Null when the balance was struck, and on a row whose BalanceLocal is zero, which is zero in the base currency without a rate. | [optional] [default to String]
**avgRate** | **java.math.BigDecimal** | Weighted average FX rate (costBasisBase / balanceLocal). Null when balance is zero. | [optional] [default to java.math.BigDecimal]
**fxRateMovement** | **java.math.BigDecimal** | FX rate for this specific movement (CashflowBase / CashFlowLocal). Null when localAmount is zero. | [optional] [default to java.math.BigDecimal]
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
CurrencyAndAmount CashflowBase = new CurrencyAndAmount();
CurrencyAndAmount TradeDateToSettlementDateFxPnlBase = new CurrencyAndAmount();
CurrencyAndAmount CashPoolFxPnlBase = new CurrencyAndAmount();
CurrencyAndAmount CostBasisBase = new CurrencyAndAmount();
CurrencyAndAmount BalanceBase = new CurrencyAndAmount();
CurrencyAndAmount UnrealisedFxPnlBase = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal BalanceFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BalanceBaseFailureReason = "example BalanceBaseFailureReason";
@jakarta.annotation.Nullable java.math.BigDecimal AvgRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FxRateMovement = new java.math.BigDecimal("100.00");
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
    .CashflowBase(CashflowBase)
    .TradeDateToSettlementDateFxPnlBase(TradeDateToSettlementDateFxPnlBase)
    .CashPoolFxPnlBase(CashPoolFxPnlBase)
    .CostBasisBase(CostBasisBase)
    .BalanceBase(BalanceBase)
    .UnrealisedFxPnlBase(UnrealisedFxPnlBase)
    .BalanceFxRate(BalanceFxRate)
    .BalanceBaseFailureReason(BalanceBaseFailureReason)
    .AvgRate(AvgRate)
    .FxRateMovement(FxRateMovement)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
