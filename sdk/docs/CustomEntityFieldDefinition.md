# com.finbourne.lusid.model.CustomEntityFieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field. | [default to String]
**lifetime** | **String** | Describes how the field’s values can change over time. The available values are: “Perpetual”, “TimeVariant”. | [default to String]
**type** | **String** | The value type for the field. Available values are: “String”, “Boolean”, “DateTime”, “Decimal”. | [default to String]
**collectionType** | **String** | The collection type for the field. Available values are: “Single”, “Array”. Null value defaults to “Single” | [optional] [default to String]
**required** | **Boolean** | Whether the field is required or not. | [default to Boolean]
**description** | **String** | An optional description for the field. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CustomEntityFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Lifetime = "example Lifetime";
String Type = "example Type";
@jakarta.annotation.Nullable String CollectionType = "example CollectionType";
Boolean Required = true;
@jakarta.annotation.Nullable String Description = "example Description";


CustomEntityFieldDefinition customEntityFieldDefinitionInstance = new CustomEntityFieldDefinition()
    .Name(Name)
    .Lifetime(Lifetime)
    .Type(Type)
    .CollectionType(CollectionType)
    .Required(Required)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
