

# QueryApplicableInstrumentEventsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**windowStart** | **OffsetDateTime** | The start date of the window. |  |
|**windowEnd** | **OffsetDateTime** | The end date of the window. |  |
|**effectiveAt** | **OffsetDateTime** | The Effective date that splits query window into two parts: factual period and forecast period |  |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. |  |
|**forecastingRecipeId** | [**ResourceId**](ResourceId.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


