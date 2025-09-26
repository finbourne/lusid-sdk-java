# com.finbourne.lusid.model.SettlementSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeId** | **String** |  | [optional] [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**bondInterest** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**movementName** | **String** |  | [optional] [default to String]
**movementType** | **String** |  | [optional] [default to String]
**unsettledUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SettlementSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TradeId = "example TradeId";
OffsetDateTime SettlementDate = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal BondInterest = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String MovementName = "example MovementName";
@jakarta.annotation.Nullable String MovementType = "example MovementType";
java.math.BigDecimal UnsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal OverdueUnits = new java.math.BigDecimal("100.00");


SettlementSchedule settlementScheduleInstance = new SettlementSchedule()
    .TradeId(TradeId)
    .SettlementDate(SettlementDate)
    .Units(Units)
    .BondInterest(BondInterest)
    .MovementName(MovementName)
    .MovementType(MovementType)
    .UnsettledUnits(UnsettledUnits)
    .OverdueUnits(OverdueUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
