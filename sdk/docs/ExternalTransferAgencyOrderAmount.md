# com.finbourne.lusid.model.ExternalTransferAgencyOrderAmount
A cash amount in a stated currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.ExternalTransferAgencyOrderAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
String Currency = "example Currency";


ExternalTransferAgencyOrderAmount externalTransferAgencyOrderAmountInstance = new ExternalTransferAgencyOrderAmount()
    .Value(Value)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
