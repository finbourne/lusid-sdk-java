

# ValuationRequest

Specification object for the parameters of a valuation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**asAt** | **OffsetDateTime** | The asAt date to use |  [optional] |
|**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The set of specifications to calculate or retrieve during the valuation and present in the results. For example: AggregateSpec(&#39;Valuation/PV&#39;,&#39;Sum&#39;) for returning the PV (present value) of holdings AggregateSpec(&#39;Holding/default/Units&#39;,&#39;Sum&#39;) for returning the units of holidays AggregateSpec(&#39;Instrument/default/LusidInstrumentId&#39;,&#39;Value&#39;) for returning the Lusid Instrument identifier |  |
|**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. |  [optional] |
|**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) | A set of filters to use to reduce the data found in a request. Equivalent to the &#39;where ...&#39; part of a Sql select statement. For example, filter a set of values within a given range or matching a particular value. |  [optional] |
|**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) | A (possibly empty/null) set of specifications for how to order the results. |  [optional] |
|**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. If not present, then the currency of the relevant portfolio will be used in its place. |  [optional] |
|**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. |  [optional] |
|**returnResultAsExpandedTypes** | **Boolean** | Financially meaningful results can be presented as either simple flat types or more complex expanded types. For example, the present value (PV) of a holding could be represented either as a simple decimal (with currency implied) or as a decimal-currency pair. This flag allows either representation to be returned. In the PV example, the returned value would be the decimal-currency pair if this flag is true, or the decimal only if this flag is false. |  [optional] |
|**includeOrderFlow** | [**OrderFlowConfiguration**](OrderFlowConfiguration.md) |  |  [optional] |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolio or portfolio group identifier(s) that is to be valued. |  |
|**valuationSchedule** | [**ValuationSchedule**](ValuationSchedule.md) |  |  |
|**marketDataOverrides** | [**MarketDataOverrides**](MarketDataOverrides.md) |  |  [optional] |
|**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


