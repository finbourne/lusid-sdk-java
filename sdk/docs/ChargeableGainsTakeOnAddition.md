# com.finbourne.lusid.model.ChargeableGainsTakeOnAddition
One acquisition added to a taken-on 1982 holding since 31 March 1982, carried as its own record inside the holding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**cost** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**indexation** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**paidCost** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ChargeableGainsTakeOnAddition;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal Indexation = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PaidCost = new java.math.BigDecimal("100.00");


ChargeableGainsTakeOnAddition chargeableGainsTakeOnAdditionInstance = new ChargeableGainsTakeOnAddition()
    .Date(Date)
    .Cost(Cost)
    .Indexation(Indexation)
    .PaidCost(PaidCost);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
