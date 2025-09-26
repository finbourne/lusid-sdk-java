# com.finbourne.lusid.model.TranslationInput
The input to a translation script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **String** | The serialised entity to be passed to the translation script. This could represent e.g. an instrument in any  dialect. | [default to String]

```java
import com.finbourne.lusid.model.TranslationInput;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Entity = "example Entity";


TranslationInput translationInputInstance = new TranslationInput()
    .Entity(Entity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
