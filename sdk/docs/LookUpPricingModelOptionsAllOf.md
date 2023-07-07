

# LookUpPricingModelOptionsAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addAccrual** | **Boolean** | Add Instrument Accrual to Valuation | 
**applyIndexRatio** | **Boolean** | Apply Index Ratio to price before valuation.  Used for InflationLinkedBond | 
**modelOptionsType** | [**ModelOptionsTypeEnum**](#ModelOptionsTypeEnum) | The available values are: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, LookUpPricingModelOptions | 



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



