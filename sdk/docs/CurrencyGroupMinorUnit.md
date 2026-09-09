# com.finbourne.lusid.model.CurrencyGroupMinorUnit
A minor unit currency within a currency group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The three-letter, case-sensitive currency code of the minor unit, e.g. GBX. | [default to String]
**fractionOfMajor** | **java.math.BigDecimal** | The fraction of the major unit that one minor unit is worth, greater than zero and no more than one, e.g. 0.01 for GBX against GBP. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CurrencyGroupMinorUnit;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
java.math.BigDecimal FractionOfMajor = new java.math.BigDecimal("100.00");


CurrencyGroupMinorUnit currencyGroupMinorUnitInstance = new CurrencyGroupMinorUnit()
    .Currency(Currency)
    .FractionOfMajor(FractionOfMajor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
