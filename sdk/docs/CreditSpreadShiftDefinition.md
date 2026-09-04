# com.finbourne.lusid.model.CreditSpreadShiftDefinition
A shift of a credit spread curve, targeted by the ticker of the reference entity and,  optionally, the currency the curve is quoted in. The shift applies to the par spread quotes  the curve carries, so a basis-point amount means basis points of spread - the units a spread  shock is quoted in. Shift shapes, tenor windows, scales and the Tent pivot behave exactly as  they do on a rate curve shift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | The ticker of the reference entity whose spread curve is shifted. | [default to String]
**ccy** | **String** | The currency the curve is quoted in; disambiguates a ticker quoted in more than one  currency. Omitted, the shift matches the ticker in every currency. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points of spread by default  (50 means +50bps), or a percentage of each spread when Scale is Percentage (1 means  spreads scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist, Tent. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**pivotTenor** | **String** | The tenor the Tent shift peaks at. The shift applies with the full Amount at this tenor,  falling linearly to zero at StartTenor and EndTenor - the key-rate triangle shape. Only  valid with ShiftType Tent; omitted, a Tent peaks at the midpoint of the window. Declared  last on purpose: generated SDKs emit their positional constructor in property-declaration  order, and this property must not shift the parameters of the ones before it. | [optional] [default to String]
**minimumAmountBps** | **java.math.BigDecimal** | The smallest magnitude, in basis points, of the shift finally applied at each curve point,  evaluated per point AFTER the shape weight, in the direction the shift acts there. Exactly  the rate curve shift&#39;s MinimumAmountBps - see that field for the full semantics; the  curve shifts keep one vocabulary. Omitted, no floor applies - today&#39;s behaviour.  Declared after PivotTenor on purpose, for the constructor-ordering reason given there. | [optional] [default to java.math.BigDecimal]
**applyWhenValue** | **String** | Available values: Any, Positive, Negative. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreditSpreadShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Ticker = "example Ticker";
@jakarta.annotation.Nullable String Ccy = "example Ccy";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StartTenor = "example StartTenor";
@jakarta.annotation.Nullable String EndTenor = "example EndTenor";
String ShiftType = "example ShiftType";
String Scale = "example Scale";
@jakarta.annotation.Nullable String PivotTenor = "example PivotTenor";
@jakarta.annotation.Nullable java.math.BigDecimal MinimumAmountBps = new java.math.BigDecimal("100.00");
String ApplyWhenValue = "example ApplyWhenValue";


CreditSpreadShiftDefinition creditSpreadShiftDefinitionInstance = new CreditSpreadShiftDefinition()
    .Ticker(Ticker)
    .Ccy(Ccy)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType)
    .Scale(Scale)
    .PivotTenor(PivotTenor)
    .MinimumAmountBps(MinimumAmountBps)
    .ApplyWhenValue(ApplyWhenValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
