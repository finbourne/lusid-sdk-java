# com.finbourne.lusid.model.PricingMethodologyResult
What a share class deals at under the fund's pricing methodology at a valuation point, the working behind it, and  the reporting prices the fund publishes for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealing** | [**SinglePriceDealing**](SinglePriceDealing.md) |  | [optional] [default to SinglePriceDealing]
**audit** | [**PricingMethodologyAudit**](PricingMethodologyAudit.md) |  | [optional] [default to PricingMethodologyAudit]
**dualDealing** | [**DualPriceDealing**](DualPriceDealing.md) |  | [optional] [default to DualPriceDealing]
**reporting** | **Map&lt;String, java.math.BigDecimal&gt;** | The Fund&#39;s reporting prices for the share class, keyed by label and rounded as the unit price is. A price is absent when the class has no units in issue or the valuation recipe does not publish it. Absent when the Fund has no reporting prices. | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.lusid.model.PricingMethodologyResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

SinglePriceDealing Dealing = new SinglePriceDealing();
PricingMethodologyAudit Audit = new PricingMethodologyAudit();
DualPriceDealing DualDealing = new DualPriceDealing();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> Reporting = new Map<String, java.math.BigDecimal>();


PricingMethodologyResult pricingMethodologyResultInstance = new PricingMethodologyResult()
    .Dealing(Dealing)
    .Audit(Audit)
    .DualDealing(DualDealing)
    .Reporting(Reporting);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
