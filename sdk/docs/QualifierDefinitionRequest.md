# com.finbourne.lusid.model.QualifierDefinitionRequest
A qualifier to declare against a single-value property definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key by which the qualifier is addressed, for example &#39;direction&#39;. Addressed in filters, sort orders and derivation formulae as Properties[{propertyKey}].Qualifiers[{qualifierKey}]. Validated under the same rules as a property code. | [default to String]
**displayName** | **String** | The display name of the qualifier. | [default to String]
**description** | **String** | Describes the qualifier. Optional; null where not supplied. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**isRequired** | **Boolean** | Whether a value for this qualifier must be supplied when a value of the property is written. Defaults to false, and is returned as a boolean rather than as null. Validated on write only, so setting it true does not retroactively invalidate values stored before the change. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.QualifierDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId DataTypeId = new ResourceId();
@jakarta.annotation.Nullable Boolean IsRequired = true;


QualifierDefinitionRequest qualifierDefinitionRequestInstance = new QualifierDefinitionRequest()
    .Key(Key)
    .DisplayName(DisplayName)
    .Description(Description)
    .DataTypeId(DataTypeId)
    .IsRequired(IsRequired);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
