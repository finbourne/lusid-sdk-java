# com.finbourne.lusid.model.VolSurfaceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**expiry** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Absolute, Relative. | [default to String]

```java
import com.finbourne.lusid.model.VolSurfaceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Instrument = "example Instrument";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Expiry = "example Expiry";
String ShiftType = "example ShiftType";


VolSurfaceShiftDefinition volSurfaceShiftDefinitionInstance = new VolSurfaceShiftDefinition()
    .Instrument(Instrument)
    .Amount(Amount)
    .Strike(Strike)
    .Expiry(Expiry)
    .ShiftType(ShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
