# com.finbourne.lusid.model.EntityIdentifier
Dto to expose mapped keys to new standardised format

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierScope** | **String** | The scope of the identifier | [optional] [default to String]
**identifierType** | **String** | The type of the identifier | [default to String]
**identifierValue** | **String** | The value of the identifier | [default to String]

```java
import com.finbourne.lusid.model.EntityIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String IdentifierScope = "example IdentifierScope";
String IdentifierType = "example IdentifierType";
String IdentifierValue = "example IdentifierValue";


EntityIdentifier entityIdentifierInstance = new EntityIdentifier()
    .IdentifierScope(IdentifierScope)
    .IdentifierType(IdentifierType)
    .IdentifierValue(IdentifierValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
