# com.finbourne.lusid.model.RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points by default (50 means +50bps),  or a percentage of each rate when Scale is Percentage (1 means rates scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist, Tent. | [default to String]
**pivotTenor** | **String** | The tenor the Tent shift peaks at. The shift applies with the full Amount at this tenor,  falling linearly to zero at StartTenor and EndTenor - the key-rate triangle shape, whose  asymmetry matters because key-rate buckets are rarely evenly spaced. Only valid with  ShiftType Tent; omitted, a Tent peaks at the midpoint of the window. | [optional] [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**applyTo** | **String** | A LUSID filter expression over the instrument entity scoping which instruments this shift is  for, e.g. \&quot;properties[Instrument/default/CountryOfIssue] eq &#39;Italy&#39;\&quot;. The shifted market data  is used by the whole valuation run, but when the scenario is requested as a result column the  column is only populated for matching instruments. Only usable when the scenario is applied as  a per-metric column. Note that with a scope set, the base and scenario columns cover different  instrument populations: an aggregate (e.g. Sum) of the scenario column totals only the matching  instruments, so it is not directly comparable to the same aggregate of the base column. | [optional] [default to String]

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
@jakarta.annotation.Nullable String PivotTenor = "example PivotTenor";
String Scale = "example Scale";
@jakarta.annotation.Nullable String ApplyTo = "example ApplyTo";


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .Ccy(Ccy)
    .Amount(Amount)
    .StartTenor(StartTenor)
    .EndTenor(EndTenor)
    .ShiftType(ShiftType)
    .PivotTenor(PivotTenor)
    .Scale(Scale)
    .ApplyTo(ApplyTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
