# com.finbourne.lusid.model.UpsertWithholdingTaxRateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]
**valueFields** | **Map&lt;String, Object&gt;** | The values associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, Object>]
**metaDataFields** | **Map&lt;String, Object&gt;** | The metadata associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.lusid.model.UpsertWithholdingTaxRateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Object> SeriesIdentifiers = new Map<String, Object>();
String EffectiveAt = "example EffectiveAt";
Map<String, Object> ValueFields = new Map<String, Object>();
@jakarta.annotation.Nullable Map<String, Object> MetaDataFields = new Map<String, Object>();


UpsertWithholdingTaxRateRequest upsertWithholdingTaxRateRequestInstance = new UpsertWithholdingTaxRateRequest()
    .SeriesIdentifiers(SeriesIdentifiers)
    .EffectiveAt(EffectiveAt)
    .ValueFields(ValueFields)
    .MetaDataFields(MetaDataFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
