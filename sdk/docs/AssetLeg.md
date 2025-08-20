

# AssetLeg

The underlying instrument representing one side of the TRS and its pay-receive direction.   Note that TRS currently only supports an asset of Bond or ComplexBond, no other instruments are allowed. Support for additional instrument types will be added in the future.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asset** | [**LusidInstrument**](LusidInstrument.md) |  |  |
|**payReceive** | **String** | Either Pay or Receive stating direction of the asset in the swap.  Supported string (enumeration) values are: [Pay, Receive]. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


