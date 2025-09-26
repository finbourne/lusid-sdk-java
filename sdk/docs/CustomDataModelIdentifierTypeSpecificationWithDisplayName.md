# com.finbourne.lusid.model.CustomDataModelIdentifierTypeSpecificationWithDisplayName

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property definition. | [optional] [default to String]
**identifierKey** | **String** | The identifier type that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether identifier type is required or allowed. | [optional] [default to Boolean]
**identifierType** | **String** | The name of the identifier type. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CustomDataModelIdentifierTypeSpecificationWithDisplayName;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
String IdentifierKey = "example IdentifierKey";
Boolean Required = true;
@jakarta.annotation.Nullable String IdentifierType = "example IdentifierType";


CustomDataModelIdentifierTypeSpecificationWithDisplayName customDataModelIdentifierTypeSpecificationWithDisplayNameInstance = new CustomDataModelIdentifierTypeSpecificationWithDisplayName()
    .DisplayName(DisplayName)
    .IdentifierKey(IdentifierKey)
    .Required(Required)
    .IdentifierType(IdentifierType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
