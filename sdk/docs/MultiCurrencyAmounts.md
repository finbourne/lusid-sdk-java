# com.finbourne.lusid.model.MultiCurrencyAmounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**baseAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MultiCurrencyAmounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal LocalAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal BaseAmount = new java.math.BigDecimal("100.00");


MultiCurrencyAmounts multiCurrencyAmountsInstance = new MultiCurrencyAmounts()
    .LocalAmount(LocalAmount)
    .BaseAmount(BaseAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
