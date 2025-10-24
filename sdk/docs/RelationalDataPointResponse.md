# com.finbourne.lusid.model.RelationalDataPointResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**dataSeries** | [**RelationalDataSeriesResponse**](RelationalDataSeriesResponse.md) |  | [default to RelationalDataSeriesResponse]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt or cut-label datetime of the DataPoint. | [default to OffsetDateTime]
**valueFields** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The values associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]
**metaDataFields** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The metadata associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]
**effectiveAtEntered** | **String** | The effectiveAt datetime as entered when the DataPoint was created. | [default to String]

```java
import com.finbourne.lusid.model.RelationalDataPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RelationalDatasetDefinitionId = new ResourceId();
RelationalDataSeriesResponse DataSeries = new RelationalDataSeriesResponse();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
Map<String, RelationalDataPointFieldValueResponse> ValueFields = new Map<String, RelationalDataPointFieldValueResponse>();
Map<String, RelationalDataPointFieldValueResponse> MetaDataFields = new Map<String, RelationalDataPointFieldValueResponse>();
String EffectiveAtEntered = "example EffectiveAtEntered";


RelationalDataPointResponse relationalDataPointResponseInstance = new RelationalDataPointResponse()
    .RelationalDatasetDefinitionId(RelationalDatasetDefinitionId)
    .DataSeries(DataSeries)
    .EffectiveAt(EffectiveAt)
    .ValueFields(ValueFields)
    .MetaDataFields(MetaDataFields)
    .EffectiveAtEntered(EffectiveAtEntered);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
