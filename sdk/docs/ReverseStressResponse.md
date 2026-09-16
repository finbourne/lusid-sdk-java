# com.finbourne.lusid.model.ReverseStressResponse
The result of a reverse stress solve: the factor the scenario's shifts must be multiplied by to  reach the target loss, together with the whole evaluated ladder so the answer can be checked  rather than taken on trust.     The ladder is part of the answer, not diagnostics. A reverse stress is only meaningful where the  loss moves in one direction with the factor, and the ladder is what shows that it does.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scale** | **java.math.BigDecimal** | The solved factor: the multiple of the scenario&#39;s shifts that reaches the target. Null when no  factor within the evaluated range reaches it, in which case Converged is false and the  warnings say so. | [optional] [default to java.math.BigDecimal]
**targetPnl** | **java.math.BigDecimal** | The change in value that was asked for, echoed back. | [optional] [default to java.math.BigDecimal]
**achievedPnl** | **java.math.BigDecimal** | The change in value actually produced at the solved scale, measured by a valuation at that  factor rather than interpolated. The gap to the target is the honest error of the solve. | [optional] [default to java.math.BigDecimal]
**baseValue** | **java.math.BigDecimal** | The unstressed value of the measure over the filtered holdings. | [optional] [default to java.math.BigDecimal]
**stressedValue** | **java.math.BigDecimal** | The value of the measure at the solved scale. | [optional] [default to java.math.BigDecimal]
**converged** | **Boolean** | Whether the achieved change is within the requested tolerance of the target. False means the  reported scale is the best reached, not an answer to rely on. | [optional] [default to Boolean]
**method** | **String** | How the bracketing factor was turned into the reported one: \&quot;Interpolation\&quot; on a monotone  ladder, \&quot;Bisection\&quot; where the ladder turned back on itself and interpolating between one  bracketing pair would have hidden the others. | [optional] [default to String]
**valuations** | **Integer** | How many valuations the solve ran, the opening ladder counting as one. | [optional] [default to Integer]
**ladder** | [**List&lt;ReverseStressRung&gt;**](ReverseStressRung.md) | Every factor evaluated, in increasing order, including the confirming valuations. | [optional] [default to List<ReverseStressRung>]
**warnings** | **List&lt;String&gt;** | Anything the caller has to know to read the scale correctly: a non-monotone ladder, a target  out of reach, a solve stopped at the iteration limit. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ReverseStressResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Scale = new java.math.BigDecimal("100.00");
java.math.BigDecimal TargetPnl = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AchievedPnl = new java.math.BigDecimal("100.00");
java.math.BigDecimal BaseValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal StressedValue = new java.math.BigDecimal("100.00");
Boolean Converged = true;
@jakarta.annotation.Nullable String Method = "example Method";
Integer Valuations = new Integer("100.00");
@jakarta.annotation.Nullable List<ReverseStressRung> Ladder = new List<ReverseStressRung>();
@jakarta.annotation.Nullable List<String> Warnings = new List<String>();


ReverseStressResponse reverseStressResponseInstance = new ReverseStressResponse()
    .Scale(Scale)
    .TargetPnl(TargetPnl)
    .AchievedPnl(AchievedPnl)
    .BaseValue(BaseValue)
    .StressedValue(StressedValue)
    .Converged(Converged)
    .Method(Method)
    .Valuations(Valuations)
    .Ladder(Ladder)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
