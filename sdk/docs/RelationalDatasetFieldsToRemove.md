# com.finbourne.lusid.model.RelationalDatasetFieldsToRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valueAndMetadataFields** | **List&lt;String&gt;** | An array of FieldName(s) to be removed from the FieldSchema. Only Value or Metadata fields can be removed. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.RelationalDatasetFieldsToRemove;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> ValueAndMetadataFields = new List<String>();


RelationalDatasetFieldsToRemove relationalDatasetFieldsToRemoveInstance = new RelationalDatasetFieldsToRemove()
    .ValueAndMetadataFields(ValueAndMetadataFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
