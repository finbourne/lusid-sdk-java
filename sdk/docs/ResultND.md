# com.finbourne.lusid.model.ResultND
A single result-value shape whose structure is derived from `dimension`, replacing one  hand-maintained type per rank (Result0D/Result1D/Result2D). Risk measures of dimension 1, 2  or 3 - the ladders, the surfaces and the IR vol cubes - now report this shape rather than  Result1D/Result2D, so their response bytes change: the values arrive nested and dense here  (see `values`), where the legacy types carried a flat \"(row,column)\"-keyed map that  elided unquoted coordinates, and the units arrive as one flat list rather than the doubled  `{ units: { units: [] } }` wrapper. Dimension 0 measures are untouched and stay on the  legacy shapes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | The discriminator for this result shape. Always \&quot;ResultND\&quot;. | [optional] [readonly] [default to String]
**dimension** | **Integer** | The rank of the result, 0..N. Determines which of &#x60;value&#x60; / &#x60;values&#x60; is populated  and how deeply &#x60;values&#x60; is nested. | [optional] [default to Integer]
**labels** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | One ordered array of labels per axis, index to label, in the same axis order as  &#x60;AddressDefinition.Axes&#x60;. Length equals &#x60;dimension&#x60;; empty for a scalar. | [optional] [default to List<List<String>>]
**value** | **java.math.BigDecimal** | The scalar value. Present if and only if &#x60;dimension&#x60; is 0. | [optional] [default to java.math.BigDecimal]
**values** | **Object** | The values, nested exactly &#x60;dimension&#x60; deep (axis 0 outermost) and dense - a coordinate  the legacy format would have elided is null, never a fabricated number. Present if and only  if &#x60;dimension&#x60; is at least 1. | [optional] [default to Object]
**hasAnnotation** | **Boolean** | Unchanged from Result0D/1D/2D. | [optional] [default to Boolean]
**units** | [**List&lt;UnitDimension&gt;**](UnitDimension.md) | A flat list of dimensional-analysis units, replacing the doubled  &#x60;{ units: { units: [] } }&#x60; wrapper on the legacy types. The count reflects the order of  the derivative (e.g. two entries for a ratio such as a rates delta), not the result&#39;s axes. | [optional] [default to List<UnitDimension>]

```java
import com.finbourne.lusid.model.ResultND;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ResultValueType = "example ResultValueType";
Integer Dimension = new Integer("100.00");
@jakarta.annotation.Nullable List<List<String>> Labels = new List<List<String>>();
@jakarta.annotation.Nullable java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Object Boolean HasAnnotation = true;
@jakarta.annotation.Nullable List<UnitDimension> Units = new List<UnitDimension>();


ResultND resultNDInstance = new ResultND()
    .ResultValueType(ResultValueType)
    .Dimension(Dimension)
    .Labels(Labels)
    .Value(Value)
    .Values(Values)
    .HasAnnotation(HasAnnotation)
    .Units(Units);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
