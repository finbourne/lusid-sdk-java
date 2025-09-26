# com.finbourne.lusid.model.ShareClassAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCurrencyAmount** | **java.math.BigDecimal** | The value of the amount in the fund currency. | [optional] [default to java.math.BigDecimal]
**shareClassCurrencyAmount** | **java.math.BigDecimal** | The value of the amount in the share class currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ShareClassAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal FundCurrencyAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal ShareClassCurrencyAmount = new java.math.BigDecimal("100.00");


ShareClassAmount shareClassAmountInstance = new ShareClassAmount()
    .FundCurrencyAmount(FundCurrencyAmount)
    .ShareClassCurrencyAmount(ShareClassCurrencyAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
