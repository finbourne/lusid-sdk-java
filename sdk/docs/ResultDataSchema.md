# com.finbourne.lusid.model.ResultDataSchema
The shape and type of the returned data. The AddressSchema gives information about the requested keys,  including the return type, links to further documentation, lifecycle status and removal date if they are  deprecated.     Note: the NodeValueSchema and PropertySchema fields have been deprecated. Please use the AddressSchema instead.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeValueSchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. | [optional] [default to Map<String, FieldSchema>]
**propertySchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. | [optional] [default to Map<String, FieldSchema>]
**addressSchema** | [**Map&lt;String, AddressDefinition&gt;**](AddressDefinition.md) |  | [optional] [default to Map<String, AddressDefinition>]

```java
import com.finbourne.lusid.model.ResultDataSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, FieldSchema> NodeValueSchema = new Map<String, FieldSchema>();
@jakarta.annotation.Nullable Map<String, FieldSchema> PropertySchema = new Map<String, FieldSchema>();
@jakarta.annotation.Nullable Map<String, AddressDefinition> AddressSchema = new Map<String, AddressDefinition>();


ResultDataSchema resultDataSchemaInstance = new ResultDataSchema()
    .NodeValueSchema(NodeValueSchema)
    .PropertySchema(PropertySchema)
    .AddressSchema(AddressSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
