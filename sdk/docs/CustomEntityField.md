# com.finbourne.lusid.model.CustomEntityField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field in the custom entity type definition. | [default to String]
**value** | **Object** | The value for the field. | [optional] [default to Object]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the field&#39;s value is valid. For timeVariant fields, this defaults to the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the field&#39;s value is valid. If not supplied, the value will be valid indefinitely or until the next “effectiveFrom” date of the field. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CustomEntityField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable Object @jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();


CustomEntityField customEntityFieldInstance = new CustomEntityField()
    .Name(Name)
    .Value(Value)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
