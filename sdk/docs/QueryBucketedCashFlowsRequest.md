

# QueryBucketedCashFlowsRequest

Query for bucketed cashflows from one or more portfolios.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAt** | **OffsetDateTime** | The time of the system at which to query for bucketed cashflows. |  [optional] |
|**windowStart** | **OffsetDateTime** | The start date of the window. |  |
|**windowEnd** | **OffsetDateTime** | The end date of the window. |  |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. |  |
|**effectiveAt** | **OffsetDateTime** | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows |  |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points. RoundingMethod Supported string (enumeration) values are: [RoundDown, RoundUp]. |  |
|**bucketingDates** | **List&lt;OffsetDateTime&gt;** | A list of dates to perform cashflow bucketing upon. If this is provided, the list of tenors for bucketing should be empty. |  [optional] |
|**bucketingTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon. If this is provided, the list of dates for bucketing should be empty. |  [optional] |
|**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. |  |
|**groupBy** | **List&lt;String&gt;** | The set of address keys to use to group the bucketed cash flows. |  [optional] |
|**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. |  [optional] |
|**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. |  [optional] |



