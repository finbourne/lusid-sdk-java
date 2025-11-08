# com.finbourne.lusid.model.UpsertRelationalDataPointDataSeries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the DataSeries. | [default to String]
**applicableEntity** | [**ApplicableEntity**](ApplicableEntity.md) |  | [default to ApplicableEntity]
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.lusid.model.UpsertRelationalDataPointDataSeries;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeriesScope = "example SeriesScope";
ApplicableEntity ApplicableEntity = new ApplicableEntity();
@jakarta.annotation.Nullable Map<String, Object> SeriesIdentifiers = new Map<String, Object>();


UpsertRelationalDataPointDataSeries upsertRelationalDataPointDataSeriesInstance = new UpsertRelationalDataPointDataSeries()
    .SeriesScope(SeriesScope)
    .ApplicableEntity(ApplicableEntity)
    .SeriesIdentifiers(SeriesIdentifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
