# com.finbourne.lusid.model.MembershipAmendmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customDataModelId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The type of the entity that was added or removed from the Custom Data Model. | [default to String]
**entityUniqueId** | **String** | The entity unique identifier of the entity that was added or removed from the Custom Data Model. | [default to String]
**operation** | **String** | The operation that was performed on the entity&#39;s membership in the Custom Data Model. Either &#39;Add&#39; or &#39;Remove&#39;. | [default to String]
**entityDisplayName** | **String** | The display name of the entity that was added or removed from the Custom Data Model. | [default to String]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]

```java
import com.finbourne.lusid.model.MembershipAmendmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CustomDataModelId = new ResourceId();
String EntityType = "example EntityType";
String EntityUniqueId = "example EntityUniqueId";
String Operation = "example Operation";
String EntityDisplayName = "example EntityDisplayName";
DataModelMembership DataModelMembership = new DataModelMembership();
Version Version = new Version();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();


MembershipAmendmentResponse membershipAmendmentResponseInstance = new MembershipAmendmentResponse()
    .CustomDataModelId(CustomDataModelId)
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .Operation(Operation)
    .EntityDisplayName(EntityDisplayName)
    .DataModelMembership(DataModelMembership)
    .Version(Version)
    .StagedModifications(StagedModifications);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
