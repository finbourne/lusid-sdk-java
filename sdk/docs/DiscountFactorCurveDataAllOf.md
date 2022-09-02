

# DiscountFactorCurveDataAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | BaseDate for the Curve | 
**dates** | **List&lt;OffsetDateTime&gt;** | Dates for which the discount factors apply | 
**discountFactors** | **List&lt;java.math.BigDecimal&gt;** | Discount factors to be applied to cashflow on the specified dates | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**marketDataType** | [**MarketDataTypeEnum**](#MarketDataTypeEnum) | The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData | 



## Enum: MarketDataTypeEnum

Name | Value
---- | -----
DISCOUNTFACTORCURVEDATA | &quot;DiscountFactorCurveData&quot;
EQUITYVOLSURFACEDATA | &quot;EquityVolSurfaceData&quot;
FXVOLSURFACEDATA | &quot;FxVolSurfaceData&quot;
IRVOLCUBEDATA | &quot;IrVolCubeData&quot;
OPAQUEMARKETDATA | &quot;OpaqueMarketData&quot;
YIELDCURVEDATA | &quot;YieldCurveData&quot;
FXFORWARDCURVEDATA | &quot;FxForwardCurveData&quot;
FXFORWARDPIPSCURVEDATA | &quot;FxForwardPipsCurveData&quot;
FXFORWARDTENORCURVEDATA | &quot;FxForwardTenorCurveData&quot;
FXFORWARDTENORPIPSCURVEDATA | &quot;FxForwardTenorPipsCurveData&quot;
FXFORWARDCURVEBYQUOTEREFERENCE | &quot;FxForwardCurveByQuoteReference&quot;
CREDITSPREADCURVEDATA | &quot;CreditSpreadCurveData&quot;
EQUITYCURVEBYPRICESDATA | &quot;EquityCurveByPricesData&quot;



