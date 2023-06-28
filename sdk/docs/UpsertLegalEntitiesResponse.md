

# UpsertLegalEntitiesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, LegalEntity&gt;**](LegalEntity.md) | The legal entities which have been successfully updated or created. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The legal entities that could not be updated or created or were left unchanged without error along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



