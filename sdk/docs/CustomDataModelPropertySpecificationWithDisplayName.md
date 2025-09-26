# com.finbourne.lusid.model.CustomDataModelPropertySpecificationWithDisplayName

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property definition. | [optional] [default to String]
**propertyKey** | **String** | The property key that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether property is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CustomDataModelPropertySpecificationWithDisplayName;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
String PropertyKey = "example PropertyKey";
Boolean Required = true;


CustomDataModelPropertySpecificationWithDisplayName customDataModelPropertySpecificationWithDisplayNameInstance = new CustomDataModelPropertySpecificationWithDisplayName()
    .DisplayName(DisplayName)
    .PropertyKey(PropertyKey)
    .Required(Required);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
