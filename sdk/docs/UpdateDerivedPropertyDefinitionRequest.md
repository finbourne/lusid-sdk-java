# com.finbourne.lusid.model.UpdateDerivedPropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions. For a derived definition this must be set true to enable filtering. | [default to Boolean]
**valueFormat** | **String** | The format in which values for this property definition should be represented. | [optional] [default to String]
**customEntityType** | **String** | The custom entity type that this derived property definition can be applied to. | [optional] [default to String]

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
@jakarta.annotation.Nullable String ValueFormat = "example ValueFormat";
@jakarta.annotation.Nullable String CustomEntityType = "example CustomEntityType";


UpdateDerivedPropertyDefinitionRequest updateDerivedPropertyDefinitionRequestInstance = new UpdateDerivedPropertyDefinitionRequest()
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .PropertyDescription(PropertyDescription)
    .DerivationFormula(DerivationFormula)
    .IsFilterable(IsFilterable)
    .ValueFormat(ValueFormat)
    .CustomEntityType(CustomEntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
