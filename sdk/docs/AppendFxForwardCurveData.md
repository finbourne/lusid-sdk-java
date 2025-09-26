# com.finbourne.lusid.model.AppendFxForwardCurveData
Used to append a new point to an FX curve defined using `FxForwardCurveData`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date for which the forward rate applies. | [default to OffsetDateTime]
**rate** | **java.math.BigDecimal** | Rate provided for the fx forward (price in FgnCcy per unit of DomCcy). | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AppendFxForwardCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");


AppendFxForwardCurveData appendFxForwardCurveDataInstance = new AppendFxForwardCurveData()
    .Date(Date)
    .Rate(Rate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
