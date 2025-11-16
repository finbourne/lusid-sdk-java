# com.finbourne.lusid.model.UpdatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | [default to String]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**customEntityTypes** | **List&lt;String&gt;** | The custom entity types that properties relating to this property definition can be applied to. | [optional] [default to List<String>]
**valueFormat** | **String** | The format in which values for this property definition should be represented. | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpdatePropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String PropertyDescription = "example PropertyDescription";
@jakarta.annotation.Nullable List<String> CustomEntityTypes = new List<String>();
@jakarta.annotation.Nullable String ValueFormat = "example ValueFormat";


UpdatePropertyDefinitionRequest updatePropertyDefinitionRequestInstance = new UpdatePropertyDefinitionRequest()
    .DisplayName(DisplayName)
    .PropertyDescription(PropertyDescription)
    .CustomEntityTypes(CustomEntityTypes)
    .ValueFormat(ValueFormat);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
