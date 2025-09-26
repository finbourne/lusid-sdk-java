# com.finbourne.lusid.model.HoldingsAdjustment
Full content of a holdings adjustment for a single portfolio and effective date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the adjustment is valid. There can only be one holdings adjustment for a transaction portfolio at a specific effective datetime, so this uniquely identifies the adjustment. | [default to OffsetDateTime]
**version** | [**Version**](Version.md) |  | [default to Version]
**unmatchedHoldingMethod** | **String** | Describes how the holdings were adjusted. If &#39;PositionToZero&#39; the entire transaction portfolio&#39;s holdings were set via a call to &#39;Set holdings&#39;. If &#39;KeepTheSame&#39; only the specified holdings were adjusted via a call to &#39;Adjust holdings&#39;. The available values are: PositionToZero, KeepTheSame | [default to String]
**adjustments** | [**List&lt;HoldingAdjustment&gt;**](HoldingAdjustment.md) | The holding adjustments. | [default to List<HoldingAdjustment>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.HoldingsAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
Version Version = new Version();
String UnmatchedHoldingMethod = "example UnmatchedHoldingMethod";
List<HoldingAdjustment> Adjustments = new List<HoldingAdjustment>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


HoldingsAdjustment holdingsAdjustmentInstance = new HoldingsAdjustment()
    .EffectiveAt(EffectiveAt)
    .Version(Version)
    .UnmatchedHoldingMethod(UnmatchedHoldingMethod)
    .Adjustments(Adjustments)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
