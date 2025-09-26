# com.finbourne.lusid.model.TransactionPropertyMappingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | Uniquely identifies the property definition and consists of a Domain, Scope and Code. | [default to String]
**mapFrom** | **String** | The Property Key of the Property to map from. | [optional] [default to String]
**setTo** | **Object** | A pointer to the Property being mapped from. | [optional] [default to Object]

```java
import com.finbourne.lusid.model.TransactionPropertyMappingRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String MapFrom = "example MapFrom";
@jakarta.annotation.Nullable Object 

TransactionPropertyMappingRequest transactionPropertyMappingRequestInstance = new TransactionPropertyMappingRequest()
    .PropertyKey(PropertyKey)
    .MapFrom(MapFrom)
    .SetTo(SetTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
