# com.finbourne.lusid.model.RolloverConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**balanceChange** | **java.math.BigDecimal** | Balance of the new contract holding. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RolloverConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ContractDetails ContractDetails = new ContractDetails();
java.math.BigDecimal BalanceChange = new java.math.BigDecimal("100.00");


RolloverConstituent rolloverConstituentInstance = new RolloverConstituent()
    .ContractDetails(ContractDetails)
    .BalanceChange(BalanceChange);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
