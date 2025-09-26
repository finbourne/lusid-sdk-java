# com.finbourne.lusid.model.CheckDefinitionDatasetSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of dataset schema that the Check Definition applies to | [optional] [default to String]
**entityType** | **String** | The type of entity that the dataset schema applies to, e.g. Instrument, Transaction, etc. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CheckDefinitionDatasetSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String EntityType = "example EntityType";


CheckDefinitionDatasetSchema checkDefinitionDatasetSchemaInstance = new CheckDefinitionDatasetSchema()
    .Type(Type)
    .EntityType(EntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
