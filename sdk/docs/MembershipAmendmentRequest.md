# com.finbourne.lusid.model.MembershipAmendmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customDataModelId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The type of the entity that is being added or removed from the Custom Data Model. | [default to String]
**entityUniqueId** | **String** | The entity unique identifier of the entity that is being added or removed from the Custom Data Model. | [default to String]
**operation** | **String** | The operation to be performed on the entity&#39;s membership in the Custom Data Model. Either &#39;Add&#39; or &#39;Remove&#39;. | [default to String]

```java
import com.finbourne.lusid.model.MembershipAmendmentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CustomDataModelId = new ResourceId();
String EntityType = "example EntityType";
String EntityUniqueId = "example EntityUniqueId";
String Operation = "example Operation";


MembershipAmendmentRequest membershipAmendmentRequestInstance = new MembershipAmendmentRequest()
    .CustomDataModelId(CustomDataModelId)
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .Operation(Operation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
