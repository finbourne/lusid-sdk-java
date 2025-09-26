# com.finbourne.lusid.model.CustomDataModelIdentifierTypeSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierKey** | **String** | The identifier type that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether identifier type is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CustomDataModelIdentifierTypeSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdentifierKey = "example IdentifierKey";
Boolean Required = true;


CustomDataModelIdentifierTypeSpecification customDataModelIdentifierTypeSpecificationInstance = new CustomDataModelIdentifierTypeSpecification()
    .IdentifierKey(IdentifierKey)
    .Required(Required);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
