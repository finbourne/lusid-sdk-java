# com.finbourne.lusid.model.FundCashStatementRow
A single row in a Fund Cash Statement report.  Each row represents a settled cash movement with running balance, cost basis,  average rate, and realised FX PnL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [optional] [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [optional] [default to Integer]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**sourceId** | **String** | The transaction ID that sourced this cash movement. | [optional] [default to String]
**cashStatementActionType** | **String** | The action type: Default, Reversal, TrueUp, AvgRateCorrection, Opening, or Closing. | [optional] [default to String]
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The accounting date of the cash movement. | [optional] [default to OffsetDateTime]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date (trade/settlement date) of the cash movement. | [optional] [default to OffsetDateTime]
**movementName** | **String** | The movement type (e.g. Receivable_Cash_Trade, Payable_Cash_Trade). | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instructionType** | **String** | The settlement instruction type: Automatic, Instructed_Complete, Instructed - Cancel Automatic. | [optional] [default to String]
**diaryEntryCode** | **String** | The diary entry code of the valuation point this row belongs to. | [optional] [default to String]
**originDiaryEntryCode** | **String** | For Reversal/TrueUp rows: the diary entry code of the period the original row belonged to. | [optional] [default to String]
**cashflowLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**cashflowBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**realisedFxPnl** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**costBasisBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**avgRate** | **java.math.BigDecimal** | Weighted average FX rate (costBasisBase / balanceLocal). Null when balance is zero. | [optional] [default to java.math.BigDecimal]
**fxRateMovement** | **java.math.BigDecimal** | FX rate for this specific movement (CashflowBase / CashFlowLocal). Null when localAmount is zero. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundCashStatementRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer GroupById = new Integer("100.00");
Integer SequenceNumber = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String SourceId = "example SourceId";
@jakarta.annotation.Nullable String CashStatementActionType = "example CashStatementActionType";
OffsetDateTime AccountingDate = OffsetDateTime.now();
OffsetDateTime ActivityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String MovementName = "example MovementName";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String InstructionType = "example InstructionType";
@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String OriginDiaryEntryCode = "example OriginDiaryEntryCode";
CurrencyAndAmount CashflowLocal = new CurrencyAndAmount();
CurrencyAndAmount BalanceLocal = new CurrencyAndAmount();
CurrencyAndAmount CashflowBase = new CurrencyAndAmount();
CurrencyAndAmount RealisedFxPnl = new CurrencyAndAmount();
CurrencyAndAmount CostBasisBase = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal AvgRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FxRateMovement = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundCashStatementRow fundCashStatementRowInstance = new FundCashStatementRow()
    .GroupById(GroupById)
    .SequenceNumber(SequenceNumber)
    .SubHoldingKeys(SubHoldingKeys)
    .SourceId(SourceId)
    .CashStatementActionType(CashStatementActionType)
    .AccountingDate(AccountingDate)
    .ActivityDate(ActivityDate)
    .MovementName(MovementName)
    .PortfolioId(PortfolioId)
    .InstructionType(InstructionType)
    .DiaryEntryCode(DiaryEntryCode)
    .OriginDiaryEntryCode(OriginDiaryEntryCode)
    .CashflowLocal(CashflowLocal)
    .BalanceLocal(BalanceLocal)
    .CashflowBase(CashflowBase)
    .RealisedFxPnl(RealisedFxPnl)
    .CostBasisBase(CostBasisBase)
    .AvgRate(AvgRate)
    .FxRateMovement(FxRateMovement)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
