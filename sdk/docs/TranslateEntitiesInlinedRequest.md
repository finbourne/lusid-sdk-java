

# TranslateEntitiesInlinedRequest

Request to translate financial entities with a given script body. The output of the translation is validated against a schema specified in the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated indexed by (ephemeral) unique correlation ids. |  |
|**scriptBody** | **String** | The body of the translation script to use for translating the entities. |  |
|**schema** | [**DialectSchema**](DialectSchema.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


