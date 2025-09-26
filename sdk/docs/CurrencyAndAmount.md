# com.finbourne.lusid.model.CurrencyAndAmount
An amount of a specific currency, specifying a value and an associated unit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.CurrencyAndAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";


CurrencyAndAmount currencyAndAmountInstance = new CurrencyAndAmount()
    .Amount(Amount)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
