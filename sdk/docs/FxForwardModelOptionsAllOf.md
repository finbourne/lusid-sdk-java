

# FxForwardModelOptionsAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forwardRateObservableType** | [**ForwardRateObservableTypeEnum**](#ForwardRateObservableTypeEnum) | The available values are: ForwardPoints, ForwardRate, RatesCurve, FxForwardCurve, Invalid | 
**discountingMethod** | [**DiscountingMethodEnum**](#DiscountingMethodEnum) | The available values are: Standard, ConstantTimeValueOfMoney, Invalid | 
**convertToReportCcy** | **Boolean** | Convert all FX flows to the report currency  By setting this all FX forwards will be priced using Forward Curves that have Report Currency as the base. | 
**modelOptionsType** | [**ModelOptionsTypeEnum**](#ModelOptionsTypeEnum) | The available values are: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, LookUpPricingModelOptions | 



## Enum: ForwardRateObservableTypeEnum

Name | Value
---- | -----
FORWARDPOINTS | &quot;ForwardPoints&quot;
FORWARDRATE | &quot;ForwardRate&quot;
RATESCURVE | &quot;RatesCurve&quot;
FXFORWARDCURVE | &quot;FxForwardCurve&quot;
INVALID | &quot;Invalid&quot;



## Enum: DiscountingMethodEnum

Name | Value
---- | -----
STANDARD | &quot;Standard&quot;
CONSTANTTIMEVALUEOFMONEY | &quot;ConstantTimeValueOfMoney&quot;
INVALID | &quot;Invalid&quot;



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
LOOKUPPRICINGMODELOPTIONS | &quot;LookUpPricingModelOptions&quot;



