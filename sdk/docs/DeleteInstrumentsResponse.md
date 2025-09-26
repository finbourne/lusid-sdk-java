# com.finbourne.lusid.model.DeleteInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which the instrument was deleted. | [default to OffsetDateTime]
**staged** | [**Map&lt;String, StagedModificationsInfo&gt;**](StagedModificationsInfo.md) | Information about the pending staged modifications for the current entity. | [optional] [readonly] [default to Map<String, StagedModificationsInfo>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DeleteInstrumentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, StagedModificationsInfo> Staged = new Map<String, StagedModificationsInfo>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeleteInstrumentsResponse deleteInstrumentsResponseInstance = new DeleteInstrumentsResponse()
    .Href(Href)
    .AsAt(AsAt)
    .Staged(Staged)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
