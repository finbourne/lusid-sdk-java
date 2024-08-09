

# ValuationPointOverview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**diaryEntryCode** | **String** | The code for the Valuation Point. |  |
|**effectiveFrom** | **OffsetDateTime** | The effective time of the last Valuation Point. |  |
|**effectiveTo** | **OffsetDateTime** | The effective time of the current Valuation Point. |  |
|**queryAsAt** | **OffsetDateTime** | The query time of the Valuation Point. Defaults to latest. |  [optional] |
|**type** | **String** | The type of the diary entry. This is &#39;ValuationPoint&#39;. |  |
|**status** | **String** | The status of the Valuation Point. Can be &#39;Estimate&#39;, &#39;Candidate&#39; or &#39;Final&#39;. |  |
|**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund or Share Class at the Valuation Point. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. |  |
|**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund or Share Class at the Valuation Point. This represents the GAV with any fees applied in the period. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


