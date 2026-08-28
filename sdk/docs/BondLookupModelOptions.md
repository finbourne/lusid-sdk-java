# com.finbourne.lusid.model.BondLookupModelOptions
Model options for the quote-anchored bond lookup pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spreadAnchoredRisk** | **Boolean** | Price the bond by discounting its own cashflows over its discounting curve at a constant  spread, instead of marking it to its quoted price. Marking to a quote declares no curve  dependency, so a lookup-priced bond reports no curve delta at all. In this mode the pricer  declares both the discounting curve and a ZSpread quote for the instrument and prices off  them, so holding the spread fixed while the curve is perturbed produces the curve&#39;s delta.  Off by default, as the mode changes both the declared dependencies and where the price  comes from. | [default to Boolean]

```java
import com.finbourne.lusid.model.BondLookupModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean SpreadAnchoredRisk = true;


BondLookupModelOptions bondLookupModelOptionsInstance = new BondLookupModelOptions()
    .SpreadAnchoredRisk(SpreadAnchoredRisk);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
