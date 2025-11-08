# com.finbourne.lusid.model.UpdateRelationalDatasetFieldSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add** | [**RelationalDatasetFieldsToAdd**](RelationalDatasetFieldsToAdd.md) |  | [optional] [default to RelationalDatasetFieldsToAdd]
**update** | [**RelationalDatasetFieldsToUpdate**](RelationalDatasetFieldsToUpdate.md) |  | [optional] [default to RelationalDatasetFieldsToUpdate]
**remove** | [**RelationalDatasetFieldsToRemove**](RelationalDatasetFieldsToRemove.md) |  | [optional] [default to RelationalDatasetFieldsToRemove]

```java
import com.finbourne.lusid.model.UpdateRelationalDatasetFieldSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

RelationalDatasetFieldsToAdd Add = new RelationalDatasetFieldsToAdd();
RelationalDatasetFieldsToUpdate Update = new RelationalDatasetFieldsToUpdate();
RelationalDatasetFieldsToRemove Remove = new RelationalDatasetFieldsToRemove();


UpdateRelationalDatasetFieldSchema updateRelationalDatasetFieldSchemaInstance = new UpdateRelationalDatasetFieldSchema()
    .Add(Add)
    .Update(Update)
    .Remove(Remove);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
