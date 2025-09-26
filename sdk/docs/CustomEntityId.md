# com.finbourne.lusid.model.CustomEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierScope** | **String** | The scope the identifier resides in (the scope of the identifier property definition). | [default to String]
**identifierType** | **String** | What the identifier represents (the code of the identifier property definition). | [default to String]
**identifierValue** | **String** | The value of the identifier for this entity. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the identifier is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the identifier is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the identifier. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CustomEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdentifierScope = "example IdentifierScope";
String IdentifierType = "example IdentifierType";
String IdentifierValue = "example IdentifierValue";
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveUntil = OffsetDateTime.now();


CustomEntityId customEntityIdInstance = new CustomEntityId()
    .IdentifierScope(IdentifierScope)
    .IdentifierType(IdentifierType)
    .IdentifierValue(IdentifierValue)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
