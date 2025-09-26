# com.finbourne.lusid.model.TranslationScript

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**body** | **String** | Body of the translation script, i.e. the actual translation code. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.TranslationScript;
import java.util.*;
import java.lang.System;
import java.net.URI;

TranslationScriptId Id = new TranslationScriptId();
String Body = "example Body";
Version Version = new Version();


TranslationScript translationScriptInstance = new TranslationScript()
    .Id(Id)
    .Body(Body)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
