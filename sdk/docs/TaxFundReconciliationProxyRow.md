# com.finbourne.lusid.model.TaxFundReconciliationProxyRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCode** | **String** | The code of the member fund. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxFundReconciliationProxyRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String FundCode = "example FundCode";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


TaxFundReconciliationProxyRow taxFundReconciliationProxyRowInstance = new TaxFundReconciliationProxyRow()
    .FundCode(FundCode)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
