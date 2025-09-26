# com.finbourne.lusid.model.TradingConventions
Common Trading details for exchange traded instruments like Futures and Bonds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priceScaleFactor** | **java.math.BigDecimal** | The factor used to scale prices for the instrument. Currently used by LUSID when calculating cost  and notional amounts on transactions. Note this factor does not yet impact Valuation, PV, exposure,  all of which use the scale factor attached to the price quotes in the QuoteStore.  Must be positive and defaults to 1 if not set. | [optional] [default to java.math.BigDecimal]
**minimumOrderSize** | **java.math.BigDecimal** | The Minimum Order Size  Must be non-negative and defaults to 0 if not set. | [optional] [default to java.math.BigDecimal]
**minimumOrderIncrement** | **java.math.BigDecimal** | The Minimum Order Increment  Must be non-negative and defaults to 0 if not set. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TradingConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal PriceScaleFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal MinimumOrderSize = new java.math.BigDecimal("100.00");
java.math.BigDecimal MinimumOrderIncrement = new java.math.BigDecimal("100.00");


TradingConventions tradingConventionsInstance = new TradingConventions()
    .PriceScaleFactor(PriceScaleFactor)
    .MinimumOrderSize(MinimumOrderSize)
    .MinimumOrderIncrement(MinimumOrderIncrement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
