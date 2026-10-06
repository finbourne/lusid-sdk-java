# com.finbourne.lusid.model.BondLookupModelOptions
Model options for the quote-anchored bond lookup pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spreadAnchoredRisk** | **Boolean** | Price the bond by discounting its own cashflows over its discounting curve at a constant  spread, instead of marking it to its quoted price. Marking to a quote declares no curve  dependency, so a lookup-priced bond reports no curve delta at all. In this mode the pricer  declares both the discounting curve and a ZSpread quote for the instrument and prices off  them, so holding the spread fixed while the curve is perturbed produces the curve&#39;s delta.  The anchor may also be served as a per-instrument CreditSpreadCurve complex market data  document (rule key Credit.CreditSpreadCurve[.IdentifierType], market asset  CreditSpreadCurve/&lt;identifier&gt;), which takes precedence over the quote when present.  Only the spread at the bond&#39;s maturity is read off it; the document&#39;s recoveryRate is not  used by this pricer.  Off by default, as the mode changes both the declared dependencies and where the price  comes from. | [default to Boolean]
**cs01BumpWidth** | **java.math.BigDecimal** | The TOTAL width of the central-difference stencil behind the CS01/Central measure: the  instrument&#39;s own z-spread is repriced at spread ± width/2, so a width of 0.0001 means  ±0.5bp reprice points. The width is the whole distance between the two reprice points,  NOT the half-shift. The reported measure is always per one basis point of widening  whatever width is configured. Must be strictly positive.  Defaults to 0.0001 (1bp, repriced at ±0.5bp) when not supplied. | [optional] [default to java.math.BigDecimal]
**spreadAnchorSource** | **String** | Where the spread anchor comes from when no CreditSpreadCurve is served for the instrument. Only  read when SpreadAnchoredRisk is true.     Supported string (enumeration) values are: [MarketData, SolvedFromPrice].  Defaults to MarketData - the original behaviour, where a ZSpread quote must be served from the  quote store or as a market data override - when not supplied.     SolvedFromPrice: a served CreditSpreadCurve or ZSpread quote still wins. When neither is served,  the bond is valued exactly as the plain lookup values it, and the anchor is the z-spread its  looked-up price implies over the discounting curve (the value Analytic/ZSpread returns). Risk  measures, carry and scenario columns solve that anchor against the unperturbed market and hold it,  so no spread has to be stored or sent. | [optional] [default to String]
**spreadTermStructure** | **Boolean** | In spread-anchored mode with a credit-spread curve (a served CreditSpreadCurve, or the curve the  risk engine builds from the ZSpread quote), discount each cash flow at the curve&#39;s level on its own  payment date instead of discounting every flow at the level at maturity. Pointwise and bucketed  Risk/Credit ladders then split CS01 by cash flow, and the curve built from a quote carries one pillar  per remaining payment date. The price is unchanged on a flat curve (and so on any curve built from a  quote) but not on a sloped served curve.  Defaults to false - the level at maturity - when not supplied. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.BondLookupModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean SpreadAnchoredRisk = true;
@jakarta.annotation.Nullable java.math.BigDecimal Cs01BumpWidth = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String SpreadAnchorSource = "example SpreadAnchorSource";
@jakarta.annotation.Nullable Boolean SpreadTermStructure = true;


BondLookupModelOptions bondLookupModelOptionsInstance = new BondLookupModelOptions()
    .SpreadAnchoredRisk(SpreadAnchoredRisk)
    .Cs01BumpWidth(Cs01BumpWidth)
    .SpreadAnchorSource(SpreadAnchorSource)
    .SpreadTermStructure(SpreadTermStructure);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
