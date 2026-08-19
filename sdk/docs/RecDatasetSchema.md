# com.finbourne.lusid.model.RecDatasetSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The kind of dataset this side draws on. One of: PortfolioContents, LusidEntity, RelationalData. At most one side may be RelationalData. Available values: PortfolioContents, LusidEntity, RelationalData. | [default to String]
**entityType** | **String** | The entity within the dataset. Required when type is PortfolioContents, in which case it is one of: Holding, Valuation, Transaction, OutputTransaction, SettlementActivity. Must be omitted when type is RelationalData. Available values: Holding, Valuation, Transaction, OutputTransaction, SettlementActivity. | [optional] [default to String]
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.RecDatasetSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String EntityType = "example EntityType";
ResourceId RelationalDatasetDefinitionId = new ResourceId();


RecDatasetSchema recDatasetSchemaInstance = new RecDatasetSchema()
    .Type(Type)
    .EntityType(EntityType)
    .RelationalDatasetDefinitionId(RelationalDatasetDefinitionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
