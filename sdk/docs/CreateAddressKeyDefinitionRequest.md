# com.finbourne.lusid.model.CreateAddressKeyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | The address key of the address key definition. | [default to String]
**type** | **String** | The type of the address key definition | [default to String]

```java
import com.finbourne.lusid.model.CreateAddressKeyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AddressKey = "example AddressKey";
String Type = "example Type";


CreateAddressKeyDefinitionRequest createAddressKeyDefinitionRequestInstance = new CreateAddressKeyDefinitionRequest()
    .AddressKey(AddressKey)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
