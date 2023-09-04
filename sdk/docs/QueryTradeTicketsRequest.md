

# QueryTradeTicketsRequest

Query for tradetickets resulting from events on instrument that are taken from one or more portfolios

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAt** | **OffsetDateTime** | The time of the system at which to query for tradetickets. |  [optional] |
|**windowStart** | **OffsetDateTime** | The start date of the window. |  |
|**windowEnd** | **OffsetDateTime** | The end date of the window. |  |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. |  |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**effectiveAt** | **OffsetDateTime** | The Effective date used in the valuation of the tradetickets. |  |



