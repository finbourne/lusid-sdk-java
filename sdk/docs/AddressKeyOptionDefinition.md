# com.finbourne.lusid.model.AddressKeyOptionDefinition
The definition of an Address Key Option

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the option | [default to String]
**type** | **String** | The type of the option | [default to String]
**description** | **String** | The description of the option | [default to String]
**optional** | **Boolean** | Is this option required or optional? | [default to Boolean]
**allowedValueSet** | **List&lt;String&gt;** | If the option is a string or enum, the allowed set of values it can take. | [optional] [default to List<String>]
**defaultValue** | **String** | If the option is not required, what is the default value? | [optional] [default to String]

```java
import com.finbourne.lusid.model.AddressKeyOptionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
String Description = "example Description";
Boolean Optional = true;
@jakarta.annotation.Nullable List<String> AllowedValueSet = new List<String>();
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";


AddressKeyOptionDefinition addressKeyOptionDefinitionInstance = new AddressKeyOptionDefinition()
    .Name(Name)
    .Type(Type)
    .Description(Description)
    .Optional(Optional)
    .AllowedValueSet(AllowedValueSet)
    .DefaultValue(DefaultValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
