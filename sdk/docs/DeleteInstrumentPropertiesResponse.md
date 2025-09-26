# com.finbourne.lusid.model.DeleteInstrumentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which properties were deleted. | [default to OffsetDateTime]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DeleteInstrumentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeleteInstrumentPropertiesResponse deleteInstrumentPropertiesResponseInstance = new DeleteInstrumentPropertiesResponse()
    .AsAt(AsAt)
    .StagedModifications(StagedModifications)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
