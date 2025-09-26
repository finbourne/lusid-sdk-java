# com.finbourne.lusid.model.AppendFxForwardTenorCurveData
Used to append a new point to an FX curve defined using `FxForwardTenorCurveData`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | Tenor for which the forward rate applies. | [default to String]
**rate** | **java.math.BigDecimal** | Rate provided for the fx forward (price in FgnCcy per unit of DomCcy). | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AppendFxForwardTenorCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Tenor = "example Tenor";
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");


AppendFxForwardTenorCurveData appendFxForwardTenorCurveDataInstance = new AppendFxForwardTenorCurveData()
    .Tenor(Tenor)
    .Rate(Rate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
