# com.finbourne.lusid.model.RelationalDatasetFieldsToUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | [**List&lt;UpdateSeriesIdentifierField&gt;**](UpdateSeriesIdentifierField.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<UpdateSeriesIdentifierField>]
**valueAndMetadataFields** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.lusid.model.RelationalDatasetFieldsToUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<UpdateSeriesIdentifierField> SeriesIdentifiers = new List<UpdateSeriesIdentifierField>();
@jakarta.annotation.Nullable List<RelationalDatasetFieldDefinition> ValueAndMetadataFields = new List<RelationalDatasetFieldDefinition>();


RelationalDatasetFieldsToUpdate relationalDatasetFieldsToUpdateInstance = new RelationalDatasetFieldsToUpdate()
    .SeriesIdentifiers(SeriesIdentifiers)
    .ValueAndMetadataFields(ValueAndMetadataFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
