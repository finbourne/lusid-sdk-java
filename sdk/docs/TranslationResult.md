# com.finbourne.lusid.model.TranslationResult
The result of invoking a translation script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **String** | The serialised entity the translation script produced. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Any properties the translation script produced. | [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.TranslationResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Entity = "example Entity";
Map<String, Property> Properties = new Map<String, Property>();


TranslationResult translationResultInstance = new TranslationResult()
    .Entity(Entity)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
