

# BucketedCashFlowRequest

Specification class consisting of parameters for BucketedCashFlow endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points.  RoundingMethod    Supported string (enumeration) values are: [RoundDown, RoundUp]. |  |
|**bucketingDates** | **List&lt;OffsetDateTime&gt;** | A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty. |  [optional] |
|**bucketTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty. |  [optional] |
|**effectiveAt** | **String** | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. |  [optional] |
|**windowStart** | **String** | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified. |  [optional] |
|**windowEnd** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified |  [optional] |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place. |  [optional] |
|**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. |  [optional] |
|**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. |  [optional] |
|**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. |  [optional] |
|**asAt** | **OffsetDateTime** | The asAt date to use |  [optional] |
|**excludeUnsettledTrades** | **Boolean** | Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. |  [optional] |
|**cashFlowType** | **String** | Indicate the requested cash flow representation InstrumentCashFlows or PortfolioCashFlows (GetCashLadder uses this) |  [optional] |



