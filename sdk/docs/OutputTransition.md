# com.finbourne.lusid.model.OutputTransition
A 'transition' within a corporate action, representing an output transition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [readonly] [default to String]
**rounding** | [**RoundingConfiguration**](RoundingConfiguration.md) |  | [optional] [default to RoundingConfiguration]

```java
import com.finbourne.lusid.model.OutputTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal UnitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
RoundingConfiguration Rounding = new RoundingConfiguration();


OutputTransition outputTransitionInstance = new OutputTransition()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .UnitsFactor(UnitsFactor)
    .CostFactor(CostFactor)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .Rounding(Rounding);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
