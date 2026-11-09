# com.finbourne.lusid.model.TaxClassificationFieldVersion
One stored value of a classification input or override and the bitemporal window it held for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The name of the classification input or override the version belongs to. | [default to String]
**value** | **String** | The value of the field over the version&#39;s effective and asAt window. | [optional] [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the effective window the value applies from. | [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the effective window the value applies until. | [default to OffsetDateTime]
**asAtFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the value was recorded. | [default to OffsetDateTime]
**asAtUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the value was superseded, if it has been. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TaxClassificationFieldVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Field = "example Field";
@jakarta.annotation.Nullable String Value = "example Value";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime EffectiveUntil = OffsetDateTime.now();
OffsetDateTime AsAtFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtUntil = OffsetDateTime.now();


TaxClassificationFieldVersion taxClassificationFieldVersionInstance = new TaxClassificationFieldVersion()
    .Field(Field)
    .Value(Value)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil)
    .AsAtFrom(AsAtFrom)
    .AsAtUntil(AsAtUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
