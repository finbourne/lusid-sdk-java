# com.finbourne.lusid.model.UpdateRelationalDatasetFieldSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetFieldsToAdd** | [**RelationalDatasetFieldsToAdd**](RelationalDatasetFieldsToAdd.md) |  | [optional] [default to RelationalDatasetFieldsToAdd]
**relationalDatasetFieldsToUpdate** | [**RelationalDatasetFieldsToUpdate**](RelationalDatasetFieldsToUpdate.md) |  | [optional] [default to RelationalDatasetFieldsToUpdate]
**fieldNamesToRemove** | **List&lt;String&gt;** | An array of FieldName(s) to be removed from the FieldSchema. Only Value or Metadata fields can be removed. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.UpdateRelationalDatasetFieldSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

RelationalDatasetFieldsToAdd RelationalDatasetFieldsToAdd = new RelationalDatasetFieldsToAdd();
RelationalDatasetFieldsToUpdate RelationalDatasetFieldsToUpdate = new RelationalDatasetFieldsToUpdate();
@jakarta.annotation.Nullable List<String> FieldNamesToRemove = new List<String>();


UpdateRelationalDatasetFieldSchema updateRelationalDatasetFieldSchemaInstance = new UpdateRelationalDatasetFieldSchema()
    .RelationalDatasetFieldsToAdd(RelationalDatasetFieldsToAdd)
    .RelationalDatasetFieldsToUpdate(RelationalDatasetFieldsToUpdate)
    .FieldNamesToRemove(FieldNamesToRemove);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
