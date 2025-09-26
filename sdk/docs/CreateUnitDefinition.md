# com.finbourne.lusid.model.CreateUnitDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**details** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.CreateUnitDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
String Description = "example Description";
@jakarta.annotation.Nullable Map<String, String> Details = new Map<String, String>();


CreateUnitDefinition createUnitDefinitionInstance = new CreateUnitDefinition()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
