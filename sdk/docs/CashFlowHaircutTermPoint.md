# com.finbourne.lusid.model.CashFlowHaircutTermPoint
A point on a cashflow haircut term structure: the haircut rate applying at a given tenor from  the valuation date. Rates are linearly interpolated on time-to-payment between points and  extrapolated flat beyond either end of the term structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | The tenor from the valuation date at which the rate applies, e.g. &#39;6M&#39; or &#39;5Y&#39;. | [default to String]
**rate** | **java.math.BigDecimal** | The haircut rate applying at the tenor, as a fraction in the range [0, 1]. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CashFlowHaircutTermPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Tenor = "example Tenor";
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");


CashFlowHaircutTermPoint cashFlowHaircutTermPointInstance = new CashFlowHaircutTermPoint()
    .Tenor(Tenor)
    .Rate(Rate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
