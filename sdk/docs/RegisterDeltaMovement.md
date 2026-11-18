# com.finbourne.lusid.model.RegisterDeltaMovement
A register balance delta one of a transaction type's movements carries, as the engine books it, named by that movement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The holding property key of the register balance, for example PaidInCapital or UncalledCommitment. | [default to String]
**direction** | **String** | The direction the balance moves in when the type is booked, the movement&#39;s own direction folded into the delta&#39;s. Available values: Increase, Decrease. | [default to String]
**source** | **String** | The movement figure the delta moves the balance by. Available values: Amount, Units, PortfolioAmount, ProportionOfBalance, PortfolioAmountAtAverageRate. | [default to String]
**movementName** | **String** | The name of the movement that carries the delta. | [optional] [default to String]
**side** | **String** | The side of the movement that carries the delta. | [default to String]

```java
import com.finbourne.lusid.model.RegisterDeltaMovement;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Direction = "example Direction";
String Source = "example Source";
@jakarta.annotation.Nullable String MovementName = "example MovementName";
String Side = "example Side";


RegisterDeltaMovement registerDeltaMovementInstance = new RegisterDeltaMovement()
    .Key(Key)
    .Direction(Direction)
    .Source(Source)
    .MovementName(MovementName)
    .Side(Side);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
