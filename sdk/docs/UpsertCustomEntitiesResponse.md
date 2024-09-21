

# UpsertCustomEntitiesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities which have been successfully updated or created. |  [optional] |
|**staged** | [**Map&lt;String, CustomEntityResponse&gt;**](CustomEntityResponse.md) | The custom-entities that have been staged for update or creation. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The custom-entities that could not be updated or created or were left unchanged without error along with a reason for their failure. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


