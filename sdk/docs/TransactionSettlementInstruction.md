# com.finbourne.lusid.model.TransactionSettlementInstruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** | The instruction identifier. Unique within the portfolio. | [default to String]
**instructionType** | **String** | The type of instruction which can be Complete or CancelAutomatic. Complete means that the instruction is intended to completely settle a settlement bucket. CancelAutomatic means that it is intended to cancel Automatic settlement. | [default to String]
**actualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that settlement takes place. | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The number of units for the instruction. | [default to java.math.BigDecimal]
**transactionId** | **String** | The ID for the transaction being instructed. | [default to String]
**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. | [default to String]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date. Used to match the instruction to the correct settlement bucket. | [optional] [default to OffsetDateTime]
**subHoldingKeyOverrides** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Allows one or more sub-holding keys to be overridden for any movement being settled by an instruction. Providing a key and value will set the sub-holding key to the specified value; Providing a key only will nullify the sub-holding key. Not referenced sub-holding keys will not be impacted.  | [optional] [default to Map<String, PerpetualProperty>]
**custodianAccountOverride** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the settlement instruction to a unique instrument. | [default to Map<String, String>]
**status** | **String** | The status of the settlement instruction - &#39;Invalid&#39;, &#39;Rejected&#39; &#39;Applied&#39; or &#39;Orphan&#39;. | [optional] [default to String]
**instructionToPortfolioRate** | **java.math.BigDecimal** | The exchange rate between the Settlement Instruction and Portfolio. | [optional] [default to java.math.BigDecimal]
**settlementInLieu** | [**SettlementInLieu**](SettlementInLieu.md) |  | [optional] [default to SettlementInLieu]
**isActive** | **Boolean** | Indicates whether the settlement instruction is active. When false, the instruction has no impact on settlement positions, but remains visible. Defaults to true. | [optional] [default to Boolean]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties which have been requested to be decorated onto the settlement instruction. These will be from the &#39;SettlementInstruction&#39;, &#39;Portfolio&#39;, or &#39;Instrument&#39; domains. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.TransactionSettlementInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SettlementInstructionId = "example SettlementInstructionId";
String InstructionType = "example InstructionType";
OffsetDateTime ActualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
String TransactionId = "example TransactionId";
String SettlementCategory = "example SettlementCategory";
String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable OffsetDateTime ContractualSettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeyOverrides = new Map<String, PerpetualProperty>();
ResourceId CustodianAccountOverride = new ResourceId();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable java.math.BigDecimal InstructionToPortfolioRate = new java.math.BigDecimal("100.00");
SettlementInLieu SettlementInLieu = new SettlementInLieu();
Boolean IsActive = true;
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


TransactionSettlementInstruction transactionSettlementInstructionInstance = new TransactionSettlementInstruction()
    .SettlementInstructionId(SettlementInstructionId)
    .InstructionType(InstructionType)
    .ActualSettlementDate(ActualSettlementDate)
    .Units(Units)
    .TransactionId(TransactionId)
    .SettlementCategory(SettlementCategory)
    .LusidInstrumentId(LusidInstrumentId)
    .ContractualSettlementDate(ContractualSettlementDate)
    .SubHoldingKeyOverrides(SubHoldingKeyOverrides)
    .CustodianAccountOverride(CustodianAccountOverride)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Status(Status)
    .InstructionToPortfolioRate(InstructionToPortfolioRate)
    .SettlementInLieu(SettlementInLieu)
    .IsActive(IsActive)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
