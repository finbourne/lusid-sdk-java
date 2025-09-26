# com.finbourne.lusid.model.Version
The version metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which this version became valid. Only applies when a single entity is being interacted with. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the data was committed to LUSID. | [default to OffsetDateTime]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was first created in LUSID. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created the entity. | [optional] [default to String]
**requestIdCreated** | **String** | The unique request id of the command that created the entity. | [optional] [default to String]
**reasonCreated** | **String** | The reason for an entity creation. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity (including its properties) was last updated in LUSID. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**requestIdModified** | **String** | The unique request id of the command that last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**reasonModified** | **String** | The reason for an entity modification. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**entityUniqueId** | **String** | The unique id of the entity | [optional] [default to String]
**stagedModificationIdModified** | **String** | The ID of the staged change that resulted in the most recent modification. | [optional] [default to String]

```java
import com.finbourne.lusid.model.Version;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime AsAtDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtCreated = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdCreated = "example UserIdCreated";
@jakarta.annotation.Nullable String RequestIdCreated = "example RequestIdCreated";
@jakarta.annotation.Nullable String ReasonCreated = "example ReasonCreated";
@jakarta.annotation.Nullable OffsetDateTime AsAtModified = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdModified = "example UserIdModified";
@jakarta.annotation.Nullable String RequestIdModified = "example RequestIdModified";
@jakarta.annotation.Nullable String ReasonModified = "example ReasonModified";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable String StagedModificationIdModified = "example StagedModificationIdModified";


Version versionInstance = new Version()
    .EffectiveFrom(EffectiveFrom)
    .AsAtDate(AsAtDate)
    .AsAtCreated(AsAtCreated)
    .UserIdCreated(UserIdCreated)
    .RequestIdCreated(RequestIdCreated)
    .ReasonCreated(ReasonCreated)
    .AsAtModified(AsAtModified)
    .UserIdModified(UserIdModified)
    .RequestIdModified(RequestIdModified)
    .ReasonModified(ReasonModified)
    .AsAtVersionNumber(AsAtVersionNumber)
    .EntityUniqueId(EntityUniqueId)
    .StagedModificationIdModified(StagedModificationIdModified);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
