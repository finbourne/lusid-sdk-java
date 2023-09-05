

# TranslateEntitiesRequest

Request to translate financial entities with a specified script stored in LUSID,  specified in the request by its id. The output of the translation is validated against a dialect stored in LUSID,  again specified in the request by its id.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated, indexed by (ephemeral) unique correlation ids. |  |
|**scriptId** | [**TranslationScriptId**](TranslationScriptId.md) |  |  |
|**dialectId** | [**DialectId**](DialectId.md) |  |  [optional] |



