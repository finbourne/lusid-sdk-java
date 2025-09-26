# com.finbourne.lusid.model.ConstituentsAdjustmentHeader

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | There can be at most one holdings adjustment for a portfolio at a  specific effective time so this uniquely identifies the adjustment. | [optional] [default to OffsetDateTime]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ConstituentsAdjustmentHeader;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ConstituentsAdjustmentHeader constituentsAdjustmentHeaderInstance = new ConstituentsAdjustmentHeader()
    .EffectiveAt(EffectiveAt)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
