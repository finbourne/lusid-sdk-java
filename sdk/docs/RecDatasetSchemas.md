# com.finbourne.lusid.model.RecDatasetSchemas

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**RecDatasetSchema**](RecDatasetSchema.md) |  | [optional] [default to RecDatasetSchema]
**right** | [**RecDatasetSchema**](RecDatasetSchema.md) |  | [optional] [default to RecDatasetSchema]

```java
import com.finbourne.lusid.model.RecDatasetSchemas;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecDatasetSchema Left = new RecDatasetSchema();
RecDatasetSchema Right = new RecDatasetSchema();


RecDatasetSchemas recDatasetSchemasInstance = new RecDatasetSchemas()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
