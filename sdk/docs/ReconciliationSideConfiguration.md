# com.finbourne.lusid.model.ReconciliationSideConfiguration
Specification for one side of a valuations/positions scheduled reconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**currency** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReconciliationSideConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Currency = "example Currency";


ReconciliationSideConfiguration reconciliationSideConfigurationInstance = new ReconciliationSideConfiguration()
    .RecipeId(RecipeId)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
