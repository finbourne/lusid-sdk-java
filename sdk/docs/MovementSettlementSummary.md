# com.finbourne.lusid.model.MovementSettlementSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]
**lusidInstrumentId** | **String** |  | [optional] [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**settlementMode** | **String** |  | [optional] [default to String]
**contractualSettlementDate** | **String** |  | [optional] [default to String]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**unsettledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MovementSettlementSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String SettlementMode = "example SettlementMode";
@jakarta.annotation.Nullable String ContractualSettlementDate = "example ContractualSettlementDate";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal SettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal OverdueUnits = new java.math.BigDecimal("100.00");


MovementSettlementSummary movementSettlementSummaryInstance = new MovementSettlementSummary()
    .Name(Name)
    .Type(Type)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .SettlementMode(SettlementMode)
    .ContractualSettlementDate(ContractualSettlementDate)
    .Units(Units)
    .SettledUnits(SettledUnits)
    .UnsettledUnits(UnsettledUnits)
    .OverdueUnits(OverdueUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
