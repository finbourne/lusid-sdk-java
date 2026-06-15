# com.finbourne.lusid.model.SettlementActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **String** | A unique identifier for the settlement activity row, composed from the portfolio, activity type and the underlying transaction or settlement instruction. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**activityType** | **String** | The type of settlement activity: Expected for outstanding units that are due or overdue, or Settled for units that have settled. Available values: Expected, Settled. | [default to String]
**activityBasis** | **String** | The basis on which the settlement activity arose: Inferred for outstanding units, Automatic for units settled per the portfolio&#39;s settlement configuration, or Instruction for units settled by a settlement instruction. Available values: Inferred, Automatic, Instruction. | [default to String]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the settlement activity. For Expected activity this is the query&#39;s end activity date; for Automatic settlement it is the contractual settlement date; for Instruction settlement it is the instruction&#39;s actual settlement date. | [default to OffsetDateTime]
**settlementCategory** | **String** | The settlement category of the underlying movements. Available values: StockSettlement, CashSettlement, DeferredCashReceipt, NotApplicable. | [default to String]
**transactionId** | **String** | The identifier of the transaction that gave rise to this settlement activity. Always populated for Expected and Settled activity. | [optional] [default to String]
**settlementInstructionId** | **String** | The identifier of the settlement instruction that settled the activity. Populated only for Instruction settlement; null for Inferred and Automatic activity. | [optional] [default to String]
**holdingIds** | **List&lt;Long&gt;** | The identifiers of the holdings whose movements contributed to this settlement activity. | [optional] [default to List<Long>]
**lusidInstrumentId** | **String** | The LUSID instrument identifier (LUID) of the instrument being settled. | [default to String]
**instrumentScope** | **String** | The scope in which the instrument is defined. | [default to String]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date of the underlying movements. | [default to OffsetDateTime]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountNumber** | **String** | The account number of the associated custodian account, if any. | [optional] [default to String]
**custodianAccountName** | **String** | The name of the associated custodian account, if any. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The signed number of units settled or expected to settle for this activity. | [default to java.math.BigDecimal]
**direction** | **String** | The direction of the settlement from the portfolio&#39;s perspective. Available values: Debit, Credit. | [default to String]
**daysOverdue** | **java.math.BigDecimal** | The number of days the activity is overdue, calculated as the activity date minus the contractual settlement date. Zero for settled activity. | [optional] [default to java.math.BigDecimal]
**transaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**settlementInstruction** | [**TransactionSettlementInstruction**](TransactionSettlementInstruction.md) |  | [optional] [default to TransactionSettlementInstruction]

```java
import com.finbourne.lusid.model.SettlementActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ActivityId = "example ActivityId";
ResourceId PortfolioId = new ResourceId();
String ActivityType = "example ActivityType";
String ActivityBasis = "example ActivityBasis";
OffsetDateTime ActivityDate = OffsetDateTime.now();
String SettlementCategory = "example SettlementCategory";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String SettlementInstructionId = "example SettlementInstructionId";
@jakarta.annotation.Nullable List<Long> HoldingIds = new List<Long>();
String LusidInstrumentId = "example LusidInstrumentId";
String InstrumentScope = "example InstrumentScope";
OffsetDateTime ContractualSettlementDate = OffsetDateTime.now();
ResourceId CustodianAccountId = new ResourceId();
@jakarta.annotation.Nullable String CustodianAccountNumber = "example CustodianAccountNumber";
@jakarta.annotation.Nullable String CustodianAccountName = "example CustodianAccountName";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
String Direction = "example Direction";
@jakarta.annotation.Nullable java.math.BigDecimal DaysOverdue = new java.math.BigDecimal("100.00");
OutputTransaction Transaction = new OutputTransaction();
TransactionSettlementInstruction SettlementInstruction = new TransactionSettlementInstruction();


SettlementActivity settlementActivityInstance = new SettlementActivity()
    .ActivityId(ActivityId)
    .PortfolioId(PortfolioId)
    .ActivityType(ActivityType)
    .ActivityBasis(ActivityBasis)
    .ActivityDate(ActivityDate)
    .SettlementCategory(SettlementCategory)
    .TransactionId(TransactionId)
    .SettlementInstructionId(SettlementInstructionId)
    .HoldingIds(HoldingIds)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .ContractualSettlementDate(ContractualSettlementDate)
    .CustodianAccountId(CustodianAccountId)
    .CustodianAccountNumber(CustodianAccountNumber)
    .CustodianAccountName(CustodianAccountName)
    .Units(Units)
    .Direction(Direction)
    .DaysOverdue(DaysOverdue)
    .Transaction(Transaction)
    .SettlementInstruction(SettlementInstruction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
