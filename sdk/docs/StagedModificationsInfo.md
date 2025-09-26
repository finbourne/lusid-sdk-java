# com.finbourne.lusid.model.StagedModificationsInfo
The staged modifications metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countPending** | **Integer** | The number of staged modifications for the entity with a status of Pending for the requested asAt. | [default to Integer]
**hrefPending** | [**URI**](URI.md) | Link to the list staged modifications endpoint, filtered by entityType, entityUniqueId and status (&#x3D; Pending). | [default to URI]
**idsPreviewed** | **List&lt;String&gt;** | An array of the ids of any StagedModifications being previewed. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.StagedModificationsInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountPending = new Integer("100.00");
URI HrefPending = URI.create("http://example.com/HrefPending");
@jakarta.annotation.Nullable List<String> IdsPreviewed = new List<String>();


StagedModificationsInfo stagedModificationsInfoInstance = new StagedModificationsInfo()
    .CountPending(CountPending)
    .HrefPending(HrefPending)
    .IdsPreviewed(IdsPreviewed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
