# com.finbourne.lusid.model.InstrumentIdTypeDescriptor
The description of an allowable instrument identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierType** | **String** | The name of the identifier type. | [default to String]
**propertyKey** | **String** | The property key that corresponds to the identifier type. | [default to String]
**isUniqueIdentifierType** | **Boolean** | Whether or not the identifier type is enforced to be unique. | [default to Boolean]

```java
import com.finbourne.lusid.model.InstrumentIdTypeDescriptor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdentifierType = "example IdentifierType";
String PropertyKey = "example PropertyKey";
Boolean IsUniqueIdentifierType = true;


InstrumentIdTypeDescriptor instrumentIdTypeDescriptorInstance = new InstrumentIdTypeDescriptor()
    .IdentifierType(IdentifierType)
    .PropertyKey(PropertyKey)
    .IsUniqueIdentifierType(IsUniqueIdentifierType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
