

# Abor

An Abor entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name of the Abor. |  [optional] |
|**description** | **String** | The description for the Abor. |  [optional] |
|**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. |  |
|**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**baseCurrency** | **String** | The base currency of the abor based on contained portfolio base currencies. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


