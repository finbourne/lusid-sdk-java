# com.finbourne.lusid.model.AddressKeyDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | The address key of the address key definition. | [default to String]
**type** | **String** | The type of the address key definition | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AddressKeyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AddressKey = "example AddressKey";
String Type = "example Type";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AddressKeyDefinition addressKeyDefinitionInstance = new AddressKeyDefinition()
    .AddressKey(AddressKey)
    .Type(Type)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
