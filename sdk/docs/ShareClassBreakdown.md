

# ShareClassBreakdown

The Valuation Point Data for a Share Class on a specified date.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backOut** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the Valuation Point where data points have been &#39;backed out&#39;. |  |
|**dealing** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for any &#39;Dealing&#39; that has occured inside the queried period. |  |
|**pnL** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for &#39;PnL&#39; that has occured inside the queried period. |  |
|**gav** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. |  |
|**nav** | [**MultiCurrencyAmounts**](MultiCurrencyAmounts.md) |  |  |
|**unitisation** | [**UnitisationData**](UnitisationData.md) |  |  [optional] |
|**miscellaneous** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Not used directly by the LUSID engines but serves as a holding area for any custom derived data points that may be useful in, for example, fee calculations). |  [optional] |
|**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the Share Class currency to the fund currency at this valuation point. |  |
|**capitalRatio** | **java.math.BigDecimal** | The proportion of the fund&#39;s adjusted beginning equity (ie: the sum of the previous NAV and the net dealing) that is invested in the share class. |  |
|**previousShareClassBreakdown** | [**PreviousShareClassBreakdown**](PreviousShareClassBreakdown.md) |  |  |



