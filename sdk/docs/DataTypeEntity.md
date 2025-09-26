# com.finbourne.lusid.model.DataTypeEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [default to URI]
**entityUniqueId** | **String** | The unique id of the entity. | [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**status** | **String** | The status of the entity at the current time. | [default to String]
**asAtDeleted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was deleted. | [optional] [default to OffsetDateTime]
**userIdDeleted** | **String** | The unique id of the user who deleted the entity. | [optional] [default to String]
**requestIdDeleted** | **String** | The unique request id of the command that deleted the entity. | [optional] [default to String]
**effectiveAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The EffectiveAt this Entity is created, if entity does not currently exist in EffectiveAt. | [optional] [default to OffsetDateTime]
**prevailingDataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**deletedDataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**previewedStatus** | **String** | The status of the previewed entity. | [optional] [default to String]
**previewedDataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DataTypeEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI Href = URI.create("http://example.com/Href");
String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtDeleted = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdDeleted = "example UserIdDeleted";
@jakarta.annotation.Nullable String RequestIdDeleted = "example RequestIdDeleted";
@jakarta.annotation.Nullable OffsetDateTime EffectiveAtCreated = OffsetDateTime.now();
DataType PrevailingDataType = new DataType();
DataType DeletedDataType = new DataType();
@jakarta.annotation.Nullable String PreviewedStatus = "example PreviewedStatus";
DataType PreviewedDataType = new DataType();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DataTypeEntity dataTypeEntityInstance = new DataTypeEntity()
    .Href(Href)
    .EntityUniqueId(EntityUniqueId)
    .AsAtVersionNumber(AsAtVersionNumber)
    .Status(Status)
    .AsAtDeleted(AsAtDeleted)
    .UserIdDeleted(UserIdDeleted)
    .RequestIdDeleted(RequestIdDeleted)
    .EffectiveAtCreated(EffectiveAtCreated)
    .PrevailingDataType(PrevailingDataType)
    .DeletedDataType(DeletedDataType)
    .PreviewedStatus(PreviewedStatus)
    .PreviewedDataType(PreviewedDataType)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
