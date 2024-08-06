

# InterestRateSwaption

LUSID representation of an Interest Rate Swaption.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**payOrReceiveFixed** | **String** | True if on exercise the holder of the option enters the swap paying fixed, false if floating.    Supported string (enumeration) values are: [Pay, Receive]. |  |
|**premium** | [**Premium**](Premium.md) |  |  [optional] |
|**deliveryMethod** | **String** | How does the option settle    Supported string (enumeration) values are: [Cash, Physical]. |  |
|**swap** | [**InterestRateSwap**](InterestRateSwap.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


