# com.finbourne.lusid.model.RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points by default (50 means +50bps),  or a percentage of each rate when Scale is Percentage (1 means rates scaled by 1.01). | [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RateCurveShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Ccy = "example Ccy";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StartTenor = "example StartTenor";
@jakarta.annotation.Nullable String EndTenor = "example EndTenor";
String ShiftType = "example ShiftType";
String Scale = "example Scale";


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .Ccy(Ccy)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType)
    .Scale(Scale);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
