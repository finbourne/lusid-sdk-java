# com.finbourne.lusid.model.UpsertRelationalDataPointRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSeries** | [**DataSeries**](DataSeries.md) |  | [default to DataSeries]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]
**valueFields** | **Map&lt;String, Object&gt;** | The values associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, Object>]
**metaDataFields** | **Map&lt;String, Object&gt;** | The metadata associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.lusid.model.UpsertRelationalDataPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataSeries DataSeries = new DataSeries();
String EffectiveAt = "example EffectiveAt";
Map<String, Object> ValueFields = new Map<String, Object>();
@jakarta.annotation.Nullable Map<String, Object> MetaDataFields = new Map<String, Object>();


UpsertRelationalDataPointRequest upsertRelationalDataPointRequestInstance = new UpsertRelationalDataPointRequest()
    .DataSeries(DataSeries)
    .EffectiveAt(EffectiveAt)
    .ValueFields(ValueFields)
    .MetaDataFields(MetaDataFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
