# com.finbourne.lusid.model.RelationalDataSeriesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the DataSeries. | [default to String]
**applicableEntity** | [**ApplicableEntity**](ApplicableEntity.md) |  | [default to ApplicableEntity]
**seriesIdentifiers** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The identifiers that uniquely define this DataSeries, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]

```java
import com.finbourne.lusid.model.RelationalDataSeriesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeriesScope = "example SeriesScope";
ApplicableEntity ApplicableEntity = new ApplicableEntity();
Map<String, RelationalDataPointFieldValueResponse> SeriesIdentifiers = new Map<String, RelationalDataPointFieldValueResponse>();


RelationalDataSeriesResponse relationalDataSeriesResponseInstance = new RelationalDataSeriesResponse()
    .SeriesScope(SeriesScope)
    .ApplicableEntity(ApplicableEntity)
    .SeriesIdentifiers(SeriesIdentifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
