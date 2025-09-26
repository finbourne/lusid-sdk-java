# com.finbourne.lusid.model.AccessMetadataValue
An access control value. Provider should only be used if you are a service provider licensing data. In that case  the provider value must match your domain.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [default to String]
**provider** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.AccessMetadataValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
@jakarta.annotation.Nullable String Provider = "example Provider";


AccessMetadataValue accessMetadataValueInstance = new AccessMetadataValue()
    .Value(Value)
    .Provider(Provider);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
