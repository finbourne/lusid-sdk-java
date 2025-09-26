# com.finbourne.lusid.model.TransactionConfigurationMovementData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | **String** | Movement types determine the impact of the movement on the holdings. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, Deferred, CashDeferred. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred | [default to String]
**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration | [default to String]
**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement | [optional] [default to Map<String, PerpetualProperty>]
**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding | [optional] [default to List<TransactionPropertyMapping>]
**name** | **String** | The movement name (optional) | [optional] [default to String]
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39; and &#39;Income&#39; (works only with the movement type &#39;StockMovement&#39;). A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.TransactionConfigurationMovementData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MovementTypes = "example MovementTypes";
String Side = "example Side";
Integer Direction = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<TransactionPropertyMapping> Mappings = new List<TransactionPropertyMapping>();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable List<String> MovementOptions = new List<String>();


TransactionConfigurationMovementData transactionConfigurationMovementDataInstance = new TransactionConfigurationMovementData()
    .MovementTypes(MovementTypes)
    .Side(Side)
    .Direction(Direction)
    .Properties(Properties)
    .Mappings(Mappings)
    .Name(Name)
    .MovementOptions(MovementOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
