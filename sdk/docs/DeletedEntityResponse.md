# com.finbourne.lusid.model.DeletedEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the deletion was committed to LUSID. | [default to OffsetDateTime]
**entityType** | **String** | The type of the entity that the deleted response applies to. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the entity that the deleted response applies to. | [optional] [default to String]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DeletedEntityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeletedEntityResponse deletedEntityResponseInstance = new DeletedEntityResponse()
    .Href(Href)
    .EffectiveFrom(EffectiveFrom)
    .AsAt(AsAt)
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .StagedModifications(StagedModifications)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
