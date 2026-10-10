# com.finbourne.lusid.model.DirectionSpreads
The tiers of spread for one direction of net cashflow and what their bounds measure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basis** | **String** | What the tier bounds measure: Amount, the size of the net cashflow in the fund currency, or PctOfNav, the net cashflow as a percentage of the previous valuation point&#39;s NAV. Available values: Amount, PctOfNav. | [default to String]
**tiers** | [**List&lt;SwingSpreadTier&gt;**](SwingSpreadTier.md) | The tiers, in ascending order. Each starts where the previous one ends, and only the last is unbounded above. The first tier&#39;s lower bound is the threshold: a flow at or below it does not swing. | [default to List<SwingSpreadTier>]

```java
import com.finbourne.lusid.model.DirectionSpreads;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Basis = "example Basis";
List<SwingSpreadTier> Tiers = new List<SwingSpreadTier>();


DirectionSpreads directionSpreadsInstance = new DirectionSpreads()
    .Basis(Basis)
    .Tiers(Tiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
