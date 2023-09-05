

# AborRequest

The request used to create an Abor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the Abor. |  |
|**displayName** | **String** | The given name for the Abor. |  |
|**description** | **String** | The description for the Abor. |  [optional] |
|**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. For now the only supported value is SinglePortfolio. |  |
|**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the Abor. |  [optional] |



