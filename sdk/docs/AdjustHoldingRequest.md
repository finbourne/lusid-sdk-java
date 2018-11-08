
# AdjustHoldingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentUid** | **String** | Unique instrument identifier | 
**subHoldingKeys** | [**Map&lt;String, PerpetualPropertyValue&gt;**](PerpetualPropertyValue.md) | Key fields to uniquely index the sub holdings of a instrument |  [optional]
**properties** | [**Map&lt;String, PerpetualPropertyValue&gt;**](PerpetualPropertyValue.md) | Arbitrary properties to store with the holding |  [optional]
**taxLots** | [**List&lt;TargetTaxLotRequest&gt;**](TargetTaxLotRequest.md) | 1 or more quantity amounts | 



