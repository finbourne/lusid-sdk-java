# com.finbourne.lusid.model.CustomDataModelPropertySpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property key that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether property is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CustomDataModelPropertySpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
Boolean Required = true;


CustomDataModelPropertySpecification customDataModelPropertySpecificationInstance = new CustomDataModelPropertySpecification()
    .PropertyKey(PropertyKey)
    .Required(Required);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
