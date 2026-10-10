# com.finbourne.lusid.model.SwingPricingRule
Deprecated and ignored; use the Fund's pricing methodology.  Moved a NAV type's pricing basis with its net dealing flow. When the flow, as a percentage of the previous  valuation point's NAV, exceeded the threshold the fund was valued on the inflow or outflow basis instead of  the NAV type's own basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresholdPercentageOfNav** | **java.math.BigDecimal** | The net dealing flow, as a percentage of the previous valuation point&#39;s NAV, above which the fund swings. Must be zero or more; zero swings on any non-zero flow. | [default to java.math.BigDecimal]
**inflowBasis** | **String** | The pricing basis the fund is valued on when net subscriptions exceed the threshold: Mid, Bid or Ask. Defaults to Ask. Available values: Mid, Bid, Ask. | [optional] [default to String]
**outflowBasis** | **String** | The pricing basis the fund is valued on when net redemptions exceed the threshold: Mid, Bid or Ask. Defaults to Bid. Available values: Mid, Bid, Ask. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SwingPricingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal ThresholdPercentageOfNav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String InflowBasis = "example InflowBasis";
@jakarta.annotation.Nullable String OutflowBasis = "example OutflowBasis";


SwingPricingRule swingPricingRuleInstance = new SwingPricingRule()
    .ThresholdPercentageOfNav(ThresholdPercentageOfNav)
    .InflowBasis(InflowBasis)
    .OutflowBasis(OutflowBasis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
