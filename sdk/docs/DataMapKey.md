# com.finbourne.lusid.model.DataMapKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | The version of the mappings. It is possible that a client will wish to update mappings over time. The version identifies the MAJOR.MINOR.PATCH version  of the mappings that the client assigns it. | [optional] [default to String]
**code** | **String** | A unique name to semantically identify the mapping set. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DataMapKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Version = "example Version";
@jakarta.annotation.Nullable String Code = "example Code";


DataMapKey dataMapKeyInstance = new DataMapKey()
    .Version(Version)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
