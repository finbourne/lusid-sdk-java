# com.finbourne.lusid.model.SwingPolicy
The baseline a Single fund's dealing price starts from, the spreads it swings by and, for a Market swing, the  triggers that say when it swings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseline** | [**SwingBaseline**](SwingBaseline.md) |  | [default to SwingBaseline]
**defaultSpreadSource** | **String** | Where the swing comes from. Stored swings by the tiers in spreads. Market swings to the bid or offer, including notional dealing costs, that the valuation recipe of each active NAV type publishes, when the net cashflow passes inflowTrigger or outflowTrigger. Omit it for a fund that never swings and always deals at its baseline. Available values: Stored, Market. | [optional] [default to String]
**spreads** | [**SwingSpreads**](SwingSpreads.md) |  | [optional] [default to SwingSpreads]
**inflowTrigger** | [**SwingTrigger**](SwingTrigger.md) |  | [optional] [default to SwingTrigger]
**outflowTrigger** | [**SwingTrigger**](SwingTrigger.md) |  | [optional] [default to SwingTrigger]

```java
import com.finbourne.lusid.model.SwingPolicy;
import java.util.*;
import java.lang.System;
import java.net.URI;

SwingBaseline Baseline = new SwingBaseline();
@jakarta.annotation.Nullable String DefaultSpreadSource = "example DefaultSpreadSource";
SwingSpreads Spreads = new SwingSpreads();
SwingTrigger InflowTrigger = new SwingTrigger();
SwingTrigger OutflowTrigger = new SwingTrigger();


SwingPolicy swingPolicyInstance = new SwingPolicy()
    .Baseline(Baseline)
    .DefaultSpreadSource(DefaultSpreadSource)
    .Spreads(Spreads)
    .InflowTrigger(InflowTrigger)
    .OutflowTrigger(OutflowTrigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
