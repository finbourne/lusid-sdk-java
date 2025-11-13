# com.finbourne.lusid.model.RollInterestUpdates
Describes changes to the interest of a FlexibleDeposit instrument as the result of a DepositRollEvent.  Both the interest to be withdrawn and the interest to be reinvested must be specified (either as an amount or as a percentage).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withdrawInterestAmount** | **java.math.BigDecimal** | The amount of interest that should be withdrawn from a FlexibleDeposit as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**withdrawInterestPercentage** | **java.math.BigDecimal** | The percentage of interest that should be withdrawn from a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**reinvestInterestAmount** | **java.math.BigDecimal** | The amount of interest that should be reinvested in a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]
**reinvestInterestPercentage** | **java.math.BigDecimal** | The percentage of interest that should be reinvested in a FlexibleDeposit instrument as the result of a roll event. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RollInterestUpdates;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal WithdrawInterestAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal WithdrawInterestPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReinvestInterestAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReinvestInterestPercentage = new java.math.BigDecimal("100.00");


RollInterestUpdates rollInterestUpdatesInstance = new RollInterestUpdates()
    .WithdrawInterestAmount(WithdrawInterestAmount)
    .WithdrawInterestPercentage(WithdrawInterestPercentage)
    .ReinvestInterestAmount(ReinvestInterestAmount)
    .ReinvestInterestPercentage(ReinvestInterestPercentage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
