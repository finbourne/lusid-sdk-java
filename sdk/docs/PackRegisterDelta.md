# com.finbourne.lusid.model.PackRegisterDelta
A register balance delta: a partners' capital balance, the direction it moves in once booked and the figure it moves by.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The holding property key of the register balance, for example PaidInCapital or UncalledCommitment. | [default to String]
**direction** | **String** | The direction the balance moves in when the type is booked, the movement&#39;s own direction folded into the delta&#39;s. Available values: Increase, Decrease. | [default to String]
**source** | **String** | The movement figure the delta moves the balance by. Available values: Amount, Units, PortfolioAmount, ProportionOfBalance, PortfolioAmountAtAverageRate. | [default to String]

```java
import com.finbourne.lusid.model.PackRegisterDelta;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Direction = "example Direction";
String Source = "example Source";


PackRegisterDelta packRegisterDeltaInstance = new PackRegisterDelta()
    .Key(Key)
    .Direction(Direction)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
