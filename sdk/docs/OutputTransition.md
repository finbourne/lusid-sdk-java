

# OutputTransition

A 'transition' within a corporate action, representing an output transition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers |  |
|**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by |  |
|**costFactor** | **java.math.BigDecimal** | The factor to scale cost by |  |
|**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers |  [optional] [readonly] |
|**instrumentScope** | **String** | The scope in which the instrument lies. |  [optional] [readonly] |
|**rounding** | [**RoundingConfiguration**](RoundingConfiguration.md) |  |  [optional] |



