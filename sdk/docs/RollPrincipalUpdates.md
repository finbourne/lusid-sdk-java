# com.finbourne.lusid.model.RollPrincipalUpdates
Describes changes to the principal on a FlexibleDeposit instrument as the result of a DepositRollEvent.  Either the principal to be withdrawn or the principal increase must be specified (either as an amount or a percentage).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withdrawPrincipalAmount** | **java.math.BigDecimal** | The amount of principal that should be withdrawn from the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**withdrawPrincipalPercentage** | **java.math.BigDecimal** | The percentage of principal that should be withdrawn from the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**increasePrincipalAmount** | **java.math.BigDecimal** | The amount of principal that should be added to the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]
**increasePrincipalPercentage** | **java.math.BigDecimal** | The percentage of principal that should be added to the FlexibleDeposit. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RollPrincipalUpdates;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal WithdrawPrincipalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal WithdrawPrincipalPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal IncreasePrincipalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal IncreasePrincipalPercentage = new java.math.BigDecimal("100.00");


RollPrincipalUpdates rollPrincipalUpdatesInstance = new RollPrincipalUpdates()
    .WithdrawPrincipalAmount(WithdrawPrincipalAmount)
    .WithdrawPrincipalPercentage(WithdrawPrincipalPercentage)
    .IncreasePrincipalAmount(IncreasePrincipalAmount)
    .IncreasePrincipalPercentage(IncreasePrincipalPercentage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
