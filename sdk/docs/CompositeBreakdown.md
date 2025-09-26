# com.finbourne.lusid.model.CompositeBreakdown
A list of Composite Breakdowns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the calculation. | [default to OffsetDateTime]
**composite** | [**PortfolioReturnBreakdown**](PortfolioReturnBreakdown.md) |  | [optional] [default to PortfolioReturnBreakdown]
**constituents** | [**List&lt;PortfolioReturnBreakdown&gt;**](PortfolioReturnBreakdown.md) | The constituents with their information which are part of the composite. | [optional] [default to List<PortfolioReturnBreakdown>]

```java
import com.finbourne.lusid.model.CompositeBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
PortfolioReturnBreakdown Composite = new PortfolioReturnBreakdown();
@jakarta.annotation.Nullable List<PortfolioReturnBreakdown> Constituents = new List<PortfolioReturnBreakdown>();


CompositeBreakdown compositeBreakdownInstance = new CompositeBreakdown()
    .EffectiveAt(EffectiveAt)
    .Composite(Composite)
    .Constituents(Constituents);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
