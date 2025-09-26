# com.finbourne.lusid.model.TransactionPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**type** | **String** | The available values are: Price, Yield, Spread, CashFlowPerUnit, CleanPrice, DirtyPrice | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionPrice;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
String Type = "example Type";


TransactionPrice transactionPriceInstance = new TransactionPrice()
    .Price(Price)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
