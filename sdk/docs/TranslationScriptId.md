# com.finbourne.lusid.model.TranslationScriptId
Id of the Translation Script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope of the translation script. | [default to String]
**code** | **String** | Code of the translation script. | [default to String]
**version** | **String** | Semantic Version of the translation script of the form MAJOR.MINOR.PATCH. | [default to String]

```java
import com.finbourne.lusid.model.TranslationScriptId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String Version = "example Version";


TranslationScriptId translationScriptIdInstance = new TranslationScriptId()
    .Scope(Scope)
    .Code(Code)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
