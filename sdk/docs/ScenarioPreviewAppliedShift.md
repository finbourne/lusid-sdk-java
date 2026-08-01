# com.finbourne.lusid.model.ScenarioPreviewAppliedShift
One market data target changed by one scenario shift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the market data the shift was applied to. | [optional] [default to OffsetDateTime]
**shift** | **String** | Description of the shift, e.g. \&quot;EquityShift on &#39;SCENARIO_EQUITY&#39;\&quot;. | [optional] [default to String]
**target** | **String** | Description of the market data target the shift changed. | [optional] [default to String]
**valueBefore** | **java.math.BigDecimal** | The target&#39;s value before the shift. Null for multi-point targets (e.g. whole curves) where a  single number is not meaningful. | [optional] [default to java.math.BigDecimal]
**valueAfter** | **java.math.BigDecimal** | The target&#39;s value after the shift. Null for multi-point targets. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ScenarioPreviewAppliedShift;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Shift = "example Shift";
@jakarta.annotation.Nullable String Target = "example Target";
@jakarta.annotation.Nullable java.math.BigDecimal ValueBefore = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ValueAfter = new java.math.BigDecimal("100.00");


ScenarioPreviewAppliedShift scenarioPreviewAppliedShiftInstance = new ScenarioPreviewAppliedShift()
    .EffectiveAt(EffectiveAt)
    .Shift(Shift)
    .Target(Target)
    .ValueBefore(ValueBefore)
    .ValueAfter(ValueAfter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
