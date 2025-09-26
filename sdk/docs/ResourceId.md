# com.finbourne.lusid.model.ResourceId
Identifiers of an entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used to identify an entity | [default to String]
**code** | **String** | The code used to identify an entity | [default to String]

```java
import com.finbourne.lusid.model.ResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";


ResourceId resourceIdInstance = new ResourceId()
    .Scope(Scope)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
