

# IrVolDependency

Economic dependency required to price interest rate products that contain optionality, for example swaptions.  For example, can indicate a dependency on an IrVolCubeData.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The domestic currency of the instrument declaring this dependency. |  |
|**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. |  |
|**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. |  |



