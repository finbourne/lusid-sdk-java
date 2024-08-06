

# CurveOptions

Options for configuring how ComplexMarketData representing a 'curve' is interpreted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dayCountConvention** | **String** | Day count convention of the curve. Defaults to \&quot;Act360\&quot;. |  [optional] |
|**frontExtrapolationType** | **String** | What type of extrapolation is used to build the curve  Imagine that the curve is facing the observer(you), then the \&quot;front\&quot; direction is the closest point on the curve onward. &lt;br /&gt;  example: 0D tenor to past  Defaults to \&quot;Flat\&quot;. Supported string (enumeration) values are: [None, Flat, Linear]. |  [optional] |
|**backExtrapolationType** | **String** | What type of extrapolation is used to build the curve. &lt;br /&gt;  Imagine that the curve is facing the observer(you), then the \&quot;back\&quot; direction is the furthest point on the curve onward. &lt;br /&gt;  example: 30Y tenor to infinity  Defaults to \&quot;Flat\&quot;. Supported string (enumeration) values are: [None, Flat, Linear]. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


