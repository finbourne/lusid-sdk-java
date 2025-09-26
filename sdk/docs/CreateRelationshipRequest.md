# com.finbourne.lusid.model.CreateRelationshipRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity. | [default to Map<String, String>]
**effectiveFrom** | **String** | The effective date of the relationship to be created | [optional] [default to String]
**effectiveUntil** | **String** | The effective datetime until which the relationship is valid. If not supplied this will be valid indefinitely. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateRelationshipRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> SourceEntityId = new Map<String, String>();
Map<String, String> TargetEntityId = new Map<String, String>();
@jakarta.annotation.Nullable String EffectiveFrom = "example EffectiveFrom";
@jakarta.annotation.Nullable String EffectiveUntil = "example EffectiveUntil";


CreateRelationshipRequest createRelationshipRequestInstance = new CreateRelationshipRequest()
    .SourceEntityId(SourceEntityId)
    .TargetEntityId(TargetEntityId)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
