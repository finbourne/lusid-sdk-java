# com.finbourne.lusid.model.LusidEntityResult
Represents LUSID entity details for a data quality check result

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the entity | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp for the entity | [optional] [default to OffsetDateTime]
**entityType** | **String** | The type of the LUSID entity | [optional] [default to String]
**scope** | **String** | The scope of the entity | [optional] [default to String]
**identifierKey** | **String** | The identifier key for the entity | [optional] [default to String]
**identifierValue** | **String** | The identifier value for the entity | [optional] [default to String]
**entityUniqueId** | **String** | The unique identifier for the entity | [optional] [default to String]
**displayName** | **String** | The display name of the entity | [optional] [default to String]

```java
import com.finbourne.lusid.model.LusidEntityResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String IdentifierKey = "example IdentifierKey";
@jakarta.annotation.Nullable String IdentifierValue = "example IdentifierValue";
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";


LusidEntityResult lusidEntityResultInstance = new LusidEntityResult()
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .EntityType(EntityType)
    .Scope(Scope)
    .IdentifierKey(IdentifierKey)
    .IdentifierValue(IdentifierValue)
    .EntityUniqueId(EntityUniqueId)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
