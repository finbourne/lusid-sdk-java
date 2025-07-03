

# FundDefinitionRequest

The request used to create a Fund.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the Fund. |  |
|**displayName** | **String** | The name of the Fund. |  [optional] |
|**description** | **String** | A description for the Fund. |  [optional] |
|**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. |  |
|**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | A list of the Portfolio IDs associated with the fund, which are part of the Fund. Note: These must all have the same base currency, which must also much the Fund Base Currency. |  |
|**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  |  |
|**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. |  [optional] |
|**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. |  [optional] |
|**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; |  |
|**inceptionDate** | **OffsetDateTime** | Inception date of the Fund |  |
|**decimalPlaces** | **Integer** | Number of decimal places for reporting |  [optional] |
|**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  |  |
|**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


