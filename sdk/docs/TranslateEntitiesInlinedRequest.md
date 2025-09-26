# com.finbourne.lusid.model.TranslateEntitiesInlinedRequest
Request to translate financial entities with a given script body.  The output of the translation is validated against a schema specified in the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated indexed by (ephemeral) unique correlation ids. | [default to Map<String, TranslationInput>]
**scriptBody** | **String** | The body of the translation script to use for translating the entities. | [default to String]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [optional] [default to DialectSchema]

```java
import com.finbourne.lusid.model.TranslateEntitiesInlinedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TranslationInput> EntityPayloads = new Map<String, TranslationInput>();
String ScriptBody = "example ScriptBody";
DialectSchema Schema = new DialectSchema();


TranslateEntitiesInlinedRequest translateEntitiesInlinedRequestInstance = new TranslateEntitiesInlinedRequest()
    .EntityPayloads(EntityPayloads)
    .ScriptBody(ScriptBody)
    .Schema(Schema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
