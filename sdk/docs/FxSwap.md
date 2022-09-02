

# FxSwap

LUSID representation of an FX Swap. Composed of two FX Forwards.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nearFxForward** | [**FxForward**](FxForward.md) |  | 
**farFxForward** | [**FxForward**](FxForward.md) |  | 
**notionalSymmetry** | **String** | The NotionalSymmetry allows for even and uneven FxSwaps to be supported.  An even FxSwap is one where the near and far fx forwards have the same notional value on at least one of the  legs. An uneven FxSwap is one where near and far fx forwards don&#39;t have the same notional on both the  domestic and foreign legs.  By default NotionalSymmetry will be set as even.    Supported string (enumeration) values are: [Even, Uneven]. |  [optional]



