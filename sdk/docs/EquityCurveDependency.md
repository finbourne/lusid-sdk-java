

# EquityCurveDependency

For indicating a dependency on an EquityCurve.  E.g. When pricing an EquitySwap one may want to make predictions about the price of the underlying equity at future dates.  If so, that model would declare an EquityCurve dependency so that it could obtain predictions from the EquityCurve.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketIdentifier** | **String** | Type of the code identifying the corresponding equity, e.g. ISIN or CUSIP |  |
|**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN |  |
|**curveType** | **String** | The curve type of the EquityCurve required. E.g. EquityCurveByPrices |  |
|**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. |  |



