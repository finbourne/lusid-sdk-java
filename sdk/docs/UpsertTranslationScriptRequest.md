# com.finbourne.lusid.model.UpsertTranslationScriptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**body** | **String** | Body of the translation script, i.e. the actual translation code. | [default to String]

```java
import com.finbourne.lusid.model.UpsertTranslationScriptRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

TranslationScriptId Id = new TranslationScriptId();
String Body = "example Body";


UpsertTranslationScriptRequest upsertTranslationScriptRequestInstance = new UpsertTranslationScriptRequest()
    .Id(Id)
    .Body(Body);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
