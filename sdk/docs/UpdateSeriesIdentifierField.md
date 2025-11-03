# com.finbourne.lusid.model.UpdateSeriesIdentifierField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The unique identifier for the field within the dataset. | [default to String]
**displayName** | **String** | A user-friendly display name for the field. | [optional] [default to String]
**description** | **String** | A detailed description of the field and its purpose. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**required** | **Boolean** | Whether this field is mandatory in the dataset. | [default to Boolean]

```java
import com.finbourne.lusid.model.UpdateSeriesIdentifierField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId DataTypeId = new ResourceId();
Boolean Required = true;


UpdateSeriesIdentifierField updateSeriesIdentifierFieldInstance = new UpdateSeriesIdentifierField()
    .FieldName(FieldName)
    .DisplayName(DisplayName)
    .Description(Description)
    .DataTypeId(DataTypeId)
    .Required(Required);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
