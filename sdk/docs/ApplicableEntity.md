# com.finbourne.lusid.model.ApplicableEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of entity (e.g., Instrument, Portfolio) that this DataSeries applies to. | [default to String]
**entityScope** | **String** | The scope of the entity. | [optional] [default to String]
**identifierScope** | **String** | The scope of the identifier used to uniquely identify the entity. | [optional] [default to String]
**identifierType** | **String** | The type of identifier (e.g., Figi, Isin) used to uniquely identify the entity. | [optional] [default to String]
**identifierValue** | **String** | The value of the identifier used to uniquely identify the entity. | [optional] [default to String]
**subEntityId** | **String** | An optional sub-entity identifier, if applicable. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ApplicableEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntityScope = "example EntityScope";
@jakarta.annotation.Nullable String IdentifierScope = "example IdentifierScope";
@jakarta.annotation.Nullable String IdentifierType = "example IdentifierType";
@jakarta.annotation.Nullable String IdentifierValue = "example IdentifierValue";
@jakarta.annotation.Nullable String SubEntityId = "example SubEntityId";


ApplicableEntity applicableEntityInstance = new ApplicableEntity()
    .EntityType(EntityType)
    .EntityScope(EntityScope)
    .IdentifierScope(IdentifierScope)
    .IdentifierType(IdentifierType)
    .IdentifierValue(IdentifierValue)
    .SubEntityId(SubEntityId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
