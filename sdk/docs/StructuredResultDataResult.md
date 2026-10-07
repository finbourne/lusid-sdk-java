# com.finbourne.lusid.model.StructuredResultDataResult
Represents structured result data document and row details for a data quality check result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity, e.g. \&quot;SrsRow\&quot;. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp the document was read at | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp the document was read at | [optional] [default to OffsetDateTime]
**documentEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the upload the row was read from: the latest upload at or before effectiveAt | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the document | [optional] [default to String]
**code** | **String** | The code of the document | [optional] [default to String]
**source** | **String** | The platform or vendor that provided the document | [optional] [default to String]
**resultType** | **String** | The document&#39;s result type | [optional] [default to String]
**rowIdentifiers** | **Map&lt;String, String&gt;** | The row&#39;s identifier columns, keyed by address key. Populated when entityType is \&quot;SrsRow\&quot;. | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.StructuredResultDataResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EntityType = "example EntityType";
OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime DocumentEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Source = "example Source";
@jakarta.annotation.Nullable String ResultType = "example ResultType";
@jakarta.annotation.Nullable Map<String, String> RowIdentifiers = new Map<String, String>();


StructuredResultDataResult structuredResultDataResultInstance = new StructuredResultDataResult()
    .EntityType(EntityType)
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .DocumentEffectiveAt(DocumentEffectiveAt)
    .Scope(Scope)
    .Code(Code)
    .Source(Source)
    .ResultType(ResultType)
    .RowIdentifiers(RowIdentifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
