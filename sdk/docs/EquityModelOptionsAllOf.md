

# EquityModelOptionsAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**equityForwardProjectionType** | **String** | Determines how forward equity prices should be projected.                Supported string (enumeration) values are: [FlatForwardCurveFromSpot, EquityCurveByPrices, ForwardProjectedFromRatesCurve]. | 
**modelOptionsType** | [**ModelOptionsTypeEnum**](#ModelOptionsTypeEnum) | The available values are: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions | 



## Enum: ModelOptionsTypeEnum

Name | Value
---- | -----
INVALID | &quot;Invalid&quot;
OPAQUEMODELOPTIONS | &quot;OpaqueModelOptions&quot;
EMPTYMODELOPTIONS | &quot;EmptyModelOptions&quot;
INDEXMODELOPTIONS | &quot;IndexModelOptions&quot;
FXFORWARDMODELOPTIONS | &quot;FxForwardModelOptions&quot;
FUNDINGLEGMODELOPTIONS | &quot;FundingLegModelOptions&quot;
EQUITYMODELOPTIONS | &quot;EquityModelOptions&quot;



