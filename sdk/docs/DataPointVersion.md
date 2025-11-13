# com.finbourne.lusid.model.DataPointVersion
The version metadata for DataPoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was first created in LUSID. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created the entity. | [optional] [default to String]
**requestIdCreated** | **String** | The unique request id of the command that created the entity. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity (including its properties) was last updated in LUSID. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**requestIdModified** | **String** | The unique request id of the command that last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**entityUniqueId** | **String** | The unique id of the entity | [optional] [default to String]

```java
import com.finbourne.lusid.model.DataPointVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAtCreated = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdCreated = "example UserIdCreated";
@jakarta.annotation.Nullable String RequestIdCreated = "example RequestIdCreated";
@jakarta.annotation.Nullable OffsetDateTime AsAtModified = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdModified = "example UserIdModified";
@jakarta.annotation.Nullable String RequestIdModified = "example RequestIdModified";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";


DataPointVersion dataPointVersionInstance = new DataPointVersion()
    .AsAtCreated(AsAtCreated)
    .UserIdCreated(UserIdCreated)
    .RequestIdCreated(RequestIdCreated)
    .AsAtModified(AsAtModified)
    .UserIdModified(UserIdModified)
    .RequestIdModified(RequestIdModified)
    .AsAtVersionNumber(AsAtVersionNumber)
    .EntityUniqueId(EntityUniqueId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
