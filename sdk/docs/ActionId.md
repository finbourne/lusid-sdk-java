# com.finbourne.lusid.model.ActionId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**activity** | **String** |  | [default to String]
**entity** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.ActionId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Activity = "example Activity";
String Entity = "example Entity";


ActionId actionIdInstance = new ActionId()
    .Scope(Scope)
    .Activity(Activity)
    .Entity(Entity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
