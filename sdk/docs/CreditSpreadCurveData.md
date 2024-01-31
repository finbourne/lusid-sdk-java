

# CreditSpreadCurveData

A credit spread curve matching tenors against par spread quotes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseDate** | **OffsetDateTime** | EffectiveAt date of the quoted rates |  |
|**domCcy** | **String** | Domestic currency of the curve |  |
|**tenors** | **List&lt;String&gt;** | The tenors for which the rates apply  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) |  |
|**spreads** | **List&lt;java.math.BigDecimal&gt;** | Par spread quotes corresponding to the tenors. |  |
|**recoveryRate** | **java.math.BigDecimal** | The recovery rate in default. |  |
|**referenceDate** | **OffsetDateTime** | If tenors are provided, this is the date against which the tenors will be resolved.  This is of importance to CDX spread quotes, which are usually quoted in tenors relative to the CDX start date.  In this case, the ReferenceDate would be equal to the CDX start date, and the BaseDate would be the date for which the spreads are valid.  If not provided, this defaults to the BaseDate of the curve. |  [optional] |
|**maturities** | **List&lt;OffsetDateTime&gt;** | The maturity dates for which the rates apply.  Either tenors or maturities should be provided, not both. |  [optional] |
|**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional] |
|**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  |  [optional] |



