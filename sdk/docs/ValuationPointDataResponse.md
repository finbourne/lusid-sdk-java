

# ValuationPointDataResponse

The Valuation Point Data Response for the Fund and specified date.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**type** | **String** | The Type of the associated Diary Entry (&#39;PeriodBoundary&#39;,&#39;ValuationPoint&#39;,&#39;Other&#39; or &#39;Adhoc&#39; when a diary Entry wasn&#39;t used). |  |
|**status** | **String** | The Status of the associated Diary Entry (&#39;Estimate&#39;,&#39;Final&#39;,&#39;Candidate&#39; or &#39;Unofficial&#39;). |  |
|**backout** | **Map&lt;String, java.math.BigDecimal&gt;** | Bucket of detail for the Valuation Point, where data points have been &#39;backed out&#39;. |  |
|**dealing** | **Map&lt;String, java.math.BigDecimal&gt;** | Bucket of detail for any &#39;Dealing&#39; that has occured inside the queried period. |  |
|**pnL** | **Map&lt;String, java.math.BigDecimal&gt;** | Bucket of detail for &#39;PnL&#39; that has occured inside the queried period. |  |
|**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund at the Period end. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. |  |
|**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. |  |
|**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund at the Period end. This represents the GAV with any fees applied in the period. |  |
|**previousNav** | **java.math.BigDecimal** | The Net Asset Value of the Fund at the End of the last Period. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



