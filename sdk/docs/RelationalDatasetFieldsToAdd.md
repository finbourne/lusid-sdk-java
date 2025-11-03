# com.finbourne.lusid.model.RelationalDatasetFieldsToAdd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | [**List&lt;CreateSeriesIdentifierField&gt;**](CreateSeriesIdentifierField.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<CreateSeriesIdentifierField>]
**valueAndMetadataFields** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.lusid.model.RelationalDatasetFieldsToAdd;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<CreateSeriesIdentifierField> SeriesIdentifiers = new List<CreateSeriesIdentifierField>();
@jakarta.annotation.Nullable List<RelationalDatasetFieldDefinition> ValueAndMetadataFields = new List<RelationalDatasetFieldDefinition>();


RelationalDatasetFieldsToAdd relationalDatasetFieldsToAddInstance = new RelationalDatasetFieldsToAdd()
    .SeriesIdentifiers(SeriesIdentifiers)
    .ValueAndMetadataFields(ValueAndMetadataFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
