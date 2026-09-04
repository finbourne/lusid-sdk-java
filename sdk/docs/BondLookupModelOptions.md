# com.finbourne.lusid.model.BondLookupModelOptions
Model options for the quote-anchored bond lookup pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spreadAnchoredRisk** | **Boolean** | Price the bond by discounting its own cashflows over its discounting curve at a constant  spread, instead of marking it to its quoted price. Marking to a quote declares no curve  dependency, so a lookup-priced bond reports no curve delta at all. In this mode the pricer  declares both the discounting curve and a ZSpread quote for the instrument and prices off  them, so holding the spread fixed while the curve is perturbed produces the curve&#39;s delta.  Off by default, as the mode changes both the declared dependencies and where the price  comes from. | [default to Boolean]
**cs01BumpWidth** | **java.math.BigDecimal** | The TOTAL width of the central-difference stencil behind the CS01/Central measure: the  instrument&#39;s own z-spread is repriced at spread ± width/2, so a width of 0.0001 means  ±0.5bp reprice points. The width is the whole distance between the two reprice points,  NOT the half-shift. The reported measure is always per one basis point of widening  whatever width is configured. Must be strictly positive.  Defaults to 0.0001 (1bp, repriced at ±0.5bp) when not supplied. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondLookupModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean SpreadAnchoredRisk = true;
@jakarta.annotation.Nullable java.math.BigDecimal Cs01BumpWidth = new java.math.BigDecimal("100.00");


BondLookupModelOptions bondLookupModelOptionsInstance = new BondLookupModelOptions()
    .SpreadAnchoredRisk(SpreadAnchoredRisk)
    .Cs01BumpWidth(Cs01BumpWidth);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
