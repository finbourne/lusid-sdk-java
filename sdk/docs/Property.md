# com.finbourne.lusid.model.Property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the property is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the property. | [optional] [default to OffsetDateTime]
**referenceData** | [**Map&lt;String, PropertyReferenceDataValue&gt;**](PropertyReferenceDataValue.md) | The ReferenceData linked to the value of the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the property. | [optional] [readonly] [default to Map<String, PropertyReferenceDataValue>]

```java
import com.finbourne.lusid.model.Property;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
PropertyValue Value = new PropertyValue();
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, PropertyReferenceDataValue> ReferenceData = new Map<String, PropertyReferenceDataValue>();


Property propertyInstance = new Property()
    .Key(Key)
    .Value(Value)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil)
    .ReferenceData(ReferenceData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
