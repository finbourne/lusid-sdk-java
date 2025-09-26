# com.finbourne.lusid.model.TranslateEntitiesRequest
Request to translate financial entities with a specified script stored in LUSID,  specified in the request by its id. The output of the translation is validated against a dialect stored in LUSID,  again specified in the request by its id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated, indexed by (ephemeral) unique correlation ids. | [default to Map<String, TranslationInput>]
**scriptId** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**dialectId** | [**DialectId**](DialectId.md) |  | [optional] [default to DialectId]

```java
import com.finbourne.lusid.model.TranslateEntitiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TranslationInput> EntityPayloads = new Map<String, TranslationInput>();
TranslationScriptId ScriptId = new TranslationScriptId();
DialectId DialectId = new DialectId();


TranslateEntitiesRequest translateEntitiesRequestInstance = new TranslateEntitiesRequest()
    .EntityPayloads(EntityPayloads)
    .ScriptId(ScriptId)
    .DialectId(DialectId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
