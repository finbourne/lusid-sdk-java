

# AborConfiguration

An AborConfiguration entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The given name for the AborConfiguration. |  [optional] |
|**description** | **String** | The description for the AborConfiguration. |  [optional] |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**postingModuleIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Posting Modules Ids from where the rules to be applied are retrieved. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the AborConfiguration. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



