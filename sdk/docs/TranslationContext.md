# com.finbourne.lusid.model.TranslationContext
Options for overriding default scripted translation configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disableScriptedTranslation** | **Boolean** |  | [optional] [default to Boolean]
**scriptMap** | [**ScriptMapReference**](ScriptMapReference.md) |  | [optional] [default to ScriptMapReference]

```java
import com.finbourne.lusid.model.TranslationContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean DisableScriptedTranslation = true;
ScriptMapReference ScriptMap = new ScriptMapReference();


TranslationContext translationContextInstance = new TranslationContext()
    .DisableScriptedTranslation(DisableScriptedTranslation)
    .ScriptMap(ScriptMap);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
