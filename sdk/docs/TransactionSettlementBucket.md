# com.finbourne.lusid.model.TransactionSettlementBucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. | [default to String]
**instrumentScope** | **String** | The Scope of the instrument being settled. | [default to String]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date. Used to match the instruction to the correct settlement bucket. | [optional] [default to OffsetDateTime]
**contractedUnits** | **java.math.BigDecimal** | The contracted units. | [optional] [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** | The settled units. | [optional] [default to java.math.BigDecimal]
**unsettledUnits** | **java.math.BigDecimal** | The unsettled units. | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** | The overdue units. | [optional] [default to java.math.BigDecimal]
**configuredSettlement** | **String** | The method of settlement for the settlement bucket, as defined in the portfolio&#39;s SettlementConfiguration | [optional] [default to String]
**status** | **String** | The Status of the settlement bucket - &#39;Settled&#39;, &#39;Part Settled&#39; or &#39;Unsettled&#39;. | [default to String]
**settlementInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | The settlement instructions received for this settlement bucket. | [optional] [default to List<TransactionSettlementInstruction>]
**movements** | [**List&lt;TransactionSettlementMovement&gt;**](TransactionSettlementMovement.md) | The movements for the settlement bucket. | [optional] [default to List<TransactionSettlementMovement>]

```java
import com.finbourne.lusid.model.TransactionSettlementBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SettlementCategory = "example SettlementCategory";
String LusidInstrumentId = "example LusidInstrumentId";
String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable OffsetDateTime ContractualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal ContractedUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal SettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal OverdueUnits = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConfiguredSettlement = "example ConfiguredSettlement";
String Status = "example Status";
@jakarta.annotation.Nullable List<TransactionSettlementInstruction> SettlementInstructions = new List<TransactionSettlementInstruction>();
@jakarta.annotation.Nullable List<TransactionSettlementMovement> Movements = new List<TransactionSettlementMovement>();


TransactionSettlementBucket transactionSettlementBucketInstance = new TransactionSettlementBucket()
    .SettlementCategory(SettlementCategory)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .ContractualSettlementDate(ContractualSettlementDate)
    .ContractedUnits(ContractedUnits)
    .SettledUnits(SettledUnits)
    .UnsettledUnits(UnsettledUnits)
    .OverdueUnits(OverdueUnits)
    .ConfiguredSettlement(ConfiguredSettlement)
    .Status(Status)
    .SettlementInstructions(SettlementInstructions)
    .Movements(Movements);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
