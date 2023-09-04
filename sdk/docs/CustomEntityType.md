

# CustomEntityType

Representation of a Custom Entity Type on the LUSID API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**entityTypeName** | **String** | The name provided when the custom entity type was created. This has been prefixed with “~” and returned as “entityType”, which is the identifier for the custom entity type. |  |
|**displayName** | **String** | A display label for the custom entity type. |  |
|**description** | **String** | A description for the custom entity type. |  [optional] |
|**entityType** | **String** | The identifier for the custom entity type, derived from the “entityTypeName” provided on creation. |  |
|**fieldSchema** | [**List&lt;CustomEntityFieldDefinition&gt;**](CustomEntityFieldDefinition.md) | The description of the fields on the custom entity type. |  |



