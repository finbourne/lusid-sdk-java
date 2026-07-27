# com.finbourne.lusid.model.RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist. | [default to String]

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


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .Ccy(Ccy)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
