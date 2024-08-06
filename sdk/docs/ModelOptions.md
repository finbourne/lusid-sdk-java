

# ModelOptions

Base class for representing model options in LUSID, which provide config for instrument analytics.  This base class should not be directly instantiated; each supported ModelOptionsType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelOptionsType** | [**ModelOptionsTypeEnum**](#ModelOptionsTypeEnum) | The available values are: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions |  |



## Enum: ModelOptionsTypeEnum

| Name | Value |
|---- | -----|
| INVALID | &quot;Invalid&quot; |
| OPAQUEMODELOPTIONS | &quot;OpaqueModelOptions&quot; |
| EMPTYMODELOPTIONS | &quot;EmptyModelOptions&quot; |
| INDEXMODELOPTIONS | &quot;IndexModelOptions&quot; |
| FXFORWARDMODELOPTIONS | &quot;FxForwardModelOptions&quot; |
| FUNDINGLEGMODELOPTIONS | &quot;FundingLegModelOptions&quot; |
| EQUITYMODELOPTIONS | &quot;EquityModelOptions&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


