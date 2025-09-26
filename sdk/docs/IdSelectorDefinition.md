# com.finbourne.lusid.model.IdSelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.IdSelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Identifier = new Map<String, String>();
List<ActionId> Actions = new List<ActionId>();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";


IdSelectorDefinition idSelectorDefinitionInstance = new IdSelectorDefinition()
    .Identifier(Identifier)
    .Actions(Actions)
    .Name(Name)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
