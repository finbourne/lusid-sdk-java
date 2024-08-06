

# FundValuationPointData

The Valuation Point Data for a Fund on a specified date.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backOut** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the Valuation Point where data points have been &#39;backed out&#39;. |  |
|**dealing** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for any &#39;Dealing&#39; that has occured inside the queried period. |  |
|**pnL** | [**FundPnlBreakdown**](FundPnlBreakdown.md) |  |  |
|**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund or Share Class at the Valuation Point. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. |  |
|**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. |  |
|**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund or Share Class at the Valuation Point. This represents the GAV with any fees applied in the period. |  |
|**unitisation** | [**UnitisationData**](UnitisationData.md) |  |  [optional] |
|**miscellaneous** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Not used directly by the LUSID engines but serves as a holding area for any custom derived data points that may be useful in, for example, fee calculations). |  [optional] |
|**previousValuationPointData** | [**PreviousFundValuationPointData**](PreviousFundValuationPointData.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


