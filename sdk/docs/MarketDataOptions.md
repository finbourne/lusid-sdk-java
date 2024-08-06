

# MarketDataOptions

Base class for representing market data options in LUSID.  Abstractly, these are any options that one should be able to specify for ComplexMarketData entities.  For example, CurveOptions allows one to decide how the data provided in a discountFactorCurve is interpolated.  This base class should not be directly instantiated;  each supported MarketDataOptionsType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketDataOptionsType** | [**MarketDataOptionsTypeEnum**](#MarketDataOptionsTypeEnum) | The available values are: CurveOptions |  |



## Enum: MarketDataOptionsTypeEnum

| Name | Value |
|---- | -----|
| CURVEOPTIONS | &quot;CurveOptions&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


