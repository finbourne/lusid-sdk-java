# com.finbourne.lusid.model.ManagementFeeTotals
The management fee totals over every partner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gross** | **java.math.BigDecimal** | The fee before offsets. | [default to java.math.BigDecimal]
**offset** | **java.math.BigDecimal** | The offset applied to the fee. | [default to java.math.BigDecimal]
**net** | **java.math.BigDecimal** | The fee after offsets. | [default to java.math.BigDecimal]
**carriedForward** | **java.math.BigDecimal** | Offset in excess of the fee, carried forward to the next period. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ManagementFeeTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Gross = new java.math.BigDecimal("100.00");
java.math.BigDecimal Offset = new java.math.BigDecimal("100.00");
java.math.BigDecimal Net = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarriedForward = new java.math.BigDecimal("100.00");


ManagementFeeTotals managementFeeTotalsInstance = new ManagementFeeTotals()
    .Gross(Gross)
    .Offset(Offset)
    .Net(Net)
    .CarriedForward(CarriedForward);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
