# com.finbourne.lusid.model.TransactionSettlementMovement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The movement name (optional) | [optional] [default to String]
**type** | **String** | Movement types determine the impact of the movement on the holdings. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, Deferred, CashDeferred. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The number of units for the movement. | [optional] [default to java.math.BigDecimal]
**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease | [optional] [default to Integer]
**settlementMode** | **String** | The mode of settlement for the movement which can either be Internal or External. An Internal movement will settle automatically on the contractual settlement date using TransactionConfiguration. An External movement will be determined by portfolio configuration and settlement instruction. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionSettlementMovement;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Type = "example Type";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
Integer Direction = new Integer("100.00");
@jakarta.annotation.Nullable String SettlementMode = "example SettlementMode";


TransactionSettlementMovement transactionSettlementMovementInstance = new TransactionSettlementMovement()
    .Name(Name)
    .Type(Type)
    .Units(Units)
    .Direction(Direction)
    .SettlementMode(SettlementMode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
