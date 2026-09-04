# com.finbourne.lusid.model.RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points by default (50 means +50bps),  or a percentage of each rate when Scale is Percentage (1 means rates scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist, Tent. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**applyTo** | **String** | A LUSID filter expression over the instrument entity scoping which instruments this shift is  for, e.g. \&quot;properties[Instrument/default/CountryOfIssue] eq &#39;Italy&#39;\&quot;. The shifted market data  is used by the whole valuation run, but when the scenario is requested as a result column the  column is only populated for matching instruments. Only usable when the scenario is applied as  a per-metric column. Note that with a scope set, the base and scenario columns cover different  instrument populations: an aggregate (e.g. Sum) of the scenario column totals only the matching  instruments, so it is not directly comparable to the same aggregate of the base column. | [optional] [default to String]
**pivotTenor** | **String** | The tenor the Tent shift peaks at. The shift applies with the full Amount at this tenor,  falling linearly to zero at StartTenor and EndTenor - the key-rate triangle shape, whose  asymmetry matters because key-rate buckets are rarely evenly spaced. Only valid with  ShiftType Tent; omitted, a Tent peaks at the midpoint of the window. Declared last on  purpose: generated SDKs emit their positional constructor in property-declaration order,  and this property must not shift the parameters of the ones before it.  Over a window containing a single curve point, that point takes the full Amount regardless  of where the pivot lands: a one-point window has no slope to express, and every shift  shape degenerates the same way there. | [optional] [default to String]
**windowBounds** | **String** | Available values: Inclusive, StartExclusive, EndExclusive, Exclusive. | [optional] [default to String]
**curveName** | **String** | The funding identifier of the one curve in the currency this shift targets, letting a  scenario shock a named curve (say, an issuer discounting curve) without also moving the  risk-free curve mastered in the same currency. Omitted - as on every scenario stored  before this field existed - the shift matches every rate curve in the currency, exactly  as before. Declared last on purpose: generated SDKs emit their positional constructor in  property-declaration order, and this property must not shift the parameters of the ones  before it. | [optional] [default to String]
**minimumAmountBps** | **java.math.BigDecimal** | The smallest magnitude, in basis points, of the shift finally applied at each curve point.  Evaluated per point AFTER the shape weight, in the direction the shift acts there (the sign  of Amount times the shape weight): the applied move becomes at least the minimum in that  direction, even where a Percentage shift on a negative rate would have pointed the other  way - the Solvency II up-shock&#39;s \&quot;at least one percentage point at any maturity\&quot; is  MinimumAmountBps &#x3D; 100 on the relative shift the regulation states. A point whose shape  weight is exactly zero stays unshifted: the floor strengthens a shock where the shape  applies one, it does not extend the shock to points the shape excludes (a Tent&#39;s window  ends remain unmoved). Deliberately in basis points rather than in Scale units, because the  floor and the shift are in different units by construction: the regulation states a  relative shock with an absolute floor. Omitted, no floor applies - today&#39;s behaviour.  Declared after PivotTenor on purpose, for the constructor-ordering reason given there. | [optional] [default to java.math.BigDecimal]
**applyWhenValue** | **String** | Available values: Any, Positive, Negative. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RateCurveShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Ccy = "example Ccy";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StartTenor = "example StartTenor";
@jakarta.annotation.Nullable String EndTenor = "example EndTenor";
String ShiftType = "example ShiftType";
String Scale = "example Scale";
@jakarta.annotation.Nullable String ApplyTo = "example ApplyTo";
@jakarta.annotation.Nullable String PivotTenor = "example PivotTenor";
String WindowBounds = "example WindowBounds";
@jakarta.annotation.Nullable String CurveName = "example CurveName";
@jakarta.annotation.Nullable java.math.BigDecimal MinimumAmountBps = new java.math.BigDecimal("100.00");
String ApplyWhenValue = "example ApplyWhenValue";


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .Ccy(Ccy)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType)
    .Scale(Scale)
    .ApplyTo(ApplyTo)
    .PivotTenor(PivotTenor)
    .WindowBounds(WindowBounds)
    .CurveName(CurveName)
    .MinimumAmountBps(MinimumAmountBps)
    .ApplyWhenValue(ApplyWhenValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
