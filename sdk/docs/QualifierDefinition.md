# com.finbourne.lusid.model.QualifierDefinition
A qualifier as returned on read: the request shape plus the value type resolved from its data type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key by which the qualifier is addressed, for example &#39;direction&#39;. Addressed in filters, sort orders and derivation formulae as Properties[{propertyKey}].Qualifiers[{qualifierKey}]. Validated under the same rules as a property code. | [optional] [default to String]
**displayName** | **String** | The display name of the qualifier. | [optional] [default to String]
**description** | **String** | Describes the qualifier. Optional; null where not supplied. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**valueType** | **String** | The type of value this qualifier carries, resolved from its data type. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [optional] [default to String]
**isRequired** | **Boolean** | Whether a value for this qualifier must be supplied when a value of the property is written. Defaults to false, and is returned as a boolean rather than as null. Validated on write only, so setting it true does not retroactively invalidate values stored before the change. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.QualifierDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Key = "example Key";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId DataTypeId = new ResourceId();
@jakarta.annotation.Nullable String ValueType = "example ValueType";
Boolean IsRequired = true;


QualifierDefinition qualifierDefinitionInstance = new QualifierDefinition()
    .Key(Key)
    .DisplayName(DisplayName)
    .Description(Description)
    .DataTypeId(DataTypeId)
    .ValueType(ValueType)
    .IsRequired(IsRequired);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
