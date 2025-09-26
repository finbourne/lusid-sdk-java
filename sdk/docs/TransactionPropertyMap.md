# com.finbourne.lusid.model.TransactionPropertyMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code}. | [optional] [default to String]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionPropertyMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String Value = "example Value";


TransactionPropertyMap transactionPropertyMapInstance = new TransactionPropertyMap()
    .PropertyKey(PropertyKey)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
