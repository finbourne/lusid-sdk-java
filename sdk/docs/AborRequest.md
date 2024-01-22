

# AborRequest

The request used to create an Abor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the Abor. |  |
|**displayName** | **String** | The name of the Abor. |  |
|**description** | **String** | The description for the Abor. |  [optional] |
|**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. |  |
|**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. |  [optional] |



