

# Abor

An Abor entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. For now the only supported value is SinglePortfolio. |  |
|**description** | **String** | The description for the Abor. |  [optional] |
|**aborConfig** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the Abor. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



