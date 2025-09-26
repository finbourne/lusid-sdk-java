# com.finbourne.lusid.model.SettlementInstructionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** |  | [default to String]
**transactionId** | **String** |  | [default to String]
**settlementCategory** | **String** |  | [default to String]
**instructionType** | **String** |  | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**contractualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**actualSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**subHoldingKeyOverrides** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**custodianAccountOverride** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.SettlementInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SettlementInstructionId = "example SettlementInstructionId";
String TransactionId = "example TransactionId";
String SettlementCategory = "example SettlementCategory";
@jakarta.annotation.Nullable String InstructionType = "example InstructionType";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable OffsetDateTime ContractualSettlementDate = OffsetDateTime.now();
OffsetDateTime ActualSettlementDate = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeyOverrides = new Map<String, PerpetualProperty>();
ResourceId CustodianAccountOverride = new ResourceId();


SettlementInstructionRequest settlementInstructionRequestInstance = new SettlementInstructionRequest()
    .SettlementInstructionId(SettlementInstructionId)
    .TransactionId(TransactionId)
    .SettlementCategory(SettlementCategory)
    .InstructionType(InstructionType)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .ContractualSettlementDate(ContractualSettlementDate)
    .ActualSettlementDate(ActualSettlementDate)
    .Units(Units)
    .SubHoldingKeyOverrides(SubHoldingKeyOverrides)
    .CustodianAccountOverride(CustodianAccountOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
