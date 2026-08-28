# com.finbourne.lusid.model.HullWhiteModelOptions
Model options for the Hull-White one-factor lattice pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meanReversion** | **java.math.BigDecimal** | The mean reversion speed of the short rate. Must be strictly positive. Defaults to 0.03. | [optional] [default to java.math.BigDecimal]
**volatility** | **java.math.BigDecimal** | The normal (absolute) volatility of the short rate, e.g. 0.008 for 80bp per year. Defaults to 0.008. | [optional] [default to java.math.BigDecimal]
**latticeSteps** | **Integer** | The number of uniform time steps in the lattice. More steps give a finer discretisation  of the short-rate process at greater computational cost. Defaults to 200. | [optional] [default to Integer]
**meanReversionByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency mean-reversion overrides, keyed by ISO currency code.  A currency absent from this map uses MeanReversion. | [optional] [default to Map<String, java.math.BigDecimal>]
**volatilityByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency short-rate volatility overrides, keyed by ISO currency code.  A currency absent from this map uses Volatility. Short-rate volatility is a per-currency  quantity in practice, so a book spanning several currencies can calibrate each currency  separately instead of sharing a single global figure. | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.lusid.model.HullWhiteModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal MeanReversion = new java.math.BigDecimal("100.00");
java.math.BigDecimal Volatility = new java.math.BigDecimal("100.00");
Integer LatticeSteps = new Integer("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> MeanReversionByCurrency = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> VolatilityByCurrency = new Map<String, java.math.BigDecimal>();


HullWhiteModelOptions hullWhiteModelOptionsInstance = new HullWhiteModelOptions()
    .MeanReversion(MeanReversion)
    .Volatility(Volatility)
    .LatticeSteps(LatticeSteps)
    .MeanReversionByCurrency(MeanReversionByCurrency)
    .VolatilityByCurrency(VolatilityByCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
