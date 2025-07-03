

# Fund

A Fund entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name of the Fund. |  [optional] |
|**description** | **String** | A description for the Fund. |  [optional] |
|**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. |  [optional] |
|**portfolioIds** | [**List&lt;PortfolioEntityIdWithDetails&gt;**](PortfolioEntityIdWithDetails.md) | A list of the portfolios on the fund, which are part of the Fund. Note: These must all have the same base currency, which must also much the Fund Base Currency. |  [optional] |
|**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**aborId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. |  [optional] |
|**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; |  |
|**inceptionDate** | **OffsetDateTime** | Inception date of the Fund |  |
|**decimalPlaces** | **Integer** | Number of decimal places for reporting |  [optional] |
|**yearEndDate** | [**DayMonth**](DayMonth.md) |  |  [optional] |
|**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  |  [optional] |
|**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


