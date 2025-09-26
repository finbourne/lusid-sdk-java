# com.finbourne.lusid.model.UpdateDerivedPropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions. For a derived definition this must be set true to enable filtering. | [default to Boolean]

```java
import com.finbourne.lusid.model.UpdateDerivedPropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
ResourceId DataTypeId = new ResourceId();
@jakarta.annotation.Nullable String PropertyDescription = "example PropertyDescription";
String DerivationFormula = "example DerivationFormula";
Boolean IsFilterable = true;


UpdateDerivedPropertyDefinitionRequest updateDerivedPropertyDefinitionRequestInstance = new UpdateDerivedPropertyDefinitionRequest()
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .PropertyDescription(PropertyDescription)
    .DerivationFormula(DerivationFormula)
    .IsFilterable(IsFilterable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
