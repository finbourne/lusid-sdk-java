# com.finbourne.lusid.model.ExternalDealingEstimateLine
One order within an external order set: a share class, a direction and either a number of units or an amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**tradeType** | **String** | Available values: Subscription, Redemption, SwitchOut, SwitchIn, TransferOut, TransferIn. | [default to String]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**amount** | [**ExternalDealingEstimateAmount**](ExternalDealingEstimateAmount.md) |  | [optional] [default to ExternalDealingEstimateAmount]

```java
import com.finbourne.lusid.model.ExternalDealingEstimateLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentIdentifierType = "example InstrumentIdentifierType";
String InstrumentIdentifier = "example InstrumentIdentifier";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String TradeType = "example TradeType";
@jakarta.annotation.Nullable java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
ExternalDealingEstimateAmount Amount = new ExternalDealingEstimateAmount();


ExternalDealingEstimateLine externalDealingEstimateLineInstance = new ExternalDealingEstimateLine()
    .InstrumentIdentifierType(InstrumentIdentifierType)
    .InstrumentIdentifier(InstrumentIdentifier)
    .InstrumentScope(InstrumentScope)
    .TradeType(TradeType)
    .Units(Units)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
