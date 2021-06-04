

# AdjustHoldingRequest

This request specifies target holdings. i.e. holding data that the  system should match. When processed by the movement  engine, it will create 'true-up' adjustments on the fly.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | 
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to store with the holding adjustment transaction automatically created by LUSID. Each property must be from the &#39;Transaction&#39; domain. |  [optional]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique holding properties and associated values to store with the target holding. Each property must be from the &#39;Holding&#39; domain. |  [optional]
**taxLots** | [**List&lt;TargetTaxLotRequest&gt;**](TargetTaxLotRequest.md) | The tax-lots that together make up the target holding. | 
**currency** | **String** | The Holding currency. This needs to be equal with the one on the TaxLot -&gt; cost if one is specified |  [optional]



