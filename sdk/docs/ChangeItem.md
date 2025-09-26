# com.finbourne.lusid.model.ChangeItem
Information about a change to a field / property.  At least one of 'PreviousValue' or 'NewValue' will be set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the field or property that has been changed. | [default to String]
**previousValue** | **String** | The previous value for this field / property. | [optional] [default to String]
**newValue** | **String** | The new value for this field / property. | [optional] [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The market data time, i.e. the time to run the change from. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The market data time, i.e. the time to run the change until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ChangeItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable String PreviousValue = "example PreviousValue";
@jakarta.annotation.Nullable String NewValue = "example NewValue";
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();


ChangeItem changeItemInstance = new ChangeItem()
    .FieldName(FieldName)
    .PreviousValue(PreviousValue)
    .NewValue(NewValue)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
