# com.finbourne.lusid.model.LusidEntityDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"LusidEntity\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the entities to check. Required. | [optional] [default to String]
**asAtModifiedSince** | [**OffsetDateTime**](OffsetDateTime.md) | Nullable. Filters the dataset for version.asAtModified greater than or equal to this value. | [optional] [default to OffsetDateTime]
**selectorAttribute** | **String** | An attribute (field name, propertyKey or identifierKey) to use to sub-divide the dataset. | [optional] [default to String]
**selectorValue** | **String** | The value of the above attribute used to sub-divide the dataset. | [optional] [default to String]
**returnIdentifierKey** | **String** | The preferred identifier to return for entities with multiple external identifiers. | [optional] [default to String]

```java
import com.finbourne.lusid.model.LusidEntityDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable OffsetDateTime AsAtModifiedSince = OffsetDateTime.now();
@jakarta.annotation.Nullable String SelectorAttribute = "example SelectorAttribute";
@jakarta.annotation.Nullable String SelectorValue = "example SelectorValue";
@jakarta.annotation.Nullable String ReturnIdentifierKey = "example ReturnIdentifierKey";


LusidEntityDataset lusidEntityDatasetInstance = new LusidEntityDataset()
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .Scope(Scope)
    .AsAtModifiedSince(AsAtModifiedSince)
    .SelectorAttribute(SelectorAttribute)
    .SelectorValue(SelectorValue)
    .ReturnIdentifierKey(ReturnIdentifierKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
