# com.finbourne.lusid.model.CalculationInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationMethod** | **String** | Method of calculating the fees or commission among: BasisPoints, Percentage, Rate, Flat etc. | [default to String]
**multiplier** | **String** | Field by which to multiply the numerical amount. Eg: Quantity, Value | [default to String]
**calculationAmount** | **java.math.BigDecimal** | Numerical fee amount | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CalculationInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CalculationMethod = "example CalculationMethod";
String Multiplier = "example Multiplier";
java.math.BigDecimal CalculationAmount = new java.math.BigDecimal("100.00");


CalculationInfo calculationInfoInstance = new CalculationInfo()
    .CalculationMethod(CalculationMethod)
    .Multiplier(Multiplier)
    .CalculationAmount(CalculationAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
