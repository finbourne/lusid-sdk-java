# com.finbourne.lusid.model.UpsertDialectRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DialectId**](DialectId.md) |  | [default to DialectId]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [default to DialectSchema]

```java
import com.finbourne.lusid.model.UpsertDialectRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DialectId Id = new DialectId();
DialectSchema Schema = new DialectSchema();


UpsertDialectRequest upsertDialectRequestInstance = new UpsertDialectRequest()
    .Id(Id)
    .Schema(Schema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
