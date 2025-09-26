# com.finbourne.lusid.model.TransactionConfigurationMovementDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | **String** | . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred | [default to String]
**side** | **String** | The movement side | [default to String]
**direction** | **Integer** | The movement direction | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement. | [optional] [default to Map<String, PerpetualProperty>]
**mappings** | [**List&lt;TransactionPropertyMappingRequest&gt;**](TransactionPropertyMappingRequest.md) | This allows you to map a transaction property to a property on the underlying holding. | [optional] [default to List<TransactionPropertyMappingRequest>]
**name** | **String** | The movement name (optional) | [optional] [default to String]
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39; and &#39;Income&#39; (works only with the movement type &#39;StockMovement&#39;). A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.TransactionConfigurationMovementDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MovementTypes = "example MovementTypes";
String Side = "example Side";
Integer Direction = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<TransactionPropertyMappingRequest> Mappings = new List<TransactionPropertyMappingRequest>();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable List<String> MovementOptions = new List<String>();


TransactionConfigurationMovementDataRequest transactionConfigurationMovementDataRequestInstance = new TransactionConfigurationMovementDataRequest()
    .MovementTypes(MovementTypes)
    .Side(Side)
    .Direction(Direction)
    .Properties(Properties)
    .Mappings(Mappings)
    .Name(Name)
    .MovementOptions(MovementOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
