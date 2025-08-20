

# ComplexMarketData

Base class for representing complex market data in LUSID. Generally speaking, market data is complex when it cannot be represented as a single quote. Examples include discounting curves, projection curves, and volatility surfaces, which are used to compute instrument analytics. This base class should not be directly instantiated; each supported MarketDataType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketDataType** | [**MarketDataTypeEnum**](#MarketDataTypeEnum) | The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface |  |



## Enum: MarketDataTypeEnum

| Name | Value |
|---- | -----|
| DISCOUNTFACTORCURVEDATA | &quot;DiscountFactorCurveData&quot; |
| EQUITYVOLSURFACEDATA | &quot;EquityVolSurfaceData&quot; |
| FXVOLSURFACEDATA | &quot;FxVolSurfaceData&quot; |
| IRVOLCUBEDATA | &quot;IrVolCubeData&quot; |
| OPAQUEMARKETDATA | &quot;OpaqueMarketData&quot; |
| YIELDCURVEDATA | &quot;YieldCurveData&quot; |
| FXFORWARDCURVEDATA | &quot;FxForwardCurveData&quot; |
| FXFORWARDPIPSCURVEDATA | &quot;FxForwardPipsCurveData&quot; |
| FXFORWARDTENORCURVEDATA | &quot;FxForwardTenorCurveData&quot; |
| FXFORWARDTENORPIPSCURVEDATA | &quot;FxForwardTenorPipsCurveData&quot; |
| FXFORWARDCURVEBYQUOTEREFERENCE | &quot;FxForwardCurveByQuoteReference&quot; |
| CREDITSPREADCURVEDATA | &quot;CreditSpreadCurveData&quot; |
| EQUITYCURVEBYPRICESDATA | &quot;EquityCurveByPricesData&quot; |
| CONSTANTVOLATILITYSURFACE | &quot;ConstantVolatilitySurface&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


