# com.finbourne.lusid.model.InflationCurveShiftDefinition
A shift of an inflation curve, targeted by inflation index name. The shift applies to the  zero-coupon inflation swap quotes the curve was solved from and the curve re-solves with  the same seasonal factors and resolved fixings, so seasonality and the historic index path  survive the shift. Shift shapes, tenor windows, scales and the Tent pivot behave exactly  as they do on a rate curve shift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | The inflation index name the curve is keyed by, e.g. UKRPI or EUHICPXT. | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points on the zero-coupon  rates by default (50 means +50bps), or a percentage of each rate when Scale is  Percentage (1 means rates scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist, Tent. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**pivotTenor** | **String** | The tenor the Tent shift peaks at. The shift applies with the full Amount at this tenor,  falling linearly to zero at StartTenor and EndTenor - the key-rate triangle shape. Only  valid with ShiftType Tent; omitted, a Tent peaks at the midpoint of the window. Declared  last on purpose: generated SDKs emit their positional constructor in property-declaration  order, and this property must not shift the parameters of the ones before it. | [optional] [default to String]
**windowBounds** | **String** | Available values: Inclusive, StartExclusive, EndExclusive, Exclusive. | [optional] [default to String]
**minimumAmountBps** | **java.math.BigDecimal** | The smallest magnitude, in basis points, of the shift finally applied at each curve point,  evaluated per point AFTER the shape weight, in the direction the shift acts there. Exactly  the rate curve shift&#39;s MinimumAmountBps - see that field for the full semantics; the two  curve shifts keep one vocabulary. Omitted, no floor applies - today&#39;s behaviour.  Declared after PivotTenor on purpose, for the constructor-ordering reason given there. | [optional] [default to java.math.BigDecimal]
**applyWhenValue** | **String** | Available values: Any, Positive, Negative. | [optional] [default to String]

```java
import com.finbourne.lusid.model.InflationCurveShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Index = "example Index";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StartTenor = "example StartTenor";
@jakarta.annotation.Nullable String EndTenor = "example EndTenor";
String ShiftType = "example ShiftType";
String Scale = "example Scale";
@jakarta.annotation.Nullable String PivotTenor = "example PivotTenor";
String WindowBounds = "example WindowBounds";
@jakarta.annotation.Nullable java.math.BigDecimal MinimumAmountBps = new java.math.BigDecimal("100.00");
String ApplyWhenValue = "example ApplyWhenValue";


InflationCurveShiftDefinition inflationCurveShiftDefinitionInstance = new InflationCurveShiftDefinition()
    .Index(Index)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType)
    .Scale(Scale)
    .PivotTenor(PivotTenor)
    .WindowBounds(WindowBounds)
    .MinimumAmountBps(MinimumAmountBps)
    .ApplyWhenValue(ApplyWhenValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
