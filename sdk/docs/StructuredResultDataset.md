# com.finbourne.lusid.model.StructuredResultDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"StructuredResultData\". Names one structured result data document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date of the document&#39;s rows to check. Required. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the document. Required. | [optional] [default to String]
**code** | **String** | The code of the document. Required. | [optional] [default to String]
**source** | **String** | The platform or vendor that provided the document, e.g. \&quot;Client\&quot;. Required. | [optional] [default to String]
**resultType** | **String** | The document&#39;s result type, e.g. \&quot;UnitResult/Custom\&quot;. Required. | [optional] [default to String]
**rowSelectorAttribute** | **String** | A row field to narrow down the rows checked, e.g. rowId[&#39;Instrument/default/LusidInstrumentId&#39;] or  rowData[&#39;Valuation/PV&#39;].Units. Cannot be provided without rowSelectorValue, and vice versa. | [optional] [default to String]
**rowSelectorValue** | **String** | The value of the above row field used to narrow down the rows. Cannot be provided without  rowSelectorAttribute, and vice versa. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StructuredResultDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Source = "example Source";
@jakarta.annotation.Nullable String ResultType = "example ResultType";
@jakarta.annotation.Nullable String RowSelectorAttribute = "example RowSelectorAttribute";
@jakarta.annotation.Nullable String RowSelectorValue = "example RowSelectorValue";


StructuredResultDataset structuredResultDatasetInstance = new StructuredResultDataset()
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Scope(Scope)
    .Code(Code)
    .Source(Source)
    .ResultType(ResultType)
    .RowSelectorAttribute(RowSelectorAttribute)
    .RowSelectorValue(RowSelectorValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
