# com.finbourne.lusid.model.PerpetualProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**referenceData** | [**Map&lt;String, PropertyReferenceDataValue&gt;**](PropertyReferenceDataValue.md) | The ReferenceData linked to the value of the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the property. | [optional] [readonly] [default to Map<String, PropertyReferenceDataValue>]

```java
import com.finbourne.lusid.model.PerpetualProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
PropertyValue Value = new PropertyValue();
@jakarta.annotation.Nullable Map<String, PropertyReferenceDataValue> ReferenceData = new Map<String, PropertyReferenceDataValue>();


PerpetualProperty perpetualPropertyInstance = new PerpetualProperty()
    .Key(Key)
    .Value(Value)
    .ReferenceData(ReferenceData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
