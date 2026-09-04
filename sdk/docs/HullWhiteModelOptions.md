# com.finbourne.lusid.model.HullWhiteModelOptions
Model options for the Hull-White one-factor lattice pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meanReversion** | **java.math.BigDecimal** | The mean reversion speed of the short rate. Must be strictly positive. Defaults to 0.03. | [optional] [default to java.math.BigDecimal]
**volatility** | **java.math.BigDecimal** | The normal (absolute) volatility of the short rate, e.g. 0.008 for 80bp per year. Must not  be negative; zero is allowed and prices with a deterministic short rate. Defaults to 0.008. | [optional] [default to java.math.BigDecimal]
**latticeSteps** | **Integer** | The number of uniform time steps in the lattice. More steps give a finer discretisation  of the short-rate process at greater computational cost. Defaults to 200. | [optional] [default to Integer]
**effectiveRateBumpSize** | **java.math.BigDecimal** | The parallel curve shift, as an absolute rate, used for the central-difference effective  duration and convexity, e.g. 0.0001 for a 1bp bump. Must be strictly positive.  Defaults to 0.0025 (25bp, the market convention for option-adjusted risk) when not supplied. | [optional] [default to java.math.BigDecimal]
**meanReversionByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency mean-reversion overrides, keyed by ISO currency code.  A currency absent from this map uses MeanReversion. | [optional] [default to Map<String, java.math.BigDecimal>]
**volatilityByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency short-rate volatility overrides, keyed by ISO currency code.  A currency absent from this map uses Volatility. Short-rate volatility is a per-currency  quantity in practice, so a book spanning several currencies can calibrate each currency  separately instead of sharing a single global figure. | [optional] [default to Map<String, java.math.BigDecimal>]
**volatilityMultiplier** | **java.math.BigDecimal** | A multiplicative scaling applied to the resolved short-rate volatility - the scalar  Volatility or its per-currency override, whichever applies - at the point of use, e.g. 1.1  prices with the configured volatility raised by ten percent. A single multiplier scales  every per-currency calibration coherently, so a shocked set of options can differ from its  base by this one field rather than a hand-rebuilt volatility (or map of volatilities).  Must not be negative; zero is allowed and prices with a deterministic short rate.  Defaults to 1, which reproduces the configured volatility exactly, when not supplied. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.HullWhiteModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal MeanReversion = new java.math.BigDecimal("100.00");
java.math.BigDecimal Volatility = new java.math.BigDecimal("100.00");
Integer LatticeSteps = new Integer("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EffectiveRateBumpSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> MeanReversionByCurrency = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> VolatilityByCurrency = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal VolatilityMultiplier = new java.math.BigDecimal("100.00");


HullWhiteModelOptions hullWhiteModelOptionsInstance = new HullWhiteModelOptions()
    .MeanReversion(MeanReversion)
    .Volatility(Volatility)
    .LatticeSteps(LatticeSteps)
    .EffectiveRateBumpSize(EffectiveRateBumpSize)
    .MeanReversionByCurrency(MeanReversionByCurrency)
    .VolatilityByCurrency(VolatilityByCurrency)
    .VolatilityMultiplier(VolatilityMultiplier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
