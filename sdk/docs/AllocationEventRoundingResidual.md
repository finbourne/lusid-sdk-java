# com.finbourne.lusid.model.AllocationEventRoundingResidual
The cents left over when one component of an Allocation Event was rounded to the currency's minor unit, and where they went.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component the residual belongs to. | [optional] [default to String]
**cents** | **Integer** | The number of minor units left over after each share was truncated to the currency. | [optional] [default to Integer]
**amount** | **java.math.BigDecimal** | The same, in the event currency. | [optional] [default to java.math.BigDecimal]
**method** | **String** | How the leftover was placed: LargestRemainder spreads it one minor unit at a time over the largest remainders; RoundingPartner gives all of it to the map&#39;s rounding partner line. Available values: LargestRemainder, RoundingPartner. | [optional] [default to String]
**takenBy** | **List&lt;String&gt;** | The investor records that each took a minor unit, in the order they took it. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.AllocationEventRoundingResidual;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Component = "example Component";
Integer Cents = new Integer("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Method = "example Method";
@jakarta.annotation.Nullable List<String> TakenBy = new List<String>();


AllocationEventRoundingResidual allocationEventRoundingResidualInstance = new AllocationEventRoundingResidual()
    .Component(Component)
    .Cents(Cents)
    .Amount(Amount)
    .Method(Method)
    .TakenBy(TakenBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
