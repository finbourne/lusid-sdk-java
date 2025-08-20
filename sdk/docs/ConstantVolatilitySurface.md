

# ConstantVolatilitySurface

Market Data required to build a volatility surface for pricing. Single constant volatility point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseDate** | **OffsetDateTime** | Base date of the engine - this is the reference date for resolution of tenors. |  |
|**assetType** | **String** | What is the asset that the engine is for. Supported string (enumeration) values are: [Cash, Commodity, Credit, Equity, Fx, Rates, FxVol, IrVol, EquityVol, HolidayCalendar, IndexConvention, FlowConvention, CdsFlowConvention, CorporateActions, FxForwards, Quote, Inflation, EquityCurve, All, VendorOpaque]. |  |
|**lineage** | **String** |  |  [optional] |
|**volatility** | **java.math.BigDecimal** | Volatility value. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


