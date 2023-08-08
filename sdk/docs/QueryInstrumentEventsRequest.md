

# QueryInstrumentEventsRequest

Instrument event query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAt** | **OffsetDateTime** | The time of the system at which to query for bucketed cashflows. |  [optional] |
|**windowStart** | **OffsetDateTime** | The start date of the window. |  |
|**windowEnd** | **OffsetDateTime** | The end date of the window. |  |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. |  |
|**effectiveAt** | **OffsetDateTime** | The Effective date used in the valuation of the cashflows. |  |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**filterInstrumentEvents** | **String** | Expression to filter the result set. |  [optional] |



