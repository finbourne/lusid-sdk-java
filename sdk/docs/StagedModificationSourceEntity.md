# com.finbourne.lusid.model.StagedModificationSourceEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the source entity. | [optional] [default to String]
**scope** | **String** | The scope of the source entity. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the source entity. | [optional] [default to String]
**displayName** | **String** | The display name of the source entity. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StagedModificationSourceEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";


StagedModificationSourceEntity stagedModificationSourceEntityInstance = new StagedModificationSourceEntity()
    .EntityType(EntityType)
    .Scope(Scope)
    .EntityUniqueId(EntityUniqueId)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
