# com.finbourne.lusid.model.ScriptMapReference
Provides information about the location of a script map within the configuration store

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the configuration store entry where the translation map is located. | [default to String]
**code** | **String** | The code of the configuration store entry where the translation map is located. | [default to String]
**key** | **String** | The key of the configuration store entry where the translation map is located. | [default to String]

```java
import com.finbourne.lusid.model.ScriptMapReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String Key = "example Key";


ScriptMapReference scriptMapReferenceInstance = new ScriptMapReference()
    .Scope(Scope)
    .Code(Code)
    .Key(Key);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
