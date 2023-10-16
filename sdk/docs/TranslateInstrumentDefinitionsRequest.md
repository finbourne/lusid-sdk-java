

# TranslateInstrumentDefinitionsRequest

A collection of instruments to translate, along with the target dialect to translate into.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instruments** | [**Map&lt;String, LusidInstrument&gt;**](LusidInstrument.md) | The collection of instruments to translate.     Each instrument definition should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response.     Any instrument that is not already in the LUSID dialect should be given as an ExoticInstrument. |  |
|**dialect** | **String** | The target dialect that the given instruments should be translated to. |  |



