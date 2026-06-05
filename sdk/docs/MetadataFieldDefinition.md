# com.finbourne.lusid.model.MetadataFieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The unique identifier for the metadata field. | [default to String]
**displayName** | **String** | A user-friendly display name for the metadata field. | [optional] [default to String]
**description** | **String** | A detailed description of the metadata field and its purpose. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.MetadataFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId DataTypeId = new ResourceId();


MetadataFieldDefinition metadataFieldDefinitionInstance = new MetadataFieldDefinition()
    .FieldName(FieldName)
    .DisplayName(DisplayName)
    .Description(Description)
    .DataTypeId(DataTypeId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
