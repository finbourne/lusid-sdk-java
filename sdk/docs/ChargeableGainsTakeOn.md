# com.finbourne.lusid.model.ChargeableGainsTakeOn
Carried-forward chargeable-gains balances for a tax-lot taken on under the UK chargeable gains accounting method

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | Available values: Section104Pool, Holding1982, Holding1965. | [default to String]
**indexation** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**indexedTo** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**originalCost** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**marketValue1982** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**rebasingElection** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ChargeableGainsTakeOn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Role = "example Role";
@jakarta.annotation.Nullable java.math.BigDecimal Indexation = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime IndexedTo = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal OriginalCost = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MarketValue1982 = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Boolean RebasingElection = true;


ChargeableGainsTakeOn chargeableGainsTakeOnInstance = new ChargeableGainsTakeOn()
    .Role(Role)
    .Indexation(Indexation)
    .IndexedTo(IndexedTo)
    .OriginalCost(OriginalCost)
    .MarketValue1982(MarketValue1982)
    .RebasingElection(RebasingElection);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
