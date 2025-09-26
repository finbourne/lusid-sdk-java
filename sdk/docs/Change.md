# com.finbourne.lusid.model.Change
The time an entity was modified (amendment and/or historical correction).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**entityId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**corrected** | **Boolean** |  | [default to Boolean]
**correctionEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**correctionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**amended** | **Boolean** |  | [default to Boolean]
**amendmentEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**amendmentAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Change;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId EntityId = new ResourceId();
Boolean Corrected = true;
@jakarta.annotation.Nullable OffsetDateTime CorrectionEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime CorrectionAsAt = OffsetDateTime.now();
Boolean Amended = true;
@jakarta.annotation.Nullable OffsetDateTime AmendmentEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AmendmentAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Change changeInstance = new Change()
    .Href(Href)
    .EntityId(EntityId)
    .Corrected(Corrected)
    .CorrectionEffectiveAt(CorrectionEffectiveAt)
    .CorrectionAsAt(CorrectionAsAt)
    .Amended(Amended)
    .AmendmentEffectiveAt(AmendmentEffectiveAt)
    .AmendmentAsAt(AmendmentAsAt)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
