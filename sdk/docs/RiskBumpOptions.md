# com.finbourne.lusid.model.RiskBumpOptions
Per-recipe configuration of the bump sizes used by the finite-difference Risk/_* measures.  Results are always reported per ResultSensitivity regardless of the shift used to compute  them: the calculators divide by shift/resultSensitivity, so choosing a wider shift (e.g.  10bp for a market element with coarse quote precision) changes the estimator, not the unit.  Every member is optional and an absent member keeps the historical default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deltaShift** | **java.math.BigDecimal** | The shift applied for delta/gamma bumps on any asset type without an explicit override.  Must be strictly positive. Defaults to 0.0001 (1bp) when not supplied. | [optional] [default to java.math.BigDecimal]
**resultSensitivity** | **java.math.BigDecimal** | The move the reported sensitivity is normalised to. Must be strictly positive.  Defaults to 0.0001 (results per 1bp move) when not supplied. | [optional] [default to java.math.BigDecimal]
**deltaShiftOverrides** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-asset-type overrides of the delta shift, keyed by asset type (e.g. \&quot;Rates\&quot;, \&quot;Credit\&quot;,  \&quot;Fx\&quot;). Values must be strictly positive. Asset types without an override use DeltaShift. | [optional] [default to Map<String, java.math.BigDecimal>]
**ladderShiftOverrides** | [**Map&lt;String, List&lt;java.math.BigDecimal&gt;&gt;**](List.md) | Per-asset-type overrides of the shift grid used by ladder measures, keyed by asset type  (e.g. \&quot;Rates\&quot;, \&quot;Fx\&quot;). Each grid must be non-empty and strictly increasing; zero is a  legitimate rung, as the default grids include the base scenario. Asset types without an  override use the standard grids. | [optional] [default to Map<String, List<java.math.BigDecimal>>]
**parityRelativeTolerance** | **java.math.BigDecimal** | The relative tolerance for RiskEngine \&quot;Parity\&quot; checks, applied as  |bump - adjoint| &lt;&#x3D; max(absolute floor, |bump| generate justfile test_sdk tolerance). Defaults to 0.001. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RiskBumpOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal DeltaShift = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ResultSensitivity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> DeltaShiftOverrides = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable Map<String, List<java.math.BigDecimal>> LadderShiftOverrides = new Map<String, List<java.math.BigDecimal>>();
@jakarta.annotation.Nullable java.math.BigDecimal ParityRelativeTolerance = new java.math.BigDecimal("100.00");


RiskBumpOptions riskBumpOptionsInstance = new RiskBumpOptions()
    .DeltaShift(DeltaShift)
    .ResultSensitivity(ResultSensitivity)
    .DeltaShiftOverrides(DeltaShiftOverrides)
    .LadderShiftOverrides(LadderShiftOverrides)
    .ParityRelativeTolerance(ParityRelativeTolerance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
