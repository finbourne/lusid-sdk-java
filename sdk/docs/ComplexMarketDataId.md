

# ComplexMarketDataId

An identifier that uniquely describes an item of complex market data such as an interest rate curve or volatility surface.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The platform or vendor that provided the complex market data, e.g. &#39;DataScope&#39;, &#39;LUSID&#39;, etc. |  |
|**priceSource** | **String** | The source or originator of the complex market data, e.g. a bank or financial institution. |  [optional] |
|**lineage** | **String** | This is obsolete. It is not used, it will not be stored, and has no effects.  If you wish to attach a Lineage to your ComplexMarketData,  you should provide it in the optional Lineage field in the ComplexMarketData class. |  [optional] |
|**effectiveAt** | **String** | The effectiveAt or cut label that this item of complex market data is/was updated/inserted with. |  [optional] |
|**marketAsset** | **String** | The name of the market entity that the document represents |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


