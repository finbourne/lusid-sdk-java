# com.finbourne.lusid.model.SettlementInLieu

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalSettlementCurrency** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SettlementInLieu;
import java.util.*;
import java.lang.System;
import java.net.URI;

String OriginalSettlementCurrency = "example OriginalSettlementCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


SettlementInLieu settlementInLieuInstance = new SettlementInLieu()
    .OriginalSettlementCurrency(OriginalSettlementCurrency)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
