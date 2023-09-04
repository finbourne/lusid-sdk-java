

# ResultDataSchema

The shape and type of the returned data. The AddressSchema gives information about the requested keys,  including the return type, links to further documentation, lifecycle status and removal date if they are  deprecated.                Note: the NodeValueSchema and PropertySchema fields have been deprecated. Please use the AddressSchema instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeValueSchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. |  [optional] |
|**propertySchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. |  [optional] |
|**addressSchema** | [**Map&lt;String, AddressDefinition&gt;**](AddressDefinition.md) |  |  [optional] |



